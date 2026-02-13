
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


public class ChangeUserPasswordArgs  extends BaseAuthenticatePublicTokenArgs  {

    
    /**
 * The 'Password' property is a critical component in user authentication, safeguarding individualized user data.
 */
    @JsonProperty("Password")
    private String password;


    
    public ChangeUserPasswordArgs() {
    }

    
    public ChangeUserPasswordArgs(String password) {
        this.password = password;

    }
    
    
    public ChangeUserPasswordArgs(String publicTokenId, String password) {
        super(publicTokenId);
        this.password = password;

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
        ChangeUserPasswordArgs that = (ChangeUserPasswordArgs) o;
        return Objects.equals(password, that.password) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(password);
    }

    @Override
    public String toString() {
        return "ChangeUserPasswordArgs{" +
                 "password='" + password + '\'' +

                '}';
    }
}