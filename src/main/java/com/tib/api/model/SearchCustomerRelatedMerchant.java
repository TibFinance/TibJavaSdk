
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SearchCustomerRelatedMerchant   {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Represents the merchant's unique name.
     */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
     * 
     */
    @JsonProperty("MerchantIsDeleted")
    private boolean merchantIsDeleted;


    
    public SearchCustomerRelatedMerchant() {
    }

    
    public SearchCustomerRelatedMerchant(String merchantId, String merchantName, boolean merchantIsDeleted) {
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.merchantIsDeleted = merchantIsDeleted;
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

    public boolean getMerchantIsDeleted() {
        return merchantIsDeleted;
    }

    public void setMerchantIsDeleted(boolean merchantIsDeleted) {
        this.merchantIsDeleted = merchantIsDeleted;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchCustomerRelatedMerchant that = (SearchCustomerRelatedMerchant) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(merchantName, that.merchantName) && Objects.equals(merchantIsDeleted, that.merchantIsDeleted) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, merchantName, merchantIsDeleted);
    }

    @Override
    public String toString() {
        return "SearchCustomerRelatedMerchant{" +
                "merchantId='" + merchantId + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", merchantIsDeleted='" + merchantIsDeleted + '\'' +

                '}';
    }
}