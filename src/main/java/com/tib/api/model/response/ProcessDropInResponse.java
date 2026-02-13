
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


public class ProcessDropInResponse extends CustomAPIResponse {

    
    @JsonProperty("PaymentId")
    private String paymentId;


    public ProcessDropInResponse(Error[] errors, boolean hasError, String messages, String paymentId) {
        super(errors, hasError, messages);
        this.paymentId = paymentId;

    }

    public ProcessDropInResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.paymentId = apiResponse.getResponse().toString();

        }
    }

    
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessDropInResponse that = (ProcessDropInResponse) o;
        return Objects.equals(paymentId, that.paymentId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentId);
    }

    @Override
    public String toString() {
        return "ProcessDropInResponse{" +
                 "paymentId='" + paymentId + '\'' +

                '}';
    }
}