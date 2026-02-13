
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.PaymentEntity;
import com.tib.api.model.enums.ProcessStatus;
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


public class PaymentBase   {

    
    /**
 * Retrieves or assigns the unique identifier for a bill.
 */
    @JsonProperty("BillId")
    private String billId;

    /**
 * Identifier utilized by an external system for bill tracking.
 */
    @JsonProperty("BillExternalSystemNumber1")
    private String billExternalSystemNumber1;

    /**
 * Represents the identifier used by an external system for billing purposes.
 */
    @JsonProperty("BillExternalSystemNumber2")
    private String billExternalSystemNumber2;

    /**
 * Identifier utilized by an external system for bill tracking.
 */
    @JsonProperty("BillExternalSystemNumber3")
    private String billExternalSystemNumber3;

    /**
 * Represents the title of a bill associated with a payment.
 */
    @JsonProperty("BillTitle")
    private String billTitle;

    /**
 * Identifies the customer linked to this payment, when a customer relationship exists.
 */
    @JsonProperty("RelatedCustomerId")
    private String relatedCustomerId;

    /**
 * Identifies the external customer associated with the payment, when applicable.
 */
    @JsonProperty("RelatedCustomerExternalId")
    private String relatedCustomerExternalId;

    /**
 * Provides a textual description of the bill associated with a payment.
 */
    @JsonProperty("BillDescription")
    private String billDescription;

    /**
 * Retrieves or assigns the unique identifier for a payment.
 */
    @JsonProperty("PaymentId")
    private String paymentId;

    /**
 * Indicates whether the payment is processed automatically without user intervention.
 */
    @JsonProperty("IsAutomaticPayment")
    private boolean isAutomaticPayment;

    /**
 * Contains metadata for a payment operation.
 */
    @JsonProperty("PaymentInfo")
    private PaymentEntity paymentInfo;

    /**
 * Flag used to indicate that the payment is resolved in the third‑party system. It is employed solely for filtering payment lists.
 */
    @JsonProperty("IsMarkResolved")
    private boolean isMarkResolved;

    /**
 * Current processing state of a transaction or operation.
 */
    @JsonProperty("CurrentStatus")
    private ProcessStatus currentStatus;

    /**
 * Gets or sets the fee applied to credit‑card transactions when the convenient fee option is used.
 */
    @JsonProperty("ConvenientFeeCreditCard")
    private Double convenientFeeCreditCard;

    /**
 * Gets or sets the fee amount that is directly applied to the merchant's account for convenience services.
 */
    @JsonProperty("ConvenientFeeDirectAccount")
    private Double convenientFeeDirectAccount;

    /**
 * The date and time when the payment was created.
 */
    @JsonProperty("CreatedDate")
    private LocalDateTime createdDate;

    /**
 * Provides a detailed description of the payment method for easy identification.
 */
    @JsonProperty("PaymentMethodDescription")
    private String paymentMethodDescription;

    /**
 * Provides a read‑only preview of the merchant’s bank account information.
 */
    @JsonProperty("AccountInformationPreview")
    private String accountInformationPreview;

    /**
 * Identifies the type of payment method linked to a specific account.
 */
    @JsonProperty("PaymentMethodType")
    private PaymentMethodType paymentMethodType;


    
    public PaymentBase() {
    }

    
    public PaymentBase(String billId, String billExternalSystemNumber1, String billExternalSystemNumber2, String billExternalSystemNumber3, String billTitle, String relatedCustomerId, String relatedCustomerExternalId, String billDescription, String paymentId, boolean isAutomaticPayment, PaymentEntity paymentInfo, boolean isMarkResolved, ProcessStatus currentStatus, Double convenientFeeCreditCard, Double convenientFeeDirectAccount, LocalDateTime createdDate, String paymentMethodDescription, String accountInformationPreview, PaymentMethodType paymentMethodType) {
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

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
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