
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


public class GetPublicTokenInformationResponse extends CustomAPIResponse {

    
    @JsonProperty("ClientId")
    private String clientId;

    @JsonProperty("ServiceId")
    private String serviceId;

    @JsonProperty("ServiceName")
    private String serviceName;


    public GetPublicTokenInformationResponse(Error[] errors, boolean hasError, String messages, String clientId, String serviceId, String serviceName) {
        super(errors, hasError, messages);
        this.clientId = clientId;
this.serviceId = serviceId;
this.serviceName = serviceName;

    }

    public GetPublicTokenInformationResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.clientId = apiResponse.getResponse().toString();
this.serviceId = apiResponse.getResponse().toString();
this.serviceName = apiResponse.getResponse().toString();

        }
    }

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetPublicTokenInformationResponse that = (GetPublicTokenInformationResponse) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(serviceId, that.serviceId) && Objects.equals(serviceName, that.serviceName) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, serviceId, serviceName);
    }

    @Override
    public String toString() {
        return "GetPublicTokenInformationResponse{" +
                 "clientId='" + clientId + '\'' +
 ", serviceId='" + serviceId + '\'' +
 ", serviceName='" + serviceName + '\'' +

                '}';
    }
}