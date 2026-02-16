
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


public class CreateClientResponse extends CustomAPIResponse {

    
    @JsonProperty("ClientId")
    private String clientId;


    public CreateClientResponse(Error[] errors, boolean hasError, String messages, String clientId) {
        super(errors, hasError, messages);
        this.clientId = clientId;
    }

    public CreateClientResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.clientId = apiResponse.getResponse().toString();
        }
    }

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateClientResponse that = (CreateClientResponse) o;
        return Objects.equals(clientId, that.clientId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId);
    }

    @Override
    public String toString() {
        return "CreateClientResponse{" +
                "clientId='" + clientId + '\'' +

                '}';
    }
}