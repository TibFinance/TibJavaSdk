
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


public class ServiceEntity   {

    
    /**
     * The name of the service that processed the transfer
     */
    @JsonProperty("ServiceName")
    private String serviceName;

    /**
     * The default language assigned to the customer for all platform communications.
     */
    @JsonProperty("DefaultCustomerLanguage")
    private Language defaultCustomerLanguage;

    /**
     * Identifies the category of the service provider for the requested service
     */
    @JsonProperty("ProviderType")
    private Provider providerType;

    /**
     * The ISO 4217 three‑letter code of the currency in which the transfer was executed.
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