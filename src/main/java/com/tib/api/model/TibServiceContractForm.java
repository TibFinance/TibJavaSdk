
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Language;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TibServiceContractForm   {

    
    /**
     * Gets or sets the name of the bank.
     */
    @JsonProperty("BankName")
    private String bankName;

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
     * Gets or sets the bank name1.
     */
    @JsonProperty("BankName1")
    private String bankName1;

    /**
     * Gets or sets the bank number1.
     */
    @JsonProperty("BankNumber1")
    private String bankNumber1;

    /**
     * Gets or sets the bank transit1.
     */
    @JsonProperty("BankTransit1")
    private String bankTransit1;

    /**
     * Gets or sets the bank account1.
     */
    @JsonProperty("BankAccount1")
    private String bankAccount1;

    /**
     * Gets or sets the name of the enterprise.
     */
    @JsonProperty("EnterpriseName")
    private String enterpriseName;

    /**
     * Gets or sets the name of the owner.
     */
    @JsonProperty("OwnerName")
    private String ownerName;

    /**
     * Gets or sets the owner address.
     */
    @JsonProperty("OwnerAddress")
    private String ownerAddress;

    /**
     * Gets or sets the owner city.
     */
    @JsonProperty("OwnerCity")
    private String ownerCity;

    /**
     * Gets or sets the owner country.
     */
    @JsonProperty("OwnerCountry")
    private String ownerCountry;

    /**
     * Gets or sets the owner province.
     */
    @JsonProperty("OwnerProvince")
    private String ownerProvince;

    /**
     * Gets or sets the owner postal code.
     */
    @JsonProperty("OwnerPostalCode")
    private String ownerPostalCode;

    /**
     * Gets or sets the owner email.
     */
    @JsonProperty("OwnerEmail")
    private String ownerEmail;

    /**
     * Gets or sets the transaction number withdraw.
     */
    @JsonProperty("TransactionNumberWithdraw")
    private String transactionNumberWithdraw;

    /**
     * Gets or sets the transaction number deposit.
     */
    @JsonProperty("TransactionNumberDeposit")
    private String transactionNumberDeposit;

    /**
     * Gets or sets the transaction number NSF.
     */
    @JsonProperty("TransactionNumberNsf")
    private String transactionNumberNsf;

    /**
     * Gets or sets the amount limit withdraw.
     */
    @JsonProperty("AmountLimitWithdraw")
    private String amountLimitWithdraw;

    /**
     * Gets or sets the amount limit deposit.
     */
    @JsonProperty("AmountLimitDeposit")
    private String amountLimitDeposit;

    /**
     * Gets or sets the amount limit NSF.
     */
    @JsonProperty("AmountLimitNsf")
    private String amountLimitNsf;

    /**
     * Gets or sets the transaction maximum amount.
     */
    @JsonProperty("TransactionMaxAmount")
    private String transactionMaxAmount;

    /**
     * Gets or sets the autorization mail1.
     */
    @JsonProperty("AutorizationMail1")
    private String autorizationMail1;

    /**
     * Gets or sets the autorization mail2.
     */
    @JsonProperty("AutorizationMail2")
    private String autorizationMail2;

    /**
     * Gets or sets the double authentication account.
     */
    @JsonProperty("DoubleAuthenticationAccount")
    private String doubleAuthenticationAccount;

    /**
     * Gets or sets the authorization limit.
     */
    @JsonProperty("AuthorizationLimit")
    private String authorizationLimit;

    /**
     * Gets or sets the client autorisation limit.
     */
    @JsonProperty("ClientAutorisationLimit")
    private String clientAutorisationLimit;

    /**
     * Gets or sets the is accepted.
     */
    @JsonProperty("IsAccepted")
    private String isAccepted;

    /**
     * Gets or sets the public token.
     */
    @JsonProperty("PublicToken")
    private String publicToken;

    /**
     * Retrieves or assigns the default language preference for a customer.
     */
    @JsonProperty("DefaultCustomerLanguage")
    private Language defaultCustomerLanguage;


    
    public TibServiceContractForm() {
    }

    
    public TibServiceContractForm(String bankName, String bankAddress, String bankCity, String bankProvince, String bankCountry, String bankName1, String bankNumber1, String bankTransit1, String bankAccount1, String enterpriseName, String ownerName, String ownerAddress, String ownerCity, String ownerCountry, String ownerProvince, String ownerPostalCode, String ownerEmail, String transactionNumberWithdraw, String transactionNumberDeposit, String transactionNumberNsf, String amountLimitWithdraw, String amountLimitDeposit, String amountLimitNsf, String transactionMaxAmount, String autorizationMail1, String autorizationMail2, String doubleAuthenticationAccount, String authorizationLimit, String clientAutorisationLimit, String isAccepted, String publicToken, Language defaultCustomerLanguage) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.bankCity = bankCity;
        this.bankProvince = bankProvince;
        this.bankCountry = bankCountry;
        this.bankName1 = bankName1;
        this.bankNumber1 = bankNumber1;
        this.bankTransit1 = bankTransit1;
        this.bankAccount1 = bankAccount1;
        this.enterpriseName = enterpriseName;
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
        this.ownerCity = ownerCity;
        this.ownerCountry = ownerCountry;
        this.ownerProvince = ownerProvince;
        this.ownerPostalCode = ownerPostalCode;
        this.ownerEmail = ownerEmail;
        this.transactionNumberWithdraw = transactionNumberWithdraw;
        this.transactionNumberDeposit = transactionNumberDeposit;
        this.transactionNumberNsf = transactionNumberNsf;
        this.amountLimitWithdraw = amountLimitWithdraw;
        this.amountLimitDeposit = amountLimitDeposit;
        this.amountLimitNsf = amountLimitNsf;
        this.transactionMaxAmount = transactionMaxAmount;
        this.autorizationMail1 = autorizationMail1;
        this.autorizationMail2 = autorizationMail2;
        this.doubleAuthenticationAccount = doubleAuthenticationAccount;
        this.authorizationLimit = authorizationLimit;
        this.clientAutorisationLimit = clientAutorisationLimit;
        this.isAccepted = isAccepted;
        this.publicToken = publicToken;
        this.defaultCustomerLanguage = defaultCustomerLanguage;
    }
    
    

    
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
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

    public String getBankName1() {
        return bankName1;
    }

    public void setBankName1(String bankName1) {
        this.bankName1 = bankName1;
    }

    public String getBankNumber1() {
        return bankNumber1;
    }

    public void setBankNumber1(String bankNumber1) {
        this.bankNumber1 = bankNumber1;
    }

    public String getBankTransit1() {
        return bankTransit1;
    }

    public void setBankTransit1(String bankTransit1) {
        this.bankTransit1 = bankTransit1;
    }

    public String getBankAccount1() {
        return bankAccount1;
    }

    public void setBankAccount1(String bankAccount1) {
        this.bankAccount1 = bankAccount1;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public String getOwnerCity() {
        return ownerCity;
    }

    public void setOwnerCity(String ownerCity) {
        this.ownerCity = ownerCity;
    }

    public String getOwnerCountry() {
        return ownerCountry;
    }

    public void setOwnerCountry(String ownerCountry) {
        this.ownerCountry = ownerCountry;
    }

    public String getOwnerProvince() {
        return ownerProvince;
    }

    public void setOwnerProvince(String ownerProvince) {
        this.ownerProvince = ownerProvince;
    }

    public String getOwnerPostalCode() {
        return ownerPostalCode;
    }

    public void setOwnerPostalCode(String ownerPostalCode) {
        this.ownerPostalCode = ownerPostalCode;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getTransactionNumberWithdraw() {
        return transactionNumberWithdraw;
    }

    public void setTransactionNumberWithdraw(String transactionNumberWithdraw) {
        this.transactionNumberWithdraw = transactionNumberWithdraw;
    }

    public String getTransactionNumberDeposit() {
        return transactionNumberDeposit;
    }

    public void setTransactionNumberDeposit(String transactionNumberDeposit) {
        this.transactionNumberDeposit = transactionNumberDeposit;
    }

    public String getTransactionNumberNsf() {
        return transactionNumberNsf;
    }

    public void setTransactionNumberNsf(String transactionNumberNsf) {
        this.transactionNumberNsf = transactionNumberNsf;
    }

    public String getAmountLimitWithdraw() {
        return amountLimitWithdraw;
    }

    public void setAmountLimitWithdraw(String amountLimitWithdraw) {
        this.amountLimitWithdraw = amountLimitWithdraw;
    }

    public String getAmountLimitDeposit() {
        return amountLimitDeposit;
    }

    public void setAmountLimitDeposit(String amountLimitDeposit) {
        this.amountLimitDeposit = amountLimitDeposit;
    }

    public String getAmountLimitNsf() {
        return amountLimitNsf;
    }

    public void setAmountLimitNsf(String amountLimitNsf) {
        this.amountLimitNsf = amountLimitNsf;
    }

    public String getTransactionMaxAmount() {
        return transactionMaxAmount;
    }

    public void setTransactionMaxAmount(String transactionMaxAmount) {
        this.transactionMaxAmount = transactionMaxAmount;
    }

    public String getAutorizationMail1() {
        return autorizationMail1;
    }

    public void setAutorizationMail1(String autorizationMail1) {
        this.autorizationMail1 = autorizationMail1;
    }

    public String getAutorizationMail2() {
        return autorizationMail2;
    }

    public void setAutorizationMail2(String autorizationMail2) {
        this.autorizationMail2 = autorizationMail2;
    }

    public String getDoubleAuthenticationAccount() {
        return doubleAuthenticationAccount;
    }

    public void setDoubleAuthenticationAccount(String doubleAuthenticationAccount) {
        this.doubleAuthenticationAccount = doubleAuthenticationAccount;
    }

    public String getAuthorizationLimit() {
        return authorizationLimit;
    }

    public void setAuthorizationLimit(String authorizationLimit) {
        this.authorizationLimit = authorizationLimit;
    }

    public String getClientAutorisationLimit() {
        return clientAutorisationLimit;
    }

    public void setClientAutorisationLimit(String clientAutorisationLimit) {
        this.clientAutorisationLimit = clientAutorisationLimit;
    }

    public String getIsAccepted() {
        return isAccepted;
    }

    public void setIsAccepted(String isAccepted) {
        this.isAccepted = isAccepted;
    }

    public String getPublicToken() {
        return publicToken;
    }

    public void setPublicToken(String publicToken) {
        this.publicToken = publicToken;
    }

    public Language getDefaultCustomerLanguage() {
        return defaultCustomerLanguage;
    }

    public void setDefaultCustomerLanguage(Language defaultCustomerLanguage) {
        this.defaultCustomerLanguage = defaultCustomerLanguage;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TibServiceContractForm that = (TibServiceContractForm) o;
        return Objects.equals(bankName, that.bankName) && Objects.equals(bankAddress, that.bankAddress) && Objects.equals(bankCity, that.bankCity) && Objects.equals(bankProvince, that.bankProvince) && Objects.equals(bankCountry, that.bankCountry) && Objects.equals(bankName1, that.bankName1) && Objects.equals(bankNumber1, that.bankNumber1) && Objects.equals(bankTransit1, that.bankTransit1) && Objects.equals(bankAccount1, that.bankAccount1) && Objects.equals(enterpriseName, that.enterpriseName) && Objects.equals(ownerName, that.ownerName) && Objects.equals(ownerAddress, that.ownerAddress) && Objects.equals(ownerCity, that.ownerCity) && Objects.equals(ownerCountry, that.ownerCountry) && Objects.equals(ownerProvince, that.ownerProvince) && Objects.equals(ownerPostalCode, that.ownerPostalCode) && Objects.equals(ownerEmail, that.ownerEmail) && Objects.equals(transactionNumberWithdraw, that.transactionNumberWithdraw) && Objects.equals(transactionNumberDeposit, that.transactionNumberDeposit) && Objects.equals(transactionNumberNsf, that.transactionNumberNsf) && Objects.equals(amountLimitWithdraw, that.amountLimitWithdraw) && Objects.equals(amountLimitDeposit, that.amountLimitDeposit) && Objects.equals(amountLimitNsf, that.amountLimitNsf) && Objects.equals(transactionMaxAmount, that.transactionMaxAmount) && Objects.equals(autorizationMail1, that.autorizationMail1) && Objects.equals(autorizationMail2, that.autorizationMail2) && Objects.equals(doubleAuthenticationAccount, that.doubleAuthenticationAccount) && Objects.equals(authorizationLimit, that.authorizationLimit) && Objects.equals(clientAutorisationLimit, that.clientAutorisationLimit) && Objects.equals(isAccepted, that.isAccepted) && Objects.equals(publicToken, that.publicToken) && Objects.equals(defaultCustomerLanguage, that.defaultCustomerLanguage) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(bankName, bankAddress, bankCity, bankProvince, bankCountry, bankName1, bankNumber1, bankTransit1, bankAccount1, enterpriseName, ownerName, ownerAddress, ownerCity, ownerCountry, ownerProvince, ownerPostalCode, ownerEmail, transactionNumberWithdraw, transactionNumberDeposit, transactionNumberNsf, amountLimitWithdraw, amountLimitDeposit, amountLimitNsf, transactionMaxAmount, autorizationMail1, autorizationMail2, doubleAuthenticationAccount, authorizationLimit, clientAutorisationLimit, isAccepted, publicToken, defaultCustomerLanguage);
    }

    @Override
    public String toString() {
        return "TibServiceContractForm{" +
                "bankName='" + bankName + '\'' +
                ", bankAddress='" + bankAddress + '\'' +
                ", bankCity='" + bankCity + '\'' +
                ", bankProvince='" + bankProvince + '\'' +
                ", bankCountry='" + bankCountry + '\'' +
                ", bankName1='" + bankName1 + '\'' +
                ", bankNumber1='" + bankNumber1 + '\'' +
                ", bankTransit1='" + bankTransit1 + '\'' +
                ", bankAccount1='" + bankAccount1 + '\'' +
                ", enterpriseName='" + enterpriseName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerAddress='" + ownerAddress + '\'' +
                ", ownerCity='" + ownerCity + '\'' +
                ", ownerCountry='" + ownerCountry + '\'' +
                ", ownerProvince='" + ownerProvince + '\'' +
                ", ownerPostalCode='" + ownerPostalCode + '\'' +
                ", ownerEmail='" + ownerEmail + '\'' +
                ", transactionNumberWithdraw='" + transactionNumberWithdraw + '\'' +
                ", transactionNumberDeposit='" + transactionNumberDeposit + '\'' +
                ", transactionNumberNsf='" + transactionNumberNsf + '\'' +
                ", amountLimitWithdraw='" + amountLimitWithdraw + '\'' +
                ", amountLimitDeposit='" + amountLimitDeposit + '\'' +
                ", amountLimitNsf='" + amountLimitNsf + '\'' +
                ", transactionMaxAmount='" + transactionMaxAmount + '\'' +
                ", autorizationMail1='" + autorizationMail1 + '\'' +
                ", autorizationMail2='" + autorizationMail2 + '\'' +
                ", doubleAuthenticationAccount='" + doubleAuthenticationAccount + '\'' +
                ", authorizationLimit='" + authorizationLimit + '\'' +
                ", clientAutorisationLimit='" + clientAutorisationLimit + '\'' +
                ", isAccepted='" + isAccepted + '\'' +
                ", publicToken='" + publicToken + '\'' +
                ", defaultCustomerLanguage='" + defaultCustomerLanguage + '\'' +

                '}';
    }
}