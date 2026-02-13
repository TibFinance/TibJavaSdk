
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BoardingBaseError;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SubmitDocumentResultEntity  extends BoardingBaseResult  {

    
    /**
 * Represents the current state of a transaction within the system.
 */
    @JsonProperty("Status")
    private String status;


    
    public SubmitDocumentResultEntity() {
    }

    
    public SubmitDocumentResultEntity(String status) {
        this.status = status;

    }
    
    
    public SubmitDocumentResultEntity(boolean isSuccess, Integer httpStatusCode, String message, List<BoardingBaseError> errorList, String status) {
        super(isSuccess, httpStatusCode, message, errorList);
        this.status = status;

    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubmitDocumentResultEntity that = (SubmitDocumentResultEntity) o;
        return Objects.equals(status, that.status) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    public String toString() {
        return "SubmitDocumentResultEntity{" +
                 "status='" + status + '\'' +

                '}';
    }
}