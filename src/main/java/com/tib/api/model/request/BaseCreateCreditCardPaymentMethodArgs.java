
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.CreditCard;
import com.tib.api.model.request.BaseAuthenticatePublicTokenArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BaseCreateCreditCardPaymentMethodArgs  extends BaseAuthenticatePublicTokenArgs  {

    
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


    
    public BaseCreateCreditCardPaymentMethodArgs() {
    }

    
    public BaseCreateCreditCardPaymentMethodArgs(boolean isCustomerAutomaticPaymentMethod, CreditCard creditCard) {
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
        this.creditCard = creditCard;
    }
    
    
    public BaseCreateCreditCardPaymentMethodArgs(String publicTokenId, boolean isCustomerAutomaticPaymentMethod, CreditCard creditCard) {
        super(publicTokenId);
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
        this.creditCard = creditCard;
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



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseCreateCreditCardPaymentMethodArgs that = (BaseCreateCreditCardPaymentMethodArgs) o;
        return Objects.equals(isCustomerAutomaticPaymentMethod, that.isCustomerAutomaticPaymentMethod) && Objects.equals(creditCard, that.creditCard) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(isCustomerAutomaticPaymentMethod, creditCard);
    }

    @Override
    public String toString() {
        return "BaseCreateCreditCardPaymentMethodArgs{" +
                "isCustomerAutomaticPaymentMethod='" + isCustomerAutomaticPaymentMethod + '\'' +
                ", creditCard='" + creditCard + '\'' +

                '}';
    }
}