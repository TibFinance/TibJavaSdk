
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


public class ChangePasswordRequestArgs  extends BaseAuthenticatePublicTokenArgs  {

    
    /**
     * The 'Username' property functions as a unique identifier for each user, facilitating personalized user interactions within the system.
     */
    @JsonProperty("Username")
    private String username;

    /**
     * Gets and set the type of the routing.
     */
    @JsonProperty("RoutingType")
    private PublicAccessTokenRoutingType routingType;


    
    public ChangePasswordRequestArgs() {
    }

    
    public ChangePasswordRequestArgs(String username, PublicAccessTokenRoutingType routingType) {
        this.username = username;
        this.routingType = routingType;
    }
    
    
    public ChangePasswordRequestArgs(String publicTokenId, String username, PublicAccessTokenRoutingType routingType) {
        super(publicTokenId);
        this.username = username;
        this.routingType = routingType;
    }

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        ChangePasswordRequestArgs that = (ChangePasswordRequestArgs) o;
        return Objects.equals(username, that.username) && Objects.equals(routingType, that.routingType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(username, routingType);
    }

    @Override
    public String toString() {
        return "ChangePasswordRequestArgs{" +
                "username='" + username + '\'' +
                ", routingType='" + routingType + '\'' +

                '}';
    }
}