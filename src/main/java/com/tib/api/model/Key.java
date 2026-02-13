package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Key {

    private String callNode;

    private String keyToken;

    private String asymetricClientPublicKeyAndClientSymetricXmlBase64;

    public Key(String callNode, String keyToken, String asymetricClientPublicKeyAndClientSymetricXmlBase64) {
        this.callNode = callNode;
        this.keyToken = keyToken;
        this.asymetricClientPublicKeyAndClientSymetricXmlBase64 = asymetricClientPublicKeyAndClientSymetricXmlBase64;
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

    public String getAsymetricClientPublicKeyAndClientSymetricXmlBase64() {
        return asymetricClientPublicKeyAndClientSymetricXmlBase64;
    }

    @JsonProperty("AsymetricClientPublicKeyAndClientSymetricXmlBase64")
    public void setAsymetricClientPublicKeyAndClientSymetricXmlBase64(
            String asymetricClientPublicKeyAndClientSymetricXmlBase64) {
        this.asymetricClientPublicKeyAndClientSymetricXmlBase64 = asymetricClientPublicKeyAndClientSymetricXmlBase64;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Key key = (Key) o;
        return Objects.equals(callNode, key.callNode) &&
                Objects.equals(keyToken, key.keyToken) &&
                Objects.equals(asymetricClientPublicKeyAndClientSymetricXmlBase64,
                        key.asymetricClientPublicKeyAndClientSymetricXmlBase64);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callNode, keyToken, asymetricClientPublicKeyAndClientSymetricXmlBase64);
    }

    @Override
    public String toString() {
        return "{" +
                "\"CallNode\":\"" + callNode + "\"" +
                ",\"KeyToken\":\"" + keyToken + "\"" +
                ", \"AsymetricClientPublicKeyAndClientSymetricXmlBase64\":\""
                + asymetricClientPublicKeyAndClientSymetricXmlBase64 + "\"" +
                "}";
    }
}
