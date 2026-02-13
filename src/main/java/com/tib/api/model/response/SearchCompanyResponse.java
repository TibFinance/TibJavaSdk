
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


public class SearchCompanyResponse extends CustomAPIResponse {

    
    @JsonProperty("NeqOrNi")
    private String neqOrNi;

    @JsonProperty("CompanyName")
    private String companyName;

    @JsonProperty("AddressDisplay")
    private String addressDisplay;

    @JsonProperty("CreationDate")
    private String creationDate;

    @JsonProperty("IsQuebec")
    private boolean isQuebec;

    @JsonProperty("HasDetails")
    private boolean hasDetails;


    public SearchCompanyResponse(Error[] errors, boolean hasError, String messages, String neqOrNi, String companyName, String addressDisplay, String creationDate, boolean isQuebec, boolean hasDetails) {
        super(errors, hasError, messages);
        this.neqOrNi = neqOrNi;
this.companyName = companyName;
this.addressDisplay = addressDisplay;
this.creationDate = creationDate;
this.isQuebec = isQuebec;
this.hasDetails = hasDetails;

    }

    public SearchCompanyResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.neqOrNi = apiResponse.getResponse().toString();
this.companyName = apiResponse.getResponse().toString();
this.addressDisplay = apiResponse.getResponse().toString();
this.creationDate = apiResponse.getResponse().toString();
this.isQuebec = Boolean.parseBoolean(apiResponse.getResponse().toString());
this.hasDetails = Boolean.parseBoolean(apiResponse.getResponse().toString());

        }
    }

    
    public String getNeqOrNi() {
        return neqOrNi;
    }

    public void setNeqOrNi(String neqOrNi) {
        this.neqOrNi = neqOrNi;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddressDisplay() {
        return addressDisplay;
    }

    public void setAddressDisplay(String addressDisplay) {
        this.addressDisplay = addressDisplay;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public boolean getIsQuebec() {
        return isQuebec;
    }

    public void setIsQuebec(boolean isQuebec) {
        this.isQuebec = isQuebec;
    }

    public boolean getHasDetails() {
        return hasDetails;
    }

    public void setHasDetails(boolean hasDetails) {
        this.hasDetails = hasDetails;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchCompanyResponse that = (SearchCompanyResponse) o;
        return Objects.equals(neqOrNi, that.neqOrNi) && Objects.equals(companyName, that.companyName) && Objects.equals(addressDisplay, that.addressDisplay) && Objects.equals(creationDate, that.creationDate) && Objects.equals(isQuebec, that.isQuebec) && Objects.equals(hasDetails, that.hasDetails) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(neqOrNi, companyName, addressDisplay, creationDate, isQuebec, hasDetails);
    }

    @Override
    public String toString() {
        return "SearchCompanyResponse{" +
                 "neqOrNi='" + neqOrNi + '\'' +
 ", companyName='" + companyName + '\'' +
 ", addressDisplay='" + addressDisplay + '\'' +
 ", creationDate='" + creationDate + '\'' +
 ", isQuebec='" + isQuebec + '\'' +
 ", hasDetails='" + hasDetails + '\'' +

                '}';
    }
}