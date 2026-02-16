
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


public class BoardingEventPayload  extends BaseEventPayload  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
     */
    @JsonProperty("ClientId")
    private String clientId;

    /**
     * Represents the status of the merchant boarding process within the system. This status is crucial for tracking the progress and completion of merchant onboarding.
     */
    @JsonProperty("BoardingStatus")
    private String boardingStatus;


    
    public BoardingEventPayload() {
    }

    
    public BoardingEventPayload(String merchantId, String serviceId, String clientId, String boardingStatus) {
        this.merchantId = merchantId;
        this.serviceId = serviceId;
        this.clientId = clientId;
        this.boardingStatus = boardingStatus;
    }
    
    
    public BoardingEventPayload(String eventName, String merchantId, String serviceId, String clientId, String boardingStatus) {
        super(eventName);
        this.merchantId = merchantId;
        this.serviceId = serviceId;
        this.clientId = clientId;
        this.boardingStatus = boardingStatus;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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
        BoardingEventPayload that = (BoardingEventPayload) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(serviceId, that.serviceId) && Objects.equals(clientId, that.clientId) && Objects.equals(boardingStatus, that.boardingStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, serviceId, clientId, boardingStatus);
    }

    @Override
    public String toString() {
        return "BoardingEventPayload{" +
                "merchantId='" + merchantId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", clientId='" + clientId + '\'' +
                ", boardingStatus='" + boardingStatus + '\'' +

                '}';
    }
}