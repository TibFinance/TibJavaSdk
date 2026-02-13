
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.ValidationLimitStatus;
import com.tib.api.model.enums.TibAuthorizationStatus;
import com.tib.api.model.enums.ClientAuthorizationStatus;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ValidationLimitsContainer   {

    
    /**
 * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
 */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
 * Gets or sets the limit status.
 */
    @JsonProperty("LimitStatus")
    private ValidationLimitStatus limitStatus;

    /**
 * Gets or sets the tib authorization.
 */
    @JsonProperty("TibAuthorization")
    private TibAuthorizationStatus tibAuthorization;

    /**
 * Gets or sets the client authorization.
 */
    @JsonProperty("ClientAuthorization")
    private ClientAuthorizationStatus clientAuthorization;

    /**
 * Gets or sets the tib messages.
 */
    @JsonProperty("TibMessages")
    private List<String> tibMessages;

    /**
 * Gets or sets the client messages.
 */
    @JsonProperty("ClientMessages")
    private List<String> clientMessages;


    
    public ValidationLimitsContainer() {
    }

    
    public ValidationLimitsContainer(String serviceId, ValidationLimitStatus limitStatus, TibAuthorizationStatus tibAuthorization, ClientAuthorizationStatus clientAuthorization, List<String> tibMessages, List<String> clientMessages) {
        this.serviceId = serviceId;
this.limitStatus = limitStatus;
this.tibAuthorization = tibAuthorization;
this.clientAuthorization = clientAuthorization;
this.tibMessages = tibMessages;
this.clientMessages = clientMessages;

    }
    
    

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public ValidationLimitStatus getLimitStatus() {
        return limitStatus;
    }

    public void setLimitStatus(ValidationLimitStatus limitStatus) {
        this.limitStatus = limitStatus;
    }

    public TibAuthorizationStatus getTibAuthorization() {
        return tibAuthorization;
    }

    public void setTibAuthorization(TibAuthorizationStatus tibAuthorization) {
        this.tibAuthorization = tibAuthorization;
    }

    public ClientAuthorizationStatus getClientAuthorization() {
        return clientAuthorization;
    }

    public void setClientAuthorization(ClientAuthorizationStatus clientAuthorization) {
        this.clientAuthorization = clientAuthorization;
    }

    public List<String> getTibMessages() {
        return tibMessages;
    }

    public void setTibMessages(List<String> tibMessages) {
        this.tibMessages = tibMessages;
    }

    public List<String> getClientMessages() {
        return clientMessages;
    }

    public void setClientMessages(List<String> clientMessages) {
        this.clientMessages = clientMessages;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationLimitsContainer that = (ValidationLimitsContainer) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(limitStatus, that.limitStatus) && Objects.equals(tibAuthorization, that.tibAuthorization) && Objects.equals(clientAuthorization, that.clientAuthorization) && Objects.equals(tibMessages, that.tibMessages) && Objects.equals(clientMessages, that.clientMessages) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, limitStatus, tibAuthorization, clientAuthorization, tibMessages, clientMessages);
    }

    @Override
    public String toString() {
        return "ValidationLimitsContainer{" +
                 "serviceId='" + serviceId + '\'' +
 ", limitStatus='" + limitStatus + '\'' +
 ", tibAuthorization='" + tibAuthorization + '\'' +
 ", clientAuthorization='" + clientAuthorization + '\'' +
 ", tibMessages='" + tibMessages + '\'' +
 ", clientMessages='" + clientMessages + '\'' +

                '}';
    }
}