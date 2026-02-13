package com.tib.api.model.response;

import java.util.Arrays;
import java.util.Objects;

public class SymmetricKeyResponse {

    private byte[] symmetricKey;

    private String keyToken;

    private String callNode;

    public SymmetricKeyResponse(byte[] symmetricKey, String keyToken, String callNode) {
        this.symmetricKey = symmetricKey;
        this.keyToken = keyToken;
        this.callNode = callNode;
    }

    public byte[] getSymmetricKey() {
        return symmetricKey;
    }

    public void setSymmetricKey(byte[] symmetricKey) {
        this.symmetricKey = symmetricKey;
    }

    public String getKeyToken() {
        return keyToken;
    }

    public void setKeyToken(String keyToken) {
        this.keyToken = keyToken;
    }

    public String getCallNode() {
        return callNode;
    }

    public void setCallNode(String callNode) {
        this.callNode = callNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SymmetricKeyResponse that = (SymmetricKeyResponse) o;
        return Arrays.equals(symmetricKey, that.symmetricKey) &&
                Objects.equals(keyToken, that.keyToken) &&
                Objects.equals(callNode, that.callNode);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(keyToken, callNode);
        result = 31 * result + Arrays.hashCode(symmetricKey);
        return result;
    }

    @Override
    public String toString() {
        return "SymmetricKeyResponse{" +
                "symmetricKey=" + Arrays.toString(symmetricKey) +
                ", keyToken='" + keyToken + '\'' +
                ", callNode='" + callNode + '\'' +
                '}';
    }
}
