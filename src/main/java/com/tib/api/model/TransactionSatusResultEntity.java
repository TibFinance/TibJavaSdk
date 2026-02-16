
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.OperationStatus;
import com.tib.api.model.enums.BankingOperationResult;
import com.tib.api.model.enums.Provider;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransactionSatusResultEntity   {

    
    /**
     * Retrieves the numeric status code of an operation.
     */
    @JsonProperty("OperationStatus")
    private OperationStatus operationStatus;

    /**
     * Gets or sets the result of a banking operation as defined by the BankingOperationResultEnum.
     */
    @JsonProperty("BankingOperationResult")
    private BankingOperationResult bankingOperationResult;

    /**
     * 
     */
    @JsonProperty("BankingOperationDescription")
    private String bankingOperationDescription;

    /**
     * 
     */
    @JsonProperty("ProviderType")
    private Provider providerType;

    /**
     * Gets or sets the description associated with a transaction.
     */
    @JsonProperty("TransactionDescription")
    private String transactionDescription;

    /**
     * 
     */
    @JsonProperty("ProviderTransactionId")
    private String providerTransactionId;

    /**
     * 
     */
    @JsonProperty("RealDueDate")
    private LocalDateTime realDueDate;


    
    public TransactionSatusResultEntity() {
    }

    
    public TransactionSatusResultEntity(OperationStatus operationStatus, BankingOperationResult bankingOperationResult, String bankingOperationDescription, Provider providerType, String transactionDescription, String providerTransactionId, LocalDateTime realDueDate) {
        this.operationStatus = operationStatus;
        this.bankingOperationResult = bankingOperationResult;
        this.bankingOperationDescription = bankingOperationDescription;
        this.providerType = providerType;
        this.transactionDescription = transactionDescription;
        this.providerTransactionId = providerTransactionId;
        this.realDueDate = realDueDate;
    }
    
    

    
    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public BankingOperationResult getBankingOperationResult() {
        return bankingOperationResult;
    }

    public void setBankingOperationResult(BankingOperationResult bankingOperationResult) {
        this.bankingOperationResult = bankingOperationResult;
    }

    public String getBankingOperationDescription() {
        return bankingOperationDescription;
    }

    public void setBankingOperationDescription(String bankingOperationDescription) {
        this.bankingOperationDescription = bankingOperationDescription;
    }

    public Provider getProviderType() {
        return providerType;
    }

    public void setProviderType(Provider providerType) {
        this.providerType = providerType;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public String getProviderTransactionId() {
        return providerTransactionId;
    }

    public void setProviderTransactionId(String providerTransactionId) {
        this.providerTransactionId = providerTransactionId;
    }

    public LocalDateTime getRealDueDate() {
        return realDueDate;
    }

    public void setRealDueDate(LocalDateTime realDueDate) {
        this.realDueDate = realDueDate;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionSatusResultEntity that = (TransactionSatusResultEntity) o;
        return Objects.equals(operationStatus, that.operationStatus) && Objects.equals(bankingOperationResult, that.bankingOperationResult) && Objects.equals(bankingOperationDescription, that.bankingOperationDescription) && Objects.equals(providerType, that.providerType) && Objects.equals(transactionDescription, that.transactionDescription) && Objects.equals(providerTransactionId, that.providerTransactionId) && Objects.equals(realDueDate, that.realDueDate) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationStatus, bankingOperationResult, bankingOperationDescription, providerType, transactionDescription, providerTransactionId, realDueDate);
    }

    @Override
    public String toString() {
        return "TransactionSatusResultEntity{" +
                "operationStatus='" + operationStatus + '\'' +
                ", bankingOperationResult='" + bankingOperationResult + '\'' +
                ", bankingOperationDescription='" + bankingOperationDescription + '\'' +
                ", providerType='" + providerType + '\'' +
                ", transactionDescription='" + transactionDescription + '\'' +
                ", providerTransactionId='" + providerTransactionId + '\'' +
                ", realDueDate='" + realDueDate + '\'' +

                '}';
    }
}