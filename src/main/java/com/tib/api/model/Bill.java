
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


public class Bill  extends BillEntity  {

    
    /**
 * Retrieves or assigns the unique identifier for a bill.
 */
    @JsonProperty("BillId")
    private String billId;

    /**
 * Gets or sets the fee applied to credit‑card transactions when the convenient fee option is used.
 */
    @JsonProperty("ConvenientFeeCreditCard")
    private Double convenientFeeCreditCard;

    /**
 * Gets or sets the fee amount that is directly applied to the merchant's account for convenience services.
 */
    @JsonProperty("ConvenientFeeDirectAccount")
    private Double convenientFeeDirectAccount;

    /**
 * The date and time when the payment was created.
 */
    @JsonProperty("CreatedDate")
    private LocalDateTime createdDate;


    
    public Bill() {
    }

    
    public Bill(String billId, Double convenientFeeCreditCard, Double convenientFeeDirectAccount, LocalDateTime createdDate) {
        this.billId = billId;
this.convenientFeeCreditCard = convenientFeeCreditCard;
this.convenientFeeDirectAccount = convenientFeeDirectAccount;
this.createdDate = createdDate;

    }
    
    
    public Bill(String merchantId, String billTitle, String billDescription, Double billAmount, String externalSystemBillNumber1, String externalSystemBillNumber2, String externalSystemBillNumber3, Currency billCurrency, Language language, String relatedCustomerId, boolean useConvenientFeeRule, String billId, Double convenientFeeCreditCard, Double convenientFeeDirectAccount, LocalDateTime createdDate) {
        super(merchantId, billTitle, billDescription, billAmount, externalSystemBillNumber1, externalSystemBillNumber2, externalSystemBillNumber3, billCurrency, language, relatedCustomerId, useConvenientFeeRule);
        this.billId = billId;
this.convenientFeeCreditCard = convenientFeeCreditCard;
this.convenientFeeDirectAccount = convenientFeeDirectAccount;
this.createdDate = createdDate;

    }

    
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public Double getConvenientFeeCreditCard() {
        return convenientFeeCreditCard;
    }

    public void setConvenientFeeCreditCard(Double convenientFeeCreditCard) {
        this.convenientFeeCreditCard = convenientFeeCreditCard;
    }

    public Double getConvenientFeeDirectAccount() {
        return convenientFeeDirectAccount;
    }

    public void setConvenientFeeDirectAccount(Double convenientFeeDirectAccount) {
        this.convenientFeeDirectAccount = convenientFeeDirectAccount;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill that = (Bill) o;
        return Objects.equals(billId, that.billId) && Objects.equals(convenientFeeCreditCard, that.convenientFeeCreditCard) && Objects.equals(convenientFeeDirectAccount, that.convenientFeeDirectAccount) && Objects.equals(createdDate, that.createdDate) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(billId, convenientFeeCreditCard, convenientFeeDirectAccount, createdDate);
    }

    @Override
    public String toString() {
        return "Bill{" +
                 "billId='" + billId + '\'' +
 ", convenientFeeCreditCard='" + convenientFeeCreditCard + '\'' +
 ", convenientFeeDirectAccount='" + convenientFeeDirectAccount + '\'' +
 ", createdDate='" + createdDate + '\'' +

                '}';
    }
}