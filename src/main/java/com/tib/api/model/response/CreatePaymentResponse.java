
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.enums.PaymentFlow;
import com.tib.api.model.enums.PaymentFlowParsingResult;
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


public class CreatePaymentResponse extends CustomAPIResponse {

    
    @JsonProperty("PaymentId")
    private String paymentId;

    @JsonProperty("AutoSelectPaymentFlowResult")
    private PaymentFlow autoSelectPaymentFlowResult;

    @JsonProperty("PaymentFlowParsingResult")
    private PaymentFlowParsingResult paymentFlowParsingResult;

    @JsonProperty("PaymentLink")
    private String paymentLink;


    public CreatePaymentResponse(Error[] errors, boolean hasError, String messages, String paymentId, PaymentFlow autoSelectPaymentFlowResult, PaymentFlowParsingResult paymentFlowParsingResult, String paymentLink) {
        super(errors, hasError, messages);
        this.paymentId = paymentId;
this.autoSelectPaymentFlowResult = autoSelectPaymentFlowResult;
this.paymentFlowParsingResult = paymentFlowParsingResult;
this.paymentLink = paymentLink;

    }

    public CreatePaymentResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
this.autoSelectPaymentFlowResult = objectMapper.readValue(json, PaymentFlow.class);
this.paymentFlowParsingResult = objectMapper.readValue(json, PaymentFlowParsingResult.class);

        }
    }

    
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public PaymentFlow getAutoSelectPaymentFlowResult() {
        return autoSelectPaymentFlowResult;
    }

    public void setAutoSelectPaymentFlowResult(PaymentFlow autoSelectPaymentFlowResult) {
        this.autoSelectPaymentFlowResult = autoSelectPaymentFlowResult;
    }

    public PaymentFlowParsingResult getPaymentFlowParsingResult() {
        return paymentFlowParsingResult;
    }

    public void setPaymentFlowParsingResult(PaymentFlowParsingResult paymentFlowParsingResult) {
        this.paymentFlowParsingResult = paymentFlowParsingResult;
    }

    public String getPaymentLink() {
        return paymentLink;
    }

    public void setPaymentLink(String paymentLink) {
        this.paymentLink = paymentLink;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreatePaymentResponse that = (CreatePaymentResponse) o;
        return Objects.equals(paymentId, that.paymentId) && Objects.equals(autoSelectPaymentFlowResult, that.autoSelectPaymentFlowResult) && Objects.equals(paymentFlowParsingResult, that.paymentFlowParsingResult) && Objects.equals(paymentLink, that.paymentLink) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentId, autoSelectPaymentFlowResult, paymentFlowParsingResult, paymentLink);
    }

    @Override
    public String toString() {
        return "CreatePaymentResponse{" +
                 "paymentId='" + paymentId + '\'' +
 ", autoSelectPaymentFlowResult='" + autoSelectPaymentFlowResult + '\'' +
 ", paymentFlowParsingResult='" + paymentFlowParsingResult + '\'' +
 ", paymentLink='" + paymentLink + '\'' +

                '}';
    }
}