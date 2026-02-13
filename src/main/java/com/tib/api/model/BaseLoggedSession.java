
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.LoginType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BaseLoggedSession   {

    
    /**
 * Determine the last activity of this session
 */
    @JsonProperty("LastActivityDate")
    private LocalDateTime lastActivityDate;

    /**
 * Determine the date of the Session creation date
 */
    @JsonProperty("CreationDate")
    private LocalDateTime creationDate;

    /**
 * Retrieves or assigns the identifier for user login relations.
 */
    @JsonProperty("LoginsUserRelationsId")
    private String loginsUserRelationsId;

    /**
 * The permission Type, will defined the level of permission and will also define What is the reference to the InternalReferenceid If you set Merchant or Client, the internal referenceid should be a merchant or a client
 */
    @JsonProperty("PermissionType")
    private LoginType permissionType;


    
    public BaseLoggedSession() {
    }

    
    public BaseLoggedSession(LocalDateTime lastActivityDate, LocalDateTime creationDate, String loginsUserRelationsId, LoginType permissionType) {
        this.lastActivityDate = lastActivityDate;
this.creationDate = creationDate;
this.loginsUserRelationsId = loginsUserRelationsId;
this.permissionType = permissionType;

    }
    
    

    
    public LocalDateTime getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(LocalDateTime lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getLoginsUserRelationsId() {
        return loginsUserRelationsId;
    }

    public void setLoginsUserRelationsId(String loginsUserRelationsId) {
        this.loginsUserRelationsId = loginsUserRelationsId;
    }

    public LoginType getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(LoginType permissionType) {
        this.permissionType = permissionType;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseLoggedSession that = (BaseLoggedSession) o;
        return Objects.equals(lastActivityDate, that.lastActivityDate) && Objects.equals(creationDate, that.creationDate) && Objects.equals(loginsUserRelationsId, that.loginsUserRelationsId) && Objects.equals(permissionType, that.permissionType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(lastActivityDate, creationDate, loginsUserRelationsId, permissionType);
    }

    @Override
    public String toString() {
        return "BaseLoggedSession{" +
                 "lastActivityDate='" + lastActivityDate + '\'' +
 ", creationDate='" + creationDate + '\'' +
 ", loginsUserRelationsId='" + loginsUserRelationsId + '\'' +
 ", permissionType='" + permissionType + '\'' +

                '}';
    }
}