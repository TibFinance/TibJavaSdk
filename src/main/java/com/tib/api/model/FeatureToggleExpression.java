
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class FeatureToggleExpression   {

    
    /**
     * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
     */
    @JsonProperty("ClientId")
    private String clientId;

    /**
     * 
     */
    @JsonProperty("ServiceIds")
    private List<String> serviceIds;

    /**
     * 
     */
    @JsonProperty("MerchantIds")
    private List<String> merchantIds;


    
    public FeatureToggleExpression() {
    }

    
    public FeatureToggleExpression(String clientId, List<String> serviceIds, List<String> merchantIds) {
        this.clientId = clientId;
        this.serviceIds = serviceIds;
        this.merchantIds = merchantIds;
    }
    
    

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public List<String> getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(List<String> serviceIds) {
        this.serviceIds = serviceIds;
    }

    public List<String> getMerchantIds() {
        return merchantIds;
    }

    public void setMerchantIds(List<String> merchantIds) {
        this.merchantIds = merchantIds;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeatureToggleExpression that = (FeatureToggleExpression) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(serviceIds, that.serviceIds) && Objects.equals(merchantIds, that.merchantIds) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, serviceIds, merchantIds);
    }

    @Override
    public String toString() {
        return "FeatureToggleExpression{" +
                "clientId='" + clientId + '\'' +
                ", serviceIds='" + serviceIds + '\'' +
                ", merchantIds='" + merchantIds + '\'' +

                '}';
    }
}