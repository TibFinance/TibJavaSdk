
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.DasPaymentProcessStatus;
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


public class DasPaymentCanada  extends DasPaymentCanadaEntity  {

    
    /**
     * Retrieves or assigns the unique identifier for a payment.
     */
    @JsonProperty("PaymentId")
    private String paymentId;

    /**
     * Represents the current state of a transaction within the system.
     */
    @JsonProperty("Status")
    private DasPaymentProcessStatus status;


    
    public DasPaymentCanada() {
    }

    
    public DasPaymentCanada(String paymentId, DasPaymentProcessStatus status) {
        this.paymentId = paymentId;
        this.status = status;
    }
    
    
    public DasPaymentCanada(DasMonthlyPeriod periodEndDate, Integer lastPayPeriodEmployeeCount, Double periodRawRemuneration, Double paymentAmount, String paymentId, DasPaymentProcessStatus status) {
        super(periodEndDate, lastPayPeriodEmployeeCount, periodRawRemuneration, paymentAmount);
        this.paymentId = paymentId;
        this.status = status;
    }

    
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public DasPaymentProcessStatus getStatus() {
        return status;
    }

    public void setStatus(DasPaymentProcessStatus status) {
        this.status = status;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DasPaymentCanada that = (DasPaymentCanada) o;
        return Objects.equals(paymentId, that.paymentId) && Objects.equals(status, that.status) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentId, status);
    }

    @Override
    public String toString() {
        return "DasPaymentCanada{" +
                "paymentId='" + paymentId + '\'' +
                ", status='" + status + '\'' +

                '}';
    }
}