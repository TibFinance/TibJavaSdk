
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.AdminOperation;
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


public class DuplicateOperationResponse extends CustomAPIResponse {

    
    @JsonProperty("Operation")
    private AdminOperation operation;


    public DuplicateOperationResponse(Error[] errors, boolean hasError, String messages, AdminOperation operation) {
        super(errors, hasError, messages);
        this.operation = operation;

    }

    public DuplicateOperationResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.operation = objectMapper.readValue(json, AdminOperation.class);

        }
    }

    
    public AdminOperation getOperation() {
        return operation;
    }

    public void setOperation(AdminOperation operation) {
        this.operation = operation;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DuplicateOperationResponse that = (DuplicateOperationResponse) o;
        return Objects.equals(operation, that.operation) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operation);
    }

    @Override
    public String toString() {
        return "DuplicateOperationResponse{" +
                 "operation='" + operation + '\'' +

                '}';
    }
}