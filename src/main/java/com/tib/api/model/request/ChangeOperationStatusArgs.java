
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


public class ChangeOperationStatusArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("OperationId")
    private String operationId;

    /**
 * Retrieves the numeric status code of an operation.
 */
    @JsonProperty("OperationStatus")
    private Integer operationStatus;


    
    public ChangeOperationStatusArgs() {
    }

    
    public ChangeOperationStatusArgs(String operationId, Integer operationStatus) {
        this.operationId = operationId;
this.operationStatus = operationStatus;

    }
    
    
    public ChangeOperationStatusArgs(String adminSessionToken, String operationId, Integer operationStatus) {
        super(adminSessionToken);
        this.operationId = operationId;
this.operationStatus = operationStatus;

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
        ChangeOperationStatusArgs that = (ChangeOperationStatusArgs) o;
        return Objects.equals(operationId, that.operationId) && Objects.equals(operationStatus, that.operationStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationId, operationStatus);
    }

    @Override
    public String toString() {
        return "ChangeOperationStatusArgs{" +
                 "operationId='" + operationId + '\'' +
 ", operationStatus='" + operationStatus + '\'' +

                '}';
    }
}