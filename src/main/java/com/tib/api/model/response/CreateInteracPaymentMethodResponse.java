
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


public class CreateInteracPaymentMethodResponse extends CustomAPIResponse {

    
    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;


    public CreateInteracPaymentMethodResponse(Error[] errors, boolean hasError, String messages, String paymentMethodId) {
        super(errors, hasError, messages);
        this.paymentMethodId = paymentMethodId;
    }

    public CreateInteracPaymentMethodResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.paymentMethodId = apiResponse.getResponse().toString();
        }
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
        CreateInteracPaymentMethodResponse that = (CreateInteracPaymentMethodResponse) o;
        return Objects.equals(paymentMethodId, that.paymentMethodId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentMethodId);
    }

    @Override
    public String toString() {
        return "CreateInteracPaymentMethodResponse{" +
                "paymentMethodId='" + paymentMethodId + '\'' +

                '}';
    }
}