
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.Service;
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


public class ListSubClientsResponse extends CustomAPIResponse {

    
    @JsonProperty("Services")
    private List<Service> services;


    public ListSubClientsResponse(Error[] errors, boolean hasError, String messages, List<Service> services) {
        super(errors, hasError, messages);
        this.services = services;

    }

    public ListSubClientsResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.services = (List<Service>) apiResponse.getResponse();

        }
    }

    
    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListSubClientsResponse that = (ListSubClientsResponse) o;
        return Objects.equals(services, that.services) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(services);
    }

    @Override
    public String toString() {
        return "ListSubClientsResponse{" +
                 "services='" + services + '\'' +

                '}';
    }
}