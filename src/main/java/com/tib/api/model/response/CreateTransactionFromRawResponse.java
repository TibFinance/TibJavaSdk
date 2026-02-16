
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


public class CreateTransactionFromRawResponse extends CustomAPIResponse {

    
    @JsonProperty("TransactionsGroupId")
    private String transactionsGroupId;


    public CreateTransactionFromRawResponse(Error[] errors, boolean hasError, String messages, String transactionsGroupId) {
        super(errors, hasError, messages);
        this.transactionsGroupId = transactionsGroupId;
    }

    public CreateTransactionFromRawResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.transactionsGroupId = apiResponse.getResponse().toString();
        }
    }

    
    public String getTransactionsGroupId() {
        return transactionsGroupId;
    }

    public void setTransactionsGroupId(String transactionsGroupId) {
        this.transactionsGroupId = transactionsGroupId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateTransactionFromRawResponse that = (CreateTransactionFromRawResponse) o;
        return Objects.equals(transactionsGroupId, that.transactionsGroupId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactionsGroupId);
    }

    @Override
    public String toString() {
        return "CreateTransactionFromRawResponse{" +
                "transactionsGroupId='" + transactionsGroupId + '\'' +

                '}';
    }
}