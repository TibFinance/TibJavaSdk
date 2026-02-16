
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class CreateClientLoginBoardingArgs  extends BaseAuthenticatePublicTokenArgs  {

    
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


    
    public CreateClientLoginBoardingArgs() {
    }

    
    public CreateClientLoginBoardingArgs(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    
    public CreateClientLoginBoardingArgs(String publicTokenId, String username, String password) {
        super(publicTokenId);
        this.username = username;
        this.password = password;
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
        CreateClientLoginBoardingArgs that = (CreateClientLoginBoardingArgs) o;
        return Objects.equals(username, that.username) && Objects.equals(password, that.password) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return "CreateClientLoginBoardingArgs{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +

                '}';
    }
}