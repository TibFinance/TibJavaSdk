
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.Bill;
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


public class ListBillsResponse extends CustomAPIResponse {

    
    @JsonProperty("Bills")
    private List<Bill> bills;


    public ListBillsResponse(Error[] errors, boolean hasError, String messages, List<Bill> bills) {
        super(errors, hasError, messages);
        this.bills = bills;
    }

    public ListBillsResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.bills = (List<Bill>) apiResponse.getResponse();
        }
    }

    
    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListBillsResponse that = (ListBillsResponse) o;
        return Objects.equals(bills, that.bills) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(bills);
    }

    @Override
    public String toString() {
        return "ListBillsResponse{" +
                "bills='" + bills + '\'' +

                '}';
    }
}