
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.PaymentMethod;
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


public class GetPaymentMethodResponse extends CustomAPIResponse {

    
    @JsonProperty("PaymentMethod")
    private PaymentMethod paymentMethod;


    public GetPaymentMethodResponse(Error[] errors, boolean hasError, String messages, PaymentMethod paymentMethod) {
        super(errors, hasError, messages);
        this.paymentMethod = paymentMethod;
    }

    public GetPaymentMethodResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.paymentMethod = objectMapper.readValue(json, PaymentMethod.class);
        }
    }

    
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetPaymentMethodResponse that = (GetPaymentMethodResponse) o;
        return Objects.equals(paymentMethod, that.paymentMethod) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentMethod);
    }

    @Override
    public String toString() {
        return "GetPaymentMethodResponse{" +
                "paymentMethod='" + paymentMethod + '\'' +

                '}';
    }
}