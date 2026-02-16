
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.OperationType;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.enums.OperationStatus;
import com.tib.api.model.enums.AccountType;
import com.tib.api.model.enums.AcpOperationType;
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


public class AdminTransaction   {

    
    /**
     * 
     */
    @JsonProperty("TransactionId")
    private String transactionId;

    /**
     * 
     */
    @JsonProperty("TransactionGroupId")
    private String transactionGroupId;

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
     * Retrieves the numeric status code of an operation.
     */
    @JsonProperty("OperationStatus")
    private OperationStatus operationStatus;

    /**
     * Provides a detailed explanation of the function's purpose and usage within the API.
     */
    @JsonProperty("Description")
    private String description;

    /**
     * 
     */
    @JsonProperty("DescriptionCode")
    private Integer descriptionCode;

    /**
     * 
     */
    @JsonProperty("ProviderTransactionId")
    private String providerTransactionId;

    /**
     * 
     */
    @JsonProperty("ProviderTransactionGroupId")
    private String providerTransactionGroupId;

    /**
     * The date and time when the payment was created.
     */
    @JsonProperty("CreatedDate")
    private LocalDateTime createdDate;

    /**
     * 
     */
    @JsonProperty("NextStepTransaction")
    private String nextStepTransaction;

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
     * 
     */
    @JsonProperty("AccountInformationId")
    private String accountInformationId;

    /**
     * Specifies the payment method type associated with the account.
     */
    @JsonProperty("AccountType")
    private AccountType accountType;

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
     * 
     */
    @JsonProperty("AcpTransactionType")
    private AcpOperationType acpTransactionType;

    /**
     * 
     */
    @JsonProperty("ReceivedDescription")
    private String receivedDescription;

    /**
     * 
     */
    @JsonProperty("RealDueDate")
    private LocalDateTime realDueDate;

    /**
     * 
     */
    @JsonProperty("DueDateUpdatedDate")
    private LocalDateTime dueDateUpdatedDate;

    /**
     * 
     */
    @JsonProperty("ProcessExecuted")
    private boolean processExecuted;

    /**
     * Gets or sets the timestamp indicating when the entity was last modified.
     */
    @JsonProperty("LastModifiedDate")
    private LocalDateTime lastModifiedDate;

    /**
     * 
     */
    @JsonProperty("ExportBeenExecuted")
    private boolean exportBeenExecuted;

    /**
     * 
     */
    @JsonProperty("IsRevert")
    private boolean isRevert;

    /**
     * 
     */
    @JsonProperty("IsArchived")
    private boolean isArchived;

    /**
     * 
     */
    @JsonProperty("FavoriteProviderId")
    private String favoriteProviderId;

    /**
     * 
     */
    @JsonProperty("ExecutedByProviderId")
    private String executedByProviderId;

    /**
     * Specifies the category of a financial operation.
     */
    @JsonProperty("OperationKind")
    private OperationKind operationKind;

    /**
     * 
     */
    @JsonProperty("ProviderTransactionAdditionalInfos")
    private String providerTransactionAdditionalInfos;

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
    @JsonProperty("MerchantIds")
    private List<String> merchantIds;

    /**
     * 
     */
    @JsonProperty("CustomerIds")
    private List<String> customerIds;

    /**
     * 
     */
    @JsonProperty("TransferIds")
    private List<String> transferIds;

    /**
     * 
     */
    @JsonProperty("OperationIds")
    private List<String> operationIds;

    /**
     * 
     */
    @JsonProperty("OperationTypeValue")
    private String operationTypeValue;

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
    @JsonProperty("AccountTypeValue")
    private String accountTypeValue;

