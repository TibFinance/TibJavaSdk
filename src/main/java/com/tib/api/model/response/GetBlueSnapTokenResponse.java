
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.response.GetBlueSnapClientTokenResponse;
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


public class GetBlueSnapTokenResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("GetBlueSnapClientTokenResponse")
    private GetBlueSnapClientTokenResponse getBlueSnapClientTokenResponse;


    public GetBlueSnapTokenResponse(Error[] errors, boolean hasError, String messages, GetBlueSnapClientTokenResponse getBlueSnapClientTokenResponse) {
        super(errors, hasError, messages);
        this.getBlueSnapClientTokenResponse = getBlueSnapClientTokenResponse;

    }

    public GetBlueSnapTokenResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.getBlueSnapClientTokenResponse = objectMapper.readValue(json, GetBlueSnapClientTokenResponse.class);

        }
    }

    
    public GetBlueSnapClientTokenResponse getGetBlueSnapClientTokenResponse() {
        return getBlueSnapClientTokenResponse;
    }

    public void setGetBlueSnapClientTokenResponse(GetBlueSnapClientTokenResponse getBlueSnapClientTokenResponse) {
        this.getBlueSnapClientTokenResponse = getBlueSnapClientTokenResponse;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBlueSnapTokenResponse that = (GetBlueSnapTokenResponse) o;
        return Objects.equals(getBlueSnapClientTokenResponse, that.getBlueSnapClientTokenResponse) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(getBlueSnapClientTokenResponse);
    }

    @Override
    public String toString() {
        return "GetBlueSnapTokenResponse{" +
                 "getBlueSnapClientTokenResponse='" + getBlueSnapClientTokenResponse + '\'' +

                '}';
    }
}