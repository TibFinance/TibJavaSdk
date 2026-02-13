
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


public class Client  extends ClientEntity  {

    
    /**
 * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
 */
    @JsonProperty("ClientId")
    private String clientId;

    /**
 * Retrieves or assigns the unique identifier for WhiteLabeling.
 */
    @JsonProperty("WhiteLabelingId")
    private Optional<String> whiteLabelingId;


    
    public Client() {
    }

    
    public Client(String clientId, Optional<String> whiteLabelingId) {
        this.clientId = clientId;
this.whiteLabelingId = whiteLabelingId;

    }
    
    
    public Client(String clientName, String clientId, Optional<String> whiteLabelingId) {
        super(clientName);
        this.clientId = clientId;
this.whiteLabelingId = whiteLabelingId;

    }

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Optional<String> getWhiteLabelingId() {
        return whiteLabelingId;
    }

    public void setWhiteLabelingId(Optional<String> whiteLabelingId) {
        this.whiteLabelingId = whiteLabelingId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client that = (Client) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(whiteLabelingId, that.whiteLabelingId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, whiteLabelingId);
    }

    @Override
    public String toString() {
        return "Client{" +
                 "clientId='" + clientId + '\'' +
 ", whiteLabelingId='" + whiteLabelingId + '\'' +

                '}';
    }
}