
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.ClientWithRequestCount;
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


public class ListClientsWithRequestCountResponse extends CustomAPIResponse {

    
    @JsonProperty("Clients")
    private List<ClientWithRequestCount> clients;


    public ListClientsWithRequestCountResponse(Error[] errors, boolean hasError, String messages, List<ClientWithRequestCount> clients) {
        super(errors, hasError, messages);
        this.clients = clients;
    }

    public ListClientsWithRequestCountResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.clients = (List<ClientWithRequestCount>) apiResponse.getResponse();
        }
    }

    
    public List<ClientWithRequestCount> getClients() {
        return clients;
    }

    public void setClients(List<ClientWithRequestCount> clients) {
        this.clients = clients;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListClientsWithRequestCountResponse that = (ListClientsWithRequestCountResponse) o;
        return Objects.equals(clients, that.clients) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clients);
    }

    @Override
    public String toString() {
        return "ListClientsWithRequestCountResponse{" +
                "clients='" + clients + '\'' +

                '}';
    }
}