
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.ClientSettings;
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


public class SetClientSettingsArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
 */
    @JsonProperty("ClientId")
    private String clientId;

    /**
 * Gets or sets the client settings.
 */
    @JsonProperty("ClientSettings")
    private ClientSettings clientSettings;


    
    public SetClientSettingsArgs() {
    }

    
    public SetClientSettingsArgs(String clientId, ClientSettings clientSettings) {
        this.clientId = clientId;
this.clientSettings = clientSettings;

    }
    
    
    public SetClientSettingsArgs(String sessionToken, String clientId, ClientSettings clientSettings) {
        super(sessionToken);
        this.clientId = clientId;
this.clientSettings = clientSettings;

    }

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ClientSettings getClientSettings() {
        return clientSettings;
    }

    public void setClientSettings(ClientSettings clientSettings) {
        this.clientSettings = clientSettings;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetClientSettingsArgs that = (SetClientSettingsArgs) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(clientSettings, that.clientSettings) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientSettings);
    }

    @Override
    public String toString() {
        return "SetClientSettingsArgs{" +
                 "clientId='" + clientId + '\'' +
 ", clientSettings='" + clientSettings + '\'' +

                '}';
    }
}