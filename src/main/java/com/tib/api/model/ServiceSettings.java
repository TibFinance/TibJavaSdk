
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


public class ServiceSettings   {

    
    /**
     * Maximum monetary amount that can be collected for the service request.
     */
    @JsonProperty("CollectionLimit")
    private Double collectionLimit;

    /**
     * The maximum total amount that can be collected for the service each day.
     */
    @JsonProperty("CollectionLimitDaily")
    private Double collectionLimitDaily;

    /**
     * Maximum deposit amount allowed for the requested service.
     */
    @JsonProperty("DepositLimit")
    private Double depositLimit;

    /**
     * The maximum total amount a user may deposit in a single day.
     */
    @JsonProperty("DepositLimitDaily")
    private Double depositLimitDaily;

    /**
     * The amount of buffer reserved to cover service execution delays.
     */
    @JsonProperty("DelayBufferAmount")
    private Double delayBufferAmount;

    /**
     * The remaining monetary amount available for the requested service.
     */
    @JsonProperty("RemainingAmount")
    private Double remainingAmount;

    /**
     * Current available balance of the wallet in the account's base currency.
     */
    @JsonProperty("WalletBalance")
    private Double walletBalance;

    /**
     * Indicates whether the wallet feature is enabled for the requested service.
     */
    @JsonProperty("IsWalletFeatureActive")
    private boolean isWalletFeatureActive;

    /**
     * Wallet withdrawal mode, as the numeric value of WalletTypeEnum: 1 = Schedule (withdrawals run on a set schedule), 2 = Manual (withdrawals require an explicit request), 3 = Automatic (withdrawals run automatically when the threshold is reached).
     */
    @JsonProperty("WalletType")
    private Integer walletType;

    /**
     * The reserved cash buffer amount used to cover potential non‑sufficient‑funds (NSF) exposures.
     */
    @JsonProperty("NsfBuffer")
    private Double nsfBuffer;

    /**
     * Maximum total amount that can be collected from a single bank account in one day.
     */
    @JsonProperty("CollectionLimitPerBankAccountDaily")
    private Double collectionLimitPerBankAccountDaily;

    /**
     * Maximum monetary amount that can be collected from a single bank account during a delay period.
     */
    @JsonProperty("CollectionLimitPerBankAccountPerDelays")
    private Double collectionLimitPerBankAccountPerDelays;

    /**
     * Maximum number of hours to delay further collection attempts after reaching the per‑bank‑account collection limit.
     */
    @JsonProperty("CollectionLimitPerBankAccountHoursDelays")
    private Integer collectionLimitPerBankAccountHoursDelays;

    /**
     * Maximum monetary threshold for aggregating client warnings in the service response.
     */
    @JsonProperty("ClientWarningCollectionLimit")
    private Double clientWarningCollectionLimit;

    /**
     * Maximum number of collection transactions allowed per bank account each day.
     */
    @JsonProperty("NumberOfCollectionPerBankAccountDaily")
    private Integer numberOfCollectionPerBankAccountDaily;

    /**
     * The total count of collection attempts scheduled for each bank within a given delay interval.
     */
    @JsonProperty("NumberOfCollectionPerBankPerDelays")
    private Integer numberOfCollectionPerBankPerDelays;

    /**
     * Maximum total amount that can be deposited to a single bank account in one day.
     */
    @JsonProperty("DepositLimitPerBankAccountDaily")
    private Double depositLimitPerBankAccountDaily;

    /**
     * Maximum total deposit amount allowed for a single bank account within the configured delay interval.
     */
    @JsonProperty("DepositLimitPerBankAccountPerDelays")
    private Double depositLimitPerBankAccountPerDelays;

    /**
     * The number of hours a user must wait before making another deposit to the same bank account.
     */
    @JsonProperty("DepositLimitPerBankAccountHoursDelays")
    private Integer depositLimitPerBankAccountHoursDelays;

    /**
     * The deposit amount threshold that triggers a client warning.
     */
    @JsonProperty("ClientWarningDepositLimit")
    private Double clientWarningDepositLimit;

