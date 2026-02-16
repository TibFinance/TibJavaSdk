
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.enums.BoardingStatus;
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


public class ProcessWebHookResponse extends CustomAPIResponse {

    
    @JsonProperty("BoardingInformationId")
    private String boardingInformationId;

    @JsonProperty("TransactionType")
    private String transactionType;

    @JsonProperty("BoardingStatus")
    private BoardingStatus boardingStatus;


    public ProcessWebHookResponse(Error[] errors, boolean hasError, String messages, String boardingInformationId, String transactionType, BoardingStatus boardingStatus) {
        super(errors, hasError, messages);
        this.boardingInformationId = boardingInformationId;
        this.transactionType = transactionType;
        this.boardingStatus = boardingStatus;
    }

    public ProcessWebHookResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.boardingStatus = objectMapper.readValue(json, BoardingStatus.class);
        }
    }

    
    public String getBoardingInformationId() {
        return boardingInformationId;
    }

    public void setBoardingInformationId(String boardingInformationId) {
        this.boardingInformationId = boardingInformationId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public BoardingStatus getBoardingStatus() {
        return boardingStatus;
    }

    public void setBoardingStatus(BoardingStatus boardingStatus) {
        this.boardingStatus = boardingStatus;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessWebHookResponse that = (ProcessWebHookResponse) o;
        return Objects.equals(boardingInformationId, that.boardingInformationId) && Objects.equals(transactionType, that.transactionType) && Objects.equals(boardingStatus, that.boardingStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingInformationId, transactionType, boardingStatus);
    }

    @Override
    public String toString() {
        return "ProcessWebHookResponse{" +
                "boardingInformationId='" + boardingInformationId + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", boardingStatus='" + boardingStatus + '\'' +

                '}';
    }
}