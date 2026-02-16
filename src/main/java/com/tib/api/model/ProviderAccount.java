
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.CredentialValueType;
import com.tib.api.model.enums.PaymentMethodType;
import com.tib.api.model.enums.OwnerType;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.Provider;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ProviderAccount  extends ProviderEntity  {

    
    /**
     * Gets or sets the crypted credentials.
     */
    @JsonProperty("CredentialValuesTypes")
    private List<CredentialValueType> credentialValuesTypes;

    /**
     * Gets or sets the provider name.
     */
    @JsonProperty("ProviderName")
    private String providerName;

    /**
     * Identifies the type of payment method linked to a specific account.
     */
    @JsonProperty("PaymentMethodType")
    private PaymentMethodType paymentMethodType;

    /**
     * 
     */
    @JsonProperty("IsDefault")
    private boolean isDefault;

    /**
     * 
     */
    @JsonProperty("OwnerType")
    private OwnerType ownerType;

    /**
     * Retrieves or assigns the currency type used in transactions.
     */
    @JsonProperty("Currency")
    private Currency currency;


    
    public ProviderAccount() {
    }

    
    public ProviderAccount(List<CredentialValueType> credentialValuesTypes, String providerName, PaymentMethodType paymentMethodType, boolean isDefault, OwnerType ownerType, Currency currency) {
        this.credentialValuesTypes = credentialValuesTypes;
        this.providerName = providerName;
        this.paymentMethodType = paymentMethodType;
        this.isDefault = isDefault;
        this.ownerType = ownerType;
        this.currency = currency;
    }
    
    
    public ProviderAccount(String providerId, Provider providerType, Integer orderPriority, List<CredentialValueType> credentialValuesTypes, String providerName, PaymentMethodType paymentMethodType, boolean isDefault, OwnerType ownerType, Currency currency) {
        super(providerId, providerType, orderPriority);
        this.credentialValuesTypes = credentialValuesTypes;
        this.providerName = providerName;
        this.paymentMethodType = paymentMethodType;
        this.isDefault = isDefault;
        this.ownerType = ownerType;
        this.currency = currency;
    }

    
    public List<CredentialValueType> getCredentialValuesTypes() {
        return credentialValuesTypes;
    }

    public void setCredentialValuesTypes(List<CredentialValueType> credentialValuesTypes) {
        this.credentialValuesTypes = credentialValuesTypes;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public OwnerType getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(OwnerType ownerType) {
        this.ownerType = ownerType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProviderAccount that = (ProviderAccount) o;
        return Objects.equals(credentialValuesTypes, that.credentialValuesTypes) && Objects.equals(providerName, that.providerName) && Objects.equals(paymentMethodType, that.paymentMethodType) && Objects.equals(isDefault, that.isDefault) && Objects.equals(ownerType, that.ownerType) && Objects.equals(currency, that.currency) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(credentialValuesTypes, providerName, paymentMethodType, isDefault, ownerType, currency);
    }

    @Override
    public String toString() {
        return "ProviderAccount{" +
                "credentialValuesTypes='" + credentialValuesTypes + '\'' +
                ", providerName='" + providerName + '\'' +
                ", paymentMethodType='" + paymentMethodType + '\'' +
                ", isDefault='" + isDefault + '\'' +
                ", ownerType='" + ownerType + '\'' +
                ", currency='" + currency + '\'' +

                '}';
    }
}