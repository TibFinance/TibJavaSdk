
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatePublicTokenArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ProcessDropInWhitExistingPaymentMethodIdArgs  extends BaseAuthenticatePublicTokenArgs  {

    
    /**
     * Acts as a unique identifier for a distinct payment method.
     */
    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;


    
    public ProcessDropInWhitExistingPaymentMethodIdArgs() {
    }

    
    public ProcessDropInWhitExistingPaymentMethodIdArgs(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }
    
    
    public ProcessDropInWhitExistingPaymentMethodIdArgs(String publicTokenId, String paymentMethodId) {
        super(publicTokenId);
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
        ProcessDropInWhitExistingPaymentMethodIdArgs that = (ProcessDropInWhitExistingPaymentMethodIdArgs) o;
        return Objects.equals(paymentMethodId, that.paymentMethodId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentMethodId);
    }

    @Override
    public String toString() {
        return "ProcessDropInWhitExistingPaymentMethodIdArgs{" +
                "paymentMethodId='" + paymentMethodId + '\'' +

                '}';
    }
}