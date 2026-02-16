
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class UpdateBoardingStatusArgs  extends BaseAdminOnlyCryptedArgs  {

    
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


    
    public UpdateBoardingStatusArgs() {
    }

    
    public UpdateBoardingStatusArgs(String boardingInformationId, String boardingStatus) {
        this.boardingInformationId = boardingInformationId;
        this.boardingStatus = boardingStatus;
    }
    
    
    public UpdateBoardingStatusArgs(String adminSessionToken, String boardingInformationId, String boardingStatus) {
        super(adminSessionToken);
        this.boardingInformationId = boardingInformationId;
        this.boardingStatus = boardingStatus;
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
        UpdateBoardingStatusArgs that = (UpdateBoardingStatusArgs) o;
        return Objects.equals(boardingInformationId, that.boardingInformationId) && Objects.equals(boardingStatus, that.boardingStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingInformationId, boardingStatus);
    }

    @Override
    public String toString() {
        return "UpdateBoardingStatusArgs{" +
                "boardingInformationId='" + boardingInformationId + '\'' +
                ", boardingStatus='" + boardingStatus + '\'' +

                '}';
    }
}