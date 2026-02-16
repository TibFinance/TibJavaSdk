
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.BoardingServiceMerchant;
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


public class GetServiceBoardingStatusResponse extends CustomAPIResponse {

    
    @JsonProperty("ServiceId")
    private String serviceId;

    @JsonProperty("BoardingServiceMerchants")
    private List<BoardingServiceMerchant> boardingServiceMerchants;


    public GetServiceBoardingStatusResponse(Error[] errors, boolean hasError, String messages, String serviceId, List<BoardingServiceMerchant> boardingServiceMerchants) {
        super(errors, hasError, messages);
        this.serviceId = serviceId;
        this.boardingServiceMerchants = boardingServiceMerchants;
    }

    public GetServiceBoardingStatusResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.serviceId = apiResponse.getResponse().toString();
            this.boardingServiceMerchants = (List<BoardingServiceMerchant>) apiResponse.getResponse();
        }
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public List<BoardingServiceMerchant> getBoardingServiceMerchants() {
        return boardingServiceMerchants;
    }

    public void setBoardingServiceMerchants(List<BoardingServiceMerchant> boardingServiceMerchants) {
        this.boardingServiceMerchants = boardingServiceMerchants;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetServiceBoardingStatusResponse that = (GetServiceBoardingStatusResponse) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(boardingServiceMerchants, that.boardingServiceMerchants) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, boardingServiceMerchants);
    }

    @Override
    public String toString() {
        return "GetServiceBoardingStatusResponse{" +
                "serviceId='" + serviceId + '\'' +
                ", boardingServiceMerchants='" + boardingServiceMerchants + '\'' +

                '}';
    }
}