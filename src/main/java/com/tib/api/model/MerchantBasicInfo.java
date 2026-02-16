
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.Language;
import com.tib.api.model.Address;
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


public class MerchantBasicInfo   {

    
    /**
     * Represents the merchant's unique name.
     */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
     * Represents the unique identifier for a merchant within an external system. This ID is crucial for integrating and synchronizing merchant data across different platforms.
     */
    @JsonProperty("ExternalSystemId")
    private String externalSystemId;

    /**
     * Represents the external identity associated with a merchant within an external system.
     */
    @JsonProperty("ExternalSystemGroupId")
    private String externalSystemGroupId;

    /**
     * Defines the base currency utilized for bill creation by the merchant.
     */
    @JsonProperty("MerchantCurrency")
    private Currency merchantCurrency;

    /**
     * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * Specifies the email address associated with the merchant.
     */
    @JsonProperty("Email")
    private String email;

    /**
     * Specifies a list of email addresses, separated by semicolons, that will receive copies of emails sent to the merchant.
     */
    @JsonProperty("EmailCopyTo")
    private String emailCopyTo;

    /**
     * The merchant's phone number used for contact and transaction notifications.
     */
    @JsonProperty("PhoneNumber")
    private String phoneNumber;

    /**
     * Contains a free‑text description of the merchant, which is stored in the TIB Finance system and displayed in merchant records.
     */
    @JsonProperty("MerchantDescription")
    private String merchantDescription;

    /**
     * Gets or sets the address associated with the entity.
     */
    @JsonProperty("Address")
    private Address address;

    /**
     * Gets or sets the favorite provider.
     */
    @JsonProperty("FavoriteProvider")
    private Provider favoriteProvider;


    
    public MerchantBasicInfo() {
    }

    
    public MerchantBasicInfo(String merchantName, String externalSystemId, String externalSystemGroupId, Currency merchantCurrency, Language language, String email, String emailCopyTo, String phoneNumber, String merchantDescription, Address address, Provider favoriteProvider) {
        this.merchantName = merchantName;
        this.externalSystemId = externalSystemId;
        this.externalSystemGroupId = externalSystemGroupId;
        this.merchantCurrency = merchantCurrency;
        this.language = language;
        this.email = email;
        this.emailCopyTo = emailCopyTo;
        this.phoneNumber = phoneNumber;
        this.merchantDescription = merchantDescription;
        this.address = address;
        this.favoriteProvider = favoriteProvider;
    }
    
    

    
    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getExternalSystemId() {
        return externalSystemId;
    }

    public void setExternalSystemId(String externalSystemId) {
        this.externalSystemId = externalSystemId;
    }

    public String getExternalSystemGroupId() {
        return externalSystemGroupId;
    }

    public void setExternalSystemGroupId(String externalSystemGroupId) {
        this.externalSystemGroupId = externalSystemGroupId;
    }

    public Currency getMerchantCurrency() {
        return merchantCurrency;
    }

    public void setMerchantCurrency(Currency merchantCurrency) {
        this.merchantCurrency = merchantCurrency;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailCopyTo() {
        return emailCopyTo;
    }

    public void setEmailCopyTo(String emailCopyTo) {
        this.emailCopyTo = emailCopyTo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMerchantDescription() {
        return merchantDescription;
    }

    public void setMerchantDescription(String merchantDescription) {
        this.merchantDescription = merchantDescription;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Provider getFavoriteProvider() {
        return favoriteProvider;
    }

    public void setFavoriteProvider(Provider favoriteProvider) {
        this.favoriteProvider = favoriteProvider;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MerchantBasicInfo that = (MerchantBasicInfo) o;
        return Objects.equals(merchantName, that.merchantName) && Objects.equals(externalSystemId, that.externalSystemId) && Objects.equals(externalSystemGroupId, that.externalSystemGroupId) && Objects.equals(merchantCurrency, that.merchantCurrency) && Objects.equals(language, that.language) && Objects.equals(email, that.email) && Objects.equals(emailCopyTo, that.emailCopyTo) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(merchantDescription, that.merchantDescription) && Objects.equals(address, that.address) && Objects.equals(favoriteProvider, that.favoriteProvider) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantName, externalSystemId, externalSystemGroupId, merchantCurrency, language, email, emailCopyTo, phoneNumber, merchantDescription, address, favoriteProvider);
    }

    @Override
    public String toString() {
        return "MerchantBasicInfo{" +
                "merchantName='" + merchantName + '\'' +
                ", externalSystemId='" + externalSystemId + '\'' +
                ", externalSystemGroupId='" + externalSystemGroupId + '\'' +
                ", merchantCurrency='" + merchantCurrency + '\'' +
                ", language='" + language + '\'' +
                ", email='" + email + '\'' +
                ", emailCopyTo='" + emailCopyTo + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", merchantDescription='" + merchantDescription + '\'' +
                ", address='" + address + '\'' +
                ", favoriteProvider='" + favoriteProvider + '\'' +

                '}';
    }
}