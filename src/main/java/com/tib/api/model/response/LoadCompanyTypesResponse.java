
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


public class LoadCompanyTypesResponse extends CustomAPIResponse {

    
    @JsonProperty("CompanyTypes")
    private String companyTypes;


    public LoadCompanyTypesResponse(Error[] errors, boolean hasError, String messages, String companyTypes) {
        super(errors, hasError, messages);
        this.companyTypes = companyTypes;
    }

    public LoadCompanyTypesResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.companyTypes = apiResponse.getResponse().toString();
        }
    }

    
    public String getCompanyTypes() {
        return companyTypes;
    }

    public void setCompanyTypes(String companyTypes) {
        this.companyTypes = companyTypes;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoadCompanyTypesResponse that = (LoadCompanyTypesResponse) o;
        return Objects.equals(companyTypes, that.companyTypes) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(companyTypes);
    }

    @Override
    public String toString() {
        return "LoadCompanyTypesResponse{" +
                "companyTypes='" + companyTypes + '\'' +

                '}';
    }
}