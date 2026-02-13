
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


public class CreateBillResponse extends CustomAPIResponse {

    
    @JsonProperty("BillId")
    private String billId;


    public CreateBillResponse(Error[] errors, boolean hasError, String messages, String billId) {
        super(errors, hasError, messages);
        this.billId = billId;

    }

    public CreateBillResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.billId = apiResponse.getResponse().toString();

        }
    }

    
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateBillResponse that = (CreateBillResponse) o;
        return Objects.equals(billId, that.billId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(billId);
    }

    @Override
    public String toString() {
        return "CreateBillResponse{" +
                 "billId='" + billId + '\'' +

                '}';
    }
}