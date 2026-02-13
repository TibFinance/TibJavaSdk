
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.TransferCreation;
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


public class GetTransferCreationListResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("TransfersCreations")
    private List<TransferCreation> transfersCreations;


    public GetTransferCreationListResponse(Error[] errors, boolean hasError, String messages, List<TransferCreation> transfersCreations) {
        super(errors, hasError, messages);
        this.transfersCreations = transfersCreations;

    }

    public GetTransferCreationListResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.transfersCreations = (List<TransferCreation>) apiResponse.getResponse();

        }
    }

    
    public List<TransferCreation> getTransfersCreations() {
        return transfersCreations;
    }

    public void setTransfersCreations(List<TransferCreation> transfersCreations) {
        this.transfersCreations = transfersCreations;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTransferCreationListResponse that = (GetTransferCreationListResponse) o;
        return Objects.equals(transfersCreations, that.transfersCreations) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transfersCreations);
    }

    @Override
    public String toString() {
        return "GetTransferCreationListResponse{" +
                 "transfersCreations='" + transfersCreations + '\'' +

                '}';
    }
}