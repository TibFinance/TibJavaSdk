
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.OperationTarget;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.enums.OperationKind;
import com.tib.api.model.enums.TibOperationStatus;
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


public class TransferOperation   {

    
    /**
     * Gets or sets the operation identifier.
     */
    @JsonProperty("OperationId")
    private String operationId;

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
     * Gets or sets the dependent operation.
     */
    @JsonProperty("DependentOperation")
    private String dependentOperation;

    /**
     * Specifies the category of a financial operation.
     */
    @JsonProperty("OperationKind")
    private OperationKind operationKind;

    /**
     * Gets or sets the process date.
     */
    @JsonProperty("ProcessDate")
    private LocalDateTime processDate;

    /**
     * 
     */
    @JsonProperty("OverloadedMerchantId")
    private String overloadedMerchantId;

    /**
     * 
     */
    @JsonProperty("OverloadedProviderId")
    private String overloadedProviderId;

    /**
     * Retrieves the numeric status code of an operation.
     */
    @JsonProperty("OperationStatus")
    private TibOperationStatus operationStatus;

    /**
     * 
     */
    @JsonProperty("HasUsedWallet")
    private boolean hasUsedWallet;

    /**
     * Gets or sets the collection of transaction details associated with the operation.
     */
    @JsonProperty("Transactions")
    private List<TransactionCommon> transactions;


    
    public TransferOperation() {
    }

    
    public TransferOperation(String operationId, Double amount, Currency currency, OperationTarget operationTarget, TransferDirection operationDirection, String dependentOperation, OperationKind operationKind, LocalDateTime processDate, String overloadedMerchantId, String overloadedProviderId, TibOperationStatus operationStatus, boolean hasUsedWallet, List<TransactionCommon> transactions) {
        this.operationId = operationId;
        this.amount = amount;
        this.currency = currency;
        this.operationTarget = operationTarget;
        this.operationDirection = operationDirection;
        this.dependentOperation = dependentOperation;
        this.operationKind = operationKind;
        this.processDate = processDate;
        this.overloadedMerchantId = overloadedMerchantId;
        this.overloadedProviderId = overloadedProviderId;
        this.operationStatus = operationStatus;
        this.hasUsedWallet = hasUsedWallet;
        this.transactions = transactions;
    }
    
    

    
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
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

    public String getDependentOperation() {
        return dependentOperation;
    }

    public void setDependentOperation(String dependentOperation) {
        this.dependentOperation = dependentOperation;
    }

    public OperationKind getOperationKind() {
        return operationKind;
    }

    public void setOperationKind(OperationKind operationKind) {
        this.operationKind = operationKind;
    }

    public LocalDateTime getProcessDate() {
        return processDate;
    }

    public void setProcessDate(LocalDateTime processDate) {
        this.processDate = processDate;
    }

    public String getOverloadedMerchantId() {
        return overloadedMerchantId;
    }

    public void setOverloadedMerchantId(String overloadedMerchantId) {
        this.overloadedMerchantId = overloadedMerchantId;
    }

    public String getOverloadedProviderId() {
        return overloadedProviderId;
    }

    public void setOverloadedProviderId(String overloadedProviderId) {
        this.overloadedProviderId = overloadedProviderId;
    }

    public TibOperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(TibOperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public boolean getHasUsedWallet() {
        return hasUsedWallet;
    }

    public void setHasUsedWallet(boolean hasUsedWallet) {
        this.hasUsedWallet = hasUsedWallet;
    }

    public List<TransactionCommon> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionCommon> transactions) {
        this.transactions = transactions;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferOperation that = (TransferOperation) o;
        return Objects.equals(operationId, that.operationId) && Objects.equals(amount, that.amount) && Objects.equals(currency, that.currency) && Objects.equals(operationTarget, that.operationTarget) && Objects.equals(operationDirection, that.operationDirection) && Objects.equals(dependentOperation, that.dependentOperation) && Objects.equals(operationKind, that.operationKind) && Objects.equals(processDate, that.processDate) && Objects.equals(overloadedMerchantId, that.overloadedMerchantId) && Objects.equals(overloadedProviderId, that.overloadedProviderId) && Objects.equals(operationStatus, that.operationStatus) && Objects.equals(hasUsedWallet, that.hasUsedWallet) && Objects.equals(transactions, that.transactions) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationId, amount, currency, operationTarget, operationDirection, dependentOperation, operationKind, processDate, overloadedMerchantId, overloadedProviderId, operationStatus, hasUsedWallet, transactions);
    }

    @Override
    public String toString() {
        return "TransferOperation{" +
                "operationId='" + operationId + '\'' +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", operationTarget='" + operationTarget + '\'' +
                ", operationDirection='" + operationDirection + '\'' +
                ", dependentOperation='" + dependentOperation + '\'' +
                ", operationKind='" + operationKind + '\'' +
                ", processDate='" + processDate + '\'' +
                ", overloadedMerchantId='" + overloadedMerchantId + '\'' +
                ", overloadedProviderId='" + overloadedProviderId + '\'' +
                ", operationStatus='" + operationStatus + '\'' +
                ", hasUsedWallet='" + hasUsedWallet + '\'' +
                ", transactions='" + transactions + '\'' +

                '}';
    }
}