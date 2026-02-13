package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.Objects;

public class GenericResponse implements IGenericResponse {

    private String cryptedBase64Data;

    private byte[] iv;

    public String getCryptedBase64Data() {
        return cryptedBase64Data;
    }

    @JsonProperty("CryptedBase64Data")
    public void setCryptedBase64Data(String cryptedBase64Data) {
        this.cryptedBase64Data = cryptedBase64Data;
    }

    public byte[] getIv() {
        return iv;
    }

    @JsonProperty("IV")
    public void setIv(byte[] iv) {
        this.iv = iv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericResponse that = (GenericResponse) o;
        return Objects.equals(cryptedBase64Data, that.cryptedBase64Data) &&
                Arrays.equals(iv, that.iv);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(cryptedBase64Data);
        result = 31 * result + Arrays.hashCode(iv);
        return result;
    }


}
