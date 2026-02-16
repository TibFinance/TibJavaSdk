
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatePublicTokenArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SetPaymentIdForSpecificPublicTokenArgs  extends BaseAuthenticatePublicTokenArgs  {

    
    /**
     * Acts as a unique identifier for a distinct payment method.
     */
    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;

    /**
     * Indicates if the system must request the customer's consent prior to executing the payment.
     */
    @JsonProperty("AskForCustomerConsent")
    private boolean askForCustomerConsent;


    
    public SetPaymentIdForSpecificPublicTokenArgs() {
    }

    
    public SetPaymentIdForSpecificPublicTokenArgs(String paymentMethodId, boolean askForCustomerConsent) {
        this.paymentMethodId = paymentMethodId;
        this.askForCustomerConsent = askForCustomerConsent;
    }
    
    
    public SetPaymentIdForSpecificPublicTokenArgs(String publicTokenId, String paymentMethodId, boolean askForCustomerConsent) {
        super(publicTokenId);
        this.paymentMethodId = paymentMethodId;
        this.askForCustomerConsent = askForCustomerConsent;
    }

    
    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public boolean getAskForCustomerConsent() {
        return askForCustomerConsent;
    }

    public void setAskForCustomerConsent(boolean askForCustomerConsent) {
        this.askForCustomerConsent = askForCustomerConsent;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetPaymentIdForSpecificPublicTokenArgs that = (SetPaymentIdForSpecificPublicTokenArgs) o;
        return Objects.equals(paymentMethodId, that.paymentMethodId) && Objects.equals(askForCustomerConsent, that.askForCustomerConsent) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentMethodId, askForCustomerConsent);
    }

    @Override
    public String toString() {
        return "SetPaymentIdForSpecificPublicTokenArgs{" +
                "paymentMethodId='" + paymentMethodId + '\'' +
                ", askForCustomerConsent='" + askForCustomerConsent + '\'' +

                '}';
    }
}