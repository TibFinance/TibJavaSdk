
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


public class SaveProviderMerchantArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("ProviderMerchantId")
    private String providerMerchantId;

    /**
 * Represents the unique identifier for the boarding information of a merchant. This ID is crucial for tracking and referencing the boarding status within the system.
 */
    @JsonProperty("BoardingInformationId")
    private String boardingInformationId;


    
    public SaveProviderMerchantArgs() {
    }

    
    public SaveProviderMerchantArgs(String providerMerchantId, String boardingInformationId) {
        this.providerMerchantId = providerMerchantId;
this.boardingInformationId = boardingInformationId;

    }
    
    
    public SaveProviderMerchantArgs(String sessionToken, String providerMerchantId, String boardingInformationId) {
        super(sessionToken);
        this.providerMerchantId = providerMerchantId;
this.boardingInformationId = boardingInformationId;

    }

    
    public String getProviderMerchantId() {
        return providerMerchantId;
    }

    public void setProviderMerchantId(String providerMerchantId) {
        this.providerMerchantId = providerMerchantId;
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
        SaveProviderMerchantArgs that = (SaveProviderMerchantArgs) o;
        return Objects.equals(providerMerchantId, that.providerMerchantId) && Objects.equals(boardingInformationId, that.boardingInformationId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerMerchantId, boardingInformationId);
    }

    @Override
    public String toString() {
        return "SaveProviderMerchantArgs{" +
                 "providerMerchantId='" + providerMerchantId + '\'' +
 ", boardingInformationId='" + boardingInformationId + '\'' +

                '}';
    }
}