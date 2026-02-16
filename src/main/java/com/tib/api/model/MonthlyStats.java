
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


public class MonthlyStats   {

    
    /**
     * Gets or sets the transaction category.
     */
    @JsonProperty("TransactionCategory")
    private String transactionCategory;

    /**
     * Gets or sets the year month.
     */
    @JsonProperty("YearMonth")
    private String yearMonth;

    /**
     * Gets or sets the number of transactions.
     */
    @JsonProperty("NumberOfTransactions")
    private Integer numberOfTransactions;

    /**
     * Gets or sets the amount of transactions.
     */
    @JsonProperty("AmountOfTransactions")
    private Double amountOfTransactions;


    
    public MonthlyStats() {
    }

    
    public MonthlyStats(String transactionCategory, String yearMonth, Integer numberOfTransactions, Double amountOfTransactions) {
        this.transactionCategory = transactionCategory;
        this.yearMonth = yearMonth;
        this.numberOfTransactions = numberOfTransactions;
        this.amountOfTransactions = amountOfTransactions;
    }
    
    

    
    public String getTransactionCategory() {
        return transactionCategory;
    }

    public void setTransactionCategory(String transactionCategory) {
        this.transactionCategory = transactionCategory;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public Integer getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(Integer numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public Double getAmountOfTransactions() {
        return amountOfTransactions;
    }

    public void setAmountOfTransactions(Double amountOfTransactions) {
        this.amountOfTransactions = amountOfTransactions;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonthlyStats that = (MonthlyStats) o;
        return Objects.equals(transactionCategory, that.transactionCategory) && Objects.equals(yearMonth, that.yearMonth) && Objects.equals(numberOfTransactions, that.numberOfTransactions) && Objects.equals(amountOfTransactions, that.amountOfTransactions) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactionCategory, yearMonth, numberOfTransactions, amountOfTransactions);
    }

    @Override
    public String toString() {
        return "MonthlyStats{" +
                "transactionCategory='" + transactionCategory + '\'' +
                ", yearMonth='" + yearMonth + '\'' +
                ", numberOfTransactions='" + numberOfTransactions + '\'' +
                ", amountOfTransactions='" + amountOfTransactions + '\'' +

                '}';
    }
}