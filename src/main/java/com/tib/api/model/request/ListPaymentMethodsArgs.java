
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


public class ListPaymentMethodsArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Serves as a unique identifier for each customer within the system.
 */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public ListPaymentMethodsArgs() {
    }

    
    public ListPaymentMethodsArgs(String customerId, String merchantId) {
        this.customerId = customerId;
this.merchantId = merchantId;

    }
    
    
    public ListPaymentMethodsArgs(String sessionToken, String customerId, String merchantId) {
        super(sessionToken);
        this.customerId = customerId;
this.merchantId = merchantId;

    }

    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
        ListPaymentMethodsArgs that = (ListPaymentMethodsArgs) o;
        return Objects.equals(customerId, that.customerId) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerId, merchantId);
    }

    @Override
    public String toString() {
        return "ListPaymentMethodsArgs{" +
                 "customerId='" + customerId + '\'' +
 ", merchantId='" + merchantId + '\'' +

                '}';
    }
}