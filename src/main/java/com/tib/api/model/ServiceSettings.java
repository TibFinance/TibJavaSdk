
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


public class ServiceSettings   {

    
    /**
     * Retrieves or assigns the monetary collection limit associated with a service contract. This limit defines the maximum amount that can be collected in a single operation and is expressed in the merchant's currency.
     */
    @JsonProperty("CollectionLimit")
    private Double collectionLimit;

    /**
     * Gets or sets the daily collection limit applied to the service contract.
     */
    @JsonProperty("CollectionLimitDaily")
    private Double collectionLimitDaily;

    /**
     * Gets or sets the deposit limit for the service contract, expressed as a decimal amount.
     */
    @JsonProperty("DepositLimit")
    private Double depositLimit;

    /**
     * Gets or sets the maximum amount that can be deposited in a single day for the client’s service contract.
     */
    @JsonProperty("DepositLimitDaily")
    private Double depositLimitDaily;

    /**
     * Gets or sets the delay buffer amount used to define the monetary buffer applied to transaction timing delays.
     */
    @JsonProperty("DelayBufferAmount")
    private Double delayBufferAmount;

    /**
     * Gets or sets the remaining monetary amount for the current transaction or operation, expressed as a decimal value.
     */
    @JsonProperty("RemainingAmount")
    private Double remainingAmount;

    /**
     * Gets or sets the current wallet balance for the client.
     */
    @JsonProperty("WalletBalance")
    private Double walletBalance;

    /**
     * Indicates whether the wallet feature is enabled for the client.
     */
    @JsonProperty("IsWalletFeatureActive")
    private boolean isWalletFeatureActive;

    /**
     * Gets or sets the wallet type identifier used by the TIB Finance API to select the appropriate wallet configuration.
     */
    @JsonProperty("WalletType")
    private Integer walletType;

    /**
     * Gets or sets the NSF (Non‑Sufficient Funds) buffer amount applied to transactions.
     */
    @JsonProperty("NsfBuffer")
    private Double nsfBuffer;

    /**
     * Retrieves or assigns the maximum amount that can be collected from a single bank account in one calendar day.
     */
    @JsonProperty("CollectionLimitPerBankAccountDaily")
    private Double collectionLimitPerBankAccountDaily;

    /**
     * Gets or sets the maximum collection amount allowed for a specific bank account during a given delay interval.
     */
    @JsonProperty("CollectionLimitPerBankAccountPerDelays")
    private Double collectionLimitPerBankAccountPerDelays;

    /**
     * Gets or sets the maximum number of hours that a collection operation may be delayed for a specific bank account.
     */
    @JsonProperty("CollectionLimitPerBankAccountHoursDelays")
    private Integer collectionLimitPerBankAccountHoursDelays;

    /**
     * Gets or sets the warning collection limit for a client. This limit defines the monetary threshold at which the system raises a warning for client collection activities.
     */
    @JsonProperty("ClientWarningCollectionLimit")
    private Double clientWarningCollectionLimit;

    /**
     * Gets or sets the maximum number of collection transactions that can be processed per bank account each day.
     */
    @JsonProperty("NumberOfCollectionPerBankAccountDaily")
    private Integer numberOfCollectionPerBankAccountDaily;

    /**
     * Gets or sets the maximum number of collection attempts allowed for a specific bank within a single delay interval.
     */
    @JsonProperty("NumberOfCollectionPerBankPerDelays")
    private Integer numberOfCollectionPerBankPerDelays;

    /**
     * Gets or sets the maximum total amount that can be deposited to a single bank account per day.
     */
    @JsonProperty("DepositLimitPerBankAccountDaily")
    private Double depositLimitPerBankAccountDaily;

    /**
     * Gets or sets the maximum deposit amount allowed for a single bank account within a defined delay interval.
     */
    @JsonProperty("DepositLimitPerBankAccountPerDelays")
    private Double depositLimitPerBankAccountPerDelays;

    /**
     * Gets or sets the number of hour delays applied to the deposit limit for a specific bank account.
     */
    @JsonProperty("DepositLimitPerBankAccountHoursDelays")
    private Integer depositLimitPerBankAccountHoursDelays;

