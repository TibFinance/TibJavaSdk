
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


public class DoesClientExistResponse extends CustomAPIResponse {

    
    @JsonProperty("IsClientExisting")
    private boolean isClientExisting;


    public DoesClientExistResponse(Error[] errors, boolean hasError, String messages, boolean isClientExisting) {
        super(errors, hasError, messages);
        this.isClientExisting = isClientExisting;
    }

    public DoesClientExistResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.isClientExisting = Boolean.parseBoolean(apiResponse.getResponse().toString());
        }
    }

    
    public boolean getIsClientExisting() {
        return isClientExisting;
    }

    public void setIsClientExisting(boolean isClientExisting) {
        this.isClientExisting = isClientExisting;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoesClientExistResponse that = (DoesClientExistResponse) o;
        return Objects.equals(isClientExisting, that.isClientExisting) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(isClientExisting);
    }

    @Override
    public String toString() {
        return "DoesClientExistResponse{" +
                "isClientExisting='" + isClientExisting + '\'' +

                '}';
    }
}