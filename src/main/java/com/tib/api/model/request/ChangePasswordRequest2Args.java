
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


public class ChangePasswordRequest2Args  implements IBaseCryptedServiceArgs  {

    
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


    
    public ChangePasswordRequest2Args() {
    }

    
    public ChangePasswordRequest2Args(String clientId, String username) {
        this.clientId = clientId;
        this.username = username;
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
        ChangePasswordRequest2Args that = (ChangePasswordRequest2Args) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(username, that.username) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, username);
    }

    @Override
    public String toString() {
        return "ChangePasswordRequest2Args{" +
                "clientId='" + clientId + '\'' +
                ", username='" + username + '\'' +

                '}';
    }
}