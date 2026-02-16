
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.ConvenientFeeSettingStatus;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ConvenientFeeSettings   {

    
    /**
     * 
     */
    @JsonProperty("ConvenientFeeSettingId")
    private String convenientFeeSettingId;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * 
     */
    @JsonProperty("Percentage")
    private Double percentage;

    /**
     * 
     */
    @JsonProperty("MinAmount")
    private Double minAmount;

    /**
     * 
     */
    @JsonProperty("MaxAmount")
    private Double maxAmount;

    /**
     * 
     */
    @JsonProperty("FixedAmount")
    private Double fixedAmount;

    /**
     * Identifies the type of payment method linked to a specific account.
     */
    @JsonProperty("PaymentMethodType")
    private Integer paymentMethodType;

    /**
     * 
     */
    @JsonProperty("TargetMerchantId")
    private String targetMerchantId;

    /**
     * Represents the current state of a transaction within the system.
     */
    @JsonProperty("Status")
    private ConvenientFeeSettingStatus status;


    
    public ConvenientFeeSettings() {
    }

    
    public ConvenientFeeSettings(String convenientFeeSettingId, String merchantId, Double percentage, Double minAmount, Double maxAmount, Double fixedAmount, Integer paymentMethodType, String targetMerchantId, ConvenientFeeSettingStatus status) {
        this.convenientFeeSettingId = convenientFeeSettingId;
        this.merchantId = merchantId;
        this.percentage = percentage;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.fixedAmount = fixedAmount;
        this.paymentMethodType = paymentMethodType;
        this.targetMerchantId = targetMerchantId;
        this.status = status;
    }
    
    

    
    public String getConvenientFeeSettingId() {
        return convenientFeeSettingId;
    }

    public void setConvenientFeeSettingId(String convenientFeeSettingId) {
        this.convenientFeeSettingId = convenientFeeSettingId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(Double minAmount) {
        this.minAmount = minAmount;
    }

    public Double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(Double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public Integer getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(Integer paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public String getTargetMerchantId() {
        return targetMerchantId;
    }

    public void setTargetMerchantId(String targetMerchantId) {
        this.targetMerchantId = targetMerchantId;
    }

    public ConvenientFeeSettingStatus getStatus() {
        return status;
    }

    public void setStatus(ConvenientFeeSettingStatus status) {
        this.status = status;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConvenientFeeSettings that = (ConvenientFeeSettings) o;
        return Objects.equals(convenientFeeSettingId, that.convenientFeeSettingId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(percentage, that.percentage) && Objects.equals(minAmount, that.minAmount) && Objects.equals(maxAmount, that.maxAmount) && Objects.equals(fixedAmount, that.fixedAmount) && Objects.equals(paymentMethodType, that.paymentMethodType) && Objects.equals(targetMerchantId, that.targetMerchantId) && Objects.equals(status, that.status) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(convenientFeeSettingId, merchantId, percentage, minAmount, maxAmount, fixedAmount, paymentMethodType, targetMerchantId, status);
    }

    @Override
    public String toString() {
        return "ConvenientFeeSettings{" +
                "convenientFeeSettingId='" + convenientFeeSettingId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", percentage='" + percentage + '\'' +
                ", minAmount='" + minAmount + '\'' +
                ", maxAmount='" + maxAmount + '\'' +
                ", fixedAmount='" + fixedAmount + '\'' +
                ", paymentMethodType='" + paymentMethodType + '\'' +
                ", targetMerchantId='" + targetMerchantId + '\'' +
                ", status='" + status + '\'' +

                '}';
    }
}