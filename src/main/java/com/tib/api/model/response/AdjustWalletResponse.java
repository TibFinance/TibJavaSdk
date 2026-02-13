
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
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


public class AdjustWalletResponse extends CustomAPIResponse {

    
    @JsonProperty("TransferId")
    private String transferId;


    public AdjustWalletResponse(Error[] errors, boolean hasError, String messages, String transferId) {
        super(errors, hasError, messages);
        this.transferId = transferId;

    }

    public AdjustWalletResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.transferId = apiResponse.getResponse().toString();

        }
    }

    
    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdjustWalletResponse that = (AdjustWalletResponse) o;
        return Objects.equals(transferId, that.transferId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transferId);
    }

    @Override
    public String toString() {
        return "AdjustWalletResponse{" +
                 "transferId='" + transferId + '\'' +

                '}';
    }
}