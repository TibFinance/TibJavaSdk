
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetAllClientsBillArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * Gets or sets the year.
     */
    @JsonProperty("Year")
    private Integer year;

    /**
     * Gets or sets the month.
     */
    @JsonProperty("Month")
    private Integer month;


    
    public GetAllClientsBillArgs() {
    }

    
    public GetAllClientsBillArgs(Integer year, Integer month) {
        this.year = year;
        this.month = month;
    }
    
    
    public GetAllClientsBillArgs(String adminSessionToken, Integer year, Integer month) {
        super(adminSessionToken);
        this.year = year;
        this.month = month;
    }

    
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAllClientsBillArgs that = (GetAllClientsBillArgs) o;
        return Objects.equals(year, that.year) && Objects.equals(month, that.month) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(year, month);
    }

    @Override
    public String toString() {
        return "GetAllClientsBillArgs{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +

                '}';
    }
}