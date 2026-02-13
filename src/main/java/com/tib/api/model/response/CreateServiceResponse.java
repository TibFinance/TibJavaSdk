
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


public class CreateServiceResponse extends CustomAPIResponse {

    
    @JsonProperty("CreatedServiceId")
    private String createdServiceId;


    public CreateServiceResponse(Error[] errors, boolean hasError, String messages, String createdServiceId) {
        super(errors, hasError, messages);
        this.createdServiceId = createdServiceId;

    }

    public CreateServiceResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.createdServiceId = apiResponse.getResponse().toString();

        }
    }

    
    public String getCreatedServiceId() {
        return createdServiceId;
    }

    public void setCreatedServiceId(String createdServiceId) {
        this.createdServiceId = createdServiceId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateServiceResponse that = (CreateServiceResponse) o;
        return Objects.equals(createdServiceId, that.createdServiceId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(createdServiceId);
    }

    @Override
    public String toString() {
        return "CreateServiceResponse{" +
                 "createdServiceId='" + createdServiceId + '\'' +

                '}';
    }
}