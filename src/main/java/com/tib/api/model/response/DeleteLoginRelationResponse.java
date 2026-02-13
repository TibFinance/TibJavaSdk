
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


public class DeleteLoginRelationResponse extends CustomAPIResponse {

    
    @JsonProperty("LoginRelationId")
    private String loginRelationId;


    public DeleteLoginRelationResponse(Error[] errors, boolean hasError, String messages, String loginRelationId) {
        super(errors, hasError, messages);
        this.loginRelationId = loginRelationId;

    }

    public DeleteLoginRelationResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.loginRelationId = apiResponse.getResponse().toString();

        }
    }

    
    public String getLoginRelationId() {
        return loginRelationId;
    }

    public void setLoginRelationId(String loginRelationId) {
        this.loginRelationId = loginRelationId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteLoginRelationResponse that = (DeleteLoginRelationResponse) o;
        return Objects.equals(loginRelationId, that.loginRelationId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(loginRelationId);
    }

    @Override
    public String toString() {
        return "DeleteLoginRelationResponse{" +
                 "loginRelationId='" + loginRelationId + '\'' +

                '}';
    }
}