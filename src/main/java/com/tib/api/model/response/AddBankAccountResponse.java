
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
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


public class AddBankAccountResponse extends CustomAPIResponse {

    
    @JsonProperty("NewMerchantId")
    private String newMerchantId;


    public AddBankAccountResponse() {
    }

    public AddBankAccountResponse(Error[] errors, boolean hasError, String messages, String newMerchantId) {
        super(errors, hasError, messages);
        this.newMerchantId = newMerchantId;
    }

    public AddBankAccountResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.newMerchantId = apiResponse.getResponse().toString();
        }
    }

    
    public String getNewMerchantId() {
        return newMerchantId;
    }

    public void setNewMerchantId(String newMerchantId) {
        this.newMerchantId = newMerchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddBankAccountResponse that = (AddBankAccountResponse) o;
        return Objects.equals(newMerchantId, that.newMerchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(newMerchantId);
    }

    @Override
    public String toString() {
        return "AddBankAccountResponse{" +
                "newMerchantId='" + newMerchantId + '\'' +

                '}';
    }
}