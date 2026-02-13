
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


public class GetPaymentMethodFeesResponse extends CustomAPIResponse {

    
    @JsonProperty("GrossTotal")
    private Double grossTotal;

    @JsonProperty("ConvenientFeeAmount")
    private Double convenientFeeAmount;

    @JsonProperty("ProcessingFeeFixedAmount")
    private Double processingFeeFixedAmount;

    @JsonProperty("ProcessingFeeTotal")
    private Double processingFeeTotal;


    public GetPaymentMethodFeesResponse(Error[] errors, boolean hasError, String messages, Double grossTotal, Double convenientFeeAmount, Double processingFeeFixedAmount, Double processingFeeTotal) {
        super(errors, hasError, messages);
        this.grossTotal = grossTotal;
this.convenientFeeAmount = convenientFeeAmount;
this.processingFeeFixedAmount = processingFeeFixedAmount;
this.processingFeeTotal = processingFeeTotal;

    }

    public GetPaymentMethodFeesResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.grossTotal = Double.parseDouble(apiResponse.getResponse().toString());
this.convenientFeeAmount = Double.parseDouble(apiResponse.getResponse().toString());
this.processingFeeFixedAmount = Double.parseDouble(apiResponse.getResponse().toString());
this.processingFeeTotal = Double.parseDouble(apiResponse.getResponse().toString());

        }
    }

    
    public Double getGrossTotal() {
        return grossTotal;
    }

    public void setGrossTotal(Double grossTotal) {
        this.grossTotal = grossTotal;
    }

    public Double getConvenientFeeAmount() {
        return convenientFeeAmount;
    }

    public void setConvenientFeeAmount(Double convenientFeeAmount) {
        this.convenientFeeAmount = convenientFeeAmount;
    }

    public Double getProcessingFeeFixedAmount() {
        return processingFeeFixedAmount;
    }

    public void setProcessingFeeFixedAmount(Double processingFeeFixedAmount) {
        this.processingFeeFixedAmount = processingFeeFixedAmount;
    }

    public Double getProcessingFeeTotal() {
        return processingFeeTotal;
    }

    public void setProcessingFeeTotal(Double processingFeeTotal) {
        this.processingFeeTotal = processingFeeTotal;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetPaymentMethodFeesResponse that = (GetPaymentMethodFeesResponse) o;
        return Objects.equals(grossTotal, that.grossTotal) && Objects.equals(convenientFeeAmount, that.convenientFeeAmount) && Objects.equals(processingFeeFixedAmount, that.processingFeeFixedAmount) && Objects.equals(processingFeeTotal, that.processingFeeTotal) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(grossTotal, convenientFeeAmount, processingFeeFixedAmount, processingFeeTotal);
    }

    @Override
    public String toString() {
        return "GetPaymentMethodFeesResponse{" +
                 "grossTotal='" + grossTotal + '\'' +
 ", convenientFeeAmount='" + convenientFeeAmount + '\'' +
 ", processingFeeFixedAmount='" + processingFeeFixedAmount + '\'' +
 ", processingFeeTotal='" + processingFeeTotal + '\'' +

                '}';
    }
}