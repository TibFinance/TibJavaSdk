
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.ConsolidationInternalReportEntity;
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


public class GetConsolidationInternalReportResponse extends CustomAPIResponse {

    
    @JsonProperty("ConsolidationInternalReportList")
    private List<ConsolidationInternalReportEntity> consolidationInternalReportList;


    public GetConsolidationInternalReportResponse(Error[] errors, boolean hasError, String messages, List<ConsolidationInternalReportEntity> consolidationInternalReportList) {
        super(errors, hasError, messages);
        this.consolidationInternalReportList = consolidationInternalReportList;

    }

    public GetConsolidationInternalReportResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.consolidationInternalReportList = (List<ConsolidationInternalReportEntity>) apiResponse.getResponse();

        }
    }

    
    public List<ConsolidationInternalReportEntity> getConsolidationInternalReportList() {
        return consolidationInternalReportList;
    }

    public void setConsolidationInternalReportList(List<ConsolidationInternalReportEntity> consolidationInternalReportList) {
        this.consolidationInternalReportList = consolidationInternalReportList;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetConsolidationInternalReportResponse that = (GetConsolidationInternalReportResponse) o;
        return Objects.equals(consolidationInternalReportList, that.consolidationInternalReportList) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(consolidationInternalReportList);
    }

    @Override
    public String toString() {
        return "GetConsolidationInternalReportResponse{" +
                 "consolidationInternalReportList='" + consolidationInternalReportList + '\'' +

                '}';
    }
}