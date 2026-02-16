
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


public class CreateClientLoginResponse extends CustomAPIResponse {

    
    @JsonProperty("ClientLoginId")
    private String clientLoginId;


    public CreateClientLoginResponse(Error[] errors, boolean hasError, String messages, String clientLoginId) {
        super(errors, hasError, messages);
        this.clientLoginId = clientLoginId;
    }

    public CreateClientLoginResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.clientLoginId = apiResponse.getResponse().toString();
        }
    }

    
    public String getClientLoginId() {
        return clientLoginId;
    }

    public void setClientLoginId(String clientLoginId) {
        this.clientLoginId = clientLoginId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateClientLoginResponse that = (CreateClientLoginResponse) o;
        return Objects.equals(clientLoginId, that.clientLoginId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientLoginId);
    }

    @Override
    public String toString() {
        return "CreateClientLoginResponse{" +
                "clientLoginId='" + clientLoginId + '\'' +

                '}';
    }
}