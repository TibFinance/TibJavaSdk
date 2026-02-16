
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TransferType;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.TransferFrequency;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateFreeOperationArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Retrieves or assigns the unique identifier for a bill.
     */
    @JsonProperty("BillId")
    private String billId;

    /**
     * Serves as a unique identifier for each customer within the system.
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * Acts as a unique identifier for a distinct payment method.
     */
    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;

    /**
     * Defines and manages the type of transfer operation within the system.
     */
    @JsonProperty("TransferType")
    private TransferType transferType;

    /**
     * Retrieves or assigns the reference number associated with a transaction or operation.
     */
    @JsonProperty("ReferenceNumber")
    private String referenceNumber;

    /**
     * Retrieves or assigns the monetary amount involved in the transaction.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * Retrieves or assigns the due date for a transaction.
     */
    @JsonProperty("TransactionDueDate")
    private LocalDateTime transactionDueDate;

    /**
     * Specifies the title or description of a transfer within the TIB Finance API.
     */
    @JsonProperty("TransferTitle")
    private String transferTitle;

    /**
     * Provides a textual representation of the transaction, detailing any errors encountered during processing.
     */
    @JsonProperty("TransferDescription")
    private String transferDescription;

    /**
     * Represents the unique identifier for a transfer within an external system, facilitating tracking and integration.
     */
    @JsonProperty("TransferExternalSystemNumber")
    private String transferExternalSystemNumber;

    /**
     * Defines the frequency at which transfers occur within the TIB Finance API.
     */
    @JsonProperty("TransferFrequency")
    private TransferFrequency transferFrequency;

    /**
     * Represents the unique identifier for a group within the TIB Finance API.
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * Indicates whether the transfer should be executed immediately within the TIB Finance API.
     */
    @JsonProperty("ImmediateTransfer")
    private boolean immediateTransfer;

    /**
     * Represents a brief description used in statements to identify or clarify the transaction.
     */
    @JsonProperty("StatementDescription")
    private String statementDescription;

    /**
     * Determines whether to halt operations with identical identifications.
     */
    @JsonProperty("StopSameIdentifications")
    private boolean stopSameIdentifications;


    
    public CreateFreeOperationArgs() {
    }

    
    public CreateFreeOperationArgs(String merchantId, String billId, String customerId, String paymentMethodId, TransferType transferType, String referenceNumber, Double amount, Language language, LocalDateTime transactionDueDate, String transferTitle, String transferDescription, String transferExternalSystemNumber, TransferFrequency transferFrequency, String groupId, boolean immediateTransfer, String statementDescription, boolean stopSameIdentifications) {
        this.merchantId = merchantId;
        this.billId = billId;
        this.customerId = customerId;
        this.paymentMethodId = paymentMethodId;
        this.transferType = transferType;
        this.referenceNumber = referenceNumber;
        this.amount = amount;
        this.language = language;
        this.transactionDueDate = transactionDueDate;
        this.transferTitle = transferTitle;
        this.transferDescription = transferDescription;
        this.transferExternalSystemNumber = transferExternalSystemNumber;
        this.transferFrequency = transferFrequency;
        this.groupId = groupId;
        this.immediateTransfer = immediateTransfer;
        this.statementDescription = statementDescription;
        this.stopSameIdentifications = stopSameIdentifications;
    }
    
    
    public CreateFreeOperationArgs(String sessionToken, String merchantId, String billId, String customerId, String paymentMethodId, TransferType transferType, String referenceNumber, Double amount, Language language, LocalDateTime transactionDueDate, String transferTitle, String transferDescription, String transferExternalSystemNumber, TransferFrequency transferFrequency, String groupId, boolean immediateTransfer, String statementDescription, boolean stopSameIdentifications) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.billId = billId;
        this.customerId = customerId;
        this.paymentMethodId = paymentMethodId;
        this.transferType = transferType;
        this.referenceNumber = referenceNumber;
        this.amount = amount;
        this.language = language;
        this.transactionDueDate = transactionDueDate;
        this.transferTitle = transferTitle;
        this.transferDescription = transferDescription;
        this.transferExternalSystemNumber = transferExternalSystemNumber;
        this.transferFrequency = transferFrequency;
        this.groupId = groupId;
        this.immediateTransfer = immediateTransfer;
        this.statementDescription = statementDescription;
        this.stopSameIdentifications = stopSameIdentifications;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public TransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public LocalDateTime getTransactionDueDate() {
        return transactionDueDate;
    }

    public void setTransactionDueDate(LocalDateTime transactionDueDate) {
        this.transactionDueDate = transactionDueDate;
    }

    public String getTransferTitle() {
        return transferTitle;
    }

    public void setTransferTitle(String transferTitle) {
        this.transferTitle = transferTitle;
    }

    public String getTransferDescription() {
        return transferDescription;
    }

    public void setTransferDescription(String transferDescription) {
        this.transferDescription = transferDescription;
    }

    public String getTransferExternalSystemNumber() {
        return transferExternalSystemNumber;
    }

    public void setTransferExternalSystemNumber(String transferExternalSystemNumber) {
        this.transferExternalSystemNumber = transferExternalSystemNumber;
    }

    public TransferFrequency getTransferFrequency() {
        return transferFrequency;
    }

    public void setTransferFrequency(TransferFrequency transferFrequency) {
        this.transferFrequency = transferFrequency;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public boolean getImmediateTransfer() {
        return immediateTransfer;
    }

    public void setImmediateTransfer(boolean immediateTransfer) {
        this.immediateTransfer = immediateTransfer;
    }

    public String getStatementDescription() {
        return statementDescription;
    }

    public void setStatementDescription(String statementDescription) {
        this.statementDescription = statementDescription;
    }

    public boolean getStopSameIdentifications() {
        return stopSameIdentifications;
    }

    public void setStopSameIdentifications(boolean stopSameIdentifications) {
        this.stopSameIdentifications = stopSameIdentifications;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateFreeOperationArgs that = (CreateFreeOperationArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(billId, that.billId) && Objects.equals(customerId, that.customerId) && Objects.equals(paymentMethodId, that.paymentMethodId) && Objects.equals(transferType, that.transferType) && Objects.equals(referenceNumber, that.referenceNumber) && Objects.equals(amount, that.amount) && Objects.equals(language, that.language) && Objects.equals(transactionDueDate, that.transactionDueDate) && Objects.equals(transferTitle, that.transferTitle) && Objects.equals(transferDescription, that.transferDescription) && Objects.equals(transferExternalSystemNumber, that.transferExternalSystemNumber) && Objects.equals(transferFrequency, that.transferFrequency) && Objects.equals(groupId, that.groupId) && Objects.equals(immediateTransfer, that.immediateTransfer) && Objects.equals(statementDescription, that.statementDescription) && Objects.equals(stopSameIdentifications, that.stopSameIdentifications) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, billId, customerId, paymentMethodId, transferType, referenceNumber, amount, language, transactionDueDate, transferTitle, transferDescription, transferExternalSystemNumber, transferFrequency, groupId, immediateTransfer, statementDescription, stopSameIdentifications);
    }

    @Override
    public String toString() {
        return "CreateFreeOperationArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", billId='" + billId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", paymentMethodId='" + paymentMethodId + '\'' +
                ", transferType='" + transferType + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", amount='" + amount + '\'' +
                ", language='" + language + '\'' +
                ", transactionDueDate='" + transactionDueDate + '\'' +
                ", transferTitle='" + transferTitle + '\'' +
                ", transferDescription='" + transferDescription + '\'' +
                ", transferExternalSystemNumber='" + transferExternalSystemNumber + '\'' +
                ", transferFrequency='" + transferFrequency + '\'' +
                ", groupId='" + groupId + '\'' +
                ", immediateTransfer='" + immediateTransfer + '\'' +
                ", statementDescription='" + statementDescription + '\'' +
                ", stopSameIdentifications='" + stopSameIdentifications + '\'' +

                '}';
    }
}