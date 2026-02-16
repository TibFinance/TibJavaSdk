
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ErrorReportData   {

    
    /**
     * Provides a detailed explanation of the function's purpose and usage within the API.
     */
    @JsonProperty("Description")
    private String description;

    /**
     * Represents the name associated with the merchant's account.
     */
    @JsonProperty("AccountName")
    private String accountName;

    /**
     * Represents the merchant's unique name.
     */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
     * 
     */
    @JsonProperty("ErrorDate")
    private String errorDate;

    /**
     * 
     */
    @JsonProperty("ErrorDate2")
    private LocalDateTime errorDate2;

    /**
     * 
     */
    @JsonProperty("TransactionDate2")
    private LocalDateTime transactionDate2;

    /**
     * The date and time when the payment was created.
     */
    @JsonProperty("CreatedDate")
    private LocalDateTime createdDate;

    /**
     * Gets or sets the execution date and time of the transaction.
     */
    @JsonProperty("ExecutedDate")
    private Optional<LocalDateTime> executedDate;

    /**
     * 
     */
    @JsonProperty("TransactionDate")
    private String transactionDate;

    /**
     * Retrieves or assigns the monetary amount involved in the transaction.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * 
     */
    @JsonProperty("Context")
    private String context;


    
    public ErrorReportData() {
    }

    
    public ErrorReportData(String description, String accountName, String merchantName, String errorDate, LocalDateTime errorDate2, LocalDateTime transactionDate2, LocalDateTime createdDate, Optional<LocalDateTime> executedDate, String transactionDate, Double amount, String context) {
        this.description = description;
        this.accountName = accountName;
        this.merchantName = merchantName;
        this.errorDate = errorDate;
        this.errorDate2 = errorDate2;
        this.transactionDate2 = transactionDate2;
        this.createdDate = createdDate;
        this.executedDate = executedDate;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.context = context;
    }
    
    

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getErrorDate() {
        return errorDate;
    }

    public void setErrorDate(String errorDate) {
        this.errorDate = errorDate;
    }

    public LocalDateTime getErrorDate2() {
        return errorDate2;
    }

    public void setErrorDate2(LocalDateTime errorDate2) {
        this.errorDate2 = errorDate2;
    }

    public LocalDateTime getTransactionDate2() {
        return transactionDate2;
    }

    public void setTransactionDate2(LocalDateTime transactionDate2) {
        this.transactionDate2 = transactionDate2;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Optional<LocalDateTime> getExecutedDate() {
        return executedDate;
    }

    public void setExecutedDate(Optional<LocalDateTime> executedDate) {
        this.executedDate = executedDate;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErrorReportData that = (ErrorReportData) o;
        return Objects.equals(description, that.description) && Objects.equals(accountName, that.accountName) && Objects.equals(merchantName, that.merchantName) && Objects.equals(errorDate, that.errorDate) && Objects.equals(errorDate2, that.errorDate2) && Objects.equals(transactionDate2, that.transactionDate2) && Objects.equals(createdDate, that.createdDate) && Objects.equals(executedDate, that.executedDate) && Objects.equals(transactionDate, that.transactionDate) && Objects.equals(amount, that.amount) && Objects.equals(context, that.context) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(description, accountName, merchantName, errorDate, errorDate2, transactionDate2, createdDate, executedDate, transactionDate, amount, context);
    }

    @Override
    public String toString() {
        return "ErrorReportData{" +
                "description='" + description + '\'' +
                ", accountName='" + accountName + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", errorDate='" + errorDate + '\'' +
                ", errorDate2='" + errorDate2 + '\'' +
                ", transactionDate2='" + transactionDate2 + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", executedDate='" + executedDate + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                ", amount='" + amount + '\'' +
                ", context='" + context + '\'' +

                '}';
    }
}