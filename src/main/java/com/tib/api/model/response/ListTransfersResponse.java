
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.Payment;
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
public class ListTransfersResponse extends CustomAPIResponse {

    
    @JsonProperty("Payments")
    private List<Payment> payments;


    public ListTransfersResponse() {
    }

    public ListTransfersResponse(Error[] errors, boolean hasError, String messages, List<Payment> payments) {
        super(errors, hasError, messages);
        this.payments = payments;
    }

    public ListTransfersResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        readPayload(apiResponse, objectMapper);
    }

    private void readPayload(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        String __rawBody = apiResponse.getRawBody();
        if (__rawBody == null || __rawBody.isEmpty()) {
            return;
        }
        try {
            ListTransfersResponse __typed = objectMapper.readValue(__rawBody, ListTransfersResponse.class);
            this.payments = __typed.payments;
        } catch (JsonProcessingException | RuntimeException e) {
            if (!apiResponse.isHasError()) {
                throw e;
            }
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