
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


public class SetOverloadedFeesMerchantArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * 
     */
    @JsonProperty("OverloadedMerchantId")
    private String overloadedMerchantId;


    
    public SetOverloadedFeesMerchantArgs() {
    }

    
    public SetOverloadedFeesMerchantArgs(String serviceId, String overloadedMerchantId) {
        this.serviceId = serviceId;
        this.overloadedMerchantId = overloadedMerchantId;
    }
    
    
    public SetOverloadedFeesMerchantArgs(String sessionToken, String serviceId, String overloadedMerchantId) {
        super(sessionToken);
        this.serviceId = serviceId;
        this.overloadedMerchantId = overloadedMerchantId;
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getOverloadedMerchantId() {
        return overloadedMerchantId;
    }

    public void setOverloadedMerchantId(String overloadedMerchantId) {
        this.overloadedMerchantId = overloadedMerchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetOverloadedFeesMerchantArgs that = (SetOverloadedFeesMerchantArgs) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(overloadedMerchantId, that.overloadedMerchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, overloadedMerchantId);
    }

    @Override
    public String toString() {
        return "SetOverloadedFeesMerchantArgs{" +
                "serviceId='" + serviceId + '\'' +
                ", overloadedMerchantId='" + overloadedMerchantId + '\'' +

                '}';
    }
}