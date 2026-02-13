
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.GetBoardingMerchantStatusEntity;
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


public class GetBoardingMerchantStatusArgs  implements IBaseCryptedServiceArgs  {

    
    /**
 * Gets or sets the SubmitDocumentEntity.
 */
    @JsonProperty("GetBoardingMerchantStatusEntity")
    private GetBoardingMerchantStatusEntity getBoardingMerchantStatusEntity;

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


    
    public GetBoardingMerchantStatusArgs() {
    }

    
    public GetBoardingMerchantStatusArgs(GetBoardingMerchantStatusEntity getBoardingMerchantStatusEntity, TransactionMailingInfo mailingInfo, List<ProviderAccount> providerCredentials) {
        this.getBoardingMerchantStatusEntity = getBoardingMerchantStatusEntity;
this.mailingInfo = mailingInfo;
this.providerCredentials = providerCredentials;

    }
    
    

    
    public GetBoardingMerchantStatusEntity getGetBoardingMerchantStatusEntity() {
        return getBoardingMerchantStatusEntity;
    }

    public void setGetBoardingMerchantStatusEntity(GetBoardingMerchantStatusEntity getBoardingMerchantStatusEntity) {
        this.getBoardingMerchantStatusEntity = getBoardingMerchantStatusEntity;
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
        GetBoardingMerchantStatusArgs that = (GetBoardingMerchantStatusArgs) o;
        return Objects.equals(getBoardingMerchantStatusEntity, that.getBoardingMerchantStatusEntity) && Objects.equals(mailingInfo, that.mailingInfo) && Objects.equals(providerCredentials, that.providerCredentials) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(getBoardingMerchantStatusEntity, mailingInfo, providerCredentials);
    }

    @Override
    public String toString() {
        return "GetBoardingMerchantStatusArgs{" +
                 "getBoardingMerchantStatusEntity='" + getBoardingMerchantStatusEntity + '\'' +
 ", mailingInfo='" + mailingInfo + '\'' +
 ", providerCredentials='" + providerCredentials + '\'' +

                '}';
    }
}