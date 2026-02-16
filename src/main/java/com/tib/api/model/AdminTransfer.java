
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.ProcessStatus;
import com.tib.api.model.enums.PaymentFlow;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.TibAuthorizationStatus;
import com.tib.api.model.enums.TransferType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class AdminTransfer   {

    
    /**
     * Identifies the specific transfer operation that needs to be reverted.
     */
    @JsonProperty("TransferId")
    private String transferId;

    /**
     * 
     */
    @JsonProperty("RefId")
    private String refId;

    /**
     * Retrieves the identifier of the merchant (bank account) to which the operation applies.
     */
    @JsonProperty("RelatedMerchantId")
    private String relatedMerchantId;

    /**
     * Identifies the customer linked to this payment, when a customer relationship exists.
     */
    @JsonProperty("RelatedCustomerId")
    private String relatedCustomerId;

    /**
     * Acts as a unique identifier for a distinct payment method.
     */
    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;

    /**
     * Current processing state of a transaction or operation.
     */
    @JsonProperty("CurrentStatus")
    private ProcessStatus currentStatus;

    /**
     * 
     */
    @JsonProperty("PaymentFlowType")
    private PaymentFlow paymentFlowType;

    /**
     * Identifies the customer payment method that is mandatory when the payment flow operates in forced mode.
     */
    @JsonProperty("ForcedCustomerPaymentMethodId")
    private String forcedCustomerPaymentMethodId;

    /**
     * Indicates whether the payment is processed automatically without user intervention.
     */
    @JsonProperty("IsAutomaticPayment")
    private boolean isAutomaticPayment;

    /**
     * Gets or sets the date and time when the transfer must be completed.
     */
    @JsonProperty("TransferDueDate")
    private LocalDateTime transferDueDate;

    /**
     * 
     */
    @JsonProperty("TransferAmount")
    private Double transferAmount;

    /**
     * 
     */
    @JsonProperty("OverrideLanguage")
    private Language overrideLanguage;

    /**
     * Flag used to indicate that the payment is resolved in the third‑party system. It is employed solely for filtering payment lists.
     */
    @JsonProperty("IsMarkResolved")
    private boolean isMarkResolved;

    /**
     * 
     */
    @JsonProperty("ConvenientFeesForCreditCard")
    private Double convenientFeesForCreditCard;

    /**
     * 
     */
    @JsonProperty("ConvenientFeesForDirectAccount")
    private Double convenientFeesForDirectAccount;

    /**
     * 
     */
    @JsonProperty("IsOperationCreated")
    private boolean isOperationCreated;

    /**
     * Represents the unique identifier for a group within the TIB Finance API.
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * Gets or sets the external reference number used to link this entity with an external system or business process.
     */
    @JsonProperty("ExternalReferenceNumber")
    private String externalReferenceNumber;

    /**
     * 
     */
    @JsonProperty("TransferTypeRef")
    private String transferTypeRef;

    /**
     * 
     */
    @JsonProperty("IsDeleted")
    private boolean isDeleted;

    /**
     * The date and time when the payment was created.
     */
    @JsonProperty("CreatedDate")
    private LocalDateTime createdDate;

    /**
     * 
     */
    @JsonProperty("OverrideCurrency")
    private Currency overrideCurrency;

    /**
     * 
     */
    @JsonProperty("LimitationStatus")
    private Integer limitationStatus;

    /**
     * 
     */
    @JsonProperty("ClientAuthorizationStatus")
    private Integer clientAuthorizationStatus;

    /**
     * 
     */
    @JsonProperty("ClientAuthorizedBy")
    private String clientAuthorizedBy;

    /**
     * 
     */
    @JsonProperty("TIBAuthorizationStatus")
    private TibAuthorizationStatus tIBAuthorizationStatus;

    /**
     * 
     */
    @JsonProperty("TIBAuthorizedBy")
    private String tIBAuthorizedBy;

    /**
     * 
     */
    @JsonProperty("TIBAuthorizationDate")
    private LocalDateTime tIBAuthorizationDate;

    /**
     * 
     */
    @JsonProperty("ClientAuthorizationDate")
    private LocalDateTime clientAuthorizationDate;

    /**
     * Defines and manages the type of transfer operation within the system.
     */
    @JsonProperty("TransferType")
    private TransferType transferType;

    /**
     * 
     */
    @JsonProperty("AuthorizedPaymentMethodType")
    private Integer authorizedPaymentMethodType;

    /**
     * Identifies a specific recurring transfer operation associated with a client's account.
     */
    @JsonProperty("RecuringTransferId")
    private String recuringTransferId;

    /**
     * Represents a brief description used in statements to identify or clarify the transaction.
     */
    @JsonProperty("StatementDescription")
    private String statementDescription;

    /**
     * 
     */
    @JsonProperty("IsArchived")
    private boolean isArchived;

    /**
     * Indicates if the system must request the customer's consent prior to executing the payment.
     */
    @JsonProperty("AskForCustomerConsent")
    private boolean askForCustomerConsent;

    /**
     * Gets or sets the title that identifies the object in a human‑readable way.
     */
    @JsonProperty("Title")
    private String title;

    /**
     * 
     */
    @JsonProperty("Decription")
    private String decription;

    /**
     * 
     */
    @JsonProperty("ExternalSystemNumber")
    private String externalSystemNumber;

    /**
     * 
     */
    @JsonProperty("IsChecked")
    private boolean isChecked;

    /**
     * 
     */
    @JsonProperty("TIBAuthorizationStatusValue")
    private String tIBAuthorizationStatusValue;

    /**
     * 
     */
    @JsonProperty("TransferTypeValue")
    private String transferTypeValue;

    /**
     * 
     */
    @JsonProperty("CurrentStatusValue")
    private String currentStatusValue;

    /**
     * 
     */
    @JsonProperty("PaymentFlowTypeValue")
    private String paymentFlowTypeValue;

    /**
     * 
     */
    @JsonProperty("OverrideLanguageValue")
    private String overrideLanguageValue;

    /**
     * 
     */
    @JsonProperty("OverrideCurrencyValue")
    private String overrideCurrencyValue;


    
    public AdminTransfer() {
    }

    
    public AdminTransfer(String transferId, String refId, String relatedMerchantId, String relatedCustomerId, String paymentMethodId, ProcessStatus currentStatus, PaymentFlow paymentFlowType, String forcedCustomerPaymentMethodId, boolean isAutomaticPayment, LocalDateTime transferDueDate, Double transferAmount, Language overrideLanguage, boolean isMarkResolved, Double convenientFeesForCreditCard, Double convenientFeesForDirectAccount, boolean isOperationCreated, String groupId, String externalReferenceNumber, String transferTypeRef, boolean isDeleted, LocalDateTime createdDate, Currency overrideCurrency, Integer limitationStatus, Integer clientAuthorizationStatus, String clientAuthorizedBy, TibAuthorizationStatus tIBAuthorizationStatus, String tIBAuthorizedBy, LocalDateTime tIBAuthorizationDate, LocalDateTime clientAuthorizationDate, TransferType transferType, Integer authorizedPaymentMethodType, String recuringTransferId, String statementDescription, boolean isArchived, boolean askForCustomerConsent, String title, String decription, String externalSystemNumber, boolean isChecked, String tIBAuthorizationStatusValue, String transferTypeValue, String currentStatusValue, String paymentFlowTypeValue, String overrideLanguageValue, String overrideCurrencyValue) {
        this.transferId = transferId;
        this.refId = refId;
        this.relatedMerchantId = relatedMerchantId;
        this.relatedCustomerId = relatedCustomerId;
        this.paymentMethodId = paymentMethodId;
        this.currentStatus = currentStatus;
        this.paymentFlowType = paymentFlowType;
        this.forcedCustomerPaymentMethodId = forcedCustomerPaymentMethodId;
        this.isAutomaticPayment = isAutomaticPayment;
        this.transferDueDate = transferDueDate;
        this.transferAmount = transferAmount;
        this.overrideLanguage = overrideLanguage;
        this.isMarkResolved = isMarkResolved;
        this.convenientFeesForCreditCard = convenientFeesForCreditCard;
        this.convenientFeesForDirectAccount = convenientFeesForDirectAccount;
        this.isOperationCreated = isOperationCreated;
        this.groupId = groupId;
        this.externalReferenceNumber = externalReferenceNumber;
        this.transferTypeRef = transferTypeRef;
        this.isDeleted = isDeleted;
        this.createdDate = createdDate;
        this.overrideCurrency = overrideCurrency;
        this.limitationStatus = limitationStatus;
        this.clientAuthorizationStatus = clientAuthorizationStatus;
        this.clientAuthorizedBy = clientAuthorizedBy;
        this.tIBAuthorizationStatus = tIBAuthorizationStatus;
        this.tIBAuthorizedBy = tIBAuthorizedBy;
        this.tIBAuthorizationDate = tIBAuthorizationDate;
        this.clientAuthorizationDate = clientAuthorizationDate;
        this.transferType = transferType;
        this.authorizedPaymentMethodType = authorizedPaymentMethodType;
        this.recuringTransferId = recuringTransferId;
        this.statementDescription = statementDescription;
        this.isArchived = isArchived;
        this.askForCustomerConsent = askForCustomerConsent;
        this.title = title;
        this.decription = decription;
        this.externalSystemNumber = externalSystemNumber;
        this.isChecked = isChecked;
        this.tIBAuthorizationStatusValue = tIBAuthorizationStatusValue;
        this.transferTypeValue = transferTypeValue;
        this.currentStatusValue = currentStatusValue;
        this.paymentFlowTypeValue = paymentFlowTypeValue;
        this.overrideLanguageValue = overrideLanguageValue;
        this.overrideCurrencyValue = overrideCurrencyValue;
    }
    
    

    
    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getRelatedMerchantId() {
        return relatedMerchantId;
    }

    public void setRelatedMerchantId(String relatedMerchantId) {
        this.relatedMerchantId = relatedMerchantId;
    }

    public String getRelatedCustomerId() {
        return relatedCustomerId;
    }

    public void setRelatedCustomerId(String relatedCustomerId) {
        this.relatedCustomerId = relatedCustomerId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public ProcessStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(ProcessStatus currentStatus) {
        this.currentStatus = currentStatus;
    }

    public PaymentFlow getPaymentFlowType() {
        return paymentFlowType;
    }

    public void setPaymentFlowType(PaymentFlow paymentFlowType) {
        this.paymentFlowType = paymentFlowType;
    }

    public String getForcedCustomerPaymentMethodId() {
        return forcedCustomerPaymentMethodId;
    }

    public void setForcedCustomerPaymentMethodId(String forcedCustomerPaymentMethodId) {
        this.forcedCustomerPaymentMethodId = forcedCustomerPaymentMethodId;
    }

    public boolean getIsAutomaticPayment() {
        return isAutomaticPayment;
    }

    public void setIsAutomaticPayment(boolean isAutomaticPayment) {
        this.isAutomaticPayment = isAutomaticPayment;
    }

    public LocalDateTime getTransferDueDate() {
        return transferDueDate;
    }

    public void setTransferDueDate(LocalDateTime transferDueDate) {
        this.transferDueDate = transferDueDate;
    }

    public Double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(Double transferAmount) {
        this.transferAmount = transferAmount;
    }

    public Language getOverrideLanguage() {
        return overrideLanguage;
    }

    public void setOverrideLanguage(Language overrideLanguage) {
        this.overrideLanguage = overrideLanguage;
    }

    public boolean getIsMarkResolved() {
        return isMarkResolved;
    }

    public void setIsMarkResolved(boolean isMarkResolved) {
        this.isMarkResolved = isMarkResolved;
    }

    public Double getConvenientFeesForCreditCard() {
        return convenientFeesForCreditCard;
    }

    public void setConvenientFeesForCreditCard(Double convenientFeesForCreditCard) {
        this.convenientFeesForCreditCard = convenientFeesForCreditCard;
    }

    public Double getConvenientFeesForDirectAccount() {
        return convenientFeesForDirectAccount;
    }

    public void setConvenientFeesForDirectAccount(Double convenientFeesForDirectAccount) {
        this.convenientFeesForDirectAccount = convenientFeesForDirectAccount;
    }

    public boolean getIsOperationCreated() {
        return isOperationCreated;
    }

    public void setIsOperationCreated(boolean isOperationCreated) {
        this.isOperationCreated = isOperationCreated;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getExternalReferenceNumber() {
        return externalReferenceNumber;
    }

    public void setExternalReferenceNumber(String externalReferenceNumber) {
        this.externalReferenceNumber = externalReferenceNumber;
    }

    public String getTransferTypeRef() {
        return transferTypeRef;
    }

    public void setTransferTypeRef(String transferTypeRef) {
        this.transferTypeRef = transferTypeRef;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Currency getOverrideCurrency() {
        return overrideCurrency;
    }

    public void setOverrideCurrency(Currency overrideCurrency) {
        this.overrideCurrency = overrideCurrency;
    }

    public Integer getLimitationStatus() {
        return limitationStatus;
    }

    public void setLimitationStatus(Integer limitationStatus) {
        this.limitationStatus = limitationStatus;
    }

    public Integer getClientAuthorizationStatus() {
        return clientAuthorizationStatus;
    }

    public void setClientAuthorizationStatus(Integer clientAuthorizationStatus) {
        this.clientAuthorizationStatus = clientAuthorizationStatus;
    }

    public String getClientAuthorizedBy() {
        return clientAuthorizedBy;
    }

    public void setClientAuthorizedBy(String clientAuthorizedBy) {
        this.clientAuthorizedBy = clientAuthorizedBy;
    }

    public TibAuthorizationStatus getTIBAuthorizationStatus() {
        return tIBAuthorizationStatus;
    }

    public void setTIBAuthorizationStatus(TibAuthorizationStatus tIBAuthorizationStatus) {
        this.tIBAuthorizationStatus = tIBAuthorizationStatus;
    }

    public String getTIBAuthorizedBy() {
        return tIBAuthorizedBy;
    }

    public void setTIBAuthorizedBy(String tIBAuthorizedBy) {
        this.tIBAuthorizedBy = tIBAuthorizedBy;
    }

    public LocalDateTime getTIBAuthorizationDate() {
        return tIBAuthorizationDate;
    }

    public void setTIBAuthorizationDate(LocalDateTime tIBAuthorizationDate) {
        this.tIBAuthorizationDate = tIBAuthorizationDate;
    }

    public LocalDateTime getClientAuthorizationDate() {
        return clientAuthorizationDate;
    }

    public void setClientAuthorizationDate(LocalDateTime clientAuthorizationDate) {
        this.clientAuthorizationDate = clientAuthorizationDate;
    }

    public TransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }

    public Integer getAuthorizedPaymentMethodType() {
        return authorizedPaymentMethodType;
    }

    public void setAuthorizedPaymentMethodType(Integer authorizedPaymentMethodType) {
        this.authorizedPaymentMethodType = authorizedPaymentMethodType;
    }

    public String getRecuringTransferId() {
        return recuringTransferId;
    }

    public void setRecuringTransferId(String recuringTransferId) {
        this.recuringTransferId = recuringTransferId;
    }

    public String getStatementDescription() {
        return statementDescription;
    }

    public void setStatementDescription(String statementDescription) {
        this.statementDescription = statementDescription;
    }

    public boolean getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(boolean isArchived) {
        this.isArchived = isArchived;
    }

    public boolean getAskForCustomerConsent() {
        return askForCustomerConsent;
    }

    public void setAskForCustomerConsent(boolean askForCustomerConsent) {
        this.askForCustomerConsent = askForCustomerConsent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getExternalSystemNumber() {
        return externalSystemNumber;
    }

    public void setExternalSystemNumber(String externalSystemNumber) {
        this.externalSystemNumber = externalSystemNumber;
    }

    public boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public String getTIBAuthorizationStatusValue() {
        return tIBAuthorizationStatusValue;
    }

    public void setTIBAuthorizationStatusValue(String tIBAuthorizationStatusValue) {
        this.tIBAuthorizationStatusValue = tIBAuthorizationStatusValue;
    }

    public String getTransferTypeValue() {
        return transferTypeValue;
    }

    public void setTransferTypeValue(String transferTypeValue) {
        this.transferTypeValue = transferTypeValue;
    }

    public String getCurrentStatusValue() {
        return currentStatusValue;
    }

    public void setCurrentStatusValue(String currentStatusValue) {
        this.currentStatusValue = currentStatusValue;
    }

    public String getPaymentFlowTypeValue() {
        return paymentFlowTypeValue;
    }

    public void setPaymentFlowTypeValue(String paymentFlowTypeValue) {
        this.paymentFlowTypeValue = paymentFlowTypeValue;
    }

    public String getOverrideLanguageValue() {
        return overrideLanguageValue;
    }

    public void setOverrideLanguageValue(String overrideLanguageValue) {
        this.overrideLanguageValue = overrideLanguageValue;
    }

    public String getOverrideCurrencyValue() {
        return overrideCurrencyValue;
    }

    public void setOverrideCurrencyValue(String overrideCurrencyValue) {
        this.overrideCurrencyValue = overrideCurrencyValue;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminTransfer that = (AdminTransfer) o;
        return Objects.equals(transferId, that.transferId) && Objects.equals(refId, that.refId) && Objects.equals(relatedMerchantId, that.relatedMerchantId) && Objects.equals(relatedCustomerId, that.relatedCustomerId) && Objects.equals(paymentMethodId, that.paymentMethodId) && Objects.equals(currentStatus, that.currentStatus) && Objects.equals(paymentFlowType, that.paymentFlowType) && Objects.equals(forcedCustomerPaymentMethodId, that.forcedCustomerPaymentMethodId) && Objects.equals(isAutomaticPayment, that.isAutomaticPayment) && Objects.equals(transferDueDate, that.transferDueDate) && Objects.equals(transferAmount, that.transferAmount) && Objects.equals(overrideLanguage, that.overrideLanguage) && Objects.equals(isMarkResolved, that.isMarkResolved) && Objects.equals(convenientFeesForCreditCard, that.convenientFeesForCreditCard) && Objects.equals(convenientFeesForDirectAccount, that.convenientFeesForDirectAccount) && Objects.equals(isOperationCreated, that.isOperationCreated) && Objects.equals(groupId, that.groupId) && Objects.equals(externalReferenceNumber, that.externalReferenceNumber) && Objects.equals(transferTypeRef, that.transferTypeRef) && Objects.equals(isDeleted, that.isDeleted) && Objects.equals(createdDate, that.createdDate) && Objects.equals(overrideCurrency, that.overrideCurrency) && Objects.equals(limitationStatus, that.limitationStatus) && Objects.equals(clientAuthorizationStatus, that.clientAuthorizationStatus) && Objects.equals(clientAuthorizedBy, that.clientAuthorizedBy) && Objects.equals(tIBAuthorizationStatus, that.tIBAuthorizationStatus) && Objects.equals(tIBAuthorizedBy, that.tIBAuthorizedBy) && Objects.equals(tIBAuthorizationDate, that.tIBAuthorizationDate) && Objects.equals(clientAuthorizationDate, that.clientAuthorizationDate) && Objects.equals(transferType, that.transferType) && Objects.equals(authorizedPaymentMethodType, that.authorizedPaymentMethodType) && Objects.equals(recuringTransferId, that.recuringTransferId) && Objects.equals(statementDescription, that.statementDescription) && Objects.equals(isArchived, that.isArchived) && Objects.equals(askForCustomerConsent, that.askForCustomerConsent) && Objects.equals(title, that.title) && Objects.equals(decription, that.decription) && Objects.equals(externalSystemNumber, that.externalSystemNumber) && Objects.equals(isChecked, that.isChecked) && Objects.equals(tIBAuthorizationStatusValue, that.tIBAuthorizationStatusValue) && Objects.equals(transferTypeValue, that.transferTypeValue) && Objects.equals(currentStatusValue, that.currentStatusValue) && Objects.equals(paymentFlowTypeValue, that.paymentFlowTypeValue) && Objects.equals(overrideLanguageValue, that.overrideLanguageValue) && Objects.equals(overrideCurrencyValue, that.overrideCurrencyValue) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transferId, refId, relatedMerchantId, relatedCustomerId, paymentMethodId, currentStatus, paymentFlowType, forcedCustomerPaymentMethodId, isAutomaticPayment, transferDueDate, transferAmount, overrideLanguage, isMarkResolved, convenientFeesForCreditCard, convenientFeesForDirectAccount, isOperationCreated, groupId, externalReferenceNumber, transferTypeRef, isDeleted, createdDate, overrideCurrency, limitationStatus, clientAuthorizationStatus, clientAuthorizedBy, tIBAuthorizationStatus, tIBAuthorizedBy, tIBAuthorizationDate, clientAuthorizationDate, transferType, authorizedPaymentMethodType, recuringTransferId, statementDescription, isArchived, askForCustomerConsent, title, decription, externalSystemNumber, isChecked, tIBAuthorizationStatusValue, transferTypeValue, currentStatusValue, paymentFlowTypeValue, overrideLanguageValue, overrideCurrencyValue);
    }

    @Override
    public String toString() {
        return "AdminTransfer{" +
                "transferId='" + transferId + '\'' +
                ", refId='" + refId + '\'' +
                ", relatedMerchantId='" + relatedMerchantId + '\'' +
                ", relatedCustomerId='" + relatedCustomerId + '\'' +
                ", paymentMethodId='" + paymentMethodId + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                ", paymentFlowType='" + paymentFlowType + '\'' +
                ", forcedCustomerPaymentMethodId='" + forcedCustomerPaymentMethodId + '\'' +
                ", isAutomaticPayment='" + isAutomaticPayment + '\'' +
                ", transferDueDate='" + transferDueDate + '\'' +
                ", transferAmount='" + transferAmount + '\'' +
                ", overrideLanguage='" + overrideLanguage + '\'' +
                ", isMarkResolved='" + isMarkResolved + '\'' +
                ", convenientFeesForCreditCard='" + convenientFeesForCreditCard + '\'' +
                ", convenientFeesForDirectAccount='" + convenientFeesForDirectAccount + '\'' +
                ", isOperationCreated='" + isOperationCreated + '\'' +
                ", groupId='" + groupId + '\'' +
                ", externalReferenceNumber='" + externalReferenceNumber + '\'' +
                ", transferTypeRef='" + transferTypeRef + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", overrideCurrency='" + overrideCurrency + '\'' +
                ", limitationStatus='" + limitationStatus + '\'' +
                ", clientAuthorizationStatus='" + clientAuthorizationStatus + '\'' +
                ", clientAuthorizedBy='" + clientAuthorizedBy + '\'' +
                ", tIBAuthorizationStatus='" + tIBAuthorizationStatus + '\'' +
                ", tIBAuthorizedBy='" + tIBAuthorizedBy + '\'' +
                ", tIBAuthorizationDate='" + tIBAuthorizationDate + '\'' +
                ", clientAuthorizationDate='" + clientAuthorizationDate + '\'' +
                ", transferType='" + transferType + '\'' +
                ", authorizedPaymentMethodType='" + authorizedPaymentMethodType + '\'' +
                ", recuringTransferId='" + recuringTransferId + '\'' +
                ", statementDescription='" + statementDescription + '\'' +
                ", isArchived='" + isArchived + '\'' +
                ", askForCustomerConsent='" + askForCustomerConsent + '\'' +
                ", title='" + title + '\'' +
                ", decription='" + decription + '\'' +
                ", externalSystemNumber='" + externalSystemNumber + '\'' +
                ", isChecked='" + isChecked + '\'' +
                ", tIBAuthorizationStatusValue='" + tIBAuthorizationStatusValue + '\'' +
                ", transferTypeValue='" + transferTypeValue + '\'' +
                ", currentStatusValue='" + currentStatusValue + '\'' +
                ", paymentFlowTypeValue='" + paymentFlowTypeValue + '\'' +
                ", overrideLanguageValue='" + overrideLanguageValue + '\'' +
                ", overrideCurrencyValue='" + overrideCurrencyValue + '\'' +

                '}';
    }
}