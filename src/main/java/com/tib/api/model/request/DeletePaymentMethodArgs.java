
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


public class DeletePaymentMethodArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Acts as a unique identifier for a distinct payment method.
     */
    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;


    
    public DeletePaymentMethodArgs() {
    }

    
    public DeletePaymentMethodArgs(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
    
    
    public DeletePaymentMethodArgs(String sessionToken, String paymentMethodId) {
        super(sessionToken);
        this.paymentMethodId = paymentMethodId;
    }

    
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeletePaymentMethodArgs that = (DeletePaymentMethodArgs) o;
        return Objects.equals(paymentMethodId, that.paymentMethodId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentMethodId);
    }

    @Override
    public String toString() {
        return "DeletePaymentMethodArgs{" +
                "paymentMethodId='" + paymentMethodId + '\'' +

                '}';
    }
}