    /**
     * 
     */
    @JsonProperty("AcpTransactionTypeValue")
    private String acpTransactionTypeValue;


    
    public AdminTransaction() {
    }

    
    public AdminTransaction(String transactionId, String transactionGroupId, OperationType operationType, TransferDirection operationDirection, OperationStatus operationStatus, String description, Integer descriptionCode, String providerTransactionId, String providerTransactionGroupId, LocalDateTime createdDate, String nextStepTransaction, String accountName, String accoutPreview, String accountInformationId, AccountType accountType, String transactionDescription, LocalDateTime transactionDueDate, AcpOperationType acpTransactionType, String receivedDescription, LocalDateTime realDueDate, LocalDateTime dueDateUpdatedDate, boolean processExecuted, LocalDateTime lastModifiedDate, boolean exportBeenExecuted, boolean isRevert, boolean isArchived, String favoriteProviderId, String executedByProviderId, OperationKind operationKind, String providerTransactionAdditionalInfos, String operationId, String transferId, String relatedMerchantId, String relatedCustomerId, boolean isChecked, List<String> merchantIds, List<String> customerIds, List<String> transferIds, List<String> operationIds, String operationTypeValue, String operationDirectionValue, String operationStatusValue, String operationKindValue, String accountTypeValue, String acpTransactionTypeValue) {
        this.transactionId = transactionId;
        this.transactionGroupId = transactionGroupId;
        this.operationType = operationType;
        this.operationDirection = operationDirection;
        this.operationStatus = operationStatus;
        this.description = description;
        this.descriptionCode = descriptionCode;
        this.providerTransactionId = providerTransactionId;
        this.providerTransactionGroupId = providerTransactionGroupId;
        this.createdDate = createdDate;
        this.nextStepTransaction = nextStepTransaction;
        this.accountName = accountName;
        this.accoutPreview = accoutPreview;
        this.accountInformationId = accountInformationId;
        this.accountType = accountType;
        this.transactionDescription = transactionDescription;
        this.transactionDueDate = transactionDueDate;
        this.acpTransactionType = acpTransactionType;
        this.receivedDescription = receivedDescription;
        this.realDueDate = realDueDate;
        this.dueDateUpdatedDate = dueDateUpdatedDate;
        this.processExecuted = processExecuted;
        this.lastModifiedDate = lastModifiedDate;
        this.exportBeenExecuted = exportBeenExecuted;
        this.isRevert = isRevert;
        this.isArchived = isArchived;
        this.favoriteProviderId = favoriteProviderId;
        this.executedByProviderId = executedByProviderId;
        this.operationKind = operationKind;
        this.providerTransactionAdditionalInfos = providerTransactionAdditionalInfos;
        this.operationId = operationId;
        this.transferId = transferId;
        this.relatedMerchantId = relatedMerchantId;
        this.relatedCustomerId = relatedCustomerId;
        this.isChecked = isChecked;
        this.merchantIds = merchantIds;
        this.customerIds = customerIds;
        this.transferIds = transferIds;
        this.operationIds = operationIds;
        this.operationTypeValue = operationTypeValue;
        this.operationDirectionValue = operationDirectionValue;
        this.operationStatusValue = operationStatusValue;
        this.operationKindValue = operationKindValue;
        this.accountTypeValue = accountTypeValue;
        this.acpTransactionTypeValue = acpTransactionTypeValue;
    }
    
    

    
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionGroupId() {
        return transactionGroupId;
    }

