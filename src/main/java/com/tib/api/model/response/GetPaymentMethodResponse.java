
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.PaymentMethod;
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


@JsonIgnoreProperties(ignoreUnknown = true)
public class GetPaymentMethodResponse extends CustomAPIResponse {

    
    @JsonProperty("PaymentMethod")
    private PaymentMethod paymentMethod;


    public GetPaymentMethodResponse() {
    }

    public GetPaymentMethodResponse(Error[] errors, boolean hasError, String messages, PaymentMethod paymentMethod) {
        super(errors, hasError, messages);
        this.paymentMethod = paymentMethod;
    }

    public GetPaymentMethodResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        readPayload(apiResponse, objectMapper);
    }

    private void readPayload(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        String __rawBody = apiResponse.getRawBody();
        if (__rawBody == null || __rawBody.isEmpty()) {
            return;
        }
        try {
            GetPaymentMethodResponse __typed = objectMapper.readValue(__rawBody, GetPaymentMethodResponse.class);
            this.paymentMethod = __typed.paymentMethod;
        } catch (JsonProcessingException | RuntimeException e) {
            if (!apiResponse.isHasError()) {
                throw e;
            }
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