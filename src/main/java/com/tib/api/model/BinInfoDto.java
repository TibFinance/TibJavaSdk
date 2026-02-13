
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


public class BinInfoDto   {

    
    /**
 * 
 */
    @JsonProperty("Bin")
    private String bin;

    /**
 * 
 */
    @JsonProperty("Brand")
    private String brand;

    /**
 * 
 */
    @JsonProperty("CardType")
    private String cardType;

    /**
 * 
 */
    @JsonProperty("Category")
    private String category;

    /**
 * 
 */
    @JsonProperty("CountryCode")
    private String countryCode;

    /**
 * 
 */
    @JsonProperty("CountryName")
    private String countryName;

    /**
 * 
 */
    @JsonProperty("PricingGroup")
    private String pricingGroup;


    
    public BinInfoDto() {
    }

    
    public BinInfoDto(String bin, String brand, String cardType, String category, String countryCode, String countryName, String pricingGroup) {
        this.bin = bin;
this.brand = brand;
this.cardType = cardType;
this.category = category;
this.countryCode = countryCode;
this.countryName = countryName;
this.pricingGroup = pricingGroup;

    }
    
    

    
    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPricingGroup() {
        return pricingGroup;
    }

    public void setPricingGroup(String pricingGroup) {
        this.pricingGroup = pricingGroup;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinInfoDto that = (BinInfoDto) o;
        return Objects.equals(bin, that.bin) && Objects.equals(brand, that.brand) && Objects.equals(cardType, that.cardType) && Objects.equals(category, that.category) && Objects.equals(countryCode, that.countryCode) && Objects.equals(countryName, that.countryName) && Objects.equals(pricingGroup, that.pricingGroup) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(bin, brand, cardType, category, countryCode, countryName, pricingGroup);
    }

    @Override
    public String toString() {
        return "BinInfoDto{" +
                 "bin='" + bin + '\'' +
 ", brand='" + brand + '\'' +
 ", cardType='" + cardType + '\'' +
 ", category='" + category + '\'' +
 ", countryCode='" + countryCode + '\'' +
 ", countryName='" + countryName + '\'' +
 ", pricingGroup='" + pricingGroup + '\'' +

                '}';
    }
}