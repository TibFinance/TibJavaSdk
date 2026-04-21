
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class WalletOperation   {

    
    /**
     * Date and time of the wallet operation.
     */
    @JsonProperty("Date")
    private OffsetDateTime date;

    /**
     * The monetary value of each recurring transfer.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * Whether this operation was a withdrawal from the wallet.
     */
    @JsonProperty("IsWithdrawn")
    private boolean isWithdrawn;

    /**
     * Human‑readable description of the transfer
     */
    @JsonProperty("Description")
    private String description;


    
    public WalletOperation() {
    }

    
    public WalletOperation(OffsetDateTime date, Double amount, boolean isWithdrawn, String description) {
        this.date = date;
        this.amount = amount;
        this.isWithdrawn = isWithdrawn;
        this.description = description;
    }
    
    

    
    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public boolean getIsWithdrawn() {
        return isWithdrawn;
    }

    public void setIsWithdrawn(boolean isWithdrawn) {
        this.isWithdrawn = isWithdrawn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WalletOperation that = (WalletOperation) o;
        return Objects.equals(date, that.date) && Objects.equals(amount, that.amount) && Objects.equals(isWithdrawn, that.isWithdrawn) && Objects.equals(description, that.description) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(date, amount, isWithdrawn, description);
    }

    @Override
    public String toString() {
        return "WalletOperation{" +
                "date='" + date + '\'' +
                ", amount='" + amount + '\'' +
                ", isWithdrawn='" + isWithdrawn + '\'' +
                ", description='" + description + '\'' +

                '}';
    }
}