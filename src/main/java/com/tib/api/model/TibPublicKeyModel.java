package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class TibPublicKeyModel {

    private String keyToken;

    private String publicKeyXmlString;

    private String nodeAnswered;

    private String publicPEMKey;

    public String getKeyToken() {
        return keyToken;
    }

    @JsonProperty("KeyToken")
    public void setKeyToken(String keyToken) {
        this.keyToken = keyToken;
    }

    public String getPublicKeyXmlString() {
        return publicKeyXmlString;
    }

    @JsonProperty("PublicKeyXmlString")
    public void setPublicKeyXmlString(String publicKeyXmlString) {
        this.publicKeyXmlString = publicKeyXmlString;
    }

    public String getNodeAnswered() {
        return nodeAnswered;
    }

    @JsonProperty("NodeAnswered")
    public void setNodeAnswered(String nodeAnswered) {
        this.nodeAnswered = nodeAnswered;
    }

    public String getPublicPEMKey() {
        return publicPEMKey;
    }

    @JsonProperty("PublicPEMKey")
    public void setPublicPEMKey(String publicPEMKey) {
        this.publicPEMKey = publicPEMKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TibPublicKeyModel that = (TibPublicKeyModel) o;
        return Objects.equals(keyToken, that.keyToken) &&
                Objects.equals(publicKeyXmlString, that.publicKeyXmlString) &&
                Objects.equals(nodeAnswered, that.nodeAnswered) &&
                Objects.equals(publicPEMKey, that.publicPEMKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyToken, publicKeyXmlString, nodeAnswered, publicPEMKey);
    }

    @Override
    public String toString() {
        return "TibPublicKeyModel{" +
                "keyToken='" + keyToken + '\'' +
                ", publicKeyXmlString='" + publicKeyXmlString + '\'' +
                ", nodeAnswered='" + nodeAnswered + '\'' +
                ", publicPEMKey='" + publicPEMKey + '\'' +
                '}';
    }
}
