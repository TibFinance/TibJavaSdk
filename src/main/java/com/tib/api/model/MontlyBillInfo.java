
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.OperationKind;
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


public class MontlyBillInfo   {

    
    /**
 * Represents the merchant's unique name.
 */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
 * Specifies the default language used by the merchant within the TIB Finance API. This setting is crucial for ensuring that all communications and operations are conducted in the preferred language of the merchant.
 */
    @JsonProperty("MerchantLanguage")
    private Language merchantLanguage;

    /**
 * Specifies the category of a financial operation.
 */
    @JsonProperty("OperationKind")
    private OperationKind operationKind;

    /**
 * 
 */
    @JsonProperty("TotalAmount")
    private Double totalAmount;

    /**
 * 
 */
    @JsonProperty("TotalCount")
    private Integer totalCount;

    /**
 * Identifies the type of payment method linked to a specific account.
 */
    @JsonProperty("PaymentMethodType")
    private PaymentMethodType paymentMethodType;

    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public MontlyBillInfo() {
    }

    
    public MontlyBillInfo(String merchantName, Language merchantLanguage, OperationKind operationKind, Double totalAmount, Integer totalCount, PaymentMethodType paymentMethodType, String merchantId) {
        this.merchantName = merchantName;
this.merchantLanguage = merchantLanguage;
this.operationKind = operationKind;
this.totalAmount = totalAmount;
this.totalCount = totalCount;
this.paymentMethodType = paymentMethodType;
this.merchantId = merchantId;

    }
    
    

    
    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Language getMerchantLanguage() {
        return merchantLanguage;
    }

    public void setMerchantLanguage(Language merchantLanguage) {
        this.merchantLanguage = merchantLanguage;
    }

    public OperationKind getOperationKind() {
        return operationKind;
    }

    public void setOperationKind(OperationKind operationKind) {
        this.operationKind = operationKind;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MontlyBillInfo that = (MontlyBillInfo) o;
        return Objects.equals(merchantName, that.merchantName) && Objects.equals(merchantLanguage, that.merchantLanguage) && Objects.equals(operationKind, that.operationKind) && Objects.equals(totalAmount, that.totalAmount) && Objects.equals(totalCount, that.totalCount) && Objects.equals(paymentMethodType, that.paymentMethodType) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantName, merchantLanguage, operationKind, totalAmount, totalCount, paymentMethodType, merchantId);
    }

    @Override
    public String toString() {
        return "MontlyBillInfo{" +
                 "merchantName='" + merchantName + '\'' +
 ", merchantLanguage='" + merchantLanguage + '\'' +
 ", operationKind='" + operationKind + '\'' +
 ", totalAmount='" + totalAmount + '\'' +
 ", totalCount='" + totalCount + '\'' +
 ", paymentMethodType='" + paymentMethodType + '\'' +
 ", merchantId='" + merchantId + '\'' +

                '}';
    }
}