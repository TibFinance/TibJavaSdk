
package com.tib.api.model.request;

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


public class IsValidPaymentIdArgs  implements IBaseCryptedServiceArgs  {

    
    /**
 * Retrieves or assigns the unique identifier for a payment.
 */
    @JsonProperty("PaymentId")
    private String paymentId;


    
    public IsValidPaymentIdArgs() {
    }

    
    public IsValidPaymentIdArgs(String paymentId) {
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
        IsValidPaymentIdArgs that = (IsValidPaymentIdArgs) o;
        return Objects.equals(paymentId, that.paymentId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentId);
    }

    @Override
    public String toString() {
        return "IsValidPaymentIdArgs{" +
                 "paymentId='" + paymentId + '\'' +

                '}';
    }
}