
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.Customer;
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
public class GetCustomerResponse extends CustomAPIResponse {

    
    @JsonProperty("Customer")
    private Customer customer;


    public GetCustomerResponse() {
    }

    public GetCustomerResponse(Error[] errors, boolean hasError, String messages, Customer customer) {
        super(errors, hasError, messages);
        this.customer = customer;
    }

    public GetCustomerResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        readPayload(apiResponse, objectMapper);
    }

    private void readPayload(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        String __rawBody = apiResponse.getRawBody();
        if (__rawBody == null || __rawBody.isEmpty()) {
            return;
        }
        try {
            GetCustomerResponse __typed = objectMapper.readValue(__rawBody, GetCustomerResponse.class);
            this.customer = __typed.customer;
        } catch (JsonProcessingException | RuntimeException e) {
            if (!apiResponse.isHasError()) {
                throw e;
            }
        }
    }

    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCustomerResponse that = (GetCustomerResponse) o;
        return Objects.equals(customer, that.customer) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customer);
    }

    @Override
    public String toString() {
        return "GetCustomerResponse{" +
                "customer='" + customer + '\'' +

                '}';
    }
}