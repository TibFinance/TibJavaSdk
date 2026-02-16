
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.enums.OperationKind;
import com.tib.api.model.enums.ProcessStatus;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class PaymentOperationWithHierarchy   {

    
    /**
     * Retrieves or assigns the unique identifier for a payment.
     */
    @JsonProperty("PaymentId")
    private String paymentId;

    /**
     * Retrieves or assigns the unique identifier for a bill.
     */
    @JsonProperty("BillId")
    private String billId;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Gets or sets the payment group identifier.
     */
    @JsonProperty("PaymentGroupId")
    private String paymentGroupId;

    /**
     * Gets or sets the monetary amount associated with an operation.
     */
    @JsonProperty("OperationAmount")
    private Double operationAmount;

    /**
     * Retrieves or assigns the currency type used in transactions.
     */
    @JsonProperty("Currency")
    private Currency currency;

    /**
     * Specifies the direction of the operation, indicating whether funds are being collected or deposited.
     */
    @JsonProperty("OperationDirection")
    private TransferDirection operationDirection;

    /**
     * Specifies the category of a financial operation.
     */
    @JsonProperty("OperationKind")
    private OperationKind operationKind;

    /**
     * Gets or sets the operation created date.
     */
    @JsonProperty("OperationCreatedDate")
    private LocalDateTime operationCreatedDate;

    /**
     * Gets or sets the related payment amount.
     */
    @JsonProperty("RelatedPaymentAmount")
    private Double relatedPaymentAmount;

    /**
     * Gets or sets the related payment convenient fees for credit card.
     */
    @JsonProperty("RelatedPaymentConvenientFeesForCreditCard")
    private Double relatedPaymentConvenientFeesForCreditCard;

    /**
     * Gets or sets the related payment convenient fees for direct account.
     */
    @JsonProperty("RelatedPaymentConvenientFeesForDirectAccount")
    private Double relatedPaymentConvenientFeesForDirectAccount;

    /**
     * Gets or sets the related payment current status.
     */
    @JsonProperty("RelatedPaymentCurrentStatus")
    private ProcessStatus relatedPaymentCurrentStatus;

    /**
     * Gets or sets the related payment created date.
     */
    @JsonProperty("RelatedPaymentCreatedDate")
    private LocalDateTime relatedPaymentCreatedDate;

    /**
     * Gets or sets the related payment customer identifier.
     */
    @JsonProperty("RelatedPaymentCustomerId")
    private String relatedPaymentCustomerId;


    
    public PaymentOperationWithHierarchy() {
    }

    
    public PaymentOperationWithHierarchy(String paymentId, String billId, String merchantId, String paymentGroupId, Double operationAmount, Currency currency, TransferDirection operationDirection, OperationKind operationKind, LocalDateTime operationCreatedDate, Double relatedPaymentAmount, Double relatedPaymentConvenientFeesForCreditCard, Double relatedPaymentConvenientFeesForDirectAccount, ProcessStatus relatedPaymentCurrentStatus, LocalDateTime relatedPaymentCreatedDate, String relatedPaymentCustomerId) {
        this.paymentId = paymentId;
        this.billId = billId;
        this.merchantId = merchantId;
        this.paymentGroupId = paymentGroupId;
        this.operationAmount = operationAmount;
        this.currency = currency;
        this.operationDirection = operationDirection;
        this.operationKind = operationKind;
        this.operationCreatedDate = operationCreatedDate;
        this.relatedPaymentAmount = relatedPaymentAmount;
        this.relatedPaymentConvenientFeesForCreditCard = relatedPaymentConvenientFeesForCreditCard;
        this.relatedPaymentConvenientFeesForDirectAccount = relatedPaymentConvenientFeesForDirectAccount;
        this.relatedPaymentCurrentStatus = relatedPaymentCurrentStatus;
        this.relatedPaymentCreatedDate = relatedPaymentCreatedDate;
        this.relatedPaymentCustomerId = relatedPaymentCustomerId;
    }
    
    

    
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getPaymentGroupId() {
        return paymentGroupId;
    }

    public void setPaymentGroupId(String paymentGroupId) {
        this.paymentGroupId = paymentGroupId;
    }

    public Double getOperationAmount() {
        return operationAmount;
    }

    public void setOperationAmount(Double operationAmount) {
        this.operationAmount = operationAmount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public TransferDirection getOperationDirection() {
        return operationDirection;
    }

    public void setOperationDirection(TransferDirection operationDirection) {
        this.operationDirection = operationDirection;
    }

    public OperationKind getOperationKind() {
        return operationKind;
    }

    public void setOperationKind(OperationKind operationKind) {
        this.operationKind = operationKind;
    }

    public LocalDateTime getOperationCreatedDate() {
        return operationCreatedDate;
    }

    public void setOperationCreatedDate(LocalDateTime operationCreatedDate) {
        this.operationCreatedDate = operationCreatedDate;
    }

    public Double getRelatedPaymentAmount() {
        return relatedPaymentAmount;
    }

    public void setRelatedPaymentAmount(Double relatedPaymentAmount) {
        this.relatedPaymentAmount = relatedPaymentAmount;
    }

    public Double getRelatedPaymentConvenientFeesForCreditCard() {
        return relatedPaymentConvenientFeesForCreditCard;
    }

    public void setRelatedPaymentConvenientFeesForCreditCard(Double relatedPaymentConvenientFeesForCreditCard) {
        this.relatedPaymentConvenientFeesForCreditCard = relatedPaymentConvenientFeesForCreditCard;
    }

    public Double getRelatedPaymentConvenientFeesForDirectAccount() {
        return relatedPaymentConvenientFeesForDirectAccount;
    }

    public void setRelatedPaymentConvenientFeesForDirectAccount(Double relatedPaymentConvenientFeesForDirectAccount) {
        this.relatedPaymentConvenientFeesForDirectAccount = relatedPaymentConvenientFeesForDirectAccount;
    }

    public ProcessStatus getRelatedPaymentCurrentStatus() {
        return relatedPaymentCurrentStatus;
    }

    public void setRelatedPaymentCurrentStatus(ProcessStatus relatedPaymentCurrentStatus) {
        this.relatedPaymentCurrentStatus = relatedPaymentCurrentStatus;
    }

    public LocalDateTime getRelatedPaymentCreatedDate() {
        return relatedPaymentCreatedDate;
    }

    public void setRelatedPaymentCreatedDate(LocalDateTime relatedPaymentCreatedDate) {
        this.relatedPaymentCreatedDate = relatedPaymentCreatedDate;
    }

    public String getRelatedPaymentCustomerId() {
        return relatedPaymentCustomerId;
    }

    public void setRelatedPaymentCustomerId(String relatedPaymentCustomerId) {
        this.relatedPaymentCustomerId = relatedPaymentCustomerId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentOperationWithHierarchy that = (PaymentOperationWithHierarchy) o;
        return Objects.equals(paymentId, that.paymentId) && Objects.equals(billId, that.billId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(paymentGroupId, that.paymentGroupId) && Objects.equals(operationAmount, that.operationAmount) && Objects.equals(currency, that.currency) && Objects.equals(operationDirection, that.operationDirection) && Objects.equals(operationKind, that.operationKind) && Objects.equals(operationCreatedDate, that.operationCreatedDate) && Objects.equals(relatedPaymentAmount, that.relatedPaymentAmount) && Objects.equals(relatedPaymentConvenientFeesForCreditCard, that.relatedPaymentConvenientFeesForCreditCard) && Objects.equals(relatedPaymentConvenientFeesForDirectAccount, that.relatedPaymentConvenientFeesForDirectAccount) && Objects.equals(relatedPaymentCurrentStatus, that.relatedPaymentCurrentStatus) && Objects.equals(relatedPaymentCreatedDate, that.relatedPaymentCreatedDate) && Objects.equals(relatedPaymentCustomerId, that.relatedPaymentCustomerId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentId, billId, merchantId, paymentGroupId, operationAmount, currency, operationDirection, operationKind, operationCreatedDate, relatedPaymentAmount, relatedPaymentConvenientFeesForCreditCard, relatedPaymentConvenientFeesForDirectAccount, relatedPaymentCurrentStatus, relatedPaymentCreatedDate, relatedPaymentCustomerId);
    }

    @Override
    public String toString() {
        return "PaymentOperationWithHierarchy{" +
                "paymentId='" + paymentId + '\'' +
                ", billId='" + billId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", paymentGroupId='" + paymentGroupId + '\'' +
                ", operationAmount='" + operationAmount + '\'' +
                ", currency='" + currency + '\'' +
                ", operationDirection='" + operationDirection + '\'' +
                ", operationKind='" + operationKind + '\'' +
                ", operationCreatedDate='" + operationCreatedDate + '\'' +
                ", relatedPaymentAmount='" + relatedPaymentAmount + '\'' +
                ", relatedPaymentConvenientFeesForCreditCard='" + relatedPaymentConvenientFeesForCreditCard + '\'' +
                ", relatedPaymentConvenientFeesForDirectAccount='" + relatedPaymentConvenientFeesForDirectAccount + '\'' +
                ", relatedPaymentCurrentStatus='" + relatedPaymentCurrentStatus + '\'' +
                ", relatedPaymentCreatedDate='" + relatedPaymentCreatedDate + '\'' +
                ", relatedPaymentCustomerId='" + relatedPaymentCustomerId + '\'' +

                '}';
    }
}