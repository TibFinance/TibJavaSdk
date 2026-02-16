
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.BankingOperationResult;
import com.tib.api.model.enums.OperationStatus;
import com.tib.api.model.PayoutReportData;
import com.tib.api.model.enums.Currency;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransactionResultEntity  extends TransactionIdentity  {

    
    /**
     * Gets or sets the description associated with a transaction.
     */
    @JsonProperty("TransactionDescription")
    private String transactionDescription;

    /**
     * Gets or sets the result of a banking operation as defined by the BankingOperationResultEnum.
     */
    @JsonProperty("BankingOperationResult")
    private BankingOperationResult bankingOperationResult;

    /**
     * Gets or sets the banking operation description.
     */
    @JsonProperty("BankingOperationDescription")
    private String bankingOperationDescription;

    /**
     * Retrieves the numeric status code of an operation.
     */
    @JsonProperty("OperationStatus")
    private OperationStatus operationStatus;

    /**
     * Gets or sets the real due date.
     */
    @JsonProperty("RealDueDate")
    private LocalDateTime realDueDate;

    /**
     * Gets or sets ProviderTransactionAdditionalInfos.
     */
    @JsonProperty("ProviderTransactionAdditionalInfos")
    private String providerTransactionAdditionalInfos;

    /**
     * Gets or sets the Processing Fees.
     */
    @JsonProperty("ProcessingFee")
    private Double processingFee;

    /**
     * 
     */
    @JsonProperty("ContainsPayoutData")
    private boolean containsPayoutData;

    /**
     * 
     */
    @JsonProperty("ProviderPayoutFeeAmount")
    private Double providerPayoutFeeAmount;

    /**
     * 
     */
    @JsonProperty("ProviderPayoutDepositAmount")
    private Double providerPayoutDepositAmount;

    /**
     * 
     */
    @JsonProperty("PayoutReportData")
    private PayoutReportData payoutReportData;

    /**
     * 
     */
    @JsonProperty("ContainsPayoutReportData")
    private boolean containsPayoutReportData;

    /**
     * 
     */
    @JsonProperty("ForceCreateWebhookEvent")
    private boolean forceCreateWebhookEvent;


    
    public TransactionResultEntity() {
    }

    
    public TransactionResultEntity(String transactionDescription, BankingOperationResult bankingOperationResult, String bankingOperationDescription, OperationStatus operationStatus, LocalDateTime realDueDate, String providerTransactionAdditionalInfos, Double processingFee, boolean containsPayoutData, Double providerPayoutFeeAmount, Double providerPayoutDepositAmount, PayoutReportData payoutReportData, boolean containsPayoutReportData, boolean forceCreateWebhookEvent) {
        this.transactionDescription = transactionDescription;
        this.bankingOperationResult = bankingOperationResult;
        this.bankingOperationDescription = bankingOperationDescription;
        this.operationStatus = operationStatus;
        this.realDueDate = realDueDate;
        this.providerTransactionAdditionalInfos = providerTransactionAdditionalInfos;
        this.processingFee = processingFee;
        this.containsPayoutData = containsPayoutData;
        this.providerPayoutFeeAmount = providerPayoutFeeAmount;
        this.providerPayoutDepositAmount = providerPayoutDepositAmount;
        this.payoutReportData = payoutReportData;
        this.containsPayoutReportData = containsPayoutReportData;
        this.forceCreateWebhookEvent = forceCreateWebhookEvent;
    }
    
    
    public TransactionResultEntity(String transactionId, String relatedMerchantId, String lastExecutionDescription, Double transactionAmount, LocalDateTime originalTransactionDueDatePassedWeekend, LocalDateTime originalTransactionCreatedDatePassedWeekend, Currency currency, String transferId, String payoutId, String transactionDescription, BankingOperationResult bankingOperationResult, String bankingOperationDescription, OperationStatus operationStatus, LocalDateTime realDueDate, String providerTransactionAdditionalInfos, Double processingFee, boolean containsPayoutData, Double providerPayoutFeeAmount, Double providerPayoutDepositAmount, PayoutReportData payoutReportData, boolean containsPayoutReportData, boolean forceCreateWebhookEvent) {
        super(transactionId, relatedMerchantId, lastExecutionDescription, transactionAmount, originalTransactionDueDatePassedWeekend, originalTransactionCreatedDatePassedWeekend, currency, transferId, payoutId);
        this.transactionDescription = transactionDescription;
        this.bankingOperationResult = bankingOperationResult;
        this.bankingOperationDescription = bankingOperationDescription;
        this.operationStatus = operationStatus;
        this.realDueDate = realDueDate;
        this.providerTransactionAdditionalInfos = providerTransactionAdditionalInfos;
        this.processingFee = processingFee;
        this.containsPayoutData = containsPayoutData;
        this.providerPayoutFeeAmount = providerPayoutFeeAmount;
        this.providerPayoutDepositAmount = providerPayoutDepositAmount;
        this.payoutReportData = payoutReportData;
        this.containsPayoutReportData = containsPayoutReportData;
        this.forceCreateWebhookEvent = forceCreateWebhookEvent;
    }

    
    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public BankingOperationResult getBankingOperationResult() {
        return bankingOperationResult;
    }

    public void setBankingOperationResult(BankingOperationResult bankingOperationResult) {
        this.bankingOperationResult = bankingOperationResult;
    }

    public String getBankingOperationDescription() {
        return bankingOperationDescription;
    }

    public void setBankingOperationDescription(String bankingOperationDescription) {
        this.bankingOperationDescription = bankingOperationDescription;
    }

    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public LocalDateTime getRealDueDate() {
        return realDueDate;
    }

    public void setRealDueDate(LocalDateTime realDueDate) {
        this.realDueDate = realDueDate;
    }

    public String getProviderTransactionAdditionalInfos() {
        return providerTransactionAdditionalInfos;
    }

    public void setProviderTransactionAdditionalInfos(String providerTransactionAdditionalInfos) {
        this.providerTransactionAdditionalInfos = providerTransactionAdditionalInfos;
    }

    public Double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(Double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean getContainsPayoutData() {
        return containsPayoutData;
    }

    public void setContainsPayoutData(boolean containsPayoutData) {
        this.containsPayoutData = containsPayoutData;
    }

    public Double getProviderPayoutFeeAmount() {
        return providerPayoutFeeAmount;
    }

    public void setProviderPayoutFeeAmount(Double providerPayoutFeeAmount) {
        this.providerPayoutFeeAmount = providerPayoutFeeAmount;
    }

    public Double getProviderPayoutDepositAmount() {
        return providerPayoutDepositAmount;
    }

    public void setProviderPayoutDepositAmount(Double providerPayoutDepositAmount) {
        this.providerPayoutDepositAmount = providerPayoutDepositAmount;
    }

    public PayoutReportData getPayoutReportData() {
        return payoutReportData;
    }

    public void setPayoutReportData(PayoutReportData payoutReportData) {
        this.payoutReportData = payoutReportData;
    }

    public boolean getContainsPayoutReportData() {
        return containsPayoutReportData;
    }

    public void setContainsPayoutReportData(boolean containsPayoutReportData) {
        this.containsPayoutReportData = containsPayoutReportData;
    }

    public boolean getForceCreateWebhookEvent() {
        return forceCreateWebhookEvent;
    }

    public void setForceCreateWebhookEvent(boolean forceCreateWebhookEvent) {
        this.forceCreateWebhookEvent = forceCreateWebhookEvent;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionResultEntity that = (TransactionResultEntity) o;
        return Objects.equals(transactionDescription, that.transactionDescription) && Objects.equals(bankingOperationResult, that.bankingOperationResult) && Objects.equals(bankingOperationDescription, that.bankingOperationDescription) && Objects.equals(operationStatus, that.operationStatus) && Objects.equals(realDueDate, that.realDueDate) && Objects.equals(providerTransactionAdditionalInfos, that.providerTransactionAdditionalInfos) && Objects.equals(processingFee, that.processingFee) && Objects.equals(containsPayoutData, that.containsPayoutData) && Objects.equals(providerPayoutFeeAmount, that.providerPayoutFeeAmount) && Objects.equals(providerPayoutDepositAmount, that.providerPayoutDepositAmount) && Objects.equals(payoutReportData, that.payoutReportData) && Objects.equals(containsPayoutReportData, that.containsPayoutReportData) && Objects.equals(forceCreateWebhookEvent, that.forceCreateWebhookEvent) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactionDescription, bankingOperationResult, bankingOperationDescription, operationStatus, realDueDate, providerTransactionAdditionalInfos, processingFee, containsPayoutData, providerPayoutFeeAmount, providerPayoutDepositAmount, payoutReportData, containsPayoutReportData, forceCreateWebhookEvent);
    }

    @Override
    public String toString() {
        return "TransactionResultEntity{" +
                "transactionDescription='" + transactionDescription + '\'' +
                ", bankingOperationResult='" + bankingOperationResult + '\'' +
                ", bankingOperationDescription='" + bankingOperationDescription + '\'' +
                ", operationStatus='" + operationStatus + '\'' +
                ", realDueDate='" + realDueDate + '\'' +
                ", providerTransactionAdditionalInfos='" + providerTransactionAdditionalInfos + '\'' +
                ", processingFee='" + processingFee + '\'' +
                ", containsPayoutData='" + containsPayoutData + '\'' +
                ", providerPayoutFeeAmount='" + providerPayoutFeeAmount + '\'' +
                ", providerPayoutDepositAmount='" + providerPayoutDepositAmount + '\'' +
                ", payoutReportData='" + payoutReportData + '\'' +
                ", containsPayoutReportData='" + containsPayoutReportData + '\'' +
                ", forceCreateWebhookEvent='" + forceCreateWebhookEvent + '\'' +

                '}';
    }
}