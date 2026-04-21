
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ContactInfo   {

    
    /**
     * The merchant's primary contact email address.
     */
    @JsonProperty("Email")
    private String email;

    /**
     * Contact phone number.
     */
    @JsonProperty("Phone")
    private String phone;

    /**
     * The merchant's physical address.
     */
    @JsonProperty("Address")
    private String address;

    /**
     * City name.
     */
    @JsonProperty("City")
    private String city;

    /**
     * Province or state.
     */
    @JsonProperty("Province")
    private Integer province;

    /**
     * Country name.
     */
    @JsonProperty("Country")
    private Integer country;

    /**
     * Postal code of the cardholder's billing address
     */
    @JsonProperty("ZipCode")
    private String zipCode;

    /**
     * Specifies the language used for the payment request and related communications
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