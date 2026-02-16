
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


public class DeleteLoginResponse extends CustomAPIResponse {

    
    @JsonProperty("LoginId")
    private String loginId;


    public DeleteLoginResponse(Error[] errors, boolean hasError, String messages, String loginId) {
        super(errors, hasError, messages);
        this.loginId = loginId;
    }

    public DeleteLoginResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.loginId = apiResponse.getResponse().toString();
        }
    }

    
    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteLoginResponse that = (DeleteLoginResponse) o;
        return Objects.equals(loginId, that.loginId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(loginId);
    }

    @Override
    public String toString() {
        return "DeleteLoginResponse{" +
                "loginId='" + loginId + '\'' +

                '}';
    }
}