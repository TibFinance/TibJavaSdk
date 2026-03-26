
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


public class SupplierView   {

    
    /**
     * 
     */
    @JsonProperty("MerchantSupplierId")
    private String merchantSupplierId;

    /**
     * 
     */
    @JsonProperty("SupplierId")
    private String supplierId;

    /**
     * 
     */
    @JsonProperty("SupplierName")
    private String supplierName;

    /**
     * 
     */
    @JsonProperty("SupplierEmail")
    private String supplierEmail;

    /**
     * 
     */
    @JsonProperty("Created")
    private LocalDateTime created;


    
    public SupplierView() {
    }

    
    public SupplierView(String merchantSupplierId, String supplierId, String supplierName, String supplierEmail, LocalDateTime created) {
        this.merchantSupplierId = merchantSupplierId;
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.created = created;
    }
    
    

    
    public String getMerchantSupplierId() {
        return merchantSupplierId;
    }

    public void setMerchantSupplierId(String merchantSupplierId) {
        this.merchantSupplierId = merchantSupplierId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupplierView that = (SupplierView) o;
        return Objects.equals(merchantSupplierId, that.merchantSupplierId) && Objects.equals(supplierId, that.supplierId) && Objects.equals(supplierName, that.supplierName) && Objects.equals(supplierEmail, that.supplierEmail) && Objects.equals(created, that.created) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantSupplierId, supplierId, supplierName, supplierEmail, created);
    }

    @Override
    public String toString() {
        return "SupplierView{" +
                "merchantSupplierId='" + merchantSupplierId + '\'' +
                ", supplierId='" + supplierId + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", supplierEmail='" + supplierEmail + '\'' +
                ", created='" + created + '\'' +

                '}';
    }
}