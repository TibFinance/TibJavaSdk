
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


public class GetConsolidationInternalReportArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * Gets or sets the month.
 */
    @JsonProperty("Month")
    private Integer month;

    /**
 * Gets or sets the year.
 */
    @JsonProperty("Year")
    private Integer year;

    /**
 * Gets or sets a value indicating whether [split group identifier].
 */
    @JsonProperty("SplitGroupId")
    private boolean splitGroupId;

    /**
 * Gets or sets a value indicating whether [use collection].
 */
    @JsonProperty("UseCollection")
    private boolean useCollection;


    
    public GetConsolidationInternalReportArgs() {
    }

    
    public GetConsolidationInternalReportArgs(Integer month, Integer year, boolean splitGroupId, boolean useCollection) {
        this.month = month;
this.year = year;
this.splitGroupId = splitGroupId;
this.useCollection = useCollection;

    }
    
    
    public GetConsolidationInternalReportArgs(String adminSessionToken, Integer month, Integer year, boolean splitGroupId, boolean useCollection) {
        super(adminSessionToken);
        this.month = month;
this.year = year;
this.splitGroupId = splitGroupId;
this.useCollection = useCollection;

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

    public boolean getSplitGroupId() {
        return splitGroupId;
    }

    public void setSplitGroupId(boolean splitGroupId) {
        this.splitGroupId = splitGroupId;
    }

    public boolean getUseCollection() {
        return useCollection;
    }

    public void setUseCollection(boolean useCollection) {
        this.useCollection = useCollection;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetConsolidationInternalReportArgs that = (GetConsolidationInternalReportArgs) o;
        return Objects.equals(month, that.month) && Objects.equals(year, that.year) && Objects.equals(splitGroupId, that.splitGroupId) && Objects.equals(useCollection, that.useCollection) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(month, year, splitGroupId, useCollection);
    }

    @Override
    public String toString() {
        return "GetConsolidationInternalReportArgs{" +
                 "month='" + month + '\'' +
 ", year='" + year + '\'' +
 ", splitGroupId='" + splitGroupId + '\'' +
 ", useCollection='" + useCollection + '\'' +

                '}';
    }
}