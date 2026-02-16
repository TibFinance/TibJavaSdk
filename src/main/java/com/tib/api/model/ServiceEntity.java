
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


public class ServiceEntity   {

    
    /**
     * Retrieves or assigns the service's name.
     */
    @JsonProperty("ServiceName")
    private String serviceName;

    /**
     * Retrieves or assigns the default language preference for a customer.
     */
    @JsonProperty("DefaultCustomerLanguage")
    private Language defaultCustomerLanguage;

    /**
     * Gets or sets the type of the provider.
     */
    @JsonProperty("ProviderType")
    private Provider providerType;

    /**
     * Retrieves or assigns the currency type used in transactions.
     */
    @JsonProperty("Currency")
    private Currency currency;


    
    public ServiceEntity() {
    }

    
    public ServiceEntity(String serviceName, Language defaultCustomerLanguage, Provider providerType, Currency currency) {
        this.serviceName = serviceName;
        this.defaultCustomerLanguage = defaultCustomerLanguage;
        this.providerType = providerType;
        this.currency = currency;
    }
    
    

    
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Language getDefaultCustomerLanguage() {
        return defaultCustomerLanguage;
    }

    public void setDefaultCustomerLanguage(Language defaultCustomerLanguage) {
        this.defaultCustomerLanguage = defaultCustomerLanguage;
    }

    public Provider getProviderType() {
        return providerType;
    }

    public void setProviderType(Provider providerType) {
        this.providerType = providerType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceEntity that = (ServiceEntity) o;
        return Objects.equals(serviceName, that.serviceName) && Objects.equals(defaultCustomerLanguage, that.defaultCustomerLanguage) && Objects.equals(providerType, that.providerType) && Objects.equals(currency, that.currency) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceName, defaultCustomerLanguage, providerType, currency);
    }

    @Override
    public String toString() {
        return "ServiceEntity{" +
                "serviceName='" + serviceName + '\'' +
                ", defaultCustomerLanguage='" + defaultCustomerLanguage + '\'' +
                ", providerType='" + providerType + '\'' +
                ", currency='" + currency + '\'' +

                '}';
    }
}