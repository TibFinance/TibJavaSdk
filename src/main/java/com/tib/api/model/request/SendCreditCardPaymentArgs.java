
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.CreditCard;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SendCreditCardPaymentArgs  implements IBaseCryptedServiceArgs  {

    
    /**
     * Retrieves or assigns the unique identifier for a payment.
     */
    @JsonProperty("PaymentId")
    private String paymentId;

    /**
     * Manages all operations associated with credit card data.
     */
    @JsonProperty("CreditCard")
    private CreditCard creditCard;

    /**
     * Specifies the amount to be paid. The value must not exceed the sum of the associated bill amount and any previously recorded payments. If null, the system applies the remaining unpaid portion of the bill.
     */
    @JsonProperty("PaymentAmount")
    private Double paymentAmount;


    
    public SendCreditCardPaymentArgs() {
    }

    
    public SendCreditCardPaymentArgs(String paymentId, CreditCard creditCard, Double paymentAmount) {
        this.paymentId = paymentId;
        this.creditCard = creditCard;
        this.paymentAmount = paymentAmount;
    }
    
    

    
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SendCreditCardPaymentArgs that = (SendCreditCardPaymentArgs) o;
        return Objects.equals(paymentId, that.paymentId) && Objects.equals(creditCard, that.creditCard) && Objects.equals(paymentAmount, that.paymentAmount) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(paymentId, creditCard, paymentAmount);
    }

    @Override
    public String toString() {
        return "SendCreditCardPaymentArgs{" +
                "paymentId='" + paymentId + '\'' +
                ", creditCard='" + creditCard + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +

                '}';
    }
}