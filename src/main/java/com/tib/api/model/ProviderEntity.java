
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Provider;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ProviderEntity   {

    
    /**
 * 
 */
    @JsonProperty("ProviderId")
    private String providerId;

    /**
 * 
 */
    @JsonProperty("ProviderType")
    private Provider providerType;

    /**
 * 
 */
    @JsonProperty("OrderPriority")
    private Integer orderPriority;


    
    public ProviderEntity() {
    }

    
    public ProviderEntity(String providerId, Provider providerType, Integer orderPriority) {
        this.providerId = providerId;
this.providerType = providerType;
this.orderPriority = orderPriority;

    }
    
    

    
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public Provider getProviderType() {
        return providerType;
    }

    public void setProviderType(Provider providerType) {
        this.providerType = providerType;
    }

    public Integer getOrderPriority() {
        return orderPriority;
    }

    public void setOrderPriority(Integer orderPriority) {
        this.orderPriority = orderPriority;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProviderEntity that = (ProviderEntity) o;
        return Objects.equals(providerId, that.providerId) && Objects.equals(providerType, that.providerType) && Objects.equals(orderPriority, that.orderPriority) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerId, providerType, orderPriority);
    }

    @Override
    public String toString() {
        return "ProviderEntity{" +
                 "providerId='" + providerId + '\'' +
 ", providerType='" + providerType + '\'' +
 ", orderPriority='" + orderPriority + '\'' +

                '}';
    }
}