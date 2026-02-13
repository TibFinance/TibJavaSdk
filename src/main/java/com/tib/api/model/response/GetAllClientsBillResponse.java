
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.MontlyBillInfo;
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


public class GetAllClientsBillResponse extends CustomAPIResponse {

    
    @JsonProperty("BillsInfo")
    private List<MontlyBillInfo> billsInfo;


    public GetAllClientsBillResponse(Error[] errors, boolean hasError, String messages, List<MontlyBillInfo> billsInfo) {
        super(errors, hasError, messages);
        this.billsInfo = billsInfo;

    }

    public GetAllClientsBillResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.billsInfo = (List<MontlyBillInfo>) apiResponse.getResponse();

        }
    }

    
    public List<MontlyBillInfo> getBillsInfo() {
        return billsInfo;
    }

    public void setBillsInfo(List<MontlyBillInfo> billsInfo) {
        this.billsInfo = billsInfo;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAllClientsBillResponse that = (GetAllClientsBillResponse) o;
        return Objects.equals(billsInfo, that.billsInfo) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(billsInfo);
    }

    @Override
    public String toString() {
        return "GetAllClientsBillResponse{" +
                 "billsInfo='" + billsInfo + '\'' +

                '}';
    }
}