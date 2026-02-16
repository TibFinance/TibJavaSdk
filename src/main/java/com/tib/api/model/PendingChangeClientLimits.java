
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


public class PendingChangeClientLimits   {

    
    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * Retrieves or updates the warning deposit limit configured for a client.
     */
    @JsonProperty("ClientWarningDepositLimit")
    private Double clientWarningDepositLimit;

    /**
     * Gets or sets the warning collection limit for a client. This limit defines the monetary threshold at which the system raises a warning for client collection activities.
     */
    @JsonProperty("ClientWarningCollectionLimit")
    private Double clientWarningCollectionLimit;


    
    public PendingChangeClientLimits() {
    }

    
    public PendingChangeClientLimits(String serviceId, Double clientWarningDepositLimit, Double clientWarningCollectionLimit) {
        this.serviceId = serviceId;
        this.clientWarningDepositLimit = clientWarningDepositLimit;
        this.clientWarningCollectionLimit = clientWarningCollectionLimit;
    }
    
    

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Double getClientWarningDepositLimit() {
        return clientWarningDepositLimit;
    }

    public void setClientWarningDepositLimit(Double clientWarningDepositLimit) {
        this.clientWarningDepositLimit = clientWarningDepositLimit;
    }

    public Double getClientWarningCollectionLimit() {
        return clientWarningCollectionLimit;
    }

    public void setClientWarningCollectionLimit(Double clientWarningCollectionLimit) {
        this.clientWarningCollectionLimit = clientWarningCollectionLimit;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PendingChangeClientLimits that = (PendingChangeClientLimits) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(clientWarningDepositLimit, that.clientWarningDepositLimit) && Objects.equals(clientWarningCollectionLimit, that.clientWarningCollectionLimit) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, clientWarningDepositLimit, clientWarningCollectionLimit);
    }

    @Override
    public String toString() {
        return "PendingChangeClientLimits{" +
                "serviceId='" + serviceId + '\'' +
                ", clientWarningDepositLimit='" + clientWarningDepositLimit + '\'' +
                ", clientWarningCollectionLimit='" + clientWarningCollectionLimit + '\'' +

                '}';
    }
}