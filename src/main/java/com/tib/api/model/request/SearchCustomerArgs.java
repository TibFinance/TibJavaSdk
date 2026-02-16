
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


public class SearchCustomerArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * This property represents the full name of the customer in the system.
     */
    @JsonProperty("CustomerName")
    private String customerName;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public SearchCustomerArgs() {
    }

    
    public SearchCustomerArgs(String customerName, String merchantId) {
        this.customerName = customerName;
        this.merchantId = merchantId;
    }
    
    
    public SearchCustomerArgs(String sessionToken, String customerName, String merchantId) {
        super(sessionToken);
        this.customerName = customerName;
        this.merchantId = merchantId;
    }

    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
        SearchCustomerArgs that = (SearchCustomerArgs) o;
        return Objects.equals(customerName, that.customerName) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerName, merchantId);
    }

    @Override
    public String toString() {
        return "SearchCustomerArgs{" +
                "customerName='" + customerName + '\'' +
                ", merchantId='" + merchantId + '\'' +

                '}';
    }
}