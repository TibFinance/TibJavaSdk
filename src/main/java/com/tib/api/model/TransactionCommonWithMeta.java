
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.OperationTarget;
import com.tib.api.model.enums.OperationType;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.enums.OperationStatus;
import com.tib.api.model.enums.BankingOperationResult;
import com.tib.api.model.enums.PaymentMethodType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransactionCommonWithMeta  extends TransactionCommon  {

    
    /**
     * Gets or sets the transaction identifier.
     */
    @JsonProperty("TransactionId")
    private String transactionId;

    /**
     * Gets or sets the transaction amount.
     */
    @JsonProperty("TransactionAmount")
    private Double transactionAmount;


    
    public TransactionCommonWithMeta() {
    }

    
    public TransactionCommonWithMeta(String transactionId, Double transactionAmount) {
        this.transactionId = transactionId;
        this.transactionAmount = transactionAmount;
    }
    
    
    public TransactionCommonWithMeta(OperationTarget operationTarget, OperationType operationType, TransferDirection operationDirection, OperationStatus status, String description, BankingOperationResult bankingOperationResult, String bankDescription, String accountName, String accoutPreview, PaymentMethodType accountType, String transactionDescription, LocalDateTime transactionDueDate, LocalDateTime lastModifiedDate, String transactionId, Double transactionAmount) {
        super(operationTarget, operationType, operationDirection, status, description, bankingOperationResult, bankDescription, accountName, accoutPreview, accountType, transactionDescription, transactionDueDate, lastModifiedDate);
        this.transactionId = transactionId;
        this.transactionAmount = transactionAmount;
    }

    
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionCommonWithMeta that = (TransactionCommonWithMeta) o;
        return Objects.equals(transactionId, that.transactionId) && Objects.equals(transactionAmount, that.transactionAmount) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactionId, transactionAmount);
    }

    @Override
    public String toString() {
        return "TransactionCommonWithMeta{" +
                "transactionId='" + transactionId + '\'' +
                ", transactionAmount='" + transactionAmount + '\'' +

                '}';
    }
}