
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.response.CreateFreeOperationBatchResponseBase;
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


public class CreateFreeOperationBatchResponse extends CustomAPIResponse {

    
    @JsonProperty("CreateFreeOperationBatchResponses")
    private List<CreateFreeOperationBatchResponseBase> createFreeOperationBatchResponses;


    public CreateFreeOperationBatchResponse() {
    }

    public CreateFreeOperationBatchResponse(Error[] errors, boolean hasError, String messages, List<CreateFreeOperationBatchResponseBase> createFreeOperationBatchResponses) {
        super(errors, hasError, messages);
        this.createFreeOperationBatchResponses = createFreeOperationBatchResponses;
    }

    public CreateFreeOperationBatchResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String __rawBody = apiResponse.getRawBody();
            if (__rawBody != null && !__rawBody.isEmpty()) {
                CreateFreeOperationBatchResponse __typed = objectMapper.readValue(__rawBody, CreateFreeOperationBatchResponse.class);
                this.createFreeOperationBatchResponses = __typed.createFreeOperationBatchResponses;
            }
        }
    }

    
    public List<CreateFreeOperationBatchResponseBase> getCreateFreeOperationBatchResponses() {
        return createFreeOperationBatchResponses;
    }

    public void setCreateFreeOperationBatchResponses(List<CreateFreeOperationBatchResponseBase> createFreeOperationBatchResponses) {
        this.createFreeOperationBatchResponses = createFreeOperationBatchResponses;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateFreeOperationBatchResponse that = (CreateFreeOperationBatchResponse) o;
        return Objects.equals(createFreeOperationBatchResponses, that.createFreeOperationBatchResponses) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(createFreeOperationBatchResponses);
    }

    @Override
    public String toString() {
        return "CreateFreeOperationBatchResponse{" +
                "createFreeOperationBatchResponses='" + createFreeOperationBatchResponses + '\'' +

                '}';
    }
}