
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Interac;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.Language;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateDirectInteracTransactionArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Details of the Interac e‑transfer payment method to be created.
     */
    @JsonProperty("InteracInformation")
    private Interac interacInformation;

    /**
     * This property determine if you desire to deposit money to someone account of if you request someone to pay the merchant using Interac.
     */
    @JsonProperty("TransferDirection")
    private TransferDirection transferDirection;

    /**
     * The date by which the created payment must be settled.
     */
    @JsonProperty("DueDate")
    private OffsetDateTime dueDate;

    /**
     * The monetary value of each recurring transfer.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * The text that will appear on the payer’s bank statement for this payment.
     */
    @JsonProperty("StatementDescription")
    private String statementDescription;

    /**
     * The ISO 4217 three‑letter code of the currency in which the transfer was executed.
     */
    @JsonProperty("Currency")
    private Currency currency;

    /**
     * Specifies the language used for the payment request and related communications
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * Use this property to match transaction in other system.
     */
    @JsonProperty("ReferenceNumber")
    private String referenceNumber;


    
    public CreateDirectInteracTransactionArgs() {
    }

    
    public CreateDirectInteracTransactionArgs(String merchantId, Interac interacInformation, TransferDirection transferDirection, OffsetDateTime dueDate, Double amount, String statementDescription, Currency currency, Language language, String referenceNumber) {
        this.merchantId = merchantId;
        this.interacInformation = interacInformation;
        this.transferDirection = transferDirection;
        this.dueDate = dueDate;
        this.amount = amount;
        this.statementDescription = statementDescription;
        this.currency = currency;
        this.language = language;
        this.referenceNumber = referenceNumber;
    }
    
    
    public CreateDirectInteracTransactionArgs(String sessionToken, String merchantId, Interac interacInformation, TransferDirection transferDirection, OffsetDateTime dueDate, Double amount, String statementDescription, Currency currency, Language language, String referenceNumber) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.interacInformation = interacInformation;
        this.transferDirection = transferDirection;
        this.dueDate = dueDate;
        this.amount = amount;
        this.statementDescription = statementDescription;
        this.currency = currency;
        this.language = language;
        this.referenceNumber = referenceNumber;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Interac getInteracInformation() {
        return interacInformation;
    }

    public void setInteracInformation(Interac interacInformation) {
        this.interacInformation = interacInformation;
    }

    public TransferDirection getTransferDirection() {
        return transferDirection;
    }

    public void setTransferDirection(TransferDirection transferDirection) {
        this.transferDirection = transferDirection;
    }

    public OffsetDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(OffsetDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatementDescription() {
        return statementDescription;
    }

    public void setStatementDescription(String statementDescription) {
        this.statementDescription = statementDescription;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateDirectInteracTransactionArgs that = (CreateDirectInteracTransactionArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(interacInformation, that.interacInformation) && Objects.equals(transferDirection, that.transferDirection) && Objects.equals(dueDate, that.dueDate) && Objects.equals(amount, that.amount) && Objects.equals(statementDescription, that.statementDescription) && Objects.equals(currency, that.currency) && Objects.equals(language, that.language) && Objects.equals(referenceNumber, that.referenceNumber) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, interacInformation, transferDirection, dueDate, amount, statementDescription, currency, language, referenceNumber);
    }

    @Override
    public String toString() {
        return "CreateDirectInteracTransactionArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", interacInformation='" + interacInformation + '\'' +
                ", transferDirection='" + transferDirection + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", amount='" + amount + '\'' +
                ", statementDescription='" + statementDescription + '\'' +
                ", currency='" + currency + '\'' +
                ", language='" + language + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +

                '}';
    }
}