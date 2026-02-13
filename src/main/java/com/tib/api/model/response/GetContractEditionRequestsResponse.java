
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.ContractEditionRequest;
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


public class GetContractEditionRequestsResponse extends CustomAPIResponse {

    
    @JsonProperty("ContractEdditionRequests")
    private List<ContractEditionRequest> contractEdditionRequests;


    public GetContractEditionRequestsResponse(Error[] errors, boolean hasError, String messages, List<ContractEditionRequest> contractEdditionRequests) {
        super(errors, hasError, messages);
        this.contractEdditionRequests = contractEdditionRequests;

    }

    public GetContractEditionRequestsResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.contractEdditionRequests = (List<ContractEditionRequest>) apiResponse.getResponse();

        }
    }

    
    public List<ContractEditionRequest> getContractEdditionRequests() {
        return contractEdditionRequests;
    }

    public void setContractEdditionRequests(List<ContractEditionRequest> contractEdditionRequests) {
        this.contractEdditionRequests = contractEdditionRequests;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetContractEditionRequestsResponse that = (GetContractEditionRequestsResponse) o;
        return Objects.equals(contractEdditionRequests, that.contractEdditionRequests) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(contractEdditionRequests);
    }

    @Override
    public String toString() {
        return "GetContractEditionRequestsResponse{" +
                 "contractEdditionRequests='" + contractEdditionRequests + '\'' +

                '}';
    }
}