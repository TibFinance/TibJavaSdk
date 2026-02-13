
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TransferFrequency;
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


public class RecuringTransfer   {

    
    /**
 * Indicates the next scheduled date for a recurring transfer operation associated with the client's account.
 */
    @JsonProperty("NextRecuringDate")
    private LocalDateTime nextRecuringDate;

    /**
 * Identifies a specific recurring transfer operation associated with a client's account.
 */
    @JsonProperty("RecuringTransferId")
    private String recuringTransferId;

    /**
 * Defines the frequency of recurring transfer operations within the client's account. This enumeration is crucial for setting up and managing scheduled transfers.
 */
    @JsonProperty("RecuringMode")
    private TransferFrequency recuringMode;

    /**
 * Defines and manages the type of transfer operation within the system.
 */
    @JsonProperty("TransferType")
    private TransferType transferType;

    /**
 * Identifies the payment method associated with a specific transaction or operation.
 */
    @JsonProperty("RelatedPaymentMethodId")
    private String relatedPaymentMethodId;

    /**
 * Gets or sets the reference date used for scheduling recurring transfers.
 */
    @JsonProperty("RecuringRefDate")
    private LocalDateTime recuringRefDate;

    /**
 * The date and time when the payment was created.
 */
    @JsonProperty("CreatedDate")
    private LocalDateTime createdDate;

    /**
 * Retrieves the identifier of the merchant (bank account) to which the operation applies.
 */
    @JsonProperty("RelatedMerchantId")
    private String relatedMerchantId;

    /**
 * Gets or sets the name of the merchant related to the current operation.
 */
    @JsonProperty("RelatedMerchantName")
    private String relatedMerchantName;

    /**
 * This property represents the full name of the customer in the system.
 */
    @JsonProperty("CustomerName")
    private String customerName;

    /**
 * Serves as a unique identifier for each customer within the system.
 */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
 * Retrieves or assigns the monetary amount involved in the transaction.
 */
    @JsonProperty("Amount")
    private Double amount;

    /**
 * Gets or sets the title of the transfer.
 */
    @JsonProperty("TrasnferTitle")
    private String trasnferTitle;

    /**
 * Provides a textual description of a transfer operation.
 */
    @JsonProperty("TrasnferDescription")
    private String trasnferDescription;

    /**
 * External system identifier for a transfer.
 */
    @JsonProperty("TrasnferExternalSystemNumber")
    private String trasnferExternalSystemNumber;


    
    public RecuringTransfer() {
    }

    
    public RecuringTransfer(LocalDateTime nextRecuringDate, String recuringTransferId, TransferFrequency recuringMode, TransferType transferType, String relatedPaymentMethodId, LocalDateTime recuringRefDate, LocalDateTime createdDate, String relatedMerchantId, String relatedMerchantName, String customerName, String customerId, Double amount, String trasnferTitle, String trasnferDescription, String trasnferExternalSystemNumber) {
        this.nextRecuringDate = nextRecuringDate;
this.recuringTransferId = recuringTransferId;
this.recuringMode = recuringMode;
this.transferType = transferType;
this.relatedPaymentMethodId = relatedPaymentMethodId;
this.recuringRefDate = recuringRefDate;
this.createdDate = createdDate;
this.relatedMerchantId = relatedMerchantId;
this.relatedMerchantName = relatedMerchantName;
this.customerName = customerName;
this.customerId = customerId;
this.amount = amount;
this.trasnferTitle = trasnferTitle;
this.trasnferDescription = trasnferDescription;
this.trasnferExternalSystemNumber = trasnferExternalSystemNumber;

    }
    
    

    
    public LocalDateTime getNextRecuringDate() {
        return nextRecuringDate;
    }

    public void setNextRecuringDate(LocalDateTime nextRecuringDate) {
        this.nextRecuringDate = nextRecuringDate;
    }

    public String getRecuringTransferId() {
        return recuringTransferId;
    }

    public void setRecuringTransferId(String recuringTransferId) {
        this.recuringTransferId = recuringTransferId;
    }

