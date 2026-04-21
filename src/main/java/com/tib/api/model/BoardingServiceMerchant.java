
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BoardingServiceMerchant   {

    
    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Identifier of the boarding information linked to the merchant
     */
    @JsonProperty("BoardingInformationId")
    private String boardingInformationId;

    /**
     * Indicates the current onboarding state of the merchant identified by the external ID
     */
    @JsonProperty("BoardingStatus")
    private String boardingStatus;


    
    public BoardingServiceMerchant() {
    }

    
    public BoardingServiceMerchant(String merchantId, String boardingInformationId, String boardingStatus) {
        this.merchantId = merchantId;
        this.boardingInformationId = boardingInformationId;
        this.boardingStatus = boardingStatus;
    }
    
    

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getBoardingInformationId() {
        return boardingInformationId;
    }

    public void setBoardingInformationId(String boardingInformationId) {
        this.boardingInformationId = boardingInformationId;
    }

    public String getBoardingStatus() {
        return boardingStatus;
    }

    public void setBoardingStatus(String boardingStatus) {
        this.boardingStatus = boardingStatus;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingServiceMerchant that = (BoardingServiceMerchant) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(boardingInformationId, that.boardingInformationId) && Objects.equals(boardingStatus, that.boardingStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, boardingInformationId, boardingStatus);
    }

    @Override
    public String toString() {
        return "BoardingServiceMerchant{" +
                "merchantId='" + merchantId + '\'' +
                ", boardingInformationId='" + boardingInformationId + '\'' +
                ", boardingStatus='" + boardingStatus + '\'' +

                '}';
    }
}