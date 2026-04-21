
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.TransferBaseInformationEntity;
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


public class ListSupplierTransfersResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("Transfers")
    private List<TransferBaseInformationEntity> transfers;


    public ListSupplierTransfersResponse() {
    }

    public ListSupplierTransfersResponse(Error[] errors, boolean hasError, String messages, List<TransferBaseInformationEntity> transfers) {
        super(errors, hasError, messages);
        this.transfers = transfers;
    }

    public ListSupplierTransfersResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String __rawBody = apiResponse.getRawBody();
            if (__rawBody != null && !__rawBody.isEmpty()) {
                ListSupplierTransfersResponse __typed = objectMapper.readValue(__rawBody, ListSupplierTransfersResponse.class);
                this.transfers = __typed.transfers;
            }
        }
    }

    
    public List<TransferBaseInformationEntity> getTransfers() {
        return transfers;
    }

    public void setTransfers(List<TransferBaseInformationEntity> transfers) {
        this.transfers = transfers;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListSupplierTransfersResponse that = (ListSupplierTransfersResponse) o;
        return Objects.equals(transfers, that.transfers) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transfers);
    }

    @Override
    public String toString() {
        return "ListSupplierTransfersResponse{" +
                "transfers='" + transfers + '\'' +

                '}';
    }
}