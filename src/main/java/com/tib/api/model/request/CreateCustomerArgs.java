
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.CustomerEntity;
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


public class CreateCustomerArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Identifier of the service for which recurring transfers are requested
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * The customer data to be saved
     */
    @JsonProperty("Customer")
    private CustomerEntity customer;


    
    public CreateCustomerArgs() {
    }

    
    public CreateCustomerArgs(String serviceId, CustomerEntity customer) {
        this.serviceId = serviceId;
        this.customer = customer;
    }
    
    
    public CreateCustomerArgs(String sessionToken, String serviceId, CustomerEntity customer) {
        super(sessionToken);
        this.serviceId = serviceId;
        this.customer = customer;
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateCustomerArgs that = (CreateCustomerArgs) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(customer, that.customer) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, customer);
    }

    @Override
    public String toString() {
        return "CreateCustomerArgs{" +
                "serviceId='" + serviceId + '\'' +
                ", customer='" + customer + '\'' +

                '}';
    }
}