
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateSubClientResponse extends CustomAPIResponse {

    
    @JsonProperty("ServiceId")
    private String serviceId;

    @JsonProperty("BoardingRedirectUrl")
    private String boardingRedirectUrl;


    public CreateSubClientResponse() {
    }

    public CreateSubClientResponse(Error[] errors, boolean hasError, String messages, String serviceId, String boardingRedirectUrl) {
        super(errors, hasError, messages);
        this.serviceId = serviceId;
        this.boardingRedirectUrl = boardingRedirectUrl;
    }

    public CreateSubClientResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String __rawBody = apiResponse.getRawBody();
            if (__rawBody != null && !__rawBody.isEmpty()) {
                CreateSubClientResponse __typed = objectMapper.readValue(__rawBody, CreateSubClientResponse.class);
                this.serviceId = __typed.serviceId;
                this.boardingRedirectUrl = __typed.boardingRedirectUrl;
            }
        }
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getBoardingRedirectUrl() {
        return boardingRedirectUrl;
    }

    public void setBoardingRedirectUrl(String boardingRedirectUrl) {
        this.boardingRedirectUrl = boardingRedirectUrl;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateSubClientResponse that = (CreateSubClientResponse) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(boardingRedirectUrl, that.boardingRedirectUrl) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, boardingRedirectUrl);
    }

    @Override
    public String toString() {
        return "CreateSubClientResponse{" +
                "serviceId='" + serviceId + '\'' +
                ", boardingRedirectUrl='" + boardingRedirectUrl + '\'' +

                '}';
    }
}