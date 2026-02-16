
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


public class RetreiveKeyResponse extends CustomAPIResponse {

    
    @JsonProperty("Key")
    private byte[] key;


    public RetreiveKeyResponse(Error[] errors, boolean hasError, String messages, byte[] key) {
        super(errors, hasError, messages);
        this.key = key;
    }

    public RetreiveKeyResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.key = apiResponse.getResponse().toString().getBytes();
        }
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
        RetreiveKeyResponse that = (RetreiveKeyResponse) o;
        return Objects.equals(key, that.key) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return "RetreiveKeyResponse{" +
                "key='" + key + '\'' +

                '}';
    }
}