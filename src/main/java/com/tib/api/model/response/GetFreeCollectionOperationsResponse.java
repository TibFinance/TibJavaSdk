
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.FreeCollectionOperation;
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


public class GetFreeCollectionOperationsResponse extends CustomAPIResponse {

    
    @JsonProperty("OperationList")
    private List<FreeCollectionOperation> operationList;


    public GetFreeCollectionOperationsResponse(Error[] errors, boolean hasError, String messages, List<FreeCollectionOperation> operationList) {
        super(errors, hasError, messages);
        this.operationList = operationList;

    }

    public GetFreeCollectionOperationsResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.operationList = (List<FreeCollectionOperation>) apiResponse.getResponse();

        }
    }

    
    public List<FreeCollectionOperation> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<FreeCollectionOperation> operationList) {
        this.operationList = operationList;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetFreeCollectionOperationsResponse that = (GetFreeCollectionOperationsResponse) o;
        return Objects.equals(operationList, that.operationList) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationList);
    }

    @Override
    public String toString() {
        return "GetFreeCollectionOperationsResponse{" +
                 "operationList='" + operationList + '\'' +

                '}';
    }
}