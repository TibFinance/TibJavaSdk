
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.PayoutPayload;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransferPayload   {

    
    /**
 * Identifies the specific transfer operation that needs to be reverted.
 */
    @JsonProperty("TransferId")
    private String transferId;

    /**
 * Retrieves or assigns the monetary amount involved in the transaction.
 */
    @JsonProperty("Amount")
    private Double amount;

    /**
 * Specifies the category of a financial operation.
 */
    @JsonProperty("OperationKind")
    private Integer operationKind;

    /**
 * 
 */
    @JsonProperty("OriginalAmount")
    private Double originalAmount;

    /**
 * Gets or sets the external reference identifier used to correlate this entity with an external system.
 */
    @JsonProperty("ExternalReferenceId")
    private String externalReferenceId;

    /**
 * Specifies the due date for the payment. If the value is null, the system treats the due date as the current date and time.
 */
    @JsonProperty("DueDate")
    private String dueDate;

    /**
 * The date and time when the payment was created.
 */
    @JsonProperty("CreatedDate")
    private String createdDate;

    /**
 * Acts as a unique identifier for a distinct payment method.
 */
    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;

    /**
 * Provides a detailed description of the payment method for easy identification.
 */
    @JsonProperty("PaymentMethodDescription")
    private String paymentMethodDescription;

    /**
 * 
 */
    @JsonProperty("PaymentMethodPreview")
    private String paymentMethodPreview;

    /**
 * Serves as a unique identifier for each customer within the system.
 */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
 * This property represents the full name of the customer in the system.
 */
    @JsonProperty("CustomerName")
    private String customerName;

    /**
 * Serves as a unique identifier for customers within an external system, enabling efficient data mapping and integration across various platforms.
 */
    @JsonProperty("CustomerExternalId")
    private String customerExternalId;

    /**
 * Specifies the monetary amount of a bill to be created.
 */
    @JsonProperty("BillAmount")
    private String billAmount;

    /**
 * Specifies the currency of the bill. If null, the merchant’s default currency is applied.
 */
    @JsonProperty("BillCurrency")
    private String billCurrency;

    /**
 * Provides a textual description of the bill associated with a payment.
 */
    @JsonProperty("BillDescription")
    private String billDescription;

    /**
 * Retrieves or assigns the unique identifier for a bill.
 */
    @JsonProperty("BillId")
    private String billId;

    /**
 * 
 */
    @JsonProperty("BillLanguage")
    private String billLanguage;

    /**
 * Represents the title of a bill associated with a payment.
 */
    @JsonProperty("BillTitle")
    private String billTitle;

    /**
 * 
 */
    @JsonProperty("BillCreatedDate")
    private String billCreatedDate;

    /**
 * Represents the first external system bill reference associated with the TIB bill.
 */
    @JsonProperty("ExternalSystemBillNumber1")
    private String externalSystemBillNumber1;

    /**
 * Reference number provided by an external system for the bill (field 2).
 */
    @JsonProperty("ExternalSystemBillNumber2")
    private String externalSystemBillNumber2;

    /**
 * Identifies the bill number provided by an external system. This field allows TIB to map its internal bill to the originating system's reference.
 */
    @JsonProperty("ExternalSystemBillNumber3")
    private String externalSystemBillNumber3;

    /**
 * 
 */
    @JsonProperty("BillMerchantId")
    private String billMerchantId;

    /**
 * 
 */
    @JsonProperty("BillCustomerId")
    private String billCustomerId;

    /**
 * 
 */
    @JsonProperty("Payout")
    private PayoutPayload payout;


    
    public TransferPayload() {
    }

    
    public TransferPayload(String transferId, Double amount, Integer operationKind, Double originalAmount, String externalReferenceId, String dueDate, String createdDate, String paymentMethodId, String paymentMethodDescription, String paymentMethodPreview, String customerId, String customerName, String customerExternalId, String billAmount, String billCurrency, String billDescription, String billId, String billLanguage, String billTitle, String billCreatedDate, String externalSystemBillNumber1, String externalSystemBillNumber2, String externalSystemBillNumber3, String billMerchantId, String billCustomerId, PayoutPayload payout) {
        this.transferId = transferId;
this.amount = amount;
this.operationKind = operationKind;
this.originalAmount = originalAmount;
this.externalReferenceId = externalReferenceId;
this.dueDate = dueDate;
this.createdDate = createdDate;
this.paymentMethodId = paymentMethodId;
this.paymentMethodDescription = paymentMethodDescription;
this.paymentMethodPreview = paymentMethodPreview;
this.customerId = customerId;
this.customerName = customerName;
this.customerExternalId = customerExternalId;
this.billAmount = billAmount;
this.billCurrency = billCurrency;
this.billDescription = billDescription;
this.billId = billId;
this.billLanguage = billLanguage;
this.billTitle = billTitle;
this.billCreatedDate = billCreatedDate;
this.externalSystemBillNumber1 = externalSystemBillNumber1;
this.externalSystemBillNumber2 = externalSystemBillNumber2;
this.externalSystemBillNumber3 = externalSystemBillNumber3;
this.billMerchantId = billMerchantId;
this.billCustomerId = billCustomerId;
this.payout = payout;

    }
    
    

    
    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getOperationKind() {
        return operationKind;
    }

    public void setOperationKind(Integer operationKind) {
        this.operationKind = operationKind;
    }

    public Double getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(Double originalAmount) {
        this.originalAmount = originalAmount;
    }

    public String getExternalReferenceId() {
        return externalReferenceId;
    }

    public void setExternalReferenceId(String externalReferenceId) {
        this.externalReferenceId = externalReferenceId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getPaymentMethodDescription() {
        return paymentMethodDescription;
    }

    public void setPaymentMethodDescription(String paymentMethodDescription) {
        this.paymentMethodDescription = paymentMethodDescription;
    }

    public String getPaymentMethodPreview() {
        return paymentMethodPreview;
    }

    public void setPaymentMethodPreview(String paymentMethodPreview) {
        this.paymentMethodPreview = paymentMethodPreview;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerExternalId() {
        return customerExternalId;
    }

    public void setCustomerExternalId(String customerExternalId) {
        this.customerExternalId = customerExternalId;
    }

    public String getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount;
    }

    public String getBillCurrency() {
        return billCurrency;
    }

    public void setBillCurrency(String billCurrency) {
        this.billCurrency = billCurrency;
    }

    public String getBillDescription() {
        return billDescription;
    }

    public void setBillDescription(String billDescription) {
        this.billDescription = billDescription;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getBillLanguage() {
        return billLanguage;
    }

    public void setBillLanguage(String billLanguage) {
        this.billLanguage = billLanguage;
    }

    public String getBillTitle() {
        return billTitle;
    }

    public void setBillTitle(String billTitle) {
        this.billTitle = billTitle;
    }

    public String getBillCreatedDate() {
        return billCreatedDate;
    }

    public void setBillCreatedDate(String billCreatedDate) {
        this.billCreatedDate = billCreatedDate;
    }

    public String getExternalSystemBillNumber1() {
        return externalSystemBillNumber1;
    }

    public void setExternalSystemBillNumber1(String externalSystemBillNumber1) {
        this.externalSystemBillNumber1 = externalSystemBillNumber1;
    }

    public String getExternalSystemBillNumber2() {
        return externalSystemBillNumber2;
    }

    public void setExternalSystemBillNumber2(String externalSystemBillNumber2) {
        this.externalSystemBillNumber2 = externalSystemBillNumber2;
    }

    public String getExternalSystemBillNumber3() {
        return externalSystemBillNumber3;
    }

    public void setExternalSystemBillNumber3(String externalSystemBillNumber3) {
        this.externalSystemBillNumber3 = externalSystemBillNumber3;
    }

    public String getBillMerchantId() {
        return billMerchantId;
    }

    public void setBillMerchantId(String billMerchantId) {
        this.billMerchantId = billMerchantId;
    }

    public String getBillCustomerId() {
        return billCustomerId;
    }

    public void setBillCustomerId(String billCustomerId) {
        this.billCustomerId = billCustomerId;
    }

    public PayoutPayload getPayout() {
        return payout;
    }

    public void setPayout(PayoutPayload payout) {
        this.payout = payout;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferPayload that = (TransferPayload) o;
        return Objects.equals(transferId, that.transferId) && Objects.equals(amount, that.amount) && Objects.equals(operationKind, that.operationKind) && Objects.equals(originalAmount, that.originalAmount) && Objects.equals(externalReferenceId, that.externalReferenceId) && Objects.equals(dueDate, that.dueDate) && Objects.equals(createdDate, that.createdDate) && Objects.equals(paymentMethodId, that.paymentMethodId) && Objects.equals(paymentMethodDescription, that.paymentMethodDescription) && Objects.equals(paymentMethodPreview, that.paymentMethodPreview) && Objects.equals(customerId, that.customerId) && Objects.equals(customerName, that.customerName) && Objects.equals(customerExternalId, that.customerExternalId) && Objects.equals(billAmount, that.billAmount) && Objects.equals(billCurrency, that.billCurrency) && Objects.equals(billDescription, that.billDescription) && Objects.equals(billId, that.billId) && Objects.equals(billLanguage, that.billLanguage) && Objects.equals(billTitle, that.billTitle) && Objects.equals(billCreatedDate, that.billCreatedDate) && Objects.equals(externalSystemBillNumber1, that.externalSystemBillNumber1) && Objects.equals(externalSystemBillNumber2, that.externalSystemBillNumber2) && Objects.equals(externalSystemBillNumber3, that.externalSystemBillNumber3) && Objects.equals(billMerchantId, that.billMerchantId) && Objects.equals(billCustomerId, that.billCustomerId) && Objects.equals(payout, that.payout) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transferId, amount, operationKind, originalAmount, externalReferenceId, dueDate, createdDate, paymentMethodId, paymentMethodDescription, paymentMethodPreview, customerId, customerName, customerExternalId, billAmount, billCurrency, billDescription, billId, billLanguage, billTitle, billCreatedDate, externalSystemBillNumber1, externalSystemBillNumber2, externalSystemBillNumber3, billMerchantId, billCustomerId, payout);
    }

    @Override
    public String toString() {
        return "TransferPayload{" +
                 "transferId='" + transferId + '\'' +
 ", amount='" + amount + '\'' +
 ", operationKind='" + operationKind + '\'' +
 ", originalAmount='" + originalAmount + '\'' +
 ", externalReferenceId='" + externalReferenceId + '\'' +
 ", dueDate='" + dueDate + '\'' +
 ", createdDate='" + createdDate + '\'' +
 ", paymentMethodId='" + paymentMethodId + '\'' +
 ", paymentMethodDescription='" + paymentMethodDescription + '\'' +
 ", paymentMethodPreview='" + paymentMethodPreview + '\'' +
 ", customerId='" + customerId + '\'' +
 ", customerName='" + customerName + '\'' +
 ", customerExternalId='" + customerExternalId + '\'' +
 ", billAmount='" + billAmount + '\'' +
 ", billCurrency='" + billCurrency + '\'' +
 ", billDescription='" + billDescription + '\'' +
 ", billId='" + billId + '\'' +
 ", billLanguage='" + billLanguage + '\'' +
 ", billTitle='" + billTitle + '\'' +
 ", billCreatedDate='" + billCreatedDate + '\'' +
 ", externalSystemBillNumber1='" + externalSystemBillNumber1 + '\'' +
 ", externalSystemBillNumber2='" + externalSystemBillNumber2 + '\'' +
 ", externalSystemBillNumber3='" + externalSystemBillNumber3 + '\'' +
 ", billMerchantId='" + billMerchantId + '\'' +
 ", billCustomerId='" + billCustomerId + '\'' +
 ", payout='" + payout + '\'' +

                '}';
    }
}