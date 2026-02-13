
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


public class SaveProviderMerchantResponse extends CustomAPIResponse {

    
    @JsonProperty("Status")
    private String status;


    public SaveProviderMerchantResponse(Error[] errors, boolean hasError, String messages, String status) {
        super(errors, hasError, messages);
        this.status = status;

    }

    public SaveProviderMerchantResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.status = apiResponse.getResponse().toString();

        }
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveProviderMerchantResponse that = (SaveProviderMerchantResponse) o;
        return Objects.equals(status, that.status) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    public String toString() {
        return "SaveProviderMerchantResponse{" +
                 "status='" + status + '\'' +

                '}';
    }
}