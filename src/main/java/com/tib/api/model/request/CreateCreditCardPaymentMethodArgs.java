
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.CreditCard;
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


public class CreateCreditCardPaymentMethodArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Currency for the credit card payment method (CAD or USD).
     */
    @JsonProperty("Currency")
    private Currency currency;

    /**
     * Unique identifier of the customer owning the recurring transfers
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * Indicates whether this payment method is configured as the customer's automatic payment method.
     */
    @JsonProperty("IsCustomerAutomaticPaymentMethod")
    private boolean isCustomerAutomaticPaymentMethod;

    /**
     * Credit card data supplied to fund the payment
     */
    @JsonProperty("CreditCard")
    private CreditCard creditCard;

    /**
     * Billing postal or ZIP code for AVS verification, for callers that collect only a postal code rather than a full billing address. Used only when CreditCard.CreditCardRegisteredAddress is not supplied — if a full registered address is provided, it takes precedence and this value is ignored.
     */
    @JsonProperty("ZipCode")
    private String zipCode;

    /**
     * Specifies the language used for the payment request and related communications
     */
    @JsonProperty("Language")
    private Language language;


    
    public CreateCreditCardPaymentMethodArgs() {
    }

    
    public CreateCreditCardPaymentMethodArgs(Currency currency, String customerId, boolean isCustomerAutomaticPaymentMethod, CreditCard creditCard, String zipCode, Language language) {
        this.currency = currency;
        this.customerId = customerId;
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
        this.creditCard = creditCard;
        this.zipCode = zipCode;
        this.language = language;
    }
    
    
    public CreateCreditCardPaymentMethodArgs(String sessionToken, Currency currency, String customerId, boolean isCustomerAutomaticPaymentMethod, CreditCard creditCard, String zipCode, Language language) {
        super(sessionToken);
        this.currency = currency;
        this.customerId = customerId;
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
        this.creditCard = creditCard;
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
        return Objects.equals(currency, that.currency) && Objects.equals(customerId, that.customerId) && Objects.equals(isCustomerAutomaticPaymentMethod, that.isCustomerAutomaticPaymentMethod) && Objects.equals(creditCard, that.creditCard) && Objects.equals(zipCode, that.zipCode) && Objects.equals(language, that.language) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(currency, customerId, isCustomerAutomaticPaymentMethod, creditCard, zipCode, language);
    }

    @Override
    public String toString() {
        return "CreateCreditCardPaymentMethodArgs{" +
                "currency='" + currency + '\'' +
                ", customerId='" + customerId + '\'' +
                ", isCustomerAutomaticPaymentMethod='" + isCustomerAutomaticPaymentMethod + '\'' +
                ", creditCard='" + creditCard + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", language='" + language + '\'' +

                '}';
    }
}