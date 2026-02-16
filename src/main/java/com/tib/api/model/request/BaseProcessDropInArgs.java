
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


public class BaseProcessDropInArgs  extends BaseAuthenticatePublicTokenArgs  {

    
    /**
     * 
     */
    @JsonProperty("IsPPAAuthorized")
    private boolean isPPAAuthorized;


    
    public BaseProcessDropInArgs() {
    }

    
    public BaseProcessDropInArgs(boolean isPPAAuthorized) {
        this.isPPAAuthorized = isPPAAuthorized;
    }
    
    
    public BaseProcessDropInArgs(String publicTokenId, boolean isPPAAuthorized) {
        super(publicTokenId);
        this.isPPAAuthorized = isPPAAuthorized;
    }

    
    public boolean getIsPPAAuthorized() {
        return isPPAAuthorized;
    }

    public void setIsPPAAuthorized(boolean isPPAAuthorized) {
        this.isPPAAuthorized = isPPAAuthorized;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseProcessDropInArgs that = (BaseProcessDropInArgs) o;
        return Objects.equals(isPPAAuthorized, that.isPPAAuthorized) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(isPPAAuthorized);
    }

    @Override
    public String toString() {
        return "BaseProcessDropInArgs{" +
                "isPPAAuthorized='" + isPPAAuthorized + '\'' +

                '}';
    }
}