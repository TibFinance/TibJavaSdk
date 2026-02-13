package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TransferFrequency;

import java.util.Objects;

public class RecuringTransfers {

    @JsonProperty("RecuringTransferId")
    private String recuringTransferId;

    @JsonProperty("RecuringMode")
    private TransferFrequency recuringMode;

    @JsonProperty("RecuringRefDate")
    private String recuringRefDate;
    @JsonProperty("CreatedDate")
    private String createdDate;
    @JsonProperty("RelatedMerchantId")
    private String relatedMerchantId;
    @JsonProperty("RelatedMerchantName")
    private String relatedMerchantName;
    @JsonProperty("CustomerName")
    private String customerName;
    @JsonProperty("RelatedCustomerId")
    private String relatedCustomerId;
    @JsonProperty("Amount")
    private Double amount;

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

    public String getRecuringRefDate() {
        return recuringRefDate;
    }

    public void setRecuringRefDate(String recuringRefDate) {
        this.recuringRefDate = recuringRefDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
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

    public String getRelatedCustomerId() {
        return relatedCustomerId;
    }

    public void setRelatedCustomerId(String relatedCustomerId) {
        this.relatedCustomerId = relatedCustomerId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecuringTransfers that = (RecuringTransfers) o;
        return Objects.equals(recuringTransferId, that.recuringTransferId) &&
                recuringMode == that.recuringMode &&
                Objects.equals(recuringRefDate, that.recuringRefDate) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(relatedMerchantId, that.relatedMerchantId) &&
                Objects.equals(relatedMerchantName, that.relatedMerchantName) &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(relatedCustomerId, that.relatedCustomerId) &&
                Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recuringTransferId, recuringMode, recuringRefDate, createdDate, relatedMerchantId, relatedMerchantName, customerName, relatedCustomerId, amount);
    }

    @Override
    public String toString() {
        return "RecuringTransfers{" +
                "recuringTransferId='" + recuringTransferId + '\'' +
                ", recuringMode=" + recuringMode +
                ", recuringRefDate='" + recuringRefDate + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", relatedMerchantId='" + relatedMerchantId + '\'' +
                ", relatedMerchantName='" + relatedMerchantName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", relatedCustomerId='" + relatedCustomerId + '\'' +
                ", amount=" + amount +
                '}';
    }
}
