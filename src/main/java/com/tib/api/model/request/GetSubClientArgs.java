
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


public class GetSubClientArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Retrieves or assigns the unique identifier for a sub-client.
 */
    @JsonProperty("SubClientId")
    private String subClientId;


    
    public GetSubClientArgs() {
    }

    
    public GetSubClientArgs(String subClientId) {
        this.subClientId = subClientId;

    }
    
    
    public GetSubClientArgs(String sessionToken, String subClientId) {
        super(sessionToken);
        this.subClientId = subClientId;

    }

    
    public String getSubClientId() {
        return subClientId;
    }

    public void setSubClientId(String subClientId) {
        this.subClientId = subClientId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSubClientArgs that = (GetSubClientArgs) o;
        return Objects.equals(subClientId, that.subClientId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(subClientId);
    }

    @Override
    public String toString() {
        return "GetSubClientArgs{" +
                 "subClientId='" + subClientId + '\'' +

                '}';
    }
}