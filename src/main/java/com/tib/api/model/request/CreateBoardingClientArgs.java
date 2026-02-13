
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateBoardingClientArgs  implements IBaseCryptedServiceArgs  {

    
    /**
 * Retrieves or assigns the name of the sub-client.
 */
    @JsonProperty("Name")
    private String name;

    /**
 * Specifies the email address associated with the merchant.
 */
    @JsonProperty("Email")
    private String email;

    /**
 * The merchant's phone number used for contact and transaction notifications.
 */
    @JsonProperty("PhoneNumber")
    private String phoneNumber;

    /**
 * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
 */
    @JsonProperty("Language")
    private Integer language;

    /**
 * Retrieves or assigns the currency type used in transactions.
 */
    @JsonProperty("Currency")
    private Integer currency;


    
    public CreateBoardingClientArgs() {
    }

    
    public CreateBoardingClientArgs(String name, String email, String phoneNumber, Integer language, Integer currency) {
        this.name = name;
this.email = email;
this.phoneNumber = phoneNumber;
this.language = language;
this.currency = currency;

    }
    
    

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateBoardingClientArgs that = (CreateBoardingClientArgs) o;
        return Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(language, that.language) && Objects.equals(currency, that.currency) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(name, email, phoneNumber, language, currency);
    }

    @Override
    public String toString() {
        return "CreateBoardingClientArgs{" +
                 "name='" + name + '\'' +
 ", email='" + email + '\'' +
 ", phoneNumber='" + phoneNumber + '\'' +
 ", language='" + language + '\'' +
 ", currency='" + currency + '\'' +

                '}';
    }
}