
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.TransactionCommonWithMeta;
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


public class GetTransactionsByProviderTransactionGroupIdResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("Transactions")
    private List<TransactionCommonWithMeta> transactions;


    public GetTransactionsByProviderTransactionGroupIdResponse(Error[] errors, boolean hasError, String messages, List<TransactionCommonWithMeta> transactions) {
        super(errors, hasError, messages);
        this.transactions = transactions;

    }

    public GetTransactionsByProviderTransactionGroupIdResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.transactions = (List<TransactionCommonWithMeta>) apiResponse.getResponse();

        }
    }

    
    public List<TransactionCommonWithMeta> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionCommonWithMeta> transactions) {
        this.transactions = transactions;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTransactionsByProviderTransactionGroupIdResponse that = (GetTransactionsByProviderTransactionGroupIdResponse) o;
        return Objects.equals(transactions, that.transactions) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactions);
    }

    @Override
    public String toString() {
        return "GetTransactionsByProviderTransactionGroupIdResponse{" +
                 "transactions='" + transactions + '\'' +

                '}';
    }
}