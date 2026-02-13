
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


public class UpdateContractEditionRequestResponse extends CustomAPIResponse {

    
    @JsonProperty("ContractEditionRequest")
    private ContractEditionRequest contractEditionRequest;


    public UpdateContractEditionRequestResponse(Error[] errors, boolean hasError, String messages, ContractEditionRequest contractEditionRequest) {
        super(errors, hasError, messages);
        this.contractEditionRequest = contractEditionRequest;

    }

    public UpdateContractEditionRequestResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.contractEditionRequest = objectMapper.readValue(json, ContractEditionRequest.class);

        }
    }

    
    public ContractEditionRequest getContractEditionRequest() {
        return contractEditionRequest;
    }

    public void setContractEditionRequest(ContractEditionRequest contractEditionRequest) {
        this.contractEditionRequest = contractEditionRequest;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateContractEditionRequestResponse that = (UpdateContractEditionRequestResponse) o;
        return Objects.equals(contractEditionRequest, that.contractEditionRequest) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(contractEditionRequest);
    }

    @Override
    public String toString() {
        return "UpdateContractEditionRequestResponse{" +
                 "contractEditionRequest='" + contractEditionRequest + '\'' +

                '}';
    }
}