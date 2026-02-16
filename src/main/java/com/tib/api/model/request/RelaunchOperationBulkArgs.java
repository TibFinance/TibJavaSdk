
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


public class RelaunchOperationBulkArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("OperationIds")
    private List<String> operationIds;


    
    public RelaunchOperationBulkArgs() {
    }

    
    public RelaunchOperationBulkArgs(List<String> operationIds) {
        this.operationIds = operationIds;
    }
    
    
    public RelaunchOperationBulkArgs(String adminSessionToken, List<String> operationIds) {
        super(adminSessionToken);
        this.operationIds = operationIds;
    }

    
    public List<String> getOperationIds() {
        return operationIds;
    }

    public void setOperationIds(List<String> operationIds) {
        this.operationIds = operationIds;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelaunchOperationBulkArgs that = (RelaunchOperationBulkArgs) o;
        return Objects.equals(operationIds, that.operationIds) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationIds);
    }

    @Override
    public String toString() {
        return "RelaunchOperationBulkArgs{" +
                "operationIds='" + operationIds + '\'' +

                '}';
    }
}