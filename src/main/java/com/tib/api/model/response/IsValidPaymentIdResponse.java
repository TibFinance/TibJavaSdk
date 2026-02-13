
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


public class IsValidPaymentIdResponse extends CustomAPIResponse {

    
    @JsonProperty("IsValidPaymentId")
    private boolean isValidPaymentId;


    public IsValidPaymentIdResponse(Error[] errors, boolean hasError, String messages, boolean isValidPaymentId) {
        super(errors, hasError, messages);
        this.isValidPaymentId = isValidPaymentId;

    }

    public IsValidPaymentIdResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.isValidPaymentId = Boolean.parseBoolean(apiResponse.getResponse().toString());

        }
    }

    
    public boolean getIsValidPaymentId() {
        return isValidPaymentId;
    }

    public void setIsValidPaymentId(boolean isValidPaymentId) {
        this.isValidPaymentId = isValidPaymentId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsValidPaymentIdResponse that = (IsValidPaymentIdResponse) o;
        return Objects.equals(isValidPaymentId, that.isValidPaymentId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(isValidPaymentId);
    }

    @Override
    public String toString() {
        return "IsValidPaymentIdResponse{" +
                 "isValidPaymentId='" + isValidPaymentId + '\'' +

                '}';
    }
}