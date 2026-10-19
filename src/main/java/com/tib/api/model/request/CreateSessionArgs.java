
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


public class CreateSessionArgs  implements IBaseCryptedServiceArgs  {

    
    /**
     * The client ID the user signs in with.
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


    
    public CreateSessionArgs() {
    }

    
    public CreateSessionArgs(String clientId, String username, String password) {
        this.clientId = clientId;
        this.username = username;
        this.password = password;
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



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateSessionArgs that = (CreateSessionArgs) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(username, that.username) && Objects.equals(password, that.password) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, username, password);
    }

    @Override
    public String toString() {
        return "CreateSessionArgs{" +
                "clientId='" + clientId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + (password == null ? null : "***") + '\'' +

                '}';
    }
}