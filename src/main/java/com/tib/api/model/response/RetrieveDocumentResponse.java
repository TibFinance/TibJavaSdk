
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.RetrieveDocumentResultEntity;
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


public class RetrieveDocumentResponse extends CustomAPIResponse {

    
    @JsonProperty("RetrieveDocumentResultEntity")
    private RetrieveDocumentResultEntity retrieveDocumentResultEntity;


    public RetrieveDocumentResponse(Error[] errors, boolean hasError, String messages, RetrieveDocumentResultEntity retrieveDocumentResultEntity) {
        super(errors, hasError, messages);
        this.retrieveDocumentResultEntity = retrieveDocumentResultEntity;
    }

    public RetrieveDocumentResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.retrieveDocumentResultEntity = objectMapper.readValue(json, RetrieveDocumentResultEntity.class);
        }
    }

    
    public RetrieveDocumentResultEntity getRetrieveDocumentResultEntity() {
        return retrieveDocumentResultEntity;
    }

    public void setRetrieveDocumentResultEntity(RetrieveDocumentResultEntity retrieveDocumentResultEntity) {
        this.retrieveDocumentResultEntity = retrieveDocumentResultEntity;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RetrieveDocumentResponse that = (RetrieveDocumentResponse) o;
        return Objects.equals(retrieveDocumentResultEntity, that.retrieveDocumentResultEntity) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(retrieveDocumentResultEntity);
    }

    @Override
    public String toString() {
        return "RetrieveDocumentResponse{" +
                "retrieveDocumentResultEntity='" + retrieveDocumentResultEntity + '\'' +

                '}';
    }
}