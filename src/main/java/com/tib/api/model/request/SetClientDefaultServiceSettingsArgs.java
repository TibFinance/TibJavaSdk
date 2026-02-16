
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.ServiceSettings;
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


public class SetClientDefaultServiceSettingsArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
     */
    @JsonProperty("ClientId")
    private String clientId;

    /**
     * Gets or sets the settings.
     */
    @JsonProperty("Settings")
    private ServiceSettings settings;


    
    public SetClientDefaultServiceSettingsArgs() {
    }

    
    public SetClientDefaultServiceSettingsArgs(String clientId, ServiceSettings settings) {
        this.clientId = clientId;
        this.settings = settings;
    }
    
    
    public SetClientDefaultServiceSettingsArgs(String adminSessionToken, String clientId, ServiceSettings settings) {
        super(adminSessionToken);
        this.clientId = clientId;
        this.settings = settings;
    }

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ServiceSettings getSettings() {
        return settings;
    }

    public void setSettings(ServiceSettings settings) {
        this.settings = settings;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetClientDefaultServiceSettingsArgs that = (SetClientDefaultServiceSettingsArgs) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(settings, that.settings) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, settings);
    }

    @Override
    public String toString() {
        return "SetClientDefaultServiceSettingsArgs{" +
                "clientId='" + clientId + '\'' +
                ", settings='" + settings + '\'' +

                '}';
    }
}