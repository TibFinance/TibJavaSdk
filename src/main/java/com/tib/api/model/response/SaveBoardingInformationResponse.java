
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


public class SaveBoardingInformationResponse extends CustomAPIResponse {

    
    @JsonProperty("BoardingInformationId")
    private String boardingInformationId;

    @JsonProperty("MerchantId")
    private String merchantId;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("BoardingStatus")
    private Integer boardingStatus;


    public SaveBoardingInformationResponse(Error[] errors, boolean hasError, String messages, String boardingInformationId, String merchantId, String message, Integer boardingStatus) {
        super(errors, hasError, messages);
        this.boardingInformationId = boardingInformationId;
        this.merchantId = merchantId;
        this.message = message;
        this.boardingStatus = boardingStatus;
    }

    public SaveBoardingInformationResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.boardingInformationId = apiResponse.getResponse().toString();
            this.merchantId = apiResponse.getResponse().toString();
            this.message = apiResponse.getResponse().toString();
            this.boardingStatus = Integer.parseInt(apiResponse.getResponse().toString());
        }
    }

    
    public String getBoardingInformationId() {
        return boardingInformationId;
    }

    public void setBoardingInformationId(String boardingInformationId) {
        this.boardingInformationId = boardingInformationId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getBoardingStatus() {
        return boardingStatus;
    }

    public void setBoardingStatus(Integer boardingStatus) {
        this.boardingStatus = boardingStatus;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveBoardingInformationResponse that = (SaveBoardingInformationResponse) o;
        return Objects.equals(boardingInformationId, that.boardingInformationId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(message, that.message) && Objects.equals(boardingStatus, that.boardingStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingInformationId, merchantId, message, boardingStatus);
    }

    @Override
    public String toString() {
        return "SaveBoardingInformationResponse{" +
                "boardingInformationId='" + boardingInformationId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", message='" + message + '\'' +
                ", boardingStatus='" + boardingStatus + '\'' +

                '}';
    }
}