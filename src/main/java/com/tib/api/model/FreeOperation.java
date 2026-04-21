
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TransferType;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.TransferFrequency;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class FreeOperation   {

    
    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Unique identifier of the bill to be paid
     */
    @JsonProperty("BillId")
    private String billId;

    /**
     * Unique identifier of the customer owning the recurring transfers
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * Identifier of the payment method to be set as the default for the account
     */
    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;

    /**
     * Indicates the category of the recurring transfer (e.g., inbound, outbound, internal).
     */
    @JsonProperty("TransferType")
    private TransferType transferType;

    /**
     * Merchant-defined reference number for tracking this operation.
     */
    @JsonProperty("ReferenceNumber")
    private String referenceNumber;

    /**
     * The monetary value of each recurring transfer.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * Specifies the language used for the payment request and related communications
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * The scheduled date and time when the listed transfer is due to be executed.
     */
    @JsonProperty("TransactionDueDate")
    private OffsetDateTime transactionDueDate;

    /**
     * Title or label for this transfer.
     */
    @JsonProperty("TransferTitle")
    private String transferTitle;

    /**
     * Detailed description of this transfer.
     */
    @JsonProperty("TransferDescription")
    private String transferDescription;

    /**
     * External system tracking number for this transfer.
     */
    @JsonProperty("TransferExternalSystemNumber")
    private String transferExternalSystemNumber;

    /**
     * Specifies how often the payment should be executed.
     */
    @JsonProperty("TransferFrequency")
    private TransferFrequency transferFrequency;

    /**
     * End date for recurring transfers. Null means no end date.
     */
    @JsonProperty("RecurringEndDate")
    private OffsetDateTime recurringEndDate;

    /**
     * The text that will appear on the payer’s bank statement for this payment.
     */
    @JsonProperty("StatementDescription")
    private String statementDescription;

    /**
     * Unique identifier of the client initiating the session
     */
    @JsonProperty("ClientId")
    private String clientId;

    /**
     * Indicates whether the payment should be executed as an immediate transfer.
     */
    @JsonProperty("ImmediateTransfer")
    private boolean immediateTransfer;


    
    public FreeOperation() {
    }

    
    public FreeOperation(String merchantId, String billId, String customerId, String paymentMethodId, TransferType transferType, String referenceNumber, Double amount, Language language, OffsetDateTime transactionDueDate, String transferTitle, String transferDescription, String transferExternalSystemNumber, TransferFrequency transferFrequency, OffsetDateTime recurringEndDate, String statementDescription, String clientId, boolean immediateTransfer) {
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
        this.recurringEndDate = recurringEndDate;
        this.statementDescription = statementDescription;
        this.clientId = clientId;
        this.immediateTransfer = immediateTransfer;
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

    public OffsetDateTime getTransactionDueDate() {
        return transactionDueDate;
    }

    public void setTransactionDueDate(OffsetDateTime transactionDueDate) {
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

    public OffsetDateTime getRecurringEndDate() {
        return recurringEndDate;
    }

    public void setRecurringEndDate(OffsetDateTime recurringEndDate) {
        this.recurringEndDate = recurringEndDate;
    }

    public String getStatementDescription() {
        return statementDescription;
    }

    public void setStatementDescription(String statementDescription) {
        this.statementDescription = statementDescription;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public boolean getImmediateTransfer() {
        return immediateTransfer;
    }

    public void setImmediateTransfer(boolean immediateTransfer) {
        this.immediateTransfer = immediateTransfer;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreeOperation that = (FreeOperation) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(billId, that.billId) && Objects.equals(customerId, that.customerId) && Objects.equals(paymentMethodId, that.paymentMethodId) && Objects.equals(transferType, that.transferType) && Objects.equals(referenceNumber, that.referenceNumber) && Objects.equals(amount, that.amount) && Objects.equals(language, that.language) && Objects.equals(transactionDueDate, that.transactionDueDate) && Objects.equals(transferTitle, that.transferTitle) && Objects.equals(transferDescription, that.transferDescription) && Objects.equals(transferExternalSystemNumber, that.transferExternalSystemNumber) && Objects.equals(transferFrequency, that.transferFrequency) && Objects.equals(recurringEndDate, that.recurringEndDate) && Objects.equals(statementDescription, that.statementDescription) && Objects.equals(clientId, that.clientId) && Objects.equals(immediateTransfer, that.immediateTransfer) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, billId, customerId, paymentMethodId, transferType, referenceNumber, amount, language, transactionDueDate, transferTitle, transferDescription, transferExternalSystemNumber, transferFrequency, recurringEndDate, statementDescription, clientId, immediateTransfer);
    }

    @Override
    public String toString() {
        return "FreeOperation{" +
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
                ", recurringEndDate='" + recurringEndDate + '\'' +
                ", statementDescription='" + statementDescription + '\'' +
                ", clientId='" + clientId + '\'' +
                ", immediateTransfer='" + immediateTransfer + '\'' +

                '}';
    }
}