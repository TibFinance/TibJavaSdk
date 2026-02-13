
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


public class LoggedUserInformation  extends BaseLoggedSession  {

    
    /**
 * Gets or sets the internal reference identifier.
 */
    @JsonProperty("InternalReferenceId")
    private String internalReferenceId;

    /**
 * Gets or sets the login identifier.
 */
    @JsonProperty("LoginId")
    private String loginId;

    /**
 * Gets or sets the user client identifier.
 */
    @JsonProperty("UserClientId")
    private String userClientId;

    /**
 * The 'Username' property functions as a unique identifier for each user, facilitating personalized user interactions within the system.
 */
    @JsonProperty("Username")
    private String username;

    /**
 * Gets or sets the first name of the user.
 */
    @JsonProperty("UserFirstName")
    private String userFirstName;

    /**
 * Gets or sets the last name of the user.
 */
    @JsonProperty("UserLastName")
    private String userLastName;

    /**
 * Gets or sets a value indicating whether this instance is manager account.
 */
    @JsonProperty("IsManagerAccount")
    private boolean isManagerAccount;

    /**
 * Provides a detailed explanation of the function's purpose and usage within the API.
 */
    @JsonProperty("Description")
    private String description;

    /**
 * Use for Pay Collect Access
 */
    @JsonProperty("IsReadOnly")
    private boolean isReadOnly;


    
    public LoggedUserInformation() {
    }

    
    public LoggedUserInformation(String internalReferenceId, String loginId, String userClientId, String username, String userFirstName, String userLastName, boolean isManagerAccount, String description, boolean isReadOnly) {
        this.internalReferenceId = internalReferenceId;
this.loginId = loginId;
this.userClientId = userClientId;
this.username = username;
this.userFirstName = userFirstName;
this.userLastName = userLastName;
this.isManagerAccount = isManagerAccount;
this.description = description;
this.isReadOnly = isReadOnly;

    }
    
    
    public LoggedUserInformation(LocalDateTime lastActivityDate, LocalDateTime creationDate, String loginsUserRelationsId, LoginType permissionType, String internalReferenceId, String loginId, String userClientId, String username, String userFirstName, String userLastName, boolean isManagerAccount, String description, boolean isReadOnly) {
        super(lastActivityDate, creationDate, loginsUserRelationsId, permissionType);
        this.internalReferenceId = internalReferenceId;
this.loginId = loginId;
this.userClientId = userClientId;
this.username = username;
this.userFirstName = userFirstName;
this.userLastName = userLastName;
this.isManagerAccount = isManagerAccount;
this.description = description;
this.isReadOnly = isReadOnly;

    }

    
    public String getInternalReferenceId() {
        return internalReferenceId;
    }

    public void setInternalReferenceId(String internalReferenceId) {
        this.internalReferenceId = internalReferenceId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getUserClientId() {
        return userClientId;
    }

    public void setUserClientId(String userClientId) {
        this.userClientId = userClientId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public boolean getIsManagerAccount() {
        return isManagerAccount;
    }

    public void setIsManagerAccount(boolean isManagerAccount) {
        this.isManagerAccount = isManagerAccount;
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
        LoggedUserInformation that = (LoggedUserInformation) o;
        return Objects.equals(internalReferenceId, that.internalReferenceId) && Objects.equals(loginId, that.loginId) && Objects.equals(userClientId, that.userClientId) && Objects.equals(username, that.username) && Objects.equals(userFirstName, that.userFirstName) && Objects.equals(userLastName, that.userLastName) && Objects.equals(isManagerAccount, that.isManagerAccount) && Objects.equals(description, that.description) && Objects.equals(isReadOnly, that.isReadOnly) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(internalReferenceId, loginId, userClientId, username, userFirstName, userLastName, isManagerAccount, description, isReadOnly);
    }

    @Override
    public String toString() {
        return "LoggedUserInformation{" +
                 "internalReferenceId='" + internalReferenceId + '\'' +
 ", loginId='" + loginId + '\'' +
 ", userClientId='" + userClientId + '\'' +
 ", username='" + username + '\'' +
 ", userFirstName='" + userFirstName + '\'' +
 ", userLastName='" + userLastName + '\'' +
 ", isManagerAccount='" + isManagerAccount + '\'' +
 ", description='" + description + '\'' +
 ", isReadOnly='" + isReadOnly + '\'' +

                '}';
    }
}