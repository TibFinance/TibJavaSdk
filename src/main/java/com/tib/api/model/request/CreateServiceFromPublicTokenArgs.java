
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.ServiceEntity;
import com.tib.api.model.Address;
import com.tib.api.model.ServiceFeeSettings;
import com.tib.api.model.ServiceSettings;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.Language;
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


public class CreateServiceFromPublicTokenArgs  extends BaseAuthenticatePublicTokenArgs  {

    
    /**
     * Retrieves or assigns the service associated with a merchant in the TIB Finance API. This property is crucial for managing service-related operations, including contract management and fee determination.
     */
    @JsonProperty("Service")
    private ServiceEntity service;

    /**
     * Gets or sets the address associated with the entity.
     */
    @JsonProperty("Address")
    private Address address;

    /**
     * Gets or sets the services fee.
     */
    @JsonProperty("ServicesFee")
    private ServiceFeeSettings servicesFee;

    /**
     * Gets or sets the configuration settings for a TIB Finance service.
     */
    @JsonProperty("ServiceSettings")
    private ServiceSettings serviceSettings;

    /**
     * Represents the name associated with the merchant's account.
     */
    @JsonProperty("AccountName")
    private String accountName;

    /**
     * Gets or sets a value indicating whether this instance is primary.
     */
    @JsonProperty("IsPrimary")
    private boolean isPrimary;

    /**
     * Gets or sets the bank address.
     */
    @JsonProperty("BankAddress")
    private String bankAddress;

    /**
     * Gets or sets the bank city.
     */
    @JsonProperty("BankCity")
    private String bankCity;

    /**
     * Gets or sets the bank province.
     */
    @JsonProperty("BankProvince")
    private String bankProvince;

    /**
     * Gets or sets the bank country.
     */
    @JsonProperty("BankCountry")
    private String bankCountry;

    /**
     * Gets or sets the name of the bank.
     */
    @JsonProperty("BankName")
    private String bankName;

    /**
     * Identifies the bank associated with the account using its numeric identifier.
     */
    @JsonProperty("BankNumber")
    private String bankNumber;

    /**
     * Gets or sets the bank transit.
     */
    @JsonProperty("BankTransit")
    private String bankTransit;

    /**
     * Gets or sets the bank account.
     */
    @JsonProperty("BankAccount")
    private String bankAccount;

    /**
     * Gets or sets the owner email.
     */
    @JsonProperty("OwnerEmail")
    private String ownerEmail;

    /**
     * Retrieves or assigns the currency type used in transactions.
     */
    @JsonProperty("Currency")
    private Currency currency;

    /**
     * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
     */
    @JsonProperty("Language")
    private Language language;


    
    public CreateServiceFromPublicTokenArgs() {
    }

    
    public CreateServiceFromPublicTokenArgs(ServiceEntity service, Address address, ServiceFeeSettings servicesFee, ServiceSettings serviceSettings, String accountName, boolean isPrimary, String bankAddress, String bankCity, String bankProvince, String bankCountry, String bankName, String bankNumber, String bankTransit, String bankAccount, String ownerEmail, Currency currency, Language language) {
        this.service = service;
        this.address = address;
        this.servicesFee = servicesFee;
        this.serviceSettings = serviceSettings;
        this.accountName = accountName;
        this.isPrimary = isPrimary;
        this.bankAddress = bankAddress;
        this.bankCity = bankCity;
        this.bankProvince = bankProvince;
        this.bankCountry = bankCountry;
        this.bankName = bankName;
        this.bankNumber = bankNumber;
        this.bankTransit = bankTransit;
        this.bankAccount = bankAccount;
        this.ownerEmail = ownerEmail;
        this.currency = currency;
        this.language = language;
    }
    
    
    public CreateServiceFromPublicTokenArgs(String publicTokenId, ServiceEntity service, Address address, ServiceFeeSettings servicesFee, ServiceSettings serviceSettings, String accountName, boolean isPrimary, String bankAddress, String bankCity, String bankProvince, String bankCountry, String bankName, String bankNumber, String bankTransit, String bankAccount, String ownerEmail, Currency currency, Language language) {
        super(publicTokenId);
        this.service = service;
        this.address = address;
        this.servicesFee = servicesFee;
        this.serviceSettings = serviceSettings;
        this.accountName = accountName;
        this.isPrimary = isPrimary;
        this.bankAddress = bankAddress;
        this.bankCity = bankCity;
        this.bankProvince = bankProvince;
        this.bankCountry = bankCountry;
        this.bankName = bankName;
        this.bankNumber = bankNumber;
        this.bankTransit = bankTransit;
        this.bankAccount = bankAccount;
        this.ownerEmail = ownerEmail;
        this.currency = currency;
        this.language = language;
    }

    
    public ServiceEntity getService() {
        return service;
    }

    public void setService(ServiceEntity service) {
        this.service = service;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ServiceFeeSettings getServicesFee() {
        return servicesFee;
    }

    public void setServicesFee(ServiceFeeSettings servicesFee) {
        this.servicesFee = servicesFee;
    }

    public ServiceSettings getServiceSettings() {
        return serviceSettings;
    }

    public void setServiceSettings(ServiceSettings serviceSettings) {
        this.serviceSettings = serviceSettings;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getBankTransit() {
        return bankTransit;
    }

    public void setBankTransit(String bankTransit) {
        this.bankTransit = bankTransit;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
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
        CreateServiceFromPublicTokenArgs that = (CreateServiceFromPublicTokenArgs) o;
        return Objects.equals(service, that.service) && Objects.equals(address, that.address) && Objects.equals(servicesFee, that.servicesFee) && Objects.equals(serviceSettings, that.serviceSettings) && Objects.equals(accountName, that.accountName) && Objects.equals(isPrimary, that.isPrimary) && Objects.equals(bankAddress, that.bankAddress) && Objects.equals(bankCity, that.bankCity) && Objects.equals(bankProvince, that.bankProvince) && Objects.equals(bankCountry, that.bankCountry) && Objects.equals(bankName, that.bankName) && Objects.equals(bankNumber, that.bankNumber) && Objects.equals(bankTransit, that.bankTransit) && Objects.equals(bankAccount, that.bankAccount) && Objects.equals(ownerEmail, that.ownerEmail) && Objects.equals(currency, that.currency) && Objects.equals(language, that.language) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(service, address, servicesFee, serviceSettings, accountName, isPrimary, bankAddress, bankCity, bankProvince, bankCountry, bankName, bankNumber, bankTransit, bankAccount, ownerEmail, currency, language);
    }

    @Override
    public String toString() {
        return "CreateServiceFromPublicTokenArgs{" +
                "service='" + service + '\'' +
                ", address='" + address + '\'' +
                ", servicesFee='" + servicesFee + '\'' +
                ", serviceSettings='" + serviceSettings + '\'' +
                ", accountName='" + accountName + '\'' +
                ", isPrimary='" + isPrimary + '\'' +
                ", bankAddress='" + bankAddress + '\'' +
                ", bankCity='" + bankCity + '\'' +
                ", bankProvince='" + bankProvince + '\'' +
                ", bankCountry='" + bankCountry + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankNumber='" + bankNumber + '\'' +
                ", bankTransit='" + bankTransit + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", ownerEmail='" + ownerEmail + '\'' +
                ", currency='" + currency + '\'' +
                ", language='" + language + '\'' +

                '}';
    }
}