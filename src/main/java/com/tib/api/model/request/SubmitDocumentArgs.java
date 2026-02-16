
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.SubmitDocumentEntity;
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


public class SubmitDocumentArgs  implements IBaseCryptedServiceArgs  {

    
    /**
     * Gets or sets the SubmitDocumentEntity.
     */
    @JsonProperty("SubmitDocumentEntity")
    private SubmitDocumentEntity submitDocumentEntity;

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


    
    public SubmitDocumentArgs() {
    }

    
    public SubmitDocumentArgs(SubmitDocumentEntity submitDocumentEntity, TransactionMailingInfo mailingInfo, List<ProviderAccount> providerCredentials) {
        this.submitDocumentEntity = submitDocumentEntity;
        this.mailingInfo = mailingInfo;
        this.providerCredentials = providerCredentials;
    }
    
    

    
    public SubmitDocumentEntity getSubmitDocumentEntity() {
        return submitDocumentEntity;
    }

    public void setSubmitDocumentEntity(SubmitDocumentEntity submitDocumentEntity) {
        this.submitDocumentEntity = submitDocumentEntity;
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
        SubmitDocumentArgs that = (SubmitDocumentArgs) o;
        return Objects.equals(submitDocumentEntity, that.submitDocumentEntity) && Objects.equals(mailingInfo, that.mailingInfo) && Objects.equals(providerCredentials, that.providerCredentials) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(submitDocumentEntity, mailingInfo, providerCredentials);
    }

    @Override
    public String toString() {
        return "SubmitDocumentArgs{" +
                "submitDocumentEntity='" + submitDocumentEntity + '\'' +
                ", mailingInfo='" + mailingInfo + '\'' +
                ", providerCredentials='" + providerCredentials + '\'' +

                '}';
    }
}