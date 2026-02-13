
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


public class AuthenticateUserFromPublic2Args  implements IBaseCryptedServiceArgs  {

    
    /**
 * Gets or sets the identifier of the public token required to initiate a drop‑in session.
 */
    @JsonProperty("PublicTokenId")
    private String publicTokenId;


    
    public AuthenticateUserFromPublic2Args() {
    }

    
    public AuthenticateUserFromPublic2Args(String publicTokenId) {
        this.publicTokenId = publicTokenId;

    }
    
    

    
    public String getPublicTokenId() {
        return publicTokenId;
    }

    public void setPublicTokenId(String publicTokenId) {
        this.publicTokenId = publicTokenId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuthenticateUserFromPublic2Args that = (AuthenticateUserFromPublic2Args) o;
        return Objects.equals(publicTokenId, that.publicTokenId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(publicTokenId);
    }

    @Override
    public String toString() {
        return "AuthenticateUserFromPublic2Args{" +
                 "publicTokenId='" + publicTokenId + '\'' +

                '}';
    }
}