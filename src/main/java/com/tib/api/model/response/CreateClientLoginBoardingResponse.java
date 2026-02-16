
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


public class CreateClientLoginBoardingResponse extends CustomAPIResponse {

    
    @JsonProperty("RedirectUrl")
    private String redirectUrl;

    @JsonProperty("Token")
    private String token;


    public CreateClientLoginBoardingResponse(Error[] errors, boolean hasError, String messages, String redirectUrl, String token) {
        super(errors, hasError, messages);
        this.redirectUrl = redirectUrl;
        this.token = token;
    }

    public CreateClientLoginBoardingResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.redirectUrl = apiResponse.getResponse().toString();
            this.token = apiResponse.getResponse().toString();
        }
    }

    
    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateClientLoginBoardingResponse that = (CreateClientLoginBoardingResponse) o;
        return Objects.equals(redirectUrl, that.redirectUrl) && Objects.equals(token, that.token) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(redirectUrl, token);
    }

    @Override
    public String toString() {
        return "CreateClientLoginBoardingResponse{" +
                "redirectUrl='" + redirectUrl + '\'' +
                ", token='" + token + '\'' +

                '}';
    }
}