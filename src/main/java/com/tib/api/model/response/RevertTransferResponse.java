
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


public class RevertTransferResponse extends CustomAPIResponse {

    
    @JsonProperty("HasBeenDeleted")
    private boolean hasBeenDeleted;


    public RevertTransferResponse(Error[] errors, boolean hasError, String messages, boolean hasBeenDeleted) {
        super(errors, hasError, messages);
        this.hasBeenDeleted = hasBeenDeleted;

    }

    public RevertTransferResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.hasBeenDeleted = Boolean.parseBoolean(apiResponse.getResponse().toString());

        }
    }

    
    public boolean getHasBeenDeleted() {
        return hasBeenDeleted;
    }

    public void setHasBeenDeleted(boolean hasBeenDeleted) {
        this.hasBeenDeleted = hasBeenDeleted;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RevertTransferResponse that = (RevertTransferResponse) o;
        return Objects.equals(hasBeenDeleted, that.hasBeenDeleted) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(hasBeenDeleted);
    }

    @Override
    public String toString() {
        return "RevertTransferResponse{" +
                 "hasBeenDeleted='" + hasBeenDeleted + '\'' +

                '}';
    }
}