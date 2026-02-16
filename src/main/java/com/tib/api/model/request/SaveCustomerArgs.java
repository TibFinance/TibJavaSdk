
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Customer;
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


public class SaveCustomerArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Provides access to detailed customer information necessary for transaction processing and account management.
     */
    @JsonProperty("Customer")
    private Customer customer;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public SaveCustomerArgs() {
    }

    
    public SaveCustomerArgs(Customer customer, String merchantId) {
        this.customer = customer;
        this.merchantId = merchantId;
    }
    
    
    public SaveCustomerArgs(String sessionToken, Customer customer, String merchantId) {
        super(sessionToken);
        this.customer = customer;
        this.merchantId = merchantId;
    }

    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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
        SaveCustomerArgs that = (SaveCustomerArgs) o;
        return Objects.equals(customer, that.customer) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customer, merchantId);
    }

    @Override
    public String toString() {
        return "SaveCustomerArgs{" +
                "customer='" + customer + '\'' +
                ", merchantId='" + merchantId + '\'' +

                '}';
    }
}