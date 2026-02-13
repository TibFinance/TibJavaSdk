
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.AdminTransaction;
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


public class SearchAdminTransactionResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("SearchResult")
    private List<AdminTransaction> searchResult;


    public SearchAdminTransactionResponse(Error[] errors, boolean hasError, String messages, List<AdminTransaction> searchResult) {
        super(errors, hasError, messages);
        this.searchResult = searchResult;

    }

    public SearchAdminTransactionResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.searchResult = (List<AdminTransaction>) apiResponse.getResponse();

        }
    }

    
    public List<AdminTransaction> getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(List<AdminTransaction> searchResult) {
        this.searchResult = searchResult;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchAdminTransactionResponse that = (SearchAdminTransactionResponse) o;
        return Objects.equals(searchResult, that.searchResult) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(searchResult);
    }

    @Override
    public String toString() {
        return "SearchAdminTransactionResponse{" +
                 "searchResult='" + searchResult + '\'' +

                '}';
    }
}