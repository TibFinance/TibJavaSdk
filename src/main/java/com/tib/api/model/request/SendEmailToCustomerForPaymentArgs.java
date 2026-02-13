
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TransferType;
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


public class SendEmailToCustomerForPaymentArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * Defines and manages the type of transfer operation within the system.
 */
    @JsonProperty("TransferType")
    private TransferType transferType;

    /**
 * 
 */
    @JsonProperty("DropInPublicTokenId")
    private String dropInPublicTokenId;

    /**
 * Specifies the email address associated with the merchant.
 */
    @JsonProperty("Email")
    private String email;


    
    public SendEmailToCustomerForPaymentArgs() {
    }

    
    public SendEmailToCustomerForPaymentArgs(String merchantId, TransferType transferType, String dropInPublicTokenId, String email) {
        this.merchantId = merchantId;
this.transferType = transferType;
this.dropInPublicTokenId = dropInPublicTokenId;
this.email = email;

    }
    
    
    public SendEmailToCustomerForPaymentArgs(String sessionToken, String merchantId, TransferType transferType, String dropInPublicTokenId, String email) {
        super(sessionToken);
        this.merchantId = merchantId;
this.transferType = transferType;
this.dropInPublicTokenId = dropInPublicTokenId;
this.email = email;

    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public TransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }

    public String getDropInPublicTokenId() {
        return dropInPublicTokenId;
    }

    public void setDropInPublicTokenId(String dropInPublicTokenId) {
        this.dropInPublicTokenId = dropInPublicTokenId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SendEmailToCustomerForPaymentArgs that = (SendEmailToCustomerForPaymentArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(transferType, that.transferType) && Objects.equals(dropInPublicTokenId, that.dropInPublicTokenId) && Objects.equals(email, that.email) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, transferType, dropInPublicTokenId, email);
    }

    @Override
    public String toString() {
        return "SendEmailToCustomerForPaymentArgs{" +
                 "merchantId='" + merchantId + '\'' +
 ", transferType='" + transferType + '\'' +
 ", dropInPublicTokenId='" + dropInPublicTokenId + '\'' +
 ", email='" + email + '\'' +

                '}';
    }
}