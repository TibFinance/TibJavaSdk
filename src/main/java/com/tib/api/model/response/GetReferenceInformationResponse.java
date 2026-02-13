
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


public class GetReferenceInformationResponse extends CustomAPIResponse {

    
    @JsonProperty("ReferenceDataString1")
    private String referenceDataString1;

    @JsonProperty("ReferenceDataGuid1")
    private String referenceDataGuid1;


    public GetReferenceInformationResponse(Error[] errors, boolean hasError, String messages, String referenceDataString1, String referenceDataGuid1) {
        super(errors, hasError, messages);
        this.referenceDataString1 = referenceDataString1;
this.referenceDataGuid1 = referenceDataGuid1;

    }

    public GetReferenceInformationResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.referenceDataString1 = apiResponse.getResponse().toString();
this.referenceDataGuid1 = apiResponse.getResponse().toString();

        }
    }

    
    public String getReferenceDataString1() {
        return referenceDataString1;
    }

    public void setReferenceDataString1(String referenceDataString1) {
        this.referenceDataString1 = referenceDataString1;
    }

    public String getReferenceDataGuid1() {
        return referenceDataGuid1;
    }

    public void setReferenceDataGuid1(String referenceDataGuid1) {
        this.referenceDataGuid1 = referenceDataGuid1;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetReferenceInformationResponse that = (GetReferenceInformationResponse) o;
        return Objects.equals(referenceDataString1, that.referenceDataString1) && Objects.equals(referenceDataGuid1, that.referenceDataGuid1) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(referenceDataString1, referenceDataGuid1);
    }

    @Override
    public String toString() {
        return "GetReferenceInformationResponse{" +
                 "referenceDataString1='" + referenceDataString1 + '\'' +
 ", referenceDataGuid1='" + referenceDataGuid1 + '\'' +

                '}';
    }
}