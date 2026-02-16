
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.DropInEntity;
import com.tib.api.model.WhiteLabeling;
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


public class GetDropInResponse extends CustomAPIResponse {

    
    @JsonProperty("DropIn")
    private DropInEntity dropIn;

    @JsonProperty("WhiteLabeling")
    private WhiteLabeling whiteLabeling;


    public GetDropInResponse(Error[] errors, boolean hasError, String messages, DropInEntity dropIn, WhiteLabeling whiteLabeling) {
        super(errors, hasError, messages);
        this.dropIn = dropIn;
        this.whiteLabeling = whiteLabeling;
    }

    public GetDropInResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.dropIn = objectMapper.readValue(json, DropInEntity.class);
            this.whiteLabeling = objectMapper.readValue(json, WhiteLabeling.class);
        }
    }

    
    public DropInEntity getDropIn() {
        return dropIn;
    }

    public void setDropIn(DropInEntity dropIn) {
        this.dropIn = dropIn;
    }

    public WhiteLabeling getWhiteLabeling() {
        return whiteLabeling;
    }

    public void setWhiteLabeling(WhiteLabeling whiteLabeling) {
        this.whiteLabeling = whiteLabeling;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetDropInResponse that = (GetDropInResponse) o;
        return Objects.equals(dropIn, that.dropIn) && Objects.equals(whiteLabeling, that.whiteLabeling) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(dropIn, whiteLabeling);
    }

    @Override
    public String toString() {
        return "GetDropInResponse{" +
                "dropIn='" + dropIn + '\'' +
                ", whiteLabeling='" + whiteLabeling + '\'' +

                '}';
    }
}