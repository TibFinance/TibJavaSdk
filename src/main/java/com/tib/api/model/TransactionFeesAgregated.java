
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.TransactionFeesForCount;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransactionFeesAgregated   {

    
    /**
 * Gets or sets the fees by count.
 */
    @JsonProperty("FeesByCount")
    private List<TransactionFeesForCount> feesByCount;

    /**
 * Gets or sets the total fee amount.
 */
    @JsonProperty("TotalFeeAmount")
    private Double totalFeeAmount;

    /**
 * Gets or sets the total number of payments.
 */
    @JsonProperty("TotalNumberOfPayments")
    private Integer totalNumberOfPayments;

    /**
 * Gets or sets the total number of fees.
 */
    @JsonProperty("TotalNumberOfFees")
    private Integer totalNumberOfFees;


    
    public TransactionFeesAgregated() {
    }

    
    public TransactionFeesAgregated(List<TransactionFeesForCount> feesByCount, Double totalFeeAmount, Integer totalNumberOfPayments, Integer totalNumberOfFees) {
        this.feesByCount = feesByCount;
this.totalFeeAmount = totalFeeAmount;
this.totalNumberOfPayments = totalNumberOfPayments;
this.totalNumberOfFees = totalNumberOfFees;

    }
    
    

    
    public List<TransactionFeesForCount> getFeesByCount() {
        return feesByCount;
    }

    public void setFeesByCount(List<TransactionFeesForCount> feesByCount) {
        this.feesByCount = feesByCount;
    }

    public Double getTotalFeeAmount() {
        return totalFeeAmount;
    }

    public void setTotalFeeAmount(Double totalFeeAmount) {
        this.totalFeeAmount = totalFeeAmount;
    }

    public Integer getTotalNumberOfPayments() {
        return totalNumberOfPayments;
    }

    public void setTotalNumberOfPayments(Integer totalNumberOfPayments) {
        this.totalNumberOfPayments = totalNumberOfPayments;
    }

    public Integer getTotalNumberOfFees() {
        return totalNumberOfFees;
    }

    public void setTotalNumberOfFees(Integer totalNumberOfFees) {
        this.totalNumberOfFees = totalNumberOfFees;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionFeesAgregated that = (TransactionFeesAgregated) o;
        return Objects.equals(feesByCount, that.feesByCount) && Objects.equals(totalFeeAmount, that.totalFeeAmount) && Objects.equals(totalNumberOfPayments, that.totalNumberOfPayments) && Objects.equals(totalNumberOfFees, that.totalNumberOfFees) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(feesByCount, totalFeeAmount, totalNumberOfPayments, totalNumberOfFees);
    }

    @Override
    public String toString() {
        return "TransactionFeesAgregated{" +
                 "feesByCount='" + feesByCount + '\'' +
 ", totalFeeAmount='" + totalFeeAmount + '\'' +
 ", totalNumberOfPayments='" + totalNumberOfPayments + '\'' +
 ", totalNumberOfFees='" + totalNumberOfFees + '\'' +

                '}';
    }
}