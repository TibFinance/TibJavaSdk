
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class RefundMerchantArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Retrieves or assigns the monetary amount involved in the transaction.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * Provides a detailed explanation of the function's purpose and usage within the API.
     */
    @JsonProperty("Description")
    private String description;

    /**
     * 
     */
    @JsonProperty("IsCommission")
    private boolean isCommission;


    
    public RefundMerchantArgs() {
    }

    
    public RefundMerchantArgs(String merchantId, Double amount, String description, boolean isCommission) {
        this.merchantId = merchantId;
        this.amount = amount;
        this.description = description;
        this.isCommission = isCommission;
    }
    
    
    public RefundMerchantArgs(String adminSessionToken, String merchantId, Double amount, String description, boolean isCommission) {
        super(adminSessionToken);
        this.merchantId = merchantId;
        this.amount = amount;
        this.description = description;
        this.isCommission = isCommission;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsCommission() {
        return isCommission;
    }

    public void setIsCommission(boolean isCommission) {
        this.isCommission = isCommission;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RefundMerchantArgs that = (RefundMerchantArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(amount, that.amount) && Objects.equals(description, that.description) && Objects.equals(isCommission, that.isCommission) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, amount, description, isCommission);
    }

    @Override
    public String toString() {
        return "RefundMerchantArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", amount='" + amount + '\'' +
                ", description='" + description + '\'' +
                ", isCommission='" + isCommission + '\'' +

                '}';
    }
}