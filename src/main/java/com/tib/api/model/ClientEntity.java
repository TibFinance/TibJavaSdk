
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


public class ClientEntity   {

    
    /**
     * The name of the client
     */
    @JsonProperty("ClientName")
    private String clientName;


    
    public ClientEntity() {
    }

    
    public ClientEntity(String clientName) {
        this.clientName = clientName;
    }
    
    

    
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientEntity that = (ClientEntity) o;
        return Objects.equals(clientName, that.clientName) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientName);
    }

    @Override
    public String toString() {
        return "ClientEntity{" +
                "clientName='" + clientName + '\'' +

                '}';
    }
}