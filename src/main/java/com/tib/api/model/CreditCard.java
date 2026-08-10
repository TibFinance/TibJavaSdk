
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Address;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreditCard   {

    
    /**
     * A textual description of the credit card to be used for the payment method.
     */
    @JsonProperty("CreditCardDescription")
    private String creditCardDescription;

    /**
     * The numeric Primary Account Number (PAN) of the credit card.
     */
    @JsonProperty("Pan")
    private Long pan;

    /**
     * Card Verification Data (CVD) code for the credit card
     */
    @JsonProperty("CVD")
    private String cVD;

    /**
     * The two‑digit month (1‑12) in which the credit card expires.
     */
    @JsonProperty("ExpirationMonth")
    private Integer expirationMonth;

    /**
     * The four‑digit year when the credit card expires.
     */
    @JsonProperty("ExpirationYear")
    private Integer expirationYear;

    /**
     * Name of the cardholder as printed on the credit card
     */
    @JsonProperty("CardOwner")
    private String cardOwner;

    /**
     * The billing address associated with the credit card being added.
     */
    @JsonProperty("CreditCardRegisteredAddress")
    private Address creditCardRegisteredAddress;


    
    public CreditCard() {
    }

    
    public CreditCard(String creditCardDescription, Long pan, String cVD, Integer expirationMonth, Integer expirationYear, String cardOwner, Address creditCardRegisteredAddress) {
        this.creditCardDescription = creditCardDescription;
        this.pan = pan;
        this.cVD = cVD;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.cardOwner = cardOwner;
        this.creditCardRegisteredAddress = creditCardRegisteredAddress;
    }
    
    

    
    public String getCreditCardDescription() {
        return creditCardDescription;
    }

    public void setCreditCardDescription(String creditCardDescription) {
        this.creditCardDescription = creditCardDescription;
    }

    public Long getPan() {
        return pan;
    }

    public void setPan(Long pan) {
        this.pan = pan;
    }

    public String getCVD() {
        return cVD;
    }

    public void setCVD(String cVD) {
        this.cVD = cVD;
    }

    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public Integer getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public Address getCreditCardRegisteredAddress() {
        return creditCardRegisteredAddress;
    }

    public void setCreditCardRegisteredAddress(Address creditCardRegisteredAddress) {
        this.creditCardRegisteredAddress = creditCardRegisteredAddress;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return Objects.equals(creditCardDescription, that.creditCardDescription) && Objects.equals(pan, that.pan) && Objects.equals(cVD, that.cVD) && Objects.equals(expirationMonth, that.expirationMonth) && Objects.equals(expirationYear, that.expirationYear) && Objects.equals(cardOwner, that.cardOwner) && Objects.equals(creditCardRegisteredAddress, that.creditCardRegisteredAddress) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(creditCardDescription, pan, cVD, expirationMonth, expirationYear, cardOwner, creditCardRegisteredAddress);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "creditCardDescription='" + creditCardDescription + '\'' +
                ", pan='" + pan + '\'' +
                ", cVD='" + cVD + '\'' +
                ", expirationMonth='" + expirationMonth + '\'' +
                ", expirationYear='" + expirationYear + '\'' +
                ", cardOwner='" + cardOwner + '\'' +
                ", creditCardRegisteredAddress='" + creditCardRegisteredAddress + '\'' +

                '}';
    }
}