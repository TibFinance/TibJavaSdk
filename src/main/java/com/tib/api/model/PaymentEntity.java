
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.PaymentFlow;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.TransferFrequency;
import com.tib.api.model.enums.AutorizedPaymentMethodFlags;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class PaymentEntity   {

    
    /**
     * Specifies the execution mode used for processing a payment.
     */
    @JsonProperty("PaymentFlow")
    private PaymentFlow paymentFlow;

    /**
     * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * Identifies the customer linked to this payment, when a customer relationship exists.
     */
    @JsonProperty("RelatedCustomerId")
    private String relatedCustomerId;

    /**
     * Specifies the due date for the payment. If the value is null, the system treats the due date as the current date and time.
     */
    @JsonProperty("DueDate")
    private LocalDateTime dueDate;

    /**
     * Defines the frequency at which transfers occur within the TIB Finance API.
     */
    @JsonProperty("TransferFrequency")
    private TransferFrequency transferFrequency;

    /**
     * Specifies the amount to be paid. The value must not exceed the sum of the associated bill amount and any previously recorded payments. If null, the system applies the remaining unpaid portion of the bill.
     */
    @JsonProperty("PaymentAmount")
    private Double paymentAmount;

    /**
     * Identifies the customer payment method that is mandatory when the payment flow operates in forced mode.
     */
    @JsonProperty("ForcedCustomerPaymentMethodId")
    private String forcedCustomerPaymentMethodId;

    /**
     * Represents the unique identifier for a group within the TIB Finance API.
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * External reference identifier supplied by the client to correlate the transaction with external systems.
     */
    @JsonProperty("ExternalReferenceIdentification")
    private String externalReferenceIdentification;

    /**
     * 
     */
    @JsonProperty("AutorizedPaymentMethod")
    private AutorizedPaymentMethodFlags autorizedPaymentMethod;

    /**
     * Indicates if the system must request the customer's consent prior to executing the payment.
     */
    @JsonProperty("AskForCustomerConsent")
    private boolean askForCustomerConsent;

    /**
     * 
     */
    @JsonProperty("IsDeleted")
    private boolean isDeleted;


    
    public PaymentEntity() {
    }

    
    public PaymentEntity(PaymentFlow paymentFlow, Language language, String relatedCustomerId, LocalDateTime dueDate, TransferFrequency transferFrequency, Double paymentAmount, String forcedCustomerPaymentMethodId, String groupId, String externalReferenceIdentification, AutorizedPaymentMethodFlags autorizedPaymentMethod, boolean askForCustomerConsent, boolean isDeleted) {
        this.paymentFlow = paymentFlow;
        this.language = language;
        this.relatedCustomerId = relatedCustomerId;
        this.dueDate = dueDate;
        this.transferFrequency = transferFrequency;
        this.paymentAmount = paymentAmount;
        this.forcedCustomerPaymentMethodId = forcedCustomerPaymentMethodId;
        this.groupId = groupId;
        this.externalReferenceIdentification = externalReferenceIdentification;
        this.autorizedPaymentMethod = autorizedPaymentMethod;
        this.askForCustomerConsent = askForCustomerConsent;
        this.isDeleted = isDeleted;
    }
    
    

    
    public PaymentFlow getPaymentFlow() {
        return paymentFlow;
    }

    public void setPaymentFlow(PaymentFlow paymentFlow) {
        this.paymentFlow = paymentFlow;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getRelatedCustomerId() {
        return relatedCustomerId;
    }

    public void setRelatedCustomerId(String relatedCustomerId) {
        this.relatedCustomerId = relatedCustomerId;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public TransferFrequency getTransferFrequency() {
        return transferFrequency;
    }

    public void setTransferFrequency(TransferFrequency transferFrequency) {
        this.transferFrequency = transferFrequency;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getForcedCustomerPaymentMethodId() {
        return forcedCustomerPaymentMethodId;
    }

    public void setForcedCustomerPaymentMethodId(String forcedCustomerPaymentMethodId) {
        this.forcedCustomerPaymentMethodId = forcedCustomerPaymentMethodId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getExternalReferenceIdentification() {
        return externalReferenceIdentification;
    }

    public void setExternalReferenceIdentification(String externalReferenceIdentification) {
        this.externalReferenceIdentification = externalReferenceIdentification;
    }

    public AutorizedPaymentMethodFlags getAutorizedPaymentMethod() {
        return autorizedPaymentMethod;
    }

    public void setAutorizedPaymentMethod(AutorizedPaymentMethodFlags autorizedPaymentMethod) {
        this.autorizedPaymentMethod = autorizedPaymentMethod;
    }

    public boolean getAskForCustomerConsent() {
        return askForCustomerConsent;
    }

    public void setAskForCustomerConsent(boolean askForCustomerConsent) {
        this.askForCustomerConsent = askForCustomerConsent;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentEntity that = (PaymentEntity) o;
        return Objects.equals(paymentFlow, that.paymentFlow) && Objects.equals(language, that.language) && Objects.equals(relatedCustomerId, that.relatedCustomerId) && Objects.equals(dueDate, that.dueDate) && Objects.equals(transferFrequency, that.transferFrequency) && Objects.equals(paymentAmount, that.paymentAmount) && Objects.equals(forcedCustomerPaymentMethodId, that.forcedCustomerPaymentMethodId) && Objects.equals(groupId, that.groupId) && Objects.equals(externalReferenceIdentification, that.externalReferenceIdentification) && Objects.equals(autorizedPaymentMethod, that.autorizedPaymentMethod) && Objects.equals(askForCustomerConsent, that.askForCustomerConsent) && Objects.equals(isDeleted, that.isDeleted) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentFlow, language, relatedCustomerId, dueDate, transferFrequency, paymentAmount, forcedCustomerPaymentMethodId, groupId, externalReferenceIdentification, autorizedPaymentMethod, askForCustomerConsent, isDeleted);
    }

    @Override
    public String toString() {
        return "PaymentEntity{" +
                "paymentFlow='" + paymentFlow + '\'' +
                ", language='" + language + '\'' +
                ", relatedCustomerId='" + relatedCustomerId + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", transferFrequency='" + transferFrequency + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +
                ", forcedCustomerPaymentMethodId='" + forcedCustomerPaymentMethodId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", externalReferenceIdentification='" + externalReferenceIdentification + '\'' +
                ", autorizedPaymentMethod='" + autorizedPaymentMethod + '\'' +
                ", askForCustomerConsent='" + askForCustomerConsent + '\'' +
                ", isDeleted='" + isDeleted + '\'' +

                '}';
    }
}