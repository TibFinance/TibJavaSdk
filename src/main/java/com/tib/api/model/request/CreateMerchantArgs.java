
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Merchant;
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


public class CreateMerchantArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * This property holds the basic information necessary for creating or updating a merchant's account within the TIB Finance API system.
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