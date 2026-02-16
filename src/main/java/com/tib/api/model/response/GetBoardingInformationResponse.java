
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.BoardingInformation;
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


public class GetBoardingInformationResponse extends CustomAPIResponse {

    
    @JsonProperty("BoardingInfo")
    private BoardingInformation boardingInfo;


    public GetBoardingInformationResponse(Error[] errors, boolean hasError, String messages, BoardingInformation boardingInfo) {
        super(errors, hasError, messages);
        this.boardingInfo = boardingInfo;
    }

    public GetBoardingInformationResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.boardingInfo = objectMapper.readValue(json, BoardingInformation.class);
        }
    }

    
    public BoardingInformation getBoardingInfo() {
        return boardingInfo;
    }

    public void setBoardingInfo(BoardingInformation boardingInfo) {
        this.boardingInfo = boardingInfo;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBoardingInformationResponse that = (GetBoardingInformationResponse) o;
        return Objects.equals(boardingInfo, that.boardingInfo) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingInfo);
    }

    @Override
    public String toString() {
        return "GetBoardingInformationResponse{" +
                "boardingInfo='" + boardingInfo + '\'' +

                '}';
    }
}