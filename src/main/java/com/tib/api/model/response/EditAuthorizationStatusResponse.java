
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


public class EditAuthorizationStatusResponse extends CustomAPIResponse {

    
    @JsonProperty("AuthorizationStatus")
    private String authorizationStatus;


    public EditAuthorizationStatusResponse(Error[] errors, boolean hasError, String messages, String authorizationStatus) {
        super(errors, hasError, messages);
        this.authorizationStatus = authorizationStatus;
    }

    public EditAuthorizationStatusResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.authorizationStatus = apiResponse.getResponse().toString();
        }
    }

    
    public String getAuthorizationStatus() {
        return authorizationStatus;
    }

    public void setAuthorizationStatus(String authorizationStatus) {
        this.authorizationStatus = authorizationStatus;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EditAuthorizationStatusResponse that = (EditAuthorizationStatusResponse) o;
        return Objects.equals(authorizationStatus, that.authorizationStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(authorizationStatus);
    }

    @Override
    public String toString() {
        return "EditAuthorizationStatusResponse{" +
                "authorizationStatus='" + authorizationStatus + '\'' +

                '}';
    }
}