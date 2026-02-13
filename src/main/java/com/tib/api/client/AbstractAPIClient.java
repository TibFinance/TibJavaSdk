package com.tib.api.client;

import com.tib.api.model.response.APIResponse;
import com.tib.api.model.request.IBaseCryptedServiceArgs;
import com.tib.api.model.response.SymmetricKeyResponse;
import com.tib.api.model.TibPublicKeyModel;
import org.xml.sax.SAXException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 * This is the Abstract class for the APIClient.
 *
 * @author TIB Finance
 */
public abstract class AbstractAPIClient {

    /**
     * This is the generic method, which gets the public key from server,
     * generates the client side key and performs the key exchange,
     * and finally makes API call with encrypted data.
     *
     * @param url  the url
     * @param args the args
     * @return the api response
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     * @throws IOException                        the io exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws BadPaddingException                the bad padding exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws InvalidKeySpecException            the invalid key spec exception
     *
     * @throws SAXException                       the sax exception
     */
    public APIResponse call(String url, IBaseCryptedServiceArgs args) throws NoSuchAlgorithmException,
            NoSuchPaddingException, InvalidAlgorithmParameterException, IOException, IllegalBlockSizeException,
            BadPaddingException, InvalidKeyException, InvalidKeySpecException, SAXException {
        TibPublicKeyModel tibPublicKeyModel = requestPublicKey();
        SymmetricKeyResponse symmetricKeyResponse = generateAndExchangeKeys(tibPublicKeyModel);
        return performCall(url, args, symmetricKeyResponse);
    }

    /**
     * Performs the actual API call.
     *
     * @param url                  the url
     * @param args                 the args
     * @param symmetricKeyResponse the symmetric key response
     * @return the api response
     * @throws NoSuchPaddingException             the no such padding exception
     * @throws NoSuchAlgorithmException           the no such algorithm exception
     * @throws InvalidKeyException                the invalid key exception
     * @throws BadPaddingException                the bad padding exception
     * @throws IllegalBlockSizeException          the illegal block size exception
     * @throws IOException                        the io exception
     * @throws InvalidAlgorithmParameterException the invalid algorithm parameter
     *                                            exception
     *
     */
    protected abstract APIResponse performCall(String url, IBaseCryptedServiceArgs args,
            SymmetricKeyResponse symmetricKeyResponse)
            throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException,
            IllegalBlockSizeException, IOException, InvalidAlgorithmParameterException;

    /**
     * Generate and exchange keys symmetric key response.
     *
     * @param tibPublicKeyModel the tib public key model
     * @return the symmetric key response
     * @throws NoSuchAlgorithmException  the no such algorithm exception
     * @throws InvalidKeySpecException   the invalid key spec exception
     * @throws IOException               the io exception
     * @throws SAXException              the sax exception
     * @throws IllegalBlockSizeException the illegal block size exception
     * @throws BadPaddingException       the bad padding exception
     * @throws NoSuchPaddingException    the no such padding exception
     * @throws InvalidKeyException       the invalid key exception
     */
    protected abstract SymmetricKeyResponse generateAndExchangeKeys(TibPublicKeyModel tibPublicKeyModel)
            throws NoSuchAlgorithmException, InvalidKeySpecException, IOException,
            SAXException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, InvalidKeyException;

    /**
     * Requests public key from server.
     *
     * @return the tib public key model
     * @throws IOException the io exception
     */
    protected abstract TibPublicKeyModel requestPublicKey() throws IOException;

}
