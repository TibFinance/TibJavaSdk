
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


public class UpdateBoardingStatusResponse extends CustomAPIResponse {

    
    @JsonProperty("BoardingInformationId")
    private String boardingInformationId;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("StatusCode")
    private Integer statusCode;


    public UpdateBoardingStatusResponse(Error[] errors, boolean hasError, String messages, String boardingInformationId, String status, Integer statusCode) {
        super(errors, hasError, messages);
        this.boardingInformationId = boardingInformationId;
this.status = status;
this.statusCode = statusCode;

    }

    public UpdateBoardingStatusResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.boardingInformationId = apiResponse.getResponse().toString();
this.status = apiResponse.getResponse().toString();
this.statusCode = Integer.parseInt(apiResponse.getResponse().toString());

        }
    }

    
    public String getBoardingInformationId() {
        return boardingInformationId;
    }

    public void setBoardingInformationId(String boardingInformationId) {
        this.boardingInformationId = boardingInformationId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateBoardingStatusResponse that = (UpdateBoardingStatusResponse) o;
        return Objects.equals(boardingInformationId, that.boardingInformationId) && Objects.equals(status, that.status) && Objects.equals(statusCode, that.statusCode) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingInformationId, status, statusCode);
    }

    @Override
    public String toString() {
        return "UpdateBoardingStatusResponse{" +
                 "boardingInformationId='" + boardingInformationId + '\'' +
 ", status='" + status + '\'' +
 ", statusCode='" + statusCode + '\'' +

                '}';
    }
}