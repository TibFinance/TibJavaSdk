
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


public class WalletHolder   {

    
    /**
     * Unique identifier of the entity that owns the wallet
     */
    @JsonProperty("WalletHolderId")
    private String walletHolderId;

    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * The name of the merchant associated with the transfer.
     */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
     * The total amount of funds available in the wallet for the requested service.
     */
    @JsonProperty("Balance")
    private Double balance;

    /**
     * Indicates whether the wallet information request is still being processed
     */
    @JsonProperty("IsProcessing")
    private Optional<Boolean> isProcessing;

    /**
     * Unique identifier of the wallet returned by the service
     */
    @JsonProperty("WalletId")
    private String walletId;

    /**
     * The total amount of funds deposited into the wallet for the specified service.
     */
    @JsonProperty("DepositAmount")
    private Double depositAmount;


    
    public WalletHolder() {
    }

    
    public WalletHolder(String walletHolderId, String merchantId, String merchantName, Double balance, Optional<Boolean> isProcessing, String walletId, Double depositAmount) {
        this.walletHolderId = walletHolderId;
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.balance = balance;
        this.isProcessing = isProcessing;
        this.walletId = walletId;
        this.depositAmount = depositAmount;
    }
    
    

    
    public String getWalletHolderId() {
        return walletHolderId;
    }

    public void setWalletHolderId(String walletHolderId) {
        this.walletHolderId = walletHolderId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Optional<Boolean> getIsProcessing() {
        return isProcessing;
    }

    public void setIsProcessing(Optional<Boolean> isProcessing) {
        this.isProcessing = isProcessing;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public Double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Double depositAmount) {
        this.depositAmount = depositAmount;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WalletHolder that = (WalletHolder) o;
        return Objects.equals(walletHolderId, that.walletHolderId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(merchantName, that.merchantName) && Objects.equals(balance, that.balance) && Objects.equals(isProcessing, that.isProcessing) && Objects.equals(walletId, that.walletId) && Objects.equals(depositAmount, that.depositAmount) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(walletHolderId, merchantId, merchantName, balance, isProcessing, walletId, depositAmount);
    }

    @Override
    public String toString() {
        return "WalletHolder{" +
                "walletHolderId='" + walletHolderId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", balance='" + balance + '\'' +
                ", isProcessing='" + isProcessing + '\'' +
                ", walletId='" + walletId + '\'' +
                ", depositAmount='" + depositAmount + '\'' +

                '}';
    }
}