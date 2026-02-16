
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Account;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.AcpOperationType;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.Provider;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ProcessTransferAccountEntity  extends ProcessTransferEntity  {

    
    /**
     * Gets or sets the account information.
     */
    @JsonProperty("AccountInformation")
    private Account accountInformation;

    /**
     * 
     */
    @JsonProperty("ProviderGivenIdentification")
    private String providerGivenIdentification;


    
    public ProcessTransferAccountEntity() {
    }

    
    public ProcessTransferAccountEntity(Account accountInformation, String providerGivenIdentification) {
        this.accountInformation = accountInformation;
        this.providerGivenIdentification = providerGivenIdentification;
    }
    
    
    public ProcessTransferAccountEntity(String transactionId, String transactionGroupId, Double transactionAmount, Currency currency, LocalDateTime dueDate, String transactionDescription, AcpOperationType acpOperationType, TransferDirection transferDirection, String favoriteProvider, boolean isTransactionRevert, String alreadyProcessedProviderId, String alreadyProcessedProviderAdditionalInfos, Language language, String providerTransactionId, String providerSubType, String merchantId, Provider providerType, String transferId, List<Object> relatedConvenientFeesWithTargetProviderId, Account accountInformation, String providerGivenIdentification) {
        super(transactionId, transactionGroupId, transactionAmount, currency, dueDate, transactionDescription, acpOperationType, transferDirection, favoriteProvider, isTransactionRevert, alreadyProcessedProviderId, alreadyProcessedProviderAdditionalInfos, language, providerTransactionId, providerSubType, merchantId, providerType, transferId, relatedConvenientFeesWithTargetProviderId);
        this.accountInformation = accountInformation;
        this.providerGivenIdentification = providerGivenIdentification;
    }

    
    public Account getAccountInformation() {
        return accountInformation;
    }

    public void setAccountInformation(Account accountInformation) {
        this.accountInformation = accountInformation;
    }

    public String getProviderGivenIdentification() {
        return providerGivenIdentification;
    }

    public void setProviderGivenIdentification(String providerGivenIdentification) {
        this.providerGivenIdentification = providerGivenIdentification;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessTransferAccountEntity that = (ProcessTransferAccountEntity) o;
        return Objects.equals(accountInformation, that.accountInformation) && Objects.equals(providerGivenIdentification, that.providerGivenIdentification) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(accountInformation, providerGivenIdentification);
    }

    @Override
    public String toString() {
        return "ProcessTransferAccountEntity{" +
                "accountInformation='" + accountInformation + '\'' +
                ", providerGivenIdentification='" + providerGivenIdentification + '\'' +

                '}';
    }
}