
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.LoginRelationsEntity;
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


public class GetLoginAccesListResponse extends CustomAPIResponse {

    
    @JsonProperty("LoginRelations")
    private List<LoginRelationsEntity> loginRelations;


    public GetLoginAccesListResponse(Error[] errors, boolean hasError, String messages, List<LoginRelationsEntity> loginRelations) {
        super(errors, hasError, messages);
        this.loginRelations = loginRelations;

    }

    public GetLoginAccesListResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.loginRelations = (List<LoginRelationsEntity>) apiResponse.getResponse();

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
        GetLoginAccesListResponse that = (GetLoginAccesListResponse) o;
        return Objects.equals(loginRelations, that.loginRelations) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(loginRelations);
    }

    @Override
    public String toString() {
        return "GetLoginAccesListResponse{" +
                 "loginRelations='" + loginRelations + '\'' +

                '}';
    }
}