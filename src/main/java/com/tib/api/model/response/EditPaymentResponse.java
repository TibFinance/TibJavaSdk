
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


public class EditPaymentResponse extends CustomAPIResponse {

    
    @JsonProperty("PaymentId")
    private String paymentId;

    @JsonProperty("MerchantId")
    private String merchantId;


    public EditPaymentResponse(Error[] errors, boolean hasError, String messages, String paymentId, String merchantId) {
        super(errors, hasError, messages);
        this.paymentId = paymentId;
        this.merchantId = merchantId;
    }

    public EditPaymentResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.paymentId = apiResponse.getResponse().toString();
            this.merchantId = apiResponse.getResponse().toString();
        }
    }

    
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
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
        EditPaymentResponse that = (EditPaymentResponse) o;
        return Objects.equals(paymentId, that.paymentId) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentId, merchantId);
    }

    @Override
    public String toString() {
        return "EditPaymentResponse{" +
                "paymentId='" + paymentId + '\'' +
                ", merchantId='" + merchantId + '\'' +

                '}';
    }
}