
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.MerchantEntity;
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


public class MerchantEntityResponse extends CustomAPIResponse {

    
    @JsonProperty("Merchants")
    private List<MerchantEntity> merchants;


    public MerchantEntityResponse(Error[] errors, boolean hasError, String messages, List<MerchantEntity> merchants) {
        super(errors, hasError, messages);
        this.merchants = merchants;
    }

    public MerchantEntityResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.merchants = (List<MerchantEntity>) apiResponse.getResponse();
        }
    }

    
    public List<MerchantEntity> getMerchants() {
        return merchants;
    }

    public void setMerchants(List<MerchantEntity> merchants) {
        this.merchants = merchants;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MerchantEntityResponse that = (MerchantEntityResponse) o;
        return Objects.equals(merchants, that.merchants) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchants);
    }

    @Override
    public String toString() {
        return "MerchantEntityResponse{" +
                "merchants='" + merchants + '\'' +

                '}';
    }
}