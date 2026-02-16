
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.CreditCard;
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


public class CreateCreditCardPaymentMethodArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Retrieves or assigns the currency type used in transactions.
     */
    @JsonProperty("Currency")
    private Currency currency;

    /**
     * Serves as a unique identifier for each customer within the system.
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * Determines if the customer's payment method is set as the default for automatic transactions.
     */
    @JsonProperty("IsCustomerAutomaticPaymentMethod")
    private boolean isCustomerAutomaticPaymentMethod;

    /**
     * Manages all operations associated with credit card data.
     */
    @JsonProperty("CreditCard")
    private CreditCard creditCard;

    /**
     * Specifies the name of the card owner.
     */
    @JsonProperty("CardOwner")
    private String cardOwner;

    /**
     * For ZipCode only situation, not full address
     */
    @JsonProperty("ZipCode")
    private String zipCode;

    /**
     * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
     */
    @JsonProperty("Language")
    private Language language;


    
    public CreateCreditCardPaymentMethodArgs() {
    }

    
    public CreateCreditCardPaymentMethodArgs(Currency currency, String customerId, boolean isCustomerAutomaticPaymentMethod, CreditCard creditCard, String cardOwner, String zipCode, Language language) {
        this.currency = currency;
        this.customerId = customerId;
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
        this.creditCard = creditCard;
        this.cardOwner = cardOwner;
        this.zipCode = zipCode;
        this.language = language;
    }
    
    
    public CreateCreditCardPaymentMethodArgs(String sessionToken, Currency currency, String customerId, boolean isCustomerAutomaticPaymentMethod, CreditCard creditCard, String cardOwner, String zipCode, Language language) {
        super(sessionToken);
        this.currency = currency;
        this.customerId = customerId;
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
        this.creditCard = creditCard;
        this.cardOwner = cardOwner;
        this.zipCode = zipCode;
        this.language = language;
    }

    
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public boolean getIsCustomerAutomaticPaymentMethod() {
        return isCustomerAutomaticPaymentMethod;
    }

    public void setIsCustomerAutomaticPaymentMethod(boolean isCustomerAutomaticPaymentMethod) {
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateCreditCardPaymentMethodArgs that = (CreateCreditCardPaymentMethodArgs) o;
        return Objects.equals(currency, that.currency) && Objects.equals(customerId, that.customerId) && Objects.equals(isCustomerAutomaticPaymentMethod, that.isCustomerAutomaticPaymentMethod) && Objects.equals(creditCard, that.creditCard) && Objects.equals(cardOwner, that.cardOwner) && Objects.equals(zipCode, that.zipCode) && Objects.equals(language, that.language) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(currency, customerId, isCustomerAutomaticPaymentMethod, creditCard, cardOwner, zipCode, language);
    }

    @Override
    public String toString() {
        return "CreateCreditCardPaymentMethodArgs{" +
                "currency='" + currency + '\'' +
                ", customerId='" + customerId + '\'' +
                ", isCustomerAutomaticPaymentMethod='" + isCustomerAutomaticPaymentMethod + '\'' +
                ", creditCard='" + creditCard + '\'' +
                ", cardOwner='" + cardOwner + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", language='" + language + '\'' +

                '}';
    }
}