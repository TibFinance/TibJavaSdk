
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class MoveServiceArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
 */
    @JsonProperty("ClientId")
    private String clientId;

    /**
 * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
 */
    @JsonProperty("ServiceId")
    private String serviceId;


    
    public MoveServiceArgs() {
    }

    
    public MoveServiceArgs(String clientId, String serviceId) {
        this.clientId = clientId;
this.serviceId = serviceId;

    }
    
    
    public MoveServiceArgs(String adminSessionToken, String clientId, String serviceId) {
        super(adminSessionToken);
        this.clientId = clientId;
this.serviceId = serviceId;

    }

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoveServiceArgs that = (MoveServiceArgs) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(serviceId, that.serviceId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, serviceId);
    }

    @Override
    public String toString() {
        return "MoveServiceArgs{" +
                 "clientId='" + clientId + '\'' +
 ", serviceId='" + serviceId + '\'' +

                '}';
    }
}