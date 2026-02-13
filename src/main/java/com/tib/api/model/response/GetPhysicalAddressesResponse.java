
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetPhysicalAddressesResponse extends CustomAPIResponse {

    
    @JsonProperty("Countries")
    private Map<Integer, String> countries;

    @JsonProperty("Provinces")
    private Map<Integer, String> provinces;


    public GetPhysicalAddressesResponse(Error[] errors, boolean hasError, String messages, Map<Integer, String> countries, Map<Integer, String> provinces) {
        super(errors, hasError, messages);
        this.countries = countries;
this.provinces = provinces;

    }

    public GetPhysicalAddressesResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.countries = (Map<Integer, String>) apiResponse.getResponse();
this.provinces = (Map<Integer, String>) apiResponse.getResponse();

        }
    }

    
    public Map<Integer, String> getCountries() {
        return countries;
    }

    public void setCountries(Map<Integer, String> countries) {
        this.countries = countries;
    }

    public Map<Integer, String> getProvinces() {
        return provinces;
    }

    public void setProvinces(Map<Integer, String> provinces) {
        this.provinces = provinces;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetPhysicalAddressesResponse that = (GetPhysicalAddressesResponse) o;
        return Objects.equals(countries, that.countries) && Objects.equals(provinces, that.provinces) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(countries, provinces);
    }

    @Override
    public String toString() {
        return "GetPhysicalAddressesResponse{" +
                 "countries='" + countries + '\'' +
 ", provinces='" + provinces + '\'' +

                '}';
    }
}