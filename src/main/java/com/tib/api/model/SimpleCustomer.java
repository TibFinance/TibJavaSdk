
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Language;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SimpleCustomer   {

    
    /**
 * This property represents the full name of the customer in the system.
 */
    @JsonProperty("CustomerName")
    private String customerName;

    /**
 * Serves as a unique identifier for customers within an external system, enabling efficient data mapping and integration across various platforms.
 */
    @JsonProperty("CustomerExternalId")
    private String customerExternalId;

    /**
 * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
 */
    @JsonProperty("Language")
    private Language language;

    /**
 * Retrieves or assigns a detailed description for a specific customer.
 */
    @JsonProperty("CustomerDescription")
    private String customerDescription;

    /**
 * Handles the acquisition and assignment of a customer's email address.
 */
    @JsonProperty("CustomerEmail")
    private String customerEmail;


    
    public SimpleCustomer() {
    }

    
    public SimpleCustomer(String customerName, String customerExternalId, Language language, String customerDescription, String customerEmail) {
        this.customerName = customerName;
this.customerExternalId = customerExternalId;
this.language = language;
this.customerDescription = customerDescription;
this.customerEmail = customerEmail;

    }
    
    

    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerExternalId() {
        return customerExternalId;
    }

    public void setCustomerExternalId(String customerExternalId) {
        this.customerExternalId = customerExternalId;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getCustomerDescription() {
        return customerDescription;
    }

    public void setCustomerDescription(String customerDescription) {
        this.customerDescription = customerDescription;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleCustomer that = (SimpleCustomer) o;
        return Objects.equals(customerName, that.customerName) && Objects.equals(customerExternalId, that.customerExternalId) && Objects.equals(language, that.language) && Objects.equals(customerDescription, that.customerDescription) && Objects.equals(customerEmail, that.customerEmail) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerName, customerExternalId, language, customerDescription, customerEmail);
    }

    @Override
    public String toString() {
        return "SimpleCustomer{" +
                 "customerName='" + customerName + '\'' +
 ", customerExternalId='" + customerExternalId + '\'' +
 ", language='" + language + '\'' +
 ", customerDescription='" + customerDescription + '\'' +
 ", customerEmail='" + customerEmail + '\'' +

                '}';
    }
}