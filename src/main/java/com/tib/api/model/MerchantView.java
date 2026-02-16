
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.ProvinceStateId;
import com.tib.api.model.enums.CountryId;
import com.tib.api.model.enums.Provider;
import com.tib.api.model.BoardingFile;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class MerchantView   {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Represents the merchant's unique name.
     */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
     * Represents the name associated with the merchant's account.
     */
    @JsonProperty("AccountName")
    private String accountName;

    /**
     * Provides a secure representation of the account card number associated with a specific payment method.
     */
    @JsonProperty("AccountPreview")
    private String accountPreview;

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
     * Specifies the default language used by the merchant within the TIB Finance API. This setting is crucial for ensuring that all communications and operations are conducted in the preferred language of the merchant.
     */
    @JsonProperty("MerchantLanguage")
    private Language merchantLanguage;

    /**
     * Specifies the email address associated with the merchant.
     */
    @JsonProperty("Email")
    private String email;

    /**
     * Determines if the merchant is authorized to perform billing operations.
     */
    @JsonProperty("IsAuthorized")
    private boolean isAuthorized;

    /**
     * Specifies a list of email addresses, separated by semicolons, that will receive copies of emails sent to the merchant.
     */
    @JsonProperty("EmailCopyTo")
    private String emailCopyTo;

    /**
     * Represents the phone number associated with the merchant.
     */
    @JsonProperty("MerchantPhoneNumber")
    private String merchantPhoneNumber;

    /**
     * Represents the street address associated with a specific entity or location.
     */
    @JsonProperty("StreetAddress")
    private String streetAddress;

    /**
     * Retrieves or assigns the city component of an address.
     */
    @JsonProperty("AddressCity")
    private String addressCity;

    /**
     * Represents the unique identifier for a province or state within the system.
     */
    @JsonProperty("ProvinceStateId")
    private ProvinceStateId provinceStateId;

    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * Gets or sets the identifier of the country using the CountryIdEnum enumeration. This identifier is required when specifying the country for client, service, or merchant operations.
     */
    @JsonProperty("CountryId")
    private CountryId countryId;

    /**
     * Gets or sets the postal zip code for the address entity.
     */
    @JsonProperty("PostalZipCode")
    private String postalZipCode;

    /**
     * Gets or sets the account provider for the merchant or client account.
     */
    @JsonProperty("AccountProvider")
    private Provider accountProvider;

    /**
     * Retrieves or assigns the unique identifier for WhiteLabeling.
     */
    @JsonProperty("WhiteLabelingId")
    private Optional<String> whiteLabelingId;

    /**
     * Represents the status of the merchant boarding process within the system. This status is crucial for tracking the progress and completion of merchant onboarding.
     */
    @JsonProperty("BoardingStatus")
    private String boardingStatus;

    /**
     * Represents the unique identifier for the boarding information of a merchant. This ID is crucial for tracking and referencing the boarding status within the system.
     */
    @JsonProperty("BoardingInformationId")
    private String boardingInformationId;

    /**
     * 
     */
    @JsonProperty("BoardingFiles")
    private List<BoardingFile> boardingFiles;


    
    public MerchantView() {
    }

    
    public MerchantView(String merchantId, String merchantName, String accountName, String accountPreview, String externalSystemId, String externalSystemGroupId, Currency merchantCurrency, Language merchantLanguage, String email, boolean isAuthorized, String emailCopyTo, String merchantPhoneNumber, String streetAddress, String addressCity, ProvinceStateId provinceStateId, String serviceId, CountryId countryId, String postalZipCode, Provider accountProvider, Optional<String> whiteLabelingId, String boardingStatus, String boardingInformationId, List<BoardingFile> boardingFiles) {
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.accountName = accountName;
        this.accountPreview = accountPreview;
        this.externalSystemId = externalSystemId;
        this.externalSystemGroupId = externalSystemGroupId;
        this.merchantCurrency = merchantCurrency;
        this.merchantLanguage = merchantLanguage;
        this.email = email;
        this.isAuthorized = isAuthorized;
        this.emailCopyTo = emailCopyTo;
        this.merchantPhoneNumber = merchantPhoneNumber;
        this.streetAddress = streetAddress;
        this.addressCity = addressCity;
        this.provinceStateId = provinceStateId;
        this.serviceId = serviceId;
        this.countryId = countryId;
        this.postalZipCode = postalZipCode;
        this.accountProvider = accountProvider;
        this.whiteLabelingId = whiteLabelingId;
        this.boardingStatus = boardingStatus;
        this.boardingInformationId = boardingInformationId;
        this.boardingFiles = boardingFiles;
    }
    
    

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountPreview() {
        return accountPreview;
    }

    public void setAccountPreview(String accountPreview) {
        this.accountPreview = accountPreview;
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

    public Language getMerchantLanguage() {
        return merchantLanguage;
    }

    public void setMerchantLanguage(Language merchantLanguage) {
        this.merchantLanguage = merchantLanguage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getIsAuthorized() {
        return isAuthorized;
    }

    public void setIsAuthorized(boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    public String getEmailCopyTo() {
        return emailCopyTo;
    }

    public void setEmailCopyTo(String emailCopyTo) {
        this.emailCopyTo = emailCopyTo;
    }

    public String getMerchantPhoneNumber() {
        return merchantPhoneNumber;
    }

    public void setMerchantPhoneNumber(String merchantPhoneNumber) {
        this.merchantPhoneNumber = merchantPhoneNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public ProvinceStateId getProvinceStateId() {
        return provinceStateId;
    }

    public void setProvinceStateId(ProvinceStateId provinceStateId) {
        this.provinceStateId = provinceStateId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public CountryId getCountryId() {
        return countryId;
    }

    public void setCountryId(CountryId countryId) {
        this.countryId = countryId;
    }

    public String getPostalZipCode() {
        return postalZipCode;
    }

    public void setPostalZipCode(String postalZipCode) {
        this.postalZipCode = postalZipCode;
    }

    public Provider getAccountProvider() {
        return accountProvider;
    }

    public void setAccountProvider(Provider accountProvider) {
        this.accountProvider = accountProvider;
    }

    public Optional<String> getWhiteLabelingId() {
        return whiteLabelingId;
    }

    public void setWhiteLabelingId(Optional<String> whiteLabelingId) {
        this.whiteLabelingId = whiteLabelingId;
    }

    public String getBoardingStatus() {
        return boardingStatus;
    }

    public void setBoardingStatus(String boardingStatus) {
        this.boardingStatus = boardingStatus;
    }

    public String getBoardingInformationId() {
        return boardingInformationId;
    }

    public void setBoardingInformationId(String boardingInformationId) {
        this.boardingInformationId = boardingInformationId;
    }

    public List<BoardingFile> getBoardingFiles() {
        return boardingFiles;
    }

    public void setBoardingFiles(List<BoardingFile> boardingFiles) {
        this.boardingFiles = boardingFiles;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MerchantView that = (MerchantView) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(merchantName, that.merchantName) && Objects.equals(accountName, that.accountName) && Objects.equals(accountPreview, that.accountPreview) && Objects.equals(externalSystemId, that.externalSystemId) && Objects.equals(externalSystemGroupId, that.externalSystemGroupId) && Objects.equals(merchantCurrency, that.merchantCurrency) && Objects.equals(merchantLanguage, that.merchantLanguage) && Objects.equals(email, that.email) && Objects.equals(isAuthorized, that.isAuthorized) && Objects.equals(emailCopyTo, that.emailCopyTo) && Objects.equals(merchantPhoneNumber, that.merchantPhoneNumber) && Objects.equals(streetAddress, that.streetAddress) && Objects.equals(addressCity, that.addressCity) && Objects.equals(provinceStateId, that.provinceStateId) && Objects.equals(serviceId, that.serviceId) && Objects.equals(countryId, that.countryId) && Objects.equals(postalZipCode, that.postalZipCode) && Objects.equals(accountProvider, that.accountProvider) && Objects.equals(whiteLabelingId, that.whiteLabelingId) && Objects.equals(boardingStatus, that.boardingStatus) && Objects.equals(boardingInformationId, that.boardingInformationId) && Objects.equals(boardingFiles, that.boardingFiles) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, merchantName, accountName, accountPreview, externalSystemId, externalSystemGroupId, merchantCurrency, merchantLanguage, email, isAuthorized, emailCopyTo, merchantPhoneNumber, streetAddress, addressCity, provinceStateId, serviceId, countryId, postalZipCode, accountProvider, whiteLabelingId, boardingStatus, boardingInformationId, boardingFiles);
    }

    @Override
    public String toString() {
        return "MerchantView{" +
                "merchantId='" + merchantId + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountPreview='" + accountPreview + '\'' +
                ", externalSystemId='" + externalSystemId + '\'' +
                ", externalSystemGroupId='" + externalSystemGroupId + '\'' +
                ", merchantCurrency='" + merchantCurrency + '\'' +
                ", merchantLanguage='" + merchantLanguage + '\'' +
                ", email='" + email + '\'' +
                ", isAuthorized='" + isAuthorized + '\'' +
                ", emailCopyTo='" + emailCopyTo + '\'' +
                ", merchantPhoneNumber='" + merchantPhoneNumber + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", provinceStateId='" + provinceStateId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", countryId='" + countryId + '\'' +
                ", postalZipCode='" + postalZipCode + '\'' +
                ", accountProvider='" + accountProvider + '\'' +
                ", whiteLabelingId='" + whiteLabelingId + '\'' +
                ", boardingStatus='" + boardingStatus + '\'' +
                ", boardingInformationId='" + boardingInformationId + '\'' +
                ", boardingFiles='" + boardingFiles + '\'' +

                '}';
    }
}