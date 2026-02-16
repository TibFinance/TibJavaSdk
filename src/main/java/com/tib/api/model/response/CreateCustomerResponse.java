
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


public class CreateCustomerResponse extends CustomAPIResponse {

    
    @JsonProperty("CustomerId")
    private String customerId;


    public CreateCustomerResponse(Error[] errors, boolean hasError, String messages, String customerId) {
        super(errors, hasError, messages);
        this.customerId = customerId;
    }

    public CreateCustomerResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.customerId = apiResponse.getResponse().toString();
        }
    }

    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateCustomerResponse that = (CreateCustomerResponse) o;
        return Objects.equals(customerId, that.customerId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }

    @Override
    public String toString() {
        return "CreateCustomerResponse{" +
                "customerId='" + customerId + '\'' +

                '}';
    }
}