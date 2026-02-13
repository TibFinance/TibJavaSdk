
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class DuplicateOperationArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("OperationId")
    private String operationId;

    /**
 * Identifies the specific transfer operation that needs to be reverted.
 */
    @JsonProperty("TransferId")
    private String transferId;

    /**
 * Retrieves or assigns the monetary amount involved in the transaction.
 */
    @JsonProperty("Amount")
    private Double amount;

    /**
 * Specifies the target of an operation, indicating whether the operation pertains to the merchant or the customer.
 */
    @JsonProperty("OperationTarget")
    private Integer operationTarget;

    /**
 * Specifies the direction of the operation, indicating whether funds are being collected or deposited.
 */
    @JsonProperty("OperationDirection")
    private Integer operationDirection;

    /**
 * 
 */
    @JsonProperty("DependentOperationId")
    private String dependentOperationId;

    /**
 * Retrieves the numeric status code of an operation.
 */
    @JsonProperty("OperationStatus")
    private Integer operationStatus;

    /**
 * 
 */
    @JsonProperty("TransactionGroupId")
    private String transactionGroupId;


    
    public DuplicateOperationArgs() {
    }

    
    public DuplicateOperationArgs(String operationId, String transferId, Double amount, Integer operationTarget, Integer operationDirection, String dependentOperationId, Integer operationStatus, String transactionGroupId) {
        this.operationId = operationId;
this.transferId = transferId;
this.amount = amount;
this.operationTarget = operationTarget;
this.operationDirection = operationDirection;
this.dependentOperationId = dependentOperationId;
this.operationStatus = operationStatus;
this.transactionGroupId = transactionGroupId;

    }
    
    
    public DuplicateOperationArgs(String adminSessionToken, String operationId, String transferId, Double amount, Integer operationTarget, Integer operationDirection, String dependentOperationId, Integer operationStatus, String transactionGroupId) {
        super(adminSessionToken);
        this.operationId = operationId;
this.transferId = transferId;
this.amount = amount;
this.operationTarget = operationTarget;
this.operationDirection = operationDirection;
this.dependentOperationId = dependentOperationId;
this.operationStatus = operationStatus;
this.transactionGroupId = transactionGroupId;

    }

    
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getOperationTarget() {
        return operationTarget;
    }

    public void setOperationTarget(Integer operationTarget) {
        this.operationTarget = operationTarget;
    }

    public Integer getOperationDirection() {
        return operationDirection;
    }

    public void setOperationDirection(Integer operationDirection) {
        this.operationDirection = operationDirection;
    }

    public String getDependentOperationId() {
        return dependentOperationId;
    }

    public void setDependentOperationId(String dependentOperationId) {
        this.dependentOperationId = dependentOperationId;
    }

    public Integer getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(Integer operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getTransactionGroupId() {
        return transactionGroupId;
    }

    public void setTransactionGroupId(String transactionGroupId) {
        this.transactionGroupId = transactionGroupId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DuplicateOperationArgs that = (DuplicateOperationArgs) o;
        return Objects.equals(operationId, that.operationId) && Objects.equals(transferId, that.transferId) && Objects.equals(amount, that.amount) && Objects.equals(operationTarget, that.operationTarget) && Objects.equals(operationDirection, that.operationDirection) && Objects.equals(dependentOperationId, that.dependentOperationId) && Objects.equals(operationStatus, that.operationStatus) && Objects.equals(transactionGroupId, that.transactionGroupId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationId, transferId, amount, operationTarget, operationDirection, dependentOperationId, operationStatus, transactionGroupId);
    }

    @Override
    public String toString() {
        return "DuplicateOperationArgs{" +
                 "operationId='" + operationId + '\'' +
 ", transferId='" + transferId + '\'' +
 ", amount='" + amount + '\'' +
 ", operationTarget='" + operationTarget + '\'' +
 ", operationDirection='" + operationDirection + '\'' +
 ", dependentOperationId='" + dependentOperationId + '\'' +
 ", operationStatus='" + operationStatus + '\'' +
 ", transactionGroupId='" + transactionGroupId + '\'' +

                '}';
    }
}