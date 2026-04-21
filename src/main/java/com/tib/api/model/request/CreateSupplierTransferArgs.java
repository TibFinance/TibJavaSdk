
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.TransferFrequency;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateSupplierTransferArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * The monetary value of each recurring transfer.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * Scheduled date for the supplier transfer to be processed.
     */
    @JsonProperty("TransferDueDate")
    private OffsetDateTime transferDueDate;

    /**
     * The merchant receiving the money. Will be null when creating a new supplier.
     */
    @JsonProperty("TargetMerchantId")
    private String targetMerchantId;

    /**
     * The ISO 4217 three‑letter code of the currency in which the transfer was executed.
     */
    @JsonProperty("Currency")
    private Currency currency;

    /**
     * Specifies the language used for the payment request and related communications
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * Specifies how often the payment should be executed.
     */
    @JsonProperty("TransferFrequency")
    private TransferFrequency transferFrequency;

    /**
     * End date for a recurring supplier transfer. Null means no end date.
     */
    @JsonProperty("RecurringEndDate")
    private OffsetDateTime recurringEndDate;

    /**
     * Bill number or invoice number associated with this supplier transfer.
     */
    @JsonProperty("BillNumber")
    private String billNumber;

    /**
     * The textual description of the bill associated with the transfer.
     */
    @JsonProperty("BillDescription")
    private String billDescription;

    /**
     * The title or description of the bill linked to the transfer.
     */
    @JsonProperty("BillTitle")
    private String billTitle;


    
    public CreateSupplierTransferArgs() {
    }

    
    public CreateSupplierTransferArgs(String merchantId, Double amount, OffsetDateTime transferDueDate, String targetMerchantId, Currency currency, Language language, TransferFrequency transferFrequency, OffsetDateTime recurringEndDate, String billNumber, String billDescription, String billTitle) {
        this.merchantId = merchantId;
        this.amount = amount;
        this.transferDueDate = transferDueDate;
        this.targetMerchantId = targetMerchantId;
        this.currency = currency;
        this.language = language;
        this.transferFrequency = transferFrequency;
        this.recurringEndDate = recurringEndDate;
        this.billNumber = billNumber;
        this.billDescription = billDescription;
        this.billTitle = billTitle;
    }
    
    
    public CreateSupplierTransferArgs(String sessionToken, String merchantId, Double amount, OffsetDateTime transferDueDate, String targetMerchantId, Currency currency, Language language, TransferFrequency transferFrequency, OffsetDateTime recurringEndDate, String billNumber, String billDescription, String billTitle) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.amount = amount;
        this.transferDueDate = transferDueDate;
        this.targetMerchantId = targetMerchantId;
        this.currency = currency;
        this.language = language;
        this.transferFrequency = transferFrequency;
        this.recurringEndDate = recurringEndDate;
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

    public OffsetDateTime getTransferDueDate() {
        return transferDueDate;
    }

    public void setTransferDueDate(OffsetDateTime transferDueDate) {
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

    public OffsetDateTime getRecurringEndDate() {
        return recurringEndDate;
    }

    public void setRecurringEndDate(OffsetDateTime recurringEndDate) {
        this.recurringEndDate = recurringEndDate;
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
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(amount, that.amount) && Objects.equals(transferDueDate, that.transferDueDate) && Objects.equals(targetMerchantId, that.targetMerchantId) && Objects.equals(currency, that.currency) && Objects.equals(language, that.language) && Objects.equals(transferFrequency, that.transferFrequency) && Objects.equals(recurringEndDate, that.recurringEndDate) && Objects.equals(billNumber, that.billNumber) && Objects.equals(billDescription, that.billDescription) && Objects.equals(billTitle, that.billTitle) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, amount, transferDueDate, targetMerchantId, currency, language, transferFrequency, recurringEndDate, billNumber, billDescription, billTitle);
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
                ", recurringEndDate='" + recurringEndDate + '\'' +
                ", billNumber='" + billNumber + '\'' +
                ", billDescription='" + billDescription + '\'' +
                ", billTitle='" + billTitle + '\'' +

                '}';
    }
}