
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.OperationTarget;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.TransactionCommon;
import com.tib.api.model.FreeCollectionWithHierarchy;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class FreeCollectionOperation   {

    
    /**
 * Gets or sets the operation type reference identifier that categorizes an operation.
 */
    @JsonProperty("OperationTypeRef")
    private String operationTypeRef;

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
 * Gets or sets the unique identifier of the target system used to reference the client’s contract within TIB Finance.
 */
    @JsonProperty("TargetSystemId")
    private String targetSystemId;

    /**
 * Gets or sets the collection of transaction details associated with the operation.
 */
    @JsonProperty("Transactions")
    private List<TransactionCommon> transactions;

    /**
 * Retrieves the collection of free‑operation records, each represented as a FreeCollectionWithHierarchyModel, ordered by their hierarchical relationship.
 */
    @JsonProperty("FreeCollectionList")
    private List<FreeCollectionWithHierarchy> freeCollectionList;


    
    public FreeCollectionOperation() {
    }

    
    public FreeCollectionOperation(String operationTypeRef, Double amount, Currency currency, OperationTarget operationTarget, TransferDirection operationDirection, String targetSystemId, List<TransactionCommon> transactions, List<FreeCollectionWithHierarchy> freeCollectionList) {
        this.operationTypeRef = operationTypeRef;
this.amount = amount;
this.currency = currency;
this.operationTarget = operationTarget;
this.operationDirection = operationDirection;
this.targetSystemId = targetSystemId;
this.transactions = transactions;
this.freeCollectionList = freeCollectionList;

    }
    
    

    
    public String getOperationTypeRef() {
        return operationTypeRef;
    }

    public void setOperationTypeRef(String operationTypeRef) {
        this.operationTypeRef = operationTypeRef;
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

    public String getTargetSystemId() {
        return targetSystemId;
    }

    public void setTargetSystemId(String targetSystemId) {
        this.targetSystemId = targetSystemId;
    }

    public List<TransactionCommon> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionCommon> transactions) {
        this.transactions = transactions;
    }

    public List<FreeCollectionWithHierarchy> getFreeCollectionList() {
        return freeCollectionList;
    }

    public void setFreeCollectionList(List<FreeCollectionWithHierarchy> freeCollectionList) {
        this.freeCollectionList = freeCollectionList;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreeCollectionOperation that = (FreeCollectionOperation) o;
        return Objects.equals(operationTypeRef, that.operationTypeRef) && Objects.equals(amount, that.amount) && Objects.equals(currency, that.currency) && Objects.equals(operationTarget, that.operationTarget) && Objects.equals(operationDirection, that.operationDirection) && Objects.equals(targetSystemId, that.targetSystemId) && Objects.equals(transactions, that.transactions) && Objects.equals(freeCollectionList, that.freeCollectionList) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationTypeRef, amount, currency, operationTarget, operationDirection, targetSystemId, transactions, freeCollectionList);
    }

    @Override
    public String toString() {
        return "FreeCollectionOperation{" +
                 "operationTypeRef='" + operationTypeRef + '\'' +
 ", amount='" + amount + '\'' +
 ", currency='" + currency + '\'' +
 ", operationTarget='" + operationTarget + '\'' +
 ", operationDirection='" + operationDirection + '\'' +
 ", targetSystemId='" + targetSystemId + '\'' +
 ", transactions='" + transactions + '\'' +
 ", freeCollectionList='" + freeCollectionList + '\'' +

                '}';
    }
}