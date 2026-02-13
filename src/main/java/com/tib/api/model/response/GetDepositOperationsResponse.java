
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.Operation;
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


public class GetDepositOperationsResponse extends CustomAPIResponse {

    
    @JsonProperty("OperationList")
    private List<Operation> operationList;


    public GetDepositOperationsResponse(Error[] errors, boolean hasError, String messages, List<Operation> operationList) {
        super(errors, hasError, messages);
        this.operationList = operationList;

    }

    public GetDepositOperationsResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.operationList = (List<Operation>) apiResponse.getResponse();

        }
    }

    
    public List<Operation> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<Operation> operationList) {
        this.operationList = operationList;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetDepositOperationsResponse that = (GetDepositOperationsResponse) o;
        return Objects.equals(operationList, that.operationList) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationList);
    }

    @Override
    public String toString() {
        return "GetDepositOperationsResponse{" +
                 "operationList='" + operationList + '\'' +

                '}';
    }
}