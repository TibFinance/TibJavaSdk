
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.BoardingResultEntity;
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


public class BoardingResponse extends CustomAPIResponse {

    
    @JsonProperty("BoardingResultEntity")
    private BoardingResultEntity boardingResultEntity;


    public BoardingResponse(Error[] errors, boolean hasError, String messages, BoardingResultEntity boardingResultEntity) {
        super(errors, hasError, messages);
        this.boardingResultEntity = boardingResultEntity;

    }

    public BoardingResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.boardingResultEntity = objectMapper.readValue(json, BoardingResultEntity.class);

        }
    }

    
    public BoardingResultEntity getBoardingResultEntity() {
        return boardingResultEntity;
    }

    public void setBoardingResultEntity(BoardingResultEntity boardingResultEntity) {
        this.boardingResultEntity = boardingResultEntity;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingResponse that = (BoardingResponse) o;
        return Objects.equals(boardingResultEntity, that.boardingResultEntity) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingResultEntity);
    }

    @Override
    public String toString() {
        return "BoardingResponse{" +
                 "boardingResultEntity='" + boardingResultEntity + '\'' +

                '}';
    }
}