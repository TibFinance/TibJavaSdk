
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


public class GatherGatewayContextResponse extends CustomAPIResponse {

    
    @JsonProperty("PaymentId")
    private String paymentId;

    @JsonProperty("BillAmount")
    private Double billAmount;


    public GatherGatewayContextResponse(Error[] errors, boolean hasError, String messages, String paymentId, Double billAmount) {
        super(errors, hasError, messages);
        this.paymentId = paymentId;
this.billAmount = billAmount;

    }

    public GatherGatewayContextResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.paymentId = apiResponse.getResponse().toString();
this.billAmount = Double.parseDouble(apiResponse.getResponse().toString());

        }
    }

    
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Double billAmount) {
        this.billAmount = billAmount;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GatherGatewayContextResponse that = (GatherGatewayContextResponse) o;
        return Objects.equals(paymentId, that.paymentId) && Objects.equals(billAmount, that.billAmount) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentId, billAmount);
    }

    @Override
    public String toString() {
        return "GatherGatewayContextResponse{" +
                 "paymentId='" + paymentId + '\'' +
 ", billAmount='" + billAmount + '\'' +

                '}';
    }
}