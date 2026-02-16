
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


public class CreateFreeOperationResponse extends CustomAPIResponse {

    
    @JsonProperty("PaymentId")
    private String paymentId;

    @JsonProperty("ClientId")
    private String clientId;


    public CreateFreeOperationResponse(Error[] errors, boolean hasError, String messages, String paymentId, String clientId) {
        super(errors, hasError, messages);
        this.paymentId = paymentId;
        this.clientId = clientId;
    }

    public CreateFreeOperationResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.paymentId = apiResponse.getResponse().toString();
            this.clientId = apiResponse.getResponse().toString();
        }
    }

    
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateFreeOperationResponse that = (CreateFreeOperationResponse) o;
        return Objects.equals(paymentId, that.paymentId) && Objects.equals(clientId, that.clientId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentId, clientId);
    }

    @Override
    public String toString() {
        return "CreateFreeOperationResponse{" +
                "paymentId='" + paymentId + '\'' +
                ", clientId='" + clientId + '\'' +

                '}';
    }
}