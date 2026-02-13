
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Provider;
import com.tib.api.model.enums.TransferDirection;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ProviderTransactionIdentity   {

    
    /**
 * Gets or sets the type of the provider.
 */
    @JsonProperty("ProviderType")
    private Provider providerType;

    /**
 * 
 */
    @JsonProperty("ProviderId")
    private String providerId;

    /**
 * Indicates the direction of an Interac transaction.
 */
    @JsonProperty("TransferDirection")
    private TransferDirection transferDirection;

    /**
 * Gets or sets the provider transaction identifier.
 */
    @JsonProperty("ProviderTransactionId")
    private String providerTransactionId;

    /**
 * Gets or sets the provider transaction group identifier.
 */
    @JsonProperty("ProviderTransactionGroupId")
    private String providerTransactionGroupId;


    
    public ProviderTransactionIdentity() {
    }

    
    public ProviderTransactionIdentity(Provider providerType, String providerId, TransferDirection transferDirection, String providerTransactionId, String providerTransactionGroupId) {
        this.providerType = providerType;
this.providerId = providerId;
this.transferDirection = transferDirection;
this.providerTransactionId = providerTransactionId;
this.providerTransactionGroupId = providerTransactionGroupId;

    }
    
    

    
    public Provider getProviderType() {
        return providerType;
    }

    public void setProviderType(Provider providerType) {
        this.providerType = providerType;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public TransferDirection getTransferDirection() {
        return transferDirection;
    }

    public void setTransferDirection(TransferDirection transferDirection) {
        this.transferDirection = transferDirection;
    }

    public String getProviderTransactionId() {
        return providerTransactionId;
    }

    public void setProviderTransactionId(String providerTransactionId) {
        this.providerTransactionId = providerTransactionId;
    }

    public String getProviderTransactionGroupId() {
        return providerTransactionGroupId;
    }

    public void setProviderTransactionGroupId(String providerTransactionGroupId) {
        this.providerTransactionGroupId = providerTransactionGroupId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProviderTransactionIdentity that = (ProviderTransactionIdentity) o;
        return Objects.equals(providerType, that.providerType) && Objects.equals(providerId, that.providerId) && Objects.equals(transferDirection, that.transferDirection) && Objects.equals(providerTransactionId, that.providerTransactionId) && Objects.equals(providerTransactionGroupId, that.providerTransactionGroupId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerType, providerId, transferDirection, providerTransactionId, providerTransactionGroupId);
    }

    @Override
    public String toString() {
        return "ProviderTransactionIdentity{" +
                 "providerType='" + providerType + '\'' +
 ", providerId='" + providerId + '\'' +
 ", transferDirection='" + transferDirection + '\'' +
 ", providerTransactionId='" + providerTransactionId + '\'' +
 ", providerTransactionGroupId='" + providerTransactionGroupId + '\'' +

                '}';
    }
}