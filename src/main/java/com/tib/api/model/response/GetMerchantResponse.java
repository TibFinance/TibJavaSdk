
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.MerchantView;
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


public class GetMerchantResponse extends CustomAPIResponse {

    
    @JsonProperty("Merchant")
    private MerchantView merchant;


    public GetMerchantResponse(Error[] errors, boolean hasError, String messages, MerchantView merchant) {
        super(errors, hasError, messages);
        this.merchant = merchant;

    }

    public GetMerchantResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.merchant = objectMapper.readValue(json, MerchantView.class);

        }
    }

    
    public MerchantView getMerchant() {
        return merchant;
    }

    public void setMerchant(MerchantView merchant) {
        this.merchant = merchant;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetMerchantResponse that = (GetMerchantResponse) o;
        return Objects.equals(merchant, that.merchant) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchant);
    }

    @Override
    public String toString() {
        return "GetMerchantResponse{" +
                 "merchant='" + merchant + '\'' +

                '}';
    }
}