    /**
     * Retrieves or updates the warning deposit limit configured for a client.
     */
    @JsonProperty("ClientWarningDepositLimit")
    private Double clientWarningDepositLimit;

    /**
     * Gets or sets the maximum number of deposit transactions that can be performed per bank account each day.
     */
    @JsonProperty("NumberOfDepositPerBankAccountDaily")
    private Integer numberOfDepositPerBankAccountDaily;

    /**
     * Gets or sets the maximum number of deposit attempts allowed for a specific bank during a defined delay interval.
     */
    @JsonProperty("NumberOfDepositPerBankPerDelays")
    private Integer numberOfDepositPerBankPerDelays;

    /**
     * Retrieves or updates the warning collection limit applied to TIB operations. This limit defines the threshold at which a warning is triggered for collection activities.
     */
    @JsonProperty("TIBWarningCollectionLimit")
    private Double tIBWarningCollectionLimit;

    /**
     * Gets or sets the daily warning collection limit for a bank account.
     */
    @JsonProperty("TIBWarningCollectionLimitPerBankAccountDaily")
    private Double tIBWarningCollectionLimitPerBankAccountDaily;

    /**
     * Gets or sets the warning collection limit applied to a bank account for each delay interval.
     */
    @JsonProperty("TIBWarningCollectionLimitPerBankAccountPerDelays")
    private Double tIBWarningCollectionLimitPerBankAccountPerDelays;

    /**
     * Gets or sets the daily collection warning limit for a bank account.
     */
    @JsonProperty("TIBWarningNumberOfCollectionPerBankAccountDaily")
    private Integer tIBWarningNumberOfCollectionPerBankAccountDaily;

    /**
     * Gets or sets the warning threshold that defines the maximum number of collection attempts allowed for a single bank within a delay interval.
     */
    @JsonProperty("TIBWarningNumberOfCollectionPerBankPerDelays")
    private Integer tIBWarningNumberOfCollectionPerBankPerDelays;

    /**
     * Gets or sets the daily warning collection limit for TIB services.
     */
    @JsonProperty("TIBWarningCollectionLimitDaily")
    private Double tIBWarningCollectionLimitDaily;

    /**
     * Gets or sets the warning deposit limit for the TIB service. The limit defines the maximum deposit amount that triggers a warning in the system.
     */
    @JsonProperty("TIBWarningDepositLimit")
    private Double tIBWarningDepositLimit;

    /**
     * Gets or sets the daily warning deposit limit applied to each bank account.
     */
    @JsonProperty("TIBWarningDepositLimitPerBankAccountDaily")
    private Double tIBWarningDepositLimitPerBankAccountDaily;

    /**
     * Gets or sets the warning deposit limit applied to each bank account for a specific delay interval.
     */
    @JsonProperty("TIBWarningDepositLimitPerBankAccountPerDelays")
    private Double tIBWarningDepositLimitPerBankAccountPerDelays;

    /**
     * Gets or sets the daily warning threshold for the number of deposits allowed on a single bank account.
     */
    @JsonProperty("TIBWarningNumberOfDepositPerBankAccountDaily")
    private Integer tIBWarningNumberOfDepositPerBankAccountDaily;

    /**
     * Gets or sets the warning threshold that defines how many deposits a bank may process within the configured delay period.
     */
    @JsonProperty("TIBWarningNumberOfDepositPerBankPerDelays")
    private Integer tIBWarningNumberOfDepositPerBankPerDelays;

    /**
     * Gets or sets the daily warning limit for deposits in the TIB Finance system. This limit triggers warning notifications when a deposit exceeds the configured daily threshold.
     */
    @JsonProperty("TIBWarningDepositLimitDaily")
    private Double tIBWarningDepositLimitDaily;

    /**
     * Gets or sets the number of days the system waits before depositing funds into the merchant's bank account.
     */
    @JsonProperty("MerchantAccountDepositDelay")
    private Integer merchantAccountDepositDelay;

