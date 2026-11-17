
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TransferType;
import com.tib.api.model.enums.PaymentMethodType;
import com.tib.api.model.TransferBatchCustomer;
import com.tib.api.model.Account;
import com.tib.api.model.Interac;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransferBatchItem   {

    
    /**
     * Required: your reference for this payment, 1 to 150 printable ASCII characters (leading and trailing spaces are ignored), unique per merchant. Sending again a reference the merchant already used for a live payment with the same direction, payment method type, ImmediateTransfer setting, amount, due date and destination (the bank account, or the Interac recipient's email and phone) returns that payment (AlreadyCreated) instead of creating another; any other reuse is refused.
     */
    @JsonProperty("ReferenceNumber")
    private String referenceNumber;

    /**
     * Required: FreeCollection (3) to collect from the customer, or FreeDeposit (2) to pay the customer. Other types are refused.
     */
    @JsonProperty("TransferType")
    private TransferType transferType;

    /**
     * Required: DirectAccount (2) for a payment through the customer's bank account, sent in BankAccount, or Interac (3) for an Interac payment, sent in InteracInformation: an Interac deposit sends money and an Interac collection requests money. Interac is available only to merchants whose currency is CAD. Other types are refused.
     */
    @JsonProperty("PaymentMethodType")
    private PaymentMethodType paymentMethodType;

    /**
     * Required: the amount, from 0.01 to 500,000, with at most 2 decimals. An Interac collection is limited to 10,000, fees included.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * Required: the date the payment is due; only the date part is used. It cannot be in the past when the request is sent.
     */
    @JsonProperty("TransactionDueDate")
    private OffsetDateTime transactionDueDate;

    /**
     * Optional: the text shown on the bank statement, 4 to 15 characters, and one of the descriptions authorized for the merchant's service. When absent, the merchant's default description is used.
     */
    @JsonProperty("StatementDescription")
    private String statementDescription;

    /**
     * Optional: true sends a DirectAccount deposit as an instant deposit, at a merchant whose currency is CAD, only while immediate processing of deposits is enabled, and only when the merchant's wallet balance covers it together with the request's deposits that are not immediate and its earlier immediate ones; any other item that sets it is refused. Absent or false keeps the standard processing.
     */
    @JsonProperty("ImmediateTransfer")
    private Boolean immediateTransfer;

    /**
     * Required: the customer the payment is for.
     */
    @JsonProperty("Customer")
    private TransferBatchCustomer customer;

    /**
     * The customer's bank account: required when PaymentMethodType is DirectAccount, absent otherwise. Send the institution number in BankNumber (3 digits, or 4 with a leading zero) and the 5-digit branch transit in InstitutionNumber, or both as the 9-digit RoutingNumber; the holder name in Owner.
     */
    @JsonProperty("BankAccount")
    private Account bankAccount;

    /**
     * The Interac recipient: required when PaymentMethodType is Interac, absent otherwise. Send Owner and Description, TargetEmailAddress or TargetMobilePhoneNumber (or both), and for a deposit InteracQuestion and InteracAnswer; a collection ignores the question and answer. TargetEmailAddress is plain ASCII, 64 characters at most.
     */
    @JsonProperty("InteracInformation")
    private Interac interacInformation;


    
    public TransferBatchItem() {
    }

    
    public TransferBatchItem(String referenceNumber, TransferType transferType, PaymentMethodType paymentMethodType, Double amount, OffsetDateTime transactionDueDate, String statementDescription, Boolean immediateTransfer, TransferBatchCustomer customer, Account bankAccount, Interac interacInformation) {
        this.referenceNumber = referenceNumber;
        this.transferType = transferType;
        this.paymentMethodType = paymentMethodType;
        this.amount = amount;
        this.transactionDueDate = transactionDueDate;
        this.statementDescription = statementDescription;
        this.immediateTransfer = immediateTransfer;
        this.customer = customer;
        this.bankAccount = bankAccount;
        this.interacInformation = interacInformation;
    }
    
    

    
    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public TransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public OffsetDateTime getTransactionDueDate() {
        return transactionDueDate;
    }

    public void setTransactionDueDate(OffsetDateTime transactionDueDate) {
        this.transactionDueDate = transactionDueDate;
    }

    public String getStatementDescription() {
        return statementDescription;
    }

    public void setStatementDescription(String statementDescription) {
        this.statementDescription = statementDescription;
    }

    public Boolean getImmediateTransfer() {
        return immediateTransfer;
    }

    public void setImmediateTransfer(Boolean immediateTransfer) {
        this.immediateTransfer = immediateTransfer;
    }

    public TransferBatchCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(TransferBatchCustomer customer) {
        this.customer = customer;
    }

    public Account getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Account bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Interac getInteracInformation() {
        return interacInformation;
    }

    public void setInteracInformation(Interac interacInformation) {
        this.interacInformation = interacInformation;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferBatchItem that = (TransferBatchItem) o;
        return Objects.equals(referenceNumber, that.referenceNumber) && Objects.equals(transferType, that.transferType) && Objects.equals(paymentMethodType, that.paymentMethodType) && Objects.equals(amount, that.amount) && Objects.equals(transactionDueDate, that.transactionDueDate) && Objects.equals(statementDescription, that.statementDescription) && Objects.equals(immediateTransfer, that.immediateTransfer) && Objects.equals(customer, that.customer) && Objects.equals(bankAccount, that.bankAccount) && Objects.equals(interacInformation, that.interacInformation) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(referenceNumber, transferType, paymentMethodType, amount, transactionDueDate, statementDescription, immediateTransfer, customer, bankAccount, interacInformation);
    }

    @Override
    public String toString() {
        return "TransferBatchItem{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", transferType='" + transferType + '\'' +
                ", paymentMethodType='" + paymentMethodType + '\'' +
                ", amount='" + amount + '\'' +
                ", transactionDueDate='" + transactionDueDate + '\'' +
                ", statementDescription='" + statementDescription + '\'' +
                ", immediateTransfer='" + immediateTransfer + '\'' +
                ", customer='" + customer + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", interacInformation='" + interacInformation + '\'' +

                '}';
    }
}