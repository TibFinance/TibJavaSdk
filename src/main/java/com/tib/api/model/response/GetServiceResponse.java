
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.ServiceWithMerchant;
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


public class GetServiceResponse extends CustomAPIResponse {

    
    @JsonProperty("Service")
    private ServiceWithMerchant service;


    public GetServiceResponse(Error[] errors, boolean hasError, String messages, ServiceWithMerchant service) {
        super(errors, hasError, messages);
        this.service = service;
    }

    public GetServiceResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.service = objectMapper.readValue(json, ServiceWithMerchant.class);
        }
    }

    
    public ServiceWithMerchant getService() {
        return service;
    }

    public void setService(ServiceWithMerchant service) {
        this.service = service;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetServiceResponse that = (GetServiceResponse) o;
        return Objects.equals(service, that.service) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(service);
    }

    @Override
    public String toString() {
        return "GetServiceResponse{" +
                "service='" + service + '\'' +

                '}';
    }
}