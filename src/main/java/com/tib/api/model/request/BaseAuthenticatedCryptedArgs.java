
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BaseAuthenticatedCryptedArgs  implements IBaseCryptedServiceArgs  {

    
    /**
     * Handles the acquisition or assignment of a unique session token, acting as a distinct identifier for the user's session.
     */
    @JsonProperty("SessionToken")
    private String sessionToken;


    
    public BaseAuthenticatedCryptedArgs() {
    }

    
    public BaseAuthenticatedCryptedArgs(String sessionToken) {
        this.sessionToken = sessionToken;
    }
    
    

    
    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseAuthenticatedCryptedArgs that = (BaseAuthenticatedCryptedArgs) o;
        return Objects.equals(sessionToken, that.sessionToken) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(sessionToken);
    }

    @Override
    public String toString() {
        return "BaseAuthenticatedCryptedArgs{" +
                "sessionToken='" + sessionToken + '\'' +

                '}';
    }
}