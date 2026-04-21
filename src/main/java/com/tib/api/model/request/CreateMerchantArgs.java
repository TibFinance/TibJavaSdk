
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Merchant;
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


public class CreateMerchantArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Identifier of the service for which recurring transfers are requested
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * Basic merchant details required for creating or updating a merchant record
     */
    @JsonProperty("MerchantInfo")
    private Merchant merchantInfo;


    
    public CreateMerchantArgs() {
    }

    
    public CreateMerchantArgs(String serviceId, Merchant merchantInfo) {
        this.serviceId = serviceId;
        this.merchantInfo = merchantInfo;
    }
    
    
    public CreateMerchantArgs(String sessionToken, String serviceId, Merchant merchantInfo) {
        super(sessionToken);
        this.serviceId = serviceId;
        this.merchantInfo = merchantInfo;
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Merchant getMerchantInfo() {
        return merchantInfo;
    }

    public void setMerchantInfo(Merchant merchantInfo) {
        this.merchantInfo = merchantInfo;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateMerchantArgs that = (CreateMerchantArgs) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(merchantInfo, that.merchantInfo) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, merchantInfo);
    }

    @Override
    public String toString() {
        return "CreateMerchantArgs{" +
                "serviceId='" + serviceId + '\'' +
                ", merchantInfo='" + merchantInfo + '\'' +

                '}';
    }
}