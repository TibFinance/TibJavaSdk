
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class LoginArgs  implements IBaseCryptedServiceArgs  {

    
    /**
     * The client ID the user signs in with, as for CreateSession.
     */
    @JsonProperty("ClientId")
    private String clientId;

    /**
     * The user's username. It is not case-sensitive.
     */
    @JsonProperty("Username")
    private String username;

    /**
     * The user's password.
     */
    @JsonProperty("Password")
    private String password;

    /**
     * The access to open: a LoginsUserRelationsId returned by GetLoginAccessList for the same user.
     */
    @JsonProperty("LoginsUserRelationsId")
    private String loginsUserRelationsId;


    
    public LoginArgs() {
    }

    
    public LoginArgs(String clientId, String username, String password, String loginsUserRelationsId) {
        this.clientId = clientId;
        this.username = username;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginsUserRelationsId() {
        return loginsUserRelationsId;
    }

    public void setLoginsUserRelationsId(String loginsUserRelationsId) {
        this.loginsUserRelationsId = loginsUserRelationsId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginArgs that = (LoginArgs) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(loginsUserRelationsId, that.loginsUserRelationsId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, username, password, loginsUserRelationsId);
    }

    @Override
    public String toString() {
        return "LoginArgs{" +
                "clientId='" + clientId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + (password == null ? null : "***") + '\'' +
                ", loginsUserRelationsId='" + loginsUserRelationsId + '\'' +

                '}';
    }
}