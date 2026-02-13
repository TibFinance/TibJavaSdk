
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


public class LoginAdminArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * Retrieves or assigns the identifier for user login relations.
 */
    @JsonProperty("LoginsUserRelationsId")
    private String loginsUserRelationsId;

    /**
 * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
 */
    @JsonProperty("ClientId")
    private String clientId;

    /**
 * The 'Username' property functions as a unique identifier for each user, facilitating personalized user interactions within the system.
 */
    @JsonProperty("Username")
    private String username;


    
    public LoginAdminArgs() {
    }

    
    public LoginAdminArgs(String loginsUserRelationsId, String clientId, String username) {
        this.loginsUserRelationsId = loginsUserRelationsId;
this.clientId = clientId;
this.username = username;

    }
    
    
    public LoginAdminArgs(String adminSessionToken, String loginsUserRelationsId, String clientId, String username) {
        super(adminSessionToken);
        this.loginsUserRelationsId = loginsUserRelationsId;
this.clientId = clientId;
this.username = username;

    }

    
    public String getLoginsUserRelationsId() {
        return loginsUserRelationsId;
    }

    public void setLoginsUserRelationsId(String loginsUserRelationsId) {
        this.loginsUserRelationsId = loginsUserRelationsId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginAdminArgs that = (LoginAdminArgs) o;
        return Objects.equals(loginsUserRelationsId, that.loginsUserRelationsId) && Objects.equals(clientId, that.clientId) && Objects.equals(username, that.username) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(loginsUserRelationsId, clientId, username);
    }

    @Override
    public String toString() {
        return "LoginAdminArgs{" +
                 "loginsUserRelationsId='" + loginsUserRelationsId + '\'' +
 ", clientId='" + clientId + '\'' +
 ", username='" + username + '\'' +

                '}';
    }
}