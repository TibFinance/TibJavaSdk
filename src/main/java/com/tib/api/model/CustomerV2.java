
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


public class CustomerV2   {

    
    /**
     * Required: the customer's name, up to 150 characters, none of them &lt; &gt; { } [ ] \ ` ~ ^ or a double quote. It cannot hold emoji, characters outside the Western European alphabets, or control characters such as a line break.
     */
    @JsonProperty("CustomerName")
    private String customerName;

    /**
     * Optional: your identifier for the customer. Use one identifier per customer across all the merchants of a service: a later CreateTransferBatch item with this identifier, from any merchant of the service, uses this customer. Up to 150 characters: unaccented letters, digits, '.', '_' and '-'. Case is ignored: "a" and "A" are one identifier. A repeated CustomerExternalId is allowed: the call still creates a new customer, and CreateTransferBatch keeps using the first one that CreateCustomerV2 or CreateTransferBatch created with this identifier (a customer made with CreateCustomer does not count). GetCustomersByExternalId returns both. When that first one was deleted before the call, and was not blocked, the new customer takes its place.
     */
    @JsonProperty("CustomerExternalId")
    private String customerExternalId;

    /**
     * Required: the customer's language: 1 or fr for French, 2 or en for English.
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * Optional: a note about the customer, up to 150 characters, none of them &lt; &gt; { } [ ] \ ` ~ ^ or a double quote. It cannot hold emoji, characters outside the Western European alphabets, or control characters such as a line break.
     */
    @JsonProperty("CustomerDescription")
    private String customerDescription;

    /**
     * Required: the customer's contact details. Email and Phone are required: a missing or malformed value refuses the call (2003). Email must be ASCII with no space, up to 250 characters, and is stored in lower case. Phone accepts the common North American formats, such as 514-555-0100, (514) 555-0100 or +1 514 555 0100, and is stored as +1 and 10 digits; a trailing extension is dropped. The area code cannot start with 0 or 1. The address fields are optional: a value longer than its limit, an unknown Province or Country id, or a ZipCode that is not a Canadian or US postal code refuses the call (2003). Address and City cannot hold emoji, characters outside the Western European alphabets, or control characters such as a line break. Province and Country are numeric ids: a text such as QC refuses the call. Leave ContactInfo.Language out: it is not read, and a text such as fr in it refuses the call.
     */
    @JsonProperty("ContactInfo")
    private ContactInfo contactInfo;


    
    public CustomerV2() {
    }

    
    public CustomerV2(String customerName, String customerExternalId, Language language, String customerDescription, ContactInfo contactInfo) {
        this.customerName = customerName;
        this.customerExternalId = customerExternalId;
        this.language = language;
        this.customerDescription = customerDescription;
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
        CustomerV2 that = (CustomerV2) o;
        return Objects.equals(customerName, that.customerName) && Objects.equals(customerExternalId, that.customerExternalId) && Objects.equals(language, that.language) && Objects.equals(customerDescription, that.customerDescription) && Objects.equals(contactInfo, that.contactInfo) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerName, customerExternalId, language, customerDescription, contactInfo);
    }

    @Override
    public String toString() {
        return "CustomerV2{" +
                "customerName='" + customerName + '\'' +
                ", customerExternalId='" + customerExternalId + '\'' +
                ", language='" + language + '\'' +
                ", customerDescription='" + customerDescription + '\'' +
                ", contactInfo='" + contactInfo + '\'' +

                '}';
    }
}