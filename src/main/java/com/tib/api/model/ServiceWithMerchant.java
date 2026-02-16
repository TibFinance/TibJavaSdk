
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.MerchantView;
import com.tib.api.model.ServiceFeeSettings;
import com.tib.api.model.ServiceSettings;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ServiceWithMerchant  extends Service  {

    
    /**
     * Retrieves or assigns the primary merchant associated with the service.
     */
    @JsonProperty("ServicePrimaryMerchant")
    private MerchantView servicePrimaryMerchant;

    /**
     * Gets or sets the ServiceFeeSettings model that defines the fee configuration for a specific service contract.
     */
    @JsonProperty("ServiceFeeSettings")
    private ServiceFeeSettings serviceFeeSettings;

    /**
     * Gets or sets the configuration settings for a TIB Finance service.
     */
    @JsonProperty("ServiceSettings")
    private ServiceSettings serviceSettings;

    /**
     * Specifies the merchant name that is charged for fees when an override is applied.
     */
    @JsonProperty("OverloadedFeesMerchantName")
    private String overloadedFeesMerchantName;


    
    public ServiceWithMerchant() {
    }

    
    public ServiceWithMerchant(MerchantView servicePrimaryMerchant, ServiceFeeSettings serviceFeeSettings, ServiceSettings serviceSettings, String overloadedFeesMerchantName) {
        this.servicePrimaryMerchant = servicePrimaryMerchant;
        this.serviceFeeSettings = serviceFeeSettings;
        this.serviceSettings = serviceSettings;
        this.overloadedFeesMerchantName = overloadedFeesMerchantName;
    }
    
    
    public ServiceWithMerchant(String serviceId, Optional<String> whiteLabelingId, boolean hasCompletedBoarding, MerchantView servicePrimaryMerchant, ServiceFeeSettings serviceFeeSettings, ServiceSettings serviceSettings, String overloadedFeesMerchantName) {
        super(serviceId, whiteLabelingId, hasCompletedBoarding);
        this.servicePrimaryMerchant = servicePrimaryMerchant;
        this.serviceFeeSettings = serviceFeeSettings;
        this.serviceSettings = serviceSettings;
        this.overloadedFeesMerchantName = overloadedFeesMerchantName;
    }

    
    public MerchantView getServicePrimaryMerchant() {
        return servicePrimaryMerchant;
    }

    public void setServicePrimaryMerchant(MerchantView servicePrimaryMerchant) {
        this.servicePrimaryMerchant = servicePrimaryMerchant;
    }

    public ServiceFeeSettings getServiceFeeSettings() {
        return serviceFeeSettings;
    }

    public void setServiceFeeSettings(ServiceFeeSettings serviceFeeSettings) {
        this.serviceFeeSettings = serviceFeeSettings;
    }

    public ServiceSettings getServiceSettings() {
        return serviceSettings;
    }

    public void setServiceSettings(ServiceSettings serviceSettings) {
        this.serviceSettings = serviceSettings;
    }

    public String getOverloadedFeesMerchantName() {
        return overloadedFeesMerchantName;
    }

    public void setOverloadedFeesMerchantName(String overloadedFeesMerchantName) {
        this.overloadedFeesMerchantName = overloadedFeesMerchantName;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceWithMerchant that = (ServiceWithMerchant) o;
        return Objects.equals(servicePrimaryMerchant, that.servicePrimaryMerchant) && Objects.equals(serviceFeeSettings, that.serviceFeeSettings) && Objects.equals(serviceSettings, that.serviceSettings) && Objects.equals(overloadedFeesMerchantName, that.overloadedFeesMerchantName) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(servicePrimaryMerchant, serviceFeeSettings, serviceSettings, overloadedFeesMerchantName);
    }

    @Override
    public String toString() {
        return "ServiceWithMerchant{" +
                "servicePrimaryMerchant='" + servicePrimaryMerchant + '\'' +
                ", serviceFeeSettings='" + serviceFeeSettings + '\'' +
                ", serviceSettings='" + serviceSettings + '\'' +
                ", overloadedFeesMerchantName='" + overloadedFeesMerchantName + '\'' +

                '}';
    }
}