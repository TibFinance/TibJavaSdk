
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.ConvenientFeeSettings;
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


public class AddOrUpdateConvenientFeeSettingsForMerchantResponse extends CustomAPIResponse {

    
    @JsonProperty("ConvenientFeeSettings")
    private ConvenientFeeSettings convenientFeeSettings;


    public AddOrUpdateConvenientFeeSettingsForMerchantResponse(Error[] errors, boolean hasError, String messages, ConvenientFeeSettings convenientFeeSettings) {
        super(errors, hasError, messages);
        this.convenientFeeSettings = convenientFeeSettings;

    }

    public AddOrUpdateConvenientFeeSettingsForMerchantResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.convenientFeeSettings = objectMapper.readValue(json, ConvenientFeeSettings.class);

        }
    }

    
    public ConvenientFeeSettings getConvenientFeeSettings() {
        return convenientFeeSettings;
    }

    public void setConvenientFeeSettings(ConvenientFeeSettings convenientFeeSettings) {
        this.convenientFeeSettings = convenientFeeSettings;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddOrUpdateConvenientFeeSettingsForMerchantResponse that = (AddOrUpdateConvenientFeeSettingsForMerchantResponse) o;
        return Objects.equals(convenientFeeSettings, that.convenientFeeSettings) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(convenientFeeSettings);
    }

    @Override
    public String toString() {
        return "AddOrUpdateConvenientFeeSettingsForMerchantResponse{" +
                 "convenientFeeSettings='" + convenientFeeSettings + '\'' +

                '}';
    }
}