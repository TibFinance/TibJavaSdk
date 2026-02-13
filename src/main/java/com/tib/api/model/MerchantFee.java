
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.TransactionFeesAgregated;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class MerchantFee   {

    
    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * Gets or sets the merchant fees.
 */
    @JsonProperty("MerchantFees")
    private TransactionFeesAgregated merchantFees;


    
    public MerchantFee() {
    }

    
    public MerchantFee(String merchantId, TransactionFeesAgregated merchantFees) {
        this.merchantId = merchantId;
this.merchantFees = merchantFees;

    }
    
    

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public TransactionFeesAgregated getMerchantFees() {
        return merchantFees;
    }

    public void setMerchantFees(TransactionFeesAgregated merchantFees) {
        this.merchantFees = merchantFees;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MerchantFee that = (MerchantFee) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(merchantFees, that.merchantFees) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, merchantFees);
    }

    @Override
    public String toString() {
        return "MerchantFee{" +
                 "merchantId='" + merchantId + '\'' +
 ", merchantFees='" + merchantFees + '\'' +

                '}';
    }
}