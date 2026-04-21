
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
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


public class CreateCustomerResponse extends CustomAPIResponse {

    
    @JsonProperty("CustomerId")
    private String customerId;

    @JsonProperty("CustomerAlreadyExisted")
    private boolean customerAlreadyExisted;


    public CreateCustomerResponse() {
    }

    public CreateCustomerResponse(Error[] errors, boolean hasError, String messages, String customerId, boolean customerAlreadyExisted) {
        super(errors, hasError, messages);
        this.customerId = customerId;
        this.customerAlreadyExisted = customerAlreadyExisted;
    }

    public CreateCustomerResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String __rawBody = apiResponse.getRawBody();
            if (__rawBody != null && !__rawBody.isEmpty()) {
                CreateCustomerResponse __typed = objectMapper.readValue(__rawBody, CreateCustomerResponse.class);
                this.customerId = __typed.customerId;
                this.customerAlreadyExisted = __typed.customerAlreadyExisted;
            }
        }
    }

    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public boolean getCustomerAlreadyExisted() {
        return customerAlreadyExisted;
    }

    public void setCustomerAlreadyExisted(boolean customerAlreadyExisted) {
        this.customerAlreadyExisted = customerAlreadyExisted;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateCustomerResponse that = (CreateCustomerResponse) o;
        return Objects.equals(customerId, that.customerId) && Objects.equals(customerAlreadyExisted, that.customerAlreadyExisted) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerAlreadyExisted);
    }

    @Override
    public String toString() {
        return "CreateCustomerResponse{" +
                "customerId='" + customerId + '\'' +
                ", customerAlreadyExisted='" + customerAlreadyExisted + '\'' +

                '}';
    }
}