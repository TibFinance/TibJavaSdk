
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BoardingEntity;
import com.tib.api.model.TransactionMailingInfo;
import com.tib.api.model.ProviderAccount;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BoardingArgs  implements IBaseCryptedServiceArgs  {

    
    /**
     * Gets or sets the BoardingEntity.
     */
    @JsonProperty("BoardingEntity")
    private BoardingEntity boardingEntity;

    /**
     * Gets or sets the mailing information.
     */
    @JsonProperty("MailingInfo")
    private TransactionMailingInfo mailingInfo;

    /**
     * Gets or sets the provider credentials.
     */
    @JsonProperty("ProviderCredentials")
    private List<ProviderAccount> providerCredentials;


    
    public BoardingArgs() {
    }

    
    public BoardingArgs(BoardingEntity boardingEntity, TransactionMailingInfo mailingInfo, List<ProviderAccount> providerCredentials) {
        this.boardingEntity = boardingEntity;
        this.mailingInfo = mailingInfo;
        this.providerCredentials = providerCredentials;
    }
    
    

    
    public BoardingEntity getBoardingEntity() {
        return boardingEntity;
    }

    public void setBoardingEntity(BoardingEntity boardingEntity) {
        this.boardingEntity = boardingEntity;
    }

    public TransactionMailingInfo getMailingInfo() {
        return mailingInfo;
    }

    public void setMailingInfo(TransactionMailingInfo mailingInfo) {
        this.mailingInfo = mailingInfo;
    }

    public List<ProviderAccount> getProviderCredentials() {
        return providerCredentials;
    }

    public void setProviderCredentials(List<ProviderAccount> providerCredentials) {
        this.providerCredentials = providerCredentials;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingArgs that = (BoardingArgs) o;
        return Objects.equals(boardingEntity, that.boardingEntity) && Objects.equals(mailingInfo, that.mailingInfo) && Objects.equals(providerCredentials, that.providerCredentials) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingEntity, mailingInfo, providerCredentials);
    }

    @Override
    public String toString() {
        return "BoardingArgs{" +
                "boardingEntity='" + boardingEntity + '\'' +
                ", mailingInfo='" + mailingInfo + '\'' +
                ", providerCredentials='" + providerCredentials + '\'' +

                '}';
    }
}