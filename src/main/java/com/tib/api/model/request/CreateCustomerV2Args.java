
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.CustomerV2;
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


public class CreateCustomerV2Args  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The service to create the customer in.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * Required: the customer to create.
     */
    @JsonProperty("Customer")
    private CustomerV2 customer;


    
    public CreateCustomerV2Args() {
    }

    
    public CreateCustomerV2Args(String serviceId, CustomerV2 customer) {
        this.serviceId = serviceId;
        this.customer = customer;
    }
    
    
    public CreateCustomerV2Args(String sessionToken, String serviceId, CustomerV2 customer) {
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

    public CustomerV2 getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerV2 customer) {
        this.customer = customer;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateCustomerV2Args that = (CreateCustomerV2Args) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(customer, that.customer) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, customer);
    }

    @Override
    public String toString() {
        return "CreateCustomerV2Args{" +
                "serviceId='" + serviceId + '\'' +
                ", customer='" + customer + '\'' +

                '}';
    }
}