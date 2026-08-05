
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.ContactInfo;
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


public class SaveCustomerContactInfoArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Unique identifier of the customer owning the recurring transfers
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * The customer's contact information
     */
    @JsonProperty("ContactInfo")
    private ContactInfo contactInfo;


    
    public SaveCustomerContactInfoArgs() {
    }

    
    public SaveCustomerContactInfoArgs(String customerId, ContactInfo contactInfo) {
        this.customerId = customerId;
        this.contactInfo = contactInfo;
    }
    
    
    public SaveCustomerContactInfoArgs(String sessionToken, String customerId, ContactInfo contactInfo) {
        super(sessionToken);
        this.customerId = customerId;
        this.contactInfo = contactInfo;
    }

    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
        SaveCustomerContactInfoArgs that = (SaveCustomerContactInfoArgs) o;
        return Objects.equals(customerId, that.customerId) && Objects.equals(contactInfo, that.contactInfo) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerId, contactInfo);
    }

    @Override
    public String toString() {
        return "SaveCustomerContactInfoArgs{" +
                "customerId='" + customerId + '\'' +
                ", contactInfo='" + contactInfo + '\'' +

                '}';
    }
}