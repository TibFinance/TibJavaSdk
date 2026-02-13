
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.RetrieveDocumentEntity;
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


public class RetrieveDocumentArgs  implements IBaseCryptedServiceArgs  {

    
    /**
 * Gets or sets the RetrieveDocumentEntity.
 */
    @JsonProperty("RetrieveDocumentEntity")
    private RetrieveDocumentEntity retrieveDocumentEntity;

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


    
    public RetrieveDocumentArgs() {
    }

    
    public RetrieveDocumentArgs(RetrieveDocumentEntity retrieveDocumentEntity, TransactionMailingInfo mailingInfo, List<ProviderAccount> providerCredentials) {
        this.retrieveDocumentEntity = retrieveDocumentEntity;
this.mailingInfo = mailingInfo;
this.providerCredentials = providerCredentials;

    }
    
    

    
    public RetrieveDocumentEntity getRetrieveDocumentEntity() {
        return retrieveDocumentEntity;
    }

    public void setRetrieveDocumentEntity(RetrieveDocumentEntity retrieveDocumentEntity) {
        this.retrieveDocumentEntity = retrieveDocumentEntity;
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
        RetrieveDocumentArgs that = (RetrieveDocumentArgs) o;
        return Objects.equals(retrieveDocumentEntity, that.retrieveDocumentEntity) && Objects.equals(mailingInfo, that.mailingInfo) && Objects.equals(providerCredentials, that.providerCredentials) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(retrieveDocumentEntity, mailingInfo, providerCredentials);
    }

    @Override
    public String toString() {
        return "RetrieveDocumentArgs{" +
                 "retrieveDocumentEntity='" + retrieveDocumentEntity + '\'' +
 ", mailingInfo='" + mailingInfo + '\'' +
 ", providerCredentials='" + providerCredentials + '\'' +

                '}';
    }
}