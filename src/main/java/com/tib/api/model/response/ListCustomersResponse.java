
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


public class ListCustomersResponse extends CustomAPIResponse {

    
    @JsonProperty("Customers")
    private List<Customer> customers;


    public ListCustomersResponse(Error[] errors, boolean hasError, String messages, List<Customer> customers) {
        super(errors, hasError, messages);
        this.customers = customers;

    }

    public ListCustomersResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.customers = (List<Customer>) apiResponse.getResponse();

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
        ListCustomersResponse that = (ListCustomersResponse) o;
        return Objects.equals(customers, that.customers) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customers);
    }

    @Override
    public String toString() {
        return "ListCustomersResponse{" +
                 "customers='" + customers + '\'' +

                '}';
    }
}