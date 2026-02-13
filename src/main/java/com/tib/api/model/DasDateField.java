
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


public class DasDateField   {

    
    /**
 * 
 */
    @JsonProperty("Day")
    private Integer day;

    /**
 * 
 */
    @JsonProperty("Month")
    private Integer month;

    /**
 * 
 */
    @JsonProperty("Year")
    private Integer year;

    /**
 * 
 */
    @JsonProperty("DateTimeValue")
    private LocalDateTime dateTimeValue;


    
    public DasDateField() {
    }

    
    public DasDateField(Integer day, Integer month, Integer year, LocalDateTime dateTimeValue) {
        this.day = day;
this.month = month;
this.year = year;
this.dateTimeValue = dateTimeValue;

    }
    
    

    
    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public LocalDateTime getDateTimeValue() {
        return dateTimeValue;
    }

    public void setDateTimeValue(LocalDateTime dateTimeValue) {
        this.dateTimeValue = dateTimeValue;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DasDateField that = (DasDateField) o;
        return Objects.equals(day, that.day) && Objects.equals(month, that.month) && Objects.equals(year, that.year) && Objects.equals(dateTimeValue, that.dateTimeValue) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(day, month, year, dateTimeValue);
    }

    @Override
    public String toString() {
        return "DasDateField{" +
                 "day='" + day + '\'' +
 ", month='" + month + '\'' +
 ", year='" + year + '\'' +
 ", dateTimeValue='" + dateTimeValue + '\'' +

                '}';
    }
}