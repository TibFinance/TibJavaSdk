
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


public class CreateMerchantLoginArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Specifies the email address associated with the merchant.
     */
    @JsonProperty("Email")
    private String email;

    /**
     * Gets or sets the first name.
     */
    @JsonProperty("FirstName")
    private String firstName;

    /**
     * Gets or sets the last name.
     */
    @JsonProperty("LastName")
    private String lastName;


    
    public CreateMerchantLoginArgs() {
    }

    
    public CreateMerchantLoginArgs(String merchantId, String email, String firstName, String lastName) {
        this.merchantId = merchantId;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    
    public CreateMerchantLoginArgs(String sessionToken, String merchantId, String email, String firstName, String lastName) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateMerchantLoginArgs that = (CreateMerchantLoginArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(email, that.email) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, email, firstName, lastName);
    }

    @Override
    public String toString() {
        return "CreateMerchantLoginArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +

                '}';
    }
}