    /**
     * 
     */
    @JsonProperty("DataContext")
    private Integer dataContext;


    
    public ServiceSettings() {
    }

    
    public ServiceSettings(Double collectionLimit, Double collectionLimitDaily, Double depositLimit, Double depositLimitDaily, Double delayBufferAmount, Double remainingAmount, Double walletBalance, boolean isWalletFeatureActive, Integer walletType, Double nsfBuffer, Double collectionLimitPerBankAccountDaily, Double collectionLimitPerBankAccountPerDelays, Integer collectionLimitPerBankAccountHoursDelays, Double clientWarningCollectionLimit, Integer numberOfCollectionPerBankAccountDaily, Integer numberOfCollectionPerBankPerDelays, Double depositLimitPerBankAccountDaily, Double depositLimitPerBankAccountPerDelays, Integer depositLimitPerBankAccountHoursDelays, Double clientWarningDepositLimit, Integer numberOfDepositPerBankAccountDaily, Integer numberOfDepositPerBankPerDelays, Double tIBWarningCollectionLimit, Double tIBWarningCollectionLimitPerBankAccountDaily, Double tIBWarningCollectionLimitPerBankAccountPerDelays, Integer tIBWarningNumberOfCollectionPerBankAccountDaily, Integer tIBWarningNumberOfCollectionPerBankPerDelays, Double tIBWarningCollectionLimitDaily, Double tIBWarningDepositLimit, Double tIBWarningDepositLimitPerBankAccountDaily, Double tIBWarningDepositLimitPerBankAccountPerDelays, Integer tIBWarningNumberOfDepositPerBankAccountDaily, Integer tIBWarningNumberOfDepositPerBankPerDelays, Double tIBWarningDepositLimitDaily, Integer merchantAccountDepositDelay, Integer dataContext) {
        this.collectionLimit = collectionLimit;
        this.collectionLimitDaily = collectionLimitDaily;
        this.depositLimit = depositLimit;
        this.depositLimitDaily = depositLimitDaily;
        this.delayBufferAmount = delayBufferAmount;
        this.remainingAmount = remainingAmount;
        this.walletBalance = walletBalance;
        this.isWalletFeatureActive = isWalletFeatureActive;
        this.walletType = walletType;
        this.nsfBuffer = nsfBuffer;
        this.collectionLimitPerBankAccountDaily = collectionLimitPerBankAccountDaily;
        this.collectionLimitPerBankAccountPerDelays = collectionLimitPerBankAccountPerDelays;
        this.collectionLimitPerBankAccountHoursDelays = collectionLimitPerBankAccountHoursDelays;
        this.clientWarningCollectionLimit = clientWarningCollectionLimit;
        this.numberOfCollectionPerBankAccountDaily = numberOfCollectionPerBankAccountDaily;
        this.numberOfCollectionPerBankPerDelays = numberOfCollectionPerBankPerDelays;
        this.depositLimitPerBankAccountDaily = depositLimitPerBankAccountDaily;
        this.depositLimitPerBankAccountPerDelays = depositLimitPerBankAccountPerDelays;
        this.depositLimitPerBankAccountHoursDelays = depositLimitPerBankAccountHoursDelays;
        this.clientWarningDepositLimit = clientWarningDepositLimit;
        this.numberOfDepositPerBankAccountDaily = numberOfDepositPerBankAccountDaily;
        this.numberOfDepositPerBankPerDelays = numberOfDepositPerBankPerDelays;
        this.tIBWarningCollectionLimit = tIBWarningCollectionLimit;
        this.tIBWarningCollectionLimitPerBankAccountDaily = tIBWarningCollectionLimitPerBankAccountDaily;
        this.tIBWarningCollectionLimitPerBankAccountPerDelays = tIBWarningCollectionLimitPerBankAccountPerDelays;
        this.tIBWarningNumberOfCollectionPerBankAccountDaily = tIBWarningNumberOfCollectionPerBankAccountDaily;
        this.tIBWarningNumberOfCollectionPerBankPerDelays = tIBWarningNumberOfCollectionPerBankPerDelays;
        this.tIBWarningCollectionLimitDaily = tIBWarningCollectionLimitDaily;
        this.tIBWarningDepositLimit = tIBWarningDepositLimit;
        this.tIBWarningDepositLimitPerBankAccountDaily = tIBWarningDepositLimitPerBankAccountDaily;
        this.tIBWarningDepositLimitPerBankAccountPerDelays = tIBWarningDepositLimitPerBankAccountPerDelays;
        this.tIBWarningNumberOfDepositPerBankAccountDaily = tIBWarningNumberOfDepositPerBankAccountDaily;
        this.tIBWarningNumberOfDepositPerBankPerDelays = tIBWarningNumberOfDepositPerBankPerDelays;
        this.tIBWarningDepositLimitDaily = tIBWarningDepositLimitDaily;
        this.merchantAccountDepositDelay = merchantAccountDepositDelay;
        this.dataContext = dataContext;
    }
    
    

    
    public Double getCollectionLimit() {
        return collectionLimit;
    }

