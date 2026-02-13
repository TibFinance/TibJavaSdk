
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class ForcePaymentProcessArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Retrieves or assigns the unique identifier for a payment.
 */
    @JsonProperty("PaymentId")
    private String paymentId;


    
    public ForcePaymentProcessArgs() {
    }

    
    public ForcePaymentProcessArgs(String paymentId) {
        this.paymentId = paymentId;

    }
    
    
    public ForcePaymentProcessArgs(String sessionToken, String paymentId) {
        super(sessionToken);
        this.paymentId = paymentId;

    }

    
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForcePaymentProcessArgs that = (ForcePaymentProcessArgs) o;
        return Objects.equals(paymentId, that.paymentId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentId);
    }

    @Override
    public String toString() {
        return "ForcePaymentProcessArgs{" +
                 "paymentId='" + paymentId + '\'' +

                '}';
    }
}