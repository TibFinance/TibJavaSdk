
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


public class LoginRelationArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("InternalReferenceId")
    private String internalReferenceId;

    /**
     * 
     */
    @JsonProperty("InternalReferenceType")
    private Integer internalReferenceType;

    /**
     * 
     */
    @JsonProperty("LoginId")
    private String loginId;

    /**
     * Provides a detailed explanation of the function's purpose and usage within the API.
     */
    @JsonProperty("Description")
    private String description;


    
    public LoginRelationArgs() {
    }

    
    public LoginRelationArgs(String internalReferenceId, Integer internalReferenceType, String loginId, String description) {
        this.internalReferenceId = internalReferenceId;
        this.internalReferenceType = internalReferenceType;
        this.loginId = loginId;
        this.description = description;
    }
    
    
    public LoginRelationArgs(String adminSessionToken, String internalReferenceId, Integer internalReferenceType, String loginId, String description) {
        super(adminSessionToken);
        this.internalReferenceId = internalReferenceId;
        this.internalReferenceType = internalReferenceType;
        this.loginId = loginId;
        this.description = description;
    }

    
    public String getInternalReferenceId() {
        return internalReferenceId;
    }

    public void setInternalReferenceId(String internalReferenceId) {
        this.internalReferenceId = internalReferenceId;
    }

    public Integer getInternalReferenceType() {
        return internalReferenceType;
    }

    public void setInternalReferenceType(Integer internalReferenceType) {
        this.internalReferenceType = internalReferenceType;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginRelationArgs that = (LoginRelationArgs) o;
        return Objects.equals(internalReferenceId, that.internalReferenceId) && Objects.equals(internalReferenceType, that.internalReferenceType) && Objects.equals(loginId, that.loginId) && Objects.equals(description, that.description) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(internalReferenceId, internalReferenceType, loginId, description);
    }

    @Override
    public String toString() {
        return "LoginRelationArgs{" +
                "internalReferenceId='" + internalReferenceId + '\'' +
                ", internalReferenceType='" + internalReferenceType + '\'' +
                ", loginId='" + loginId + '\'' +
                ", description='" + description + '\'' +

                '}';
    }
}