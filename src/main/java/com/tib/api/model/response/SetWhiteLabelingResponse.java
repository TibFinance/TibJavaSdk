
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
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


public class SetWhiteLabelingResponse extends CustomAPIResponse {

    
    @JsonProperty("WhiteLabeling")
    private WhiteLabeling whiteLabeling;


    public SetWhiteLabelingResponse(Error[] errors, boolean hasError, String messages, WhiteLabeling whiteLabeling) {
        super(errors, hasError, messages);
        this.whiteLabeling = whiteLabeling;

    }

    public SetWhiteLabelingResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.whiteLabeling = objectMapper.readValue(json, WhiteLabeling.class);

        }
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
        SetWhiteLabelingResponse that = (SetWhiteLabelingResponse) o;
        return Objects.equals(whiteLabeling, that.whiteLabeling) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(whiteLabeling);
    }

    @Override
    public String toString() {
        return "SetWhiteLabelingResponse{" +
                 "whiteLabeling='" + whiteLabeling + '\'' +

                '}';
    }
}