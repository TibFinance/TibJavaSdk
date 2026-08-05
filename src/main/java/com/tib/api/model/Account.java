
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
     * The full name of the account holder, as registered with the financial institution.
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
     * BlueSnap ECP (ACH) account type chosen client-side. Optional, max 40 characters, with no server-side whitelist; TIB's own interfaces send CONSUMER_CHECKING (the default), CONSUMER_SAVINGS, CORPORATE_CHECKING or CORPORATE_SAVINGS. Any value starting with CORPORATE (case-insensitive) makes the server derive the provider-required company name for Corporate eCheck from the account Owner. Not sent to the provider directly.
     */
    @JsonProperty("EcpAccountType")
    private String ecpAccountType;

    /**
     * The type of bank account (e.g., personal checking, corporate savings).
     */
    @JsonProperty("AccountType")
    private AccountType accountType;

    /**
     * The bank/institution code (Canadian routing) identifying the financial institution where the account is held — normally 3 digits, though accounts imported from CPA-format routing strings carry it zero-padded to 4 (0III). This is the bank itself, not the branch — the branch transit number is carried by InstitutionNumber.
     */
    @JsonProperty("BankNumber")
    private String bankNumber;

    /**
     * The 5-digit branch/transit number (Canadian routing) where the account is held. Despite the property name, this is the branch transit number, not the institution code — the institution is carried by BankNumber.
     */
    @JsonProperty("InstitutionNumber")
    private String institutionNumber;

    /**
     * The bank account number used for the direct account payment.
     */
    @JsonProperty("AccountNumber")
    private String accountNumber;

    /**
     * The combined routing number (bank number + institution number), used to identify the specific branch.
     */
    @JsonProperty("RoutingNumber")
    private String routingNumber;

    /**
     * The check digit used to validate the account number in the direct account payment method.
     */
    @JsonProperty("CheckDigit")
    private String checkDigit;

    /**
     * The currency denomination of the account (e.g., CAD, USD).
     */
    @JsonProperty("Currency")
    private Currency currency;

    /**
     * The complete account number string composed of bank number, institution number, account number, and optional check digit, separated by dashes.
     */
    @JsonProperty("FullAccountNumber")
    private String fullAccountNumber;

    /**
     * The account number appended with the check digit (if present), separated by a dash.
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

    
    public Account(String accountName, String owner, String firstName, String lastName, String ecpAccountType, AccountType accountType, String bankNumber, String institutionNumber, String accountNumber, String routingNumber, String checkDigit, Currency currency, String fullAccountNumber, String accountNumberWithCheckDigit, String previewString) {
        this.accountName = accountName;
        this.owner = owner;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ecpAccountType = ecpAccountType;
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

    public String getEcpAccountType() {
        return ecpAccountType;
    }

    public void setEcpAccountType(String ecpAccountType) {
        this.ecpAccountType = ecpAccountType;
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
        return Objects.equals(accountName, that.accountName) && Objects.equals(owner, that.owner) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(ecpAccountType, that.ecpAccountType) && Objects.equals(accountType, that.accountType) && Objects.equals(bankNumber, that.bankNumber) && Objects.equals(institutionNumber, that.institutionNumber) && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(routingNumber, that.routingNumber) && Objects.equals(checkDigit, that.checkDigit) && Objects.equals(currency, that.currency) && Objects.equals(fullAccountNumber, that.fullAccountNumber) && Objects.equals(accountNumberWithCheckDigit, that.accountNumberWithCheckDigit) && Objects.equals(previewString, that.previewString) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(accountName, owner, firstName, lastName, ecpAccountType, accountType, bankNumber, institutionNumber, accountNumber, routingNumber, checkDigit, currency, fullAccountNumber, accountNumberWithCheckDigit, previewString);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", owner='" + owner + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ecpAccountType='" + ecpAccountType + '\'' +
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