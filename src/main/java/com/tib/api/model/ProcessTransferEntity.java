
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.AcpOperationType;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.enums.Language;
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


public class ProcessTransferEntity   {

    
    /**
     * Gets or sets the transaction identifier.
     */
    @JsonProperty("TransactionId")
    private String transactionId;

    /**
     * Gets or sets the transaction group identifier.
     */
    @JsonProperty("TransactionGroupId")
    private String transactionGroupId;

    /**
     * Gets or sets the transaction amount.
     */
    @JsonProperty("TransactionAmount")
    private Double transactionAmount;

    /**
     * Retrieves or assigns the currency type used in transactions.
     */
    @JsonProperty("Currency")
    private Currency currency;

    /**
     * Specifies the due date for the payment. If the value is null, the system treats the due date as the current date and time.
     */
    @JsonProperty("DueDate")
    private LocalDateTime dueDate;

    /**
     * Gets or sets the description associated with a transaction.
     */
    @JsonProperty("TransactionDescription")
    private String transactionDescription;

    /**
     * Gets or sets the type of the acp operation.
     */
    @JsonProperty("AcpOperationType")
    private AcpOperationType acpOperationType;

    /**
     * Indicates the direction of an Interac transaction.
     */
    @JsonProperty("TransferDirection")
    private TransferDirection transferDirection;

    /**
     * Gets or sets the favorite provider.
     */
    @JsonProperty("FavoriteProvider")
    private String favoriteProvider;

    /**
     * True determine the transaction is process as "reverting" of existing operation, need to fill AlreadyProcessedProviderInfo.
     */
    @JsonProperty("IsTransactionRevert")
    private boolean isTransactionRevert;

    /**
     * Must be filled when IsTransactionRevert is set to true in order to be able to know what is the transaction to be reverted.
     */
    @JsonProperty("AlreadyProcessedProviderId")
    private String alreadyProcessedProviderId;

    /**
     * 
     */
    @JsonProperty("AlreadyProcessedProviderAdditionalInfos")
    private String alreadyProcessedProviderAdditionalInfos;

    /**
     * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * 
     */
    @JsonProperty("ProviderTransactionId")
    private String providerTransactionId;

    /**
     * 
     */
    @JsonProperty("ProviderSubType")
    private String providerSubType;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * 
     */
    @JsonProperty("ProviderType")
    private Provider providerType;

    /**
     * Identifies the specific transfer operation that needs to be reverted.
     */
    @JsonProperty("TransferId")
    private String transferId;

