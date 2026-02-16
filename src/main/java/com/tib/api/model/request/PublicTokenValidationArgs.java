
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


public class PublicTokenValidationArgs  extends BaseAuthenticatePublicTokenArgs  {

    
    /**
     * 
     */
    @JsonProperty("TokenType")
    private PublicAccessTokenRoutingType tokenType;


    
    public PublicTokenValidationArgs() {
    }

    
    public PublicTokenValidationArgs(PublicAccessTokenRoutingType tokenType) {
        this.tokenType = tokenType;
    }
    
    
    public PublicTokenValidationArgs(String publicTokenId, PublicAccessTokenRoutingType tokenType) {
        super(publicTokenId);
        this.tokenType = tokenType;
    }

    
    public PublicAccessTokenRoutingType getTokenType() {
        return tokenType;
    }

    public void setTokenType(PublicAccessTokenRoutingType tokenType) {
        this.tokenType = tokenType;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublicTokenValidationArgs that = (PublicTokenValidationArgs) o;
        return Objects.equals(tokenType, that.tokenType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(tokenType);
    }

    @Override
    public String toString() {
        return "PublicTokenValidationArgs{" +
                "tokenType='" + tokenType + '\'' +

                '}';
    }
}