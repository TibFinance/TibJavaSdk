
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.Client;
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


public class ListClientsResponse extends CustomAPIResponse {

    
    @JsonProperty("Clients")
    private List<Client> clients;


    public ListClientsResponse(Error[] errors, boolean hasError, String messages, List<Client> clients) {
        super(errors, hasError, messages);
        this.clients = clients;
    }

    public ListClientsResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.clients = (List<Client>) apiResponse.getResponse();
        }
    }

    
    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListClientsResponse that = (ListClientsResponse) o;
        return Objects.equals(clients, that.clients) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clients);
    }

    @Override
    public String toString() {
        return "ListClientsResponse{" +
                "clients='" + clients + '\'' +

                '}';
    }
}