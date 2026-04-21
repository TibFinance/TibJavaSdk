
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.Service;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ListServicesResponse extends CustomAPIResponse {

    
    @JsonProperty("Services")
    private List<Service> services;

    @JsonProperty("SkipClientApprobation")
    private boolean skipClientApprobation;


    public ListServicesResponse() {
    }

    public ListServicesResponse(Error[] errors, boolean hasError, String messages, List<Service> services, boolean skipClientApprobation) {
        super(errors, hasError, messages);
        this.services = services;
        this.skipClientApprobation = skipClientApprobation;
    }

    public ListServicesResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String __rawBody = apiResponse.getRawBody();
            if (__rawBody != null && !__rawBody.isEmpty()) {
                ListServicesResponse __typed = objectMapper.readValue(__rawBody, ListServicesResponse.class);
                this.services = __typed.services;
                this.skipClientApprobation = __typed.skipClientApprobation;
            }
        }
    }

    
    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public boolean getSkipClientApprobation() {
        return skipClientApprobation;
    }

    public void setSkipClientApprobation(boolean skipClientApprobation) {
        this.skipClientApprobation = skipClientApprobation;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListServicesResponse that = (ListServicesResponse) o;
        return Objects.equals(services, that.services) && Objects.equals(skipClientApprobation, that.skipClientApprobation) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(services, skipClientApprobation);
    }

    @Override
    public String toString() {
        return "ListServicesResponse{" +
                "services='" + services + '\'' +
                ", skipClientApprobation='" + skipClientApprobation + '\'' +

                '}';
    }
}