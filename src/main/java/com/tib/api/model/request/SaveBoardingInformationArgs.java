
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BoardingInformation;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SaveBoardingInformationArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("IsDraft")
    private boolean isDraft;

    /**
     * 
     */
    @JsonProperty("BoardingInformation")
    private BoardingInformation boardingInformation;


    
    public SaveBoardingInformationArgs() {
    }

    
    public SaveBoardingInformationArgs(boolean isDraft, BoardingInformation boardingInformation) {
        this.isDraft = isDraft;
        this.boardingInformation = boardingInformation;
    }
    
    
    public SaveBoardingInformationArgs(String sessionToken, boolean isDraft, BoardingInformation boardingInformation) {
        super(sessionToken);
        this.isDraft = isDraft;
        this.boardingInformation = boardingInformation;
    }

    
    public boolean getIsDraft() {
        return isDraft;
    }

    public void setIsDraft(boolean isDraft) {
        this.isDraft = isDraft;
    }

    public BoardingInformation getBoardingInformation() {
        return boardingInformation;
    }

    public void setBoardingInformation(BoardingInformation boardingInformation) {
        this.boardingInformation = boardingInformation;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveBoardingInformationArgs that = (SaveBoardingInformationArgs) o;
        return Objects.equals(isDraft, that.isDraft) && Objects.equals(boardingInformation, that.boardingInformation) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(isDraft, boardingInformation);
    }

    @Override
    public String toString() {
        return "SaveBoardingInformationArgs{" +
                "isDraft='" + isDraft + '\'' +
                ", boardingInformation='" + boardingInformation + '\'' +

                '}';
    }
}