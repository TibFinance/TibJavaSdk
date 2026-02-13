
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


public class ChangeTransactionStatusResponse extends CustomAPIResponse {

    
    @JsonProperty("TransactionId")
    private String transactionId;

    @JsonProperty("TransactionStatus")
    private Integer transactionStatus;


    public ChangeTransactionStatusResponse(Error[] errors, boolean hasError, String messages, String transactionId, Integer transactionStatus) {
        super(errors, hasError, messages);
        this.transactionId = transactionId;
this.transactionStatus = transactionStatus;

    }

    public ChangeTransactionStatusResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.transactionId = apiResponse.getResponse().toString();
this.transactionStatus = Integer.parseInt(apiResponse.getResponse().toString());

        }
    }

    
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(Integer transactionStatus) {
        this.transactionStatus = transactionStatus;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChangeTransactionStatusResponse that = (ChangeTransactionStatusResponse) o;
        return Objects.equals(transactionId, that.transactionId) && Objects.equals(transactionStatus, that.transactionStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactionId, transactionStatus);
    }

    @Override
    public String toString() {
        return "ChangeTransactionStatusResponse{" +
                 "transactionId='" + transactionId + '\'' +
 ", transactionStatus='" + transactionStatus + '\'' +

                '}';
    }
}