    /**
     * The total count of deposit transactions made on a bank account during the current day.
     */
    @JsonProperty("NumberOfDepositPerBankAccountDaily")
    private Integer numberOfDepositPerBankAccountDaily;

    /**
     * The total count of deposit transactions for each bank within the specified delay intervals.
     */
    @JsonProperty("NumberOfDepositPerBankPerDelays")
    private Integer numberOfDepositPerBankPerDelays;

    /**
     * Number of days the platform waits before depositing funds into the merchant's account
     */
    @JsonProperty("MerchantAccountDepositDelay")
    private Integer merchantAccountDepositDelay;

    /**
     * Allowlist of the payment methods permitted for collections on this service, as an AutorizedPaymentMethodFlags bitmask (CreditCard = 1, DirectAccount = 2, Interac = 16). A value of 0 means no restriction; any other value permits only the rails whose bits are set, and a collection on any other rail is refused.
     */
    @JsonProperty("CollectAllowedPaymentMethods")
    private Integer collectAllowedPaymentMethods;

    /**
     * Allowlist of the payment methods permitted for deposits on this service, as an AutorizedPaymentMethodFlags bitmask (DirectAccount = 2, Interac = 16). A value of 0 means no restriction. Credit card is never valid for deposits.
     */
    @JsonProperty("DepositAllowedPaymentMethods")
    private Integer depositAllowedPaymentMethods;

    /**
     * Whether free deposits are blocked for this service. When true, free deposit operations on this service are refused. This applies regardless of the payment method used.
     */
    @JsonProperty("DenyFreeDeposits")
    private boolean denyFreeDeposits;

