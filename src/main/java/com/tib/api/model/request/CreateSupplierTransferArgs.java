
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.TransferFrequency;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateSupplierTransferArgs  extends BaseAuthenticatedCryptedArgs  {

    
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
 * Gets or sets the date and time when the transfer must be completed.
 */
    @JsonProperty("TransferDueDate")
    private LocalDateTime transferDueDate;

    /**
 * The merchant receiving the money. Will be null when creating a new supplier.
 */
    @JsonProperty("TargetMerchantId")
    private String targetMerchantId;

    /**
 * Retrieves or assigns the currency type used in transactions.
 */
    @JsonProperty("Currency")
    private Currency currency;

    /**
 * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
 */
    @JsonProperty("Language")
    private Language language;

    /**
 * Defines the frequency at which transfers occur within the TIB Finance API.
 */
    @JsonProperty("TransferFrequency")
    private TransferFrequency transferFrequency;

    /**
 * 
 */
    @JsonProperty("BillNumber")
    private String billNumber;

    /**
 * Provides a textual description of the bill associated with a payment.
 */
    @JsonProperty("BillDescription")
    private String billDescription;

    /**
 * Represents the title of a bill associated with a payment.
 */
    @JsonProperty("BillTitle")
    private String billTitle;


    
    public CreateSupplierTransferArgs() {
    }

    
    public CreateSupplierTransferArgs(String merchantId, Double amount, LocalDateTime transferDueDate, String targetMerchantId, Currency currency, Language language, TransferFrequency transferFrequency, String billNumber, String billDescription, String billTitle) {
        this.merchantId = merchantId;
this.amount = amount;
this.transferDueDate = transferDueDate;
this.targetMerchantId = targetMerchantId;
this.currency = currency;
this.language = language;
this.transferFrequency = transferFrequency;
this.billNumber = billNumber;
this.billDescription = billDescription;
this.billTitle = billTitle;

    }
    
    
    public CreateSupplierTransferArgs(String sessionToken, String merchantId, Double amount, LocalDateTime transferDueDate, String targetMerchantId, Currency currency, Language language, TransferFrequency transferFrequency, String billNumber, String billDescription, String billTitle) {
        super(sessionToken);
        this.merchantId = merchantId;
this.amount = amount;
this.transferDueDate = transferDueDate;
this.targetMerchantId = targetMerchantId;
this.currency = currency;
this.language = language;
this.transferFrequency = transferFrequency;
this.billNumber = billNumber;
this.billDescription = billDescription;
this.billTitle = billTitle;

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

    public LocalDateTime getTransferDueDate() {
        return transferDueDate;
    }

    public void setTransferDueDate(LocalDateTime transferDueDate) {
        this.transferDueDate = transferDueDate;
    }

    public String getTargetMerchantId() {
        return targetMerchantId;
    }

    public void setTargetMerchantId(String targetMerchantId) {
        this.targetMerchantId = targetMerchantId;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public TransferFrequency getTransferFrequency() {
        return transferFrequency;
    }

    public void setTransferFrequency(TransferFrequency transferFrequency) {
        this.transferFrequency = transferFrequency;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getBillDescription() {
        return billDescription;
    }

    public void setBillDescription(String billDescription) {
        this.billDescription = billDescription;
    }

    public String getBillTitle() {
        return billTitle;
    }

    public void setBillTitle(String billTitle) {
        this.billTitle = billTitle;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateSupplierTransferArgs that = (CreateSupplierTransferArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(amount, that.amount) && Objects.equals(transferDueDate, that.transferDueDate) && Objects.equals(targetMerchantId, that.targetMerchantId) && Objects.equals(currency, that.currency) && Objects.equals(language, that.language) && Objects.equals(transferFrequency, that.transferFrequency) && Objects.equals(billNumber, that.billNumber) && Objects.equals(billDescription, that.billDescription) && Objects.equals(billTitle, that.billTitle) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, amount, transferDueDate, targetMerchantId, currency, language, transferFrequency, billNumber, billDescription, billTitle);
    }

    @Override
    public String toString() {
        return "CreateSupplierTransferArgs{" +
                 "merchantId='" + merchantId + '\'' +
 ", amount='" + amount + '\'' +
 ", transferDueDate='" + transferDueDate + '\'' +
 ", targetMerchantId='" + targetMerchantId + '\'' +
 ", currency='" + currency + '\'' +
 ", language='" + language + '\'' +
 ", transferFrequency='" + transferFrequency + '\'' +
 ", billNumber='" + billNumber + '\'' +
 ", billDescription='" + billDescription + '\'' +
 ", billTitle='" + billTitle + '\'' +

                '}';
    }
}