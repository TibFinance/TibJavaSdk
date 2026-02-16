
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.Payment;
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


public class GetPaymentResponse extends CustomAPIResponse {

    
    @JsonProperty("Payment")
    private Payment payment;


    public GetPaymentResponse(Error[] errors, boolean hasError, String messages, Payment payment) {
        super(errors, hasError, messages);
        this.payment = payment;
    }

    public GetPaymentResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.payment = objectMapper.readValue(json, Payment.class);
        }
    }

    
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetPaymentResponse that = (GetPaymentResponse) o;
        return Objects.equals(payment, that.payment) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(payment);
    }

    @Override
    public String toString() {
        return "GetPaymentResponse{" +
                "payment='" + payment + '\'' +

                '}';
    }
}