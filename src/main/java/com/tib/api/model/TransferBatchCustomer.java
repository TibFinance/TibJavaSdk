
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Language;
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


public class TransferBatchCustomer   {

    
    /**
     * Optional: the CustomerId a previous call returned for this CustomerExternalId. When sent, it must match the customer of that CustomerExternalId in the merchant's service.
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * Required on every item: your identifier for the customer, unique across all the merchants of a service: the same identifier at two merchants of one service is one customer. 1 to 150 characters: letters, digits, '.', '_' and '-'. Case is ignored: "a" and "A" are one customer.
     */
    @JsonProperty("CustomerExternalId")
    private String customerExternalId;

    /**
     * Required on every item: the customer's name, up to 150 characters, none of them &lt; &gt; { } [ ] \ ` ~ ^ or a double quote. It cannot hold emoji, characters outside the Western European alphabets, or control characters such as a line break. A sent value replaces the stored one.
     */
    @JsonProperty("CustomerName")
    private String customerName;

    /**
     * Required on every item: the customer's language: 1 or fr for French, 2 or en for English. A missing or invalid value refuses the item (2154). A sent value replaces the stored one.
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * Required on every item: the customer's contact details. Email and Phone are required: a missing or malformed value refuses the item (2152, 2153). Email must be ASCII with no space, and is stored in lower case. Phone accepts the common North American formats, such as 514-555-0100, (514) 555-0100 or +1 514 555 0100, and is stored as +1 and 10 digits; a trailing extension is dropped. The area code cannot start with 0 or 1. A sent value replaces the stored one. The address fields are optional: an empty one keeps the stored value, and a malformed one is not saved and the item gets a warning (2142). Address and City cannot hold emoji, characters outside the Western European alphabets, or control characters such as a line break: such a value counts as malformed. Province and Country are numeric ids: a text such as QC refuses the whole call. ContactInfo.Language is ignored, so leave it out and use Language: a text such as fr in ContactInfo.Language refuses the whole call.
     */
    @JsonProperty("ContactInfo")
    private ContactInfo contactInfo;


    
    public TransferBatchCustomer() {
    }

    
    public TransferBatchCustomer(String customerId, String customerExternalId, String customerName, Language language, ContactInfo contactInfo) {
        this.customerId = customerId;
        this.customerExternalId = customerExternalId;
        this.customerName = customerName;
        this.language = language;
        this.contactInfo = contactInfo;
    }
    
    

    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerExternalId() {
        return customerExternalId;
    }

    public void setCustomerExternalId(String customerExternalId) {
        this.customerExternalId = customerExternalId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
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
        TransferBatchCustomer that = (TransferBatchCustomer) o;
        return Objects.equals(customerId, that.customerId) && Objects.equals(customerExternalId, that.customerExternalId) && Objects.equals(customerName, that.customerName) && Objects.equals(language, that.language) && Objects.equals(contactInfo, that.contactInfo) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerExternalId, customerName, language, contactInfo);
    }

    @Override
    public String toString() {
        return "TransferBatchCustomer{" +
                "customerId='" + customerId + '\'' +
                ", customerExternalId='" + customerExternalId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", language='" + language + '\'' +
                ", contactInfo='" + contactInfo + '\'' +

                '}';
    }
}