    public void setCollectionLimit(Double collectionLimit) {
        this.collectionLimit = collectionLimit;
    }

    public Double getCollectionLimitDaily() {
        return collectionLimitDaily;
    }

    public void setCollectionLimitDaily(Double collectionLimitDaily) {
        this.collectionLimitDaily = collectionLimitDaily;
    }

    public Double getDepositLimit() {
        return depositLimit;
    }

    public void setDepositLimit(Double depositLimit) {
        this.depositLimit = depositLimit;
    }

    public Double getDepositLimitDaily() {
        return depositLimitDaily;
    }

    public void setDepositLimitDaily(Double depositLimitDaily) {
        this.depositLimitDaily = depositLimitDaily;
    }

    public Double getDelayBufferAmount() {
        return delayBufferAmount;
    }

    public void setDelayBufferAmount(Double delayBufferAmount) {
        this.delayBufferAmount = delayBufferAmount;
    }

    public Double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(Double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public Double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(Double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public boolean getIsWalletFeatureActive() {
        return isWalletFeatureActive;
    }

    public void setIsWalletFeatureActive(boolean isWalletFeatureActive) {
        this.isWalletFeatureActive = isWalletFeatureActive;
    }

    public Integer getWalletType() {
        return walletType;
    }

    public void setWalletType(Integer walletType) {
        this.walletType = walletType;
    }

    public Double getNsfBuffer() {
        return nsfBuffer;
    }

    public void setNsfBuffer(Double nsfBuffer) {
        this.nsfBuffer = nsfBuffer;
    }

    public Double getCollectionLimitPerBankAccountDaily() {
        return collectionLimitPerBankAccountDaily;
    }

    public void setCollectionLimitPerBankAccountDaily(Double collectionLimitPerBankAccountDaily) {
        this.collectionLimitPerBankAccountDaily = collectionLimitPerBankAccountDaily;
    }

    public Double getCollectionLimitPerBankAccountPerDelays() {
        return collectionLimitPerBankAccountPerDelays;
    }

    public void setCollectionLimitPerBankAccountPerDelays(Double collectionLimitPerBankAccountPerDelays) {
        this.collectionLimitPerBankAccountPerDelays = collectionLimitPerBankAccountPerDelays;
    }

    public Integer getCollectionLimitPerBankAccountHoursDelays() {
        return collectionLimitPerBankAccountHoursDelays;
    }

    public void setCollectionLimitPerBankAccountHoursDelays(Integer collectionLimitPerBankAccountHoursDelays) {
        this.collectionLimitPerBankAccountHoursDelays = collectionLimitPerBankAccountHoursDelays;
    }

    public Double getClientWarningCollectionLimit() {
        return clientWarningCollectionLimit;
    }

    public void setClientWarningCollectionLimit(Double clientWarningCollectionLimit) {
        this.clientWarningCollectionLimit = clientWarningCollectionLimit;
    }

    public Integer getNumberOfCollectionPerBankAccountDaily() {
        return numberOfCollectionPerBankAccountDaily;
    }

    public void setNumberOfCollectionPerBankAccountDaily(Integer numberOfCollectionPerBankAccountDaily) {
        this.numberOfCollectionPerBankAccountDaily = numberOfCollectionPerBankAccountDaily;
    }

    public Integer getNumberOfCollectionPerBankPerDelays() {
        return numberOfCollectionPerBankPerDelays;
    }

    public void setNumberOfCollectionPerBankPerDelays(Integer numberOfCollectionPerBankPerDelays) {
        this.numberOfCollectionPerBankPerDelays = numberOfCollectionPerBankPerDelays;
    }

    public Double getDepositLimitPerBankAccountDaily() {
        return depositLimitPerBankAccountDaily;
    }

    public void setDepositLimitPerBankAccountDaily(Double depositLimitPerBankAccountDaily) {
        this.depositLimitPerBankAccountDaily = depositLimitPerBankAccountDaily;
    }

    public Double getDepositLimitPerBankAccountPerDelays() {
        return depositLimitPerBankAccountPerDelays;
    }

    public void setDepositLimitPerBankAccountPerDelays(Double depositLimitPerBankAccountPerDelays) {
        this.depositLimitPerBankAccountPerDelays = depositLimitPerBankAccountPerDelays;
    }

    public Integer getDepositLimitPerBankAccountHoursDelays() {
        return depositLimitPerBankAccountHoursDelays;
    }

    public void setDepositLimitPerBankAccountHoursDelays(Integer depositLimitPerBankAccountHoursDelays) {
        this.depositLimitPerBankAccountHoursDelays = depositLimitPerBankAccountHoursDelays;
    }

    public Double getClientWarningDepositLimit() {
        return clientWarningDepositLimit;
    }

    public void setClientWarningDepositLimit(Double clientWarningDepositLimit) {
        this.clientWarningDepositLimit = clientWarningDepositLimit;
    }

    public Integer getNumberOfDepositPerBankAccountDaily() {
        return numberOfDepositPerBankAccountDaily;
    }

    public void setNumberOfDepositPerBankAccountDaily(Integer numberOfDepositPerBankAccountDaily) {
        this.numberOfDepositPerBankAccountDaily = numberOfDepositPerBankAccountDaily;
    }

    public Integer getNumberOfDepositPerBankPerDelays() {
        return numberOfDepositPerBankPerDelays;
    }

    public void setNumberOfDepositPerBankPerDelays(Integer numberOfDepositPerBankPerDelays) {
        this.numberOfDepositPerBankPerDelays = numberOfDepositPerBankPerDelays;
    }

    public Double getTIBWarningCollectionLimit() {
        return tIBWarningCollectionLimit;
    }

    public void setTIBWarningCollectionLimit(Double tIBWarningCollectionLimit) {
        this.tIBWarningCollectionLimit = tIBWarningCollectionLimit;
    }

    public Double getTIBWarningCollectionLimitPerBankAccountDaily() {
        return tIBWarningCollectionLimitPerBankAccountDaily;
    }

    public void setTIBWarningCollectionLimitPerBankAccountDaily(Double tIBWarningCollectionLimitPerBankAccountDaily) {
        this.tIBWarningCollectionLimitPerBankAccountDaily = tIBWarningCollectionLimitPerBankAccountDaily;
    }

    public Double getTIBWarningCollectionLimitPerBankAccountPerDelays() {
        return tIBWarningCollectionLimitPerBankAccountPerDelays;
    }

    public void setTIBWarningCollectionLimitPerBankAccountPerDelays(Double tIBWarningCollectionLimitPerBankAccountPerDelays) {
        this.tIBWarningCollectionLimitPerBankAccountPerDelays = tIBWarningCollectionLimitPerBankAccountPerDelays;
    }

    public Integer getTIBWarningNumberOfCollectionPerBankAccountDaily() {
        return tIBWarningNumberOfCollectionPerBankAccountDaily;
    }

    public void setTIBWarningNumberOfCollectionPerBankAccountDaily(Integer tIBWarningNumberOfCollectionPerBankAccountDaily) {
        this.tIBWarningNumberOfCollectionPerBankAccountDaily = tIBWarningNumberOfCollectionPerBankAccountDaily;
    }

    public Integer getTIBWarningNumberOfCollectionPerBankPerDelays() {
        return tIBWarningNumberOfCollectionPerBankPerDelays;
    }

    public void setTIBWarningNumberOfCollectionPerBankPerDelays(Integer tIBWarningNumberOfCollectionPerBankPerDelays) {
        this.tIBWarningNumberOfCollectionPerBankPerDelays = tIBWarningNumberOfCollectionPerBankPerDelays;
    }

    public Double getTIBWarningCollectionLimitDaily() {
        return tIBWarningCollectionLimitDaily;
    }

    public void setTIBWarningCollectionLimitDaily(Double tIBWarningCollectionLimitDaily) {
        this.tIBWarningCollectionLimitDaily = tIBWarningCollectionLimitDaily;
    }

    public Double getTIBWarningDepositLimit() {
        return tIBWarningDepositLimit;
    }

    public void setTIBWarningDepositLimit(Double tIBWarningDepositLimit) {
        this.tIBWarningDepositLimit = tIBWarningDepositLimit;
    }

    public Double getTIBWarningDepositLimitPerBankAccountDaily() {
        return tIBWarningDepositLimitPerBankAccountDaily;
    }

    public void setTIBWarningDepositLimitPerBankAccountDaily(Double tIBWarningDepositLimitPerBankAccountDaily) {
        this.tIBWarningDepositLimitPerBankAccountDaily = tIBWarningDepositLimitPerBankAccountDaily;
    }

    public Double getTIBWarningDepositLimitPerBankAccountPerDelays() {
        return tIBWarningDepositLimitPerBankAccountPerDelays;
    }

    public void setTIBWarningDepositLimitPerBankAccountPerDelays(Double tIBWarningDepositLimitPerBankAccountPerDelays) {
        this.tIBWarningDepositLimitPerBankAccountPerDelays = tIBWarningDepositLimitPerBankAccountPerDelays;
    }

    public Integer getTIBWarningNumberOfDepositPerBankAccountDaily() {
        return tIBWarningNumberOfDepositPerBankAccountDaily;
    }

    public void setTIBWarningNumberOfDepositPerBankAccountDaily(Integer tIBWarningNumberOfDepositPerBankAccountDaily) {
        this.tIBWarningNumberOfDepositPerBankAccountDaily = tIBWarningNumberOfDepositPerBankAccountDaily;
    }

    public Integer getTIBWarningNumberOfDepositPerBankPerDelays() {
        return tIBWarningNumberOfDepositPerBankPerDelays;
    }

    public void setTIBWarningNumberOfDepositPerBankPerDelays(Integer tIBWarningNumberOfDepositPerBankPerDelays) {
        this.tIBWarningNumberOfDepositPerBankPerDelays = tIBWarningNumberOfDepositPerBankPerDelays;
    }

    public Double getTIBWarningDepositLimitDaily() {
        return tIBWarningDepositLimitDaily;
    }

    public void setTIBWarningDepositLimitDaily(Double tIBWarningDepositLimitDaily) {
        this.tIBWarningDepositLimitDaily = tIBWarningDepositLimitDaily;
    }

    public Integer getMerchantAccountDepositDelay() {
        return merchantAccountDepositDelay;
    }

    public void setMerchantAccountDepositDelay(Integer merchantAccountDepositDelay) {
        this.merchantAccountDepositDelay = merchantAccountDepositDelay;
    }

    public Integer getDataContext() {
        return dataContext;
    }

    public void setDataContext(Integer dataContext) {
        this.dataContext = dataContext;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceSettings that = (ServiceSettings) o;
        return Objects.equals(collectionLimit, that.collectionLimit) && Objects.equals(collectionLimitDaily, that.collectionLimitDaily) && Objects.equals(depositLimit, that.depositLimit) && Objects.equals(depositLimitDaily, that.depositLimitDaily) && Objects.equals(delayBufferAmount, that.delayBufferAmount) && Objects.equals(remainingAmount, that.remainingAmount) && Objects.equals(walletBalance, that.walletBalance) && Objects.equals(isWalletFeatureActive, that.isWalletFeatureActive) && Objects.equals(walletType, that.walletType) && Objects.equals(nsfBuffer, that.nsfBuffer) && Objects.equals(collectionLimitPerBankAccountDaily, that.collectionLimitPerBankAccountDaily) && Objects.equals(collectionLimitPerBankAccountPerDelays, that.collectionLimitPerBankAccountPerDelays) && Objects.equals(collectionLimitPerBankAccountHoursDelays, that.collectionLimitPerBankAccountHoursDelays) && Objects.equals(clientWarningCollectionLimit, that.clientWarningCollectionLimit) && Objects.equals(numberOfCollectionPerBankAccountDaily, that.numberOfCollectionPerBankAccountDaily) && Objects.equals(numberOfCollectionPerBankPerDelays, that.numberOfCollectionPerBankPerDelays) && Objects.equals(depositLimitPerBankAccountDaily, that.depositLimitPerBankAccountDaily) && Objects.equals(depositLimitPerBankAccountPerDelays, that.depositLimitPerBankAccountPerDelays) && Objects.equals(depositLimitPerBankAccountHoursDelays, that.depositLimitPerBankAccountHoursDelays) && Objects.equals(clientWarningDepositLimit, that.clientWarningDepositLimit) && Objects.equals(numberOfDepositPerBankAccountDaily, that.numberOfDepositPerBankAccountDaily) && Objects.equals(numberOfDepositPerBankPerDelays, that.numberOfDepositPerBankPerDelays) && Objects.equals(tIBWarningCollectionLimit, that.tIBWarningCollectionLimit) && Objects.equals(tIBWarningCollectionLimitPerBankAccountDaily, that.tIBWarningCollectionLimitPerBankAccountDaily) && Objects.equals(tIBWarningCollectionLimitPerBankAccountPerDelays, that.tIBWarningCollectionLimitPerBankAccountPerDelays) && Objects.equals(tIBWarningNumberOfCollectionPerBankAccountDaily, that.tIBWarningNumberOfCollectionPerBankAccountDaily) && Objects.equals(tIBWarningNumberOfCollectionPerBankPerDelays, that.tIBWarningNumberOfCollectionPerBankPerDelays) && Objects.equals(tIBWarningCollectionLimitDaily, that.tIBWarningCollectionLimitDaily) && Objects.equals(tIBWarningDepositLimit, that.tIBWarningDepositLimit) && Objects.equals(tIBWarningDepositLimitPerBankAccountDaily, that.tIBWarningDepositLimitPerBankAccountDaily) && Objects.equals(tIBWarningDepositLimitPerBankAccountPerDelays, that.tIBWarningDepositLimitPerBankAccountPerDelays) && Objects.equals(tIBWarningNumberOfDepositPerBankAccountDaily, that.tIBWarningNumberOfDepositPerBankAccountDaily) && Objects.equals(tIBWarningNumberOfDepositPerBankPerDelays, that.tIBWarningNumberOfDepositPerBankPerDelays) && Objects.equals(tIBWarningDepositLimitDaily, that.tIBWarningDepositLimitDaily) && Objects.equals(merchantAccountDepositDelay, that.merchantAccountDepositDelay) && Objects.equals(dataContext, that.dataContext) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(collectionLimit, collectionLimitDaily, depositLimit, depositLimitDaily, delayBufferAmount, remainingAmount, walletBalance, isWalletFeatureActive, walletType, nsfBuffer, collectionLimitPerBankAccountDaily, collectionLimitPerBankAccountPerDelays, collectionLimitPerBankAccountHoursDelays, clientWarningCollectionLimit, numberOfCollectionPerBankAccountDaily, numberOfCollectionPerBankPerDelays, depositLimitPerBankAccountDaily, depositLimitPerBankAccountPerDelays, depositLimitPerBankAccountHoursDelays, clientWarningDepositLimit, numberOfDepositPerBankAccountDaily, numberOfDepositPerBankPerDelays, tIBWarningCollectionLimit, tIBWarningCollectionLimitPerBankAccountDaily, tIBWarningCollectionLimitPerBankAccountPerDelays, tIBWarningNumberOfCollectionPerBankAccountDaily, tIBWarningNumberOfCollectionPerBankPerDelays, tIBWarningCollectionLimitDaily, tIBWarningDepositLimit, tIBWarningDepositLimitPerBankAccountDaily, tIBWarningDepositLimitPerBankAccountPerDelays, tIBWarningNumberOfDepositPerBankAccountDaily, tIBWarningNumberOfDepositPerBankPerDelays, tIBWarningDepositLimitDaily, merchantAccountDepositDelay, dataContext);
    }

    @Override
    public String toString() {
        return "ServiceSettings{" +
                "collectionLimit='" + collectionLimit + '\'' +
                ", collectionLimitDaily='" + collectionLimitDaily + '\'' +
                ", depositLimit='" + depositLimit + '\'' +
                ", depositLimitDaily='" + depositLimitDaily + '\'' +
                ", delayBufferAmount='" + delayBufferAmount + '\'' +
                ", remainingAmount='" + remainingAmount + '\'' +
                ", walletBalance='" + walletBalance + '\'' +
                ", isWalletFeatureActive='" + isWalletFeatureActive + '\'' +
                ", walletType='" + walletType + '\'' +
                ", nsfBuffer='" + nsfBuffer + '\'' +
                ", collectionLimitPerBankAccountDaily='" + collectionLimitPerBankAccountDaily + '\'' +
                ", collectionLimitPerBankAccountPerDelays='" + collectionLimitPerBankAccountPerDelays + '\'' +
                ", collectionLimitPerBankAccountHoursDelays='" + collectionLimitPerBankAccountHoursDelays + '\'' +
                ", clientWarningCollectionLimit='" + clientWarningCollectionLimit + '\'' +
                ", numberOfCollectionPerBankAccountDaily='" + numberOfCollectionPerBankAccountDaily + '\'' +
                ", numberOfCollectionPerBankPerDelays='" + numberOfCollectionPerBankPerDelays + '\'' +
                ", depositLimitPerBankAccountDaily='" + depositLimitPerBankAccountDaily + '\'' +
                ", depositLimitPerBankAccountPerDelays='" + depositLimitPerBankAccountPerDelays + '\'' +
                ", depositLimitPerBankAccountHoursDelays='" + depositLimitPerBankAccountHoursDelays + '\'' +
                ", clientWarningDepositLimit='" + clientWarningDepositLimit + '\'' +
                ", numberOfDepositPerBankAccountDaily='" + numberOfDepositPerBankAccountDaily + '\'' +
                ", numberOfDepositPerBankPerDelays='" + numberOfDepositPerBankPerDelays + '\'' +
                ", tIBWarningCollectionLimit='" + tIBWarningCollectionLimit + '\'' +
                ", tIBWarningCollectionLimitPerBankAccountDaily='" + tIBWarningCollectionLimitPerBankAccountDaily + '\'' +
                ", tIBWarningCollectionLimitPerBankAccountPerDelays='" + tIBWarningCollectionLimitPerBankAccountPerDelays + '\'' +
                ", tIBWarningNumberOfCollectionPerBankAccountDaily='" + tIBWarningNumberOfCollectionPerBankAccountDaily + '\'' +
                ", tIBWarningNumberOfCollectionPerBankPerDelays='" + tIBWarningNumberOfCollectionPerBankPerDelays + '\'' +
                ", tIBWarningCollectionLimitDaily='" + tIBWarningCollectionLimitDaily + '\'' +
                ", tIBWarningDepositLimit='" + tIBWarningDepositLimit + '\'' +
                ", tIBWarningDepositLimitPerBankAccountDaily='" + tIBWarningDepositLimitPerBankAccountDaily + '\'' +
                ", tIBWarningDepositLimitPerBankAccountPerDelays='" + tIBWarningDepositLimitPerBankAccountPerDelays + '\'' +
                ", tIBWarningNumberOfDepositPerBankAccountDaily='" + tIBWarningNumberOfDepositPerBankAccountDaily + '\'' +
                ", tIBWarningNumberOfDepositPerBankPerDelays='" + tIBWarningNumberOfDepositPerBankPerDelays + '\'' +
                ", tIBWarningDepositLimitDaily='" + tIBWarningDepositLimitDaily + '\'' +
                ", merchantAccountDepositDelay='" + merchantAccountDepositDelay + '\'' +
                ", dataContext='" + dataContext + '\'' +

                '}';
    }
}