
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.ProcessTransferEntity;
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


public class ProcessTransferArgs  implements IBaseCryptedServiceArgs  {

    
    /**
 * Gets or sets the transfer informations.
 */
    @JsonProperty("TransferInformations")
    private List<ProcessTransferEntity> transferInformations;

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


    
    public ProcessTransferArgs() {
    }

    
    public ProcessTransferArgs(List<ProcessTransferEntity> transferInformations, TransactionMailingInfo mailingInfo, List<ProviderAccount> providerCredentials) {
        this.transferInformations = transferInformations;
this.mailingInfo = mailingInfo;
this.providerCredentials = providerCredentials;

    }
    
    

    
    public List<ProcessTransferEntity> getTransferInformations() {
        return transferInformations;
    }

    public void setTransferInformations(List<ProcessTransferEntity> transferInformations) {
        this.transferInformations = transferInformations;
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
        ProcessTransferArgs that = (ProcessTransferArgs) o;
        return Objects.equals(transferInformations, that.transferInformations) && Objects.equals(mailingInfo, that.mailingInfo) && Objects.equals(providerCredentials, that.providerCredentials) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transferInformations, mailingInfo, providerCredentials);
    }

    @Override
    public String toString() {
        return "ProcessTransferArgs{" +
                 "transferInformations='" + transferInformations + '\'' +
 ", mailingInfo='" + mailingInfo + '\'' +
 ", providerCredentials='" + providerCredentials + '\'' +

                '}';
    }
}