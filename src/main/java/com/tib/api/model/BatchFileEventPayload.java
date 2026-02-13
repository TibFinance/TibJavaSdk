
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BatchFileEventOperation;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BatchFileEventPayload  extends BaseEventPayload  {

    
    /**
 * 
 */
    @JsonProperty("File")
    private String file;

    /**
 * Gets or sets the collection of payment operations associated with the current entity.
 */
    @JsonProperty("Operations")
    private List<BatchFileEventOperation> operations;


    
    public BatchFileEventPayload() {
    }

    
    public BatchFileEventPayload(String file, List<BatchFileEventOperation> operations) {
        this.file = file;
this.operations = operations;

    }
    
    
    public BatchFileEventPayload(String eventName, String file, List<BatchFileEventOperation> operations) {
        super(eventName);
        this.file = file;
this.operations = operations;

    }

    
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public List<BatchFileEventOperation> getOperations() {
        return operations;
    }

    public void setOperations(List<BatchFileEventOperation> operations) {
        this.operations = operations;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BatchFileEventPayload that = (BatchFileEventPayload) o;
        return Objects.equals(file, that.file) && Objects.equals(operations, that.operations) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(file, operations);
    }

    @Override
    public String toString() {
        return "BatchFileEventPayload{" +
                 "file='" + file + '\'' +
 ", operations='" + operations + '\'' +

                '}';
    }
}