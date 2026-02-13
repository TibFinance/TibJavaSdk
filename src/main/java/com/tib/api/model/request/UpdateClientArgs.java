
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


public class UpdateClientArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
 */
    @JsonProperty("ClientId")
    private String clientId;

    /**
 * 
 */
    @JsonProperty("ClientName")
    private String clientName;

    /**
 * 
 */
    @JsonProperty("FeesOverloadedMerchantId")
    private String feesOverloadedMerchantId;


    
    public UpdateClientArgs() {
    }

    
    public UpdateClientArgs(String clientId, String clientName, String feesOverloadedMerchantId) {
        this.clientId = clientId;
this.clientName = clientName;
this.feesOverloadedMerchantId = feesOverloadedMerchantId;

    }
    
    
    public UpdateClientArgs(String adminSessionToken, String clientId, String clientName, String feesOverloadedMerchantId) {
        super(adminSessionToken);
        this.clientId = clientId;
this.clientName = clientName;
this.feesOverloadedMerchantId = feesOverloadedMerchantId;

    }

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getFeesOverloadedMerchantId() {
        return feesOverloadedMerchantId;
    }

    public void setFeesOverloadedMerchantId(String feesOverloadedMerchantId) {
        this.feesOverloadedMerchantId = feesOverloadedMerchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateClientArgs that = (UpdateClientArgs) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(clientName, that.clientName) && Objects.equals(feesOverloadedMerchantId, that.feesOverloadedMerchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientName, feesOverloadedMerchantId);
    }

    @Override
    public String toString() {
        return "UpdateClientArgs{" +
                 "clientId='" + clientId + '\'' +
 ", clientName='" + clientName + '\'' +
 ", feesOverloadedMerchantId='" + feesOverloadedMerchantId + '\'' +

                '}';
    }
}