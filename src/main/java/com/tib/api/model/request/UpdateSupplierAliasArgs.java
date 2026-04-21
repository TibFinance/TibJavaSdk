
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


public class UpdateSupplierAliasArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * The unique identifier of the supplier link to rename.
     */
    @JsonProperty("MerchantSupplierId")
    private String merchantSupplierId;

    /**
     * The new display name for the supplier (max 150 characters).
     */
    @JsonProperty("SupplierName")
    private String supplierName;


    
    public UpdateSupplierAliasArgs() {
    }

    
    public UpdateSupplierAliasArgs(String merchantId, String merchantSupplierId, String supplierName) {
        this.merchantId = merchantId;
        this.merchantSupplierId = merchantSupplierId;
        this.supplierName = supplierName;
    }
    
    
    public UpdateSupplierAliasArgs(String sessionToken, String merchantId, String merchantSupplierId, String supplierName) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.merchantSupplierId = merchantSupplierId;
        this.supplierName = supplierName;
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

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateSupplierAliasArgs that = (UpdateSupplierAliasArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(merchantSupplierId, that.merchantSupplierId) && Objects.equals(supplierName, that.supplierName) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, merchantSupplierId, supplierName);
    }

    @Override
    public String toString() {
        return "UpdateSupplierAliasArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", merchantSupplierId='" + merchantSupplierId + '\'' +
                ", supplierName='" + supplierName + '\'' +

                '}';
    }
}