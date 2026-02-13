
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.ErrorReportData;
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


public class ErrorReportDataResponse extends CustomAPIResponse {

    
    @JsonProperty("ErrorReportDataList")
    private List<ErrorReportData> errorReportDataList;


    public ErrorReportDataResponse(Error[] errors, boolean hasError, String messages, List<ErrorReportData> errorReportDataList) {
        super(errors, hasError, messages);
        this.errorReportDataList = errorReportDataList;

    }

    public ErrorReportDataResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.errorReportDataList = (List<ErrorReportData>) apiResponse.getResponse();

        }
    }

    
    public List<ErrorReportData> getErrorReportDataList() {
        return errorReportDataList;
    }

    public void setErrorReportDataList(List<ErrorReportData> errorReportDataList) {
        this.errorReportDataList = errorReportDataList;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErrorReportDataResponse that = (ErrorReportDataResponse) o;
        return Objects.equals(errorReportDataList, that.errorReportDataList) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(errorReportDataList);
    }

    @Override
    public String toString() {
        return "ErrorReportDataResponse{" +
                 "errorReportDataList='" + errorReportDataList + '\'' +

                '}';
    }
}