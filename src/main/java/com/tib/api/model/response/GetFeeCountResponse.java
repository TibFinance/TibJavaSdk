
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.MerchantFee;
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


public class GetFeeCountResponse extends CustomAPIResponse {

    
    @JsonProperty("TransactionFeesAgregated")
    private List<MerchantFee> transactionFeesAgregated;


    public GetFeeCountResponse(Error[] errors, boolean hasError, String messages, List<MerchantFee> transactionFeesAgregated) {
        super(errors, hasError, messages);
        this.transactionFeesAgregated = transactionFeesAgregated;

    }

    public GetFeeCountResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.transactionFeesAgregated = (List<MerchantFee>) apiResponse.getResponse();

        }
    }

    
    public List<MerchantFee> getTransactionFeesAgregated() {
        return transactionFeesAgregated;
    }

    public void setTransactionFeesAgregated(List<MerchantFee> transactionFeesAgregated) {
        this.transactionFeesAgregated = transactionFeesAgregated;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetFeeCountResponse that = (GetFeeCountResponse) o;
        return Objects.equals(transactionFeesAgregated, that.transactionFeesAgregated) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactionFeesAgregated);
    }

    @Override
    public String toString() {
        return "GetFeeCountResponse{" +
                 "transactionFeesAgregated='" + transactionFeesAgregated + '\'' +

                '}';
    }
}