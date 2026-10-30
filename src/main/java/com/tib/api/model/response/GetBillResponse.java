
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.Bill;
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
public class GetBillResponse extends CustomAPIResponse {

    
    @JsonProperty("Bill")
    private Bill bill;


    public GetBillResponse() {
    }

    public GetBillResponse(Error[] errors, boolean hasError, String messages, Bill bill) {
        super(errors, hasError, messages);
        this.bill = bill;
    }

    public GetBillResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        readPayload(apiResponse, objectMapper);
    }

    private void readPayload(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        String __rawBody = apiResponse.getRawBody();
        if (__rawBody == null || __rawBody.isEmpty()) {
            return;
        }
        try {
            GetBillResponse __typed = objectMapper.readValue(__rawBody, GetBillResponse.class);
            this.bill = __typed.bill;
        } catch (JsonProcessingException | RuntimeException e) {
            if (!apiResponse.isHasError()) {
                throw e;
            }
        }
    }

    
    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBillResponse that = (GetBillResponse) o;
        return Objects.equals(bill, that.bill) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(bill);
    }

    @Override
    public String toString() {
        return "GetBillResponse{" +
                "bill='" + bill + '\'' +

                '}';
    }
}