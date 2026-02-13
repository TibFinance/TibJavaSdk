package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.OperationTarget;
import com.tib.api.model.enums.TransferDirection;

import java.util.List;
import java.util.Objects;

public class CombinedOperation {

    @JsonProperty("OperationTypeRef")
    private String operationTypeRef;

    @JsonProperty("Amount")
    private Double amount;

    @JsonProperty("OperationTarget")
    private OperationTarget operationTarget;

    @JsonProperty("TransferDirection")
    private TransferDirection transferDirection;

    @JsonProperty("TargetSystemId")
    private String targetSystemId;

    @JsonProperty("Transactions")
    private List<Transaction> transactions;

    @JsonProperty("FreeCollectionList")
    private List<CombinedOperation> freeCollectionList;

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

    public OperationTarget getOperationTarget() {
        return operationTarget;
    }

    public void setOperationTarget(OperationTarget operationTarget) {
        this.operationTarget = operationTarget;
    }

    public TransferDirection getTransferDirection() {
        return transferDirection;
    }

    public void setTransferDirection(TransferDirection transferDirection) {
        this.transferDirection = transferDirection;
    }

    public String getTargetSystemId() {
        return targetSystemId;
    }

    public void setTargetSystemId(String targetSystemId) {
        this.targetSystemId = targetSystemId;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<CombinedOperation> getFreeCollectionList() {
        return freeCollectionList;
    }

    public void setFreeCollectionList(List<CombinedOperation> freeCollectionList) {
        this.freeCollectionList = freeCollectionList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CombinedOperation that = (CombinedOperation) o;
        return Objects.equals(operationTypeRef, that.operationTypeRef) &&
                Objects.equals(amount, that.amount) &&
                operationTarget == that.operationTarget &&
                transferDirection == that.transferDirection &&
                Objects.equals(targetSystemId, that.targetSystemId) &&
                Objects.equals(transactions, that.transactions) &&
                Objects.equals(freeCollectionList, that.freeCollectionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationTypeRef, amount, operationTarget, transferDirection, targetSystemId, transactions, freeCollectionList);
    }


    @Override
    public String toString() {
        return "CombinedOperation{" +
                "operationTypeRef='" + operationTypeRef + '\'' +
                ", amount=" + amount +
                ", operationTarget=" + operationTarget +
                ", transferDirection=" + transferDirection +
                ", targetSystemId='" + targetSystemId + '\'' +
                ", transactions=" + transactions +
                ", freeCollectionList=" + freeCollectionList +
                '}';
    }
}
