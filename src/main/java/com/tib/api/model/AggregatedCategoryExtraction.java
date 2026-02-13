
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.DataSummaryAggregationCategory;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class AggregatedCategoryExtraction   {

    
    /**
 * Gets or sets the data summary aggregation category.
 */
    @JsonProperty("DataSummaryAggregationCategory")
    private DataSummaryAggregationCategory dataSummaryAggregationCategory;

    /**
 * Gets or sets the count.
 */
    @JsonProperty("Count")
    private Integer count;

    /**
 * Retrieves or assigns the monetary amount involved in the transaction.
 */
    @JsonProperty("Amount")
    private Double amount;


    
    public AggregatedCategoryExtraction() {
    }

    
    public AggregatedCategoryExtraction(DataSummaryAggregationCategory dataSummaryAggregationCategory, Integer count, Double amount) {
        this.dataSummaryAggregationCategory = dataSummaryAggregationCategory;
this.count = count;
this.amount = amount;

    }
    
    

    
    public DataSummaryAggregationCategory getDataSummaryAggregationCategory() {
        return dataSummaryAggregationCategory;
    }

    public void setDataSummaryAggregationCategory(DataSummaryAggregationCategory dataSummaryAggregationCategory) {
        this.dataSummaryAggregationCategory = dataSummaryAggregationCategory;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AggregatedCategoryExtraction that = (AggregatedCategoryExtraction) o;
        return Objects.equals(dataSummaryAggregationCategory, that.dataSummaryAggregationCategory) && Objects.equals(count, that.count) && Objects.equals(amount, that.amount) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(dataSummaryAggregationCategory, count, amount);
    }

    @Override
    public String toString() {
        return "AggregatedCategoryExtraction{" +
                 "dataSummaryAggregationCategory='" + dataSummaryAggregationCategory + '\'' +
 ", count='" + count + '\'' +
 ", amount='" + amount + '\'' +

                '}';
    }
}