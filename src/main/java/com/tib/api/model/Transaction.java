package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.*;

import java.util.Date;
import java.util.Objects;

public class Transaction {

    @JsonProperty("OperationTarget")
    private OperationTarget operationTarget;

    @JsonProperty("OperationType")
    private OperationType operationType;

    @JsonProperty("OperationDirection")
    private TransferDirection operationDirection;

    @JsonProperty("Status")
    private OperationStatus status;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("BankingOperationResult")
    private BankingOperationResult bankingOperationResult;

    @JsonProperty("BankDescription")
    private String bankDescription;

    @JsonProperty("AccountName")
    private String accountName;

    @JsonProperty("AccoutPreview")
    private String accoutPreview;

    @JsonProperty("AccountType")
    private PaymentMethodType accountType;

    @JsonProperty("TransactionDescription")
    private String transactionDescription;

    @JsonProperty("TransactionDueDate")
    private Date transactionDueDate;

    @JsonProperty("LastModifiedDate")
    private Date lastModifiedDate;

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

    public Date getTransactionDueDate() {
        return transactionDueDate;
    }

    public void setTransactionDueDate(Date transactionDueDate) {
        this.transactionDueDate = transactionDueDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return operationTarget == that.operationTarget &&
                operationType == that.operationType &&
                operationDirection == that.operationDirection &&
                status == that.status &&
                Objects.equals(description, that.description) &&
                bankingOperationResult == that.bankingOperationResult &&
                Objects.equals(bankDescription, that.bankDescription) &&
                Objects.equals(accountName, that.accountName) &&
                Objects.equals(accoutPreview, that.accoutPreview) &&
                accountType == that.accountType &&
                Objects.equals(transactionDescription, that.transactionDescription) &&
                Objects.equals(transactionDueDate, that.transactionDueDate) &&
                Objects.equals(lastModifiedDate, that.lastModifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationTarget, operationType, operationDirection, status, description, bankingOperationResult, bankDescription, accountName, accoutPreview, accountType, transactionDescription, transactionDueDate, lastModifiedDate);
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "operationTarget=" + operationTarget +
                ", operationType=" + operationType +
                ", operationDirection=" + operationDirection +
                ", status=" + status +
                ", description='" + description + '\'' +
                ", bankingOperationResult=" + bankingOperationResult +
                ", bankDescription='" + bankDescription + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accoutPreview='" + accoutPreview + '\'' +
                ", accountType=" + accountType +
                ", transactionDescription='" + transactionDescription + '\'' +
                ", transactionDueDate=" + transactionDueDate +
                ", lastModifiedDate=" + lastModifiedDate +
                '}';
    }
}
