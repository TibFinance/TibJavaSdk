
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.enums.OperationKind;
import com.tib.api.model.enums.ProcessStatus;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class FreeCollectionWithHierarchy   {

    
    /**
 * Gets or sets the unique identifier of a free‑collection operation. This GUID is assigned by TIB Finance when a free operation is created and is required to reference the operation in subsequent API calls.
 */
    @JsonProperty("FreeCollectionId")
    private String freeCollectionId;

    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * Retrieves or assigns the currency type used in transactions.
 */
    @JsonProperty("Currency")
    private Currency currency;

    /**
 * Specifies the direction of the operation, indicating whether funds are being collected or deposited.
 */
    @JsonProperty("OperationDirection")
    private TransferDirection operationDirection;

    /**
 * Specifies the category of a financial operation.
 */
    @JsonProperty("OperationKind")
    private OperationKind operationKind;

    /**
 * Retrieves or assigns the monetary amount involved in the transaction.
 */
    @JsonProperty("Amount")
    private Double amount;

    /**
 * Gets or sets the monetary amount associated with an operation.
 */
    @JsonProperty("OperationAmount")
    private Double operationAmount;

    /**
 * Current processing state of a transaction or operation.
 */
    @JsonProperty("CurrentStatus")
    private ProcessStatus currentStatus;

    /**
 * The date and time when the payment was created.
 */
    @JsonProperty("CreatedDate")
    private LocalDateTime createdDate;

    /**
 * Represents the name associated with the merchant's account.
 */
    @JsonProperty("AccountName")
    private String accountName;

    /**
 * Gets or sets the reference identifier used to uniquely identify a transaction, operation, or entity within the TIB Finance system.
 */
    @JsonProperty("ReferenceId")
    private String referenceId;

    /**
 * Gets or sets the execution date and time of the transaction.
 */
    @JsonProperty("ExecutedDate")
    private LocalDateTime executedDate;

    /**
 * Gets or sets the date and time when the transfer must be completed.
 */
    @JsonProperty("TransferDueDate")
    private LocalDateTime transferDueDate;

    /**
 * Identifies the type of payment method linked to a specific account.
 */
    @JsonProperty("PaymentMethodType")
    private Integer paymentMethodType;


    
    public FreeCollectionWithHierarchy() {
    }

    
    public FreeCollectionWithHierarchy(String freeCollectionId, String merchantId, Currency currency, TransferDirection operationDirection, OperationKind operationKind, Double amount, Double operationAmount, ProcessStatus currentStatus, LocalDateTime createdDate, String accountName, String referenceId, LocalDateTime executedDate, LocalDateTime transferDueDate, Integer paymentMethodType) {
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

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
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

    public LocalDateTime getExecutedDate() {
        return executedDate;
    }

    public void setExecutedDate(LocalDateTime executedDate) {
        this.executedDate = executedDate;
    }

    public LocalDateTime getTransferDueDate() {
        return transferDueDate;
    }

    public void setTransferDueDate(LocalDateTime transferDueDate) {
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