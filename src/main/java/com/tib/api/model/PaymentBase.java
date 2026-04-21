
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.PaymentEntity;
import com.tib.api.model.enums.ProcessStatus;
import com.tib.api.model.enums.PaymentMethodType;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class PaymentBase   {

    
    /**
     * Unique identifier of the bill to be paid
     */
    @JsonProperty("BillId")
    private String billId;

    /**
     * External system's primary bill identifier returned for the transfer
     */
    @JsonProperty("BillExternalSystemNumber1")
    private String billExternalSystemNumber1;

    /**
     * Secondary external system identifier associated with the bill.
     */
    @JsonProperty("BillExternalSystemNumber2")
    private String billExternalSystemNumber2;

    /**
     * The third external system identifier associated with the bill.
     */
    @JsonProperty("BillExternalSystemNumber3")
    private String billExternalSystemNumber3;

    /**
     * The title or description of the bill linked to the transfer.
     */
    @JsonProperty("BillTitle")
    private String billTitle;

    /**
     * Identifier of the customer associated with the payment
     */
    @JsonProperty("RelatedCustomerId")
    private String relatedCustomerId;

    /**
     * External identifier of the customer on the opposite side of the transfer.
     */
    @JsonProperty("RelatedCustomerExternalId")
    private String relatedCustomerExternalId;

    /**
     * The textual description of the bill associated with the transfer.
     */
    @JsonProperty("BillDescription")
    private String billDescription;

    /**
     * Unique identifier of the newly created payment
     */
    @JsonProperty("PaymentId")
    private String paymentId;

    /**
     * Indicates whether the listed transfer was created automatically (e.g., scheduled or recurring).
     */
    @JsonProperty("IsAutomaticPayment")
    private boolean isAutomaticPayment;

    /**
     * PaymentInfo provides the full set of data required to create a new payment.
     */
    @JsonProperty("PaymentInfo")
    private PaymentEntity paymentInfo;

    /**
     * Indicates whether the listed transfer has been marked as resolved.
     */
    @JsonProperty("IsMarkResolved")
    private boolean isMarkResolved;

    /**
     * The current processing status of the transfer.
     */
    @JsonProperty("CurrentStatus")
    private ProcessStatus currentStatus;

    /**
     * The fee amount applied to a credit‑card transfer when the convenient fee option is used.
     */
    @JsonProperty("ConvenientFeeCreditCard")
    private Double convenientFeeCreditCard;

    /**
     * The convenience fee charged for a direct account transfer.
     */
    @JsonProperty("ConvenientFeeDirectAccount")
    private Double convenientFeeDirectAccount;

    /**
     * The date and time when the recurring transfer was initially created.
     */
    @JsonProperty("CreatedDate")
    private OffsetDateTime createdDate;

    /**
     * Descriptive name of the payment method used for the transfer.
     */
    @JsonProperty("PaymentMethodDescription")
    private String paymentMethodDescription;

    /**
     * A short preview of the account involved in the transfer.
     */
    @JsonProperty("AccountInformationPreview")
    private String accountInformationPreview;

    /**
     * The payment method type employed for the transfer.
     */
    @JsonProperty("PaymentMethodType")
    private PaymentMethodType paymentMethodType;


    
    public PaymentBase() {
    }

    
    public PaymentBase(String billId, String billExternalSystemNumber1, String billExternalSystemNumber2, String billExternalSystemNumber3, String billTitle, String relatedCustomerId, String relatedCustomerExternalId, String billDescription, String paymentId, boolean isAutomaticPayment, PaymentEntity paymentInfo, boolean isMarkResolved, ProcessStatus currentStatus, Double convenientFeeCreditCard, Double convenientFeeDirectAccount, OffsetDateTime createdDate, String paymentMethodDescription, String accountInformationPreview, PaymentMethodType paymentMethodType) {
        this.billId = billId;
        this.billExternalSystemNumber1 = billExternalSystemNumber1;
        this.billExternalSystemNumber2 = billExternalSystemNumber2;
        this.billExternalSystemNumber3 = billExternalSystemNumber3;
        this.billTitle = billTitle;
        this.relatedCustomerId = relatedCustomerId;
        this.relatedCustomerExternalId = relatedCustomerExternalId;
        this.billDescription = billDescription;
        this.paymentId = paymentId;
        this.isAutomaticPayment = isAutomaticPayment;
        this.paymentInfo = paymentInfo;
        this.isMarkResolved = isMarkResolved;
        this.currentStatus = currentStatus;
        this.convenientFeeCreditCard = convenientFeeCreditCard;
        this.convenientFeeDirectAccount = convenientFeeDirectAccount;
        this.createdDate = createdDate;
        this.paymentMethodDescription = paymentMethodDescription;
        this.accountInformationPreview = accountInformationPreview;
        this.paymentMethodType = paymentMethodType;
    }
    
    

    
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getBillExternalSystemNumber1() {
        return billExternalSystemNumber1;
    }

    public void setBillExternalSystemNumber1(String billExternalSystemNumber1) {
        this.billExternalSystemNumber1 = billExternalSystemNumber1;
    }

    public String getBillExternalSystemNumber2() {
        return billExternalSystemNumber2;
    }

    public void setBillExternalSystemNumber2(String billExternalSystemNumber2) {
        this.billExternalSystemNumber2 = billExternalSystemNumber2;
    }

    public String getBillExternalSystemNumber3() {
        return billExternalSystemNumber3;
    }

    public void setBillExternalSystemNumber3(String billExternalSystemNumber3) {
        this.billExternalSystemNumber3 = billExternalSystemNumber3;
    }

    public String getBillTitle() {
        return billTitle;
    }

    public void setBillTitle(String billTitle) {
        this.billTitle = billTitle;
    }

    public String getRelatedCustomerId() {
        return relatedCustomerId;
    }

    public void setRelatedCustomerId(String relatedCustomerId) {
        this.relatedCustomerId = relatedCustomerId;
    }

    public String getRelatedCustomerExternalId() {
        return relatedCustomerExternalId;
    }

    public void setRelatedCustomerExternalId(String relatedCustomerExternalId) {
        this.relatedCustomerExternalId = relatedCustomerExternalId;
    }

    public String getBillDescription() {
        return billDescription;
    }

    public void setBillDescription(String billDescription) {
        this.billDescription = billDescription;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public boolean getIsAutomaticPayment() {
        return isAutomaticPayment;
    }

    public void setIsAutomaticPayment(boolean isAutomaticPayment) {
        this.isAutomaticPayment = isAutomaticPayment;
    }

    public PaymentEntity getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentEntity paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public boolean getIsMarkResolved() {
        return isMarkResolved;
    }

    public void setIsMarkResolved(boolean isMarkResolved) {
        this.isMarkResolved = isMarkResolved;
    }

    public ProcessStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(ProcessStatus currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Double getConvenientFeeCreditCard() {
        return convenientFeeCreditCard;
    }

    public void setConvenientFeeCreditCard(Double convenientFeeCreditCard) {
        this.convenientFeeCreditCard = convenientFeeCreditCard;
    }

    public Double getConvenientFeeDirectAccount() {
        return convenientFeeDirectAccount;
    }

    public void setConvenientFeeDirectAccount(Double convenientFeeDirectAccount) {
        this.convenientFeeDirectAccount = convenientFeeDirectAccount;
    }

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getPaymentMethodDescription() {
        return paymentMethodDescription;
    }

    public void setPaymentMethodDescription(String paymentMethodDescription) {
        this.paymentMethodDescription = paymentMethodDescription;
    }

    public String getAccountInformationPreview() {
        return accountInformationPreview;
    }

    public void setAccountInformationPreview(String accountInformationPreview) {
        this.accountInformationPreview = accountInformationPreview;
    }

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentBase that = (PaymentBase) o;
        return Objects.equals(billId, that.billId) && Objects.equals(billExternalSystemNumber1, that.billExternalSystemNumber1) && Objects.equals(billExternalSystemNumber2, that.billExternalSystemNumber2) && Objects.equals(billExternalSystemNumber3, that.billExternalSystemNumber3) && Objects.equals(billTitle, that.billTitle) && Objects.equals(relatedCustomerId, that.relatedCustomerId) && Objects.equals(relatedCustomerExternalId, that.relatedCustomerExternalId) && Objects.equals(billDescription, that.billDescription) && Objects.equals(paymentId, that.paymentId) && Objects.equals(isAutomaticPayment, that.isAutomaticPayment) && Objects.equals(paymentInfo, that.paymentInfo) && Objects.equals(isMarkResolved, that.isMarkResolved) && Objects.equals(currentStatus, that.currentStatus) && Objects.equals(convenientFeeCreditCard, that.convenientFeeCreditCard) && Objects.equals(convenientFeeDirectAccount, that.convenientFeeDirectAccount) && Objects.equals(createdDate, that.createdDate) && Objects.equals(paymentMethodDescription, that.paymentMethodDescription) && Objects.equals(accountInformationPreview, that.accountInformationPreview) && Objects.equals(paymentMethodType, that.paymentMethodType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(billId, billExternalSystemNumber1, billExternalSystemNumber2, billExternalSystemNumber3, billTitle, relatedCustomerId, relatedCustomerExternalId, billDescription, paymentId, isAutomaticPayment, paymentInfo, isMarkResolved, currentStatus, convenientFeeCreditCard, convenientFeeDirectAccount, createdDate, paymentMethodDescription, accountInformationPreview, paymentMethodType);
    }

    @Override
    public String toString() {
        return "PaymentBase{" +
                "billId='" + billId + '\'' +
                ", billExternalSystemNumber1='" + billExternalSystemNumber1 + '\'' +
                ", billExternalSystemNumber2='" + billExternalSystemNumber2 + '\'' +
                ", billExternalSystemNumber3='" + billExternalSystemNumber3 + '\'' +
                ", billTitle='" + billTitle + '\'' +
                ", relatedCustomerId='" + relatedCustomerId + '\'' +
                ", relatedCustomerExternalId='" + relatedCustomerExternalId + '\'' +
                ", billDescription='" + billDescription + '\'' +
                ", paymentId='" + paymentId + '\'' +
                ", isAutomaticPayment='" + isAutomaticPayment + '\'' +
                ", paymentInfo='" + paymentInfo + '\'' +
                ", isMarkResolved='" + isMarkResolved + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                ", convenientFeeCreditCard='" + convenientFeeCreditCard + '\'' +
                ", convenientFeeDirectAccount='" + convenientFeeDirectAccount + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", paymentMethodDescription='" + paymentMethodDescription + '\'' +
                ", accountInformationPreview='" + accountInformationPreview + '\'' +
                ", paymentMethodType='" + paymentMethodType + '\'' +

                '}';
    }
}