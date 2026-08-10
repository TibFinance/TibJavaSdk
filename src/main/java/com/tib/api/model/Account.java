
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
     * Convenience alias for the Canadian routing pair. On read, returns BankNumber concatenated with InstitutionNumber. On write, accepts exactly 9 digits — a 4-digit zero-padded institution code followed by a 5-digit branch transit — and splits them into BankNumber and InstitutionNumber; a value of any other length is ignored silently. Supply either this field or BankNumber + InstitutionNumber.
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


    
    public Account() {
    }

    
    public Account(String accountName, String owner, String bankNumber, String institutionNumber, String accountNumber, String routingNumber, String checkDigit, Currency currency) {
        this.accountName = accountName;
        this.owner = owner;
        this.bankNumber = bankNumber;
        this.institutionNumber = institutionNumber;
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
        this.checkDigit = checkDigit;
        this.currency = currency;
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



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account that = (Account) o;
        return Objects.equals(accountName, that.accountName) && Objects.equals(owner, that.owner) && Objects.equals(bankNumber, that.bankNumber) && Objects.equals(institutionNumber, that.institutionNumber) && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(routingNumber, that.routingNumber) && Objects.equals(checkDigit, that.checkDigit) && Objects.equals(currency, that.currency) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(accountName, owner, bankNumber, institutionNumber, accountNumber, routingNumber, checkDigit, currency);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", owner='" + owner + '\'' +
                ", bankNumber='" + bankNumber + '\'' +
                ", institutionNumber='" + institutionNumber + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", routingNumber='" + routingNumber + '\'' +
                ", checkDigit='" + checkDigit + '\'' +
                ", currency='" + currency + '\'' +

                '}';
    }
}