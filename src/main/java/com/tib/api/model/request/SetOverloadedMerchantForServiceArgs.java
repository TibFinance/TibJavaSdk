
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


public class SetOverloadedMerchantForServiceArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * 
     */
    @JsonProperty("FeesOverLoadMerchantId")
    private String feesOverLoadMerchantId;


    
    public SetOverloadedMerchantForServiceArgs() {
    }

    
    public SetOverloadedMerchantForServiceArgs(String serviceId, String feesOverLoadMerchantId) {
        this.serviceId = serviceId;
        this.feesOverLoadMerchantId = feesOverLoadMerchantId;
    }
    
    
    public SetOverloadedMerchantForServiceArgs(String adminSessionToken, String serviceId, String feesOverLoadMerchantId) {
        super(adminSessionToken);
        this.serviceId = serviceId;
        this.feesOverLoadMerchantId = feesOverLoadMerchantId;
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getFeesOverLoadMerchantId() {
        return feesOverLoadMerchantId;
    }

    public void setFeesOverLoadMerchantId(String feesOverLoadMerchantId) {
        this.feesOverLoadMerchantId = feesOverLoadMerchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetOverloadedMerchantForServiceArgs that = (SetOverloadedMerchantForServiceArgs) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(feesOverLoadMerchantId, that.feesOverLoadMerchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, feesOverLoadMerchantId);
    }

    @Override
    public String toString() {
        return "SetOverloadedMerchantForServiceArgs{" +
                "serviceId='" + serviceId + '\'' +
                ", feesOverLoadMerchantId='" + feesOverLoadMerchantId + '\'' +

                '}';
    }
}