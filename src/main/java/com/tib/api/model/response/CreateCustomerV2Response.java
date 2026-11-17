
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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


@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateCustomerV2Response extends CustomAPIResponse {

    
    @JsonProperty("CustomerId")
    private String customerId;


    public CreateCustomerV2Response() {
    }

    public CreateCustomerV2Response(Error[] errors, boolean hasError, String messages, String customerId) {
        super(errors, hasError, messages);
        this.customerId = customerId;
    }

    public CreateCustomerV2Response(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        readPayload(apiResponse, objectMapper);
    }

    private void readPayload(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        String __rawBody = apiResponse.getRawBody();
        if (__rawBody == null || __rawBody.isEmpty()) {
            return;
        }
        try {
            CreateCustomerV2Response __typed = objectMapper.readValue(__rawBody, CreateCustomerV2Response.class);
            this.customerId = __typed.customerId;
        } catch (JsonProcessingException | RuntimeException e) {
            if (!apiResponse.isHasError()) {
                throw e;
            }
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
        CreateCustomerV2Response that = (CreateCustomerV2Response) o;
        return Objects.equals(customerId, that.customerId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }

    @Override
    public String toString() {
        return "CreateCustomerV2Response{" +
                "customerId='" + customerId + '\'' +

                '}';
    }
}