
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.OperationTarget;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.enums.OperationKind;
import com.tib.api.model.enums.TibOperationStatus;
import com.tib.api.model.enums.AcpOperationType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class AdminOperation   {

    
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
 * Gets or sets the operation type reference identifier that categorizes an operation.
 */
    @JsonProperty("OperationTypeRef")
    private String operationTypeRef;

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
 * 
 */
    @JsonProperty("DependentOperationId")
    private String dependentOperationId;

    /**
 * 
 */
    @JsonProperty("TransactionGroupId")
    private String transactionGroupId;

    /**
 * Specifies the category of a financial operation.
 */
    @JsonProperty("OperationKind")
    private OperationKind operationKind;

    /**
 * The date and time when the payment was created.
 */
    @JsonProperty("CreatedDate")
    private LocalDateTime createdDate;

    /**
 * Gets or sets the execution date and time of the transaction.
 */
    @JsonProperty("ExecutedDate")
    private LocalDateTime executedDate;

    /**
 * 
 */
    @JsonProperty("ProcessDate")
    private LocalDateTime processDate;

    /**
 * 
 */
    @JsonProperty("OperationsGroupId")
    private String operationsGroupId;

    /**
 * Retrieves the numeric status code of an operation.
 */
    @JsonProperty("OperationStatus")
    private TibOperationStatus operationStatus;

    /**
 * 
 */
    @JsonProperty("RevertProviderTransactionId")
    private String revertProviderTransactionId;

    /**
 * 
 */
    @JsonProperty("OverloadedMerchantId")
    private String overloadedMerchantId;

    /**
 * 
 */
    @JsonProperty("IsArchived")
    private boolean isArchived;

    /**
 * 
 */
    @JsonProperty("RevertProviderId")
    private String revertProviderId;

    /**
 * 
 */
    @JsonProperty("RevertProviderTransactionAdditionalInfos")
    private String revertProviderTransactionAdditionalInfos;

    /**
 * Retrieves the identifier of the merchant (bank account) to which the operation applies.
 */
    @JsonProperty("RelatedMerchantId")
    private String relatedMerchantId;

    /**
 * Identifies the customer linked to this payment, when a customer relationship exists.
 */
    @JsonProperty("RelatedCustomerId")
    private String relatedCustomerId;

    /**
 * 
 */
    @JsonProperty("IsChecked")
    private boolean isChecked;

    /**
 * 
 */
    @JsonProperty("AcpTransactionType")
    private AcpOperationType acpTransactionType;

    /**
 * 
 */
    @JsonProperty("OperationTargetValue")
    private String operationTargetValue;

    /**
 * 
 */
    @JsonProperty("CurrencyValue")
    private String currencyValue;

    /**
 * 
 */
    @JsonProperty("OperationDirectionValue")
    private String operationDirectionValue;

    /**
 * 
 */
    @JsonProperty("OperationStatusValue")
    private String operationStatusValue;

    /**
 * 
 */
    @JsonProperty("OperationKindValue")
    private String operationKindValue;

    /**
 * 
 */
    @JsonProperty("AcpTransactionTypeValue")
    private String acpTransactionTypeValue;


    
    public AdminOperation() {
    }

    
    public AdminOperation(String operationId, String transferId, String operationTypeRef, Double amount, Currency currency, OperationTarget operationTarget, TransferDirection operationDirection, String dependentOperationId, String transactionGroupId, OperationKind operationKind, LocalDateTime createdDate, LocalDateTime executedDate, LocalDateTime processDate, String operationsGroupId, TibOperationStatus operationStatus, String revertProviderTransactionId, String overloadedMerchantId, boolean isArchived, String revertProviderId, String revertProviderTransactionAdditionalInfos, String relatedMerchantId, String relatedCustomerId, boolean isChecked, AcpOperationType acpTransactionType, String operationTargetValue, String currencyValue, String operationDirectionValue, String operationStatusValue, String operationKindValue, String acpTransactionTypeValue) {
        this.operationId = operationId;
this.transferId = transferId;
this.operationTypeRef = operationTypeRef;
this.amount = amount;
this.currency = currency;
this.operationTarget = operationTarget;
this.operationDirection = operationDirection;
this.dependentOperationId = dependentOperationId;
this.transactionGroupId = transactionGroupId;
this.operationKind = operationKind;
this.createdDate = createdDate;
this.executedDate = executedDate;
this.processDate = processDate;
this.operationsGroupId = operationsGroupId;
this.operationStatus = operationStatus;
this.revertProviderTransactionId = revertProviderTransactionId;
this.overloadedMerchantId = overloadedMerchantId;
this.isArchived = isArchived;
this.revertProviderId = revertProviderId;
this.revertProviderTransactionAdditionalInfos = revertProviderTransactionAdditionalInfos;
this.relatedMerchantId = relatedMerchantId;
this.relatedCustomerId = relatedCustomerId;
this.isChecked = isChecked;
this.acpTransactionType = acpTransactionType;
this.operationTargetValue = operationTargetValue;
this.currencyValue = currencyValue;
this.operationDirectionValue = operationDirectionValue;
this.operationStatusValue = operationStatusValue;
this.operationKindValue = operationKindValue;
this.acpTransactionTypeValue = acpTransactionTypeValue;

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

    public String getDependentOperationId() {
        return dependentOperationId;
    }

    public void setDependentOperationId(String dependentOperationId) {
        this.dependentOperationId = dependentOperationId;
    }

    public String getTransactionGroupId() {
        return transactionGroupId;
    }

    public void setTransactionGroupId(String transactionGroupId) {
        this.transactionGroupId = transactionGroupId;
    }

    public OperationKind getOperationKind() {
        return operationKind;
    }

    public void setOperationKind(OperationKind operationKind) {
        this.operationKind = operationKind;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getExecutedDate() {
        return executedDate;
    }

    public void setExecutedDate(LocalDateTime executedDate) {
        this.executedDate = executedDate;
    }

    public LocalDateTime getProcessDate() {
        return processDate;
    }

    public void setProcessDate(LocalDateTime processDate) {
        this.processDate = processDate;
    }

    public String getOperationsGroupId() {
        return operationsGroupId;
    }

    public void setOperationsGroupId(String operationsGroupId) {
        this.operationsGroupId = operationsGroupId;
    }

    public TibOperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(TibOperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getRevertProviderTransactionId() {
        return revertProviderTransactionId;
    }

    public void setRevertProviderTransactionId(String revertProviderTransactionId) {
        this.revertProviderTransactionId = revertProviderTransactionId;
    }

    public String getOverloadedMerchantId() {
        return overloadedMerchantId;
    }

    public void setOverloadedMerchantId(String overloadedMerchantId) {
        this.overloadedMerchantId = overloadedMerchantId;
    }

    public boolean getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(boolean isArchived) {
        this.isArchived = isArchived;
    }

    public String getRevertProviderId() {
        return revertProviderId;
    }

    public void setRevertProviderId(String revertProviderId) {
        this.revertProviderId = revertProviderId;
    }

    public String getRevertProviderTransactionAdditionalInfos() {
        return revertProviderTransactionAdditionalInfos;
    }

    public void setRevertProviderTransactionAdditionalInfos(String revertProviderTransactionAdditionalInfos) {
        this.revertProviderTransactionAdditionalInfos = revertProviderTransactionAdditionalInfos;
    }

    public String getRelatedMerchantId() {
        return relatedMerchantId;
    }

    public void setRelatedMerchantId(String relatedMerchantId) {
        this.relatedMerchantId = relatedMerchantId;
    }

    public String getRelatedCustomerId() {
        return relatedCustomerId;
    }

    public void setRelatedCustomerId(String relatedCustomerId) {
        this.relatedCustomerId = relatedCustomerId;
    }

    public boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public AcpOperationType getAcpTransactionType() {
        return acpTransactionType;
    }

    public void setAcpTransactionType(AcpOperationType acpTransactionType) {
        this.acpTransactionType = acpTransactionType;
    }

    public String getOperationTargetValue() {
        return operationTargetValue;
    }

    public void setOperationTargetValue(String operationTargetValue) {
        this.operationTargetValue = operationTargetValue;
    }

    public String getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
    }

    public String getOperationDirectionValue() {
        return operationDirectionValue;
    }

    public void setOperationDirectionValue(String operationDirectionValue) {
        this.operationDirectionValue = operationDirectionValue;
    }

    public String getOperationStatusValue() {
        return operationStatusValue;
    }

    public void setOperationStatusValue(String operationStatusValue) {
        this.operationStatusValue = operationStatusValue;
    }

    public String getOperationKindValue() {
        return operationKindValue;
    }

    public void setOperationKindValue(String operationKindValue) {
        this.operationKindValue = operationKindValue;
    }

    public String getAcpTransactionTypeValue() {
        return acpTransactionTypeValue;
    }

    public void setAcpTransactionTypeValue(String acpTransactionTypeValue) {
        this.acpTransactionTypeValue = acpTransactionTypeValue;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminOperation that = (AdminOperation) o;
        return Objects.equals(operationId, that.operationId) && Objects.equals(transferId, that.transferId) && Objects.equals(operationTypeRef, that.operationTypeRef) && Objects.equals(amount, that.amount) && Objects.equals(currency, that.currency) && Objects.equals(operationTarget, that.operationTarget) && Objects.equals(operationDirection, that.operationDirection) && Objects.equals(dependentOperationId, that.dependentOperationId) && Objects.equals(transactionGroupId, that.transactionGroupId) && Objects.equals(operationKind, that.operationKind) && Objects.equals(createdDate, that.createdDate) && Objects.equals(executedDate, that.executedDate) && Objects.equals(processDate, that.processDate) && Objects.equals(operationsGroupId, that.operationsGroupId) && Objects.equals(operationStatus, that.operationStatus) && Objects.equals(revertProviderTransactionId, that.revertProviderTransactionId) && Objects.equals(overloadedMerchantId, that.overloadedMerchantId) && Objects.equals(isArchived, that.isArchived) && Objects.equals(revertProviderId, that.revertProviderId) && Objects.equals(revertProviderTransactionAdditionalInfos, that.revertProviderTransactionAdditionalInfos) && Objects.equals(relatedMerchantId, that.relatedMerchantId) && Objects.equals(relatedCustomerId, that.relatedCustomerId) && Objects.equals(isChecked, that.isChecked) && Objects.equals(acpTransactionType, that.acpTransactionType) && Objects.equals(operationTargetValue, that.operationTargetValue) && Objects.equals(currencyValue, that.currencyValue) && Objects.equals(operationDirectionValue, that.operationDirectionValue) && Objects.equals(operationStatusValue, that.operationStatusValue) && Objects.equals(operationKindValue, that.operationKindValue) && Objects.equals(acpTransactionTypeValue, that.acpTransactionTypeValue) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationId, transferId, operationTypeRef, amount, currency, operationTarget, operationDirection, dependentOperationId, transactionGroupId, operationKind, createdDate, executedDate, processDate, operationsGroupId, operationStatus, revertProviderTransactionId, overloadedMerchantId, isArchived, revertProviderId, revertProviderTransactionAdditionalInfos, relatedMerchantId, relatedCustomerId, isChecked, acpTransactionType, operationTargetValue, currencyValue, operationDirectionValue, operationStatusValue, operationKindValue, acpTransactionTypeValue);
    }

    @Override
    public String toString() {
        return "AdminOperation{" +
                 "operationId='" + operationId + '\'' +
 ", transferId='" + transferId + '\'' +
 ", operationTypeRef='" + operationTypeRef + '\'' +
 ", amount='" + amount + '\'' +
 ", currency='" + currency + '\'' +
 ", operationTarget='" + operationTarget + '\'' +
 ", operationDirection='" + operationDirection + '\'' +
 ", dependentOperationId='" + dependentOperationId + '\'' +
 ", transactionGroupId='" + transactionGroupId + '\'' +
 ", operationKind='" + operationKind + '\'' +
 ", createdDate='" + createdDate + '\'' +
 ", executedDate='" + executedDate + '\'' +
 ", processDate='" + processDate + '\'' +
 ", operationsGroupId='" + operationsGroupId + '\'' +
 ", operationStatus='" + operationStatus + '\'' +
 ", revertProviderTransactionId='" + revertProviderTransactionId + '\'' +
 ", overloadedMerchantId='" + overloadedMerchantId + '\'' +
 ", isArchived='" + isArchived + '\'' +
 ", revertProviderId='" + revertProviderId + '\'' +
 ", revertProviderTransactionAdditionalInfos='" + revertProviderTransactionAdditionalInfos + '\'' +
 ", relatedMerchantId='" + relatedMerchantId + '\'' +
 ", relatedCustomerId='" + relatedCustomerId + '\'' +
 ", isChecked='" + isChecked + '\'' +
 ", acpTransactionType='" + acpTransactionType + '\'' +
 ", operationTargetValue='" + operationTargetValue + '\'' +
 ", currencyValue='" + currencyValue + '\'' +
 ", operationDirectionValue='" + operationDirectionValue + '\'' +
 ", operationStatusValue='" + operationStatusValue + '\'' +
 ", operationKindValue='" + operationKindValue + '\'' +
 ", acpTransactionTypeValue='" + acpTransactionTypeValue + '\'' +

                '}';
    }
}