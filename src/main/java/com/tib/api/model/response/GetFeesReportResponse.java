
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.FeeReportLineItem;
import com.tib.api.model.FeeSummary;
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


public class GetFeesReportResponse extends CustomAPIResponse {

    
    @JsonProperty("FeeItems")
    private List<FeeReportLineItem> feeItems;

    @JsonProperty("Summary")
    private FeeSummary summary;


    public GetFeesReportResponse(Error[] errors, boolean hasError, String messages, List<FeeReportLineItem> feeItems, FeeSummary summary) {
        super(errors, hasError, messages);
        this.feeItems = feeItems;
this.summary = summary;

    }

    public GetFeesReportResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.feeItems = (List<FeeReportLineItem>) apiResponse.getResponse();
this.summary = objectMapper.readValue(json, FeeSummary.class);

        }
    }

    
    public List<FeeReportLineItem> getFeeItems() {
        return feeItems;
    }

    public void setFeeItems(List<FeeReportLineItem> feeItems) {
        this.feeItems = feeItems;
    }

    public FeeSummary getSummary() {
        return summary;
    }

    public void setSummary(FeeSummary summary) {
        this.summary = summary;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetFeesReportResponse that = (GetFeesReportResponse) o;
        return Objects.equals(feeItems, that.feeItems) && Objects.equals(summary, that.summary) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(feeItems, summary);
    }

    @Override
    public String toString() {
        return "GetFeesReportResponse{" +
                 "feeItems='" + feeItems + '\'' +
 ", summary='" + summary + '\'' +

                '}';
    }
}