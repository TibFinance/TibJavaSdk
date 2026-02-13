
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.PaymentMethod;
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


public class ListPaymentMethodsResponse extends CustomAPIResponse {

    
    @JsonProperty("PaymentMethods")
    private List<PaymentMethod> paymentMethods;


    public ListPaymentMethodsResponse(Error[] errors, boolean hasError, String messages, List<PaymentMethod> paymentMethods) {
        super(errors, hasError, messages);
        this.paymentMethods = paymentMethods;

    }

    public ListPaymentMethodsResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.paymentMethods = (List<PaymentMethod>) apiResponse.getResponse();

        }
    }

    
    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListPaymentMethodsResponse that = (ListPaymentMethodsResponse) o;
        return Objects.equals(paymentMethods, that.paymentMethods) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentMethods);
    }

    @Override
    public String toString() {
        return "ListPaymentMethodsResponse{" +
                 "paymentMethods='" + paymentMethods + '\'' +

                '}';
    }
}