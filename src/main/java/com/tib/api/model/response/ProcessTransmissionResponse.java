
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.TransactionResultEntity;
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


public class ProcessTransmissionResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("TransmissionResults")
    private List<TransactionResultEntity> transmissionResults;

    @JsonProperty("CompressedTransmissionResults")
    private String compressedTransmissionResults;


    public ProcessTransmissionResponse(Error[] errors, boolean hasError, String messages, List<TransactionResultEntity> transmissionResults, String compressedTransmissionResults) {
        super(errors, hasError, messages);
        this.transmissionResults = transmissionResults;
        this.compressedTransmissionResults = compressedTransmissionResults;
    }

    public ProcessTransmissionResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.transmissionResults = (List<TransactionResultEntity>) apiResponse.getResponse();
            this.compressedTransmissionResults = apiResponse.getResponse().toString();
        }
    }

    
    public List<TransactionResultEntity> getTransmissionResults() {
        return transmissionResults;
    }

    public void setTransmissionResults(List<TransactionResultEntity> transmissionResults) {
        this.transmissionResults = transmissionResults;
    }

    public String getCompressedTransmissionResults() {
        return compressedTransmissionResults;
    }

    public void setCompressedTransmissionResults(String compressedTransmissionResults) {
        this.compressedTransmissionResults = compressedTransmissionResults;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessTransmissionResponse that = (ProcessTransmissionResponse) o;
        return Objects.equals(transmissionResults, that.transmissionResults) && Objects.equals(compressedTransmissionResults, that.compressedTransmissionResults) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transmissionResults, compressedTransmissionResults);
    }

    @Override
    public String toString() {
        return "ProcessTransmissionResponse{" +
                "transmissionResults='" + transmissionResults + '\'' +
                ", compressedTransmissionResults='" + compressedTransmissionResults + '\'' +

                '}';
    }
}