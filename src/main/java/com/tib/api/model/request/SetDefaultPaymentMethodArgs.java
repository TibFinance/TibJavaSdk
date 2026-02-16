
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


public class SetDefaultPaymentMethodArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Serves as a unique identifier for each customer within the system.
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * Acts as a unique identifier for a distinct payment method.
     */
    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;


    
    public SetDefaultPaymentMethodArgs() {
    }

    
    public SetDefaultPaymentMethodArgs(String customerId, String paymentMethodId) {
        this.customerId = customerId;
        this.paymentMethodId = paymentMethodId;
    }
    
    
    public SetDefaultPaymentMethodArgs(String sessionToken, String customerId, String paymentMethodId) {
        super(sessionToken);
        this.customerId = customerId;
        this.paymentMethodId = paymentMethodId;
    }

    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
        SetDefaultPaymentMethodArgs that = (SetDefaultPaymentMethodArgs) o;
        return Objects.equals(customerId, that.customerId) && Objects.equals(paymentMethodId, that.paymentMethodId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerId, paymentMethodId);
    }

    @Override
    public String toString() {
        return "SetDefaultPaymentMethodArgs{" +
                "customerId='" + customerId + '\'' +
                ", paymentMethodId='" + paymentMethodId + '\'' +

                '}';
    }
}