
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.PaymentMethodAddRequest;
import com.tib.api.model.WhiteLabeling;
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


public class GetPaymentMethodRequestResponse extends CustomAPIResponse {

    
    @JsonProperty("PaymentMethodRequestData")
    private PaymentMethodAddRequest paymentMethodRequestData;

    @JsonProperty("WhiteLabeling")
    private WhiteLabeling whiteLabeling;


    public GetPaymentMethodRequestResponse(Error[] errors, boolean hasError, String messages, PaymentMethodAddRequest paymentMethodRequestData, WhiteLabeling whiteLabeling) {
        super(errors, hasError, messages);
        this.paymentMethodRequestData = paymentMethodRequestData;
this.whiteLabeling = whiteLabeling;

    }

    public GetPaymentMethodRequestResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.paymentMethodRequestData = objectMapper.readValue(json, PaymentMethodAddRequest.class);
this.whiteLabeling = objectMapper.readValue(json, WhiteLabeling.class);

        }
    }

    
    public PaymentMethodAddRequest getPaymentMethodRequestData() {
        return paymentMethodRequestData;
    }

    public void setPaymentMethodRequestData(PaymentMethodAddRequest paymentMethodRequestData) {
        this.paymentMethodRequestData = paymentMethodRequestData;
    }

    public WhiteLabeling getWhiteLabeling() {
        return whiteLabeling;
    }

    public void setWhiteLabeling(WhiteLabeling whiteLabeling) {
        this.whiteLabeling = whiteLabeling;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetPaymentMethodRequestResponse that = (GetPaymentMethodRequestResponse) o;
        return Objects.equals(paymentMethodRequestData, that.paymentMethodRequestData) && Objects.equals(whiteLabeling, that.whiteLabeling) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentMethodRequestData, whiteLabeling);
    }

    @Override
    public String toString() {
        return "GetPaymentMethodRequestResponse{" +
                 "paymentMethodRequestData='" + paymentMethodRequestData + '\'' +
 ", whiteLabeling='" + whiteLabeling + '\'' +

                '}';
    }
}