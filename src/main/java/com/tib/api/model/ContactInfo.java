
package com.tib.api.model;

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


public class ContactInfo   {

    
    /**
 * Specifies the email address associated with the merchant.
 */
    @JsonProperty("Email")
    private String email;

    /**
 * 
 */
    @JsonProperty("Phone")
    private String phone;

    /**
 * Gets or sets the address associated with the entity.
 */
    @JsonProperty("Address")
    private String address;

    /**
 * 
 */
    @JsonProperty("City")
    private String city;

    /**
 * 
 */
    @JsonProperty("Province")
    private Integer province;

    /**
 * 
 */
    @JsonProperty("Country")
    private Integer country;

    /**
 * 
 */
    @JsonProperty("ZipCode")
    private String zipCode;

    /**
 * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
 */
    @JsonProperty("Language")
    private Integer language;


    
    public ContactInfo() {
    }

    
    public ContactInfo(String email, String phone, String address, String city, Integer province, Integer country, String zipCode, Integer language) {
        this.email = email;
this.phone = phone;
this.address = address;
this.city = city;
this.province = province;
this.country = country;
this.zipCode = zipCode;
this.language = language;

    }
    
    

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactInfo that = (ContactInfo) o;
        return Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && Objects.equals(address, that.address) && Objects.equals(city, that.city) && Objects.equals(province, that.province) && Objects.equals(country, that.country) && Objects.equals(zipCode, that.zipCode) && Objects.equals(language, that.language) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(email, phone, address, city, province, country, zipCode, language);
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                 "email='" + email + '\'' +
 ", phone='" + phone + '\'' +
 ", address='" + address + '\'' +
 ", city='" + city + '\'' +
 ", province='" + province + '\'' +
 ", country='" + country + '\'' +
 ", zipCode='" + zipCode + '\'' +
 ", language='" + language + '\'' +

                '}';
    }
}