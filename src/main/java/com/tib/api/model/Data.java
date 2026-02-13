package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Data {

    private String callNode;

    private String keyToken;

    private String base64IV;

    private String base64CryptedData;

    public Data(String callNode, String keyToken, String base64IV, String base64CryptedData) {
        this.callNode = callNode;
        this.keyToken = keyToken;
        this.base64IV = base64IV;
        this.base64CryptedData = base64CryptedData;
    }

    public String getCallNode() {
        return callNode;
    }

    @JsonProperty("CallNode")
    public void setCallNode(String callNode) {
        this.callNode = callNode;
    }

    public String getKeyToken() {
        return keyToken;
    }

    @JsonProperty("KeyToken")
    public void setKeyToken(String keyToken) {
        this.keyToken = keyToken;
    }

    public String getBase64IV() {
        return base64IV;
    }

    @JsonProperty("Base64IV")
    public void setBase64IV(String base64IV) {
        this.base64IV = base64IV;
    }

    public String getBase64CryptedData() {
        return base64CryptedData;
    }

    @JsonProperty("Base64CryptedData")
    public void setBase64CryptedData(String base64CryptedData) {
        this.base64CryptedData = base64CryptedData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(callNode, data.callNode) &&
                Objects.equals(keyToken, data.keyToken) &&
                Objects.equals(base64IV, data.base64IV) &&
                Objects.equals(base64CryptedData, data.base64CryptedData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callNode, keyToken, base64IV, base64CryptedData);
    }

    @Override
    public String toString() {
        return "{\"data\":{" +
                "\"CallNode\":\"" + callNode + "\"" +
                ",\"KeyToken\":\"" + keyToken + "\"" +
                ",\"Base64IV\":\"" + base64IV + "\"" +
                ",\"Base64CryptedData\":\"" + base64CryptedData + "\"" +
                "}}";
    }
}
