
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


public class GetCustomersByExternalIdArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The external identifier of the customer to retrieve.
     */
    @JsonProperty("ExternalCustomerId")
    private String externalCustomerId;

    /**
     * The unique identifier of the merchant initiating the payment request.
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