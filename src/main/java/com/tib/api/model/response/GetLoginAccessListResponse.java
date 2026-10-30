
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.LoginRelationsEntity;
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


@JsonIgnoreProperties(ignoreUnknown = true)
public class GetLoginAccessListResponse extends CustomAPIResponse {

    
    @JsonProperty("LoginRelations")
    private List<LoginRelationsEntity> loginRelations;


    public GetLoginAccessListResponse() {
    }

    public GetLoginAccessListResponse(Error[] errors, boolean hasError, String messages, List<LoginRelationsEntity> loginRelations) {
        super(errors, hasError, messages);
        this.loginRelations = loginRelations;
    }

    public GetLoginAccessListResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        readPayload(apiResponse, objectMapper);
    }

    private void readPayload(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        String __rawBody = apiResponse.getRawBody();
        if (__rawBody == null || __rawBody.isEmpty()) {
            return;
        }
        try {
            GetLoginAccessListResponse __typed = objectMapper.readValue(__rawBody, GetLoginAccessListResponse.class);
            this.loginRelations = __typed.loginRelations;
        } catch (JsonProcessingException | RuntimeException e) {
            if (!apiResponse.isHasError()) {
                throw e;
            }
        }
    }

    
    public List<LoginRelationsEntity> getLoginRelations() {
        return loginRelations;
    }

    public void setLoginRelations(List<LoginRelationsEntity> loginRelations) {
        this.loginRelations = loginRelations;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLoginAccessListResponse that = (GetLoginAccessListResponse) o;
        return Objects.equals(loginRelations, that.loginRelations) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(loginRelations);
    }

    @Override
    public String toString() {
        return "GetLoginAccessListResponse{" +
                "loginRelations='" + loginRelations + '\'' +

                '}';
    }
}