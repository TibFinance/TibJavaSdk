
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


public class MoveMerchantArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("MerchantdId")
    private String merchantdId;

    /**
 * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
 */
    @JsonProperty("ServiceId")
    private String serviceId;


    
    public MoveMerchantArgs() {
    }

    
    public MoveMerchantArgs(String merchantdId, String serviceId) {
        this.merchantdId = merchantdId;
this.serviceId = serviceId;

    }
    
    
    public MoveMerchantArgs(String adminSessionToken, String merchantdId, String serviceId) {
        super(adminSessionToken);
        this.merchantdId = merchantdId;
this.serviceId = serviceId;

    }

    
    public String getMerchantdId() {
        return merchantdId;
    }

    public void setMerchantdId(String merchantdId) {
        this.merchantdId = merchantdId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoveMerchantArgs that = (MoveMerchantArgs) o;
        return Objects.equals(merchantdId, that.merchantdId) && Objects.equals(serviceId, that.serviceId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantdId, serviceId);
    }

    @Override
    public String toString() {
        return "MoveMerchantArgs{" +
                 "merchantdId='" + merchantdId + '\'' +
 ", serviceId='" + serviceId + '\'' +

                '}';
    }
}