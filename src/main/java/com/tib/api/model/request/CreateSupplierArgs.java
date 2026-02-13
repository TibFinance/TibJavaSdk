
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.Language;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateSupplierArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * 
 */
    @JsonProperty("SupplierName")
    private String supplierName;

    /**
 * 
 */
    @JsonProperty("SupplierEmail")
    private String supplierEmail;

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

    /**
 * Specifies the bank account number associated with the payment method.
 */
    @JsonProperty("AccountNumber")
    private String accountNumber;

    /**
 * Identifies the bank associated with the account using its numeric identifier.
 */
    @JsonProperty("BankNumber")
    private String bankNumber;

    /**
 * Bank institution code identifying the financial institution for a transaction.
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