
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


public class MerchantEntity   {

    
    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
 */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
 * Represents the merchant's unique name.
 */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
 * 
 */
    @JsonProperty("MerchantEmail")
    private String merchantEmail;

    /**
 * 
 */
    @JsonProperty("IsClientMerchant")
    private boolean isClientMerchant;

    /**
 * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
 */
    @JsonProperty("Language")
    private Integer language;


    
    public MerchantEntity() {
    }

    
    public MerchantEntity(String merchantId, String serviceId, String merchantName, String merchantEmail, boolean isClientMerchant, Integer language) {
        this.merchantId = merchantId;
this.serviceId = serviceId;
this.merchantName = merchantName;
this.merchantEmail = merchantEmail;
this.isClientMerchant = isClientMerchant;
this.language = language;

    }
    
    

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail;
    }

    public boolean getIsClientMerchant() {
        return isClientMerchant;
    }

    public void setIsClientMerchant(boolean isClientMerchant) {
        this.isClientMerchant = isClientMerchant;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MerchantEntity that = (MerchantEntity) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(serviceId, that.serviceId) && Objects.equals(merchantName, that.merchantName) && Objects.equals(merchantEmail, that.merchantEmail) && Objects.equals(isClientMerchant, that.isClientMerchant) && Objects.equals(language, that.language) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, serviceId, merchantName, merchantEmail, isClientMerchant, language);
    }

    @Override
    public String toString() {
        return "MerchantEntity{" +
                 "merchantId='" + merchantId + '\'' +
 ", serviceId='" + serviceId + '\'' +
 ", merchantName='" + merchantName + '\'' +
 ", merchantEmail='" + merchantEmail + '\'' +
 ", isClientMerchant='" + isClientMerchant + '\'' +
 ", language='" + language + '\'' +

                '}';
    }
}