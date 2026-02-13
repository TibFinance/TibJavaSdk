
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.RecuringTransfer;
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


public class GetRecuringTransfersResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("RecuringTransfers")
    private List<RecuringTransfer> recuringTransfers;


    public GetRecuringTransfersResponse(Error[] errors, boolean hasError, String messages, List<RecuringTransfer> recuringTransfers) {
        super(errors, hasError, messages);
        this.recuringTransfers = recuringTransfers;

    }

    public GetRecuringTransfersResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.recuringTransfers = (List<RecuringTransfer>) apiResponse.getResponse();

        }
    }

    
    public List<RecuringTransfer> getRecuringTransfers() {
        return recuringTransfers;
    }

    public void setRecuringTransfers(List<RecuringTransfer> recuringTransfers) {
        this.recuringTransfers = recuringTransfers;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetRecuringTransfersResponse that = (GetRecuringTransfersResponse) o;
        return Objects.equals(recuringTransfers, that.recuringTransfers) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(recuringTransfers);
    }

    @Override
    public String toString() {
        return "GetRecuringTransfersResponse{" +
                 "recuringTransfers='" + recuringTransfers + '\'' +

                '}';
    }
}