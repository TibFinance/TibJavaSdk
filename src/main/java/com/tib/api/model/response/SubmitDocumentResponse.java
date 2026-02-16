
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.SubmitDocumentResultEntity;
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


public class SubmitDocumentResponse extends CustomAPIResponse {

    
    @JsonProperty("SubmitDocumentResultEntity")
    private SubmitDocumentResultEntity submitDocumentResultEntity;


    public SubmitDocumentResponse(Error[] errors, boolean hasError, String messages, SubmitDocumentResultEntity submitDocumentResultEntity) {
        super(errors, hasError, messages);
        this.submitDocumentResultEntity = submitDocumentResultEntity;
    }

    public SubmitDocumentResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.submitDocumentResultEntity = objectMapper.readValue(json, SubmitDocumentResultEntity.class);
        }
    }

    
    public SubmitDocumentResultEntity getSubmitDocumentResultEntity() {
        return submitDocumentResultEntity;
    }

    public void setSubmitDocumentResultEntity(SubmitDocumentResultEntity submitDocumentResultEntity) {
        this.submitDocumentResultEntity = submitDocumentResultEntity;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubmitDocumentResponse that = (SubmitDocumentResponse) o;
        return Objects.equals(submitDocumentResultEntity, that.submitDocumentResultEntity) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(submitDocumentResultEntity);
    }

    @Override
    public String toString() {
        return "SubmitDocumentResponse{" +
                "submitDocumentResultEntity='" + submitDocumentResultEntity + '\'' +

                '}';
    }
}