    public void setTransactionGroupId(String transactionGroupId) {
        this.transactionGroupId = transactionGroupId;
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

    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDescriptionCode() {
        return descriptionCode;
    }

    public void setDescriptionCode(Integer descriptionCode) {
        this.descriptionCode = descriptionCode;
    }

    public String getProviderTransactionId() {
        return providerTransactionId;
    }

    public void setProviderTransactionId(String providerTransactionId) {
        this.providerTransactionId = providerTransactionId;
    }

    public String getProviderTransactionGroupId() {
        return providerTransactionGroupId;
    }

    public void setProviderTransactionGroupId(String providerTransactionGroupId) {
        this.providerTransactionGroupId = providerTransactionGroupId;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getNextStepTransaction() {
        return nextStepTransaction;
    }

    public void setNextStepTransaction(String nextStepTransaction) {
        this.nextStepTransaction = nextStepTransaction;
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

    public String getAccountInformationId() {
        return accountInformationId;
    }

    public void setAccountInformationId(String accountInformationId) {
        this.accountInformationId = accountInformationId;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
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

    public AcpOperationType getAcpTransactionType() {
        return acpTransactionType;
    }

    public void setAcpTransactionType(AcpOperationType acpTransactionType) {
        this.acpTransactionType = acpTransactionType;
    }

    public String getReceivedDescription() {
        return receivedDescription;
    }

    public void setReceivedDescription(String receivedDescription) {
        this.receivedDescription = receivedDescription;
    }

    public LocalDateTime getRealDueDate() {
        return realDueDate;
    }

    public void setRealDueDate(LocalDateTime realDueDate) {
        this.realDueDate = realDueDate;
    }

    public LocalDateTime getDueDateUpdatedDate() {
        return dueDateUpdatedDate;
    }

    public void setDueDateUpdatedDate(LocalDateTime dueDateUpdatedDate) {
        this.dueDateUpdatedDate = dueDateUpdatedDate;
    }

    public boolean getProcessExecuted() {
        return processExecuted;
    }

    public void setProcessExecuted(boolean processExecuted) {
        this.processExecuted = processExecuted;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public boolean getExportBeenExecuted() {
        return exportBeenExecuted;
    }

    public void setExportBeenExecuted(boolean exportBeenExecuted) {
        this.exportBeenExecuted = exportBeenExecuted;
    }

    public boolean getIsRevert() {
        return isRevert;
    }

    public void setIsRevert(boolean isRevert) {
        this.isRevert = isRevert;
    }

    public boolean getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(boolean isArchived) {
        this.isArchived = isArchived;
    }

    public String getFavoriteProviderId() {
        return favoriteProviderId;
    }

    public void setFavoriteProviderId(String favoriteProviderId) {
        this.favoriteProviderId = favoriteProviderId;
    }

    public String getExecutedByProviderId() {
        return executedByProviderId;
    }

    public void setExecutedByProviderId(String executedByProviderId) {
        this.executedByProviderId = executedByProviderId;
    }

    public OperationKind getOperationKind() {
        return operationKind;
    }

    public void setOperationKind(OperationKind operationKind) {
        this.operationKind = operationKind;
    }

    public String getProviderTransactionAdditionalInfos() {
        return providerTransactionAdditionalInfos;
    }

    public void setProviderTransactionAdditionalInfos(String providerTransactionAdditionalInfos) {
        this.providerTransactionAdditionalInfos = providerTransactionAdditionalInfos;
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

    public List<String> getMerchantIds() {
        return merchantIds;
    }

    public void setMerchantIds(List<String> merchantIds) {
        this.merchantIds = merchantIds;
    }

    public List<String> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
    }

    public List<String> getTransferIds() {
        return transferIds;
    }

    public void setTransferIds(List<String> transferIds) {
        this.transferIds = transferIds;
    }

    public List<String> getOperationIds() {
        return operationIds;
    }

    public void setOperationIds(List<String> operationIds) {
        this.operationIds = operationIds;
    }

    public String getOperationTypeValue() {
        return operationTypeValue;
    }

    public void setOperationTypeValue(String operationTypeValue) {
        this.operationTypeValue = operationTypeValue;
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

    public String getAccountTypeValue() {
        return accountTypeValue;
    }

    public void setAccountTypeValue(String accountTypeValue) {
        this.accountTypeValue = accountTypeValue;
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
        AdminTransaction that = (AdminTransaction) o;
        return Objects.equals(transactionId, that.transactionId) && Objects.equals(transactionGroupId, that.transactionGroupId) && Objects.equals(operationType, that.operationType) && Objects.equals(operationDirection, that.operationDirection) && Objects.equals(operationStatus, that.operationStatus) && Objects.equals(description, that.description) && Objects.equals(descriptionCode, that.descriptionCode) && Objects.equals(providerTransactionId, that.providerTransactionId) && Objects.equals(providerTransactionGroupId, that.providerTransactionGroupId) && Objects.equals(createdDate, that.createdDate) && Objects.equals(nextStepTransaction, that.nextStepTransaction) && Objects.equals(accountName, that.accountName) && Objects.equals(accoutPreview, that.accoutPreview) && Objects.equals(accountInformationId, that.accountInformationId) && Objects.equals(accountType, that.accountType) && Objects.equals(transactionDescription, that.transactionDescription) && Objects.equals(transactionDueDate, that.transactionDueDate) && Objects.equals(acpTransactionType, that.acpTransactionType) && Objects.equals(receivedDescription, that.receivedDescription) && Objects.equals(realDueDate, that.realDueDate) && Objects.equals(dueDateUpdatedDate, that.dueDateUpdatedDate) && Objects.equals(processExecuted, that.processExecuted) && Objects.equals(lastModifiedDate, that.lastModifiedDate) && Objects.equals(exportBeenExecuted, that.exportBeenExecuted) && Objects.equals(isRevert, that.isRevert) && Objects.equals(isArchived, that.isArchived) && Objects.equals(favoriteProviderId, that.favoriteProviderId) && Objects.equals(executedByProviderId, that.executedByProviderId) && Objects.equals(operationKind, that.operationKind) && Objects.equals(providerTransactionAdditionalInfos, that.providerTransactionAdditionalInfos) && Objects.equals(operationId, that.operationId) && Objects.equals(transferId, that.transferId) && Objects.equals(relatedMerchantId, that.relatedMerchantId) && Objects.equals(relatedCustomerId, that.relatedCustomerId) && Objects.equals(isChecked, that.isChecked) && Objects.equals(merchantIds, that.merchantIds) && Objects.equals(customerIds, that.customerIds) && Objects.equals(transferIds, that.transferIds) && Objects.equals(operationIds, that.operationIds) && Objects.equals(operationTypeValue, that.operationTypeValue) && Objects.equals(operationDirectionValue, that.operationDirectionValue) && Objects.equals(operationStatusValue, that.operationStatusValue) && Objects.equals(operationKindValue, that.operationKindValue) && Objects.equals(accountTypeValue, that.accountTypeValue) && Objects.equals(acpTransactionTypeValue, that.acpTransactionTypeValue) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactionId, transactionGroupId, operationType, operationDirection, operationStatus, description, descriptionCode, providerTransactionId, providerTransactionGroupId, createdDate, nextStepTransaction, accountName, accoutPreview, accountInformationId, accountType, transactionDescription, transactionDueDate, acpTransactionType, receivedDescription, realDueDate, dueDateUpdatedDate, processExecuted, lastModifiedDate, exportBeenExecuted, isRevert, isArchived, favoriteProviderId, executedByProviderId, operationKind, providerTransactionAdditionalInfos, operationId, transferId, relatedMerchantId, relatedCustomerId, isChecked, merchantIds, customerIds, transferIds, operationIds, operationTypeValue, operationDirectionValue, operationStatusValue, operationKindValue, accountTypeValue, acpTransactionTypeValue);
    }

    @Override
    public String toString() {
        return "AdminTransaction{" +
                "transactionId='" + transactionId + '\'' +
                ", transactionGroupId='" + transactionGroupId + '\'' +
                ", operationType='" + operationType + '\'' +
                ", operationDirection='" + operationDirection + '\'' +
                ", operationStatus='" + operationStatus + '\'' +
                ", description='" + description + '\'' +
                ", descriptionCode='" + descriptionCode + '\'' +
                ", providerTransactionId='" + providerTransactionId + '\'' +
                ", providerTransactionGroupId='" + providerTransactionGroupId + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", nextStepTransaction='" + nextStepTransaction + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accoutPreview='" + accoutPreview + '\'' +
                ", accountInformationId='" + accountInformationId + '\'' +
                ", accountType='" + accountType + '\'' +
                ", transactionDescription='" + transactionDescription + '\'' +
                ", transactionDueDate='" + transactionDueDate + '\'' +
                ", acpTransactionType='" + acpTransactionType + '\'' +
                ", receivedDescription='" + receivedDescription + '\'' +
                ", realDueDate='" + realDueDate + '\'' +
                ", dueDateUpdatedDate='" + dueDateUpdatedDate + '\'' +
                ", processExecuted='" + processExecuted + '\'' +
                ", lastModifiedDate='" + lastModifiedDate + '\'' +
                ", exportBeenExecuted='" + exportBeenExecuted + '\'' +
                ", isRevert='" + isRevert + '\'' +
                ", isArchived='" + isArchived + '\'' +
                ", favoriteProviderId='" + favoriteProviderId + '\'' +
                ", executedByProviderId='" + executedByProviderId + '\'' +
                ", operationKind='" + operationKind + '\'' +
                ", providerTransactionAdditionalInfos='" + providerTransactionAdditionalInfos + '\'' +
                ", operationId='" + operationId + '\'' +
                ", transferId='" + transferId + '\'' +
                ", relatedMerchantId='" + relatedMerchantId + '\'' +
                ", relatedCustomerId='" + relatedCustomerId + '\'' +
                ", isChecked='" + isChecked + '\'' +
                ", merchantIds='" + merchantIds + '\'' +
                ", customerIds='" + customerIds + '\'' +
                ", transferIds='" + transferIds + '\'' +
                ", operationIds='" + operationIds + '\'' +
                ", operationTypeValue='" + operationTypeValue + '\'' +
                ", operationDirectionValue='" + operationDirectionValue + '\'' +
                ", operationStatusValue='" + operationStatusValue + '\'' +
                ", operationKindValue='" + operationKindValue + '\'' +
                ", accountTypeValue='" + accountTypeValue + '\'' +
                ", acpTransactionTypeValue='" + acpTransactionTypeValue + '\'' +

                '}';
    }
}