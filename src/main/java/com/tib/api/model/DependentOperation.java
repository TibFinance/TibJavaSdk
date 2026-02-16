
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class DependentOperation   {

    
    /**
     * 
     */
    @JsonProperty("OperationId")
    private String operationId;


    
    public DependentOperation() {
    }

    
    public DependentOperation(String operationId) {
        this.operationId = operationId;
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
        DependentOperation that = (DependentOperation) o;
        return Objects.equals(operationId, that.operationId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationId);
    }

    @Override
    public String toString() {
        return "DependentOperation{" +
                "operationId='" + operationId + '\'' +

                '}';
    }
}