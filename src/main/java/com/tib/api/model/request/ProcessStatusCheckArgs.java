
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.TransactionIdentity;
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


public class ProcessStatusCheckArgs  implements IBaseCryptedServiceArgs  {

    
    /**
     * Gets or sets the collection of transaction details associated with the operation.
     */
    @JsonProperty("Transactions")
    private List<TransactionIdentity> transactions;

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

    /**
     * 
     */
    @JsonProperty("TransactionsCompressed")
    private String transactionsCompressed;


    
    public ProcessStatusCheckArgs() {
    }

    
    public ProcessStatusCheckArgs(List<TransactionIdentity> transactions, TransactionMailingInfo mailingInfo, List<ProviderAccount> providerCredentials, String transactionsCompressed) {
        this.transactions = transactions;
        this.mailingInfo = mailingInfo;
        this.providerCredentials = providerCredentials;
        this.transactionsCompressed = transactionsCompressed;
    }
    
    

    
    public List<TransactionIdentity> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionIdentity> transactions) {
        this.transactions = transactions;
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

    public String getTransactionsCompressed() {
        return transactionsCompressed;
    }

    public void setTransactionsCompressed(String transactionsCompressed) {
        this.transactionsCompressed = transactionsCompressed;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessStatusCheckArgs that = (ProcessStatusCheckArgs) o;
        return Objects.equals(transactions, that.transactions) && Objects.equals(mailingInfo, that.mailingInfo) && Objects.equals(providerCredentials, that.providerCredentials) && Objects.equals(transactionsCompressed, that.transactionsCompressed) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactions, mailingInfo, providerCredentials, transactionsCompressed);
    }

    @Override
    public String toString() {
        return "ProcessStatusCheckArgs{" +
                "transactions='" + transactions + '\'' +
                ", mailingInfo='" + mailingInfo + '\'' +
                ", providerCredentials='" + providerCredentials + '\'' +
                ", transactionsCompressed='" + transactionsCompressed + '\'' +

                '}';
    }
}