
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
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


public class ChangeOperationStatusResponse extends CustomAPIResponse {

    
    @JsonProperty("OperationId")
    private String operationId;

    @JsonProperty("OperationStatus")
    private Integer operationStatus;


    public ChangeOperationStatusResponse(Error[] errors, boolean hasError, String messages, String operationId, Integer operationStatus) {
        super(errors, hasError, messages);
        this.operationId = operationId;
this.operationStatus = operationStatus;

    }

    public ChangeOperationStatusResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.operationId = apiResponse.getResponse().toString();
this.operationStatus = Integer.parseInt(apiResponse.getResponse().toString());

        }
    }

    
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public Integer getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(Integer operationStatus) {
        this.operationStatus = operationStatus;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChangeOperationStatusResponse that = (ChangeOperationStatusResponse) o;
        return Objects.equals(operationId, that.operationId) && Objects.equals(operationStatus, that.operationStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationId, operationStatus);
    }

    @Override
    public String toString() {
        return "ChangeOperationStatusResponse{" +
                 "operationId='" + operationId + '\'' +
 ", operationStatus='" + operationStatus + '\'' +

                '}';
    }
}