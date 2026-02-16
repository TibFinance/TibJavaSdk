
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.OperationKind;
import com.tib.api.model.enums.PaymentMethodType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class FeeReportLineItem   {

    
    /**
     * Gets or sets the operation identifier.
     */
    @JsonProperty("OperationId")
    private String operationId;

    /**
     * Identifies the specific transfer operation that needs to be reverted.
     */
    @JsonProperty("TransferId")
    private String transferId;

    /**
     * The date and time when the payment was created.
     */
    @JsonProperty("CreatedDate")
    private LocalDateTime createdDate;

    /**
     * Gets or sets the execution date and time of the transaction.
     */
    @JsonProperty("ExecutedDate")
    private LocalDateTime executedDate;

    /**
     * Retrieves or assigns the monetary amount involved in the transaction.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * Retrieves or assigns the currency type used in transactions.
     */
    @JsonProperty("Currency")
    private Integer currency;

    /**
     * Gets or sets the fee type (OperationKind).
     */
    @JsonProperty("FeeType")
    private OperationKind feeType;

    /**
     * Gets or sets the human-readable fee type description.
     */
    @JsonProperty("FeeTypeDescription")
    private String feeTypeDescription;

    /**
     * Identifies the type of payment method linked to a specific account.
     */
    @JsonProperty("PaymentMethodType")
    private PaymentMethodType paymentMethodType;

    /**
     * Gets or sets the human-readable payment method description.
     */
    @JsonProperty("PaymentMethodTypeDescription")
    private String paymentMethodTypeDescription;

    /**
     * Represents the merchant's unique name.
     */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * This property represents the full name of the customer in the system.
     */
    @JsonProperty("CustomerName")
    private String customerName;

    /**
     * Gets or sets the external reference number from the transfer.
     */
    @JsonProperty("TransferExternalReference")
    private String transferExternalReference;

    /**
     * Retrieves the numeric status code of an operation.
     */
    @JsonProperty("OperationStatus")
    private Integer operationStatus;


    
    public FeeReportLineItem() {
    }

    
    public FeeReportLineItem(String operationId, String transferId, LocalDateTime createdDate, LocalDateTime executedDate, Double amount, Integer currency, OperationKind feeType, String feeTypeDescription, PaymentMethodType paymentMethodType, String paymentMethodTypeDescription, String merchantName, String merchantId, String customerName, String transferExternalReference, Integer operationStatus) {
        this.operationId = operationId;
        this.transferId = transferId;
        this.createdDate = createdDate;
        this.executedDate = executedDate;
        this.amount = amount;
        this.currency = currency;
        this.feeType = feeType;
        this.feeTypeDescription = feeTypeDescription;
        this.paymentMethodType = paymentMethodType;
        this.paymentMethodTypeDescription = paymentMethodTypeDescription;
        this.merchantName = merchantName;
        this.merchantId = merchantId;
        this.customerName = customerName;
        this.transferExternalReference = transferExternalReference;
        this.operationStatus = operationStatus;
    }
    
    

    
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getExecutedDate() {
        return executedDate;
    }

    public void setExecutedDate(LocalDateTime executedDate) {
        this.executedDate = executedDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public OperationKind getFeeType() {
        return feeType;
    }

    public void setFeeType(OperationKind feeType) {
        this.feeType = feeType;
    }

    public String getFeeTypeDescription() {
        return feeTypeDescription;
    }

    public void setFeeTypeDescription(String feeTypeDescription) {
        this.feeTypeDescription = feeTypeDescription;
    }

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public String getPaymentMethodTypeDescription() {
        return paymentMethodTypeDescription;
    }

    public void setPaymentMethodTypeDescription(String paymentMethodTypeDescription) {
        this.paymentMethodTypeDescription = paymentMethodTypeDescription;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTransferExternalReference() {
        return transferExternalReference;
    }

    public void setTransferExternalReference(String transferExternalReference) {
        this.transferExternalReference = transferExternalReference;
    }

    public Integer getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(Integer operationStatus) {
        this.operationStatus = operationStatus;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeeReportLineItem that = (FeeReportLineItem) o;
        return Objects.equals(operationId, that.operationId) && Objects.equals(transferId, that.transferId) && Objects.equals(createdDate, that.createdDate) && Objects.equals(executedDate, that.executedDate) && Objects.equals(amount, that.amount) && Objects.equals(currency, that.currency) && Objects.equals(feeType, that.feeType) && Objects.equals(feeTypeDescription, that.feeTypeDescription) && Objects.equals(paymentMethodType, that.paymentMethodType) && Objects.equals(paymentMethodTypeDescription, that.paymentMethodTypeDescription) && Objects.equals(merchantName, that.merchantName) && Objects.equals(merchantId, that.merchantId) && Objects.equals(customerName, that.customerName) && Objects.equals(transferExternalReference, that.transferExternalReference) && Objects.equals(operationStatus, that.operationStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(operationId, transferId, createdDate, executedDate, amount, currency, feeType, feeTypeDescription, paymentMethodType, paymentMethodTypeDescription, merchantName, merchantId, customerName, transferExternalReference, operationStatus);
    }

    @Override
    public String toString() {
        return "FeeReportLineItem{" +
                "operationId='" + operationId + '\'' +
                ", transferId='" + transferId + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", executedDate='" + executedDate + '\'' +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", feeType='" + feeType + '\'' +
                ", feeTypeDescription='" + feeTypeDescription + '\'' +
                ", paymentMethodType='" + paymentMethodType + '\'' +
                ", paymentMethodTypeDescription='" + paymentMethodTypeDescription + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", transferExternalReference='" + transferExternalReference + '\'' +
                ", operationStatus='" + operationStatus + '\'' +

                '}';
    }
}