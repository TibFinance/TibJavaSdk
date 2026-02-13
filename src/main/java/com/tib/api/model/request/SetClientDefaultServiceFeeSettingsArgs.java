
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.ServiceFeeSettings;
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


public class SetClientDefaultServiceFeeSettingsArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
 */
    @JsonProperty("ClientId")
    private String clientId;

    /**
 * Gets or sets the ServiceFeeSettings model that defines the fee configuration for a specific service contract.
 */
    @JsonProperty("ServiceFeeSettings")
    private ServiceFeeSettings serviceFeeSettings;


    
    public SetClientDefaultServiceFeeSettingsArgs() {
    }

    
    public SetClientDefaultServiceFeeSettingsArgs(String clientId, ServiceFeeSettings serviceFeeSettings) {
        this.clientId = clientId;
this.serviceFeeSettings = serviceFeeSettings;

    }
    
    
    public SetClientDefaultServiceFeeSettingsArgs(String sessionToken, String clientId, ServiceFeeSettings serviceFeeSettings) {
        super(sessionToken);
        this.clientId = clientId;
this.serviceFeeSettings = serviceFeeSettings;

    }

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ServiceFeeSettings getServiceFeeSettings() {
        return serviceFeeSettings;
    }

    public void setServiceFeeSettings(ServiceFeeSettings serviceFeeSettings) {
        this.serviceFeeSettings = serviceFeeSettings;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetClientDefaultServiceFeeSettingsArgs that = (SetClientDefaultServiceFeeSettingsArgs) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(serviceFeeSettings, that.serviceFeeSettings) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, serviceFeeSettings);
    }

    @Override
    public String toString() {
        return "SetClientDefaultServiceFeeSettingsArgs{" +
                 "clientId='" + clientId + '\'' +
 ", serviceFeeSettings='" + serviceFeeSettings + '\'' +

                '}';
    }
}