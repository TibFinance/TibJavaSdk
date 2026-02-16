
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatePublicTokenArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SearchCompanyArgs  extends BaseAuthenticatePublicTokenArgs  {

    
    /**
     * Gets and sets the searching text
     */
    @JsonProperty("Text")
    private String text;


    
    public SearchCompanyArgs() {
    }

    
    public SearchCompanyArgs(String text) {
        this.text = text;
    }
    
    
    public SearchCompanyArgs(String publicTokenId, String text) {
        super(publicTokenId);
        this.text = text;
    }

    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchCompanyArgs that = (SearchCompanyArgs) o;
        return Objects.equals(text, that.text) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "SearchCompanyArgs{" +
                "text='" + text + '\'' +

                '}';
    }
}