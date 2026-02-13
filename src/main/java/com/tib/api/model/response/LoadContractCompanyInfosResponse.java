
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.ContractInfoEntity;
import com.tib.api.model.EditionRequest;
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


public class LoadContractCompanyInfosResponse extends CustomAPIResponse {

    
    @JsonProperty("CompanyInfos")
    private ContractInfoEntity companyInfos;

    @JsonProperty("EditionRequests")
    private List<EditionRequest> editionRequests;


    public LoadContractCompanyInfosResponse(Error[] errors, boolean hasError, String messages, ContractInfoEntity companyInfos, List<EditionRequest> editionRequests) {
        super(errors, hasError, messages);
        this.companyInfos = companyInfos;
this.editionRequests = editionRequests;

    }

    public LoadContractCompanyInfosResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.companyInfos = objectMapper.readValue(json, ContractInfoEntity.class);
this.editionRequests = (List<EditionRequest>) apiResponse.getResponse();

        }
    }

    
    public ContractInfoEntity getCompanyInfos() {
        return companyInfos;
    }

    public void setCompanyInfos(ContractInfoEntity companyInfos) {
        this.companyInfos = companyInfos;
    }

    public List<EditionRequest> getEditionRequests() {
        return editionRequests;
    }

    public void setEditionRequests(List<EditionRequest> editionRequests) {
        this.editionRequests = editionRequests;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoadContractCompanyInfosResponse that = (LoadContractCompanyInfosResponse) o;
        return Objects.equals(companyInfos, that.companyInfos) && Objects.equals(editionRequests, that.editionRequests) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(companyInfos, editionRequests);
    }

    @Override
    public String toString() {
        return "LoadContractCompanyInfosResponse{" +
                 "companyInfos='" + companyInfos + '\'' +
 ", editionRequests='" + editionRequests + '\'' +

                '}';
    }
}