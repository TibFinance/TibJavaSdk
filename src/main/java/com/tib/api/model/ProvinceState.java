
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.CountryId;
import com.tib.api.model.enums.ProvinceStateId;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ProvinceState   {

    
    /**
     * Gets or sets the identifier of the country using the CountryIdEnum enumeration. This identifier is required when specifying the country for client, service, or merchant operations.
     */
    @JsonProperty("CountryId")
    private CountryId countryId;

    /**
     * Gets or sets the country abreviation.
     */
    @JsonProperty("CountryAbreviation")
    private String countryAbreviation;

    /**
     * Represents the unique identifier for a province or state within the system.
     */
    @JsonProperty("ProvinceStateId")
    private ProvinceStateId provinceStateId;

    /**
     * Gets or sets the province abreviation.
     */
    @JsonProperty("ProvinceAbreviation")
    private String provinceAbreviation;


    
    public ProvinceState() {
    }

    
    public ProvinceState(CountryId countryId, String countryAbreviation, ProvinceStateId provinceStateId, String provinceAbreviation) {
        this.countryId = countryId;
        this.countryAbreviation = countryAbreviation;
        this.provinceStateId = provinceStateId;
        this.provinceAbreviation = provinceAbreviation;
    }
    
    

    
    public CountryId getCountryId() {
        return countryId;
    }

    public void setCountryId(CountryId countryId) {
        this.countryId = countryId;
    }

    public String getCountryAbreviation() {
        return countryAbreviation;
    }

    public void setCountryAbreviation(String countryAbreviation) {
        this.countryAbreviation = countryAbreviation;
    }

    public ProvinceStateId getProvinceStateId() {
        return provinceStateId;
    }

    public void setProvinceStateId(ProvinceStateId provinceStateId) {
        this.provinceStateId = provinceStateId;
    }

    public String getProvinceAbreviation() {
        return provinceAbreviation;
    }

    public void setProvinceAbreviation(String provinceAbreviation) {
        this.provinceAbreviation = provinceAbreviation;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProvinceState that = (ProvinceState) o;
        return Objects.equals(countryId, that.countryId) && Objects.equals(countryAbreviation, that.countryAbreviation) && Objects.equals(provinceStateId, that.provinceStateId) && Objects.equals(provinceAbreviation, that.provinceAbreviation) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(countryId, countryAbreviation, provinceStateId, provinceAbreviation);
    }

    @Override
    public String toString() {
        return "ProvinceState{" +
                "countryId='" + countryId + '\'' +
                ", countryAbreviation='" + countryAbreviation + '\'' +
                ", provinceStateId='" + provinceStateId + '\'' +
                ", provinceAbreviation='" + provinceAbreviation + '\'' +

                '}';
    }
}