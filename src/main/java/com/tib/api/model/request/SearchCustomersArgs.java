
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SearchCustomersArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("SearchText")
    private String searchText;


    
    public SearchCustomersArgs() {
    }

    
    public SearchCustomersArgs(String searchText) {
        this.searchText = searchText;
    }
    
    
    public SearchCustomersArgs(String adminSessionToken, String searchText) {
        super(adminSessionToken);
        this.searchText = searchText;
    }

    
    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchCustomersArgs that = (SearchCustomersArgs) o;
        return Objects.equals(searchText, that.searchText) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(searchText);
    }

    @Override
    public String toString() {
        return "SearchCustomersArgs{" +
                "searchText='" + searchText + '\'' +

                '}';
    }
}