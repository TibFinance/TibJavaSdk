
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BatchFileEventOperation   {

    
    /**
     * Indicates that the operation completed successfully.
     */
    @JsonProperty("Success")
    private boolean success;

    /**
     * 
     */
    @JsonProperty("CreatedTransferId")
    private String createdTransferId;

    /**
     * Retrieves or assigns the monetary amount involved in the transaction.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
     */
    @JsonProperty("ClientId")
    private String clientId;

    /**
     * Serves as a unique identifier for each customer within the system.
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Gets or sets the reference identifier used to uniquely identify a transaction, operation, or entity within the TIB Finance system.
     */
    @JsonProperty("ReferenceId")
    private String referenceId;

    /**
     * Acts as a unique identifier for a distinct payment method.
     */
    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;


    
    public BatchFileEventOperation() {
    }

    
    public BatchFileEventOperation(boolean success, String createdTransferId, Double amount, String clientId, String customerId, String merchantId, String referenceId, String paymentMethodId) {
        this.success = success;
        this.createdTransferId = createdTransferId;
        this.amount = amount;
        this.clientId = clientId;
        this.customerId = customerId;
        this.merchantId = merchantId;
        this.referenceId = referenceId;
        this.paymentMethodId = paymentMethodId;
    }
    
    

    
    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCreatedTransferId() {
        return createdTransferId;
    }

    public void setCreatedTransferId(String createdTransferId) {
        this.createdTransferId = createdTransferId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BatchFileEventOperation that = (BatchFileEventOperation) o;
        return Objects.equals(success, that.success) && Objects.equals(createdTransferId, that.createdTransferId) && Objects.equals(amount, that.amount) && Objects.equals(clientId, that.clientId) && Objects.equals(customerId, that.customerId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(referenceId, that.referenceId) && Objects.equals(paymentMethodId, that.paymentMethodId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(success, createdTransferId, amount, clientId, customerId, merchantId, referenceId, paymentMethodId);
    }

    @Override
    public String toString() {
        return "BatchFileEventOperation{" +
                "success='" + success + '\'' +
                ", createdTransferId='" + createdTransferId + '\'' +
                ", amount='" + amount + '\'' +
                ", clientId='" + clientId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", referenceId='" + referenceId + '\'' +
                ", paymentMethodId='" + paymentMethodId + '\'' +

                '}';
    }
}