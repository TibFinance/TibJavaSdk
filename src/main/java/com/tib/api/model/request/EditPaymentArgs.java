
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


public class EditPaymentArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * Retrieves or assigns the unique identifier for a payment.
     */
    @JsonProperty("PaymentId")
    private String paymentId;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public EditPaymentArgs() {
    }

    
    public EditPaymentArgs(String paymentId, String merchantId) {
        this.paymentId = paymentId;
        this.merchantId = merchantId;
    }
    
    
    public EditPaymentArgs(String adminSessionToken, String paymentId, String merchantId) {
        super(adminSessionToken);
        this.paymentId = paymentId;
        this.merchantId = merchantId;
    }

    
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EditPaymentArgs that = (EditPaymentArgs) o;
        return Objects.equals(paymentId, that.paymentId) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentId, merchantId);
    }

    @Override
    public String toString() {
        return "EditPaymentArgs{" +
                "paymentId='" + paymentId + '\'' +
                ", merchantId='" + merchantId + '\'' +

                '}';
    }
}