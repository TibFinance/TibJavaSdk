
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


public class RetreiveDataResponse extends CustomAPIResponse {

    
    @JsonProperty("DataCryptedBase64")
    private String dataCryptedBase64;


    public RetreiveDataResponse(Error[] errors, boolean hasError, String messages, String dataCryptedBase64) {
        super(errors, hasError, messages);
        this.dataCryptedBase64 = dataCryptedBase64;

    }

    public RetreiveDataResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.dataCryptedBase64 = apiResponse.getResponse().toString();

        }
    }

    
    public String getDataCryptedBase64() {
        return dataCryptedBase64;
    }

    public void setDataCryptedBase64(String dataCryptedBase64) {
        this.dataCryptedBase64 = dataCryptedBase64;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RetreiveDataResponse that = (RetreiveDataResponse) o;
        return Objects.equals(dataCryptedBase64, that.dataCryptedBase64) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(dataCryptedBase64);
    }

    @Override
    public String toString() {
        return "RetreiveDataResponse{" +
                 "dataCryptedBase64='" + dataCryptedBase64 + '\'' +

                '}';
    }
}