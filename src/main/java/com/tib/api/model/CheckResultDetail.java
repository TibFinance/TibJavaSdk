
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


public class CheckResultDetail   {

    
    /**
     * Gets or sets the event date.
     */
    @JsonProperty("EventDate")
    private LocalDateTime eventDate;

    /**
     * Gets or sets the transaciton amount.
     */
    @JsonProperty("TransacitonAmount")
    private Double transacitonAmount;


    
    public CheckResultDetail() {
    }

    
    public CheckResultDetail(LocalDateTime eventDate, Double transacitonAmount) {
        this.eventDate = eventDate;
        this.transacitonAmount = transacitonAmount;
    }
    
    

    
    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public Double getTransacitonAmount() {
        return transacitonAmount;
    }

    public void setTransacitonAmount(Double transacitonAmount) {
        this.transacitonAmount = transacitonAmount;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckResultDetail that = (CheckResultDetail) o;
        return Objects.equals(eventDate, that.eventDate) && Objects.equals(transacitonAmount, that.transacitonAmount) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(eventDate, transacitonAmount);
    }

    @Override
    public String toString() {
        return "CheckResultDetail{" +
                "eventDate='" + eventDate + '\'' +
                ", transacitonAmount='" + transacitonAmount + '\'' +

                '}';
    }
}