
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


public class ListTransfersResponse extends CustomAPIResponse {

    
    @JsonProperty("Payments")
    private List<Payment> payments;


    public ListTransfersResponse(Error[] errors, boolean hasError, String messages, List<Payment> payments) {
        super(errors, hasError, messages);
        this.payments = payments;
    }

    public ListTransfersResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.payments = (List<Payment>) apiResponse.getResponse();
        }
    }

    
    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListTransfersResponse that = (ListTransfersResponse) o;
        return Objects.equals(payments, that.payments) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(payments);
    }

    @Override
    public String toString() {
        return "ListTransfersResponse{" +
                "payments='" + payments + '\'' +

                '}';
    }
}