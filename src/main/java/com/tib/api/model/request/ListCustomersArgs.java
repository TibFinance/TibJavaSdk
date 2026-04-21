
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ListCustomersArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Identifier of the service for which recurring transfers are requested
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public ListCustomersArgs() {
    }

    
    public ListCustomersArgs(String serviceId, String merchantId) {
        this.serviceId = serviceId;
        this.merchantId = merchantId;
    }
    
    
    public ListCustomersArgs(String sessionToken, String serviceId, String merchantId) {
        super(sessionToken);
        this.serviceId = serviceId;
        this.merchantId = merchantId;
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
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
        ListCustomersArgs that = (ListCustomersArgs) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, merchantId);
    }

    @Override
    public String toString() {
        return "ListCustomersArgs{" +
                "serviceId='" + serviceId + '\'' +
                ", merchantId='" + merchantId + '\'' +

                '}';
    }
}