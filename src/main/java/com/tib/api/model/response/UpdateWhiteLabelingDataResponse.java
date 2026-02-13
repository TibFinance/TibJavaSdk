
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.fasterxml.jackson.core.type.TypeReference;
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


public class UpdateWhiteLabelingDataResponse extends CustomAPIResponse {

    
    @JsonProperty("WhiteLabeling")
    private WhiteLabeling WhiteLabeling;


    public UpdateWhiteLabelingDataResponse(Error[] errors, boolean hasError, String messages, WhiteLabeling WhiteLabeling) {
        super(errors, hasError, messages);
        this.WhiteLabeling = WhiteLabeling;

    }

    public UpdateWhiteLabelingDataResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.WhiteLabeling = objectMapper.convertValue(
                apiResponse.getResponse(), WhiteLabeling.class);
        }
    }

    
    public WhiteLabeling getWhiteLabeling() {
        return WhiteLabeling;
    }

    public void setWhiteLabeling(WhiteLabeling WhiteLabeling) {
        this.WhiteLabeling = WhiteLabeling;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateWhiteLabelingDataResponse that = (UpdateWhiteLabelingDataResponse) o;
        return Objects.equals(WhiteLabeling, that.WhiteLabeling) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(WhiteLabeling);
    }

    @Override
    public String toString() {
        return "UpdateWhiteLabelingDataResponse{" +
                 "WhiteLabeling='" + WhiteLabeling + '\'' +

                '}';
    }
}