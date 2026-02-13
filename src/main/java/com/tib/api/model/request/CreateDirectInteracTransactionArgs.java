
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Interac;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.Language;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateDirectInteracTransactionArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * This model encapsulates the details required to manage Interac payment methods for customers. It is used to facilitate electronic funds transfers via the Interac network, a widely used payment system in Canada.
 */
    @JsonProperty("InteracInformation")
    private Interac interacInformation;

    /**
 * Indicates the direction of an Interac transaction.
 */
    @JsonProperty("TransferDirection")
    private TransferDirection transferDirection;

    /**
 * Specifies the due date for the payment. If the value is null, the system treats the due date as the current date and time.
 */
    @JsonProperty("DueDate")
    private LocalDateTime dueDate;

    /**
 * Retrieves or assigns the monetary amount involved in the transaction.
 */
    @JsonProperty("Amount")
    private Double amount;

    /**
 * Represents a brief description used in statements to identify or clarify the transaction.
 */
    @JsonProperty("StatementDescription")
    private String statementDescription;

    /**
 * Retrieves or assigns the currency type used in transactions.
 */
    @JsonProperty("Currency")
    private Currency currency;

    /**
 * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
 */
    @JsonProperty("Language")
    private Language language;

    /**
 * Retrieves or assigns the reference number associated with a transaction or operation.
 */
    @JsonProperty("ReferenceNumber")
    private String referenceNumber;


    
    public CreateDirectInteracTransactionArgs() {
    }

    
    public CreateDirectInteracTransactionArgs(String merchantId, Interac interacInformation, TransferDirection transferDirection, LocalDateTime dueDate, Double amount, String statementDescription, Currency currency, Language language, String referenceNumber) {
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
    
    
    public CreateDirectInteracTransactionArgs(String sessionToken, String merchantId, Interac interacInformation, TransferDirection transferDirection, LocalDateTime dueDate, Double amount, String statementDescription, Currency currency, Language language, String referenceNumber) {
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

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
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