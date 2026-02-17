
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.enums.TwoFactorStatus;
import com.tib.api.model.TwoFactorSetupData;
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


public class SaveMerchantResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("TwoFactorStatus")
    private TwoFactorStatus twoFactorStatus;

    @JsonProperty("TwoFactorMessage")
    private String twoFactorMessage;

    @JsonProperty("TwoFactorSetupData")
    private TwoFactorSetupData twoFactorSetupData;

    @JsonProperty("TwoFactorVerificationMerchantId")
    private String twoFactorVerificationMerchantId;

    @JsonProperty("TwoFactorVerificationMerchantName")
    private String twoFactorVerificationMerchantName;


    public SaveMerchantResponse(Error[] errors, boolean hasError, String messages, TwoFactorStatus twoFactorStatus, String twoFactorMessage, TwoFactorSetupData twoFactorSetupData, String twoFactorVerificationMerchantId, String twoFactorVerificationMerchantName) {
        super(errors, hasError, messages);
        this.twoFactorStatus = twoFactorStatus;
        this.twoFactorMessage = twoFactorMessage;
        this.twoFactorSetupData = twoFactorSetupData;
        this.twoFactorVerificationMerchantId = twoFactorVerificationMerchantId;
        this.twoFactorVerificationMerchantName = twoFactorVerificationMerchantName;
    }

    public SaveMerchantResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.twoFactorStatus = objectMapper.readValue(json, TwoFactorStatus.class);
            this.twoFactorSetupData = objectMapper.readValue(json, TwoFactorSetupData.class);
        }
    }

    
    public TwoFactorStatus getTwoFactorStatus() {
        return twoFactorStatus;
    }

    public void setTwoFactorStatus(TwoFactorStatus twoFactorStatus) {
        this.twoFactorStatus = twoFactorStatus;
    }

    public String getTwoFactorMessage() {
        return twoFactorMessage;
    }

    public void setTwoFactorMessage(String twoFactorMessage) {
        this.twoFactorMessage = twoFactorMessage;
    }

    public TwoFactorSetupData getTwoFactorSetupData() {
        return twoFactorSetupData;
    }

    public void setTwoFactorSetupData(TwoFactorSetupData twoFactorSetupData) {
        this.twoFactorSetupData = twoFactorSetupData;
    }

    public String getTwoFactorVerificationMerchantId() {
        return twoFactorVerificationMerchantId;
    }

    public void setTwoFactorVerificationMerchantId(String twoFactorVerificationMerchantId) {
        this.twoFactorVerificationMerchantId = twoFactorVerificationMerchantId;
    }

    public String getTwoFactorVerificationMerchantName() {
        return twoFactorVerificationMerchantName;
    }

    public void setTwoFactorVerificationMerchantName(String twoFactorVerificationMerchantName) {
        this.twoFactorVerificationMerchantName = twoFactorVerificationMerchantName;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveMerchantResponse that = (SaveMerchantResponse) o;
        return Objects.equals(twoFactorStatus, that.twoFactorStatus) && Objects.equals(twoFactorMessage, that.twoFactorMessage) && Objects.equals(twoFactorSetupData, that.twoFactorSetupData) && Objects.equals(twoFactorVerificationMerchantId, that.twoFactorVerificationMerchantId) && Objects.equals(twoFactorVerificationMerchantName, that.twoFactorVerificationMerchantName) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(twoFactorStatus, twoFactorMessage, twoFactorSetupData, twoFactorVerificationMerchantId, twoFactorVerificationMerchantName);
    }

    @Override
    public String toString() {
        return "SaveMerchantResponse{" +
                "twoFactorStatus='" + twoFactorStatus + '\'' +
                ", twoFactorMessage='" + twoFactorMessage + '\'' +
                ", twoFactorSetupData='" + twoFactorSetupData + '\'' +
                ", twoFactorVerificationMerchantId='" + twoFactorVerificationMerchantId + '\'' +
                ", twoFactorVerificationMerchantName='" + twoFactorVerificationMerchantName + '\'' +

                '}';
    }
}