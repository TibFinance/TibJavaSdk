
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.enums.OperationKind;
import com.tib.api.model.enums.ProcessStatus;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class FreeCollectionWithHierarchy   {

    
    /**
     * Unique identifier of this free collection.
     */
    @JsonProperty("FreeCollectionId")
    private String freeCollectionId;

    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * The ISO 4217 three‑letter code of the currency in which the transfer was executed.
     */
    @JsonProperty("Currency")
    private Currency currency;

    /**
     * Indicates whether the listed transfer is inbound to or outbound from the queried account
     */
    @JsonProperty("OperationDirection")
    private TransferDirection operationDirection;

    /**
     * Specifies the category of the transfer operation returned by the API
     */
    @JsonProperty("OperationKind")
    private OperationKind operationKind;

    /**
     * The monetary value of each recurring transfer.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * Dollar amount of the combined operation.
     */
    @JsonProperty("OperationAmount")
    private Double operationAmount;

    /**
     * The current processing status of the transfer.
     */
    @JsonProperty("CurrentStatus")
    private ProcessStatus currentStatus;

    /**
     * The date and time when the recurring transfer was initially created.
     */
    @JsonProperty("CreatedDate")
    private OffsetDateTime createdDate;

    /**
     * The display name of the account involved in the transfer.
     */
    @JsonProperty("AccountName")
    private String accountName;

    /**
     * Unique identifier of the wallet information record returned by the service
     */
    @JsonProperty("ReferenceId")
    private String referenceId;

    /**
     * The timestamp when the transfer was executed.
     */
    @JsonProperty("ExecutedDate")
    private OffsetDateTime executedDate;

    /**
     * Scheduled execution date for the collection.
     */
    @JsonProperty("TransferDueDate")
    private OffsetDateTime transferDueDate;

    /**
     * The payment method type employed for the transfer.
     */
    @JsonProperty("PaymentMethodType")
    private Integer paymentMethodType;


    
    public FreeCollectionWithHierarchy() {
    }

    
    public FreeCollectionWithHierarchy(String freeCollectionId, String merchantId, Currency currency, TransferDirection operationDirection, OperationKind operationKind, Double amount, Double operationAmount, ProcessStatus currentStatus, OffsetDateTime createdDate, String accountName, String referenceId, OffsetDateTime executedDate, OffsetDateTime transferDueDate, Integer paymentMethodType) {
        this.freeCollectionId = freeCollectionId;
        this.merchantId = merchantId;
        this.currency = currency;
        this.operationDirection = operationDirection;
        this.operationKind = operationKind;
        this.amount = amount;
        this.operationAmount = operationAmount;
        this.currentStatus = currentStatus;
        this.createdDate = createdDate;
        this.accountName = accountName;
        this.referenceId = referenceId;
        this.executedDate = executedDate;
        this.transferDueDate = transferDueDate;
        this.paymentMethodType = paymentMethodType;
    }
    
    

    
    public String getFreeCollectionId() {
        return freeCollectionId;
    }

    public void setFreeCollectionId(String freeCollectionId) {
        this.freeCollectionId = freeCollectionId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public TransferDirection getOperationDirection() {
        return operationDirection;
    }

    public void setOperationDirection(TransferDirection operationDirection) {
        this.operationDirection = operationDirection;
    }

    public OperationKind getOperationKind() {
        return operationKind;
    }

    public void setOperationKind(OperationKind operationKind) {
        this.operationKind = operationKind;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getOperationAmount() {
        return operationAmount;
    }

    public void setOperationAmount(Double operationAmount) {
        this.operationAmount = operationAmount;
    }

    public ProcessStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(ProcessStatus currentStatus) {
        this.currentStatus = currentStatus;
    }

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public OffsetDateTime getExecutedDate() {
        return executedDate;
    }

    public void setExecutedDate(OffsetDateTime executedDate) {
        this.executedDate = executedDate;
    }

    public OffsetDateTime getTransferDueDate() {
        return transferDueDate;
    }

    public void setTransferDueDate(OffsetDateTime transferDueDate) {
        this.transferDueDate = transferDueDate;
    }

    public Integer getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(Integer paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreeCollectionWithHierarchy that = (FreeCollectionWithHierarchy) o;
        return Objects.equals(freeCollectionId, that.freeCollectionId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(currency, that.currency) && Objects.equals(operationDirection, that.operationDirection) && Objects.equals(operationKind, that.operationKind) && Objects.equals(amount, that.amount) && Objects.equals(operationAmount, that.operationAmount) && Objects.equals(currentStatus, that.currentStatus) && Objects.equals(createdDate, that.createdDate) && Objects.equals(accountName, that.accountName) && Objects.equals(referenceId, that.referenceId) && Objects.equals(executedDate, that.executedDate) && Objects.equals(transferDueDate, that.transferDueDate) && Objects.equals(paymentMethodType, that.paymentMethodType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(freeCollectionId, merchantId, currency, operationDirection, operationKind, amount, operationAmount, currentStatus, createdDate, accountName, referenceId, executedDate, transferDueDate, paymentMethodType);
    }

    @Override
    public String toString() {
        return "FreeCollectionWithHierarchy{" +
                "freeCollectionId='" + freeCollectionId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", currency='" + currency + '\'' +
                ", operationDirection='" + operationDirection + '\'' +
                ", operationKind='" + operationKind + '\'' +
                ", amount='" + amount + '\'' +
                ", operationAmount='" + operationAmount + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", accountName='" + accountName + '\'' +
                ", referenceId='" + referenceId + '\'' +
                ", executedDate='" + executedDate + '\'' +
                ", transferDueDate='" + transferDueDate + '\'' +
                ", paymentMethodType='" + paymentMethodType + '\'' +

                '}';
    }
}