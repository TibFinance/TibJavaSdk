
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.TransferBaseInformationEntity;
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


public class ListTransfersFastResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("Transfers")
    private List<TransferBaseInformationEntity> transfers;


    public ListTransfersFastResponse(Error[] errors, boolean hasError, String messages, List<TransferBaseInformationEntity> transfers) {
        super(errors, hasError, messages);
        this.transfers = transfers;
    }

    public ListTransfersFastResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.transfers = (List<TransferBaseInformationEntity>) apiResponse.getResponse();
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
        ListTransfersFastResponse that = (ListTransfersFastResponse) o;
        return Objects.equals(transfers, that.transfers) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transfers);
    }

    @Override
    public String toString() {
        return "ListTransfersFastResponse{" +
                "transfers='" + transfers + '\'' +

                '}';
    }
}