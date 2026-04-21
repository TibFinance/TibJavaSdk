
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
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


public class CreateSupplierArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Display name for the supplier (max 150 characters).
     */
    @JsonProperty("SupplierName")
    private String supplierName;

    /**
     * Email address of the supplier. Used for deduplication and login creation (max 250 characters).
     */
    @JsonProperty("SupplierEmail")
    private String supplierEmail;

    /**
     * The ISO 4217 three‑letter code of the currency in which the transfer was executed.
     */
    @JsonProperty("Currency")
    private Currency currency;

    /**
     * Specifies the language used for the payment request and related communications
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * The bank account number used for the direct account payment.
     */
    @JsonProperty("AccountNumber")
    private String accountNumber;

    /**
     * The bank's identification number used for the direct account payment method.
     */
    @JsonProperty("BankNumber")
    private String bankNumber;

    /**
     * The bank's institution number identifying the financial institution for the direct account payment.
     */
    @JsonProperty("InstitutionNumber")
    private String institutionNumber;


    
    public CreateSupplierArgs() {
    }

    
    public CreateSupplierArgs(String merchantId, String supplierName, String supplierEmail, Currency currency, Language language, String accountNumber, String bankNumber, String institutionNumber) {
        this.merchantId = merchantId;
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.currency = currency;
        this.language = language;
        this.accountNumber = accountNumber;
        this.bankNumber = bankNumber;
        this.institutionNumber = institutionNumber;
    }
    
    
    public CreateSupplierArgs(String sessionToken, String merchantId, String supplierName, String supplierEmail, Currency currency, Language language, String accountNumber, String bankNumber, String institutionNumber) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.currency = currency;
        this.language = language;
        this.accountNumber = accountNumber;
        this.bankNumber = bankNumber;
        this.institutionNumber = institutionNumber;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateSupplierArgs that = (CreateSupplierArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(supplierName, that.supplierName) && Objects.equals(supplierEmail, that.supplierEmail) && Objects.equals(currency, that.currency) && Objects.equals(language, that.language) && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(bankNumber, that.bankNumber) && Objects.equals(institutionNumber, that.institutionNumber) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, supplierName, supplierEmail, currency, language, accountNumber, bankNumber, institutionNumber);
    }

    @Override
    public String toString() {
        return "CreateSupplierArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", supplierEmail='" + supplierEmail + '\'' +
                ", currency='" + currency + '\'' +
                ", language='" + language + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", bankNumber='" + bankNumber + '\'' +
                ", institutionNumber='" + institutionNumber + '\'' +

                '}';
    }
}