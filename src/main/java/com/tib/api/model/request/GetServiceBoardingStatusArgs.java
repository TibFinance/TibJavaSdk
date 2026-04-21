
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetServiceBoardingStatusArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Identifier of the boarding service whose status is being retrieved.
     */
    @JsonProperty("BoardingServiceId")
    private String boardingServiceId;


    
    public GetServiceBoardingStatusArgs() {
    }

    
    public GetServiceBoardingStatusArgs(String boardingServiceId) {
        this.boardingServiceId = boardingServiceId;
    }
    
    
    public GetServiceBoardingStatusArgs(String sessionToken, String boardingServiceId) {
        super(sessionToken);
        this.boardingServiceId = boardingServiceId;
    }

    
    public String getBoardingServiceId() {
        return boardingServiceId;
    }

    public void setBoardingServiceId(String boardingServiceId) {
        this.boardingServiceId = boardingServiceId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetServiceBoardingStatusArgs that = (GetServiceBoardingStatusArgs) o;
        return Objects.equals(boardingServiceId, that.boardingServiceId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingServiceId);
    }

    @Override
    public String toString() {
        return "GetServiceBoardingStatusArgs{" +
                "boardingServiceId='" + boardingServiceId + '\'' +

                '}';
    }
}