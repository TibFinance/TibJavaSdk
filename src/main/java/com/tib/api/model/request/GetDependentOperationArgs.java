
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


public class GetDependentOperationArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * Identifies the specific transfer operation that needs to be reverted.
 */
    @JsonProperty("TransferId")
    private String transferId;

    /**
 * 
 */
    @JsonProperty("OperationId")
    private String operationId;


    
    public GetDependentOperationArgs() {
    }

    
    public GetDependentOperationArgs(String transferId, String operationId) {
        this.transferId = transferId;
this.operationId = operationId;

    }
    
    
    public GetDependentOperationArgs(String adminSessionToken, String transferId, String operationId) {
        super(adminSessionToken);
        this.transferId = transferId;
this.operationId = operationId;

    }

    
    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetDependentOperationArgs that = (GetDependentOperationArgs) o;
        return Objects.equals(transferId, that.transferId) && Objects.equals(operationId, that.operationId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transferId, operationId);
    }

    @Override
    public String toString() {
        return "GetDependentOperationArgs{" +
                 "transferId='" + transferId + '\'' +
 ", operationId='" + operationId + '\'' +

                '}';
    }
}