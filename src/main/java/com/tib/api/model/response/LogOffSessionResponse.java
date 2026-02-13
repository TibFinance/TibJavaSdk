
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


public class LogOffSessionResponse extends CustomAPIResponse {

    
    @JsonProperty("LoggOffSuccess")
    private boolean loggOffSuccess;


    public LogOffSessionResponse(Error[] errors, boolean hasError, String messages, boolean loggOffSuccess) {
        super(errors, hasError, messages);
        this.loggOffSuccess = loggOffSuccess;

    }

    public LogOffSessionResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.loggOffSuccess = Boolean.parseBoolean(apiResponse.getResponse().toString());

        }
    }

    
    public boolean getLoggOffSuccess() {
        return loggOffSuccess;
    }

    public void setLoggOffSuccess(boolean loggOffSuccess) {
        this.loggOffSuccess = loggOffSuccess;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogOffSessionResponse that = (LogOffSessionResponse) o;
        return Objects.equals(loggOffSuccess, that.loggOffSuccess) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(loggOffSuccess);
    }

    @Override
    public String toString() {
        return "LogOffSessionResponse{" +
                 "loggOffSuccess='" + loggOffSuccess + '\'' +

                '}';
    }
}