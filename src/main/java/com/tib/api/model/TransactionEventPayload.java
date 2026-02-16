
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.TransferPayload;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransactionEventPayload  extends BaseEventPayload  {

    
    /**
     * 
     */
    @JsonProperty("Target")
    private String target;

    /**
     * 
     */
    @JsonProperty("Direction")
    private String direction;

    /**
     * 
     */
    @JsonProperty("Step")
    private String step;

    /**
     * Represents the current state of a transaction within the system.
     */
    @JsonProperty("Status")
    private String status;

    /**
     * 
     */
    @JsonProperty("DescriptionCode")
    private String descriptionCode;

    /**
     * Provides a detailed explanation of the function's purpose and usage within the API.
     */
    @JsonProperty("Description")
    private String description;

    /**
     * Retrieves or assigns the monetary amount involved in the transaction.
     */
    @JsonProperty("Amount")
    private String amount;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Represents the merchant's unique name.
     */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
     * 
     */
    @JsonProperty("MerchantAccountPreview")
    private String merchantAccountPreview;

    /**
     * 
     */
    @JsonProperty("MerchantExternalId")
    private String merchantExternalId;

    /**
     * Contains a free‑text description of the merchant, which is stored in the TIB Finance system and displayed in merchant records.
     */
    @JsonProperty("MerchantDescription")
    private String merchantDescription;

    /**
     * 
     */
    @JsonProperty("TransferPayload")
    private List<TransferPayload> transferPayload;


    
    public TransactionEventPayload() {
    }

    
    public TransactionEventPayload(String target, String direction, String step, String status, String descriptionCode, String description, String amount, String merchantId, String merchantName, String merchantAccountPreview, String merchantExternalId, String merchantDescription, List<TransferPayload> transferPayload) {
        this.target = target;
        this.direction = direction;
        this.step = step;
        this.status = status;
        this.descriptionCode = descriptionCode;
        this.description = description;
        this.amount = amount;
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.merchantAccountPreview = merchantAccountPreview;
        this.merchantExternalId = merchantExternalId;
        this.merchantDescription = merchantDescription;
        this.transferPayload = transferPayload;
    }
    
    
    public TransactionEventPayload(String eventName, String target, String direction, String step, String status, String descriptionCode, String description, String amount, String merchantId, String merchantName, String merchantAccountPreview, String merchantExternalId, String merchantDescription, List<TransferPayload> transferPayload) {
        super(eventName);
        this.target = target;
        this.direction = direction;
        this.step = step;
        this.status = status;
        this.descriptionCode = descriptionCode;
        this.description = description;
        this.amount = amount;
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.merchantAccountPreview = merchantAccountPreview;
        this.merchantExternalId = merchantExternalId;
        this.merchantDescription = merchantDescription;
        this.transferPayload = transferPayload;
    }

    
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescriptionCode() {
        return descriptionCode;
    }

    public void setDescriptionCode(String descriptionCode) {
        this.descriptionCode = descriptionCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantAccountPreview() {
        return merchantAccountPreview;
    }

    public void setMerchantAccountPreview(String merchantAccountPreview) {
        this.merchantAccountPreview = merchantAccountPreview;
    }

    public String getMerchantExternalId() {
        return merchantExternalId;
    }

    public void setMerchantExternalId(String merchantExternalId) {
        this.merchantExternalId = merchantExternalId;
    }

    public String getMerchantDescription() {
        return merchantDescription;
    }

    public void setMerchantDescription(String merchantDescription) {
        this.merchantDescription = merchantDescription;
    }

    public List<TransferPayload> getTransferPayload() {
        return transferPayload;
    }

    public void setTransferPayload(List<TransferPayload> transferPayload) {
        this.transferPayload = transferPayload;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionEventPayload that = (TransactionEventPayload) o;
        return Objects.equals(target, that.target) && Objects.equals(direction, that.direction) && Objects.equals(step, that.step) && Objects.equals(status, that.status) && Objects.equals(descriptionCode, that.descriptionCode) && Objects.equals(description, that.description) && Objects.equals(amount, that.amount) && Objects.equals(merchantId, that.merchantId) && Objects.equals(merchantName, that.merchantName) && Objects.equals(merchantAccountPreview, that.merchantAccountPreview) && Objects.equals(merchantExternalId, that.merchantExternalId) && Objects.equals(merchantDescription, that.merchantDescription) && Objects.equals(transferPayload, that.transferPayload) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(target, direction, step, status, descriptionCode, description, amount, merchantId, merchantName, merchantAccountPreview, merchantExternalId, merchantDescription, transferPayload);
    }

    @Override
    public String toString() {
        return "TransactionEventPayload{" +
                "target='" + target + '\'' +
                ", direction='" + direction + '\'' +
                ", step='" + step + '\'' +
                ", status='" + status + '\'' +
                ", descriptionCode='" + descriptionCode + '\'' +
                ", description='" + description + '\'' +
                ", amount='" + amount + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", merchantAccountPreview='" + merchantAccountPreview + '\'' +
                ", merchantExternalId='" + merchantExternalId + '\'' +
                ", merchantDescription='" + merchantDescription + '\'' +
                ", transferPayload='" + transferPayload + '\'' +

                '}';
    }
}