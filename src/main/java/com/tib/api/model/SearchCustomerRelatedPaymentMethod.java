
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SearchCustomerRelatedPaymentMethod   {

    
    /**
 * Acts as a unique identifier for a distinct payment method.
 */
    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;

    /**
 * Provides a detailed description of the payment method for easy identification.
 */
    @JsonProperty("PaymentMethodDescription")
    private String paymentMethodDescription;

    /**
 * 
 */
    @JsonProperty("PaymentMethodIsDeleted")
    private boolean paymentMethodIsDeleted;

    /**
 * 
 */
    @JsonProperty("AccountInformationOwner")
    private String accountInformationOwner;


    
    public SearchCustomerRelatedPaymentMethod() {
    }

    
    public SearchCustomerRelatedPaymentMethod(String paymentMethodId, String paymentMethodDescription, boolean paymentMethodIsDeleted, String accountInformationOwner) {
        this.paymentMethodId = paymentMethodId;
this.paymentMethodDescription = paymentMethodDescription;
this.paymentMethodIsDeleted = paymentMethodIsDeleted;
this.accountInformationOwner = accountInformationOwner;

    }
    
    

    
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getPaymentMethodDescription() {
        return paymentMethodDescription;
    }

    public void setPaymentMethodDescription(String paymentMethodDescription) {
        this.paymentMethodDescription = paymentMethodDescription;
    }

    public boolean getPaymentMethodIsDeleted() {
        return paymentMethodIsDeleted;
    }

    public void setPaymentMethodIsDeleted(boolean paymentMethodIsDeleted) {
        this.paymentMethodIsDeleted = paymentMethodIsDeleted;
    }

    public String getAccountInformationOwner() {
        return accountInformationOwner;
    }

    public void setAccountInformationOwner(String accountInformationOwner) {
        this.accountInformationOwner = accountInformationOwner;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchCustomerRelatedPaymentMethod that = (SearchCustomerRelatedPaymentMethod) o;
        return Objects.equals(paymentMethodId, that.paymentMethodId) && Objects.equals(paymentMethodDescription, that.paymentMethodDescription) && Objects.equals(paymentMethodIsDeleted, that.paymentMethodIsDeleted) && Objects.equals(accountInformationOwner, that.accountInformationOwner) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentMethodId, paymentMethodDescription, paymentMethodIsDeleted, accountInformationOwner);
    }

    @Override
    public String toString() {
        return "SearchCustomerRelatedPaymentMethod{" +
                 "paymentMethodId='" + paymentMethodId + '\'' +
 ", paymentMethodDescription='" + paymentMethodDescription + '\'' +
 ", paymentMethodIsDeleted='" + paymentMethodIsDeleted + '\'' +
 ", accountInformationOwner='" + accountInformationOwner + '\'' +

                '}';
    }
}