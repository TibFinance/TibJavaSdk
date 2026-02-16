
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetSessionCookiesResponse extends CustomAPIResponse {

    
    @JsonProperty("ClientId")
    private String clientId;

    @JsonProperty("ServiceId")
    private String serviceId;

    @JsonProperty("SessionId")
    private String sessionId;

    @JsonProperty("LoginTypeId")
    private Integer loginTypeId;

    @JsonProperty("Username")
    private String username;

    @JsonProperty("Language")
    private String language;

    @JsonProperty("IsReadOnly")
    private boolean isReadOnly;

    @JsonProperty("InternalReferenceId")
    private String internalReferenceId;


    public GetSessionCookiesResponse(Error[] errors, boolean hasError, String messages, String clientId, String serviceId, String sessionId, Integer loginTypeId, String username, String language, boolean isReadOnly, String internalReferenceId) {
        super(errors, hasError, messages);
        this.clientId = clientId;
        this.serviceId = serviceId;
        this.sessionId = sessionId;
        this.loginTypeId = loginTypeId;
        this.username = username;
        this.language = language;
        this.isReadOnly = isReadOnly;
        this.internalReferenceId = internalReferenceId;
    }

    public GetSessionCookiesResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.clientId = apiResponse.getResponse().toString();
            this.serviceId = apiResponse.getResponse().toString();
            this.sessionId = apiResponse.getResponse().toString();
            this.loginTypeId = Integer.parseInt(apiResponse.getResponse().toString());
            this.username = apiResponse.getResponse().toString();
            this.language = apiResponse.getResponse().toString();
            this.isReadOnly = Boolean.parseBoolean(apiResponse.getResponse().toString());
            this.internalReferenceId = apiResponse.getResponse().toString();
        }
    }

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getLoginTypeId() {
        return loginTypeId;
    }

    public void setLoginTypeId(Integer loginTypeId) {
        this.loginTypeId = loginTypeId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean getIsReadOnly() {
        return isReadOnly;
    }

    public void setIsReadOnly(boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public String getInternalReferenceId() {
        return internalReferenceId;
    }

    public void setInternalReferenceId(String internalReferenceId) {
        this.internalReferenceId = internalReferenceId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSessionCookiesResponse that = (GetSessionCookiesResponse) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(serviceId, that.serviceId) && Objects.equals(sessionId, that.sessionId) && Objects.equals(loginTypeId, that.loginTypeId) && Objects.equals(username, that.username) && Objects.equals(language, that.language) && Objects.equals(isReadOnly, that.isReadOnly) && Objects.equals(internalReferenceId, that.internalReferenceId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, serviceId, sessionId, loginTypeId, username, language, isReadOnly, internalReferenceId);
    }

    @Override
    public String toString() {
        return "GetSessionCookiesResponse{" +
                "clientId='" + clientId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", loginTypeId='" + loginTypeId + '\'' +
                ", username='" + username + '\'' +
                ", language='" + language + '\'' +
                ", isReadOnly='" + isReadOnly + '\'' +
                ", internalReferenceId='" + internalReferenceId + '\'' +

                '}';
    }
}