
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


public class SetServiceSettingsArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
 */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
 * Gets or sets the settings.
 */
    @JsonProperty("Settings")
    private ServiceSettings settings;


    
    public SetServiceSettingsArgs() {
    }

    
    public SetServiceSettingsArgs(String serviceId, ServiceSettings settings) {
        this.serviceId = serviceId;
this.settings = settings;

    }
    
    
    public SetServiceSettingsArgs(String adminSessionToken, String serviceId, ServiceSettings settings) {
        super(adminSessionToken);
        this.serviceId = serviceId;
this.settings = settings;

    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
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
        SetServiceSettingsArgs that = (SetServiceSettingsArgs) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(settings, that.settings) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, settings);
    }

    @Override
    public String toString() {
        return "SetServiceSettingsArgs{" +
                 "serviceId='" + serviceId + '\'' +
 ", settings='" + settings + '\'' +

                '}';
    }
}