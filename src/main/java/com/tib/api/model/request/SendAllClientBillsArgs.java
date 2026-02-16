
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


public class SendAllClientBillsArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Gets or sets the year.
     */
    @JsonProperty("Year")
    private Integer year;

    /**
     * Gets or sets the month.
     */
    @JsonProperty("Month")
    private Integer month;

    /**
     * 
     */
    @JsonProperty("SendToQuickbook")
    private boolean sendToQuickbook;

    /**
     * 
     */
    @JsonProperty("SendToQuickbookByEmail")
    private boolean sendToQuickbookByEmail;


    
    public SendAllClientBillsArgs() {
    }

    
    public SendAllClientBillsArgs(String merchantId, Integer year, Integer month, boolean sendToQuickbook, boolean sendToQuickbookByEmail) {
        this.merchantId = merchantId;
        this.year = year;
        this.month = month;
        this.sendToQuickbook = sendToQuickbook;
        this.sendToQuickbookByEmail = sendToQuickbookByEmail;
    }
    
    
    public SendAllClientBillsArgs(String adminSessionToken, String merchantId, Integer year, Integer month, boolean sendToQuickbook, boolean sendToQuickbookByEmail) {
        super(adminSessionToken);
        this.merchantId = merchantId;
        this.year = year;
        this.month = month;
        this.sendToQuickbook = sendToQuickbook;
        this.sendToQuickbookByEmail = sendToQuickbookByEmail;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public boolean getSendToQuickbook() {
        return sendToQuickbook;
    }

    public void setSendToQuickbook(boolean sendToQuickbook) {
        this.sendToQuickbook = sendToQuickbook;
    }

    public boolean getSendToQuickbookByEmail() {
        return sendToQuickbookByEmail;
    }

    public void setSendToQuickbookByEmail(boolean sendToQuickbookByEmail) {
        this.sendToQuickbookByEmail = sendToQuickbookByEmail;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SendAllClientBillsArgs that = (SendAllClientBillsArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(year, that.year) && Objects.equals(month, that.month) && Objects.equals(sendToQuickbook, that.sendToQuickbook) && Objects.equals(sendToQuickbookByEmail, that.sendToQuickbookByEmail) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, year, month, sendToQuickbook, sendToQuickbookByEmail);
    }

    @Override
    public String toString() {
        return "SendAllClientBillsArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", sendToQuickbook='" + sendToQuickbook + '\'' +
                ", sendToQuickbookByEmail='" + sendToQuickbookByEmail + '\'' +

                '}';
    }
}