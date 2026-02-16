
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


public class CreateSubClientResponse extends CustomAPIResponse {

    
    @JsonProperty("ServiceId")
    private String serviceId;


    public CreateSubClientResponse(Error[] errors, boolean hasError, String messages, String serviceId) {
        super(errors, hasError, messages);
        this.serviceId = serviceId;
    }

    public CreateSubClientResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.serviceId = apiResponse.getResponse().toString();
        }
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateSubClientResponse that = (CreateSubClientResponse) o;
        return Objects.equals(serviceId, that.serviceId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId);
    }

    @Override
    public String toString() {
        return "CreateSubClientResponse{" +
                "serviceId='" + serviceId + '\'' +

                '}';
    }
}