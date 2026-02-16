
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.PaymentMethodAddRequest;
import com.tib.api.model.MerchantView;
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


public class GetExternalSupplierFinancialInformationsRequestResponse extends CustomAPIResponse {

    
    @JsonProperty("PaymentMethodRequestData")
    private PaymentMethodAddRequest paymentMethodRequestData;

    @JsonProperty("MerchantInfo")
    private MerchantView merchantInfo;


    public GetExternalSupplierFinancialInformationsRequestResponse(Error[] errors, boolean hasError, String messages, PaymentMethodAddRequest paymentMethodRequestData, MerchantView merchantInfo) {
        super(errors, hasError, messages);
        this.paymentMethodRequestData = paymentMethodRequestData;
        this.merchantInfo = merchantInfo;
    }

    public GetExternalSupplierFinancialInformationsRequestResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.paymentMethodRequestData = objectMapper.readValue(json, PaymentMethodAddRequest.class);
            this.merchantInfo = objectMapper.readValue(json, MerchantView.class);
        }
    }

    
    public PaymentMethodAddRequest getPaymentMethodRequestData() {
        return paymentMethodRequestData;
    }

    public void setPaymentMethodRequestData(PaymentMethodAddRequest paymentMethodRequestData) {
        this.paymentMethodRequestData = paymentMethodRequestData;
    }

    public MerchantView getMerchantInfo() {
        return merchantInfo;
    }

    public void setMerchantInfo(MerchantView merchantInfo) {
        this.merchantInfo = merchantInfo;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetExternalSupplierFinancialInformationsRequestResponse that = (GetExternalSupplierFinancialInformationsRequestResponse) o;
        return Objects.equals(paymentMethodRequestData, that.paymentMethodRequestData) && Objects.equals(merchantInfo, that.merchantInfo) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentMethodRequestData, merchantInfo);
    }

    @Override
    public String toString() {
        return "GetExternalSupplierFinancialInformationsRequestResponse{" +
                "paymentMethodRequestData='" + paymentMethodRequestData + '\'' +
                ", merchantInfo='" + merchantInfo + '\'' +

                '}';
    }
}