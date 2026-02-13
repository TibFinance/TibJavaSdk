
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.DasProviderCanada;
import com.tib.api.model.DasProviderQuebec;
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


public class ListDasProvidersResponse extends CustomAPIResponse {

    
    @JsonProperty("CanadaDasProvider")
    private List<DasProviderCanada> canadaDasProvider;

    @JsonProperty("QuebecDasProvider")
    private List<DasProviderQuebec> quebecDasProvider;


    public ListDasProvidersResponse(Error[] errors, boolean hasError, String messages, List<DasProviderCanada> canadaDasProvider, List<DasProviderQuebec> quebecDasProvider) {
        super(errors, hasError, messages);
        this.canadaDasProvider = canadaDasProvider;
this.quebecDasProvider = quebecDasProvider;

    }

    public ListDasProvidersResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.canadaDasProvider = (List<DasProviderCanada>) apiResponse.getResponse();
this.quebecDasProvider = (List<DasProviderQuebec>) apiResponse.getResponse();

        }
    }

    
    public List<DasProviderCanada> getCanadaDasProvider() {
        return canadaDasProvider;
    }

    public void setCanadaDasProvider(List<DasProviderCanada> canadaDasProvider) {
        this.canadaDasProvider = canadaDasProvider;
    }

    public List<DasProviderQuebec> getQuebecDasProvider() {
        return quebecDasProvider;
    }

    public void setQuebecDasProvider(List<DasProviderQuebec> quebecDasProvider) {
        this.quebecDasProvider = quebecDasProvider;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListDasProvidersResponse that = (ListDasProvidersResponse) o;
        return Objects.equals(canadaDasProvider, that.canadaDasProvider) && Objects.equals(quebecDasProvider, that.quebecDasProvider) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(canadaDasProvider, quebecDasProvider);
    }

    @Override
    public String toString() {
        return "ListDasProvidersResponse{" +
                 "canadaDasProvider='" + canadaDasProvider + '\'' +
 ", quebecDasProvider='" + quebecDasProvider + '\'' +

                '}';
    }
}