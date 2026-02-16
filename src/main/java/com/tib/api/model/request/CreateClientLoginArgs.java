
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.ClientLogin;
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


public class CreateClientLoginArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * The 'Password' property is a critical component in user authentication, safeguarding individualized user data.
     */
    @JsonProperty("Password")
    private String password;

    /**
     * The user information to create
     */
    @JsonProperty("ClientLogin")
    private ClientLogin clientLogin;


    
    public CreateClientLoginArgs() {
    }

    
    public CreateClientLoginArgs(String password, ClientLogin clientLogin) {
        this.password = password;
        this.clientLogin = clientLogin;
    }
    
    
    public CreateClientLoginArgs(String adminSessionToken, String password, ClientLogin clientLogin) {
        super(adminSessionToken);
        this.password = password;
        this.clientLogin = clientLogin;
    }

    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ClientLogin getClientLogin() {
        return clientLogin;
    }

    public void setClientLogin(ClientLogin clientLogin) {
        this.clientLogin = clientLogin;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateClientLoginArgs that = (CreateClientLoginArgs) o;
        return Objects.equals(password, that.password) && Objects.equals(clientLogin, that.clientLogin) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(password, clientLogin);
    }

    @Override
    public String toString() {
        return "CreateClientLoginArgs{" +
                "password='" + password + '\'' +
                ", clientLogin='" + clientLogin + '\'' +

                '}';
    }
}