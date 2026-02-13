
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.OperationTarget;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.enums.OperationKind;
import com.tib.api.model.TransactionCommon;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class PaymentOperationEntity   {

    
    /**
 * Retrieves or assigns the monetary amount involved in the transaction.
 */
    @JsonProperty("Amount")
    private Double amount;

    /**
 * Retrieves or assigns the currency type used in transactions.
 */
    @JsonProperty("Currency")
    private Currency currency;

    /**
 * Specifies the target of an operation, indicating whether the operation pertains to the merchant or the customer.
 */
    @JsonProperty("OperationTarget")
    private OperationTarget operationTarget;

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
 * The date and time when the payment was created.
 */
    @JsonProperty("CreatedDate")
    private LocalDateTime createdDate;

    /**
 * Gets or sets the execution date and time of the transaction.
 */
    @JsonProperty("ExecutedDate")
    private LocalDateTime executedDate;

    /**
 * Gets or sets the collection of transaction details associated with the operation.
 */
    @JsonProperty("Transactions")
    private List<TransactionCommon> transactions;

    /**
 * Retrieves the numeric status code of an operation.
 */
    @JsonProperty("OperationStatus")
    private Integer operationStatus;

    /**
 * Gets or sets the merchant name that overrides the default merchant name.
 */
    @JsonProperty("OverloadMerchantName")
    private String overloadMerchantName;


    
    public PaymentOperationEntity() {
    }

    
    public PaymentOperationEntity(Double amount, Currency currency, OperationTarget operationTarget, TransferDirection operationDirection, OperationKind operationKind, LocalDateTime createdDate, LocalDateTime executedDate, List<TransactionCommon> transactions, Integer operationStatus, String overloadMerchantName) {
        this.amount = amount;
this.currency = currency;
this.operationTarget = operationTarget;
this.operationDirection = operationDirection;
this.operationKind = operationKind;
this.createdDate = createdDate;
this.executedDate = executedDate;
this.transactions = transactions;
this.operationStatus = operationStatus;
this.overloadMerchantName = overloadMerchantName;

    }
    
    

    
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public OperationTarget getOperationTarget() {
        return operationTarget;
    }

    public void setOperationTarget(OperationTarget operationTarget) {
        this.operationTarget = operationTarget;
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

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getExecutedDate() {
        return executedDate;
    }

    public void setExecutedDate(LocalDateTime executedDate) {
        this.executedDate = executedDate;
    }

    public List<TransactionCommon> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionCommon> transactions) {
        this.transactions = transactions;
    }

    public Integer getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(Integer operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getOverloadMerchantName() {
        return overloadMerchantName;
    }

    public void setOverloadMerchantName(String overloadMerchantName) {
        this.overloadMerchantName = overloadMerchantName;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentOperationEntity that = (PaymentOperationEntity) o;
        return Objects.equals(amount, that.amount) && Objects.equals(currency, that.currency) && Objects.equals(operationTarget, that.operationTarget) && Objects.equals(operationDirection, that.operationDirection) && Objects.equals(operationKind, that.operationKind) && Objects.equals(createdDate, that.createdDate) && Objects.equals(executedDate, that.executedDate) && Objects.equals(transactions, that.transactions) && Objects.equals(operationStatus, that.operationStatus) && Objects.equals(overloadMerchantName, that.overloadMerchantName) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(amount, currency, operationTarget, operationDirection, operationKind, createdDate, executedDate, transactions, operationStatus, overloadMerchantName);
    }

    @Override
    public String toString() {
        return "PaymentOperationEntity{" +
                 "amount='" + amount + '\'' +
 ", currency='" + currency + '\'' +
 ", operationTarget='" + operationTarget + '\'' +
 ", operationDirection='" + operationDirection + '\'' +
 ", operationKind='" + operationKind + '\'' +
 ", createdDate='" + createdDate + '\'' +
 ", executedDate='" + executedDate + '\'' +
 ", transactions='" + transactions + '\'' +
 ", operationStatus='" + operationStatus + '\'' +
 ", overloadMerchantName='" + overloadMerchantName + '\'' +

                '}';
    }
}