
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


public class GetPendingMerchantArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
 */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
 * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
 */
    @JsonProperty("ClientId")
    private String clientId;


    
    public GetPendingMerchantArgs() {
    }

    
    public GetPendingMerchantArgs(String serviceId, String clientId) {
        this.serviceId = serviceId;
this.clientId = clientId;

    }
    
    
    public GetPendingMerchantArgs(String sessionToken, String serviceId, String clientId) {
        super(sessionToken);
        this.serviceId = serviceId;
this.clientId = clientId;

    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
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
        GetPendingMerchantArgs that = (GetPendingMerchantArgs) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(clientId, that.clientId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, clientId);
    }

    @Override
    public String toString() {
        return "GetPendingMerchantArgs{" +
                 "serviceId='" + serviceId + '\'' +
 ", clientId='" + clientId + '\'' +

                '}';
    }
}