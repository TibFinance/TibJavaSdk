
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


public class MonerisCredenitals   {

    
    /**
 * Gets or sets the store identifier.
 */
    @JsonProperty("StoreID")
    private String storeID;

    /**
 * Gets or sets the API token.
 */
    @JsonProperty("ApiToken")
    private String apiToken;

    /**
 * Gets or sets the country code.
 */
    @JsonProperty("CountryCode")
    private String countryCode;

    /**
 * Gets or sets the crypt.
 */
    @JsonProperty("Crypt")
    private String crypt;

    /**
 * Gets or sets the CVD idicator.
 */
    @JsonProperty("CvdIdicator")
    private String cvdIdicator;


    
    public MonerisCredenitals() {
    }

    
    public MonerisCredenitals(String storeID, String apiToken, String countryCode, String crypt, String cvdIdicator) {
        this.storeID = storeID;
this.apiToken = apiToken;
this.countryCode = countryCode;
this.crypt = crypt;
this.cvdIdicator = cvdIdicator;

    }
    
    

    
    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCrypt() {
        return crypt;
    }

    public void setCrypt(String crypt) {
        this.crypt = crypt;
    }

    public String getCvdIdicator() {
        return cvdIdicator;
    }

    public void setCvdIdicator(String cvdIdicator) {
        this.cvdIdicator = cvdIdicator;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonerisCredenitals that = (MonerisCredenitals) o;
        return Objects.equals(storeID, that.storeID) && Objects.equals(apiToken, that.apiToken) && Objects.equals(countryCode, that.countryCode) && Objects.equals(crypt, that.crypt) && Objects.equals(cvdIdicator, that.cvdIdicator) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(storeID, apiToken, countryCode, crypt, cvdIdicator);
    }

    @Override
    public String toString() {
        return "MonerisCredenitals{" +
                 "storeID='" + storeID + '\'' +
 ", apiToken='" + apiToken + '\'' +
 ", countryCode='" + countryCode + '\'' +
 ", crypt='" + crypt + '\'' +
 ", cvdIdicator='" + cvdIdicator + '\'' +

                '}';
    }
}