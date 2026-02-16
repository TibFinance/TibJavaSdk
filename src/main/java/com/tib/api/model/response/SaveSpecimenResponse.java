
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
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


public class SaveSpecimenResponse extends CustomAPIResponse {

    
    @JsonProperty("ClientId")
    private String clientId;

    @JsonProperty("MerchantId")
    private String merchantId;


    public SaveSpecimenResponse(Error[] errors, boolean hasError, String messages, String clientId, String merchantId) {
        super(errors, hasError, messages);
        this.clientId = clientId;
        this.merchantId = merchantId;
    }

    public SaveSpecimenResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.clientId = apiResponse.getResponse().toString();
            this.merchantId = apiResponse.getResponse().toString();
        }
    }

    
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveSpecimenResponse that = (SaveSpecimenResponse) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, merchantId);
    }

    @Override
    public String toString() {
        return "SaveSpecimenResponse{" +
                "clientId='" + clientId + '\'' +
                ", merchantId='" + merchantId + '\'' +

                '}';
    }
}