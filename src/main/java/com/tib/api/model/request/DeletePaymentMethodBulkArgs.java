
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


public class DeletePaymentMethodBulkArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("PaymentMethodIds")
    private List<String> paymentMethodIds;


    
    public DeletePaymentMethodBulkArgs() {
    }

    
    public DeletePaymentMethodBulkArgs(List<String> paymentMethodIds) {
        this.paymentMethodIds = paymentMethodIds;

    }
    
    
    public DeletePaymentMethodBulkArgs(String adminSessionToken, List<String> paymentMethodIds) {
        super(adminSessionToken);
        this.paymentMethodIds = paymentMethodIds;

    }

    
    public List<String> getPaymentMethodIds() {
        return paymentMethodIds;
    }

    public void setPaymentMethodIds(List<String> paymentMethodIds) {
        this.paymentMethodIds = paymentMethodIds;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeletePaymentMethodBulkArgs that = (DeletePaymentMethodBulkArgs) o;
        return Objects.equals(paymentMethodIds, that.paymentMethodIds) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentMethodIds);
    }

    @Override
    public String toString() {
        return "DeletePaymentMethodBulkArgs{" +
                 "paymentMethodIds='" + paymentMethodIds + '\'' +

                '}';
    }
}