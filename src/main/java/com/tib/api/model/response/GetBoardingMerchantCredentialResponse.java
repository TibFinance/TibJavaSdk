
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.GetBoardingMerchantCredentialResultEntity;
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


public class GetBoardingMerchantCredentialResponse extends CustomAPIResponse {

    
    @JsonProperty("GetBoardingMerchantCredentialResultEntity")
    private GetBoardingMerchantCredentialResultEntity getBoardingMerchantCredentialResultEntity;


    public GetBoardingMerchantCredentialResponse(Error[] errors, boolean hasError, String messages, GetBoardingMerchantCredentialResultEntity getBoardingMerchantCredentialResultEntity) {
        super(errors, hasError, messages);
        this.getBoardingMerchantCredentialResultEntity = getBoardingMerchantCredentialResultEntity;
    }

    public GetBoardingMerchantCredentialResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.getBoardingMerchantCredentialResultEntity = objectMapper.readValue(json, GetBoardingMerchantCredentialResultEntity.class);
        }
    }

    
    public GetBoardingMerchantCredentialResultEntity getGetBoardingMerchantCredentialResultEntity() {
        return getBoardingMerchantCredentialResultEntity;
    }

    public void setGetBoardingMerchantCredentialResultEntity(GetBoardingMerchantCredentialResultEntity getBoardingMerchantCredentialResultEntity) {
        this.getBoardingMerchantCredentialResultEntity = getBoardingMerchantCredentialResultEntity;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBoardingMerchantCredentialResponse that = (GetBoardingMerchantCredentialResponse) o;
        return Objects.equals(getBoardingMerchantCredentialResultEntity, that.getBoardingMerchantCredentialResultEntity) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(getBoardingMerchantCredentialResultEntity);
    }

    @Override
    public String toString() {
        return "GetBoardingMerchantCredentialResponse{" +
                "getBoardingMerchantCredentialResultEntity='" + getBoardingMerchantCredentialResultEntity + '\'' +

                '}';
    }
}