
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


public class TransactionCommon   {

    
    /**
 * Specifies the target of an operation, indicating whether the operation pertains to the merchant or the customer.
 */
    @JsonProperty("OperationTarget")
    private OperationTarget operationTarget;

    /**
 * Specifies the operation category used throughout the API.
 */
    @JsonProperty("OperationType")
    private OperationType operationType;

    /**
 * Specifies the direction of the operation, indicating whether funds are being collected or deposited.
 */
    @JsonProperty("OperationDirection")
    private TransferDirection operationDirection;

    /**
 * Represents the current state of a transaction within the system.
 */
    @JsonProperty("Status")
    private OperationStatus status;

    /**
 * Provides a detailed explanation of the function's purpose and usage within the API.
 */
    @JsonProperty("Description")
    private String description;

    /**
 * Gets or sets the result of a banking operation as defined by the BankingOperationResultEnum.
 */
    @JsonProperty("BankingOperationResult")
    private BankingOperationResult bankingOperationResult;

    /**
 * Gets or sets the textual description of the bank associated with the transaction.
 */
    @JsonProperty("BankDescription")
    private String bankDescription;

    /**
 * Represents the name associated with the merchant's account.
 */
    @JsonProperty("AccountName")
    private String accountName;

    /**
 * Gets or sets the preview text for a merchant account.
 */
    @JsonProperty("AccoutPreview")
    private String accoutPreview;

    /**
 * Specifies the payment method type associated with the account.
 */
    @JsonProperty("AccountType")
    private PaymentMethodType accountType;

    /**
 * Gets or sets the description associated with a transaction.
 */
    @JsonProperty("TransactionDescription")
    private String transactionDescription;

    /**
 * Retrieves or assigns the due date for a transaction.
 */
    @JsonProperty("TransactionDueDate")
    private LocalDateTime transactionDueDate;

    /**
 * Gets or sets the timestamp indicating when the entity was last modified.
 */
    @JsonProperty("LastModifiedDate")
    private LocalDateTime lastModifiedDate;


    
    public TransactionCommon() {
    }

    
    public TransactionCommon(OperationTarget operationTarget, OperationType operationType, TransferDirection operationDirection, OperationStatus status, String description, BankingOperationResult bankingOperationResult, String bankDescription, String accountName, String accoutPreview, PaymentMethodType accountType, String transactionDescription, LocalDateTime transactionDueDate, LocalDateTime lastModifiedDate) {
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

    public LocalDateTime getTransactionDueDate() {
        return transactionDueDate;
    }

    public void setTransactionDueDate(LocalDateTime transactionDueDate) {
        this.transactionDueDate = transactionDueDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
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