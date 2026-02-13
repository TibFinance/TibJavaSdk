
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.PaymentMethodType;
import com.tib.api.model.MerchantIdName;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class PaymentMethod   {

    
    /**
 * Acts as a unique identifier for a distinct payment method.
 */
    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;

    /**
 * Determines if the customer's payment method is set as the default for automatic transactions.
 */
    @JsonProperty("IsCustomerAutomaticPaymentMethod")
    private boolean isCustomerAutomaticPaymentMethod;

    /**
 * Identifies the type of payment method linked to a specific account.
 */
    @JsonProperty("PaymentMethodType")
    private PaymentMethodType paymentMethodType;

    /**
 * Provides a detailed description of the payment method for easy identification.
 */
    @JsonProperty("PaymentMethodDescription")
    private String paymentMethodDescription;

    /**
 * Provides a secure representation of the account card number associated with a specific payment method.
 */
    @JsonProperty("AccountPreview")
    private String accountPreview;

    /**
 * Handles the extraction or assignment of a particular entity's expiration date.
 */
    @JsonProperty("ExpirationDate")
    private LocalDateTime expirationDate;

    /**
 * The 'Owner' property is designed to assign and identify the ownership of a specific resource or object within the system.
 */
    @JsonProperty("Owner")
    private String owner;

    /**
 * Fetches a list of merchants who are preauthorized for a Preauthorized Payment Agreement (PPA) on a specified payment method.
 */
    @JsonProperty("PreauthorizedMerchants")
    private List<MerchantIdName> preauthorizedMerchants;


    
    public PaymentMethod() {
    }

    
    public PaymentMethod(String paymentMethodId, boolean isCustomerAutomaticPaymentMethod, PaymentMethodType paymentMethodType, String paymentMethodDescription, String accountPreview, LocalDateTime expirationDate, String owner, List<MerchantIdName> preauthorizedMerchants) {
        this.paymentMethodId = paymentMethodId;
this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
this.paymentMethodType = paymentMethodType;
this.paymentMethodDescription = paymentMethodDescription;
this.accountPreview = accountPreview;
this.expirationDate = expirationDate;
this.owner = owner;
this.preauthorizedMerchants = preauthorizedMerchants;

    }
    
    

    
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public boolean getIsCustomerAutomaticPaymentMethod() {
        return isCustomerAutomaticPaymentMethod;
    }

    public void setIsCustomerAutomaticPaymentMethod(boolean isCustomerAutomaticPaymentMethod) {
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
    }

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public String getPaymentMethodDescription() {
        return paymentMethodDescription;
    }

    public void setPaymentMethodDescription(String paymentMethodDescription) {
        this.paymentMethodDescription = paymentMethodDescription;
    }

    public String getAccountPreview() {
        return accountPreview;
    }

    public void setAccountPreview(String accountPreview) {
        this.accountPreview = accountPreview;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<MerchantIdName> getPreauthorizedMerchants() {
        return preauthorizedMerchants;
    }

    public void setPreauthorizedMerchants(List<MerchantIdName> preauthorizedMerchants) {
        this.preauthorizedMerchants = preauthorizedMerchants;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentMethod that = (PaymentMethod) o;
        return Objects.equals(paymentMethodId, that.paymentMethodId) && Objects.equals(isCustomerAutomaticPaymentMethod, that.isCustomerAutomaticPaymentMethod) && Objects.equals(paymentMethodType, that.paymentMethodType) && Objects.equals(paymentMethodDescription, that.paymentMethodDescription) && Objects.equals(accountPreview, that.accountPreview) && Objects.equals(expirationDate, that.expirationDate) && Objects.equals(owner, that.owner) && Objects.equals(preauthorizedMerchants, that.preauthorizedMerchants) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentMethodId, isCustomerAutomaticPaymentMethod, paymentMethodType, paymentMethodDescription, accountPreview, expirationDate, owner, preauthorizedMerchants);
    }

    @Override
    public String toString() {
        return "PaymentMethod{" +
                 "paymentMethodId='" + paymentMethodId + '\'' +
 ", isCustomerAutomaticPaymentMethod='" + isCustomerAutomaticPaymentMethod + '\'' +
 ", paymentMethodType='" + paymentMethodType + '\'' +
 ", paymentMethodDescription='" + paymentMethodDescription + '\'' +
 ", accountPreview='" + accountPreview + '\'' +
 ", expirationDate='" + expirationDate + '\'' +
 ", owner='" + owner + '\'' +
 ", preauthorizedMerchants='" + preauthorizedMerchants + '\'' +

                '}';
    }
}