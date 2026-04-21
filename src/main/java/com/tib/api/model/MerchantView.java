
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.ProvinceStateId;
import com.tib.api.model.enums.CountryId;
import com.tib.api.model.enums.Provider;
import com.tib.api.model.BoardingFile;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class MerchantView   {

    
    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * The name of the merchant associated with the transfer.
     */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
     * The display name of the account involved in the transfer.
     */
    @JsonProperty("AccountName")
    private String accountName;

    /**
     * A masked representation of the account linked to the payment method.
     */
    @JsonProperty("AccountPreview")
    private String accountPreview;

    /**
     * Identifier of the external system that owns the merchant ID
     */
    @JsonProperty("ExternalSystemId")
    private String externalSystemId;

    /**
     * Identifier of the external system group for the merchant lookup
     */
    @JsonProperty("ExternalSystemGroupId")
    private String externalSystemGroupId;

    /**
     * The currency in which the merchant conducts transactions.
     */
    @JsonProperty("MerchantCurrency")
    private Currency merchantCurrency;

    /**
     * The language used for the merchant's displayed information
     */
    @JsonProperty("MerchantLanguage")
    private Language merchantLanguage;

    /**
     * The merchant's primary contact email address.
     */
    @JsonProperty("Email")
    private String email;

    /**
     * Indicates whether the caller is authorized to access the requested merchant data
     */
    @JsonProperty("IsAuthorized")
    private boolean isAuthorized;

    /**
     * Email address(es) that receive a copy of the merchant's communications
     */
    @JsonProperty("EmailCopyTo")
    private String emailCopyTo;

    /**
     * The merchant's primary contact phone number.
     */
    @JsonProperty("MerchantPhoneNumber")
    private String merchantPhoneNumber;

    /**
     * The billing street address of the cardholder for the credit card payment method.
     */
    @JsonProperty("StreetAddress")
    private String streetAddress;

    /**
     * The city component of the billing address for the credit card.
     */
    @JsonProperty("AddressCity")
    private String addressCity;

    /**
     * Identifier of the province or state for the billing address.
     */
    @JsonProperty("ProvinceStateId")
    private ProvinceStateId provinceStateId;

    /**
     * Identifier of the service for which recurring transfers are requested
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * Identifier of the card‑issuing country for the payment method
     */
    @JsonProperty("CountryId")
    private CountryId countryId;

    /**
     * The postal ZIP code of the cardholder’s billing address.
     */
    @JsonProperty("PostalZipCode")
    private String postalZipCode;

    /**
     * Identifies the external payment provider associated with the merchant.
     */
    @JsonProperty("AccountProvider")
    private Provider accountProvider;

    /**
     * Identifier of the white‑label partner linked to the merchant, if any.
     */
    @JsonProperty("WhiteLabelingId")
    private Optional<String> whiteLabelingId;

    /**
     * Indicates the current onboarding state of the merchant identified by the external ID
     */
    @JsonProperty("BoardingStatus")
    private String boardingStatus;

    /**
     * Identifier of the boarding information linked to the merchant
     */
    @JsonProperty("BoardingInformationId")
    private String boardingInformationId;

    /**
     * A list of boarding file records linked to the merchant identified by the external ID.
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