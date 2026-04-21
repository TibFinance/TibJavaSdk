
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class MerchantIdName   {

    
    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * The name of the merchant associated with the transfer.
     */
    @JsonProperty("MerchantName")
    private String merchantName;


    
    public MerchantIdName() {
    }

    
    public MerchantIdName(String merchantId, String merchantName) {
        this.merchantId = merchantId;
        this.merchantName = merchantName;
    }
    
    

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MerchantIdName that = (MerchantIdName) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(merchantName, that.merchantName) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, merchantName);
    }

    @Override
    public String toString() {
        return "MerchantIdName{" +
                "merchantId='" + merchantId + '\'' +
                ", merchantName='" + merchantName + '\'' +

                '}';
    }
}