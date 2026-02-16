
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


public class ClientLogin   {

    
    /**
     * The identity of the login
     */
    @JsonProperty("ClientLoginId")
    private String clientLoginId;

    /**
     * The 'Username' property functions as a unique identifier for each user, facilitating personalized user interactions within the system.
     */
    @JsonProperty("Username")
    private String username;

    /**
     * The user first name
     */
    @JsonProperty("Firstname")
    private String firstname;

    /**
     * The user last name
     */
    @JsonProperty("Lastname")
    private String lastname;

    /**
     * Specifies the email address associated with the merchant.
     */
    @JsonProperty("Email")
    private String email;

    /**
     * LoginType
     */
    @JsonProperty("LoginType")
    private Integer loginType;

    /**
     * LoginType
     */
    @JsonProperty("ReferenceType")
    private String referenceType;

    /**
     * LoginType
     */
    @JsonProperty("Reference")
    private String reference;

    /**
     * InternalRefernceId
     */
    @JsonProperty("InternalRefernceIds")
    private String internalRefernceIds;

    /**
     * InternalRefernceId
     */
    @JsonProperty("LoginRelationId")
    private String loginRelationId;


    
    public ClientLogin() {
    }

    
    public ClientLogin(String clientLoginId, String username, String firstname, String lastname, String email, Integer loginType, String referenceType, String reference, String internalRefernceIds, String loginRelationId) {
        this.clientLoginId = clientLoginId;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.loginType = loginType;
        this.referenceType = referenceType;
        this.reference = reference;
        this.internalRefernceIds = internalRefernceIds;
        this.loginRelationId = loginRelationId;
    }
    
    

    
    public String getClientLoginId() {
        return clientLoginId;
    }

    public void setClientLoginId(String clientLoginId) {
        this.clientLoginId = clientLoginId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getInternalRefernceIds() {
        return internalRefernceIds;
    }

    public void setInternalRefernceIds(String internalRefernceIds) {
        this.internalRefernceIds = internalRefernceIds;
    }

    public String getLoginRelationId() {
        return loginRelationId;
    }

    public void setLoginRelationId(String loginRelationId) {
        this.loginRelationId = loginRelationId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientLogin that = (ClientLogin) o;
        return Objects.equals(clientLoginId, that.clientLoginId) && Objects.equals(username, that.username) && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(email, that.email) && Objects.equals(loginType, that.loginType) && Objects.equals(referenceType, that.referenceType) && Objects.equals(reference, that.reference) && Objects.equals(internalRefernceIds, that.internalRefernceIds) && Objects.equals(loginRelationId, that.loginRelationId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientLoginId, username, firstname, lastname, email, loginType, referenceType, reference, internalRefernceIds, loginRelationId);
    }

    @Override
    public String toString() {
        return "ClientLogin{" +
                "clientLoginId='" + clientLoginId + '\'' +
                ", username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", loginType='" + loginType + '\'' +
                ", referenceType='" + referenceType + '\'' +
                ", reference='" + reference + '\'' +
                ", internalRefernceIds='" + internalRefernceIds + '\'' +
                ", loginRelationId='" + loginRelationId + '\'' +

                '}';
    }
}