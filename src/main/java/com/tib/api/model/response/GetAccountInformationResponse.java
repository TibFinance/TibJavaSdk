
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.ProviderAccountOperations;
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


public class GetAccountInformationResponse extends CustomAPIResponse {

    
    @JsonProperty("ProviderAccountOperationList")
    private List<ProviderAccountOperations> providerAccountOperationList;


    public GetAccountInformationResponse(Error[] errors, boolean hasError, String messages, List<ProviderAccountOperations> providerAccountOperationList) {
        super(errors, hasError, messages);
        this.providerAccountOperationList = providerAccountOperationList;

    }

    public GetAccountInformationResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.providerAccountOperationList = (List<ProviderAccountOperations>) apiResponse.getResponse();

        }
    }

    
    public List<ProviderAccountOperations> getProviderAccountOperationList() {
        return providerAccountOperationList;
    }

    public void setProviderAccountOperationList(List<ProviderAccountOperations> providerAccountOperationList) {
        this.providerAccountOperationList = providerAccountOperationList;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAccountInformationResponse that = (GetAccountInformationResponse) o;
        return Objects.equals(providerAccountOperationList, that.providerAccountOperationList) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerAccountOperationList);
    }

    @Override
    public String toString() {
        return "GetAccountInformationResponse{" +
                 "providerAccountOperationList='" + providerAccountOperationList + '\'' +

                '}';
    }
}