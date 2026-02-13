
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.CredentialType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CredentialValueType   {

    
    /**
 * 
 */
    @JsonProperty("CredentialType")
    private CredentialType credentialType;

    /**
 * 
 */
    @JsonProperty("CredentialValue")
    private String credentialValue;


    
    public CredentialValueType() {
    }

    
    public CredentialValueType(CredentialType credentialType, String credentialValue) {
        this.credentialType = credentialType;
this.credentialValue = credentialValue;

    }
    
    

    
    public CredentialType getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(CredentialType credentialType) {
        this.credentialType = credentialType;
    }

    public String getCredentialValue() {
        return credentialValue;
    }

    public void setCredentialValue(String credentialValue) {
        this.credentialValue = credentialValue;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CredentialValueType that = (CredentialValueType) o;
        return Objects.equals(credentialType, that.credentialType) && Objects.equals(credentialValue, that.credentialValue) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(credentialType, credentialValue);
    }

    @Override
    public String toString() {
        return "CredentialValueType{" +
                 "credentialType='" + credentialType + '\'' +
 ", credentialValue='" + credentialValue + '\'' +

                '}';
    }
}