
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.DasPaymentCanada;
import com.tib.api.model.DasPaymentQuebec;
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


public class ListDasPaymentsResponse extends CustomAPIResponse {

    
    @JsonProperty("CanadaDasPayments")
    private List<DasPaymentCanada> canadaDasPayments;

    @JsonProperty("QuebecDasPayments")
    private List<DasPaymentQuebec> quebecDasPayments;


    public ListDasPaymentsResponse(Error[] errors, boolean hasError, String messages, List<DasPaymentCanada> canadaDasPayments, List<DasPaymentQuebec> quebecDasPayments) {
        super(errors, hasError, messages);
        this.canadaDasPayments = canadaDasPayments;
this.quebecDasPayments = quebecDasPayments;

    }

    public ListDasPaymentsResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.canadaDasPayments = (List<DasPaymentCanada>) apiResponse.getResponse();
this.quebecDasPayments = (List<DasPaymentQuebec>) apiResponse.getResponse();

        }
    }

    
    public List<DasPaymentCanada> getCanadaDasPayments() {
        return canadaDasPayments;
    }

    public void setCanadaDasPayments(List<DasPaymentCanada> canadaDasPayments) {
        this.canadaDasPayments = canadaDasPayments;
    }

    public List<DasPaymentQuebec> getQuebecDasPayments() {
        return quebecDasPayments;
    }

    public void setQuebecDasPayments(List<DasPaymentQuebec> quebecDasPayments) {
        this.quebecDasPayments = quebecDasPayments;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListDasPaymentsResponse that = (ListDasPaymentsResponse) o;
        return Objects.equals(canadaDasPayments, that.canadaDasPayments) && Objects.equals(quebecDasPayments, that.quebecDasPayments) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(canadaDasPayments, quebecDasPayments);
    }

    @Override
    public String toString() {
        return "ListDasPaymentsResponse{" +
                 "canadaDasPayments='" + canadaDasPayments + '\'' +
 ", quebecDasPayments='" + quebecDasPayments + '\'' +

                '}';
    }
}