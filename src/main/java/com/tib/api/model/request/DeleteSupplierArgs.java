
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


public class DeleteSupplierArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * 
     */
    @JsonProperty("MerchantSupplierId")
    private String merchantSupplierId;


    
    public DeleteSupplierArgs() {
    }

    
    public DeleteSupplierArgs(String merchantId, String merchantSupplierId) {
        this.merchantId = merchantId;
        this.merchantSupplierId = merchantSupplierId;
    }
    
    
    public DeleteSupplierArgs(String sessionToken, String merchantId, String merchantSupplierId) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.merchantSupplierId = merchantSupplierId;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantSupplierId() {
        return merchantSupplierId;
    }

    public void setMerchantSupplierId(String merchantSupplierId) {
        this.merchantSupplierId = merchantSupplierId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteSupplierArgs that = (DeleteSupplierArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(merchantSupplierId, that.merchantSupplierId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, merchantSupplierId);
    }

    @Override
    public String toString() {
        return "DeleteSupplierArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", merchantSupplierId='" + merchantSupplierId + '\'' +

                '}';
    }
}