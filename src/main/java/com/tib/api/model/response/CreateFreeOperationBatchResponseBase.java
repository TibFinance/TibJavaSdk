
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.response.RequestDataResponse;
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


public class CreateFreeOperationBatchResponseBase extends CustomAPIResponse {

    
    @JsonProperty("Status")
    private Integer status;

    @JsonProperty("PaymentId")
    private String paymentId;

    @JsonProperty("ReferenceNumber")
    private String referenceNumber;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("RequestDataResponse")
    private RequestDataResponse requestDataResponse;


    public CreateFreeOperationBatchResponseBase(Error[] errors, boolean hasError, String messages, Integer status, String paymentId, String referenceNumber, String message, RequestDataResponse requestDataResponse) {
        super(errors, hasError, messages);
        this.status = status;
        this.paymentId = paymentId;
        this.referenceNumber = referenceNumber;
        this.message = message;
        this.requestDataResponse = requestDataResponse;
    }

    public CreateFreeOperationBatchResponseBase(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.requestDataResponse = objectMapper.readValue(json, RequestDataResponse.class);
        }
    }

    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RequestDataResponse getRequestDataResponse() {
        return requestDataResponse;
    }

    public void setRequestDataResponse(RequestDataResponse requestDataResponse) {
        this.requestDataResponse = requestDataResponse;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateFreeOperationBatchResponseBase that = (CreateFreeOperationBatchResponseBase) o;
        return Objects.equals(status, that.status) && Objects.equals(paymentId, that.paymentId) && Objects.equals(referenceNumber, that.referenceNumber) && Objects.equals(message, that.message) && Objects.equals(requestDataResponse, that.requestDataResponse) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(status, paymentId, referenceNumber, message, requestDataResponse);
    }

    @Override
    public String toString() {
        return "CreateFreeOperationBatchResponseBase{" +
                "status='" + status + '\'' +
                ", paymentId='" + paymentId + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", message='" + message + '\'' +
                ", requestDataResponse='" + requestDataResponse + '\'' +

                '}';
    }
}