    /**
     * Whether supplier payments are blocked for this service. When true, supplier transfers paid by merchants of this service are refused.
     */
    @JsonProperty("DenySupplierPayments")
    private boolean denySupplierPayments;


    
    public ServiceSettings() {
    }

    
    public ServiceSettings(Double collectionLimit, Double collectionLimitDaily, Double depositLimit, Double depositLimitDaily, Double delayBufferAmount, Double remainingAmount, Double walletBalance, boolean isWalletFeatureActive, Integer walletType, Double nsfBuffer, Double collectionLimitPerBankAccountDaily, Double collectionLimitPerBankAccountPerDelays, Integer collectionLimitPerBankAccountHoursDelays, Double clientWarningCollectionLimit, Integer numberOfCollectionPerBankAccountDaily, Integer numberOfCollectionPerBankPerDelays, Double depositLimitPerBankAccountDaily, Double depositLimitPerBankAccountPerDelays, Integer depositLimitPerBankAccountHoursDelays, Double clientWarningDepositLimit, Integer numberOfDepositPerBankAccountDaily, Integer numberOfDepositPerBankPerDelays, Integer merchantAccountDepositDelay, Integer collectAllowedPaymentMethods, Integer depositAllowedPaymentMethods, boolean denyFreeDeposits, boolean denySupplierPayments) {
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
        this.merchantAccountDepositDelay = merchantAccountDepositDelay;
        this.collectAllowedPaymentMethods = collectAllowedPaymentMethods;
        this.depositAllowedPaymentMethods = depositAllowedPaymentMethods;
        this.denyFreeDeposits = denyFreeDeposits;
        this.denySupplierPayments = denySupplierPayments;
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

    public Integer getMerchantAccountDepositDelay() {
        return merchantAccountDepositDelay;
    }

    public void setMerchantAccountDepositDelay(Integer merchantAccountDepositDelay) {
        this.merchantAccountDepositDelay = merchantAccountDepositDelay;
    }

    public Integer getCollectAllowedPaymentMethods() {
        return collectAllowedPaymentMethods;
    }

    public void setCollectAllowedPaymentMethods(Integer collectAllowedPaymentMethods) {
        this.collectAllowedPaymentMethods = collectAllowedPaymentMethods;
    }

    public Integer getDepositAllowedPaymentMethods() {
        return depositAllowedPaymentMethods;
    }

    public void setDepositAllowedPaymentMethods(Integer depositAllowedPaymentMethods) {
        this.depositAllowedPaymentMethods = depositAllowedPaymentMethods;
    }

    public boolean getDenyFreeDeposits() {
        return denyFreeDeposits;
    }

    public void setDenyFreeDeposits(boolean denyFreeDeposits) {
        this.denyFreeDeposits = denyFreeDeposits;
    }

    public boolean getDenySupplierPayments() {
        return denySupplierPayments;
    }

    public void setDenySupplierPayments(boolean denySupplierPayments) {
        this.denySupplierPayments = denySupplierPayments;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceSettings that = (ServiceSettings) o;
        return Objects.equals(collectionLimit, that.collectionLimit) && Objects.equals(collectionLimitDaily, that.collectionLimitDaily) && Objects.equals(depositLimit, that.depositLimit) && Objects.equals(depositLimitDaily, that.depositLimitDaily) && Objects.equals(delayBufferAmount, that.delayBufferAmount) && Objects.equals(remainingAmount, that.remainingAmount) && Objects.equals(walletBalance, that.walletBalance) && Objects.equals(isWalletFeatureActive, that.isWalletFeatureActive) && Objects.equals(walletType, that.walletType) && Objects.equals(nsfBuffer, that.nsfBuffer) && Objects.equals(collectionLimitPerBankAccountDaily, that.collectionLimitPerBankAccountDaily) && Objects.equals(collectionLimitPerBankAccountPerDelays, that.collectionLimitPerBankAccountPerDelays) && Objects.equals(collectionLimitPerBankAccountHoursDelays, that.collectionLimitPerBankAccountHoursDelays) && Objects.equals(clientWarningCollectionLimit, that.clientWarningCollectionLimit) && Objects.equals(numberOfCollectionPerBankAccountDaily, that.numberOfCollectionPerBankAccountDaily) && Objects.equals(numberOfCollectionPerBankPerDelays, that.numberOfCollectionPerBankPerDelays) && Objects.equals(depositLimitPerBankAccountDaily, that.depositLimitPerBankAccountDaily) && Objects.equals(depositLimitPerBankAccountPerDelays, that.depositLimitPerBankAccountPerDelays) && Objects.equals(depositLimitPerBankAccountHoursDelays, that.depositLimitPerBankAccountHoursDelays) && Objects.equals(clientWarningDepositLimit, that.clientWarningDepositLimit) && Objects.equals(numberOfDepositPerBankAccountDaily, that.numberOfDepositPerBankAccountDaily) && Objects.equals(numberOfDepositPerBankPerDelays, that.numberOfDepositPerBankPerDelays) && Objects.equals(merchantAccountDepositDelay, that.merchantAccountDepositDelay) && Objects.equals(collectAllowedPaymentMethods, that.collectAllowedPaymentMethods) && Objects.equals(depositAllowedPaymentMethods, that.depositAllowedPaymentMethods) && Objects.equals(denyFreeDeposits, that.denyFreeDeposits) && Objects.equals(denySupplierPayments, that.denySupplierPayments) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(collectionLimit, collectionLimitDaily, depositLimit, depositLimitDaily, delayBufferAmount, remainingAmount, walletBalance, isWalletFeatureActive, walletType, nsfBuffer, collectionLimitPerBankAccountDaily, collectionLimitPerBankAccountPerDelays, collectionLimitPerBankAccountHoursDelays, clientWarningCollectionLimit, numberOfCollectionPerBankAccountDaily, numberOfCollectionPerBankPerDelays, depositLimitPerBankAccountDaily, depositLimitPerBankAccountPerDelays, depositLimitPerBankAccountHoursDelays, clientWarningDepositLimit, numberOfDepositPerBankAccountDaily, numberOfDepositPerBankPerDelays, merchantAccountDepositDelay, collectAllowedPaymentMethods, depositAllowedPaymentMethods, denyFreeDeposits, denySupplierPayments);
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
                ", merchantAccountDepositDelay='" + merchantAccountDepositDelay + '\'' +
                ", collectAllowedPaymentMethods='" + collectAllowedPaymentMethods + '\'' +
                ", depositAllowedPaymentMethods='" + depositAllowedPaymentMethods + '\'' +
                ", denyFreeDeposits='" + denyFreeDeposits + '\'' +
                ", denySupplierPayments='" + denySupplierPayments + '\'' +

                '}';
    }
}