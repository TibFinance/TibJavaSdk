
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.DependentOperation;
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


public class GetDependentOperationResponse extends CustomAPIResponse {

    
    @JsonProperty("OperationIds")
    private List<DependentOperation> operationIds;


    public GetDependentOperationResponse(Error[] errors, boolean hasError, String messages, List<DependentOperation> operationIds) {
        super(errors, hasError, messages);
        this.operationIds = operationIds;

    }

    public GetDependentOperationResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.operationIds = (List<DependentOperation>) apiResponse.getResponse();

        }
    }

    
    public List<DependentOperation> getOperationIds() {
        return operationIds;
    }

    public void setOperationIds(List<DependentOperation> operationIds) {
        this.operationIds = operationIds;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetDependentOperationResponse that = (GetDependentOperationResponse) o;
        return Objects.equals(operationIds, that.operationIds) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationIds);
    }

    @Override
    public String toString() {
        return "GetDependentOperationResponse{" +
                 "operationIds='" + operationIds + '\'' +

                '}';
    }
}