
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


public class GetConvenientFeeSettingsByMerchantResponse extends CustomAPIResponse {

    
    @JsonProperty("ConvenientFeeSettings")
    private List<ConvenientFeeSettings> convenientFeeSettings;


    public GetConvenientFeeSettingsByMerchantResponse(Error[] errors, boolean hasError, String messages, List<ConvenientFeeSettings> convenientFeeSettings) {
        super(errors, hasError, messages);
        this.convenientFeeSettings = convenientFeeSettings;

    }

    public GetConvenientFeeSettingsByMerchantResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.convenientFeeSettings = (List<ConvenientFeeSettings>) apiResponse.getResponse();

        }
    }

    
    public List<ConvenientFeeSettings> getConvenientFeeSettings() {
        return convenientFeeSettings;
    }

    public void setConvenientFeeSettings(List<ConvenientFeeSettings> convenientFeeSettings) {
        this.convenientFeeSettings = convenientFeeSettings;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetConvenientFeeSettingsByMerchantResponse that = (GetConvenientFeeSettingsByMerchantResponse) o;
        return Objects.equals(convenientFeeSettings, that.convenientFeeSettings) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(convenientFeeSettings);
    }

    @Override
    public String toString() {
        return "GetConvenientFeeSettingsByMerchantResponse{" +
                 "convenientFeeSettings='" + convenientFeeSettings + '\'' +

                '}';
    }
}