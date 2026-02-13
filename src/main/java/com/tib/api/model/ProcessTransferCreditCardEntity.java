
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.CreditCard;
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


public class ProcessTransferCreditCardEntity  extends ProcessTransferEntity  {

    
    /**
 * Gets or sets the card information.
 */
    @JsonProperty("CardInformation")
    private CreditCard cardInformation;

    /**
 * Determine if the card is new in the system.
 */
    @JsonProperty("NeedValidation")
    private boolean needValidation;

    /**
 * 
 */
    @JsonProperty("ProviderGivenIdentification")
    private String providerGivenIdentification;


    
    public ProcessTransferCreditCardEntity() {
    }

    
    public ProcessTransferCreditCardEntity(CreditCard cardInformation, boolean needValidation, String providerGivenIdentification) {
        this.cardInformation = cardInformation;
this.needValidation = needValidation;
this.providerGivenIdentification = providerGivenIdentification;

    }
    
    
    public ProcessTransferCreditCardEntity(String transactionId, String transactionGroupId, Double transactionAmount, Currency currency, LocalDateTime dueDate, String transactionDescription, AcpOperationType acpOperationType, TransferDirection transferDirection, String favoriteProvider, boolean isTransactionRevert, String alreadyProcessedProviderId, String alreadyProcessedProviderAdditionalInfos, Language language, String providerTransactionId, String providerSubType, String merchantId, Provider providerType, String transferId, List<Object> relatedConvenientFeesWithTargetProviderId, CreditCard cardInformation, boolean needValidation, String providerGivenIdentification) {
        super(transactionId, transactionGroupId, transactionAmount, currency, dueDate, transactionDescription, acpOperationType, transferDirection, favoriteProvider, isTransactionRevert, alreadyProcessedProviderId, alreadyProcessedProviderAdditionalInfos, language, providerTransactionId, providerSubType, merchantId, providerType, transferId, relatedConvenientFeesWithTargetProviderId);
        this.cardInformation = cardInformation;
this.needValidation = needValidation;
this.providerGivenIdentification = providerGivenIdentification;

    }

    
    public CreditCard getCardInformation() {
        return cardInformation;
    }

    public void setCardInformation(CreditCard cardInformation) {
        this.cardInformation = cardInformation;
    }

    public boolean getNeedValidation() {
        return needValidation;
    }

    public void setNeedValidation(boolean needValidation) {
        this.needValidation = needValidation;
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
        ProcessTransferCreditCardEntity that = (ProcessTransferCreditCardEntity) o;
        return Objects.equals(cardInformation, that.cardInformation) && Objects.equals(needValidation, that.needValidation) && Objects.equals(providerGivenIdentification, that.providerGivenIdentification) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(cardInformation, needValidation, providerGivenIdentification);
    }

    @Override
    public String toString() {
        return "ProcessTransferCreditCardEntity{" +
                 "cardInformation='" + cardInformation + '\'' +
 ", needValidation='" + needValidation + '\'' +
 ", providerGivenIdentification='" + providerGivenIdentification + '\'' +

                '}';
    }
}