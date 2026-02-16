
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


public class GetSessionCookiesAdminArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("Key")
    private String key;


    
    public GetSessionCookiesAdminArgs() {
    }

    
    public GetSessionCookiesAdminArgs(String key) {
        this.key = key;
    }
    
    
    public GetSessionCookiesAdminArgs(String adminSessionToken, String key) {
        super(adminSessionToken);
        this.key = key;
    }

    
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSessionCookiesAdminArgs that = (GetSessionCookiesAdminArgs) o;
        return Objects.equals(key, that.key) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return "GetSessionCookiesAdminArgs{" +
                "key='" + key + '\'' +

                '}';
    }
}