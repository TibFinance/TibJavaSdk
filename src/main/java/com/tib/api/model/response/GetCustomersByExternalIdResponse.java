
package com.tib.api.model.response;

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


public class GetCustomersByExternalIdResponse extends CustomAPIResponse {

    
    @JsonProperty("Customers")
    private List<Customer> customers;


    public GetCustomersByExternalIdResponse() {
    }

    public GetCustomersByExternalIdResponse(Error[] errors, boolean hasError, String messages, List<Customer> customers) {
        super(errors, hasError, messages);
        this.customers = customers;
    }

    public GetCustomersByExternalIdResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String __rawBody = apiResponse.getRawBody();
            if (__rawBody != null && !__rawBody.isEmpty()) {
                GetCustomersByExternalIdResponse __typed = objectMapper.readValue(__rawBody, GetCustomersByExternalIdResponse.class);
                this.customers = __typed.customers;
            }
        }
    }

    
    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCustomersByExternalIdResponse that = (GetCustomersByExternalIdResponse) o;
        return Objects.equals(customers, that.customers) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customers);
    }

    @Override
    public String toString() {
        return "GetCustomersByExternalIdResponse{" +
                "customers='" + customers + '\'' +

                '}';
    }
}