
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.GetBoardingMerchantStatusResultEntity;
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


public class GetBoardingMerchantStatusResponse extends CustomAPIResponse {

    
    @JsonProperty("GetBoardingStatusResultEntity")
    private GetBoardingMerchantStatusResultEntity getBoardingStatusResultEntity;


    public GetBoardingMerchantStatusResponse(Error[] errors, boolean hasError, String messages, GetBoardingMerchantStatusResultEntity getBoardingStatusResultEntity) {
        super(errors, hasError, messages);
        this.getBoardingStatusResultEntity = getBoardingStatusResultEntity;

    }

    public GetBoardingMerchantStatusResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.getBoardingStatusResultEntity = objectMapper.readValue(json, GetBoardingMerchantStatusResultEntity.class);

        }
    }

    
    public GetBoardingMerchantStatusResultEntity getGetBoardingStatusResultEntity() {
        return getBoardingStatusResultEntity;
    }

    public void setGetBoardingStatusResultEntity(GetBoardingMerchantStatusResultEntity getBoardingStatusResultEntity) {
        this.getBoardingStatusResultEntity = getBoardingStatusResultEntity;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBoardingMerchantStatusResponse that = (GetBoardingMerchantStatusResponse) o;
        return Objects.equals(getBoardingStatusResultEntity, that.getBoardingStatusResultEntity) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(getBoardingStatusResultEntity);
    }

    @Override
    public String toString() {
        return "GetBoardingMerchantStatusResponse{" +
                 "getBoardingStatusResultEntity='" + getBoardingStatusResultEntity + '\'' +

                '}';
    }
}