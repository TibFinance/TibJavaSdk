
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


public class PayoutData   {

    
    /**
     * 
     */
    @JsonProperty("Paid")
    private Double paid;

    /**
     * 
     */
    @JsonProperty("Date")
    private LocalDateTime date;

    /**
     * 
     */
    @JsonProperty("Gross")
    private Double gross;

    /**
     * 
     */
    @JsonProperty("Fees")
    private Double fees;


    
    public PayoutData() {
    }

    
    public PayoutData(Double paid, LocalDateTime date, Double gross, Double fees) {
        this.paid = paid;
        this.date = date;
        this.gross = gross;
        this.fees = fees;
    }
    
    

    
    public Double getPaid() {
        return paid;
    }

    public void setPaid(Double paid) {
        this.paid = paid;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getGross() {
        return gross;
    }

    public void setGross(Double gross) {
        this.gross = gross;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayoutData that = (PayoutData) o;
        return Objects.equals(paid, that.paid) && Objects.equals(date, that.date) && Objects.equals(gross, that.gross) && Objects.equals(fees, that.fees) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paid, date, gross, fees);
    }

    @Override
    public String toString() {
        return "PayoutData{" +
                "paid='" + paid + '\'' +
                ", date='" + date + '\'' +
                ", gross='" + gross + '\'' +
                ", fees='" + fees + '\'' +

                '}';
    }
}