
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
     * Date and time this recurring transfer was created.
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
     * Name of the customer for this recurring transfer (empty if the customer record was deleted). For supplier transfers the paying merchant is represented as a customer of the supplier, so this carries the paying merchant's name as snapshotted when that customer record was created — later merchant renames do not propagate here.
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

    /**
     * True when this recurring schedule is a supplier transfer (the supplier receives funds and a separate paying merchant is billed).
     */
    @JsonProperty("IsSupplierTransfer")
    private boolean isSupplierTransfer;

    /**
     * Display name of the merchant that pays for the supplier transfer. Populated only by GetRecuringTransfers, and only when the recurring transfer is a supplier transfer whose fee-paying merchant still resolves. Always null on ListSupplierRecurringTransfers and ListSupplierRecurringTransfersByService — on those listings the paying merchant surfaces as CustomerName instead.
     */
    @JsonProperty("PayerMerchantName")
    private String payerMerchantName;

    /**
     * True when the caller is on the paying side of this transfer. ListSupplierRecurringTransfers and ListSupplierRecurringTransfersByService always return true — their rows list transfers from the paying side by construction. GetRecuringTransfers computes it: false when the caller is the supplier-side recipient of a transfer paid by another merchant. Rows where this is false are informational — the server rejects attempts to update or delete them.
     */
    @JsonProperty("IsCurrentUserPayer")
    private boolean isCurrentUserPayer;


    
    public RecuringTransfer() {
    }

    
    public RecuringTransfer(OffsetDateTime nextRecuringDate, String recuringTransferId, TransferFrequency recuringMode, TransferType transferType, String relatedPaymentMethodId, OffsetDateTime recuringRefDate, OffsetDateTime createdDate, String relatedMerchantId, String relatedMerchantName, String customerName, String customerId, Double amount, String trasnferTitle, String trasnferDescription, String trasnferExternalSystemNumber, OffsetDateTime endDate, boolean isSupplierTransfer, String payerMerchantName, boolean isCurrentUserPayer) {
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
        this.isSupplierTransfer = isSupplierTransfer;
        this.payerMerchantName = payerMerchantName;
        this.isCurrentUserPayer = isCurrentUserPayer;
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

    public boolean getIsSupplierTransfer() {
        return isSupplierTransfer;
    }

    public void setIsSupplierTransfer(boolean isSupplierTransfer) {
        this.isSupplierTransfer = isSupplierTransfer;
    }

    public String getPayerMerchantName() {
        return payerMerchantName;
    }

    public void setPayerMerchantName(String payerMerchantName) {
        this.payerMerchantName = payerMerchantName;
    }

    public boolean getIsCurrentUserPayer() {
        return isCurrentUserPayer;
    }

    public void setIsCurrentUserPayer(boolean isCurrentUserPayer) {
        this.isCurrentUserPayer = isCurrentUserPayer;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecuringTransfer that = (RecuringTransfer) o;
        return Objects.equals(nextRecuringDate, that.nextRecuringDate) && Objects.equals(recuringTransferId, that.recuringTransferId) && Objects.equals(recuringMode, that.recuringMode) && Objects.equals(transferType, that.transferType) && Objects.equals(relatedPaymentMethodId, that.relatedPaymentMethodId) && Objects.equals(recuringRefDate, that.recuringRefDate) && Objects.equals(createdDate, that.createdDate) && Objects.equals(relatedMerchantId, that.relatedMerchantId) && Objects.equals(relatedMerchantName, that.relatedMerchantName) && Objects.equals(customerName, that.customerName) && Objects.equals(customerId, that.customerId) && Objects.equals(amount, that.amount) && Objects.equals(trasnferTitle, that.trasnferTitle) && Objects.equals(trasnferDescription, that.trasnferDescription) && Objects.equals(trasnferExternalSystemNumber, that.trasnferExternalSystemNumber) && Objects.equals(endDate, that.endDate) && Objects.equals(isSupplierTransfer, that.isSupplierTransfer) && Objects.equals(payerMerchantName, that.payerMerchantName) && Objects.equals(isCurrentUserPayer, that.isCurrentUserPayer) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(nextRecuringDate, recuringTransferId, recuringMode, transferType, relatedPaymentMethodId, recuringRefDate, createdDate, relatedMerchantId, relatedMerchantName, customerName, customerId, amount, trasnferTitle, trasnferDescription, trasnferExternalSystemNumber, endDate, isSupplierTransfer, payerMerchantName, isCurrentUserPayer);
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
                ", isSupplierTransfer='" + isSupplierTransfer + '\'' +
                ", payerMerchantName='" + payerMerchantName + '\'' +
                ", isCurrentUserPayer='" + isCurrentUserPayer + '\'' +

                '}';
    }
}