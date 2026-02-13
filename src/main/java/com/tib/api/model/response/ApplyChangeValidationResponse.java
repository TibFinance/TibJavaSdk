
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


public class ApplyChangeValidationResponse extends CustomAPIResponse {

    
    @JsonProperty("RecordIsModify")
    private boolean recordIsModify;


    public ApplyChangeValidationResponse(Error[] errors, boolean hasError, String messages, boolean recordIsModify) {
        super(errors, hasError, messages);
        this.recordIsModify = recordIsModify;

    }

    public ApplyChangeValidationResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.recordIsModify = Boolean.parseBoolean(apiResponse.getResponse().toString());

        }
    }

    
    public boolean getRecordIsModify() {
        return recordIsModify;
    }

    public void setRecordIsModify(boolean recordIsModify) {
        this.recordIsModify = recordIsModify;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplyChangeValidationResponse that = (ApplyChangeValidationResponse) o;
        return Objects.equals(recordIsModify, that.recordIsModify) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(recordIsModify);
    }

    @Override
    public String toString() {
        return "ApplyChangeValidationResponse{" +
                 "recordIsModify='" + recordIsModify + '\'' +

                '}';
    }
}