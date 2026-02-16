
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.AdminOperation;
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


public class SearchAdminOperationResponse extends CustomAPIResponse {

    
    @JsonProperty("SearchResult")
    private List<AdminOperation> searchResult;


    public SearchAdminOperationResponse(Error[] errors, boolean hasError, String messages, List<AdminOperation> searchResult) {
        super(errors, hasError, messages);
        this.searchResult = searchResult;
    }

    public SearchAdminOperationResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.searchResult = (List<AdminOperation>) apiResponse.getResponse();
        }
    }

    
    public List<AdminOperation> getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(List<AdminOperation> searchResult) {
        this.searchResult = searchResult;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchAdminOperationResponse that = (SearchAdminOperationResponse) o;
        return Objects.equals(searchResult, that.searchResult) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(searchResult);
    }

    @Override
    public String toString() {
        return "SearchAdminOperationResponse{" +
                "searchResult='" + searchResult + '\'' +

                '}';
    }
}