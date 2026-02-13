package com.tib.api.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.xerces.parsers.DOMParser;
import java.util.Base64;
import com.tib.api.enums.HttpMethod;
import com.tib.api.model.*;
import com.tib.api.model.request.IBaseCryptedServiceArgs;
import com.tib.api.model.response.APIResponse;
import com.tib.api.model.response.GenericResponse;
import com.tib.api.model.response.KeyExchangeResponse;
import com.tib.api.model.response.SymmetricKeyResponse;
import com.tib.api.util.AESUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.interfaces.RSAKey;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;


public class APIClient extends AbstractAPIClient {

    private static final String PUBLIC_KEY_REQUEST_URL = "/GetPublicKey";
    private static final String KEY_EXCHANGE_URL = "/ExecuteKeyExchange";

    private ObjectMapper objectMapper;

    private String baseUrl;

    public APIClient(ObjectMapper objectMapper, String baseURL) {
        this.objectMapper = objectMapper;
        this.baseUrl = baseURL;
    }

    @Override
    protected APIResponse performCall(String url, IBaseCryptedServiceArgs args,
            SymmetricKeyResponse symmetricKeyResponse)
            throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException,
            IllegalBlockSizeException, IOException, InvalidAlgorithmParameterException {
        String plainText = objectMapper.writeValueAsString(args);
        IvParameterSpec ivParameterSpec = AESUtil.generateIv();
        Key key = new SecretKeySpec(symmetricKeyResponse.getSymmetricKey(), 0,
                symmetricKeyResponse.getSymmetricKey().length, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key, ivParameterSpec);
        // Base64 encoding with error handling
        String encryptedPayload;
        try {
            encryptedPayload = Base64.getEncoder().encodeToString(cipher.doFinal(plainText.getBytes("UTF-8")));
        } catch (IllegalArgumentException e) {
            throw new IOException("Failed to encode encrypted data: " + e.getMessage(), e);
        }
        String base64IV = Base64.getEncoder().encodeToString(ivParameterSpec.getIV());
        Data data = new Data(symmetricKeyResponse.getCallNode(), symmetricKeyResponse.getKeyToken(), base64IV,
                encryptedPayload);
        String responseString = makeHttpCall(baseUrl + "/" + url, HttpMethod.POST, data.toString(), 200);
        GenericResponse genericResponse = objectMapper.readValue(responseString, GenericResponse.class);
        IvParameterSpec ivFromServer = new IvParameterSpec(genericResponse.getIv());
        cipher.init(Cipher.DECRYPT_MODE, key, ivFromServer);
        byte[] decodedArr;
        try {
            decodedArr = Base64.getDecoder().decode(genericResponse.getCryptedBase64Data());
        } catch (IllegalArgumentException e) {
            throw new IOException("Failed to decode server response - invalid Base64: " + e.getMessage(), e);
        }
        byte[] decryptedArr = cipher.doFinal(decodedArr);
        String decryptedText = new String(decryptedArr);
        return objectMapper.readValue(decryptedText, APIResponse.class);

    }

    @Override
    protected SymmetricKeyResponse generateAndExchangeKeys(TibPublicKeyModel tibPublicKeyModel)
            throws NoSuchAlgorithmException, InvalidKeySpecException, IOException,
            SAXException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, InvalidKeyException {
        byte[] clientSymmetricKey = generateClientSymmetricKey();
        KeyPair clientKeyPair = generateClientKeyPair(1024);

        PublicKey publicKey = clientKeyPair.getPublic();

        PrivateKey privateKey = clientKeyPair.getPrivate();
        String publicKeyXml = getPublicKeyAsXml(publicKey);
        byte[] publicKeyBytes = publicKeyXml.getBytes("UTF-8");

        byte[] combinedKey = ByteBuffer.allocate(clientSymmetricKey.length + publicKeyBytes.length)
                .put(clientSymmetricKey)
                .put(publicKeyBytes)
                .array();

        PublicKey pubKeyFromServer = extractPublicKeyFromXMLRSA(tibPublicKeyModel.getPublicKeyXmlString());
        byte[] encryptedKey = encryptCombinedKey(combinedKey, pubKeyFromServer);
        // Base64 encoding with error handling
        String encodedEncryptedKey;
        try {
            encodedEncryptedKey = Base64.getEncoder().encodeToString(encryptedKey);
        } catch (IllegalArgumentException e) {
            throw new IOException("Failed to encode encrypted key: " + e.getMessage(), e);
        }
        KeyExchangeResponse keyExchangeResponse = performKeyExchange(tibPublicKeyModel, encodedEncryptedKey);
        Cipher cipherMock = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipherMock.init(Cipher.DECRYPT_MODE, privateKey);

        // cipherMock.update(Base64.getDecoder().decode(keyExchangeResponse.getSymetricHostHalfKey()));
        // Base64 decoding with error handling
        byte[] symmetricHostHalfKeyBytes;
        try {
            symmetricHostHalfKeyBytes = Base64.getDecoder().decode(keyExchangeResponse.getSymetricHostHalfKey());
        } catch (IllegalArgumentException e) {
            throw new IOException("Invalid Base64 in symmetric host half key: " + e.getMessage(), e);
        }

        byte[] decryptedSymmetricHostHalfKey = cipherMock.doFinal(symmetricHostHalfKeyBytes);

        byte[] combinedSymmetricKey = ByteBuffer
                .allocate(clientSymmetricKey.length + decryptedSymmetricHostHalfKey.length)
                .put(clientSymmetricKey)
                .put(decryptedSymmetricHostHalfKey)
                .array();
        return new SymmetricKeyResponse(combinedSymmetricKey, keyExchangeResponse.getFullSymetricKeyToken(),
                tibPublicKeyModel.getNodeAnswered());

    }

