
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.OperationTarget;
import com.tib.api.model.enums.TransferDirection;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class AdminTranGroup   {

    
    /**
 * 
 */
    @JsonProperty("TransactionGroupId")
    private String transactionGroupId;

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
 * Gets or sets the unique identifier of the target system used to reference the client’s contract within TIB Finance.
 */
    @JsonProperty("TargetSystemId")
    private String targetSystemId;

    /**
 * Specifies the target of an operation, indicating whether the operation pertains to the merchant or the customer.
 */
    @JsonProperty("OperationTarget")
    private OperationTarget operationTarget;

    /**
 * 
 */
    @JsonProperty("BaseOperationDirection")
    private TransferDirection baseOperationDirection;

    /**
 * Retrieves the identifier of the merchant (bank account) to which the operation applies.
 */
    @JsonProperty("RelatedMerchantId")
    private String relatedMerchantId;

    /**
 * 
 */
    @JsonProperty("OperationId")
    private String operationId;

    /**
 * Identifies the specific transfer operation that needs to be reverted.
 */
    @JsonProperty("TransferId")
    private String transferId;

    /**
 * Identifies the customer linked to this payment, when a customer relationship exists.
 */
    @JsonProperty("RelatedCustomerId")
    private String relatedCustomerId;

    /**
 * 
 */
    @JsonProperty("IsChecked")
    private boolean isChecked;

    /**
 * 
 */
    @JsonProperty("MerchantIds")
    private List<String> merchantIds;

    /**
 * 
 */
    @JsonProperty("CustomerIds")
    private List<String> customerIds;

    /**
 * 
 */
    @JsonProperty("TransferIds")
    private List<String> transferIds;

    /**
 * 
 */
    @JsonProperty("OperationIds")
    private List<String> operationIds;

    /**
 * 
 */
    @JsonProperty("OperationTargetValue")
    private String operationTargetValue;

    /**
 * 
 */
    @JsonProperty("CurrencyValue")
    private String currencyValue;

    /**
 * 
 */
    @JsonProperty("BaseOperationDirectionValue")
    private String baseOperationDirectionValue;


    
    public AdminTranGroup() {
    }

    
    public AdminTranGroup(String transactionGroupId, Double amount, Currency currency, String targetSystemId, OperationTarget operationTarget, TransferDirection baseOperationDirection, String relatedMerchantId, String operationId, String transferId, String relatedCustomerId, boolean isChecked, List<String> merchantIds, List<String> customerIds, List<String> transferIds, List<String> operationIds, String operationTargetValue, String currencyValue, String baseOperationDirectionValue) {
        this.transactionGroupId = transactionGroupId;
this.amount = amount;
this.currency = currency;
this.targetSystemId = targetSystemId;
this.operationTarget = operationTarget;
this.baseOperationDirection = baseOperationDirection;
this.relatedMerchantId = relatedMerchantId;
this.operationId = operationId;
this.transferId = transferId;
this.relatedCustomerId = relatedCustomerId;
this.isChecked = isChecked;
this.merchantIds = merchantIds;
this.customerIds = customerIds;
this.transferIds = transferIds;
this.operationIds = operationIds;
this.operationTargetValue = operationTargetValue;
this.currencyValue = currencyValue;
this.baseOperationDirectionValue = baseOperationDirectionValue;

    }
    
    

    
    public String getTransactionGroupId() {
        return transactionGroupId;
    }

    public void setTransactionGroupId(String transactionGroupId) {
        this.transactionGroupId = transactionGroupId;
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

    public String getTargetSystemId() {
        return targetSystemId;
    }

    public void setTargetSystemId(String targetSystemId) {
        this.targetSystemId = targetSystemId;
    }

    public OperationTarget getOperationTarget() {
        return operationTarget;
    }

    public void setOperationTarget(OperationTarget operationTarget) {
        this.operationTarget = operationTarget;
    }

    public TransferDirection getBaseOperationDirection() {
        return baseOperationDirection;
    }

    public void setBaseOperationDirection(TransferDirection baseOperationDirection) {
        this.baseOperationDirection = baseOperationDirection;
    }

    public String getRelatedMerchantId() {
        return relatedMerchantId;
    }

    public void setRelatedMerchantId(String relatedMerchantId) {
        this.relatedMerchantId = relatedMerchantId;
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

    public String getRelatedCustomerId() {
        return relatedCustomerId;
    }

    public void setRelatedCustomerId(String relatedCustomerId) {
        this.relatedCustomerId = relatedCustomerId;
    }

    public boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public List<String> getMerchantIds() {
        return merchantIds;
    }

    public void setMerchantIds(List<String> merchantIds) {
        this.merchantIds = merchantIds;
    }

    public List<String> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(List<String> customerIds) {
        this.customerIds = customerIds;
    }

    public List<String> getTransferIds() {
        return transferIds;
    }

    public void setTransferIds(List<String> transferIds) {
        this.transferIds = transferIds;
    }

    public List<String> getOperationIds() {
        return operationIds;
    }

    public void setOperationIds(List<String> operationIds) {
        this.operationIds = operationIds;
    }

    public String getOperationTargetValue() {
        return operationTargetValue;
    }

    public void setOperationTargetValue(String operationTargetValue) {
        this.operationTargetValue = operationTargetValue;
    }

    public String getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(String currencyValue) {
        this.currencyValue = currencyValue;
    }

    public String getBaseOperationDirectionValue() {
        return baseOperationDirectionValue;
    }

    public void setBaseOperationDirectionValue(String baseOperationDirectionValue) {
        this.baseOperationDirectionValue = baseOperationDirectionValue;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminTranGroup that = (AdminTranGroup) o;
        return Objects.equals(transactionGroupId, that.transactionGroupId) && Objects.equals(amount, that.amount) && Objects.equals(currency, that.currency) && Objects.equals(targetSystemId, that.targetSystemId) && Objects.equals(operationTarget, that.operationTarget) && Objects.equals(baseOperationDirection, that.baseOperationDirection) && Objects.equals(relatedMerchantId, that.relatedMerchantId) && Objects.equals(operationId, that.operationId) && Objects.equals(transferId, that.transferId) && Objects.equals(relatedCustomerId, that.relatedCustomerId) && Objects.equals(isChecked, that.isChecked) && Objects.equals(merchantIds, that.merchantIds) && Objects.equals(customerIds, that.customerIds) && Objects.equals(transferIds, that.transferIds) && Objects.equals(operationIds, that.operationIds) && Objects.equals(operationTargetValue, that.operationTargetValue) && Objects.equals(currencyValue, that.currencyValue) && Objects.equals(baseOperationDirectionValue, that.baseOperationDirectionValue) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transactionGroupId, amount, currency, targetSystemId, operationTarget, baseOperationDirection, relatedMerchantId, operationId, transferId, relatedCustomerId, isChecked, merchantIds, customerIds, transferIds, operationIds, operationTargetValue, currencyValue, baseOperationDirectionValue);
    }

    @Override
    public String toString() {
        return "AdminTranGroup{" +
                 "transactionGroupId='" + transactionGroupId + '\'' +
 ", amount='" + amount + '\'' +
 ", currency='" + currency + '\'' +
 ", targetSystemId='" + targetSystemId + '\'' +
 ", operationTarget='" + operationTarget + '\'' +
 ", baseOperationDirection='" + baseOperationDirection + '\'' +
 ", relatedMerchantId='" + relatedMerchantId + '\'' +
 ", operationId='" + operationId + '\'' +
 ", transferId='" + transferId + '\'' +
 ", relatedCustomerId='" + relatedCustomerId + '\'' +
 ", isChecked='" + isChecked + '\'' +
 ", merchantIds='" + merchantIds + '\'' +
 ", customerIds='" + customerIds + '\'' +
 ", transferIds='" + transferIds + '\'' +
 ", operationIds='" + operationIds + '\'' +
 ", operationTargetValue='" + operationTargetValue + '\'' +
 ", currencyValue='" + currencyValue + '\'' +
 ", baseOperationDirectionValue='" + baseOperationDirectionValue + '\'' +

                '}';
    }
}