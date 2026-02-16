
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.Customer;
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


public class GetCustomerResponse extends CustomAPIResponse {

    
    @JsonProperty("Customer")
    private Customer customer;


    public GetCustomerResponse(Error[] errors, boolean hasError, String messages, Customer customer) {
        super(errors, hasError, messages);
        this.customer = customer;
    }

    public GetCustomerResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.customer = objectMapper.readValue(json, Customer.class);
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