    private KeyPair generateClientKeyPair(int size) throws NoSuchAlgorithmException {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(size);
        return keyGen.genKeyPair();
    }

    private KeyExchangeResponse performKeyExchange(TibPublicKeyModel tibPublicKeyModel, String encodedEncryptedKey)
            throws IOException {
        com.tib.api.model.Key key = new com.tib.api.model.Key(tibPublicKeyModel.getNodeAnswered(),
                tibPublicKeyModel.getKeyToken(), encodedEncryptedKey);
        KeyExchange keyExchange = new KeyExchange(key);
        String response = makeHttpCall(baseUrl + KEY_EXCHANGE_URL, HttpMethod.POST, keyExchange.toString(), 200);
        KeyExchangeResponse keyExchangeResponse = null;
        keyExchangeResponse = objectMapper.readValue(response, KeyExchangeResponse.class);
        return keyExchangeResponse;
    }

    protected TibPublicKeyModel requestPublicKey() throws IOException {
        String response = makeHttpCall(baseUrl + PUBLIC_KEY_REQUEST_URL, HttpMethod.POST, "", 200);
        TibPublicKeyModel tibPublicKeyModel = null;
        tibPublicKeyModel = objectMapper.readValue(response, TibPublicKeyModel.class);
        return tibPublicKeyModel;
    }

    public String makeHttpCall(String httpURL, HttpMethod httpMethod, String input, int httpStatus) throws IOException {
        String responseString = "";

        URL url = new URL(httpURL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod(httpMethod.toString());
        conn.setRequestProperty("Content-Type", "application/json");

        OutputStream os = conn.getOutputStream();
        os.write(input.getBytes());
        os.flush();

        if (conn.getResponseCode() != httpStatus) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(
                (conn.getInputStream())));

        String output;
        while ((output = br.readLine()) != null) {
            responseString = responseString + output;
        }
        conn.disconnect();
        return responseString;
    }

    private byte[] generateClientSymmetricKey() {
        byte[] key = new byte[16];
        new SecureRandom().nextBytes(key);
        return key;
    }

    private byte[] encryptCombinedKey(byte[] combinedKey, Key key) throws InvalidKeyException, NoSuchPaddingException,
            NoSuchAlgorithmException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key);

        // Check data size against RSA key size
        int keySize = ((RSAKey) key).getModulus().bitLength();
        int maxSizeBytes = keySize / 8 - 11; // PKCS1 padding uses 11 bytes

        if (combinedKey.length > maxSizeBytes) {
            throw new IllegalBlockSizeException("Data too large for RSA " + ((RSAKey) key).getModulus().bitLength()
                    + " encryption with current key. " +
                    "Maximum size: " + maxSizeBytes + " bytes, actual size: " + combinedKey.length + " bytes");
        }

        // Do encryption in one step (no separate update/doFinal)
        return cipher.doFinal(combinedKey);
    }

    private PublicKey extractPublicKeyFromXMLRSA(String xmlRSA) throws InvalidKeySpecException,
            NoSuchAlgorithmException, IOException, SAXException {
        DOMParser parser = new DOMParser();
        parser.parse(new InputSource(new java.io.StringReader(xmlRSA)));
        Document doc = parser.getDocument();

        Node modulusElem = doc.getDocumentElement().getElementsByTagName("Modulus").item(0);
        Node exponentElem = doc.getDocumentElement().getElementsByTagName("Exponent").item(0);

        // Base64 decoding with error handling
        byte[] expBytes;
        byte[] modBytes;
        try {
            expBytes = Base64.getDecoder().decode(exponentElem.getTextContent().trim());
            modBytes = Base64.getDecoder().decode(modulusElem.getTextContent().trim());
        } catch (IllegalArgumentException e) {
            throw new IOException("Invalid Base64 in public key XML: " + e.getMessage(), e);
        }
        BigInteger modules = new BigInteger(1, modBytes);
        BigInteger exponent = new BigInteger(1, expBytes);

        KeyFactory factory = KeyFactory.getInstance("RSA");
        RSAPublicKeySpec pubSpec = new RSAPublicKeySpec(modules, exponent);
        return factory.generatePublic(pubSpec);
    }

    public String getPublicKeyAsXml(PublicKey publicKey) throws NoSuchAlgorithmException, InvalidKeySpecException {
        KeyFactory kf = KeyFactory.getInstance("RSA");
        RSAPublicKeySpec ksPublic = kf.getKeySpec(publicKey, RSAPublicKeySpec.class);
        BigInteger modulus = ksPublic.getModulus();
        BigInteger exponent = ksPublic.getPublicExponent();
        byte[] modulusBytes = modulus.toByteArray();
        if (modulusBytes[0] == 0) {
            byte[] tmp = new byte[modulusBytes.length - 1];
            System.arraycopy(modulusBytes, 1, tmp, 0, tmp.length);
            modulusBytes = tmp;
        }

        byte[] exponentBytes = exponent.toByteArray();
        if (exponentBytes[0] == 0) {
            byte[] tmp = new byte[exponentBytes.length - 1];
            System.arraycopy(exponentBytes, 1, tmp, 0, tmp.length);
            exponentBytes = tmp;
        }

        StringBuilder publicKeyAsXML = new StringBuilder();
        publicKeyAsXML.append("<RSAKeyValue>")
                .append("<Modulus>" + Base64.getEncoder().encodeToString(modulusBytes) + "</Modulus>")
                .append("<Exponent>" + Base64.getEncoder().encodeToString(exponentBytes) + "</Exponent>")
                .append("</RSAKeyValue>");

        return publicKeyAsXML.toString();
    }

    public static boolean isPrintableAscii(byte value) {
        return (value > 32) && (value < 127);
    }
}
