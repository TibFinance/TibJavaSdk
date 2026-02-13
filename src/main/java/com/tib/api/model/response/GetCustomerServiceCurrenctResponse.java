
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


public class GetCustomerServiceCurrenctResponse extends CustomAPIResponse {

    
    @JsonProperty("Currency")
    private Integer currency;


    public GetCustomerServiceCurrenctResponse(Error[] errors, boolean hasError, String messages, Integer currency) {
        super(errors, hasError, messages);
        this.currency = currency;

    }

    public GetCustomerServiceCurrenctResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.currency = Integer.parseInt(apiResponse.getResponse().toString());

        }
    }

    
    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCustomerServiceCurrenctResponse that = (GetCustomerServiceCurrenctResponse) o;
        return Objects.equals(currency, that.currency) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(currency);
    }

    @Override
    public String toString() {
        return "GetCustomerServiceCurrenctResponse{" +
                 "currency='" + currency + '\'' +

                '}';
    }
}