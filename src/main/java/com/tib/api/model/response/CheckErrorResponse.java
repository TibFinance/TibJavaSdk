
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.fasterxml.jackson.core.type.TypeReference;
import com.tib.api.model.CheckResult;
import com.tib.api.model.CheckResultDetail;
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


public class CheckErrorResponse extends CustomAPIResponse {

    
    @JsonProperty("CheckResult")
    private CheckResult CheckResult;

    @JsonProperty("Result")
    private List<CheckResultDetail> Result;


    public CheckErrorResponse(Error[] errors, boolean hasError, String messages, CheckResult CheckResult, List<CheckResultDetail> Result) {
        super(errors, hasError, messages);
        this.CheckResult = CheckResult;
this.Result = Result;

    }

    public CheckErrorResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            CheckErrorResponse typed = objectMapper.convertValue(
        apiResponse.getResponse(),
        CheckErrorResponse.class);
            this.CheckResult = typed.CheckResult;
            this.Result = typed.Result;

        }
    }

    
    public CheckResult getCheckResult() {
        return CheckResult;
    }

    public void setCheckResult(CheckResult CheckResult) {
        this.CheckResult = CheckResult;
    }

    public List<CheckResultDetail> getResult() {
        return Result;
    }

    public void setResult(List<CheckResultDetail> Result) {
        this.Result = Result;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckErrorResponse that = (CheckErrorResponse) o;
        return Objects.equals(CheckResult, that.CheckResult) && Objects.equals(Result, that.Result) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(CheckResult, Result);
    }

    @Override
    public String toString() {
        return "CheckErrorResponse{" +
                 "CheckResult='" + CheckResult + '\'' +
 "Result='" + Result + '\'' +

                '}';
    }
}