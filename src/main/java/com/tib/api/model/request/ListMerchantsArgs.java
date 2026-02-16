
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


public class ListMerchantsArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Gets or sets whether to include client merchants in the results. Default is false (excludes client merchants for backward compatibility).
     */
    @JsonProperty("IncludeClientMerchants")
    private boolean includeClientMerchants;


    
    public ListMerchantsArgs() {
    }

    
    public ListMerchantsArgs(String serviceId, String merchantId, boolean includeClientMerchants) {
        this.serviceId = serviceId;
        this.merchantId = merchantId;
        this.includeClientMerchants = includeClientMerchants;
    }
    
    
    public ListMerchantsArgs(String sessionToken, String serviceId, String merchantId, boolean includeClientMerchants) {
        super(sessionToken);
        this.serviceId = serviceId;
        this.merchantId = merchantId;
        this.includeClientMerchants = includeClientMerchants;
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public boolean getIncludeClientMerchants() {
        return includeClientMerchants;
    }

    public void setIncludeClientMerchants(boolean includeClientMerchants) {
        this.includeClientMerchants = includeClientMerchants;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListMerchantsArgs that = (ListMerchantsArgs) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(includeClientMerchants, that.includeClientMerchants) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, merchantId, includeClientMerchants);
    }

    @Override
    public String toString() {
        return "ListMerchantsArgs{" +
                "serviceId='" + serviceId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", includeClientMerchants='" + includeClientMerchants + '\'' +

                '}';
    }
}