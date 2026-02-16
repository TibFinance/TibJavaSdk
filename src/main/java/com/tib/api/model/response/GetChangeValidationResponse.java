
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.WhiteLabeling;
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


public class GetChangeValidationResponse extends CustomAPIResponse {

    
    @JsonProperty("JsonObject")
    private String jsonObject;

    @JsonProperty("ValidationToken")
    private String validationToken;

    @JsonProperty("WhiteLabeling")
    private WhiteLabeling whiteLabeling;


    public GetChangeValidationResponse(Error[] errors, boolean hasError, String messages, String jsonObject, String validationToken, WhiteLabeling whiteLabeling) {
        super(errors, hasError, messages);
        this.jsonObject = jsonObject;
        this.validationToken = validationToken;
        this.whiteLabeling = whiteLabeling;
    }

    public GetChangeValidationResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.whiteLabeling = objectMapper.readValue(json, WhiteLabeling.class);
        }
    }

    
    public String getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(String jsonObject) {
        this.jsonObject = jsonObject;
    }

    public String getValidationToken() {
        return validationToken;
    }

    public void setValidationToken(String validationToken) {
        this.validationToken = validationToken;
    }

    public WhiteLabeling getWhiteLabeling() {
        return whiteLabeling;
    }

    public void setWhiteLabeling(WhiteLabeling whiteLabeling) {
        this.whiteLabeling = whiteLabeling;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetChangeValidationResponse that = (GetChangeValidationResponse) o;
        return Objects.equals(jsonObject, that.jsonObject) && Objects.equals(validationToken, that.validationToken) && Objects.equals(whiteLabeling, that.whiteLabeling) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(jsonObject, validationToken, whiteLabeling);
    }

    @Override
    public String toString() {
        return "GetChangeValidationResponse{" +
                "jsonObject='" + jsonObject + '\'' +
                ", validationToken='" + validationToken + '\'' +
                ", whiteLabeling='" + whiteLabeling + '\'' +

                '}';
    }
}