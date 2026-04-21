
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Language;
import com.tib.api.model.PaymentMethod;
import com.tib.api.model.ContactInfo;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CustomerEntity   {

    
    /**
     * The full name of the customer who owns the recurring transfer.
     */
    @JsonProperty("CustomerName")
    private String customerName;

    /**
     * The external identifier assigned to the customer by the client’s system.
     */
    @JsonProperty("CustomerExternalId")
    private String customerExternalId;

    /**
     * Specifies the language used for the payment request and related communications
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * A textual description of the customer identified by the external ID
     */
    @JsonProperty("CustomerDescription")
    private String customerDescription;

    /**
     * The email address of the customer initiating the payment.
     */
    @JsonProperty("CustomerEmail")
    private String customerEmail;

    /**
     * A collection of payment methods available to the requester.
     */
    @JsonProperty("PaymentMethods")
    private List<PaymentMethod> paymentMethods;

    /**
     * The customer's contact information
     */
    @JsonProperty("ContactInfo")
    private ContactInfo contactInfo;


    
    public CustomerEntity() {
    }

    
    public CustomerEntity(String customerName, String customerExternalId, Language language, String customerDescription, String customerEmail, List<PaymentMethod> paymentMethods, ContactInfo contactInfo) {
        this.customerName = customerName;
        this.customerExternalId = customerExternalId;
        this.language = language;
        this.customerDescription = customerDescription;
        this.customerEmail = customerEmail;
        this.paymentMethods = paymentMethods;
        this.contactInfo = contactInfo;
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

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity that = (CustomerEntity) o;
        return Objects.equals(customerName, that.customerName) && Objects.equals(customerExternalId, that.customerExternalId) && Objects.equals(language, that.language) && Objects.equals(customerDescription, that.customerDescription) && Objects.equals(customerEmail, that.customerEmail) && Objects.equals(paymentMethods, that.paymentMethods) && Objects.equals(contactInfo, that.contactInfo) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerName, customerExternalId, language, customerDescription, customerEmail, paymentMethods, contactInfo);
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "customerName='" + customerName + '\'' +
                ", customerExternalId='" + customerExternalId + '\'' +
                ", language='" + language + '\'' +
                ", customerDescription='" + customerDescription + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", paymentMethods='" + paymentMethods + '\'' +
                ", contactInfo='" + contactInfo + '\'' +

                '}';
    }
}