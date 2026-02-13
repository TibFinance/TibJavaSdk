
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.AggregatedCategoryExtraction;
import com.tib.api.model.MonthlyStats;
import com.tib.api.model.CashBackStats;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetSummaryInformationsResponse extends CustomAPIResponse {

    
    @JsonProperty("AggregatedCategoryExtractions")
    private List<AggregatedCategoryExtraction> aggregatedCategoryExtractions;

    @JsonProperty("MonthlyTransactionStats")
    private List<MonthlyStats> monthlyTransactionStats;

    @JsonProperty("DailyCashbackStats")
    private List<CashBackStats> dailyCashbackStats;


    public GetSummaryInformationsResponse(Error[] errors, boolean hasError, String messages, List<AggregatedCategoryExtraction> aggregatedCategoryExtractions, List<MonthlyStats> monthlyTransactionStats, List<CashBackStats> dailyCashbackStats) {
        super(errors, hasError, messages);
        this.aggregatedCategoryExtractions = aggregatedCategoryExtractions;
this.monthlyTransactionStats = monthlyTransactionStats;
this.dailyCashbackStats = dailyCashbackStats;

    }

    public GetSummaryInformationsResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.aggregatedCategoryExtractions = (List<AggregatedCategoryExtraction>) apiResponse.getResponse();
this.monthlyTransactionStats = (List<MonthlyStats>) apiResponse.getResponse();
this.dailyCashbackStats = (List<CashBackStats>) apiResponse.getResponse();

        }
    }

    
    public List<AggregatedCategoryExtraction> getAggregatedCategoryExtractions() {
        return aggregatedCategoryExtractions;
    }

    public void setAggregatedCategoryExtractions(List<AggregatedCategoryExtraction> aggregatedCategoryExtractions) {
        this.aggregatedCategoryExtractions = aggregatedCategoryExtractions;
    }

    public List<MonthlyStats> getMonthlyTransactionStats() {
        return monthlyTransactionStats;
    }

    public void setMonthlyTransactionStats(List<MonthlyStats> monthlyTransactionStats) {
        this.monthlyTransactionStats = monthlyTransactionStats;
    }

    public List<CashBackStats> getDailyCashbackStats() {
        return dailyCashbackStats;
    }

    public void setDailyCashbackStats(List<CashBackStats> dailyCashbackStats) {
        this.dailyCashbackStats = dailyCashbackStats;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSummaryInformationsResponse that = (GetSummaryInformationsResponse) o;
        return Objects.equals(aggregatedCategoryExtractions, that.aggregatedCategoryExtractions) && Objects.equals(monthlyTransactionStats, that.monthlyTransactionStats) && Objects.equals(dailyCashbackStats, that.dailyCashbackStats) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(aggregatedCategoryExtractions, monthlyTransactionStats, dailyCashbackStats);
    }

    @Override
    public String toString() {
        return "GetSummaryInformationsResponse{" +
                 "aggregatedCategoryExtractions='" + aggregatedCategoryExtractions + '\'' +
 ", monthlyTransactionStats='" + monthlyTransactionStats + '\'' +
 ", dailyCashbackStats='" + dailyCashbackStats + '\'' +

                '}';
    }
}