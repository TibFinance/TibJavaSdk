
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.Provider;
import com.tib.api.model.enums.Currency;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class Service  extends ServiceEntity  {

    
    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * Retrieves or assigns the unique identifier for WhiteLabeling.
     */
    @JsonProperty("WhiteLabelingId")
    private Optional<String> whiteLabelingId;

    /**
     * Gets or sets a value indicating whether this service has a completed boarding (status 13 = approved).
     */
    @JsonProperty("HasCompletedBoarding")
    private boolean hasCompletedBoarding;


    
    public Service() {
    }

    
    public Service(String serviceId, Optional<String> whiteLabelingId, boolean hasCompletedBoarding) {
        this.serviceId = serviceId;
        this.whiteLabelingId = whiteLabelingId;
        this.hasCompletedBoarding = hasCompletedBoarding;
    }
    
    
    public Service(String serviceName, Language defaultCustomerLanguage, Provider providerType, Currency currency, String serviceId, Optional<String> whiteLabelingId, boolean hasCompletedBoarding) {
        super(serviceName, defaultCustomerLanguage, providerType, currency);
        this.serviceId = serviceId;
        this.whiteLabelingId = whiteLabelingId;
        this.hasCompletedBoarding = hasCompletedBoarding;
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Optional<String> getWhiteLabelingId() {
        return whiteLabelingId;
    }

    public void setWhiteLabelingId(Optional<String> whiteLabelingId) {
        this.whiteLabelingId = whiteLabelingId;
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
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(whiteLabelingId, that.whiteLabelingId) && Objects.equals(hasCompletedBoarding, that.hasCompletedBoarding) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, whiteLabelingId, hasCompletedBoarding);
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId='" + serviceId + '\'' +
                ", whiteLabelingId='" + whiteLabelingId + '\'' +
                ", hasCompletedBoarding='" + hasCompletedBoarding + '\'' +

                '}';
    }
}