
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.SavePaymentMethodResultEntity;
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


public class SavePaymentMethodOnProviderResponse extends CustomAPIResponse {

    
    @JsonProperty("SavePaymentMethodResultEntity")
    private SavePaymentMethodResultEntity savePaymentMethodResultEntity;


    public SavePaymentMethodOnProviderResponse(Error[] errors, boolean hasError, String messages, SavePaymentMethodResultEntity savePaymentMethodResultEntity) {
        super(errors, hasError, messages);
        this.savePaymentMethodResultEntity = savePaymentMethodResultEntity;

    }

    public SavePaymentMethodOnProviderResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.savePaymentMethodResultEntity = objectMapper.readValue(json, SavePaymentMethodResultEntity.class);

        }
    }

    
    public SavePaymentMethodResultEntity getSavePaymentMethodResultEntity() {
        return savePaymentMethodResultEntity;
    }

    public void setSavePaymentMethodResultEntity(SavePaymentMethodResultEntity savePaymentMethodResultEntity) {
        this.savePaymentMethodResultEntity = savePaymentMethodResultEntity;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SavePaymentMethodOnProviderResponse that = (SavePaymentMethodOnProviderResponse) o;
        return Objects.equals(savePaymentMethodResultEntity, that.savePaymentMethodResultEntity) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(savePaymentMethodResultEntity);
    }

    @Override
    public String toString() {
        return "SavePaymentMethodOnProviderResponse{" +
                 "savePaymentMethodResultEntity='" + savePaymentMethodResultEntity + '\'' +

                '}';
    }
}