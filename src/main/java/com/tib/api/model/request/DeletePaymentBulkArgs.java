
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


public class DeletePaymentBulkArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("PaymentIds")
    private List<String> paymentIds;


    
    public DeletePaymentBulkArgs() {
    }

    
    public DeletePaymentBulkArgs(List<String> paymentIds) {
        this.paymentIds = paymentIds;
    }
    
    
    public DeletePaymentBulkArgs(String adminSessionToken, List<String> paymentIds) {
        super(adminSessionToken);
        this.paymentIds = paymentIds;
    }

    
    public List<String> getPaymentIds() {
        return paymentIds;
    }

    public void setPaymentIds(List<String> paymentIds) {
        this.paymentIds = paymentIds;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeletePaymentBulkArgs that = (DeletePaymentBulkArgs) o;
        return Objects.equals(paymentIds, that.paymentIds) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentIds);
    }

    @Override
    public String toString() {
        return "DeletePaymentBulkArgs{" +
                "paymentIds='" + paymentIds + '\'' +

                '}';
    }
}