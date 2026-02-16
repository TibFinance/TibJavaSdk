
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


public class GetCustomersByExternalIdArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Retrieves or assigns the identifier used for external customer identification. This property is crucial for linking customer data with external systems.
     */
    @JsonProperty("ExternalCustomerId")
    private String externalCustomerId;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public GetCustomersByExternalIdArgs() {
    }

    
    public GetCustomersByExternalIdArgs(String externalCustomerId, String merchantId) {
        this.externalCustomerId = externalCustomerId;
        this.merchantId = merchantId;
    }
    
    
    public GetCustomersByExternalIdArgs(String sessionToken, String externalCustomerId, String merchantId) {
        super(sessionToken);
        this.externalCustomerId = externalCustomerId;
        this.merchantId = merchantId;
    }

    
    public String getExternalCustomerId() {
        return externalCustomerId;
    }

    public void setExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCustomersByExternalIdArgs that = (GetCustomersByExternalIdArgs) o;
        return Objects.equals(externalCustomerId, that.externalCustomerId) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(externalCustomerId, merchantId);
    }

    @Override
    public String toString() {
        return "GetCustomersByExternalIdArgs{" +
                "externalCustomerId='" + externalCustomerId + '\'' +
                ", merchantId='" + merchantId + '\'' +

                '}';
    }
}