
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


public class AddNewDasPaymentResponse extends CustomAPIResponse {

    
    @JsonProperty("DasPaymentId")
    private String dasPaymentId;


    public AddNewDasPaymentResponse(Error[] errors, boolean hasError, String messages, String dasPaymentId) {
        super(errors, hasError, messages);
        this.dasPaymentId = dasPaymentId;

    }

    public AddNewDasPaymentResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.dasPaymentId = apiResponse.getResponse().toString();

        }
    }

    
    public String getDasPaymentId() {
        return dasPaymentId;
    }

    public void setDasPaymentId(String dasPaymentId) {
        this.dasPaymentId = dasPaymentId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddNewDasPaymentResponse that = (AddNewDasPaymentResponse) o;
        return Objects.equals(dasPaymentId, that.dasPaymentId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(dasPaymentId);
    }

    @Override
    public String toString() {
        return "AddNewDasPaymentResponse{" +
                 "dasPaymentId='" + dasPaymentId + '\'' +

                '}';
    }
}