
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.CreditCard;
import com.tib.api.model.request.BaseProcessDropInArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ProcessDropInCreditCardArgs  extends BaseProcessDropInArgs  {

    
    /**
 * Manages all operations associated with credit card data.
 */
    @JsonProperty("CreditCard")
    private CreditCard creditCard;


    
    public ProcessDropInCreditCardArgs() {
    }

    
    public ProcessDropInCreditCardArgs(CreditCard creditCard) {
        this.creditCard = creditCard;

    }
    
    
    public ProcessDropInCreditCardArgs(boolean isPPAAuthorized, CreditCard creditCard) {
        super(isPPAAuthorized);
        this.creditCard = creditCard;

    }

    
    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessDropInCreditCardArgs that = (ProcessDropInCreditCardArgs) o;
        return Objects.equals(creditCard, that.creditCard) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(creditCard);
    }

    @Override
    public String toString() {
        return "ProcessDropInCreditCardArgs{" +
                 "creditCard='" + creditCard + '\'' +

                '}';
    }
}