
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


public class AuthenticateUserAdminArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
     */
    @JsonProperty("ClientId")
    private String clientId;

    /**
     * 
     */
    @JsonProperty("UserName")
    private String userName;


    
    public AuthenticateUserAdminArgs() {
    }

    
    public AuthenticateUserAdminArgs(String clientId, String userName) {
        this.clientId = clientId;
        this.userName = userName;
    }
    
    
    public AuthenticateUserAdminArgs(String adminSessionToken, String clientId, String userName) {
        super(adminSessionToken);
        this.clientId = clientId;
        this.userName = userName;
    }

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthenticateUserAdminArgs that = (AuthenticateUserAdminArgs) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(userName, that.userName) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, userName);
    }

    @Override
    public String toString() {
        return "AuthenticateUserAdminArgs{" +
                "clientId='" + clientId + '\'' +
                ", userName='" + userName + '\'' +

                '}';
    }
}