    /**
     * 
     */
    @JsonProperty("RelatedConvenientFeesWithTargetProviderId")
    private List<Object> relatedConvenientFeesWithTargetProviderId;


    
    public ProcessTransferEntity() {
    }

    
    public ProcessTransferEntity(String transactionId, String transactionGroupId, Double transactionAmount, Currency currency, LocalDateTime dueDate, String transactionDescription, AcpOperationType acpOperationType, TransferDirection transferDirection, String favoriteProvider, boolean isTransactionRevert, String alreadyProcessedProviderId, String alreadyProcessedProviderAdditionalInfos, Language language, String providerTransactionId, String providerSubType, String merchantId, Provider providerType, String transferId, List<Object> relatedConvenientFeesWithTargetProviderId) {
        this.transactionId = transactionId;
        this.transactionGroupId = transactionGroupId;
        this.transactionAmount = transactionAmount;
        this.currency = currency;
        this.dueDate = dueDate;
        this.transactionDescription = transactionDescription;
        this.acpOperationType = acpOperationType;
        this.transferDirection = transferDirection;
        this.favoriteProvider = favoriteProvider;
        this.isTransactionRevert = isTransactionRevert;
        this.alreadyProcessedProviderId = alreadyProcessedProviderId;
        this.alreadyProcessedProviderAdditionalInfos = alreadyProcessedProviderAdditionalInfos;
        this.language = language;
        this.providerTransactionId = providerTransactionId;
        this.providerSubType = providerSubType;
        this.merchantId = merchantId;
        this.providerType = providerType;
        this.transferId = transferId;
        this.relatedConvenientFeesWithTargetProviderId = relatedConvenientFeesWithTargetProviderId;
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

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public AcpOperationType getAcpOperationType() {
        return acpOperationType;
    }

    public void setAcpOperationType(AcpOperationType acpOperationType) {
        this.acpOperationType = acpOperationType;
    }

    public TransferDirection getTransferDirection() {
        return transferDirection;
    }

    public void setTransferDirection(TransferDirection transferDirection) {
        this.transferDirection = transferDirection;
    }

    public String getFavoriteProvider() {
        return favoriteProvider;
    }

    public void setFavoriteProvider(String favoriteProvider) {
        this.favoriteProvider = favoriteProvider;
    }

    public boolean getIsTransactionRevert() {
        return isTransactionRevert;
    }

    public void setIsTransactionRevert(boolean isTransactionRevert) {
        this.isTransactionRevert = isTransactionRevert;
    }

    public String getAlreadyProcessedProviderId() {
        return alreadyProcessedProviderId;
    }

    public void setAlreadyProcessedProviderId(String alreadyProcessedProviderId) {
        this.alreadyProcessedProviderId = alreadyProcessedProviderId;
    }

    public String getAlreadyProcessedProviderAdditionalInfos() {
        return alreadyProcessedProviderAdditionalInfos;
    }

    public void setAlreadyProcessedProviderAdditionalInfos(String alreadyProcessedProviderAdditionalInfos) {
        this.alreadyProcessedProviderAdditionalInfos = alreadyProcessedProviderAdditionalInfos;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getProviderTransactionId() {
        return providerTransactionId;
    }

    public void setProviderTransactionId(String providerTransactionId) {
        this.providerTransactionId = providerTransactionId;
    }

    public String getProviderSubType() {
        return providerSubType;
    }

    public void setProviderSubType(String providerSubType) {
        this.providerSubType = providerSubType;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Provider getProviderType() {
        return providerType;
    }

    public void setProviderType(Provider providerType) {
        this.providerType = providerType;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public List<Object> getRelatedConvenientFeesWithTargetProviderId() {
        return relatedConvenientFeesWithTargetProviderId;
    }

    public void setRelatedConvenientFeesWithTargetProviderId(List<Object> relatedConvenientFeesWithTargetProviderId) {
        this.relatedConvenientFeesWithTargetProviderId = relatedConvenientFeesWithTargetProviderId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessTransferEntity that = (ProcessTransferEntity) o;
        return Objects.equals(transactionId, that.transactionId) && Objects.equals(transactionGroupId, that.transactionGroupId) && Objects.equals(transactionAmount, that.transactionAmount) && Objects.equals(currency, that.currency) && Objects.equals(dueDate, that.dueDate) && Objects.equals(transactionDescription, that.transactionDescription) && Objects.equals(acpOperationType, that.acpOperationType) && Objects.equals(transferDirection, that.transferDirection) && Objects.equals(favoriteProvider, that.favoriteProvider) && Objects.equals(isTransactionRevert, that.isTransactionRevert) && Objects.equals(alreadyProcessedProviderId, that.alreadyProcessedProviderId) && Objects.equals(alreadyProcessedProviderAdditionalInfos, that.alreadyProcessedProviderAdditionalInfos) && Objects.equals(language, that.language) && Objects.equals(providerTransactionId, that.providerTransactionId) && Objects.equals(providerSubType, that.providerSubType) && Objects.equals(merchantId, that.merchantId) && Objects.equals(providerType, that.providerType) && Objects.equals(transferId, that.transferId) && Objects.equals(relatedConvenientFeesWithTargetProviderId, that.relatedConvenientFeesWithTargetProviderId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactionId, transactionGroupId, transactionAmount, currency, dueDate, transactionDescription, acpOperationType, transferDirection, favoriteProvider, isTransactionRevert, alreadyProcessedProviderId, alreadyProcessedProviderAdditionalInfos, language, providerTransactionId, providerSubType, merchantId, providerType, transferId, relatedConvenientFeesWithTargetProviderId);
    }

    @Override
    public String toString() {
        return "ProcessTransferEntity{" +
                "transactionId='" + transactionId + '\'' +
                ", transactionGroupId='" + transactionGroupId + '\'' +
                ", transactionAmount='" + transactionAmount + '\'' +
                ", currency='" + currency + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", transactionDescription='" + transactionDescription + '\'' +
                ", acpOperationType='" + acpOperationType + '\'' +
                ", transferDirection='" + transferDirection + '\'' +
                ", favoriteProvider='" + favoriteProvider + '\'' +
                ", isTransactionRevert='" + isTransactionRevert + '\'' +
                ", alreadyProcessedProviderId='" + alreadyProcessedProviderId + '\'' +
                ", alreadyProcessedProviderAdditionalInfos='" + alreadyProcessedProviderAdditionalInfos + '\'' +
                ", language='" + language + '\'' +
                ", providerTransactionId='" + providerTransactionId + '\'' +
                ", providerSubType='" + providerSubType + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", providerType='" + providerType + '\'' +
                ", transferId='" + transferId + '\'' +
                ", relatedConvenientFeesWithTargetProviderId='" + relatedConvenientFeesWithTargetProviderId + '\'' +

                '}';
    }
}