
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Account;
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


public class CreateDirectDepositArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Gets or sets the origin merchant identifier.
 */
    @JsonProperty("OriginMerchantId")
    private String originMerchantId;

    /**
 * Free deposit account information
 */
    @JsonProperty("DestinationAccount")
    private Account destinationAccount;

    /**
 * Gets or sets the deposit due date.
 */
    @JsonProperty("DepositDueDate")
    private LocalDateTime depositDueDate;

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


    
    public CreateDirectDepositArgs() {
    }

    
    public CreateDirectDepositArgs(String originMerchantId, Account destinationAccount, LocalDateTime depositDueDate, Double amount, String statementDescription, Currency currency, Language language, String referenceNumber) {
        this.originMerchantId = originMerchantId;
this.destinationAccount = destinationAccount;
this.depositDueDate = depositDueDate;
this.amount = amount;
this.statementDescription = statementDescription;
this.currency = currency;
this.language = language;
this.referenceNumber = referenceNumber;

    }
    
    
    public CreateDirectDepositArgs(String sessionToken, String originMerchantId, Account destinationAccount, LocalDateTime depositDueDate, Double amount, String statementDescription, Currency currency, Language language, String referenceNumber) {
        super(sessionToken);
        this.originMerchantId = originMerchantId;
this.destinationAccount = destinationAccount;
this.depositDueDate = depositDueDate;
this.amount = amount;
this.statementDescription = statementDescription;
this.currency = currency;
this.language = language;
this.referenceNumber = referenceNumber;

    }

    
    public String getOriginMerchantId() {
        return originMerchantId;
    }

    public void setOriginMerchantId(String originMerchantId) {
        this.originMerchantId = originMerchantId;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(Account destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public LocalDateTime getDepositDueDate() {
        return depositDueDate;
    }

    public void setDepositDueDate(LocalDateTime depositDueDate) {
        this.depositDueDate = depositDueDate;
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
        CreateDirectDepositArgs that = (CreateDirectDepositArgs) o;
        return Objects.equals(originMerchantId, that.originMerchantId) && Objects.equals(destinationAccount, that.destinationAccount) && Objects.equals(depositDueDate, that.depositDueDate) && Objects.equals(amount, that.amount) && Objects.equals(statementDescription, that.statementDescription) && Objects.equals(currency, that.currency) && Objects.equals(language, that.language) && Objects.equals(referenceNumber, that.referenceNumber) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(originMerchantId, destinationAccount, depositDueDate, amount, statementDescription, currency, language, referenceNumber);
    }

    @Override
    public String toString() {
        return "CreateDirectDepositArgs{" +
                 "originMerchantId='" + originMerchantId + '\'' +
 ", destinationAccount='" + destinationAccount + '\'' +
 ", depositDueDate='" + depositDueDate + '\'' +
 ", amount='" + amount + '\'' +
 ", statementDescription='" + statementDescription + '\'' +
 ", currency='" + currency + '\'' +
 ", language='" + language + '\'' +
 ", referenceNumber='" + referenceNumber + '\'' +

                '}';
    }
}