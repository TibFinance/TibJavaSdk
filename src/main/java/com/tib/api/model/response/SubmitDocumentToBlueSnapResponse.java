
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


public class SubmitDocumentToBlueSnapResponse extends CustomAPIResponse {

    
    @JsonProperty("Status")
    private String status;

    @JsonProperty("Message")
    private String message;

    @JsonProperty("Count")
    private Integer count;


    public SubmitDocumentToBlueSnapResponse(Error[] errors, boolean hasError, String messages, String status, String message, Integer count) {
        super(errors, hasError, messages);
        this.status = status;
        this.message = message;
        this.count = count;
    }

    public SubmitDocumentToBlueSnapResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.status = apiResponse.getResponse().toString();
            this.message = apiResponse.getResponse().toString();
            this.count = Integer.parseInt(apiResponse.getResponse().toString());
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubmitDocumentToBlueSnapResponse that = (SubmitDocumentToBlueSnapResponse) o;
        return Objects.equals(status, that.status) && Objects.equals(message, that.message) && Objects.equals(count, that.count) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(status, message, count);
    }

    @Override
    public String toString() {
        return "SubmitDocumentToBlueSnapResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", count='" + count + '\'' +

                '}';
    }
}