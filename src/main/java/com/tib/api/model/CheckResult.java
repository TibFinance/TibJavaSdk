
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


public class CheckResult   {

    
    /**
     * Gets or sets a value indicating whether [account found].
     */
    @JsonProperty("AccountFound")
    private boolean accountFound;

    /**
     * Specifies the starting date for filtering payment due dates.
     */
    @JsonProperty("FromDate")
    private LocalDateTime fromDate;

    /**
     * Specifies the payment due date.
     */
    @JsonProperty("ToDate")
    private LocalDateTime toDate;

    /**
     * Gets or sets the fail count.
     */
    @JsonProperty("FailCount")
    private Integer failCount;


    
    public CheckResult() {
    }

    
    public CheckResult(boolean accountFound, LocalDateTime fromDate, LocalDateTime toDate, Integer failCount) {
        this.accountFound = accountFound;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.failCount = failCount;
    }
    
    

    
    public boolean getAccountFound() {
        return accountFound;
    }

    public void setAccountFound(boolean accountFound) {
        this.accountFound = accountFound;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckResult that = (CheckResult) o;
        return Objects.equals(accountFound, that.accountFound) && Objects.equals(fromDate, that.fromDate) && Objects.equals(toDate, that.toDate) && Objects.equals(failCount, that.failCount) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(accountFound, fromDate, toDate, failCount);
    }

    @Override
    public String toString() {
        return "CheckResult{" +
                "accountFound='" + accountFound + '\'' +
                ", fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", failCount='" + failCount + '\'' +

                '}';
    }
}