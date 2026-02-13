
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransactionMailingInfo   {

    
    /**
 * Gets or sets the mail body.
 */
    @JsonProperty("MailBody")
    private String mailBody;

    /**
 * Gets or sets the mail subject.
 */
    @JsonProperty("MailSubject")
    private String mailSubject;

    /**
 * Converts to address.
 */
    @JsonProperty("ToAddress")
    private String toAddress;

    /**
 * Gets or sets from address.
 */
    @JsonProperty("FromAddress")
    private String fromAddress;


    
    public TransactionMailingInfo() {
    }

    
    public TransactionMailingInfo(String mailBody, String mailSubject, String toAddress, String fromAddress) {
        this.mailBody = mailBody;
this.mailSubject = mailSubject;
this.toAddress = toAddress;
this.fromAddress = fromAddress;

    }
    
    

    
    public String getMailBody() {
        return mailBody;
    }

    public void setMailBody(String mailBody) {
        this.mailBody = mailBody;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionMailingInfo that = (TransactionMailingInfo) o;
        return Objects.equals(mailBody, that.mailBody) && Objects.equals(mailSubject, that.mailSubject) && Objects.equals(toAddress, that.toAddress) && Objects.equals(fromAddress, that.fromAddress) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(mailBody, mailSubject, toAddress, fromAddress);
    }

    @Override
    public String toString() {
        return "TransactionMailingInfo{" +
                 "mailBody='" + mailBody + '\'' +
 ", mailSubject='" + mailSubject + '\'' +
 ", toAddress='" + toAddress + '\'' +
 ", fromAddress='" + fromAddress + '\'' +

                '}';
    }
}