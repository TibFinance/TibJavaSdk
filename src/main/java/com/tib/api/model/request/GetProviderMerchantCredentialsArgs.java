
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class GetProviderMerchantCredentialsArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Represents the unique identifier for the boarding information of a merchant. This ID is crucial for tracking and referencing the boarding status within the system.
 */
    @JsonProperty("BoardingInformationId")
    private String boardingInformationId;


    
    public GetProviderMerchantCredentialsArgs() {
    }

    
    public GetProviderMerchantCredentialsArgs(String boardingInformationId) {
        this.boardingInformationId = boardingInformationId;

    }
    
    
    public GetProviderMerchantCredentialsArgs(String sessionToken, String boardingInformationId) {
        super(sessionToken);
        this.boardingInformationId = boardingInformationId;

    }

    
    public String getBoardingInformationId() {
        return boardingInformationId;
    }

    public void setBoardingInformationId(String boardingInformationId) {
        this.boardingInformationId = boardingInformationId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetProviderMerchantCredentialsArgs that = (GetProviderMerchantCredentialsArgs) o;
        return Objects.equals(boardingInformationId, that.boardingInformationId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingInformationId);
    }

    @Override
    public String toString() {
        return "GetProviderMerchantCredentialsArgs{" +
                 "boardingInformationId='" + boardingInformationId + '\'' +

                '}';
    }
}