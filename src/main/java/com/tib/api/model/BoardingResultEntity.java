
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


public class BoardingResultEntity  extends BoardingBaseResult  {

    
    /**
     * 
     */
    @JsonProperty("ProviderRequestId")
    private String providerRequestId;

    /**
     * 
     */
    @JsonProperty("Processing")
    private String processing;


    
    public BoardingResultEntity() {
    }

    
    public BoardingResultEntity(String providerRequestId, String processing) {
        this.providerRequestId = providerRequestId;
        this.processing = processing;
    }
    
    
    public BoardingResultEntity(boolean isSuccess, Integer httpStatusCode, String message, List<BoardingBaseError> errorList, String providerRequestId, String processing) {
        super(isSuccess, httpStatusCode, message, errorList);
        this.providerRequestId = providerRequestId;
        this.processing = processing;
    }

    
    public String getProviderRequestId() {
        return providerRequestId;
    }

    public void setProviderRequestId(String providerRequestId) {
        this.providerRequestId = providerRequestId;
    }

    public String getProcessing() {
        return processing;
    }

    public void setProcessing(String processing) {
        this.processing = processing;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingResultEntity that = (BoardingResultEntity) o;
        return Objects.equals(providerRequestId, that.providerRequestId) && Objects.equals(processing, that.processing) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerRequestId, processing);
    }

    @Override
    public String toString() {
        return "BoardingResultEntity{" +
                "providerRequestId='" + providerRequestId + '\'' +
                ", processing='" + processing + '\'' +

                '}';
    }
}