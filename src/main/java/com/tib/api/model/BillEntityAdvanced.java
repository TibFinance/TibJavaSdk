
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BillLineEntity;
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


public class BillEntityAdvanced  extends BillEntity  {

    
    /**
 * Invoice number prefix (e.g., "INV-", "FAC-"). If not provided, merchant's default will be used.
 */
    @JsonProperty("InvoiceNumberPrefix")
    private String invoiceNumberPrefix;

    /**
 * Custom invoice number. If not provided, system will auto-generate based on merchant's sequence.
 */
    @JsonProperty("InvoiceNumber")
    private String invoiceNumber;

    /**
 * Purchase order number from customer (optional reference)
 */
    @JsonProperty("PurchaseOrderNumber")
    private String purchaseOrderNumber;

    /**
 * Specifies the due date for the payment. If the value is null, the system treats the due date as the current date and time.
 */
    @JsonProperty("DueDate")
    private LocalDateTime dueDate;

    /**
 * Invoice status. Defaults to Draft (0). 0=Draft, 1=Sent, 2=Viewed, 3=Paid, 4=Overdue, 5=Cancelled, 6=PartiallyPaid
 */
    @JsonProperty("InvoiceStatus")
    private Integer invoiceStatus;

    /**
 * Customer billing name
 */
    @JsonProperty("BillingName")
    private String billingName;

    /**
 * Customer billing email
 */
    @JsonProperty("BillingEmail")
    private String billingEmail;

    /**
 * Customer billing phone
 */
    @JsonProperty("BillingPhone")
    private String billingPhone;

    /**
 * Customer billing address line 1
 */
    @JsonProperty("BillingAddress1")
    private String billingAddress1;

    /**
 * Customer billing address line 2
 */
    @JsonProperty("BillingAddress2")
    private String billingAddress2;

    /**
 * Customer billing city
 */
    @JsonProperty("BillingCity")
    private String billingCity;

    /**
 * Customer billing provincestate
 */
    @JsonProperty("BillingProvince")
    private String billingProvince;

    /**
 * Customer billing postalzip code
 */
    @JsonProperty("BillingPostalCode")
    private String billingPostalCode;

    /**
 * Customer billing country (ISO 2-letter code, e.g., "CA", "US")
 */
    @JsonProperty("BillingCountry")
    private String billingCountry;

    /**
 * First tax name (e.g., "TPS", "GST", "HST")
 */
    @JsonProperty("TaxName1")
    private String taxName1;

    /**
 * First tax rate as percentage (e.g., 5.00 for 5%)
 */
    @JsonProperty("TaxRate1")
    private Double taxRate1;

    /**
 * First tax registration number (e.g., GST number)
 */
    @JsonProperty("TaxNumber1")
    private String taxNumber1;

    /**
 * Second tax name (e.g., "TVQ", "PST", "QST")
 */
    @JsonProperty("TaxName2")
    private String taxName2;

    /**
 * Second tax rate as percentage (e.g., 9.975 for QST)
 */
    @JsonProperty("TaxRate2")
    private Double taxRate2;

    /**
 * Second tax registration number (e.g., QST number)
 */
    @JsonProperty("TaxNumber2")
    private String taxNumber2;

    /**
 * Overall discount percentage applied to subtotal (0-100)
 */
    @JsonProperty("DiscountPercent")
    private Double discountPercent;

    /**
 * Overall discount amount applied to subtotal (alternative to percentage)
 */
    @JsonProperty("DiscountAmount")
    private Double discountAmount;

    /**
 * Notes visible to the customer on the invoice
 */
    @JsonProperty("Notes")
    private String notes;

    /**
 * Internal notes (not visible to customer)
 */
    @JsonProperty("InternalNotes")
    private String internalNotes;

    /**
 * Terms and conditions text for the invoice
 */
    @JsonProperty("TermsAndConditions")
    private String termsAndConditions;

