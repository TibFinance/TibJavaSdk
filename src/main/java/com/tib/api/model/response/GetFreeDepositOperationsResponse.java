
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.FreeDepositOperation;
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


public class GetFreeDepositOperationsResponse extends CustomAPIResponse {

    
    @JsonProperty("OperationList")
    private List<FreeDepositOperation> operationList;


    public GetFreeDepositOperationsResponse(Error[] errors, boolean hasError, String messages, List<FreeDepositOperation> operationList) {
        super(errors, hasError, messages);
        this.operationList = operationList;
    }

    public GetFreeDepositOperationsResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.operationList = (List<FreeDepositOperation>) apiResponse.getResponse();
        }
    }

    
    public List<FreeDepositOperation> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<FreeDepositOperation> operationList) {
        this.operationList = operationList;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetFreeDepositOperationsResponse that = (GetFreeDepositOperationsResponse) o;
        return Objects.equals(operationList, that.operationList) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationList);
    }

    @Override
    public String toString() {
        return "GetFreeDepositOperationsResponse{" +
                "operationList='" + operationList + '\'' +

                '}';
    }
}