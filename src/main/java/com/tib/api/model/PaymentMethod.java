
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.PaymentMethodType;
import com.tib.api.model.MerchantIdName;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class PaymentMethod   {

    
    /**
     * Identifier of the payment method to be set as the default for the account
     */
    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;

    /**
     * Indicates whether this payment method is configured as the customer's automatic payment method.
     */
    @JsonProperty("IsCustomerAutomaticPaymentMethod")
    private boolean isCustomerAutomaticPaymentMethod;

    /**
     * The payment method type employed for the transfer.
     */
    @JsonProperty("PaymentMethodType")
    private PaymentMethodType paymentMethodType;

    /**
     * Descriptive name of the payment method used for the transfer.
     */
    @JsonProperty("PaymentMethodDescription")
    private String paymentMethodDescription;

    /**
     * A masked representation of the account linked to the payment method.
     */
    @JsonProperty("AccountPreview")
    private String accountPreview;

    /**
     * The date and time when the payment method expires.
     */
    @JsonProperty("ExpirationDate")
    private OffsetDateTime expirationDate;

    /**
     * Identifier of the entity that owns the payment method.
     */
    @JsonProperty("Owner")
    private String owner;

    /**
     * The type of credit card used for the payment (e.g., Visa, MasterCard).
     */
    @JsonProperty("CcType")
    private String ccType;

    /**
     * List of merchants (ID and name) that are pre‑authorized to use this payment method.
     */
    @JsonProperty("PreauthorizedMerchants")
    private List<MerchantIdName> preauthorizedMerchants;


    
    public PaymentMethod() {
    }

    
    public PaymentMethod(String paymentMethodId, boolean isCustomerAutomaticPaymentMethod, PaymentMethodType paymentMethodType, String paymentMethodDescription, String accountPreview, OffsetDateTime expirationDate, String owner, String ccType, List<MerchantIdName> preauthorizedMerchants) {
        this.paymentMethodId = paymentMethodId;
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
        this.paymentMethodType = paymentMethodType;
        this.paymentMethodDescription = paymentMethodDescription;
        this.accountPreview = accountPreview;
        this.expirationDate = expirationDate;
        this.owner = owner;
        this.ccType = ccType;
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

    public OffsetDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(OffsetDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCcType() {
        return ccType;
    }

    public void setCcType(String ccType) {
        this.ccType = ccType;
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
        return Objects.equals(paymentMethodId, that.paymentMethodId) && Objects.equals(isCustomerAutomaticPaymentMethod, that.isCustomerAutomaticPaymentMethod) && Objects.equals(paymentMethodType, that.paymentMethodType) && Objects.equals(paymentMethodDescription, that.paymentMethodDescription) && Objects.equals(accountPreview, that.accountPreview) && Objects.equals(expirationDate, that.expirationDate) && Objects.equals(owner, that.owner) && Objects.equals(ccType, that.ccType) && Objects.equals(preauthorizedMerchants, that.preauthorizedMerchants) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentMethodId, isCustomerAutomaticPaymentMethod, paymentMethodType, paymentMethodDescription, accountPreview, expirationDate, owner, ccType, preauthorizedMerchants);
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
                ", ccType='" + ccType + '\'' +
                ", preauthorizedMerchants='" + preauthorizedMerchants + '\'' +

                '}';
    }
}