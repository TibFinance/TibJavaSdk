
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.OperationStatus;
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


public class SetManuallyStatusCheckResultArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * Gets or sets the transaction identifier.
     */
    @JsonProperty("TransactionId")
    private String transactionId;

    /**
     * Retrieves the numeric status code of an operation.
     */
    @JsonProperty("OperationStatus")
    private OperationStatus operationStatus;


    
    public SetManuallyStatusCheckResultArgs() {
    }

    
    public SetManuallyStatusCheckResultArgs(String transactionId, OperationStatus operationStatus) {
        this.transactionId = transactionId;
        this.operationStatus = operationStatus;
    }
    
    
    public SetManuallyStatusCheckResultArgs(String adminSessionToken, String transactionId, OperationStatus operationStatus) {
        super(adminSessionToken);
        this.transactionId = transactionId;
        this.operationStatus = operationStatus;
    }

    
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetManuallyStatusCheckResultArgs that = (SetManuallyStatusCheckResultArgs) o;
        return Objects.equals(transactionId, that.transactionId) && Objects.equals(operationStatus, that.operationStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactionId, operationStatus);
    }

    @Override
    public String toString() {
        return "SetManuallyStatusCheckResultArgs{" +
                "transactionId='" + transactionId + '\'' +
                ", operationStatus='" + operationStatus + '\'' +

                '}';
    }
}