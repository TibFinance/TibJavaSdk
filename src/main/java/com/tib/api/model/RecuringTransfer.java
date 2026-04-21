
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TransferFrequency;
import com.tib.api.model.enums.TransferType;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class RecuringTransfer   {

    
    /**
     * The date and time when the next recurring transfer is scheduled to occur.
     */
    @JsonProperty("NextRecuringDate")
    private OffsetDateTime nextRecuringDate;

    /**
     * Identifier of the recurring transfer to delete
     */
    @JsonProperty("RecuringTransferId")
    private String recuringTransferId;

    /**
     * Specifies the frequency at which the transfer recurs.
     */
    @JsonProperty("RecuringMode")
    private TransferFrequency recuringMode;

    /**
     * Indicates the category of the recurring transfer (e.g., inbound, outbound, internal).
     */
    @JsonProperty("TransferType")
    private TransferType transferType;

    /**
     * Identifier of the payment method linked to the recurring transfer.
     */
    @JsonProperty("RelatedPaymentMethodId")
    private String relatedPaymentMethodId;

    /**
     * The reference date from which the recurring transfer schedule is calculated.
     */
    @JsonProperty("RecuringRefDate")
    private OffsetDateTime recuringRefDate;

    /**
     * The date and time when the recurring transfer was initially created.
     */
    @JsonProperty("CreatedDate")
    private OffsetDateTime createdDate;

    /**
     * Unique identifier of the merchant linked to the recurring transfer.
     */
    @JsonProperty("RelatedMerchantId")
    private String relatedMerchantId;

    /**
     * The name of the merchant linked to the recurring transfer.
     */
    @JsonProperty("RelatedMerchantName")
    private String relatedMerchantName;

    /**
     * The full name of the customer who owns the recurring transfer.
     */
    @JsonProperty("CustomerName")
    private String customerName;

    /**
     * Unique identifier of the customer owning the recurring transfers
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * The monetary value of each recurring transfer.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * The descriptive title of the recurring transfer.
     */
    @JsonProperty("TrasnferTitle")
    private String trasnferTitle;

    /**
     * A textual description of the recurring transfer.
     */
    @JsonProperty("TrasnferDescription")
    private String trasnferDescription;

    /**
     * Identifier assigned by the external system for the recurring transfer
     */
    @JsonProperty("TrasnferExternalSystemNumber")
    private String trasnferExternalSystemNumber;

    /**
     * The date on which the recurring transfer series terminates.
     */
    @JsonProperty("EndDate")
    private OffsetDateTime endDate;


    
    public RecuringTransfer() {
    }

    
    public RecuringTransfer(OffsetDateTime nextRecuringDate, String recuringTransferId, TransferFrequency recuringMode, TransferType transferType, String relatedPaymentMethodId, OffsetDateTime recuringRefDate, OffsetDateTime createdDate, String relatedMerchantId, String relatedMerchantName, String customerName, String customerId, Double amount, String trasnferTitle, String trasnferDescription, String trasnferExternalSystemNumber, OffsetDateTime endDate) {
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
        this.endDate = endDate;
    }
    
    

    
    public OffsetDateTime getNextRecuringDate() {
        return nextRecuringDate;
    }

    public void setNextRecuringDate(OffsetDateTime nextRecuringDate) {
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

    public OffsetDateTime getRecuringRefDate() {
        return recuringRefDate;
    }

    public void setRecuringRefDate(OffsetDateTime recuringRefDate) {
        this.recuringRefDate = recuringRefDate;
    }

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
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

    public OffsetDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecuringTransfer that = (RecuringTransfer) o;
        return Objects.equals(nextRecuringDate, that.nextRecuringDate) && Objects.equals(recuringTransferId, that.recuringTransferId) && Objects.equals(recuringMode, that.recuringMode) && Objects.equals(transferType, that.transferType) && Objects.equals(relatedPaymentMethodId, that.relatedPaymentMethodId) && Objects.equals(recuringRefDate, that.recuringRefDate) && Objects.equals(createdDate, that.createdDate) && Objects.equals(relatedMerchantId, that.relatedMerchantId) && Objects.equals(relatedMerchantName, that.relatedMerchantName) && Objects.equals(customerName, that.customerName) && Objects.equals(customerId, that.customerId) && Objects.equals(amount, that.amount) && Objects.equals(trasnferTitle, that.trasnferTitle) && Objects.equals(trasnferDescription, that.trasnferDescription) && Objects.equals(trasnferExternalSystemNumber, that.trasnferExternalSystemNumber) && Objects.equals(endDate, that.endDate) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(nextRecuringDate, recuringTransferId, recuringMode, transferType, relatedPaymentMethodId, recuringRefDate, createdDate, relatedMerchantId, relatedMerchantName, customerName, customerId, amount, trasnferTitle, trasnferDescription, trasnferExternalSystemNumber, endDate);
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
                ", endDate='" + endDate + '\'' +

                '}';
    }
}