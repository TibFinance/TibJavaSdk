
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.Provider;
import com.tib.api.model.enums.Currency;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class Service  extends ServiceEntity  {

    
    /**
     * Identifier of the service for which recurring transfers are requested
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * Indicates whether the service has finished its onboarding process.
     */
    @JsonProperty("HasCompletedBoarding")
    private boolean hasCompletedBoarding;


    
    public Service() {
    }

    
    public Service(String serviceId, boolean hasCompletedBoarding) {
        this.serviceId = serviceId;
        this.hasCompletedBoarding = hasCompletedBoarding;
    }
    
    
    public Service(String serviceName, Language defaultCustomerLanguage, Provider providerType, Currency currency, String serviceId, boolean hasCompletedBoarding) {
        super(serviceName, defaultCustomerLanguage, providerType, currency);
        this.serviceId = serviceId;
        this.hasCompletedBoarding = hasCompletedBoarding;
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public boolean getHasCompletedBoarding() {
        return hasCompletedBoarding;
    }

    public void setHasCompletedBoarding(boolean hasCompletedBoarding) {
        this.hasCompletedBoarding = hasCompletedBoarding;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service that = (Service) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(hasCompletedBoarding, that.hasCompletedBoarding) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, hasCompletedBoarding);
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId='" + serviceId + '\'' +
                ", hasCompletedBoarding='" + hasCompletedBoarding + '\'' +

                '}';
    }
}