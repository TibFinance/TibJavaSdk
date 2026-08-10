
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


public class WalletOperationDetail   {

    
    /**
     * Date and time the wallet movement was recorded.
     */
    @JsonProperty("Date")
    private OffsetDateTime date;

    /**
     * The monetary value of each recurring transfer.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * Whether the money left the wallet.
     */
    @JsonProperty("IsWithdrawn")
    private boolean isWithdrawn;

    /**
     * Unique identifier of the wallet adjustment transaction
     */
    @JsonProperty("TransferId")
    private String transferId;

    /**
     * Movement category: PaymentSettlement, Fees, WithdrawalToBank, WalletFunding, OutgoingDeposit, Adjustment, Reversal or Other.
     */
    @JsonProperty("Category")
    private String category;


    
    public WalletOperationDetail() {
    }

    
    public WalletOperationDetail(OffsetDateTime date, Double amount, boolean isWithdrawn, String transferId, String category) {
        this.date = date;
        this.amount = amount;
        this.isWithdrawn = isWithdrawn;
        this.transferId = transferId;
        this.category = category;
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

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WalletOperationDetail that = (WalletOperationDetail) o;
        return Objects.equals(date, that.date) && Objects.equals(amount, that.amount) && Objects.equals(isWithdrawn, that.isWithdrawn) && Objects.equals(transferId, that.transferId) && Objects.equals(category, that.category) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(date, amount, isWithdrawn, transferId, category);
    }

    @Override
    public String toString() {
        return "WalletOperationDetail{" +
                "date='" + date + '\'' +
                ", amount='" + amount + '\'' +
                ", isWithdrawn='" + isWithdrawn + '\'' +
                ", transferId='" + transferId + '\'' +
                ", category='" + category + '\'' +

                '}';
    }
}