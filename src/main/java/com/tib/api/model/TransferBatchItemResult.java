
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TransferBatchItemOutcome;
import com.tib.api.model.enums.TransferBatchCustomerAction;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransferBatchItemResult   {

    
    /**
     * The item's 0-based position in Items.
     */
    @JsonProperty("Index")
    private Integer index;

    /**
     * The item's ReferenceNumber, at most its first 200 characters.
     */
    @JsonProperty("ReferenceNumber")
    private String referenceNumber;

    /**
     * What happened to the item. Accepted: in the reply, the item passed every check and is processed in the background; in GetTransferBatchResult, it is not processed yet.
     */
    @JsonProperty("Outcome")
    private TransferBatchItemOutcome outcome;

    /**
     * The payment created, or the existing payment when Outcome is AlreadyCreated; empty for every other outcome, Accepted included.
     */
    @JsonProperty("PaymentId")
    private String paymentId;

    /**
     * The customer of the item's CustomerExternalId; empty when no customer was saved or found for the item, such as when customer records are turned off, for a Refused item, a NotProcessed item that was not reached (2151), an AlreadyCreated or Valid item whose customer does not exist yet, and an Accepted item (GetTransferBatchResult gives it with the item's final outcome). Keep the latest value.
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * What was done with the customer; None for an Accepted item, and for an item whose payment a later attempt found already created (the action was not recorded).
     */
    @JsonProperty("CustomerAction")
    private TransferBatchCustomerAction customerAction;

    /**
     * True when the merchant already used this bank account, with the same numbers and holder name, for an earlier payment. In the reply: as checked when the request was sent. In GetTransferBatchResult: as checked when the item was processed; an item that was not processed (Accepted, NotProcessed 2151, or final in the reply), and an item whose payment a later attempt found already created, carries the value checked when the request was sent. Empty for Interac items, refused items, and items whose processing stopped after their customer was saved (NotProcessed 2135).
     */
    @JsonProperty("BankAccountKnown")
    private Boolean bankAccountKnown;

    /**
     * Why the item was refused or not processed; 0 otherwise.
     */
    @JsonProperty("ErrorCode")
    private Integer errorCode;

    /**
     * Why the item was refused or not processed; a refusal names every field that failed. Empty otherwise.
     */
    @JsonProperty("Message")
    private String message;

    /**
     * Warnings for customer details that are not saved; a warning never stops the item. An Accepted item carries those found when the request was sent.
     */
    @JsonProperty("WarningCodes")
    private List<Integer> warningCodes;


    
    public TransferBatchItemResult() {
    }

    
    public TransferBatchItemResult(Integer index, String referenceNumber, TransferBatchItemOutcome outcome, String paymentId, String customerId, TransferBatchCustomerAction customerAction, Boolean bankAccountKnown, Integer errorCode, String message, List<Integer> warningCodes) {
        this.index = index;
        this.referenceNumber = referenceNumber;
        this.outcome = outcome;
        this.paymentId = paymentId;
        this.customerId = customerId;
        this.customerAction = customerAction;
        this.bankAccountKnown = bankAccountKnown;
        this.errorCode = errorCode;
        this.message = message;
        this.warningCodes = warningCodes;
    }
    
    

    
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public TransferBatchItemOutcome getOutcome() {
        return outcome;
    }

    public void setOutcome(TransferBatchItemOutcome outcome) {
        this.outcome = outcome;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public TransferBatchCustomerAction getCustomerAction() {
        return customerAction;
    }

    public void setCustomerAction(TransferBatchCustomerAction customerAction) {
        this.customerAction = customerAction;
    }

    public Boolean getBankAccountKnown() {
        return bankAccountKnown;
    }

    public void setBankAccountKnown(Boolean bankAccountKnown) {
        this.bankAccountKnown = bankAccountKnown;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Integer> getWarningCodes() {
        return warningCodes;
    }

    public void setWarningCodes(List<Integer> warningCodes) {
        this.warningCodes = warningCodes;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferBatchItemResult that = (TransferBatchItemResult) o;
        return Objects.equals(index, that.index) && Objects.equals(referenceNumber, that.referenceNumber) && Objects.equals(outcome, that.outcome) && Objects.equals(paymentId, that.paymentId) && Objects.equals(customerId, that.customerId) && Objects.equals(customerAction, that.customerAction) && Objects.equals(bankAccountKnown, that.bankAccountKnown) && Objects.equals(errorCode, that.errorCode) && Objects.equals(message, that.message) && Objects.equals(warningCodes, that.warningCodes) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(index, referenceNumber, outcome, paymentId, customerId, customerAction, bankAccountKnown, errorCode, message, warningCodes);
    }

    @Override
    public String toString() {
        return "TransferBatchItemResult{" +
                "index='" + index + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", outcome='" + outcome + '\'' +
                ", paymentId='" + paymentId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerAction='" + customerAction + '\'' +
                ", bankAccountKnown='" + bankAccountKnown + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", message='" + message + '\'' +
                ", warningCodes='" + warningCodes + '\'' +

                '}';
    }
}