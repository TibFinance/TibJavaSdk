
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.OperationKind;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ConsolidationInternalReportEntity   {

    
    /**
 * Gets or sets the execution date and time of the transaction.
 */
    @JsonProperty("ExecutedDate")
    private LocalDateTime executedDate;

    /**
 * Represents the unique identifier for a group within the TIB Finance API.
 */
    @JsonProperty("GroupId")
    private String groupId;

    /**
 * Specifies the category of a financial operation.
 */
    @JsonProperty("OperationKind")
    private OperationKind operationKind;

    /**
 * Gets or sets the deposit amount.
 */
    @JsonProperty("DepositAmount")
    private Double depositAmount;

    /**
 * Gets or sets the collection amount.
 */
    @JsonProperty("CollectionAmount")
    private Double collectionAmount;

    /**
 * Gets or sets the returned deposit amount.
 */
    @JsonProperty("ReturnedDepositAmount")
    private Double returnedDepositAmount;

    /**
 * Gets or sets the returned collection amount.
 */
    @JsonProperty("ReturnedCollectionAmount")
    private Double returnedCollectionAmount;

    /**
 * Gets or sets the transaction count.
 */
    @JsonProperty("TransactionCount")
    private Integer transactionCount;


    
    public ConsolidationInternalReportEntity() {
    }

    
    public ConsolidationInternalReportEntity(LocalDateTime executedDate, String groupId, OperationKind operationKind, Double depositAmount, Double collectionAmount, Double returnedDepositAmount, Double returnedCollectionAmount, Integer transactionCount) {
        this.executedDate = executedDate;
this.groupId = groupId;
this.operationKind = operationKind;
this.depositAmount = depositAmount;
this.collectionAmount = collectionAmount;
this.returnedDepositAmount = returnedDepositAmount;
this.returnedCollectionAmount = returnedCollectionAmount;
this.transactionCount = transactionCount;

    }
    
    

    
    public LocalDateTime getExecutedDate() {
        return executedDate;
    }

    public void setExecutedDate(LocalDateTime executedDate) {
        this.executedDate = executedDate;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public OperationKind getOperationKind() {
        return operationKind;
    }

    public void setOperationKind(OperationKind operationKind) {
        this.operationKind = operationKind;
    }

    public Double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Double getCollectionAmount() {
        return collectionAmount;
    }

    public void setCollectionAmount(Double collectionAmount) {
        this.collectionAmount = collectionAmount;
    }

    public Double getReturnedDepositAmount() {
        return returnedDepositAmount;
    }

    public void setReturnedDepositAmount(Double returnedDepositAmount) {
        this.returnedDepositAmount = returnedDepositAmount;
    }

    public Double getReturnedCollectionAmount() {
        return returnedCollectionAmount;
    }

    public void setReturnedCollectionAmount(Double returnedCollectionAmount) {
        this.returnedCollectionAmount = returnedCollectionAmount;
    }

    public Integer getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(Integer transactionCount) {
        this.transactionCount = transactionCount;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsolidationInternalReportEntity that = (ConsolidationInternalReportEntity) o;
        return Objects.equals(executedDate, that.executedDate) && Objects.equals(groupId, that.groupId) && Objects.equals(operationKind, that.operationKind) && Objects.equals(depositAmount, that.depositAmount) && Objects.equals(collectionAmount, that.collectionAmount) && Objects.equals(returnedDepositAmount, that.returnedDepositAmount) && Objects.equals(returnedCollectionAmount, that.returnedCollectionAmount) && Objects.equals(transactionCount, that.transactionCount) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(executedDate, groupId, operationKind, depositAmount, collectionAmount, returnedDepositAmount, returnedCollectionAmount, transactionCount);
    }

    @Override
    public String toString() {
        return "ConsolidationInternalReportEntity{" +
                 "executedDate='" + executedDate + '\'' +
 ", groupId='" + groupId + '\'' +
 ", operationKind='" + operationKind + '\'' +
 ", depositAmount='" + depositAmount + '\'' +
 ", collectionAmount='" + collectionAmount + '\'' +
 ", returnedDepositAmount='" + returnedDepositAmount + '\'' +
 ", returnedCollectionAmount='" + returnedCollectionAmount + '\'' +
 ", transactionCount='" + transactionCount + '\'' +

                '}';
    }
}