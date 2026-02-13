
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.ProvinceStateId;
import com.tib.api.model.enums.CountryId;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class Address   {

    
    /**
 * Represents the street address associated with a specific entity or location.
 */
    @JsonProperty("StreetAddress")
    private String streetAddress;

    /**
 * Retrieves or assigns the city component of an address.
 */
    @JsonProperty("AddressCity")
    private String addressCity;

    /**
 * Represents the unique identifier for a province or state within the system.
 */
    @JsonProperty("ProvinceStateId")
    private ProvinceStateId provinceStateId;

    /**
 * Gets or sets the identifier of the country using the CountryIdEnum enumeration. This identifier is required when specifying the country for client, service, or merchant operations.
 */
    @JsonProperty("CountryId")
    private CountryId countryId;

    /**
 * Gets or sets the postal zip code for the address entity.
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