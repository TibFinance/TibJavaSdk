
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


public class CreateCustomerFromMerchantResponse extends CustomAPIResponse {

    
    @JsonProperty("CustomerId")
    private String customerId;

    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;


    public CreateCustomerFromMerchantResponse(Error[] errors, boolean hasError, String messages, String customerId, String paymentMethodId) {
        super(errors, hasError, messages);
        this.customerId = customerId;
        this.paymentMethodId = paymentMethodId;
    }

    public CreateCustomerFromMerchantResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.customerId = apiResponse.getResponse().toString();
            this.paymentMethodId = apiResponse.getResponse().toString();
        }
    }

    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateCustomerFromMerchantResponse that = (CreateCustomerFromMerchantResponse) o;
        return Objects.equals(customerId, that.customerId) && Objects.equals(paymentMethodId, that.paymentMethodId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerId, paymentMethodId);
    }

    @Override
    public String toString() {
        return "CreateCustomerFromMerchantResponse{" +
                "customerId='" + customerId + '\'' +
                ", paymentMethodId='" + paymentMethodId + '\'' +

                '}';
    }
}