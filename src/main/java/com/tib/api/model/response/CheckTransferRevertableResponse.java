
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


public class CheckTransferRevertableResponse extends CustomAPIResponse {

    
    @JsonProperty("IsRevertable")
    private boolean isRevertable;

    @JsonProperty("Reason")
    private String reason;


    public CheckTransferRevertableResponse(Error[] errors, boolean hasError, String messages, boolean isRevertable, String reason) {
        super(errors, hasError, messages);
        this.isRevertable = isRevertable;
this.reason = reason;

    }

    public CheckTransferRevertableResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.isRevertable = Boolean.parseBoolean(apiResponse.getResponse().toString());
this.reason = apiResponse.getResponse().toString();

        }
    }

    
    public boolean getIsRevertable() {
        return isRevertable;
    }

    public void setIsRevertable(boolean isRevertable) {
        this.isRevertable = isRevertable;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckTransferRevertableResponse that = (CheckTransferRevertableResponse) o;
        return Objects.equals(isRevertable, that.isRevertable) && Objects.equals(reason, that.reason) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(isRevertable, reason);
    }

    @Override
    public String toString() {
        return "CheckTransferRevertableResponse{" +
                 "isRevertable='" + isRevertable + '\'' +
 ", reason='" + reason + '\'' +

                '}';
    }
}