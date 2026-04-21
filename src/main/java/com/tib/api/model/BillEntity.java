
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.Language;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BillEntity   {

    
    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * The title or description of the bill linked to the transfer.
     */
    @JsonProperty("BillTitle")
    private String billTitle;

    /**
     * The textual description of the bill associated with the transfer.
     */
    @JsonProperty("BillDescription")
    private String billDescription;

    /**
     * The total monetary amount due for the requested bill.
     */
    @JsonProperty("BillAmount")
    private Double billAmount;

    /**
     * The bill identifier assigned by the first external system linked to this transaction.
     */
    @JsonProperty("ExternalSystemBillNumber1")
    private String externalSystemBillNumber1;

    /**
     * Secondary bill identifier assigned by an external system
     */
    @JsonProperty("ExternalSystemBillNumber2")
    private String externalSystemBillNumber2;

    /**
     * The bill number assigned by the third external system.
     */
    @JsonProperty("ExternalSystemBillNumber3")
    private String externalSystemBillNumber3;

    /**
     * The currency in which the bill amount is denominated.
     */
    @JsonProperty("BillCurrency")
    private Currency billCurrency;

    /**
     * Specifies the language used for the payment request and related communications
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * Identifier of the customer associated with the payment
     */
    @JsonProperty("RelatedCustomerId")
    private String relatedCustomerId;

    /**
     * Indicates whether the convenient fee rule is applied to the retrieved bill.
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