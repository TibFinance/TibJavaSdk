
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Language;
import com.tib.api.model.PaymentMethod;
import com.tib.api.model.ContactInfo;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class Customer  extends CustomerEntity  {

    
    /**
     * Serves as a unique identifier for each customer within the system.
     */
    @JsonProperty("CustomerId")
    private String customerId;


    
    public Customer() {
    }

    
    public Customer(String customerId) {
        this.customerId = customerId;
    }
    
    
    public Customer(String customerName, String customerExternalId, Language language, String customerDescription, String customerEmail, List<PaymentMethod> paymentMethods, ContactInfo contactInfo, String customerId) {
        super(customerName, customerExternalId, language, customerDescription, customerEmail, paymentMethods, contactInfo);
        this.customerId = customerId;
    }

    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer that = (Customer) o;
        return Objects.equals(customerId, that.customerId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +

                '}';
    }
}