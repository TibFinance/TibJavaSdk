
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


public class AdminCreateClientLoginSessionResponse extends CustomAPIResponse {

    
    @JsonProperty("SessionId")
    private String sessionId;


    public AdminCreateClientLoginSessionResponse(Error[] errors, boolean hasError, String messages, String sessionId) {
        super(errors, hasError, messages);
        this.sessionId = sessionId;

    }

    public AdminCreateClientLoginSessionResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.sessionId = apiResponse.getResponse().toString();

        }
    }

    
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminCreateClientLoginSessionResponse that = (AdminCreateClientLoginSessionResponse) o;
        return Objects.equals(sessionId, that.sessionId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(sessionId);
    }

    @Override
    public String toString() {
        return "AdminCreateClientLoginSessionResponse{" +
                 "sessionId='" + sessionId + '\'' +

                '}';
    }
}