
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class MarkPaymentResolvedArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * List of payment to mark resolved
     */
    @JsonProperty("ListOfPayment")
    private List<String> listOfPayment;


    
    public MarkPaymentResolvedArgs() {
    }

    
    public MarkPaymentResolvedArgs(List<String> listOfPayment) {
        this.listOfPayment = listOfPayment;
    }
    
    
    public MarkPaymentResolvedArgs(String sessionToken, List<String> listOfPayment) {
        super(sessionToken);
        this.listOfPayment = listOfPayment;
    }

    
    public List<String> getListOfPayment() {
        return listOfPayment;
    }

    public void setListOfPayment(List<String> listOfPayment) {
        this.listOfPayment = listOfPayment;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarkPaymentResolvedArgs that = (MarkPaymentResolvedArgs) o;
        return Objects.equals(listOfPayment, that.listOfPayment) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(listOfPayment);
    }

    @Override
    public String toString() {
        return "MarkPaymentResolvedArgs{" +
                "listOfPayment='" + listOfPayment + '\'' +

                '}';
    }
}