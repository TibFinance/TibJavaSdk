
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ChangeOperationStatusBulkArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("OperationIds")
    private List<String> operationIds;

    /**
 * Retrieves the numeric status code of an operation.
 */
    @JsonProperty("OperationStatus")
    private Integer operationStatus;


    
    public ChangeOperationStatusBulkArgs() {
    }

    
    public ChangeOperationStatusBulkArgs(List<String> operationIds, Integer operationStatus) {
        this.operationIds = operationIds;
this.operationStatus = operationStatus;

    }
    
    
    public ChangeOperationStatusBulkArgs(String adminSessionToken, List<String> operationIds, Integer operationStatus) {
        super(adminSessionToken);
        this.operationIds = operationIds;
this.operationStatus = operationStatus;

    }

    
    public List<String> getOperationIds() {
        return operationIds;
    }

    public void setOperationIds(List<String> operationIds) {
        this.operationIds = operationIds;
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
        ChangeOperationStatusBulkArgs that = (ChangeOperationStatusBulkArgs) o;
        return Objects.equals(operationIds, that.operationIds) && Objects.equals(operationStatus, that.operationStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationIds, operationStatus);
    }

    @Override
    public String toString() {
        return "ChangeOperationStatusBulkArgs{" +
                 "operationIds='" + operationIds + '\'' +
 ", operationStatus='" + operationStatus + '\'' +

                '}';
    }
}