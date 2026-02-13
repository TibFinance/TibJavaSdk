package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class BaseArgs implements IBaseCryptedServiceArgs {

    @JsonProperty("SessionToken")
    private String sessionToken;

    @JsonProperty("ServiceId")
    private String serviceId;

    public BaseArgs(String sessionToken, String serviceId) {
        this.sessionToken = sessionToken;
        this.serviceId = serviceId;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseArgs baseArgs = (BaseArgs) o;
        return Objects.equals(sessionToken, baseArgs.sessionToken) &&
                Objects.equals(serviceId, baseArgs.serviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionToken, serviceId);
    }

    @Override
    public String toString() {
        return "BaseArgs{" +
                "sessionToken='" + sessionToken + '\'' +
                ", serviceId='" + serviceId + '\'' +
                '}';
    }
}
