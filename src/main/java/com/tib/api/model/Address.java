
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.ProvinceStateId;
import com.tib.api.model.enums.CountryId;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class Address   {

    
    /**
     * The billing street address of the cardholder for the credit card payment method.
     */
    @JsonProperty("StreetAddress")
    private String streetAddress;

    /**
     * The city component of the billing address for the credit card.
     */
    @JsonProperty("AddressCity")
    private String addressCity;

    /**
     * Identifier of the province or state for the billing address.
     */
    @JsonProperty("ProvinceStateId")
    private ProvinceStateId provinceStateId;

    /**
     * Identifier of the card‑issuing country for the payment method
     */
    @JsonProperty("CountryId")
    private CountryId countryId;

    /**
     * The postal ZIP code of the cardholder’s billing address.
     */
    @JsonProperty("PostalZipCode")
    private String postalZipCode;


    
    public Address() {
    }

    
    public Address(String streetAddress, String addressCity, ProvinceStateId provinceStateId, CountryId countryId, String postalZipCode) {
        this.streetAddress = streetAddress;
        this.addressCity = addressCity;
        this.provinceStateId = provinceStateId;
        this.countryId = countryId;
        this.postalZipCode = postalZipCode;
    }
    
    

    
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public ProvinceStateId getProvinceStateId() {
        return provinceStateId;
    }

    public void setProvinceStateId(ProvinceStateId provinceStateId) {
        this.provinceStateId = provinceStateId;
    }

    public CountryId getCountryId() {
        return countryId;
    }

    public void setCountryId(CountryId countryId) {
        this.countryId = countryId;
    }

    public String getPostalZipCode() {
        return postalZipCode;
    }

    public void setPostalZipCode(String postalZipCode) {
        this.postalZipCode = postalZipCode;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address that = (Address) o;
        return Objects.equals(streetAddress, that.streetAddress) && Objects.equals(addressCity, that.addressCity) && Objects.equals(provinceStateId, that.provinceStateId) && Objects.equals(countryId, that.countryId) && Objects.equals(postalZipCode, that.postalZipCode) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(streetAddress, addressCity, provinceStateId, countryId, postalZipCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", provinceStateId='" + provinceStateId + '\'' +
                ", countryId='" + countryId + '\'' +
                ", postalZipCode='" + postalZipCode + '\'' +

                '}';
    }
}