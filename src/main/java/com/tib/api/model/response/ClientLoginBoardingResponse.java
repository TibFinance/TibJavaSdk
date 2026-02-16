
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


public class ClientLoginBoardingResponse extends CustomAPIResponse {

    
    @JsonProperty("IsValid")
    private boolean isValid;


    public ClientLoginBoardingResponse(Error[] errors, boolean hasError, String messages, boolean isValid) {
        super(errors, hasError, messages);
        this.isValid = isValid;
    }

    public ClientLoginBoardingResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.isValid = Boolean.parseBoolean(apiResponse.getResponse().toString());
        }
    }

    
    public boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientLoginBoardingResponse that = (ClientLoginBoardingResponse) o;
        return Objects.equals(isValid, that.isValid) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(isValid);
    }

    @Override
    public String toString() {
        return "ClientLoginBoardingResponse{" +
                "isValid='" + isValid + '\'' +

                '}';
    }
}