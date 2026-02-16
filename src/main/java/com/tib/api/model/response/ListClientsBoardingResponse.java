
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.ClientBoarding;
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


public class ListClientsBoardingResponse extends CustomAPIResponse {

    
    @JsonProperty("Clients")
    private List<ClientBoarding> clients;


    public ListClientsBoardingResponse(Error[] errors, boolean hasError, String messages, List<ClientBoarding> clients) {
        super(errors, hasError, messages);
        this.clients = clients;
    }

    public ListClientsBoardingResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.clients = (List<ClientBoarding>) apiResponse.getResponse();
        }
    }

    
    public List<ClientBoarding> getClients() {
        return clients;
    }

    public void setClients(List<ClientBoarding> clients) {
        this.clients = clients;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListClientsBoardingResponse that = (ListClientsBoardingResponse) o;
        return Objects.equals(clients, that.clients) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clients);
    }

    @Override
    public String toString() {
        return "ListClientsBoardingResponse{" +
                "clients='" + clients + '\'' +

                '}';
    }
}