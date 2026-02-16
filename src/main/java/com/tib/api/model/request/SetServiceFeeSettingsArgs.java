
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.ServiceFeeSettings;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SetServiceFeeSettingsArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * Gets or sets the ServiceFeeSettings model that defines the fee configuration for a specific service contract.
     */
    @JsonProperty("ServiceFeeSettings")
    private ServiceFeeSettings serviceFeeSettings;


    
    public SetServiceFeeSettingsArgs() {
    }

    
    public SetServiceFeeSettingsArgs(String serviceId, ServiceFeeSettings serviceFeeSettings) {
        this.serviceId = serviceId;
        this.serviceFeeSettings = serviceFeeSettings;
    }
    
    
    public SetServiceFeeSettingsArgs(String sessionToken, String serviceId, ServiceFeeSettings serviceFeeSettings) {
        super(sessionToken);
        this.serviceId = serviceId;
        this.serviceFeeSettings = serviceFeeSettings;
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
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
        SetServiceFeeSettingsArgs that = (SetServiceFeeSettingsArgs) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(serviceFeeSettings, that.serviceFeeSettings) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, serviceFeeSettings);
    }

    @Override
    public String toString() {
        return "SetServiceFeeSettingsArgs{" +
                "serviceId='" + serviceId + '\'' +
                ", serviceFeeSettings='" + serviceFeeSettings + '\'' +

                '}';
    }
}