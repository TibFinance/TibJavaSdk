
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


public class CreateBoardingDocumentsResponse extends CustomAPIResponse {

    
    @JsonProperty("Status")
    private String status;

    @JsonProperty("Message")
    private String message;


    public CreateBoardingDocumentsResponse(Error[] errors, boolean hasError, String messages, String status, String message) {
        super(errors, hasError, messages);
        this.status = status;
        this.message = message;
    }

    public CreateBoardingDocumentsResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.status = apiResponse.getResponse().toString();
            this.message = apiResponse.getResponse().toString();
        }
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateBoardingDocumentsResponse that = (CreateBoardingDocumentsResponse) o;
        return Objects.equals(status, that.status) && Objects.equals(message, that.message) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(status, message);
    }

    @Override
    public String toString() {
        return "CreateBoardingDocumentsResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +

                '}';
    }
}