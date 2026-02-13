package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class KeyExchangeResponse {

    private String fullSymetricKeyToken;

    private String symetricHostHalfKey;

    public String getFullSymetricKeyToken() {
        return fullSymetricKeyToken;
    }

    @JsonProperty("FullSymetricKeyToken")
    public void setFullSymetricKeyToken(String fullSymetricKeyToken) {
        this.fullSymetricKeyToken = fullSymetricKeyToken;
    }

    public String getSymetricHostHalfKey() {
        return symetricHostHalfKey;
    }

    @JsonProperty("SymetricHostHalfKey")
    public void setSymetricHostHalfKey(String symetricHostHalfKey) {
        this.symetricHostHalfKey = symetricHostHalfKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyExchangeResponse that = (KeyExchangeResponse) o;
        return Objects.equals(fullSymetricKeyToken, that.fullSymetricKeyToken) &&
                Objects.equals(symetricHostHalfKey, that.symetricHostHalfKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullSymetricKeyToken, symetricHostHalfKey);
    }

    @Override
    public String toString() {
        return "KeyExchangeResponse{" +
                "fullSymetricKeyToken='" + fullSymetricKeyToken + '\'' +
                ", symetricHostHalfKey='" + symetricHostHalfKey + '\'' +
                '}';
    }
}
