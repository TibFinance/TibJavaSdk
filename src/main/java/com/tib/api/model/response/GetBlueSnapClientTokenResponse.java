
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.GetBlueSnapClientTokenResultEntity;
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


public class GetBlueSnapClientTokenResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("GetBlueSnapClientTokenResultEntity")
    private GetBlueSnapClientTokenResultEntity getBlueSnapClientTokenResultEntity;


    public GetBlueSnapClientTokenResponse(Error[] errors, boolean hasError, String messages, GetBlueSnapClientTokenResultEntity getBlueSnapClientTokenResultEntity) {
        super(errors, hasError, messages);
        this.getBlueSnapClientTokenResultEntity = getBlueSnapClientTokenResultEntity;

    }

    public GetBlueSnapClientTokenResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.getBlueSnapClientTokenResultEntity = objectMapper.readValue(json, GetBlueSnapClientTokenResultEntity.class);

        }
    }

    
    public GetBlueSnapClientTokenResultEntity getGetBlueSnapClientTokenResultEntity() {
        return getBlueSnapClientTokenResultEntity;
    }

    public void setGetBlueSnapClientTokenResultEntity(GetBlueSnapClientTokenResultEntity getBlueSnapClientTokenResultEntity) {
        this.getBlueSnapClientTokenResultEntity = getBlueSnapClientTokenResultEntity;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBlueSnapClientTokenResponse that = (GetBlueSnapClientTokenResponse) o;
        return Objects.equals(getBlueSnapClientTokenResultEntity, that.getBlueSnapClientTokenResultEntity) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(getBlueSnapClientTokenResultEntity);
    }

    @Override
    public String toString() {
        return "GetBlueSnapClientTokenResponse{" +
                 "getBlueSnapClientTokenResultEntity='" + getBlueSnapClientTokenResultEntity + '\'' +

                '}';
    }
}