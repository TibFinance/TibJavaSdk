
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


public class GetMerchantResponse extends CustomAPIResponse {

    
    @JsonProperty("Merchant")
    private MerchantView merchant;

    @JsonProperty("DenySupplierPayments")
    private boolean denySupplierPayments;


    public GetMerchantResponse() {
    }

    public GetMerchantResponse(Error[] errors, boolean hasError, String messages, MerchantView merchant, boolean denySupplierPayments) {
        super(errors, hasError, messages);
        this.merchant = merchant;
        this.denySupplierPayments = denySupplierPayments;
    }

    public GetMerchantResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String __rawBody = apiResponse.getRawBody();
            if (__rawBody != null && !__rawBody.isEmpty()) {
                GetMerchantResponse __typed = objectMapper.readValue(__rawBody, GetMerchantResponse.class);
                this.merchant = __typed.merchant;
                this.denySupplierPayments = __typed.denySupplierPayments;
            }
        }
    }

    
    public MerchantView getMerchant() {
        return merchant;
    }

    public void setMerchant(MerchantView merchant) {
        this.merchant = merchant;
    }

    public boolean getDenySupplierPayments() {
        return denySupplierPayments;
    }

    public void setDenySupplierPayments(boolean denySupplierPayments) {
        this.denySupplierPayments = denySupplierPayments;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetMerchantResponse that = (GetMerchantResponse) o;
        return Objects.equals(merchant, that.merchant) && Objects.equals(denySupplierPayments, that.denySupplierPayments) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchant, denySupplierPayments);
    }

    @Override
    public String toString() {
        return "GetMerchantResponse{" +
                "merchant='" + merchant + '\'' +
                ", denySupplierPayments='" + denySupplierPayments + '\'' +

                '}';
    }
}