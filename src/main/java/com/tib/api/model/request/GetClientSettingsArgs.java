
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


public class GetClientSettingsArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
 */
    @JsonProperty("ClientId")
    private String clientId;


    
    public GetClientSettingsArgs() {
    }

    
    public GetClientSettingsArgs(String clientId) {
        this.clientId = clientId;

    }
    
    
    public GetClientSettingsArgs(String sessionToken, String clientId) {
        super(sessionToken);
        this.clientId = clientId;

    }

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetClientSettingsArgs that = (GetClientSettingsArgs) o;
        return Objects.equals(clientId, that.clientId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId);
    }

    @Override
    public String toString() {
        return "GetClientSettingsArgs{" +
                 "clientId='" + clientId + '\'' +

                '}';
    }
}