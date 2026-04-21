
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.MerchantView;
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


public class GetMerchantsByExternalIdResponse extends CustomAPIResponse {

    
    @JsonProperty("Merchants")
    private List<MerchantView> merchants;


    public GetMerchantsByExternalIdResponse() {
    }

    public GetMerchantsByExternalIdResponse(Error[] errors, boolean hasError, String messages, List<MerchantView> merchants) {
        super(errors, hasError, messages);
        this.merchants = merchants;
    }

    public GetMerchantsByExternalIdResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String __rawBody = apiResponse.getRawBody();
            if (__rawBody != null && !__rawBody.isEmpty()) {
                GetMerchantsByExternalIdResponse __typed = objectMapper.readValue(__rawBody, GetMerchantsByExternalIdResponse.class);
                this.merchants = __typed.merchants;
            }
        }
    }

    
    public List<MerchantView> getMerchants() {
        return merchants;
    }

    public void setMerchants(List<MerchantView> merchants) {
        this.merchants = merchants;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetMerchantsByExternalIdResponse that = (GetMerchantsByExternalIdResponse) o;
        return Objects.equals(merchants, that.merchants) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchants);
    }

    @Override
    public String toString() {
        return "GetMerchantsByExternalIdResponse{" +
                "merchants='" + merchants + '\'' +

                '}';
    }
}