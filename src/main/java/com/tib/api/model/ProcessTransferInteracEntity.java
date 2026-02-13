
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Interac;
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


public class ProcessTransferInteracEntity  extends ProcessTransferEntity  {

    
    /**
 * This model encapsulates the details required to manage Interac payment methods for customers. It is used to facilitate electronic funds transfers via the Interac network, a widely used payment system in Canada.
 */
    @JsonProperty("InteracInformation")
    private Interac interacInformation;

    /**
 * 
 */
    @JsonProperty("AnswerSalt")
    private String answerSalt;

    /**
 * 
 */
    @JsonProperty("MerchantEmail")
    private String merchantEmail;


    
    public ProcessTransferInteracEntity() {
    }

    
    public ProcessTransferInteracEntity(Interac interacInformation, String answerSalt, String merchantEmail) {
        this.interacInformation = interacInformation;
this.answerSalt = answerSalt;
this.merchantEmail = merchantEmail;

    }
    
    
    public ProcessTransferInteracEntity(String transactionId, String transactionGroupId, Double transactionAmount, Currency currency, LocalDateTime dueDate, String transactionDescription, AcpOperationType acpOperationType, TransferDirection transferDirection, String favoriteProvider, boolean isTransactionRevert, String alreadyProcessedProviderId, String alreadyProcessedProviderAdditionalInfos, Language language, String providerTransactionId, String providerSubType, String merchantId, Provider providerType, String transferId, List<Object> relatedConvenientFeesWithTargetProviderId, Interac interacInformation, String answerSalt, String merchantEmail) {
        super(transactionId, transactionGroupId, transactionAmount, currency, dueDate, transactionDescription, acpOperationType, transferDirection, favoriteProvider, isTransactionRevert, alreadyProcessedProviderId, alreadyProcessedProviderAdditionalInfos, language, providerTransactionId, providerSubType, merchantId, providerType, transferId, relatedConvenientFeesWithTargetProviderId);
        this.interacInformation = interacInformation;
this.answerSalt = answerSalt;
this.merchantEmail = merchantEmail;

    }

    
    public Interac getInteracInformation() {
        return interacInformation;
    }

    public void setInteracInformation(Interac interacInformation) {
        this.interacInformation = interacInformation;
    }

    public String getAnswerSalt() {
        return answerSalt;
    }

    public void setAnswerSalt(String answerSalt) {
        this.answerSalt = answerSalt;
    }

    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessTransferInteracEntity that = (ProcessTransferInteracEntity) o;
        return Objects.equals(interacInformation, that.interacInformation) && Objects.equals(answerSalt, that.answerSalt) && Objects.equals(merchantEmail, that.merchantEmail) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(interacInformation, answerSalt, merchantEmail);
    }

    @Override
    public String toString() {
        return "ProcessTransferInteracEntity{" +
                 "interacInformation='" + interacInformation + '\'' +
 ", answerSalt='" + answerSalt + '\'' +
 ", merchantEmail='" + merchantEmail + '\'' +

                '}';
    }
}