    public TransferFrequency getRecuringMode() {
        return recuringMode;
    }

    public void setRecuringMode(TransferFrequency recuringMode) {
        this.recuringMode = recuringMode;
    }

    public TransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }

    public String getRelatedPaymentMethodId() {
        return relatedPaymentMethodId;
    }

    public void setRelatedPaymentMethodId(String relatedPaymentMethodId) {
        this.relatedPaymentMethodId = relatedPaymentMethodId;
    }

    public LocalDateTime getRecuringRefDate() {
        return recuringRefDate;
    }

    public void setRecuringRefDate(LocalDateTime recuringRefDate) {
        this.recuringRefDate = recuringRefDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getRelatedMerchantId() {
        return relatedMerchantId;
    }

    public void setRelatedMerchantId(String relatedMerchantId) {
        this.relatedMerchantId = relatedMerchantId;
    }

    public String getRelatedMerchantName() {
        return relatedMerchantName;
    }

    public void setRelatedMerchantName(String relatedMerchantName) {
        this.relatedMerchantName = relatedMerchantName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTrasnferTitle() {
        return trasnferTitle;
    }

    public void setTrasnferTitle(String trasnferTitle) {
        this.trasnferTitle = trasnferTitle;
    }

    public String getTrasnferDescription() {
        return trasnferDescription;
    }

    public void setTrasnferDescription(String trasnferDescription) {
        this.trasnferDescription = trasnferDescription;
    }

    public String getTrasnferExternalSystemNumber() {
        return trasnferExternalSystemNumber;
    }

    public void setTrasnferExternalSystemNumber(String trasnferExternalSystemNumber) {
        this.trasnferExternalSystemNumber = trasnferExternalSystemNumber;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecuringTransfer that = (RecuringTransfer) o;
        return Objects.equals(nextRecuringDate, that.nextRecuringDate) && Objects.equals(recuringTransferId, that.recuringTransferId) && Objects.equals(recuringMode, that.recuringMode) && Objects.equals(transferType, that.transferType) && Objects.equals(relatedPaymentMethodId, that.relatedPaymentMethodId) && Objects.equals(recuringRefDate, that.recuringRefDate) && Objects.equals(createdDate, that.createdDate) && Objects.equals(relatedMerchantId, that.relatedMerchantId) && Objects.equals(relatedMerchantName, that.relatedMerchantName) && Objects.equals(customerName, that.customerName) && Objects.equals(customerId, that.customerId) && Objects.equals(amount, that.amount) && Objects.equals(trasnferTitle, that.trasnferTitle) && Objects.equals(trasnferDescription, that.trasnferDescription) && Objects.equals(trasnferExternalSystemNumber, that.trasnferExternalSystemNumber) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(nextRecuringDate, recuringTransferId, recuringMode, transferType, relatedPaymentMethodId, recuringRefDate, createdDate, relatedMerchantId, relatedMerchantName, customerName, customerId, amount, trasnferTitle, trasnferDescription, trasnferExternalSystemNumber);
    }

    @Override
    public String toString() {
        return "RecuringTransfer{" +
                 "nextRecuringDate='" + nextRecuringDate + '\'' +
 ", recuringTransferId='" + recuringTransferId + '\'' +
 ", recuringMode='" + recuringMode + '\'' +
 ", transferType='" + transferType + '\'' +
 ", relatedPaymentMethodId='" + relatedPaymentMethodId + '\'' +
 ", recuringRefDate='" + recuringRefDate + '\'' +
 ", createdDate='" + createdDate + '\'' +
 ", relatedMerchantId='" + relatedMerchantId + '\'' +
 ", relatedMerchantName='" + relatedMerchantName + '\'' +
 ", customerName='" + customerName + '\'' +
 ", customerId='" + customerId + '\'' +
 ", amount='" + amount + '\'' +
 ", trasnferTitle='" + trasnferTitle + '\'' +
 ", trasnferDescription='" + trasnferDescription + '\'' +
 ", trasnferExternalSystemNumber='" + trasnferExternalSystemNumber + '\'' +

                '}';
    }
}