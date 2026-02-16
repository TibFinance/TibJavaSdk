
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.OperationCategoryReportType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class OperationCategoryReportEntity   {

    
    /**
     * Gets or sets the type of the category.
     */
    @JsonProperty("CategoryType")
    private OperationCategoryReportType categoryType;

    /**
     * Gets or sets the number of transactions.
     */
    @JsonProperty("NumberOfTransactions")
    private Integer numberOfTransactions;

    /**
     * Retrieves or assigns the monetary amount involved in the transaction.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * 
     */
    @JsonProperty("IncludedTransfers")
    private List<String> includedTransfers;

    /**
     * 
     */
    @JsonProperty("IncludedOperations")
    private List<String> includedOperations;


    
    public OperationCategoryReportEntity() {
    }

    
    public OperationCategoryReportEntity(OperationCategoryReportType categoryType, Integer numberOfTransactions, Double amount, List<String> includedTransfers, List<String> includedOperations) {
        this.categoryType = categoryType;
        this.numberOfTransactions = numberOfTransactions;
        this.amount = amount;
        this.includedTransfers = includedTransfers;
        this.includedOperations = includedOperations;
    }
    
    

    
    public OperationCategoryReportType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(OperationCategoryReportType categoryType) {
        this.categoryType = categoryType;
    }

    public Integer getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(Integer numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<String> getIncludedTransfers() {
        return includedTransfers;
    }

    public void setIncludedTransfers(List<String> includedTransfers) {
        this.includedTransfers = includedTransfers;
    }

    public List<String> getIncludedOperations() {
        return includedOperations;
    }

    public void setIncludedOperations(List<String> includedOperations) {
        this.includedOperations = includedOperations;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationCategoryReportEntity that = (OperationCategoryReportEntity) o;
        return Objects.equals(categoryType, that.categoryType) && Objects.equals(numberOfTransactions, that.numberOfTransactions) && Objects.equals(amount, that.amount) && Objects.equals(includedTransfers, that.includedTransfers) && Objects.equals(includedOperations, that.includedOperations) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(categoryType, numberOfTransactions, amount, includedTransfers, includedOperations);
    }

    @Override
    public String toString() {
        return "OperationCategoryReportEntity{" +
                "categoryType='" + categoryType + '\'' +
                ", numberOfTransactions='" + numberOfTransactions + '\'' +
                ", amount='" + amount + '\'' +
                ", includedTransfers='" + includedTransfers + '\'' +
                ", includedOperations='" + includedOperations + '\'' +

                '}';
    }
}