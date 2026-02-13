
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.DasDateField;
import com.tib.api.model.DasDateField;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class DasPaymentQuebecEntity   {

    
    /**
 * 
 */
    @JsonProperty("PeriodStartDate")
    private DasDateField periodStartDate;

    /**
 * 
 */
    @JsonProperty("PeriodEndDate")
    private DasDateField periodEndDate;

    /**
 * 
 */
    @JsonProperty("WithhodingTax")
    private Double withhodingTax;

    /**
 * 
 */
    @JsonProperty("RetirementPensionPlan")
    private Double retirementPensionPlan;

    /**
 * 
 */
    @JsonProperty("HealthServiceFund")
    private Double healthServiceFund;

    /**
 * 
 */
    @JsonProperty("ParentalInsurancePlan")
    private Double parentalInsurancePlan;

    /**
 * 
 */
    @JsonProperty("CNESST")
    private Double cNESST;


    
    public DasPaymentQuebecEntity() {
    }

    
    public DasPaymentQuebecEntity(DasDateField periodStartDate, DasDateField periodEndDate, Double withhodingTax, Double retirementPensionPlan, Double healthServiceFund, Double parentalInsurancePlan, Double cNESST) {
        this.periodStartDate = periodStartDate;
this.periodEndDate = periodEndDate;
this.withhodingTax = withhodingTax;
this.retirementPensionPlan = retirementPensionPlan;
this.healthServiceFund = healthServiceFund;
this.parentalInsurancePlan = parentalInsurancePlan;
this.cNESST = cNESST;

    }
    
    

    
    public DasDateField getPeriodStartDate() {
        return periodStartDate;
    }

    public void setPeriodStartDate(DasDateField periodStartDate) {
        this.periodStartDate = periodStartDate;
    }

    public DasDateField getPeriodEndDate() {
        return periodEndDate;
    }

    public void setPeriodEndDate(DasDateField periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    public Double getWithhodingTax() {
        return withhodingTax;
    }

    public void setWithhodingTax(Double withhodingTax) {
        this.withhodingTax = withhodingTax;
    }

    public Double getRetirementPensionPlan() {
        return retirementPensionPlan;
    }

    public void setRetirementPensionPlan(Double retirementPensionPlan) {
        this.retirementPensionPlan = retirementPensionPlan;
    }

    public Double getHealthServiceFund() {
        return healthServiceFund;
    }

    public void setHealthServiceFund(Double healthServiceFund) {
        this.healthServiceFund = healthServiceFund;
    }

    public Double getParentalInsurancePlan() {
        return parentalInsurancePlan;
    }

    public void setParentalInsurancePlan(Double parentalInsurancePlan) {
        this.parentalInsurancePlan = parentalInsurancePlan;
    }

    public Double getCNESST() {
        return cNESST;
    }

    public void setCNESST(Double cNESST) {
        this.cNESST = cNESST;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DasPaymentQuebecEntity that = (DasPaymentQuebecEntity) o;
        return Objects.equals(periodStartDate, that.periodStartDate) && Objects.equals(periodEndDate, that.periodEndDate) && Objects.equals(withhodingTax, that.withhodingTax) && Objects.equals(retirementPensionPlan, that.retirementPensionPlan) && Objects.equals(healthServiceFund, that.healthServiceFund) && Objects.equals(parentalInsurancePlan, that.parentalInsurancePlan) && Objects.equals(cNESST, that.cNESST) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(periodStartDate, periodEndDate, withhodingTax, retirementPensionPlan, healthServiceFund, parentalInsurancePlan, cNESST);
    }

    @Override
    public String toString() {
        return "DasPaymentQuebecEntity{" +
                 "periodStartDate='" + periodStartDate + '\'' +
 ", periodEndDate='" + periodEndDate + '\'' +
 ", withhodingTax='" + withhodingTax + '\'' +
 ", retirementPensionPlan='" + retirementPensionPlan + '\'' +
 ", healthServiceFund='" + healthServiceFund + '\'' +
 ", parentalInsurancePlan='" + parentalInsurancePlan + '\'' +
 ", cNESST='" + cNESST + '\'' +

                '}';
    }
}