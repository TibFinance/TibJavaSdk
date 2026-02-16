
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


public class GetUsersbyClientArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
     */
    @JsonProperty("ClientId")
    private String clientId;

    /**
     * 
     */
    @JsonProperty("LoginId")
    private String loginId;


    
    public GetUsersbyClientArgs() {
    }

    
    public GetUsersbyClientArgs(String clientId, String loginId) {
        this.clientId = clientId;
        this.loginId = loginId;
    }
    
    
    public GetUsersbyClientArgs(String adminSessionToken, String clientId, String loginId) {
        super(adminSessionToken);
        this.clientId = clientId;
        this.loginId = loginId;
    }

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetUsersbyClientArgs that = (GetUsersbyClientArgs) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(loginId, that.loginId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, loginId);
    }

    @Override
    public String toString() {
        return "GetUsersbyClientArgs{" +
                "clientId='" + clientId + '\'' +
                ", loginId='" + loginId + '\'' +

                '}';
    }
}