    /**
 * Footer text for the invoice
 */
    @JsonProperty("FooterText")
    private String footerText;

    /**
 * External accounting system ID (for sync with QuickBooks, Sage, Xero, etc.)
 */
    @JsonProperty("ExternalAccountingId")
    private String externalAccountingId;

    /**
 * Name of the external accounting system (e.g., "QuickBooks", "Sage", "Xero")
 */
    @JsonProperty("ExternalAccountingSystem")
    private String externalAccountingSystem;

    /**
 * Line items for the invoice. If not provided, a single line will be created from BillAmount.
 */
    @JsonProperty("Lines")
    private List<BillLineEntity> lines;


    
    public BillEntityAdvanced() {
    }

    
    public BillEntityAdvanced(String invoiceNumberPrefix, String invoiceNumber, String purchaseOrderNumber, LocalDateTime dueDate, Integer invoiceStatus, String billingName, String billingEmail, String billingPhone, String billingAddress1, String billingAddress2, String billingCity, String billingProvince, String billingPostalCode, String billingCountry, String taxName1, Double taxRate1, String taxNumber1, String taxName2, Double taxRate2, String taxNumber2, Double discountPercent, Double discountAmount, String notes, String internalNotes, String termsAndConditions, String footerText, String externalAccountingId, String externalAccountingSystem, List<BillLineEntity> lines) {
        this.invoiceNumberPrefix = invoiceNumberPrefix;
this.invoiceNumber = invoiceNumber;
this.purchaseOrderNumber = purchaseOrderNumber;
this.dueDate = dueDate;
this.invoiceStatus = invoiceStatus;
this.billingName = billingName;
this.billingEmail = billingEmail;
this.billingPhone = billingPhone;
this.billingAddress1 = billingAddress1;
this.billingAddress2 = billingAddress2;
this.billingCity = billingCity;
this.billingProvince = billingProvince;
this.billingPostalCode = billingPostalCode;
this.billingCountry = billingCountry;
this.taxName1 = taxName1;
this.taxRate1 = taxRate1;
this.taxNumber1 = taxNumber1;
this.taxName2 = taxName2;
this.taxRate2 = taxRate2;
this.taxNumber2 = taxNumber2;
this.discountPercent = discountPercent;
this.discountAmount = discountAmount;
this.notes = notes;
this.internalNotes = internalNotes;
this.termsAndConditions = termsAndConditions;
this.footerText = footerText;
this.externalAccountingId = externalAccountingId;
this.externalAccountingSystem = externalAccountingSystem;
this.lines = lines;

    }
    
    
    public BillEntityAdvanced(String merchantId, String billTitle, String billDescription, Double billAmount, String externalSystemBillNumber1, String externalSystemBillNumber2, String externalSystemBillNumber3, Currency billCurrency, Language language, String relatedCustomerId, boolean useConvenientFeeRule, String invoiceNumberPrefix, String invoiceNumber, String purchaseOrderNumber, LocalDateTime dueDate, Integer invoiceStatus, String billingName, String billingEmail, String billingPhone, String billingAddress1, String billingAddress2, String billingCity, String billingProvince, String billingPostalCode, String billingCountry, String taxName1, Double taxRate1, String taxNumber1, String taxName2, Double taxRate2, String taxNumber2, Double discountPercent, Double discountAmount, String notes, String internalNotes, String termsAndConditions, String footerText, String externalAccountingId, String externalAccountingSystem, List<BillLineEntity> lines) {
        super(merchantId, billTitle, billDescription, billAmount, externalSystemBillNumber1, externalSystemBillNumber2, externalSystemBillNumber3, billCurrency, language, relatedCustomerId, useConvenientFeeRule);
        this.invoiceNumberPrefix = invoiceNumberPrefix;
this.invoiceNumber = invoiceNumber;
this.purchaseOrderNumber = purchaseOrderNumber;
this.dueDate = dueDate;
this.invoiceStatus = invoiceStatus;
this.billingName = billingName;
this.billingEmail = billingEmail;
this.billingPhone = billingPhone;
this.billingAddress1 = billingAddress1;
this.billingAddress2 = billingAddress2;
this.billingCity = billingCity;
this.billingProvince = billingProvince;
this.billingPostalCode = billingPostalCode;
this.billingCountry = billingCountry;
this.taxName1 = taxName1;
this.taxRate1 = taxRate1;
this.taxNumber1 = taxNumber1;
this.taxName2 = taxName2;
this.taxRate2 = taxRate2;
this.taxNumber2 = taxNumber2;
this.discountPercent = discountPercent;
this.discountAmount = discountAmount;
this.notes = notes;
this.internalNotes = internalNotes;
this.termsAndConditions = termsAndConditions;
this.footerText = footerText;
this.externalAccountingId = externalAccountingId;
this.externalAccountingSystem = externalAccountingSystem;
this.lines = lines;

    }

    
    public String getInvoiceNumberPrefix() {
        return invoiceNumberPrefix;
    }

