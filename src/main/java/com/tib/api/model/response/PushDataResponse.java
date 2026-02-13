
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


public class PushDataResponse extends CustomAPIResponse {

    
    @JsonProperty("DataId")
    private String dataId;


    public PushDataResponse(Error[] errors, boolean hasError, String messages, String dataId) {
        super(errors, hasError, messages);
        this.dataId = dataId;

    }

    public PushDataResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.dataId = apiResponse.getResponse().toString();

        }
    }

    
    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PushDataResponse that = (PushDataResponse) o;
        return Objects.equals(dataId, that.dataId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(dataId);
    }

    @Override
    public String toString() {
        return "PushDataResponse{" +
                 "dataId='" + dataId + '\'' +

                '}';
    }
}