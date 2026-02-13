
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.PendingChangeClientLimits;
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


public class ChangeClientWarningLimitRequestArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Gets or sets the client limits.
 */
    @JsonProperty("ClientLimits")
    private PendingChangeClientLimits clientLimits;


    
    public ChangeClientWarningLimitRequestArgs() {
    }

    
    public ChangeClientWarningLimitRequestArgs(PendingChangeClientLimits clientLimits) {
        this.clientLimits = clientLimits;

    }
    
    
    public ChangeClientWarningLimitRequestArgs(String sessionToken, PendingChangeClientLimits clientLimits) {
        super(sessionToken);
        this.clientLimits = clientLimits;

    }

    
    public PendingChangeClientLimits getClientLimits() {
        return clientLimits;
    }

    public void setClientLimits(PendingChangeClientLimits clientLimits) {
        this.clientLimits = clientLimits;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChangeClientWarningLimitRequestArgs that = (ChangeClientWarningLimitRequestArgs) o;
        return Objects.equals(clientLimits, that.clientLimits) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientLimits);
    }

    @Override
    public String toString() {
        return "ChangeClientWarningLimitRequestArgs{" +
                 "clientLimits='" + clientLimits + '\'' +

                '}';
    }
}