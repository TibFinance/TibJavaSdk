
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.Language;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BillEntity   {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Represents the title of a bill associated with a payment.
     */
    @JsonProperty("BillTitle")
    private String billTitle;

    /**
     * Provides a textual description of the bill associated with a payment.
     */
    @JsonProperty("BillDescription")
    private String billDescription;

    /**
     * Specifies the monetary amount of a bill to be created.
     */
    @JsonProperty("BillAmount")
    private Double billAmount;

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
     * Specifies the currency of the bill. If null, the merchant’s default currency is applied.
     */
    @JsonProperty("BillCurrency")
    private Currency billCurrency;

    /**
     * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * Identifies the customer linked to this payment, when a customer relationship exists.
     */
    @JsonProperty("RelatedCustomerId")
    private String relatedCustomerId;

    /**
     * Indicates whether the bill should apply the convenience fee according to the client’s service configuration. The fee calculation follows the configuration set by an administrator.
     */
    @JsonProperty("UseConvenientFeeRule")
    private boolean useConvenientFeeRule;


    
    public BillEntity() {
    }

    
    public BillEntity(String merchantId, String billTitle, String billDescription, Double billAmount, String externalSystemBillNumber1, String externalSystemBillNumber2, String externalSystemBillNumber3, Currency billCurrency, Language language, String relatedCustomerId, boolean useConvenientFeeRule) {
        this.merchantId = merchantId;
        this.billTitle = billTitle;
        this.billDescription = billDescription;
        this.billAmount = billAmount;
        this.externalSystemBillNumber1 = externalSystemBillNumber1;
        this.externalSystemBillNumber2 = externalSystemBillNumber2;
        this.externalSystemBillNumber3 = externalSystemBillNumber3;
        this.billCurrency = billCurrency;
        this.language = language;
        this.relatedCustomerId = relatedCustomerId;
        this.useConvenientFeeRule = useConvenientFeeRule;
    }
    
    

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getBillTitle() {
        return billTitle;
    }

    public void setBillTitle(String billTitle) {
        this.billTitle = billTitle;
    }

    public String getBillDescription() {
        return billDescription;
    }

    public void setBillDescription(String billDescription) {
        this.billDescription = billDescription;
    }

    public Double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Double billAmount) {
        this.billAmount = billAmount;
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

    public Currency getBillCurrency() {
        return billCurrency;
    }

    public void setBillCurrency(Currency billCurrency) {
        this.billCurrency = billCurrency;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getRelatedCustomerId() {
        return relatedCustomerId;
    }

    public void setRelatedCustomerId(String relatedCustomerId) {
        this.relatedCustomerId = relatedCustomerId;
    }

    public boolean getUseConvenientFeeRule() {
        return useConvenientFeeRule;
    }

    public void setUseConvenientFeeRule(boolean useConvenientFeeRule) {
        this.useConvenientFeeRule = useConvenientFeeRule;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillEntity that = (BillEntity) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(billTitle, that.billTitle) && Objects.equals(billDescription, that.billDescription) && Objects.equals(billAmount, that.billAmount) && Objects.equals(externalSystemBillNumber1, that.externalSystemBillNumber1) && Objects.equals(externalSystemBillNumber2, that.externalSystemBillNumber2) && Objects.equals(externalSystemBillNumber3, that.externalSystemBillNumber3) && Objects.equals(billCurrency, that.billCurrency) && Objects.equals(language, that.language) && Objects.equals(relatedCustomerId, that.relatedCustomerId) && Objects.equals(useConvenientFeeRule, that.useConvenientFeeRule) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, billTitle, billDescription, billAmount, externalSystemBillNumber1, externalSystemBillNumber2, externalSystemBillNumber3, billCurrency, language, relatedCustomerId, useConvenientFeeRule);
    }

    @Override
    public String toString() {
        return "BillEntity{" +
                "merchantId='" + merchantId + '\'' +
                ", billTitle='" + billTitle + '\'' +
                ", billDescription='" + billDescription + '\'' +
                ", billAmount='" + billAmount + '\'' +
                ", externalSystemBillNumber1='" + externalSystemBillNumber1 + '\'' +
                ", externalSystemBillNumber2='" + externalSystemBillNumber2 + '\'' +
                ", externalSystemBillNumber3='" + externalSystemBillNumber3 + '\'' +
                ", billCurrency='" + billCurrency + '\'' +
                ", language='" + language + '\'' +
                ", relatedCustomerId='" + relatedCustomerId + '\'' +
                ", useConvenientFeeRule='" + useConvenientFeeRule + '\'' +

                '}';
    }
}