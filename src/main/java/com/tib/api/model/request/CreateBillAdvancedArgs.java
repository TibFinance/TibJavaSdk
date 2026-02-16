
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BillEntityAdvanced;
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


public class CreateBillAdvancedArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Represents the data required to create a new bill in the TIB Finance system.
     */
    @JsonProperty("BillData")
    private BillEntityAdvanced billData;

    /**
     * Determines whether the function should return an error if the merchant has not been authorized. This boolean property ensures that unauthorized merchants are not processed further.
     */
    @JsonProperty("BreakIfMerchantNeverBeenAuthorized")
    private boolean breakIfMerchantNeverBeenAuthorized;

    /**
     * If true, the system will automatically calculate totals from line items. If false, use the BillAmount from BillData as the total. Default: true when Lines are provided, false otherwise.
     */
    @JsonProperty("AutoCalculateTotals")
    private boolean autoCalculateTotals;

    /**
     * If true, the system will automatically generate an invoice number using the merchant's sequence. If false and InvoiceNumber is not provided, no invoice number will be assigned. Default: true
     */
    @JsonProperty("AutoGenerateInvoiceNumber")
    private boolean autoGenerateInvoiceNumber;

    /**
     * If true and the invoice is marked as Sent status, an email will be sent to the billing email. Default: false
     */
    @JsonProperty("SendEmailOnCreate")
    private boolean sendEmailOnCreate;


    
    public CreateBillAdvancedArgs() {
    }

    
    public CreateBillAdvancedArgs(BillEntityAdvanced billData, boolean breakIfMerchantNeverBeenAuthorized, boolean autoCalculateTotals, boolean autoGenerateInvoiceNumber, boolean sendEmailOnCreate) {
        this.billData = billData;
        this.breakIfMerchantNeverBeenAuthorized = breakIfMerchantNeverBeenAuthorized;
        this.autoCalculateTotals = autoCalculateTotals;
        this.autoGenerateInvoiceNumber = autoGenerateInvoiceNumber;
        this.sendEmailOnCreate = sendEmailOnCreate;
    }
    
    
    public CreateBillAdvancedArgs(String sessionToken, BillEntityAdvanced billData, boolean breakIfMerchantNeverBeenAuthorized, boolean autoCalculateTotals, boolean autoGenerateInvoiceNumber, boolean sendEmailOnCreate) {
        super(sessionToken);
        this.billData = billData;
        this.breakIfMerchantNeverBeenAuthorized = breakIfMerchantNeverBeenAuthorized;
        this.autoCalculateTotals = autoCalculateTotals;
        this.autoGenerateInvoiceNumber = autoGenerateInvoiceNumber;
        this.sendEmailOnCreate = sendEmailOnCreate;
    }

    
    public BillEntityAdvanced getBillData() {
        return billData;
    }

    public void setBillData(BillEntityAdvanced billData) {
        this.billData = billData;
    }

    public boolean getBreakIfMerchantNeverBeenAuthorized() {
        return breakIfMerchantNeverBeenAuthorized;
    }

    public void setBreakIfMerchantNeverBeenAuthorized(boolean breakIfMerchantNeverBeenAuthorized) {
        this.breakIfMerchantNeverBeenAuthorized = breakIfMerchantNeverBeenAuthorized;
    }

    public boolean getAutoCalculateTotals() {
        return autoCalculateTotals;
    }

    public void setAutoCalculateTotals(boolean autoCalculateTotals) {
        this.autoCalculateTotals = autoCalculateTotals;
    }

    public boolean getAutoGenerateInvoiceNumber() {
        return autoGenerateInvoiceNumber;
    }

    public void setAutoGenerateInvoiceNumber(boolean autoGenerateInvoiceNumber) {
        this.autoGenerateInvoiceNumber = autoGenerateInvoiceNumber;
    }

    public boolean getSendEmailOnCreate() {
        return sendEmailOnCreate;
    }

    public void setSendEmailOnCreate(boolean sendEmailOnCreate) {
        this.sendEmailOnCreate = sendEmailOnCreate;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateBillAdvancedArgs that = (CreateBillAdvancedArgs) o;
        return Objects.equals(billData, that.billData) && Objects.equals(breakIfMerchantNeverBeenAuthorized, that.breakIfMerchantNeverBeenAuthorized) && Objects.equals(autoCalculateTotals, that.autoCalculateTotals) && Objects.equals(autoGenerateInvoiceNumber, that.autoGenerateInvoiceNumber) && Objects.equals(sendEmailOnCreate, that.sendEmailOnCreate) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(billData, breakIfMerchantNeverBeenAuthorized, autoCalculateTotals, autoGenerateInvoiceNumber, sendEmailOnCreate);
    }

    @Override
    public String toString() {
        return "CreateBillAdvancedArgs{" +
                "billData='" + billData + '\'' +
                ", breakIfMerchantNeverBeenAuthorized='" + breakIfMerchantNeverBeenAuthorized + '\'' +
                ", autoCalculateTotals='" + autoCalculateTotals + '\'' +
                ", autoGenerateInvoiceNumber='" + autoGenerateInvoiceNumber + '\'' +
                ", sendEmailOnCreate='" + sendEmailOnCreate + '\'' +

                '}';
    }
}