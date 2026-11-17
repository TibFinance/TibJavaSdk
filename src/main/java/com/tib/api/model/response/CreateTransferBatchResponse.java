
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.enums.TransferBatchOutcome;
import com.tib.api.model.TransferBatchTotals;
import com.tib.api.model.TransferBatchItemResult;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateTransferBatchResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("BatchId")
    private String batchId;

    @JsonProperty("BatchOutcome")
    private TransferBatchOutcome batchOutcome;

    @JsonProperty("BatchErrorCode")
    private Integer batchErrorCode;

    @JsonProperty("BatchMessage")
    private String batchMessage;

    @JsonProperty("Totals")
    private TransferBatchTotals totals;

    @JsonProperty("Results")
    private List<TransferBatchItemResult> results;


    public CreateTransferBatchResponse() {
    }

    public CreateTransferBatchResponse(Error[] errors, boolean hasError, String messages, String batchId, TransferBatchOutcome batchOutcome, Integer batchErrorCode, String batchMessage, TransferBatchTotals totals, List<TransferBatchItemResult> results) {
        super(errors, hasError, messages);
        this.batchId = batchId;
        this.batchOutcome = batchOutcome;
        this.batchErrorCode = batchErrorCode;
        this.batchMessage = batchMessage;
        this.totals = totals;
        this.results = results;
    }

    public CreateTransferBatchResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        readPayload(apiResponse, objectMapper);
    }

    private void readPayload(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        String __rawBody = apiResponse.getRawBody();
        if (__rawBody == null || __rawBody.isEmpty()) {
            return;
        }
        try {
            CreateTransferBatchResponse __typed = objectMapper.readValue(__rawBody, CreateTransferBatchResponse.class);
            this.batchId = __typed.batchId;
            this.batchOutcome = __typed.batchOutcome;
            this.batchErrorCode = __typed.batchErrorCode;
            this.batchMessage = __typed.batchMessage;
            this.totals = __typed.totals;
            this.results = __typed.results;
        } catch (JsonProcessingException | RuntimeException e) {
            if (!apiResponse.isHasError()) {
                throw e;
            }
        }
    }

    
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public TransferBatchOutcome getBatchOutcome() {
        return batchOutcome;
    }

    public void setBatchOutcome(TransferBatchOutcome batchOutcome) {
        this.batchOutcome = batchOutcome;
    }

    public Integer getBatchErrorCode() {
        return batchErrorCode;
    }

    public void setBatchErrorCode(Integer batchErrorCode) {
        this.batchErrorCode = batchErrorCode;
    }

    public String getBatchMessage() {
        return batchMessage;
    }

    public void setBatchMessage(String batchMessage) {
        this.batchMessage = batchMessage;
    }

    public TransferBatchTotals getTotals() {
        return totals;
    }

    public void setTotals(TransferBatchTotals totals) {
        this.totals = totals;
    }

    public List<TransferBatchItemResult> getResults() {
        return results;
    }

    public void setResults(List<TransferBatchItemResult> results) {
        this.results = results;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateTransferBatchResponse that = (CreateTransferBatchResponse) o;
        return Objects.equals(batchId, that.batchId) && Objects.equals(batchOutcome, that.batchOutcome) && Objects.equals(batchErrorCode, that.batchErrorCode) && Objects.equals(batchMessage, that.batchMessage) && Objects.equals(totals, that.totals) && Objects.equals(results, that.results) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(batchId, batchOutcome, batchErrorCode, batchMessage, totals, results);
    }

    @Override
    public String toString() {
        return "CreateTransferBatchResponse{" +
                "batchId='" + batchId + '\'' +
                ", batchOutcome='" + batchOutcome + '\'' +
                ", batchErrorCode='" + batchErrorCode + '\'' +
                ", batchMessage='" + batchMessage + '\'' +
                ", totals='" + totals + '\'' +
                ", results='" + results + '\'' +

                '}';
    }
}