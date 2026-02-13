
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.PublicAccessTokenRoutingType;
import com.tib.api.model.request.BaseAuthenticatePublicTokenArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ClientLoginBoardingArgs  extends BaseAuthenticatePublicTokenArgs  {

    
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

    /**
 * Gets and set the type of the routing.
 */
    @JsonProperty("RoutingType")
    private PublicAccessTokenRoutingType routingType;


    
    public ClientLoginBoardingArgs() {
    }

    
    public ClientLoginBoardingArgs(String username, String password, PublicAccessTokenRoutingType routingType) {
        this.username = username;
this.password = password;
this.routingType = routingType;

    }
    
    
    public ClientLoginBoardingArgs(String publicTokenId, String username, String password, PublicAccessTokenRoutingType routingType) {
        super(publicTokenId);
        this.username = username;
this.password = password;
this.routingType = routingType;

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

    public PublicAccessTokenRoutingType getRoutingType() {
        return routingType;
    }

    public void setRoutingType(PublicAccessTokenRoutingType routingType) {
        this.routingType = routingType;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientLoginBoardingArgs that = (ClientLoginBoardingArgs) o;
        return Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(routingType, that.routingType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(username, password, routingType);
    }

    @Override
    public String toString() {
        return "ClientLoginBoardingArgs{" +
                 "username='" + username + '\'' +
 ", password='" + password + '\'' +
 ", routingType='" + routingType + '\'' +

                '}';
    }
}