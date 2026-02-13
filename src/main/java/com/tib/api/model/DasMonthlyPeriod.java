
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


public class DasMonthlyPeriod   {

    
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


    
    public DasMonthlyPeriod() {
    }

    
    public DasMonthlyPeriod(Integer month, Integer year) {
        this.month = month;
this.year = year;

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



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DasMonthlyPeriod that = (DasMonthlyPeriod) o;
        return Objects.equals(month, that.month) && Objects.equals(year, that.year) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(month, year);
    }

    @Override
    public String toString() {
        return "DasMonthlyPeriod{" +
                 "month='" + month + '\'' +
 ", year='" + year + '\'' +

                '}';
    }
}