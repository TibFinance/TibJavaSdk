
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.MerchantView;
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


public class CreateSupplierTransferResponse extends CustomAPIResponse {

    
    @JsonProperty("MatchingExistingMerchants")
    private List<MerchantView> matchingExistingMerchants;


    public CreateSupplierTransferResponse(Error[] errors, boolean hasError, String messages, List<MerchantView> matchingExistingMerchants) {
        super(errors, hasError, messages);
        this.matchingExistingMerchants = matchingExistingMerchants;
    }

    public CreateSupplierTransferResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.matchingExistingMerchants = (List<MerchantView>) apiResponse.getResponse();
        }
    }

    
    public List<MerchantView> getMatchingExistingMerchants() {
        return matchingExistingMerchants;
    }

    public void setMatchingExistingMerchants(List<MerchantView> matchingExistingMerchants) {
        this.matchingExistingMerchants = matchingExistingMerchants;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateSupplierTransferResponse that = (CreateSupplierTransferResponse) o;
        return Objects.equals(matchingExistingMerchants, that.matchingExistingMerchants) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(matchingExistingMerchants);
    }

    @Override
    public String toString() {
        return "CreateSupplierTransferResponse{" +
                "matchingExistingMerchants='" + matchingExistingMerchants + '\'' +

                '}';
    }
}