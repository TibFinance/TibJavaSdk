
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


public class SearchCustomerResult   {

    
    /**
     * This property represents the full name of the customer in the system.
     */
    @JsonProperty("CustomerName")
    private String customerName;

    /**
     * Provides a secure representation of the account card number associated with a specific payment method.
     */
    @JsonProperty("AccountPreview")
    private String accountPreview;

    /**
     * Represents the merchant's unique name.
     */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
     * 
     */
    @JsonProperty("NumberOfTransaction")
    private Integer numberOfTransaction;

    /**
     * 
     */
    @JsonProperty("MinTransferAmount")
    private Double minTransferAmount;

    /**
     * 
     */
    @JsonProperty("MaxTransferAmount")
    private Double maxTransferAmount;

    /**
     * 
     */
    @JsonProperty("MinTransferDueDate")
    private LocalDateTime minTransferDueDate;

    /**
     * 
     */
    @JsonProperty("MaxTransferDueDate")
    private LocalDateTime maxTransferDueDate;


    
    public SearchCustomerResult() {
    }

    
    public SearchCustomerResult(String customerName, String accountPreview, String merchantName, Integer numberOfTransaction, Double minTransferAmount, Double maxTransferAmount, LocalDateTime minTransferDueDate, LocalDateTime maxTransferDueDate) {
        this.customerName = customerName;
        this.accountPreview = accountPreview;
        this.merchantName = merchantName;
        this.numberOfTransaction = numberOfTransaction;
        this.minTransferAmount = minTransferAmount;
        this.maxTransferAmount = maxTransferAmount;
        this.minTransferDueDate = minTransferDueDate;
        this.maxTransferDueDate = maxTransferDueDate;
    }
    
    

    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountPreview() {
        return accountPreview;
    }

    public void setAccountPreview(String accountPreview) {
        this.accountPreview = accountPreview;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Integer getNumberOfTransaction() {
        return numberOfTransaction;
    }

    public void setNumberOfTransaction(Integer numberOfTransaction) {
        this.numberOfTransaction = numberOfTransaction;
    }

    public Double getMinTransferAmount() {
        return minTransferAmount;
    }

    public void setMinTransferAmount(Double minTransferAmount) {
        this.minTransferAmount = minTransferAmount;
    }

    public Double getMaxTransferAmount() {
        return maxTransferAmount;
    }

    public void setMaxTransferAmount(Double maxTransferAmount) {
        this.maxTransferAmount = maxTransferAmount;
    }

    public LocalDateTime getMinTransferDueDate() {
        return minTransferDueDate;
    }

    public void setMinTransferDueDate(LocalDateTime minTransferDueDate) {
        this.minTransferDueDate = minTransferDueDate;
    }

    public LocalDateTime getMaxTransferDueDate() {
        return maxTransferDueDate;
    }

    public void setMaxTransferDueDate(LocalDateTime maxTransferDueDate) {
        this.maxTransferDueDate = maxTransferDueDate;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchCustomerResult that = (SearchCustomerResult) o;
        return Objects.equals(customerName, that.customerName) && Objects.equals(accountPreview, that.accountPreview) && Objects.equals(merchantName, that.merchantName) && Objects.equals(numberOfTransaction, that.numberOfTransaction) && Objects.equals(minTransferAmount, that.minTransferAmount) && Objects.equals(maxTransferAmount, that.maxTransferAmount) && Objects.equals(minTransferDueDate, that.minTransferDueDate) && Objects.equals(maxTransferDueDate, that.maxTransferDueDate) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerName, accountPreview, merchantName, numberOfTransaction, minTransferAmount, maxTransferAmount, minTransferDueDate, maxTransferDueDate);
    }

    @Override
    public String toString() {
        return "SearchCustomerResult{" +
                "customerName='" + customerName + '\'' +
                ", accountPreview='" + accountPreview + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", numberOfTransaction='" + numberOfTransaction + '\'' +
                ", minTransferAmount='" + minTransferAmount + '\'' +
                ", maxTransferAmount='" + maxTransferAmount + '\'' +
                ", minTransferDueDate='" + minTransferDueDate + '\'' +
                ", maxTransferDueDate='" + maxTransferDueDate + '\'' +

                '}';
    }
}