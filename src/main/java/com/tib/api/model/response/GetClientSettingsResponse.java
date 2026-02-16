
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.ClientSettings;
import com.tib.api.model.ServiceSettings;
import com.tib.api.model.ServiceFeeSettings;
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


public class GetClientSettingsResponse extends CustomAPIResponse {

    
    @JsonProperty("ClientSettings")
    private ClientSettings clientSettings;

    @JsonProperty("ServiceSettings")
    private ServiceSettings serviceSettings;

    @JsonProperty("ServiceFeeSettings")
    private ServiceFeeSettings serviceFeeSettings;


    public GetClientSettingsResponse(Error[] errors, boolean hasError, String messages, ClientSettings clientSettings, ServiceSettings serviceSettings, ServiceFeeSettings serviceFeeSettings) {
        super(errors, hasError, messages);
        this.clientSettings = clientSettings;
        this.serviceSettings = serviceSettings;
        this.serviceFeeSettings = serviceFeeSettings;
    }

    public GetClientSettingsResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.clientSettings = objectMapper.readValue(json, ClientSettings.class);
            this.serviceSettings = objectMapper.readValue(json, ServiceSettings.class);
            this.serviceFeeSettings = objectMapper.readValue(json, ServiceFeeSettings.class);
        }
    }

    
    public ClientSettings getClientSettings() {
        return clientSettings;
    }

    public void setClientSettings(ClientSettings clientSettings) {
        this.clientSettings = clientSettings;
    }

    public ServiceSettings getServiceSettings() {
        return serviceSettings;
    }

    public void setServiceSettings(ServiceSettings serviceSettings) {
        this.serviceSettings = serviceSettings;
    }

    public ServiceFeeSettings getServiceFeeSettings() {
        return serviceFeeSettings;
    }

    public void setServiceFeeSettings(ServiceFeeSettings serviceFeeSettings) {
        this.serviceFeeSettings = serviceFeeSettings;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetClientSettingsResponse that = (GetClientSettingsResponse) o;
        return Objects.equals(clientSettings, that.clientSettings) && Objects.equals(serviceSettings, that.serviceSettings) && Objects.equals(serviceFeeSettings, that.serviceFeeSettings) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientSettings, serviceSettings, serviceFeeSettings);
    }

    @Override
    public String toString() {
        return "GetClientSettingsResponse{" +
                "clientSettings='" + clientSettings + '\'' +
                ", serviceSettings='" + serviceSettings + '\'' +
                ", serviceFeeSettings='" + serviceFeeSettings + '\'' +

                '}';
    }
}