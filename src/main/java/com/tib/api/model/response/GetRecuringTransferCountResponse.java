
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


public class GetRecuringTransferCountResponse extends CustomAPIResponse {

    
    @JsonProperty("RecuringTransfersCount")
    private Integer recuringTransfersCount;


    public GetRecuringTransferCountResponse(Error[] errors, boolean hasError, String messages, Integer recuringTransfersCount) {
        super(errors, hasError, messages);
        this.recuringTransfersCount = recuringTransfersCount;

    }

    public GetRecuringTransferCountResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.recuringTransfersCount = Integer.parseInt(apiResponse.getResponse().toString());

        }
    }

    
    public Integer getRecuringTransfersCount() {
        return recuringTransfersCount;
    }

    public void setRecuringTransfersCount(Integer recuringTransfersCount) {
        this.recuringTransfersCount = recuringTransfersCount;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetRecuringTransferCountResponse that = (GetRecuringTransferCountResponse) o;
        return Objects.equals(recuringTransfersCount, that.recuringTransfersCount) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(recuringTransfersCount);
    }

    @Override
    public String toString() {
        return "GetRecuringTransferCountResponse{" +
                 "recuringTransfersCount='" + recuringTransfersCount + '\'' +

                '}';
    }
}