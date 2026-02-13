
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


public class AddNewDasProviderResponse extends CustomAPIResponse {

    
    @JsonProperty("DasProviderId")
    private String dasProviderId;


    public AddNewDasProviderResponse(Error[] errors, boolean hasError, String messages, String dasProviderId) {
        super(errors, hasError, messages);
        this.dasProviderId = dasProviderId;

    }

    public AddNewDasProviderResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.dasProviderId = apiResponse.getResponse().toString();

        }
    }

    
    public String getDasProviderId() {
        return dasProviderId;
    }

    public void setDasProviderId(String dasProviderId) {
        this.dasProviderId = dasProviderId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddNewDasProviderResponse that = (AddNewDasProviderResponse) o;
        return Objects.equals(dasProviderId, that.dasProviderId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(dasProviderId);
    }

    @Override
    public String toString() {
        return "AddNewDasProviderResponse{" +
                 "dasProviderId='" + dasProviderId + '\'' +

                '}';
    }
}