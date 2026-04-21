
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.Payment;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetSupplierTransferResponse extends CustomAPIResponse {

    
    @JsonProperty("Payment")
    private Payment payment;

    @JsonProperty("CounterpartyName")
    private String counterpartyName;

    @JsonProperty("IsCallerPayer")
    private boolean isCallerPayer;

    @JsonProperty("SupplierAlias")
    private String supplierAlias;


    public GetSupplierTransferResponse() {
    }

    public GetSupplierTransferResponse(Error[] errors, boolean hasError, String messages, Payment payment, String counterpartyName, boolean isCallerPayer, String supplierAlias) {
        super(errors, hasError, messages);
        this.payment = payment;
        this.counterpartyName = counterpartyName;
        this.isCallerPayer = isCallerPayer;
        this.supplierAlias = supplierAlias;
    }

    public GetSupplierTransferResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String __rawBody = apiResponse.getRawBody();
            if (__rawBody != null && !__rawBody.isEmpty()) {
                GetSupplierTransferResponse __typed = objectMapper.readValue(__rawBody, GetSupplierTransferResponse.class);
                this.payment = __typed.payment;
                this.counterpartyName = __typed.counterpartyName;
                this.isCallerPayer = __typed.isCallerPayer;
                this.supplierAlias = __typed.supplierAlias;
            }
        }
    }

    
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getCounterpartyName() {
        return counterpartyName;
    }

    public void setCounterpartyName(String counterpartyName) {
        this.counterpartyName = counterpartyName;
    }

    public boolean getIsCallerPayer() {
        return isCallerPayer;
    }

    public void setIsCallerPayer(boolean isCallerPayer) {
        this.isCallerPayer = isCallerPayer;
    }

    public String getSupplierAlias() {
        return supplierAlias;
    }

    public void setSupplierAlias(String supplierAlias) {
        this.supplierAlias = supplierAlias;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSupplierTransferResponse that = (GetSupplierTransferResponse) o;
        return Objects.equals(payment, that.payment) && Objects.equals(counterpartyName, that.counterpartyName) && Objects.equals(isCallerPayer, that.isCallerPayer) && Objects.equals(supplierAlias, that.supplierAlias) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(payment, counterpartyName, isCallerPayer, supplierAlias);
    }

    @Override
    public String toString() {
        return "GetSupplierTransferResponse{" +
                "payment='" + payment + '\'' +
                ", counterpartyName='" + counterpartyName + '\'' +
                ", isCallerPayer='" + isCallerPayer + '\'' +
                ", supplierAlias='" + supplierAlias + '\'' +

                '}';
    }
}