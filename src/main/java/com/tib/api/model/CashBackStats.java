
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


public class CashBackStats   {

    
    /**
 * Gets or sets the date.
 */
    @JsonProperty("Date")
    private String date;

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


    
    public CashBackStats() {
    }

    
    public CashBackStats(String date, Integer count, Double amount) {
        this.date = date;
this.count = count;
this.amount = amount;

    }
    
    

    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
        CashBackStats that = (CashBackStats) o;
        return Objects.equals(date, that.date) && Objects.equals(count, that.count) && Objects.equals(amount, that.amount) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(date, count, amount);
    }

    @Override
    public String toString() {
        return "CashBackStats{" +
                 "date='" + date + '\'' +
 ", count='" + count + '\'' +
 ", amount='" + amount + '\'' +

                '}';
    }
}