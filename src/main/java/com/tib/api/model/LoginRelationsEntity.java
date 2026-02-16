
package com.tib.api.model;

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


public class LoginRelationsEntity   {

    
    /**
     * Retrieves or assigns the identifier for user login relations.
     */
    @JsonProperty("LoginsUserRelationsId")
    private String loginsUserRelationsId;

    /**
     * Gets or sets the type of the internal reference.
     */
    @JsonProperty("InternalReferenceType")
    private Integer internalReferenceType;

    /**
     * The level of login related ID
     */
    @JsonProperty("InternalReferenceId")
    private String internalReferenceId;

    /**
     * Provides a detailed explanation of the function's purpose and usage within the API.
     */
    @JsonProperty("Description")
    private String description;

    /**
     * Gets or sets the IsReadOnly.
     */
    @JsonProperty("IsReadOnly")
    private boolean isReadOnly;


    
    public LoginRelationsEntity() {
    }

    
    public LoginRelationsEntity(String loginsUserRelationsId, Integer internalReferenceType, String internalReferenceId, String description, boolean isReadOnly) {
        this.loginsUserRelationsId = loginsUserRelationsId;
        this.internalReferenceType = internalReferenceType;
        this.internalReferenceId = internalReferenceId;
        this.description = description;
        this.isReadOnly = isReadOnly;
    }
    
    

    
    public String getLoginsUserRelationsId() {
        return loginsUserRelationsId;
    }

    public void setLoginsUserRelationsId(String loginsUserRelationsId) {
        this.loginsUserRelationsId = loginsUserRelationsId;
    }

    public Integer getInternalReferenceType() {
        return internalReferenceType;
    }

    public void setInternalReferenceType(Integer internalReferenceType) {
        this.internalReferenceType = internalReferenceType;
    }

    public String getInternalReferenceId() {
        return internalReferenceId;
    }

    public void setInternalReferenceId(String internalReferenceId) {
        this.internalReferenceId = internalReferenceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsReadOnly() {
        return isReadOnly;
    }

    public void setIsReadOnly(boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginRelationsEntity that = (LoginRelationsEntity) o;
        return Objects.equals(loginsUserRelationsId, that.loginsUserRelationsId) && Objects.equals(internalReferenceType, that.internalReferenceType) && Objects.equals(internalReferenceId, that.internalReferenceId) && Objects.equals(description, that.description) && Objects.equals(isReadOnly, that.isReadOnly) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(loginsUserRelationsId, internalReferenceType, internalReferenceId, description, isReadOnly);
    }

    @Override
    public String toString() {
        return "LoginRelationsEntity{" +
                "loginsUserRelationsId='" + loginsUserRelationsId + '\'' +
                ", internalReferenceType='" + internalReferenceType + '\'' +
                ", internalReferenceId='" + internalReferenceId + '\'' +
                ", description='" + description + '\'' +
                ", isReadOnly='" + isReadOnly + '\'' +

                '}';
    }
}