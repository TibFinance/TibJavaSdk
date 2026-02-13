
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


public class CreateMerchantResponse extends CustomAPIResponse {

    
    @JsonProperty("MerchantId")
    private String merchantId;


    public CreateMerchantResponse(Error[] errors, boolean hasError, String messages, String merchantId) {
        super(errors, hasError, messages);
        this.merchantId = merchantId;

    }

    public CreateMerchantResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.merchantId = apiResponse.getResponse().toString();

        }
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateMerchantResponse that = (CreateMerchantResponse) o;
        return Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId);
    }

    @Override
    public String toString() {
        return "CreateMerchantResponse{" +
                 "merchantId='" + merchantId + '\'' +

                '}';
    }
}