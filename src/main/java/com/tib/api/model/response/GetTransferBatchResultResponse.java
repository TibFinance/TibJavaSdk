
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.enums.TransferBatchStatus;
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
public class GetTransferBatchResultResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("BatchId")
    private String batchId;

    @JsonProperty("MerchantId")
    private String merchantId;

    @JsonProperty("GroupId")
    private String groupId;

    @JsonProperty("Status")
    private TransferBatchStatus status;

    @JsonProperty("BatchErrorCode")
    private Integer batchErrorCode;

    @JsonProperty("BatchMessage")
    private String batchMessage;

    @JsonProperty("AcceptedDate")
    private OffsetDateTime acceptedDate;

    @JsonProperty("StartedDate")
    private OffsetDateTime startedDate;

    @JsonProperty("CompletedDate")
    private OffsetDateTime completedDate;

    @JsonProperty("Totals")
    private TransferBatchTotals totals;

    @JsonProperty("Results")
    private List<TransferBatchItemResult> results;

    @JsonProperty("NextIndex")
    private Integer nextIndex;


    public GetTransferBatchResultResponse() {
    }

    public GetTransferBatchResultResponse(Error[] errors, boolean hasError, String messages, String batchId, String merchantId, String groupId, TransferBatchStatus status, Integer batchErrorCode, String batchMessage, OffsetDateTime acceptedDate, OffsetDateTime startedDate, OffsetDateTime completedDate, TransferBatchTotals totals, List<TransferBatchItemResult> results, Integer nextIndex) {
        super(errors, hasError, messages);
        this.batchId = batchId;
        this.merchantId = merchantId;
        this.groupId = groupId;
        this.status = status;
        this.batchErrorCode = batchErrorCode;
        this.batchMessage = batchMessage;
        this.acceptedDate = acceptedDate;
        this.startedDate = startedDate;
        this.completedDate = completedDate;
        this.totals = totals;
        this.results = results;
        this.nextIndex = nextIndex;
    }

    public GetTransferBatchResultResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        readPayload(apiResponse, objectMapper);
    }

    private void readPayload(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        String __rawBody = apiResponse.getRawBody();
        if (__rawBody == null || __rawBody.isEmpty()) {
            return;
        }
        try {
            GetTransferBatchResultResponse __typed = objectMapper.readValue(__rawBody, GetTransferBatchResultResponse.class);
            this.batchId = __typed.batchId;
            this.merchantId = __typed.merchantId;
            this.groupId = __typed.groupId;
            this.status = __typed.status;
            this.batchErrorCode = __typed.batchErrorCode;
            this.batchMessage = __typed.batchMessage;
            this.acceptedDate = __typed.acceptedDate;
            this.startedDate = __typed.startedDate;
            this.completedDate = __typed.completedDate;
            this.totals = __typed.totals;
            this.results = __typed.results;
            this.nextIndex = __typed.nextIndex;
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

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public TransferBatchStatus getStatus() {
        return status;
    }

    public void setStatus(TransferBatchStatus status) {
        this.status = status;
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

    public OffsetDateTime getAcceptedDate() {
        return acceptedDate;
    }

    public void setAcceptedDate(OffsetDateTime acceptedDate) {
        this.acceptedDate = acceptedDate;
    }

    public OffsetDateTime getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(OffsetDateTime startedDate) {
        this.startedDate = startedDate;
    }

    public OffsetDateTime getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(OffsetDateTime completedDate) {
        this.completedDate = completedDate;
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

    public Integer getNextIndex() {
        return nextIndex;
    }

    public void setNextIndex(Integer nextIndex) {
        this.nextIndex = nextIndex;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTransferBatchResultResponse that = (GetTransferBatchResultResponse) o;
        return Objects.equals(batchId, that.batchId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(groupId, that.groupId) && Objects.equals(status, that.status) && Objects.equals(batchErrorCode, that.batchErrorCode) && Objects.equals(batchMessage, that.batchMessage) && Objects.equals(acceptedDate, that.acceptedDate) && Objects.equals(startedDate, that.startedDate) && Objects.equals(completedDate, that.completedDate) && Objects.equals(totals, that.totals) && Objects.equals(results, that.results) && Objects.equals(nextIndex, that.nextIndex) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(batchId, merchantId, groupId, status, batchErrorCode, batchMessage, acceptedDate, startedDate, completedDate, totals, results, nextIndex);
    }

    @Override
    public String toString() {
        return "GetTransferBatchResultResponse{" +
                "batchId='" + batchId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", status='" + status + '\'' +
                ", batchErrorCode='" + batchErrorCode + '\'' +
                ", batchMessage='" + batchMessage + '\'' +
                ", acceptedDate='" + acceptedDate + '\'' +
                ", startedDate='" + startedDate + '\'' +
                ", completedDate='" + completedDate + '\'' +
                ", totals='" + totals + '\'' +
                ", results='" + results + '\'' +
                ", nextIndex='" + nextIndex + '\'' +

                '}';
    }
}