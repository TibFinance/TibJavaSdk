
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.OperationTarget;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.enums.OperationKind;
import com.tib.api.model.TransactionCommon;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class PaymentOperationEntity   {

    
    /**
     * The monetary value of each recurring transfer.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * The ISO 4217 three‑letter code of the currency in which the transfer was executed.
     */
    @JsonProperty("Currency")
    private Currency currency;

    /**
     * Specifies the destination entity of the transfer returned by ListTransfers
     */
    @JsonProperty("OperationTarget")
    private OperationTarget operationTarget;

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
     * The date and time when the recurring transfer was initially created.
     */
    @JsonProperty("CreatedDate")
    private OffsetDateTime createdDate;

    /**
     * The timestamp when the transfer was executed.
     */
    @JsonProperty("ExecutedDate")
    private OffsetDateTime executedDate;

    /**
     * A list of transfer records returned by the ListTransfers call.
     */
    @JsonProperty("Transactions")
    private List<TransactionCommon> transactions;

    /**
     * Indicates the result of the ListTransfers request
     */
    @JsonProperty("OperationStatus")
    private Integer operationStatus;

    /**
     * The merchant name associated with an overload transfer.
     */
    @JsonProperty("OverloadMerchantName")
    private String overloadMerchantName;


    
    public PaymentOperationEntity() {
    }

    
    public PaymentOperationEntity(Double amount, Currency currency, OperationTarget operationTarget, TransferDirection operationDirection, OperationKind operationKind, OffsetDateTime createdDate, OffsetDateTime executedDate, List<TransactionCommon> transactions, Integer operationStatus, String overloadMerchantName) {
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

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public OffsetDateTime getExecutedDate() {
        return executedDate;
    }

    public void setExecutedDate(OffsetDateTime executedDate) {
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