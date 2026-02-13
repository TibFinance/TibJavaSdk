
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.AuthenticateUserArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class AuthenticateUserFromPublicArgs  extends AuthenticateUserArgs  {

    
    /**
 * 
 */
    @JsonProperty("IpAddress")
    private String ipAddress;


    
    public AuthenticateUserFromPublicArgs() {
    }

    
    public AuthenticateUserFromPublicArgs(String ipAddress) {
        this.ipAddress = ipAddress;

    }
    
    
    public AuthenticateUserFromPublicArgs(String clientId, String username, String password, String ipAddress) {
        super(clientId, username, password);
        this.ipAddress = ipAddress;

    }

    
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthenticateUserFromPublicArgs that = (AuthenticateUserFromPublicArgs) o;
        return Objects.equals(ipAddress, that.ipAddress) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(ipAddress);
    }

    @Override
    public String toString() {
        return "AuthenticateUserFromPublicArgs{" +
                 "ipAddress='" + ipAddress + '\'' +

                '}';
    }
}