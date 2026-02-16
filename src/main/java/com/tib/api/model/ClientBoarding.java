
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


public class ClientBoarding   {

    
    /**
     * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
     */
    @JsonProperty("ClientId")
    private String clientId;

    /**
     * 
     */
    @JsonProperty("ClientName")
    private String clientName;

    /**
     * 
     */
    @JsonProperty("ClientEmail")
    private String clientEmail;

    /**
     * 
     */
    @JsonProperty("ClientPhone")
    private String clientPhone;


    
    public ClientBoarding() {
    }

    
    public ClientBoarding(String clientId, String clientName, String clientEmail, String clientPhone) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.clientPhone = clientPhone;
    }
    
    

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientBoarding that = (ClientBoarding) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(clientName, that.clientName) && Objects.equals(clientEmail, that.clientEmail) && Objects.equals(clientPhone, that.clientPhone) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, clientName, clientEmail, clientPhone);
    }

    @Override
    public String toString() {
        return "ClientBoarding{" +
                "clientId='" + clientId + '\'' +
                ", clientName='" + clientName + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", clientPhone='" + clientPhone + '\'' +

                '}';
    }
}