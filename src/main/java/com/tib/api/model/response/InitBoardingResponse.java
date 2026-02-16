
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


public class InitBoardingResponse extends CustomAPIResponse {

    
    @JsonProperty("RedirectUrl")
    private String redirectUrl;


    public InitBoardingResponse(Error[] errors, boolean hasError, String messages, String redirectUrl) {
        super(errors, hasError, messages);
        this.redirectUrl = redirectUrl;
    }

    public InitBoardingResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.redirectUrl = apiResponse.getResponse().toString();
        }
    }

    
    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InitBoardingResponse that = (InitBoardingResponse) o;
        return Objects.equals(redirectUrl, that.redirectUrl) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(redirectUrl);
    }

    @Override
    public String toString() {
        return "InitBoardingResponse{" +
                "redirectUrl='" + redirectUrl + '\'' +

                '}';
    }
}