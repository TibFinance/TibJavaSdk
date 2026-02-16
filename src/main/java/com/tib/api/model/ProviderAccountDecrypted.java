
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.PaymentMethodType;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.Provider;
import com.tib.api.model.enums.OwnerType;
import com.tib.api.model.QuestionAnswerDecrypted;
import com.tib.api.model.ProviderAddressEntity;
import com.tib.api.model.ProviderMerchantCredentialEntity;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ProviderAccountDecrypted   {

    
    /**
     * Gets or sets the name of the provider.
     */
    @JsonProperty("ProviderId")
    private String providerId;

    /**
     * 
     */
    @JsonProperty("ProviderName")
    private String providerName;

    /**
     * 
     */
    @JsonProperty("OrderPriority")
    private Integer orderPriority;

    /**
     * 
     */
    @JsonProperty("IsDefault")
    private boolean isDefault;

    /**
     * Identifies the type of payment method linked to a specific account.
     */
    @JsonProperty("PaymentMethodType")
    private PaymentMethodType paymentMethodType;

    /**
     * Retrieves or assigns the currency type used in transactions.
     */
    @JsonProperty("Currency")
    private Currency currency;

    /**
     * Gets or sets the type of the provider.
     */
    @JsonProperty("ProviderType")
    private Provider providerType;

    /**
     * 
     */
    @JsonProperty("OwnerType")
    private OwnerType ownerType;

    /**
     * Gets or sets the account.
     */
    @JsonProperty("AccountCollect")
    private String accountCollect;

    /**
     * 
     */
    @JsonProperty("AccountDeposit")
    private String accountDeposit;

    /**
     * Gets or sets the password.
     */
    @JsonProperty("PasswordCollect")
    private String passwordCollect;

    /**
     * 
     */
    @JsonProperty("PasswordDeposit")
    private String passwordDeposit;

    /**
     * Gets or sets the questions.
     */
    @JsonProperty("Questions")
    private List<QuestionAnswerDecrypted> questions;

    /**
     * Gets or sets the addresses.
     */
    @JsonProperty("Addresses")
    private List<ProviderAddressEntity> addresses;

    /**
     * Gets or sets the credential values.
     */
    @JsonProperty("CredentialValues")
    private Map<String, String> credentialValues;

    /**
     * List of specific CredentialValue for other Provider Credential. Example, RBC has Credential Value called "OrganizationNumber". So this property can be loaded with the Key "OrganizationNumber" and the values "RBC""Value2", "RBC2""Value2"
     */
    @JsonProperty("ProviderOtherCredentialValues")
    private Map<String, Map<String, String>> providerOtherCredentialValues;

    /**
     * List of specific MerchantCredentialValues for other Provider Credential.
     */
    @JsonProperty("MerchantCredentialValues")
    private List<ProviderMerchantCredentialEntity> merchantCredentialValues;


    
    public ProviderAccountDecrypted() {
    }

    
    public ProviderAccountDecrypted(String providerId, String providerName, Integer orderPriority, boolean isDefault, PaymentMethodType paymentMethodType, Currency currency, Provider providerType, OwnerType ownerType, String accountCollect, String accountDeposit, String passwordCollect, String passwordDeposit, List<QuestionAnswerDecrypted> questions, List<ProviderAddressEntity> addresses, Map<String, String> credentialValues, Map<String, Map<String, String>> providerOtherCredentialValues, List<ProviderMerchantCredentialEntity> merchantCredentialValues) {
        this.providerId = providerId;
        this.providerName = providerName;
        this.orderPriority = orderPriority;
        this.isDefault = isDefault;
        this.paymentMethodType = paymentMethodType;
        this.currency = currency;
        this.providerType = providerType;
        this.ownerType = ownerType;
        this.accountCollect = accountCollect;
        this.accountDeposit = accountDeposit;
        this.passwordCollect = passwordCollect;
        this.passwordDeposit = passwordDeposit;
        this.questions = questions;
        this.addresses = addresses;
        this.credentialValues = credentialValues;
        this.providerOtherCredentialValues = providerOtherCredentialValues;
        this.merchantCredentialValues = merchantCredentialValues;
    }
    
    

    
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public Integer getOrderPriority() {
        return orderPriority;
    }

    public void setOrderPriority(Integer orderPriority) {
        this.orderPriority = orderPriority;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Provider getProviderType() {
        return providerType;
    }

    public void setProviderType(Provider providerType) {
        this.providerType = providerType;
    }

    public OwnerType getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(OwnerType ownerType) {
        this.ownerType = ownerType;
    }

    public String getAccountCollect() {
        return accountCollect;
    }

    public void setAccountCollect(String accountCollect) {
        this.accountCollect = accountCollect;
    }

    public String getAccountDeposit() {
        return accountDeposit;
    }

    public void setAccountDeposit(String accountDeposit) {
        this.accountDeposit = accountDeposit;
    }

    public String getPasswordCollect() {
        return passwordCollect;
    }

    public void setPasswordCollect(String passwordCollect) {
        this.passwordCollect = passwordCollect;
    }

    public String getPasswordDeposit() {
        return passwordDeposit;
    }

    public void setPasswordDeposit(String passwordDeposit) {
        this.passwordDeposit = passwordDeposit;
    }

    public List<QuestionAnswerDecrypted> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionAnswerDecrypted> questions) {
        this.questions = questions;
    }

    public List<ProviderAddressEntity> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<ProviderAddressEntity> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCredentialValues() {
        return credentialValues;
    }

    public void setCredentialValues(Map<String, String> credentialValues) {
        this.credentialValues = credentialValues;
    }

    public Map<String, Map<String, String>> getProviderOtherCredentialValues() {
        return providerOtherCredentialValues;
    }

    public void setProviderOtherCredentialValues(Map<String, Map<String, String>> providerOtherCredentialValues) {
        this.providerOtherCredentialValues = providerOtherCredentialValues;
    }

    public List<ProviderMerchantCredentialEntity> getMerchantCredentialValues() {
        return merchantCredentialValues;
    }

    public void setMerchantCredentialValues(List<ProviderMerchantCredentialEntity> merchantCredentialValues) {
        this.merchantCredentialValues = merchantCredentialValues;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProviderAccountDecrypted that = (ProviderAccountDecrypted) o;
        return Objects.equals(providerId, that.providerId) && Objects.equals(providerName, that.providerName) && Objects.equals(orderPriority, that.orderPriority) && Objects.equals(isDefault, that.isDefault) && Objects.equals(paymentMethodType, that.paymentMethodType) && Objects.equals(currency, that.currency) && Objects.equals(providerType, that.providerType) && Objects.equals(ownerType, that.ownerType) && Objects.equals(accountCollect, that.accountCollect) && Objects.equals(accountDeposit, that.accountDeposit) && Objects.equals(passwordCollect, that.passwordCollect) && Objects.equals(passwordDeposit, that.passwordDeposit) && Objects.equals(questions, that.questions) && Objects.equals(addresses, that.addresses) && Objects.equals(credentialValues, that.credentialValues) && Objects.equals(providerOtherCredentialValues, that.providerOtherCredentialValues) && Objects.equals(merchantCredentialValues, that.merchantCredentialValues) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerId, providerName, orderPriority, isDefault, paymentMethodType, currency, providerType, ownerType, accountCollect, accountDeposit, passwordCollect, passwordDeposit, questions, addresses, credentialValues, providerOtherCredentialValues, merchantCredentialValues);
    }

    @Override
    public String toString() {
        return "ProviderAccountDecrypted{" +
                "providerId='" + providerId + '\'' +
                ", providerName='" + providerName + '\'' +
                ", orderPriority='" + orderPriority + '\'' +
                ", isDefault='" + isDefault + '\'' +
                ", paymentMethodType='" + paymentMethodType + '\'' +
                ", currency='" + currency + '\'' +
                ", providerType='" + providerType + '\'' +
                ", ownerType='" + ownerType + '\'' +
                ", accountCollect='" + accountCollect + '\'' +
                ", accountDeposit='" + accountDeposit + '\'' +
                ", passwordCollect='" + passwordCollect + '\'' +
                ", passwordDeposit='" + passwordDeposit + '\'' +
                ", questions='" + questions + '\'' +
                ", addresses='" + addresses + '\'' +
                ", credentialValues='" + credentialValues + '\'' +
                ", providerOtherCredentialValues='" + providerOtherCredentialValues + '\'' +
                ", merchantCredentialValues='" + merchantCredentialValues + '\'' +

                '}';
    }
}