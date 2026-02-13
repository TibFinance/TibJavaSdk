
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


public class GetFeesOverloadMerchantResponse extends CustomAPIResponse {

    
    @JsonProperty("FeesOverLoadMerchantId")
    private String feesOverLoadMerchantId;


    public GetFeesOverloadMerchantResponse(Error[] errors, boolean hasError, String messages, String feesOverLoadMerchantId) {
        super(errors, hasError, messages);
        this.feesOverLoadMerchantId = feesOverLoadMerchantId;

    }

    public GetFeesOverloadMerchantResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.feesOverLoadMerchantId = apiResponse.getResponse().toString();

        }
    }

    
    public String getFeesOverLoadMerchantId() {
        return feesOverLoadMerchantId;
    }

    public void setFeesOverLoadMerchantId(String feesOverLoadMerchantId) {
        this.feesOverLoadMerchantId = feesOverLoadMerchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetFeesOverloadMerchantResponse that = (GetFeesOverloadMerchantResponse) o;
        return Objects.equals(feesOverLoadMerchantId, that.feesOverLoadMerchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(feesOverLoadMerchantId);
    }

    @Override
    public String toString() {
        return "GetFeesOverloadMerchantResponse{" +
                 "feesOverLoadMerchantId='" + feesOverLoadMerchantId + '\'' +

                '}';
    }
}