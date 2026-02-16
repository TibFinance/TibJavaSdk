
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.TransactionSatusResultEntity;
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


public class ProcessStatusResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("TransmissionResults")
    private List<TransactionSatusResultEntity> transmissionResults;


    public ProcessStatusResponse(Error[] errors, boolean hasError, String messages, List<TransactionSatusResultEntity> transmissionResults) {
        super(errors, hasError, messages);
        this.transmissionResults = transmissionResults;
    }

    public ProcessStatusResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.transmissionResults = (List<TransactionSatusResultEntity>) apiResponse.getResponse();
        }
    }

    
    public List<TransactionSatusResultEntity> getTransmissionResults() {
        return transmissionResults;
    }

    public void setTransmissionResults(List<TransactionSatusResultEntity> transmissionResults) {
        this.transmissionResults = transmissionResults;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessStatusResponse that = (ProcessStatusResponse) o;
        return Objects.equals(transmissionResults, that.transmissionResults) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transmissionResults);
    }

    @Override
    public String toString() {
        return "ProcessStatusResponse{" +
                "transmissionResults='" + transmissionResults + '\'' +

                '}';
    }
}