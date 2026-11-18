
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.PendingTransferDto;
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
public class GetPendingTransferApprovalsResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("PendingTransfers")
    private List<PendingTransferDto> pendingTransfers;


    public GetPendingTransferApprovalsResponse() {
    }

    public GetPendingTransferApprovalsResponse(Error[] errors, boolean hasError, String messages, List<PendingTransferDto> pendingTransfers) {
        super(errors, hasError, messages);
        this.pendingTransfers = pendingTransfers;
    }

    public GetPendingTransferApprovalsResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        readPayload(apiResponse, objectMapper);
    }

    private void readPayload(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        String __rawBody = apiResponse.getRawBody();
        if (__rawBody == null || __rawBody.isEmpty()) {
            return;
        }
        try {
            GetPendingTransferApprovalsResponse __typed = objectMapper.readValue(__rawBody, GetPendingTransferApprovalsResponse.class);
            this.pendingTransfers = __typed.pendingTransfers;
        } catch (JsonProcessingException | RuntimeException e) {
            if (!apiResponse.isHasError()) {
                throw e;
            }
        }
    }

    
    public List<PendingTransferDto> getPendingTransfers() {
        return pendingTransfers;
    }

    public void setPendingTransfers(List<PendingTransferDto> pendingTransfers) {
        this.pendingTransfers = pendingTransfers;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetPendingTransferApprovalsResponse that = (GetPendingTransferApprovalsResponse) o;
        return Objects.equals(pendingTransfers, that.pendingTransfers) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(pendingTransfers);
    }

    @Override
    public String toString() {
        return "GetPendingTransferApprovalsResponse{" +
                "pendingTransfers='" + pendingTransfers + '\'' +

                '}';
    }
}