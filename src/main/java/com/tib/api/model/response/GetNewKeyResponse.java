
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetNewKeyResponse extends CustomAPIResponse {

    
    @JsonProperty("Token")
    private String token;

    @JsonProperty("Key")
    private byte[] key;


    public GetNewKeyResponse(Error[] errors, boolean hasError, String messages, String token, byte[] key) {
        super(errors, hasError, messages);
        this.token = token;
        this.key = key;
    }

    public GetNewKeyResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.token = apiResponse.getResponse().toString();
            this.key = apiResponse.getResponse().toString().getBytes();
        }
    }

    
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public byte[] getKey() {
        return key;
    }

    public void setKey(byte[] key) {
        this.key = key;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetNewKeyResponse that = (GetNewKeyResponse) o;
        return Objects.equals(token, that.token) && Objects.equals(key, that.key) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(token, key);
    }

    @Override
    public String toString() {
        return "GetNewKeyResponse{" +
                "token='" + token + '\'' +
                ", key='" + key + '\'' +

                '}';
    }
}