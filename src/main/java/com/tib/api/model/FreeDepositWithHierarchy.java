
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


public class FreeDepositWithHierarchy   {

    
    /**
 * Gets or sets the free deposit identifier.
 */
    @JsonProperty("FreeDepositId")
    private String freeDepositId;

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


    
    public FreeDepositWithHierarchy() {
    }

    
    public FreeDepositWithHierarchy(String freeDepositId, String merchantId, Currency currency, TransferDirection operationDirection, OperationKind operationKind, Double amount, ProcessStatus currentStatus, LocalDateTime createdDate, String accountName, String referenceId) {
        this.freeDepositId = freeDepositId;
this.merchantId = merchantId;
this.currency = currency;
this.operationDirection = operationDirection;
this.operationKind = operationKind;
this.amount = amount;
this.currentStatus = currentStatus;
this.createdDate = createdDate;
this.accountName = accountName;
this.referenceId = referenceId;

    }
    
    

    
    public String getFreeDepositId() {
        return freeDepositId;
    }

    public void setFreeDepositId(String freeDepositId) {
        this.freeDepositId = freeDepositId;
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



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreeDepositWithHierarchy that = (FreeDepositWithHierarchy) o;
        return Objects.equals(freeDepositId, that.freeDepositId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(currency, that.currency) && Objects.equals(operationDirection, that.operationDirection) && Objects.equals(operationKind, that.operationKind) && Objects.equals(amount, that.amount) && Objects.equals(currentStatus, that.currentStatus) && Objects.equals(createdDate, that.createdDate) && Objects.equals(accountName, that.accountName) && Objects.equals(referenceId, that.referenceId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(freeDepositId, merchantId, currency, operationDirection, operationKind, amount, currentStatus, createdDate, accountName, referenceId);
    }

    @Override
    public String toString() {
        return "FreeDepositWithHierarchy{" +
                 "freeDepositId='" + freeDepositId + '\'' +
 ", merchantId='" + merchantId + '\'' +
 ", currency='" + currency + '\'' +
 ", operationDirection='" + operationDirection + '\'' +
 ", operationKind='" + operationKind + '\'' +
 ", amount='" + amount + '\'' +
 ", currentStatus='" + currentStatus + '\'' +
 ", createdDate='" + createdDate + '\'' +
 ", accountName='" + accountName + '\'' +
 ", referenceId='" + referenceId + '\'' +

                '}';
    }
}