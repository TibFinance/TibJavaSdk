
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


public class AuthenticateUserFromAdminResponse extends CustomAPIResponse {

    
    @JsonProperty("Key")
    private String key;


    public AuthenticateUserFromAdminResponse(Error[] errors, boolean hasError, String messages, String key) {
        super(errors, hasError, messages);
        this.key = key;
    }

    public AuthenticateUserFromAdminResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.key = apiResponse.getResponse().toString();
        }
    }

    
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthenticateUserFromAdminResponse that = (AuthenticateUserFromAdminResponse) o;
        return Objects.equals(key, that.key) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return "AuthenticateUserFromAdminResponse{" +
                "key='" + key + '\'' +

                '}';
    }
}