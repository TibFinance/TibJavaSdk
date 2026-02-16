
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BoardingServiceMerchant   {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Represents the unique identifier for the boarding information of a merchant. This ID is crucial for tracking and referencing the boarding status within the system.
     */
    @JsonProperty("BoardingInformationId")
    private String boardingInformationId;

    /**
     * Represents the status of the merchant boarding process within the system. This status is crucial for tracking the progress and completion of merchant onboarding.
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