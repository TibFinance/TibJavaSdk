
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


public class TransactionFeesForCount   {

    
    /**
     * Gets or sets the fee count.
     */
    @JsonProperty("FeeCount")
    private Integer feeCount;

    /**
     * Gets or sets the fee amount.
     */
    @JsonProperty("FeeAmount")
    private Double feeAmount;

    /**
     * Gets or sets the number of payment.
     */
    @JsonProperty("NumberOfPayment")
    private Integer numberOfPayment;

    /**
     * Gets or sets the number of fees.
     */
    @JsonProperty("NumberOfFees")
    private Integer numberOfFees;


    
    public TransactionFeesForCount() {
    }

    
    public TransactionFeesForCount(Integer feeCount, Double feeAmount, Integer numberOfPayment, Integer numberOfFees) {
        this.feeCount = feeCount;
        this.feeAmount = feeAmount;
        this.numberOfPayment = numberOfPayment;
        this.numberOfFees = numberOfFees;
    }
    
    

    
    public Integer getFeeCount() {
        return feeCount;
    }

    public void setFeeCount(Integer feeCount) {
        this.feeCount = feeCount;
    }

    public Double getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(Double feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Integer getNumberOfPayment() {
        return numberOfPayment;
    }

    public void setNumberOfPayment(Integer numberOfPayment) {
        this.numberOfPayment = numberOfPayment;
    }

    public Integer getNumberOfFees() {
        return numberOfFees;
    }

    public void setNumberOfFees(Integer numberOfFees) {
        this.numberOfFees = numberOfFees;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionFeesForCount that = (TransactionFeesForCount) o;
        return Objects.equals(feeCount, that.feeCount) && Objects.equals(feeAmount, that.feeAmount) && Objects.equals(numberOfPayment, that.numberOfPayment) && Objects.equals(numberOfFees, that.numberOfFees) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(feeCount, feeAmount, numberOfPayment, numberOfFees);
    }

    @Override
    public String toString() {
        return "TransactionFeesForCount{" +
                "feeCount='" + feeCount + '\'' +
                ", feeAmount='" + feeAmount + '\'' +
                ", numberOfPayment='" + numberOfPayment + '\'' +
                ", numberOfFees='" + numberOfFees + '\'' +

                '}';
    }
}