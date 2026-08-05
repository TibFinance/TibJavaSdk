
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Language;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class AddBankAccountArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Identifier of the service for which recurring transfers are requested
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * The Merchant.Name shown on bank statements and used as the statement label. User-typed. Duplicates within the same client/service are permitted (pragmatic).
     */
    @JsonProperty("Name")
    private String name;

    /**
     * The merchant's primary contact email address.
     */
    @JsonProperty("Email")
    private String email;

    /**
     * Specifies the language used for the payment request and related communications
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * The 3-digit bank/institution code (Canadian routing) identifying the financial institution — must be exactly 3 digits. Same field as AccountModel.BankNumber; the branch transit number is carried by InstitutionNumber.
     */
    @JsonProperty("BankNumber")
    private String bankNumber;

    /**
     * The 5-digit branch/transit number (Canadian routing) — must be exactly 5 digits. Despite the property name, this is the branch transit number, not the institution code (the institution is carried by BankNumber); the name is aligned with AccountModel.InstitutionNumber.
     */
    @JsonProperty("InstitutionNumber")
    private String institutionNumber;

    /**
     * The bank account number used for the direct account payment.
     */
    @JsonProperty("AccountNumber")
    private String accountNumber;


    
    public AddBankAccountArgs() {
    }

    
    public AddBankAccountArgs(String serviceId, String name, String email, Language language, String bankNumber, String institutionNumber, String accountNumber) {
        this.serviceId = serviceId;
        this.name = name;
        this.email = email;
        this.language = language;
        this.bankNumber = bankNumber;
        this.institutionNumber = institutionNumber;
        this.accountNumber = accountNumber;
    }
    
    
    public AddBankAccountArgs(String sessionToken, String serviceId, String name, String email, Language language, String bankNumber, String institutionNumber, String accountNumber) {
        super(sessionToken);
        this.serviceId = serviceId;
        this.name = name;
        this.email = email;
        this.language = language;
        this.bankNumber = bankNumber;
        this.institutionNumber = institutionNumber;
        this.accountNumber = accountNumber;
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getInstitutionNumber() {
        return institutionNumber;
    }

    public void setInstitutionNumber(String institutionNumber) {
        this.institutionNumber = institutionNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddBankAccountArgs that = (AddBankAccountArgs) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(language, that.language) && Objects.equals(bankNumber, that.bankNumber) && Objects.equals(institutionNumber, that.institutionNumber) && Objects.equals(accountNumber, that.accountNumber) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, name, email, language, bankNumber, institutionNumber, accountNumber);
    }

    @Override
    public String toString() {
        return "AddBankAccountArgs{" +
                "serviceId='" + serviceId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", language='" + language + '\'' +
                ", bankNumber='" + bankNumber + '\'' +
                ", institutionNumber='" + institutionNumber + '\'' +
                ", accountNumber='" + accountNumber + '\'' +

                '}';
    }
}