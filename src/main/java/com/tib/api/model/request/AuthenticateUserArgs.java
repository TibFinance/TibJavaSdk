
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


public class AuthenticateUserArgs  implements IBaseCryptedServiceArgs  {

    
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

    /**
 * The 'Password' property is a critical component in user authentication, safeguarding individualized user data.
 */
    @JsonProperty("Password")
    private String password;


    
    public AuthenticateUserArgs() {
    }

    
    public AuthenticateUserArgs(String clientId, String username, String password) {
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
        AuthenticateUserArgs that = (AuthenticateUserArgs) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(username, that.username) && Objects.equals(password, that.password) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, username, password);
    }

    @Override
    public String toString() {
        return "AuthenticateUserArgs{" +
                 "clientId='" + clientId + '\'' +
 ", username='" + username + '\'' +
 ", password='" + password + '\'' +

                '}';
    }
}