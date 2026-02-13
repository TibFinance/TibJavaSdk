
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.Provider;
import com.tib.api.model.enums.TransferDirection;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransactionIdentity  extends ProviderTransactionIdentity  {

    
    /**
 * Gets or sets the transaction identifier.
 */
    @JsonProperty("TransactionId")
    private String transactionId;

    /**
 * Retrieves the identifier of the merchant (bank account) to which the operation applies.
 */
    @JsonProperty("RelatedMerchantId")
    private String relatedMerchantId;

    /**
 * 
 */
    @JsonProperty("LastExecutionDescription")
    private String lastExecutionDescription;

    /**
 * 
 */
    @JsonProperty("TransactionAmount")
    private Double transactionAmount;

    /**
 * 
 */
    @JsonProperty("OriginalTransactionDueDatePassedWeekend")
    private LocalDateTime originalTransactionDueDatePassedWeekend;

    /**
 * 
 */
    @JsonProperty("OriginalTransactionCreatedDatePassedWeekend")
    private LocalDateTime originalTransactionCreatedDatePassedWeekend;

    /**
 * Retrieves or assigns the currency type used in transactions.
 */
    @JsonProperty("Currency")
    private Currency currency;

    /**
 * Identifies the specific transfer operation that needs to be reverted.
 */
    @JsonProperty("TransferId")
    private String transferId;

    /**
 * 
 */
    @JsonProperty("PayoutId")
    private String payoutId;


    
    public TransactionIdentity() {
    }

    
    public TransactionIdentity(String transactionId, String relatedMerchantId, String lastExecutionDescription, Double transactionAmount, LocalDateTime originalTransactionDueDatePassedWeekend, LocalDateTime originalTransactionCreatedDatePassedWeekend, Currency currency, String transferId, String payoutId) {
        this.transactionId = transactionId;
this.relatedMerchantId = relatedMerchantId;
this.lastExecutionDescription = lastExecutionDescription;
this.transactionAmount = transactionAmount;
this.originalTransactionDueDatePassedWeekend = originalTransactionDueDatePassedWeekend;
this.originalTransactionCreatedDatePassedWeekend = originalTransactionCreatedDatePassedWeekend;
this.currency = currency;
this.transferId = transferId;
this.payoutId = payoutId;

    }
    
    
    public TransactionIdentity(Provider providerType, String providerId, TransferDirection transferDirection, String providerTransactionId, String providerTransactionGroupId, String transactionId, String relatedMerchantId, String lastExecutionDescription, Double transactionAmount, LocalDateTime originalTransactionDueDatePassedWeekend, LocalDateTime originalTransactionCreatedDatePassedWeekend, Currency currency, String transferId, String payoutId) {
        super(providerType, providerId, transferDirection, providerTransactionId, providerTransactionGroupId);
        this.transactionId = transactionId;
this.relatedMerchantId = relatedMerchantId;
this.lastExecutionDescription = lastExecutionDescription;
this.transactionAmount = transactionAmount;
this.originalTransactionDueDatePassedWeekend = originalTransactionDueDatePassedWeekend;
this.originalTransactionCreatedDatePassedWeekend = originalTransactionCreatedDatePassedWeekend;
this.currency = currency;
this.transferId = transferId;
this.payoutId = payoutId;

    }

    
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getRelatedMerchantId() {
        return relatedMerchantId;
    }

    public void setRelatedMerchantId(String relatedMerchantId) {
        this.relatedMerchantId = relatedMerchantId;
    }

    public String getLastExecutionDescription() {
        return lastExecutionDescription;
    }

    public void setLastExecutionDescription(String lastExecutionDescription) {
        this.lastExecutionDescription = lastExecutionDescription;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public LocalDateTime getOriginalTransactionDueDatePassedWeekend() {
        return originalTransactionDueDatePassedWeekend;
    }

    public void setOriginalTransactionDueDatePassedWeekend(LocalDateTime originalTransactionDueDatePassedWeekend) {
        this.originalTransactionDueDatePassedWeekend = originalTransactionDueDatePassedWeekend;
    }

    public LocalDateTime getOriginalTransactionCreatedDatePassedWeekend() {
        return originalTransactionCreatedDatePassedWeekend;
    }

    public void setOriginalTransactionCreatedDatePassedWeekend(LocalDateTime originalTransactionCreatedDatePassedWeekend) {
        this.originalTransactionCreatedDatePassedWeekend = originalTransactionCreatedDatePassedWeekend;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public String getPayoutId() {
        return payoutId;
    }

    public void setPayoutId(String payoutId) {
        this.payoutId = payoutId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionIdentity that = (TransactionIdentity) o;
        return Objects.equals(transactionId, that.transactionId) && Objects.equals(relatedMerchantId, that.relatedMerchantId) && Objects.equals(lastExecutionDescription, that.lastExecutionDescription) && Objects.equals(transactionAmount, that.transactionAmount) && Objects.equals(originalTransactionDueDatePassedWeekend, that.originalTransactionDueDatePassedWeekend) && Objects.equals(originalTransactionCreatedDatePassedWeekend, that.originalTransactionCreatedDatePassedWeekend) && Objects.equals(currency, that.currency) && Objects.equals(transferId, that.transferId) && Objects.equals(payoutId, that.payoutId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactionId, relatedMerchantId, lastExecutionDescription, transactionAmount, originalTransactionDueDatePassedWeekend, originalTransactionCreatedDatePassedWeekend, currency, transferId, payoutId);
    }

    @Override
    public String toString() {
        return "TransactionIdentity{" +
                 "transactionId='" + transactionId + '\'' +
 ", relatedMerchantId='" + relatedMerchantId + '\'' +
 ", lastExecutionDescription='" + lastExecutionDescription + '\'' +
 ", transactionAmount='" + transactionAmount + '\'' +
 ", originalTransactionDueDatePassedWeekend='" + originalTransactionDueDatePassedWeekend + '\'' +
 ", originalTransactionCreatedDatePassedWeekend='" + originalTransactionCreatedDatePassedWeekend + '\'' +
 ", currency='" + currency + '\'' +
 ", transferId='" + transferId + '\'' +
 ", payoutId='" + payoutId + '\'' +

                '}';
    }
}