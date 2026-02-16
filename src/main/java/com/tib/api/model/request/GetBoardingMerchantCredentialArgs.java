
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.GetBoardingMerchantCredentialEntity;
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


public class GetBoardingMerchantCredentialArgs  implements IBaseCryptedServiceArgs  {

    
    /**
     * Gets or sets the BoardingEntity.
     */
    @JsonProperty("GetBoardingMerchantCredentialEntity")
    private GetBoardingMerchantCredentialEntity getBoardingMerchantCredentialEntity;

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


    
    public GetBoardingMerchantCredentialArgs() {
    }

    
    public GetBoardingMerchantCredentialArgs(GetBoardingMerchantCredentialEntity getBoardingMerchantCredentialEntity, TransactionMailingInfo mailingInfo, List<ProviderAccount> providerCredentials) {
        this.getBoardingMerchantCredentialEntity = getBoardingMerchantCredentialEntity;
        this.mailingInfo = mailingInfo;
        this.providerCredentials = providerCredentials;
    }
    
    

    
    public GetBoardingMerchantCredentialEntity getGetBoardingMerchantCredentialEntity() {
        return getBoardingMerchantCredentialEntity;
    }

    public void setGetBoardingMerchantCredentialEntity(GetBoardingMerchantCredentialEntity getBoardingMerchantCredentialEntity) {
        this.getBoardingMerchantCredentialEntity = getBoardingMerchantCredentialEntity;
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
        GetBoardingMerchantCredentialArgs that = (GetBoardingMerchantCredentialArgs) o;
        return Objects.equals(getBoardingMerchantCredentialEntity, that.getBoardingMerchantCredentialEntity) && Objects.equals(mailingInfo, that.mailingInfo) && Objects.equals(providerCredentials, that.providerCredentials) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(getBoardingMerchantCredentialEntity, mailingInfo, providerCredentials);
    }

    @Override
    public String toString() {
        return "GetBoardingMerchantCredentialArgs{" +
                "getBoardingMerchantCredentialEntity='" + getBoardingMerchantCredentialEntity + '\'' +
                ", mailingInfo='" + mailingInfo + '\'' +
                ", providerCredentials='" + providerCredentials + '\'' +

                '}';
    }
}