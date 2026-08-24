
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class Verify2FASetupResponse extends CustomAPIResponse {

    
    @JsonProperty("Success")
    private boolean success;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("ErrorMessage")
    private String errorMessage;


    public Verify2FASetupResponse() {
    }

    public Verify2FASetupResponse(Error[] errors, boolean hasError, String messages, boolean success, String message, String errorMessage) {
        super(errors, hasError, messages);
        this.success = success;
        this.message = message;
        this.errorMessage = errorMessage;
    }

    public Verify2FASetupResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String __rawBody = apiResponse.getRawBody();
            if (__rawBody != null && !__rawBody.isEmpty()) {
                Verify2FASetupResponse __typed = objectMapper.readValue(__rawBody, Verify2FASetupResponse.class);
                this.success = __typed.success;
                this.message = __typed.message;
                this.errorMessage = __typed.errorMessage;
            }
        }
    }

    
    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Verify2FASetupResponse that = (Verify2FASetupResponse) o;
        return Objects.equals(success, that.success) && Objects.equals(message, that.message) && Objects.equals(errorMessage, that.errorMessage) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(success, message, errorMessage);
    }

    @Override
    public String toString() {
        return "Verify2FASetupResponse{" +
                "success='" + success + '\'' +
                ", message='" + message + '\'' +
                ", errorMessage='" + errorMessage + '\'' +

                '}';
    }
}