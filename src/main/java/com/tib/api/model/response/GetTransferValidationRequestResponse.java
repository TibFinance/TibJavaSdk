
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.TransferValidationEntity;
import com.tib.api.model.WhiteLabeling;
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


public class GetTransferValidationRequestResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("Transfer")
    private TransferValidationEntity transfer;

    @JsonProperty("WhiteLabeling")
    private WhiteLabeling whiteLabeling;


    public GetTransferValidationRequestResponse(Error[] errors, boolean hasError, String messages, TransferValidationEntity transfer, WhiteLabeling whiteLabeling) {
        super(errors, hasError, messages);
        this.transfer = transfer;
this.whiteLabeling = whiteLabeling;

    }

    public GetTransferValidationRequestResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.transfer = objectMapper.readValue(json, TransferValidationEntity.class);
this.whiteLabeling = objectMapper.readValue(json, WhiteLabeling.class);

        }
    }

    
    public TransferValidationEntity getTransfer() {
        return transfer;
    }

    public void setTransfer(TransferValidationEntity transfer) {
        this.transfer = transfer;
    }

    public WhiteLabeling getWhiteLabeling() {
        return whiteLabeling;
    }

    public void setWhiteLabeling(WhiteLabeling whiteLabeling) {
        this.whiteLabeling = whiteLabeling;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTransferValidationRequestResponse that = (GetTransferValidationRequestResponse) o;
        return Objects.equals(transfer, that.transfer) && Objects.equals(whiteLabeling, that.whiteLabeling) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transfer, whiteLabeling);
    }

    @Override
    public String toString() {
        return "GetTransferValidationRequestResponse{" +
                 "transfer='" + transfer + '\'' +
 ", whiteLabeling='" + whiteLabeling + '\'' +

                '}';
    }
}