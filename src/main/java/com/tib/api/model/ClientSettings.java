
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


public class ClientSettings   {

    
    /**
     * Gets or sets the daily collection limit applied to the service contract.
     */
    @JsonProperty("CollectionLimitDaily")
    private Double collectionLimitDaily;

    /**
     * Gets or sets the maximum amount that can be deposited in a single day for the client’s service contract.
     */
    @JsonProperty("DepositLimitDaily")
    private Double depositLimitDaily;

    /**
     * Gets the tib warning collection limit daily.
     */
    @JsonProperty("ClientWarningCollectionLimitDaily")
    private Double clientWarningCollectionLimitDaily;

    /**
     * Gets the tib warning deposit limit daily.
     */
    @JsonProperty("ClientWarningDepositLimitDaily")
    private Double clientWarningDepositLimitDaily;


    
    public ClientSettings() {
    }

    
    public ClientSettings(Double collectionLimitDaily, Double depositLimitDaily, Double clientWarningCollectionLimitDaily, Double clientWarningDepositLimitDaily) {
        this.collectionLimitDaily = collectionLimitDaily;
        this.depositLimitDaily = depositLimitDaily;
        this.clientWarningCollectionLimitDaily = clientWarningCollectionLimitDaily;
        this.clientWarningDepositLimitDaily = clientWarningDepositLimitDaily;
    }
    
    

    
    public Double getCollectionLimitDaily() {
        return collectionLimitDaily;
    }

    public void setCollectionLimitDaily(Double collectionLimitDaily) {
        this.collectionLimitDaily = collectionLimitDaily;
    }

    public Double getDepositLimitDaily() {
        return depositLimitDaily;
    }

    public void setDepositLimitDaily(Double depositLimitDaily) {
        this.depositLimitDaily = depositLimitDaily;
    }

    public Double getClientWarningCollectionLimitDaily() {
        return clientWarningCollectionLimitDaily;
    }

    public void setClientWarningCollectionLimitDaily(Double clientWarningCollectionLimitDaily) {
        this.clientWarningCollectionLimitDaily = clientWarningCollectionLimitDaily;
    }

    public Double getClientWarningDepositLimitDaily() {
        return clientWarningDepositLimitDaily;
    }

    public void setClientWarningDepositLimitDaily(Double clientWarningDepositLimitDaily) {
        this.clientWarningDepositLimitDaily = clientWarningDepositLimitDaily;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientSettings that = (ClientSettings) o;
        return Objects.equals(collectionLimitDaily, that.collectionLimitDaily) && Objects.equals(depositLimitDaily, that.depositLimitDaily) && Objects.equals(clientWarningCollectionLimitDaily, that.clientWarningCollectionLimitDaily) && Objects.equals(clientWarningDepositLimitDaily, that.clientWarningDepositLimitDaily) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(collectionLimitDaily, depositLimitDaily, clientWarningCollectionLimitDaily, clientWarningDepositLimitDaily);
    }

    @Override
    public String toString() {
        return "ClientSettings{" +
                "collectionLimitDaily='" + collectionLimitDaily + '\'' +
                ", depositLimitDaily='" + depositLimitDaily + '\'' +
                ", clientWarningCollectionLimitDaily='" + clientWarningCollectionLimitDaily + '\'' +
                ", clientWarningDepositLimitDaily='" + clientWarningDepositLimitDaily + '\'' +

                '}';
    }
}