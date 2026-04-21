
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.AccountType;
import com.tib.api.model.enums.Currency;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class Account   {

    
    /**
     * The display name of the account involved in the transfer.
     */
    @JsonProperty("AccountName")
    private String accountName;

    /**
     * Identifier of the entity that owns the payment method.
     */
    @JsonProperty("Owner")
    private String owner;

    /**
     * The payer's given name for the direct account payment.
     */
    @JsonProperty("FirstName")
    private String firstName;

    /**
     * The account holder’s last name for the direct account payment method.
     */
    @JsonProperty("LastName")
    private String lastName;

    /**
     * The type of payment method used for the transfer.
     */
    @JsonProperty("AccountType")
    private AccountType accountType;

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

    /**
     * The bank account number used for the direct account payment.
     */
    @JsonProperty("AccountNumber")
    private String accountNumber;

    /**
     * The bank routing number identifying the financial institution for the direct account payment.
     */
    @JsonProperty("RoutingNumber")
    private String routingNumber;

    /**
     * The check digit used to validate the account number in the direct account payment method.
     */
    @JsonProperty("CheckDigit")
    private String checkDigit;

    /**
     * The ISO 4217 three‑letter code of the currency in which the transfer was executed.
     */
    @JsonProperty("Currency")
    private Currency currency;

    /**
     * The complete bank account number to be used for the direct payment method.
     */
    @JsonProperty("FullAccountNumber")
    private String fullAccountNumber;

    /**
     * The full bank account number including its check digit.
     */
    @JsonProperty("AccountNumberWithCheckDigit")
    private String accountNumberWithCheckDigit;

    /**
     * A formatted string that previews the direct account payment method details before creation.
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