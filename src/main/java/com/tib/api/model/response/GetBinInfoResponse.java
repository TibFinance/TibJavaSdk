
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.BinInfoDto;
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


public class GetBinInfoResponse extends CustomAPIResponse {

    
    @JsonProperty("BinInfo")
    private BinInfoDto binInfo;

    @JsonProperty("Found")
    private boolean found;


    public GetBinInfoResponse(Error[] errors, boolean hasError, String messages, BinInfoDto binInfo, boolean found) {
        super(errors, hasError, messages);
        this.binInfo = binInfo;
        this.found = found;
    }

    public GetBinInfoResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.binInfo = objectMapper.readValue(json, BinInfoDto.class);
        }
    }

    
    public BinInfoDto getBinInfo() {
        return binInfo;
    }

    public void setBinInfo(BinInfoDto binInfo) {
        this.binInfo = binInfo;
    }

    public boolean getFound() {
        return found;
    }

    public void setFound(boolean found) {
        this.found = found;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBinInfoResponse that = (GetBinInfoResponse) o;
        return Objects.equals(binInfo, that.binInfo) && Objects.equals(found, that.found) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(binInfo, found);
    }

    @Override
    public String toString() {
        return "GetBinInfoResponse{" +
                "binInfo='" + binInfo + '\'' +
                ", found='" + found + '\'' +

                '}';
    }
}