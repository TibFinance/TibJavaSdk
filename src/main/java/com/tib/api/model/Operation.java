
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.OperationTarget;
import com.tib.api.model.enums.TransferDirection;
import com.tib.api.model.TransactionCommon;
import com.tib.api.model.PaymentOperationWithHierarchy;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class Operation   {

    
    /**
 * Retrieves or assigns the monetary amount involved in the transaction.
 */
    @JsonProperty("Amount")
    private Double amount;

    /**
 * Retrieves or assigns the currency type used in transactions.
 */
    @JsonProperty("Currency")
    private Currency currency;

    /**
 * Specifies the target of an operation, indicating whether the operation pertains to the merchant or the customer.
 */
    @JsonProperty("OperationTarget")
    private OperationTarget operationTarget;

    /**
 * Specifies the direction of the operation, indicating whether funds are being collected or deposited.
 */
    @JsonProperty("OperationDirection")
    private TransferDirection operationDirection;

    /**
 * Gets or sets the payment or merchant identifier.
 */
    @JsonProperty("PaymentOrMerchantId")
    private String paymentOrMerchantId;

    /**
 * Gets or sets the collection of transaction details associated with the operation.
 */
    @JsonProperty("Transactions")
    private List<TransactionCommon> transactions;

    /**
 * Gets or sets the operation related payments.
 */
    @JsonProperty("OperationRelatedPayments")
    private List<PaymentOperationWithHierarchy> operationRelatedPayments;


    
    public Operation() {
    }

    
    public Operation(Double amount, Currency currency, OperationTarget operationTarget, TransferDirection operationDirection, String paymentOrMerchantId, List<TransactionCommon> transactions, List<PaymentOperationWithHierarchy> operationRelatedPayments) {
        this.amount = amount;
this.currency = currency;
this.operationTarget = operationTarget;
this.operationDirection = operationDirection;
this.paymentOrMerchantId = paymentOrMerchantId;
this.transactions = transactions;
this.operationRelatedPayments = operationRelatedPayments;

    }
    
    

    
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public OperationTarget getOperationTarget() {
        return operationTarget;
    }

    public void setOperationTarget(OperationTarget operationTarget) {
        this.operationTarget = operationTarget;
    }

    public TransferDirection getOperationDirection() {
        return operationDirection;
    }

    public void setOperationDirection(TransferDirection operationDirection) {
        this.operationDirection = operationDirection;
    }

    public String getPaymentOrMerchantId() {
        return paymentOrMerchantId;
    }

    public void setPaymentOrMerchantId(String paymentOrMerchantId) {
        this.paymentOrMerchantId = paymentOrMerchantId;
    }

    public List<TransactionCommon> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionCommon> transactions) {
        this.transactions = transactions;
    }

    public List<PaymentOperationWithHierarchy> getOperationRelatedPayments() {
        return operationRelatedPayments;
    }

    public void setOperationRelatedPayments(List<PaymentOperationWithHierarchy> operationRelatedPayments) {
        this.operationRelatedPayments = operationRelatedPayments;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operation that = (Operation) o;
        return Objects.equals(amount, that.amount) && Objects.equals(currency, that.currency) && Objects.equals(operationTarget, that.operationTarget) && Objects.equals(operationDirection, that.operationDirection) && Objects.equals(paymentOrMerchantId, that.paymentOrMerchantId) && Objects.equals(transactions, that.transactions) && Objects.equals(operationRelatedPayments, that.operationRelatedPayments) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(amount, currency, operationTarget, operationDirection, paymentOrMerchantId, transactions, operationRelatedPayments);
    }

    @Override
    public String toString() {
        return "Operation{" +
                 "amount='" + amount + '\'' +
 ", currency='" + currency + '\'' +
 ", operationTarget='" + operationTarget + '\'' +
 ", operationDirection='" + operationDirection + '\'' +
 ", paymentOrMerchantId='" + paymentOrMerchantId + '\'' +
 ", transactions='" + transactions + '\'' +
 ", operationRelatedPayments='" + operationRelatedPayments + '\'' +

                '}';
    }
}