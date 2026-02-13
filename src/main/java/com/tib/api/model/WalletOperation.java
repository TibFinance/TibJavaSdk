
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


public class WalletOperation   {

    
    /**
 * 
 */
    @JsonProperty("Date")
    private LocalDateTime date;

    /**
 * Retrieves or assigns the monetary amount involved in the transaction.
 */
    @JsonProperty("Amount")
    private Double amount;

    /**
 * 
 */
    @JsonProperty("IsWithdrawn")
    private boolean isWithdrawn;

    /**
 * Provides a detailed explanation of the function's purpose and usage within the API.
 */
    @JsonProperty("Description")
    private String description;


    
    public WalletOperation() {
    }

    
    public WalletOperation(LocalDateTime date, Double amount, boolean isWithdrawn, String description) {
        this.date = date;
this.amount = amount;
this.isWithdrawn = isWithdrawn;
this.description = description;

    }
    
    

    
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
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