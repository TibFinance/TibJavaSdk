
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.OperationTarget;
import com.tib.api.model.enums.OperationType;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.enums.OperationStatus;
import com.tib.api.model.enums.BankingOperationResult;
import com.tib.api.model.enums.PaymentMethodType;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransactionCommon   {

    
    /**
     * Specifies the destination entity of the transfer returned by ListTransfers
     */
    @JsonProperty("OperationTarget")
    private OperationTarget operationTarget;

    /**
     * The kind of operation the transfer represents
     */
    @JsonProperty("OperationType")
    private OperationType operationType;

    /**
     * Indicates whether the listed transfer is inbound to or outbound from the queried account
     */
    @JsonProperty("OperationDirection")
    private TransferDirection operationDirection;

    /**
     * Indicates the current status of the transfer operation.
     */
    @JsonProperty("Status")
    private OperationStatus status;

    /**
     * Human‑readable description of the transfer
     */
    @JsonProperty("Description")
    private String description;

    /**
     * Indicates the outcome of the banking operation for each listed transfer
     */
    @JsonProperty("BankingOperationResult")
    private BankingOperationResult bankingOperationResult;

    /**
     * The name of the bank associated with the transfer.
     */
    @JsonProperty("BankDescription")
    private String bankDescription;

    /**
     * The display name of the account involved in the transfer.
     */
    @JsonProperty("AccountName")
    private String accountName;

    /**
     * A short preview of the account involved in the transfer.
     */
    @JsonProperty("AccoutPreview")
    private String accoutPreview;

    /**
     * The type of payment method used for the transfer.
     */
    @JsonProperty("AccountType")
    private PaymentMethodType accountType;

    /**
     * A free‑form text describing the purpose or details of the transfer.
     */
    @JsonProperty("TransactionDescription")
    private String transactionDescription;

    /**
     * The scheduled date and time when the listed transfer is due to be executed.
     */
    @JsonProperty("TransactionDueDate")
    private OffsetDateTime transactionDueDate;

    /**
     * The date and time when the transfer record was last modified.
     */
    @JsonProperty("LastModifiedDate")
    private OffsetDateTime lastModifiedDate;


    
    public TransactionCommon() {
    }

    
    public TransactionCommon(OperationTarget operationTarget, OperationType operationType, TransferDirection operationDirection, OperationStatus status, String description, BankingOperationResult bankingOperationResult, String bankDescription, String accountName, String accoutPreview, PaymentMethodType accountType, String transactionDescription, OffsetDateTime transactionDueDate, OffsetDateTime lastModifiedDate) {
        this.operationTarget = operationTarget;
        this.operationType = operationType;
        this.operationDirection = operationDirection;
        this.status = status;
        this.description = description;
        this.bankingOperationResult = bankingOperationResult;
        this.bankDescription = bankDescription;
        this.accountName = accountName;
        this.accoutPreview = accoutPreview;
        this.accountType = accountType;
        this.transactionDescription = transactionDescription;
        this.transactionDueDate = transactionDueDate;
        this.lastModifiedDate = lastModifiedDate;
    }
    
    

    
    public OperationTarget getOperationTarget() {
        return operationTarget;
    }

    public void setOperationTarget(OperationTarget operationTarget) {
        this.operationTarget = operationTarget;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public TransferDirection getOperationDirection() {
        return operationDirection;
    }

    public void setOperationDirection(TransferDirection operationDirection) {
        this.operationDirection = operationDirection;
    }

    public OperationStatus getStatus() {
        return status;
    }

    public void setStatus(OperationStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BankingOperationResult getBankingOperationResult() {
        return bankingOperationResult;
    }

    public void setBankingOperationResult(BankingOperationResult bankingOperationResult) {
        this.bankingOperationResult = bankingOperationResult;
    }

    public String getBankDescription() {
        return bankDescription;
    }

    public void setBankDescription(String bankDescription) {
        this.bankDescription = bankDescription;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccoutPreview() {
        return accoutPreview;
    }

    public void setAccoutPreview(String accoutPreview) {
        this.accoutPreview = accoutPreview;
    }

    public PaymentMethodType getAccountType() {
        return accountType;
    }

    public void setAccountType(PaymentMethodType accountType) {
        this.accountType = accountType;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public OffsetDateTime getTransactionDueDate() {
        return transactionDueDate;
    }

    public void setTransactionDueDate(OffsetDateTime transactionDueDate) {
        this.transactionDueDate = transactionDueDate;
    }

    public OffsetDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionCommon that = (TransactionCommon) o;
        return Objects.equals(operationTarget, that.operationTarget) && Objects.equals(operationType, that.operationType) && Objects.equals(operationDirection, that.operationDirection) && Objects.equals(status, that.status) && Objects.equals(description, that.description) && Objects.equals(bankingOperationResult, that.bankingOperationResult) && Objects.equals(bankDescription, that.bankDescription) && Objects.equals(accountName, that.accountName) && Objects.equals(accoutPreview, that.accoutPreview) && Objects.equals(accountType, that.accountType) && Objects.equals(transactionDescription, that.transactionDescription) && Objects.equals(transactionDueDate, that.transactionDueDate) && Objects.equals(lastModifiedDate, that.lastModifiedDate) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationTarget, operationType, operationDirection, status, description, bankingOperationResult, bankDescription, accountName, accoutPreview, accountType, transactionDescription, transactionDueDate, lastModifiedDate);
    }

    @Override
    public String toString() {
        return "TransactionCommon{" +
                "operationTarget='" + operationTarget + '\'' +
                ", operationType='" + operationType + '\'' +
                ", operationDirection='" + operationDirection + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                ", bankingOperationResult='" + bankingOperationResult + '\'' +
                ", bankDescription='" + bankDescription + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accoutPreview='" + accoutPreview + '\'' +
                ", accountType='" + accountType + '\'' +
                ", transactionDescription='" + transactionDescription + '\'' +
                ", transactionDueDate='" + transactionDueDate + '\'' +
                ", lastModifiedDate='" + lastModifiedDate + '\'' +

                '}';
    }
}