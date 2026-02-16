
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.DasMonthlyPeriod;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class DasPaymentCanadaEntity   {

    
    /**
     * 
     */
    @JsonProperty("PeriodEndDate")
    private DasMonthlyPeriod periodEndDate;

    /**
     * 
     */
    @JsonProperty("LastPayPeriodEmployeeCount")
    private Integer lastPayPeriodEmployeeCount;

    /**
     * 
     */
    @JsonProperty("PeriodRawRemuneration")
    private Double periodRawRemuneration;

    /**
     * Specifies the amount to be paid. The value must not exceed the sum of the associated bill amount and any previously recorded payments. If null, the system applies the remaining unpaid portion of the bill.
     */
    @JsonProperty("PaymentAmount")
    private Double paymentAmount;


    
    public DasPaymentCanadaEntity() {
    }

    
    public DasPaymentCanadaEntity(DasMonthlyPeriod periodEndDate, Integer lastPayPeriodEmployeeCount, Double periodRawRemuneration, Double paymentAmount) {
        this.periodEndDate = periodEndDate;
        this.lastPayPeriodEmployeeCount = lastPayPeriodEmployeeCount;
        this.periodRawRemuneration = periodRawRemuneration;
        this.paymentAmount = paymentAmount;
    }
    
    

    
    public DasMonthlyPeriod getPeriodEndDate() {
        return periodEndDate;
    }

    public void setPeriodEndDate(DasMonthlyPeriod periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    public Integer getLastPayPeriodEmployeeCount() {
        return lastPayPeriodEmployeeCount;
    }

    public void setLastPayPeriodEmployeeCount(Integer lastPayPeriodEmployeeCount) {
        this.lastPayPeriodEmployeeCount = lastPayPeriodEmployeeCount;
    }

    public Double getPeriodRawRemuneration() {
        return periodRawRemuneration;
    }

    public void setPeriodRawRemuneration(Double periodRawRemuneration) {
        this.periodRawRemuneration = periodRawRemuneration;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DasPaymentCanadaEntity that = (DasPaymentCanadaEntity) o;
        return Objects.equals(periodEndDate, that.periodEndDate) && Objects.equals(lastPayPeriodEmployeeCount, that.lastPayPeriodEmployeeCount) && Objects.equals(periodRawRemuneration, that.periodRawRemuneration) && Objects.equals(paymentAmount, that.paymentAmount) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(periodEndDate, lastPayPeriodEmployeeCount, periodRawRemuneration, paymentAmount);
    }

    @Override
    public String toString() {
        return "DasPaymentCanadaEntity{" +
                "periodEndDate='" + periodEndDate + '\'' +
                ", lastPayPeriodEmployeeCount='" + lastPayPeriodEmployeeCount + '\'' +
                ", periodRawRemuneration='" + periodRawRemuneration + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +

                '}';
    }
}