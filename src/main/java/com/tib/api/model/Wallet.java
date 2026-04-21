
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.ReferenceType;
import com.tib.api.model.enums.WalletType;
import com.tib.api.model.WalletHolder;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class Wallet   {

    
    /**
     * Unique identifier of the wallet returned by the service
     */
    @JsonProperty("WalletId")
    private String walletId;

    /**
     * Indicates the category of reference used to identify the wallet in the response
     */
    @JsonProperty("ReferenceType")
    private ReferenceType referenceType;

    /**
     * Unique identifier of the wallet information record returned by the service
     */
    @JsonProperty("ReferenceId")
    private String referenceId;

    /**
     * The total amount of funds available in the wallet for the requested service.
     */
    @JsonProperty("Balance")
    private Double balance;

    /**
     * The total amount currently available for withdrawal from the wallet for the requested service.
     */
    @JsonProperty("WithdrawableAmount")
    private Double withdrawableAmount;

    /**
     * The recurrence pattern that defines when the wallet will be automatically refilled.
     */
    @JsonProperty("WalletRefillSchedule")
    private String walletRefillSchedule;

    /**
     * Indicates whether the wallet information request is still being processed
     */
    @JsonProperty("IsProcessing")
    private boolean isProcessing;

    /**
     * Specifies the category of the wallet returned in the response
     */
    @JsonProperty("WalletType")
    private WalletType walletType;

    /**
     * A collection of wallet holder records associated with the requested service.
     */
    @JsonProperty("WalletHolders")
    private List<WalletHolder> walletHolders;

    /**
     * The name of the reference type that categorizes the wallet (e.g., "Customer", "Merchant").
     */
    @JsonProperty("ReferenceTypeName")
    private String referenceTypeName;

    /**
     * The display name of the wallet’s type returned by the service.
     */
    @JsonProperty("WalletTypeName")
    private String walletTypeName;

    /**
     * The display name of the wallet combination type associated with the wallet.
     */
    @JsonProperty("WalletCombinationTypeName")
    private String walletCombinationTypeName;

    /**
     * A textual description of the wallet associated with the service
     */
    @JsonProperty("WalletDescription")
    private String walletDescription;

    /**
     * Indicates whether the wallet feature is currently active for the requested service.
     */
    @JsonProperty("WalletFeatureIsActive")
    private boolean walletFeatureIsActive;


    
    public Wallet() {
    }

    
    public Wallet(String walletId, ReferenceType referenceType, String referenceId, Double balance, Double withdrawableAmount, String walletRefillSchedule, boolean isProcessing, WalletType walletType, List<WalletHolder> walletHolders, String referenceTypeName, String walletTypeName, String walletCombinationTypeName, String walletDescription, boolean walletFeatureIsActive) {
        this.walletId = walletId;
        this.referenceType = referenceType;
        this.referenceId = referenceId;
        this.balance = balance;
        this.withdrawableAmount = withdrawableAmount;
        this.walletRefillSchedule = walletRefillSchedule;
        this.isProcessing = isProcessing;
        this.walletType = walletType;
        this.walletHolders = walletHolders;
        this.referenceTypeName = referenceTypeName;
        this.walletTypeName = walletTypeName;
        this.walletCombinationTypeName = walletCombinationTypeName;
        this.walletDescription = walletDescription;
        this.walletFeatureIsActive = walletFeatureIsActive;
    }
    
    

    
    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public ReferenceType getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(ReferenceType referenceType) {
        this.referenceType = referenceType;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawableAmount() {
        return withdrawableAmount;
    }

    public void setWithdrawableAmount(Double withdrawableAmount) {
        this.withdrawableAmount = withdrawableAmount;
    }

    public String getWalletRefillSchedule() {
        return walletRefillSchedule;
    }

    public void setWalletRefillSchedule(String walletRefillSchedule) {
        this.walletRefillSchedule = walletRefillSchedule;
    }

    public boolean getIsProcessing() {
        return isProcessing;
    }

    public void setIsProcessing(boolean isProcessing) {
        this.isProcessing = isProcessing;
    }

    public WalletType getWalletType() {
        return walletType;
    }

    public void setWalletType(WalletType walletType) {
        this.walletType = walletType;
    }

    public List<WalletHolder> getWalletHolders() {
        return walletHolders;
    }

    public void setWalletHolders(List<WalletHolder> walletHolders) {
        this.walletHolders = walletHolders;
    }

    public String getReferenceTypeName() {
        return referenceTypeName;
    }

    public void setReferenceTypeName(String referenceTypeName) {
        this.referenceTypeName = referenceTypeName;
    }

    public String getWalletTypeName() {
        return walletTypeName;
    }

    public void setWalletTypeName(String walletTypeName) {
        this.walletTypeName = walletTypeName;
    }

    public String getWalletCombinationTypeName() {
        return walletCombinationTypeName;
    }

    public void setWalletCombinationTypeName(String walletCombinationTypeName) {
        this.walletCombinationTypeName = walletCombinationTypeName;
    }

    public String getWalletDescription() {
        return walletDescription;
    }

    public void setWalletDescription(String walletDescription) {
        this.walletDescription = walletDescription;
    }

    public boolean getWalletFeatureIsActive() {
        return walletFeatureIsActive;
    }

    public void setWalletFeatureIsActive(boolean walletFeatureIsActive) {
        this.walletFeatureIsActive = walletFeatureIsActive;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wallet that = (Wallet) o;
        return Objects.equals(walletId, that.walletId) && Objects.equals(referenceType, that.referenceType) && Objects.equals(referenceId, that.referenceId) && Objects.equals(balance, that.balance) && Objects.equals(withdrawableAmount, that.withdrawableAmount) && Objects.equals(walletRefillSchedule, that.walletRefillSchedule) && Objects.equals(isProcessing, that.isProcessing) && Objects.equals(walletType, that.walletType) && Objects.equals(walletHolders, that.walletHolders) && Objects.equals(referenceTypeName, that.referenceTypeName) && Objects.equals(walletTypeName, that.walletTypeName) && Objects.equals(walletCombinationTypeName, that.walletCombinationTypeName) && Objects.equals(walletDescription, that.walletDescription) && Objects.equals(walletFeatureIsActive, that.walletFeatureIsActive) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(walletId, referenceType, referenceId, balance, withdrawableAmount, walletRefillSchedule, isProcessing, walletType, walletHolders, referenceTypeName, walletTypeName, walletCombinationTypeName, walletDescription, walletFeatureIsActive);
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "walletId='" + walletId + '\'' +
                ", referenceType='" + referenceType + '\'' +
                ", referenceId='" + referenceId + '\'' +
                ", balance='" + balance + '\'' +
                ", withdrawableAmount='" + withdrawableAmount + '\'' +
                ", walletRefillSchedule='" + walletRefillSchedule + '\'' +
                ", isProcessing='" + isProcessing + '\'' +
                ", walletType='" + walletType + '\'' +
                ", walletHolders='" + walletHolders + '\'' +
                ", referenceTypeName='" + referenceTypeName + '\'' +
                ", walletTypeName='" + walletTypeName + '\'' +
                ", walletCombinationTypeName='" + walletCombinationTypeName + '\'' +
                ", walletDescription='" + walletDescription + '\'' +
                ", walletFeatureIsActive='" + walletFeatureIsActive + '\'' +

                '}';
    }
}