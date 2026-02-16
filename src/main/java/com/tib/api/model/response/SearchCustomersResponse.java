
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.SearchCustomer;
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


public class SearchCustomersResponse extends CustomAPIResponse {

    
    @JsonProperty("SearchResult")
    private List<SearchCustomer> searchResult;


    public SearchCustomersResponse(Error[] errors, boolean hasError, String messages, List<SearchCustomer> searchResult) {
        super(errors, hasError, messages);
        this.searchResult = searchResult;
    }

    public SearchCustomersResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.searchResult = (List<SearchCustomer>) apiResponse.getResponse();
        }
    }

    
    public List<SearchCustomer> getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(List<SearchCustomer> searchResult) {
        this.searchResult = searchResult;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchCustomersResponse that = (SearchCustomersResponse) o;
        return Objects.equals(searchResult, that.searchResult) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(searchResult);
    }

    @Override
    public String toString() {
        return "SearchCustomersResponse{" +
                "searchResult='" + searchResult + '\'' +

                '}';
    }
}