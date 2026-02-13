
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.OperationKind;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class FeeSummary   {

    
    /**
 * Gets or sets the total fee amount across all fees.
 */
    @JsonProperty("TotalFeeAmount")
    private Double totalFeeAmount;

    /**
 * Gets or sets the total count of fee transactions.
 */
    @JsonProperty("TotalFeeCount")
    private Integer totalFeeCount;

    /**
 * Gets or sets the total fees for credit card payments.
 */
    @JsonProperty("CreditCardFeesTotal")
    private Double creditCardFeesTotal;

    /**
 * Gets or sets the count of credit card fee transactions.
 */
    @JsonProperty("CreditCardFeesCount")
    private Integer creditCardFeesCount;

    /**
 * Gets or sets the total fees for direct account (bank) payments.
 */
    @JsonProperty("DirectAccountFeesTotal")
    private Double directAccountFeesTotal;

    /**
 * Gets or sets the count of direct account fee transactions.
 */
    @JsonProperty("DirectAccountFeesCount")
    private Integer directAccountFeesCount;

    /**
 * Gets or sets the total fees for Interac payments.
 */
    @JsonProperty("InteracFeesTotal")
    private Double interacFeesTotal;

    /**
 * Gets or sets the count of Interac fee transactions.
 */
    @JsonProperty("InteracFeesCount")
    private Integer interacFeesCount;

    /**
 * Gets or sets the breakdown of fees by fee type.
 */
    @JsonProperty("FeesByType")
    private Map<OperationKind, Object> feesByType;


    
    public FeeSummary() {
    }

    
    public FeeSummary(Double totalFeeAmount, Integer totalFeeCount, Double creditCardFeesTotal, Integer creditCardFeesCount, Double directAccountFeesTotal, Integer directAccountFeesCount, Double interacFeesTotal, Integer interacFeesCount, Map<OperationKind, Object> feesByType) {
        this.totalFeeAmount = totalFeeAmount;
this.totalFeeCount = totalFeeCount;
this.creditCardFeesTotal = creditCardFeesTotal;
this.creditCardFeesCount = creditCardFeesCount;
this.directAccountFeesTotal = directAccountFeesTotal;
this.directAccountFeesCount = directAccountFeesCount;
this.interacFeesTotal = interacFeesTotal;
this.interacFeesCount = interacFeesCount;
this.feesByType = feesByType;

    }
    
    

    
    public Double getTotalFeeAmount() {
        return totalFeeAmount;
    }

    public void setTotalFeeAmount(Double totalFeeAmount) {
        this.totalFeeAmount = totalFeeAmount;
    }

    public Integer getTotalFeeCount() {
        return totalFeeCount;
    }

    public void setTotalFeeCount(Integer totalFeeCount) {
        this.totalFeeCount = totalFeeCount;
    }

    public Double getCreditCardFeesTotal() {
        return creditCardFeesTotal;
    }

    public void setCreditCardFeesTotal(Double creditCardFeesTotal) {
        this.creditCardFeesTotal = creditCardFeesTotal;
    }

    public Integer getCreditCardFeesCount() {
        return creditCardFeesCount;
    }

    public void setCreditCardFeesCount(Integer creditCardFeesCount) {
        this.creditCardFeesCount = creditCardFeesCount;
    }

    public Double getDirectAccountFeesTotal() {
        return directAccountFeesTotal;
    }

    public void setDirectAccountFeesTotal(Double directAccountFeesTotal) {
        this.directAccountFeesTotal = directAccountFeesTotal;
    }

    public Integer getDirectAccountFeesCount() {
        return directAccountFeesCount;
    }

    public void setDirectAccountFeesCount(Integer directAccountFeesCount) {
        this.directAccountFeesCount = directAccountFeesCount;
    }

    public Double getInteracFeesTotal() {
        return interacFeesTotal;
    }

    public void setInteracFeesTotal(Double interacFeesTotal) {
        this.interacFeesTotal = interacFeesTotal;
    }

    public Integer getInteracFeesCount() {
        return interacFeesCount;
    }

    public void setInteracFeesCount(Integer interacFeesCount) {
        this.interacFeesCount = interacFeesCount;
    }

    public Map<OperationKind, Object> getFeesByType() {
        return feesByType;
    }

    public void setFeesByType(Map<OperationKind, Object> feesByType) {
        this.feesByType = feesByType;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeeSummary that = (FeeSummary) o;
        return Objects.equals(totalFeeAmount, that.totalFeeAmount) && Objects.equals(totalFeeCount, that.totalFeeCount) && Objects.equals(creditCardFeesTotal, that.creditCardFeesTotal) && Objects.equals(creditCardFeesCount, that.creditCardFeesCount) && Objects.equals(directAccountFeesTotal, that.directAccountFeesTotal) && Objects.equals(directAccountFeesCount, that.directAccountFeesCount) && Objects.equals(interacFeesTotal, that.interacFeesTotal) && Objects.equals(interacFeesCount, that.interacFeesCount) && Objects.equals(feesByType, that.feesByType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(totalFeeAmount, totalFeeCount, creditCardFeesTotal, creditCardFeesCount, directAccountFeesTotal, directAccountFeesCount, interacFeesTotal, interacFeesCount, feesByType);
    }

    @Override
    public String toString() {
        return "FeeSummary{" +
                 "totalFeeAmount='" + totalFeeAmount + '\'' +
 ", totalFeeCount='" + totalFeeCount + '\'' +
 ", creditCardFeesTotal='" + creditCardFeesTotal + '\'' +
 ", creditCardFeesCount='" + creditCardFeesCount + '\'' +
 ", directAccountFeesTotal='" + directAccountFeesTotal + '\'' +
 ", directAccountFeesCount='" + directAccountFeesCount + '\'' +
 ", interacFeesTotal='" + interacFeesTotal + '\'' +
 ", interacFeesCount='" + interacFeesCount + '\'' +
 ", feesByType='" + feesByType + '\'' +

                '}';
    }
}