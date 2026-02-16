
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.OperationCategoryReportType;
import com.tib.api.model.OperationCategoryReportEntity;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class OperationDateReportEntity   {

    
    /**
     * Gets or sets the report date.
     */
    @JsonProperty("ReportDate")
    private LocalDateTime reportDate;

    /**
     * Gets or sets the categories.
     */
    @JsonProperty("Categories")
    private Map<OperationCategoryReportType, OperationCategoryReportEntity> categories;


    
    public OperationDateReportEntity() {
    }

    
    public OperationDateReportEntity(LocalDateTime reportDate, Map<OperationCategoryReportType, OperationCategoryReportEntity> categories) {
        this.reportDate = reportDate;
        this.categories = categories;
    }
    
    

    
    public LocalDateTime getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDateTime reportDate) {
        this.reportDate = reportDate;
    }

    public Map<OperationCategoryReportType, OperationCategoryReportEntity> getCategories() {
        return categories;
    }

    public void setCategories(Map<OperationCategoryReportType, OperationCategoryReportEntity> categories) {
        this.categories = categories;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationDateReportEntity that = (OperationDateReportEntity) o;
        return Objects.equals(reportDate, that.reportDate) && Objects.equals(categories, that.categories) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(reportDate, categories);
    }

    @Override
    public String toString() {
        return "OperationDateReportEntity{" +
                "reportDate='" + reportDate + '\'' +
                ", categories='" + categories + '\'' +

                '}';
    }
}