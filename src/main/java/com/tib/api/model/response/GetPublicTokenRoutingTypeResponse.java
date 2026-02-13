
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.enums.PublicAccessTokenRoutingType;
import com.tib.api.model.WhiteLabeling;
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


public class GetPublicTokenRoutingTypeResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("RoutingType")
    private PublicAccessTokenRoutingType routingType;

    @JsonProperty("WhiteLabeling")
    private WhiteLabeling whiteLabeling;


    public GetPublicTokenRoutingTypeResponse(Error[] errors, boolean hasError, String messages, PublicAccessTokenRoutingType routingType, WhiteLabeling whiteLabeling) {
        super(errors, hasError, messages);
        this.routingType = routingType;
this.whiteLabeling = whiteLabeling;

    }

    public GetPublicTokenRoutingTypeResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.routingType = objectMapper.readValue(json, PublicAccessTokenRoutingType.class);
this.whiteLabeling = objectMapper.readValue(json, WhiteLabeling.class);

        }
    }

    
    public PublicAccessTokenRoutingType getRoutingType() {
        return routingType;
    }

    public void setRoutingType(PublicAccessTokenRoutingType routingType) {
        this.routingType = routingType;
    }

    public WhiteLabeling getWhiteLabeling() {
        return whiteLabeling;
    }

    public void setWhiteLabeling(WhiteLabeling whiteLabeling) {
        this.whiteLabeling = whiteLabeling;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetPublicTokenRoutingTypeResponse that = (GetPublicTokenRoutingTypeResponse) o;
        return Objects.equals(routingType, that.routingType) && Objects.equals(whiteLabeling, that.whiteLabeling) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(routingType, whiteLabeling);
    }

    @Override
    public String toString() {
        return "GetPublicTokenRoutingTypeResponse{" +
                 "routingType='" + routingType + '\'' +
 ", whiteLabeling='" + whiteLabeling + '\'' +

                '}';
    }
}