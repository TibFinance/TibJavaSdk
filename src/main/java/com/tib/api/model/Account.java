
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.AccountType;
import com.tib.api.model.enums.Currency;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class Account   {

    
    /**
     * Represents the name associated with the merchant's account.
     */
    @JsonProperty("AccountName")
    private String accountName;

    /**
     * The 'Owner' property is designed to assign and identify the ownership of a specific resource or object within the system.
     */
    @JsonProperty("Owner")
    private String owner;

    /**
     * 
     */
    @JsonProperty("FirstName")
    private String firstName;

    /**
     * 
     */
    @JsonProperty("LastName")
    private String lastName;

    /**
     * Specifies the payment method type associated with the account.
     */
    @JsonProperty("AccountType")
    private AccountType accountType;

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

    /**
     * Specifies the bank account number associated with the payment method.
     */
    @JsonProperty("AccountNumber")
    private String accountNumber;

    /**
     * The routing number identifying the bank where the customer's account is held.
     */
    @JsonProperty("RoutingNumber")
    private String routingNumber;

    /**
     * Some bank as check digit
     */
    @JsonProperty("CheckDigit")
    private String checkDigit;

    /**
     * Retrieves or assigns the currency type used in transactions.
     */
    @JsonProperty("Currency")
    private Currency currency;

    /**
     * Full account number
     */
    @JsonProperty("FullAccountNumber")
    private String fullAccountNumber;

    /**
     * Gets the account number with check digit.
     */
    @JsonProperty("AccountNumberWithCheckDigit")
    private String accountNumberWithCheckDigit;

    /**
     * Obfuscated string of the account
     */
    @JsonProperty("PreviewString")
    private String previewString;


    
    public Account() {
    }

    
    public Account(String accountName, String owner, String firstName, String lastName, AccountType accountType, String bankNumber, String institutionNumber, String accountNumber, String routingNumber, String checkDigit, Currency currency, String fullAccountNumber, String accountNumberWithCheckDigit, String previewString) {
        this.accountName = accountName;
        this.owner = owner;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountType = accountType;
        this.bankNumber = bankNumber;
        this.institutionNumber = institutionNumber;
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
        this.checkDigit = checkDigit;
        this.currency = currency;
        this.fullAccountNumber = fullAccountNumber;
        this.accountNumberWithCheckDigit = accountNumberWithCheckDigit;
        this.previewString = previewString;
    }
    
    

    
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
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

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getCheckDigit() {
        return checkDigit;
    }

    public void setCheckDigit(String checkDigit) {
        this.checkDigit = checkDigit;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getFullAccountNumber() {
        return fullAccountNumber;
    }

    public void setFullAccountNumber(String fullAccountNumber) {
        this.fullAccountNumber = fullAccountNumber;
    }

    public String getAccountNumberWithCheckDigit() {
        return accountNumberWithCheckDigit;
    }

    public void setAccountNumberWithCheckDigit(String accountNumberWithCheckDigit) {
        this.accountNumberWithCheckDigit = accountNumberWithCheckDigit;
    }

    public String getPreviewString() {
        return previewString;
    }

    public void setPreviewString(String previewString) {
        this.previewString = previewString;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account that = (Account) o;
        return Objects.equals(accountName, that.accountName) && Objects.equals(owner, that.owner) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(accountType, that.accountType) && Objects.equals(bankNumber, that.bankNumber) && Objects.equals(institutionNumber, that.institutionNumber) && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(routingNumber, that.routingNumber) && Objects.equals(checkDigit, that.checkDigit) && Objects.equals(currency, that.currency) && Objects.equals(fullAccountNumber, that.fullAccountNumber) && Objects.equals(accountNumberWithCheckDigit, that.accountNumberWithCheckDigit) && Objects.equals(previewString, that.previewString) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(accountName, owner, firstName, lastName, accountType, bankNumber, institutionNumber, accountNumber, routingNumber, checkDigit, currency, fullAccountNumber, accountNumberWithCheckDigit, previewString);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", owner='" + owner + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", bankNumber='" + bankNumber + '\'' +
                ", institutionNumber='" + institutionNumber + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", routingNumber='" + routingNumber + '\'' +
                ", checkDigit='" + checkDigit + '\'' +
                ", currency='" + currency + '\'' +
                ", fullAccountNumber='" + fullAccountNumber + '\'' +
                ", accountNumberWithCheckDigit='" + accountNumberWithCheckDigit + '\'' +
                ", previewString='" + previewString + '\'' +

                '}';
    }
}