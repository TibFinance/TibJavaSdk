
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ValidateCompanyInfoArgs  implements IBaseCryptedServiceArgs  {

    
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


    
    public ValidateCompanyInfoArgs() {
    }

    
    public ValidateCompanyInfoArgs(String clientId, String clientName) {
        this.clientId = clientId;
this.clientName = clientName;

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



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidateCompanyInfoArgs that = (ValidateCompanyInfoArgs) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(clientName, that.clientName) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientName);
    }

    @Override
    public String toString() {
        return "ValidateCompanyInfoArgs{" +
                 "clientId='" + clientId + '\'' +
 ", clientName='" + clientName + '\'' +

                '}';
    }
}