
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


public class RelaunchBoardingSubmitArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("BoardingInfoId")
    private String boardingInfoId;


    
    public RelaunchBoardingSubmitArgs() {
    }

    
    public RelaunchBoardingSubmitArgs(String boardingInfoId) {
        this.boardingInfoId = boardingInfoId;

    }
    
    
    public RelaunchBoardingSubmitArgs(String adminSessionToken, String boardingInfoId) {
        super(adminSessionToken);
        this.boardingInfoId = boardingInfoId;

    }

    
    public String getBoardingInfoId() {
        return boardingInfoId;
    }

    public void setBoardingInfoId(String boardingInfoId) {
        this.boardingInfoId = boardingInfoId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelaunchBoardingSubmitArgs that = (RelaunchBoardingSubmitArgs) o;
        return Objects.equals(boardingInfoId, that.boardingInfoId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingInfoId);
    }

    @Override
    public String toString() {
        return "RelaunchBoardingSubmitArgs{" +
                 "boardingInfoId='" + boardingInfoId + '\'' +

                '}';
    }
}