
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BaseAdminOnlyCryptedArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Gets or sets the admin session token.
     */
    @JsonProperty("AdminSessionToken")
    private String adminSessionToken;


    
    public BaseAdminOnlyCryptedArgs() {
    }

    
    public BaseAdminOnlyCryptedArgs(String adminSessionToken) {
        this.adminSessionToken = adminSessionToken;
    }
    
    
    public BaseAdminOnlyCryptedArgs(String sessionToken, String adminSessionToken) {
        super(sessionToken);
        this.adminSessionToken = adminSessionToken;
    }

    
    public String getAdminSessionToken() {
        return adminSessionToken;
    }

    public void setAdminSessionToken(String adminSessionToken) {
        this.adminSessionToken = adminSessionToken;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseAdminOnlyCryptedArgs that = (BaseAdminOnlyCryptedArgs) o;
        return Objects.equals(adminSessionToken, that.adminSessionToken) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(adminSessionToken);
    }

    @Override
    public String toString() {
        return "BaseAdminOnlyCryptedArgs{" +
                "adminSessionToken='" + adminSessionToken + '\'' +

                '}';
    }
}