    public void setInvoiceNumberPrefix(String invoiceNumberPrefix) {
        this.invoiceNumberPrefix = invoiceNumberPrefix;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getBillingName() {
        return billingName;
    }

    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    public String getBillingPhone() {
        return billingPhone;
    }

    public void setBillingPhone(String billingPhone) {
        this.billingPhone = billingPhone;
    }

    public String getBillingAddress1() {
        return billingAddress1;
    }

    public void setBillingAddress1(String billingAddress1) {
        this.billingAddress1 = billingAddress1;
    }

    public String getBillingAddress2() {
        return billingAddress2;
    }

    public void setBillingAddress2(String billingAddress2) {
        this.billingAddress2 = billingAddress2;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingProvince() {
        return billingProvince;
    }

    public void setBillingProvince(String billingProvince) {
        this.billingProvince = billingProvince;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getTaxName1() {
        return taxName1;
    }

    public void setTaxName1(String taxName1) {
        this.taxName1 = taxName1;
    }

    public Double getTaxRate1() {
        return taxRate1;
    }

    public void setTaxRate1(Double taxRate1) {
        this.taxRate1 = taxRate1;
    }

    public String getTaxNumber1() {
        return taxNumber1;
    }

    public void setTaxNumber1(String taxNumber1) {
        this.taxNumber1 = taxNumber1;
    }

    public String getTaxName2() {
        return taxName2;
    }

    public void setTaxName2(String taxName2) {
        this.taxName2 = taxName2;
    }

    public Double getTaxRate2() {
        return taxRate2;
    }

    public void setTaxRate2(Double taxRate2) {
        this.taxRate2 = taxRate2;
    }

    public String getTaxNumber2() {
        return taxNumber2;
    }

    public void setTaxNumber2(String taxNumber2) {
        this.taxNumber2 = taxNumber2;
    }

    public Double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getInternalNotes() {
        return internalNotes;
    }

    public void setInternalNotes(String internalNotes) {
        this.internalNotes = internalNotes;
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public String getFooterText() {
        return footerText;
    }

    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }

    public String getExternalAccountingId() {
        return externalAccountingId;
    }

    public void setExternalAccountingId(String externalAccountingId) {
        this.externalAccountingId = externalAccountingId;
    }

    public String getExternalAccountingSystem() {
        return externalAccountingSystem;
    }

    public void setExternalAccountingSystem(String externalAccountingSystem) {
        this.externalAccountingSystem = externalAccountingSystem;
    }

    public List<BillLineEntity> getLines() {
        return lines;
    }

    public void setLines(List<BillLineEntity> lines) {
        this.lines = lines;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillEntityAdvanced that = (BillEntityAdvanced) o;
        return Objects.equals(invoiceNumberPrefix, that.invoiceNumberPrefix) && Objects.equals(invoiceNumber, that.invoiceNumber) && Objects.equals(purchaseOrderNumber, that.purchaseOrderNumber) && Objects.equals(dueDate, that.dueDate) && Objects.equals(invoiceStatus, that.invoiceStatus) && Objects.equals(billingName, that.billingName) && Objects.equals(billingEmail, that.billingEmail) && Objects.equals(billingPhone, that.billingPhone) && Objects.equals(billingAddress1, that.billingAddress1) && Objects.equals(billingAddress2, that.billingAddress2) && Objects.equals(billingCity, that.billingCity) && Objects.equals(billingProvince, that.billingProvince) && Objects.equals(billingPostalCode, that.billingPostalCode) && Objects.equals(billingCountry, that.billingCountry) && Objects.equals(taxName1, that.taxName1) && Objects.equals(taxRate1, that.taxRate1) && Objects.equals(taxNumber1, that.taxNumber1) && Objects.equals(taxName2, that.taxName2) && Objects.equals(taxRate2, that.taxRate2) && Objects.equals(taxNumber2, that.taxNumber2) && Objects.equals(discountPercent, that.discountPercent) && Objects.equals(discountAmount, that.discountAmount) && Objects.equals(notes, that.notes) && Objects.equals(internalNotes, that.internalNotes) && Objects.equals(termsAndConditions, that.termsAndConditions) && Objects.equals(footerText, that.footerText) && Objects.equals(externalAccountingId, that.externalAccountingId) && Objects.equals(externalAccountingSystem, that.externalAccountingSystem) && Objects.equals(lines, that.lines) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(invoiceNumberPrefix, invoiceNumber, purchaseOrderNumber, dueDate, invoiceStatus, billingName, billingEmail, billingPhone, billingAddress1, billingAddress2, billingCity, billingProvince, billingPostalCode, billingCountry, taxName1, taxRate1, taxNumber1, taxName2, taxRate2, taxNumber2, discountPercent, discountAmount, notes, internalNotes, termsAndConditions, footerText, externalAccountingId, externalAccountingSystem, lines);
    }

    @Override
    public String toString() {
        return "BillEntityAdvanced{" +
                 "invoiceNumberPrefix='" + invoiceNumberPrefix + '\'' +
 ", invoiceNumber='" + invoiceNumber + '\'' +
 ", purchaseOrderNumber='" + purchaseOrderNumber + '\'' +
 ", dueDate='" + dueDate + '\'' +
 ", invoiceStatus='" + invoiceStatus + '\'' +
 ", billingName='" + billingName + '\'' +
 ", billingEmail='" + billingEmail + '\'' +
 ", billingPhone='" + billingPhone + '\'' +
 ", billingAddress1='" + billingAddress1 + '\'' +
 ", billingAddress2='" + billingAddress2 + '\'' +
 ", billingCity='" + billingCity + '\'' +
 ", billingProvince='" + billingProvince + '\'' +
 ", billingPostalCode='" + billingPostalCode + '\'' +
 ", billingCountry='" + billingCountry + '\'' +
 ", taxName1='" + taxName1 + '\'' +
 ", taxRate1='" + taxRate1 + '\'' +
 ", taxNumber1='" + taxNumber1 + '\'' +
 ", taxName2='" + taxName2 + '\'' +
 ", taxRate2='" + taxRate2 + '\'' +
 ", taxNumber2='" + taxNumber2 + '\'' +
 ", discountPercent='" + discountPercent + '\'' +
 ", discountAmount='" + discountAmount + '\'' +
 ", notes='" + notes + '\'' +
 ", internalNotes='" + internalNotes + '\'' +
 ", termsAndConditions='" + termsAndConditions + '\'' +
 ", footerText='" + footerText + '\'' +
 ", externalAccountingId='" + externalAccountingId + '\'' +
 ", externalAccountingSystem='" + externalAccountingSystem + '\'' +
 ", lines='" + lines + '\'' +

                '}';
    }
}