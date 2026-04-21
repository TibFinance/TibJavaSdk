
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

    /**
     * The date and time when the payment method expires.
     */
    @JsonProperty("ExpirationDate")
    private OffsetDateTime expirationDate;

    /**
     * The credit card number string provided in a standardized format for payment method creation.
     */
    @JsonProperty("FormatedCreditCardString")
    private String formatedCreditCardString;

    /**
     * A formatted string that previews the direct account payment method details before creation.
     */
    @JsonProperty("PreviewString")
    private String previewString;


    
    public CreditCard() {
    }

    
    public CreditCard(String creditCardDescription, Long pan, String cVD, Integer expirationMonth, Integer expirationYear, String cardOwner, Address creditCardRegisteredAddress, OffsetDateTime expirationDate, String formatedCreditCardString, String previewString) {
        this.creditCardDescription = creditCardDescription;
        this.pan = pan;
        this.cVD = cVD;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.cardOwner = cardOwner;
        this.creditCardRegisteredAddress = creditCardRegisteredAddress;
        this.expirationDate = expirationDate;
        this.formatedCreditCardString = formatedCreditCardString;
        this.previewString = previewString;
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

    public OffsetDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(OffsetDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getFormatedCreditCardString() {
        return formatedCreditCardString;
    }

    public void setFormatedCreditCardString(String formatedCreditCardString) {
        this.formatedCreditCardString = formatedCreditCardString;
    }

    public String getPreviewString() {
        return previewString;
    }

    public void setPreviewString(String previewString) {
        this.previewString = previewString;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return Objects.equals(creditCardDescription, that.creditCardDescription) && Objects.equals(pan, that.pan) && Objects.equals(cVD, that.cVD) && Objects.equals(expirationMonth, that.expirationMonth) && Objects.equals(expirationYear, that.expirationYear) && Objects.equals(cardOwner, that.cardOwner) && Objects.equals(creditCardRegisteredAddress, that.creditCardRegisteredAddress) && Objects.equals(expirationDate, that.expirationDate) && Objects.equals(formatedCreditCardString, that.formatedCreditCardString) && Objects.equals(previewString, that.previewString) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(creditCardDescription, pan, cVD, expirationMonth, expirationYear, cardOwner, creditCardRegisteredAddress, expirationDate, formatedCreditCardString, previewString);
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
                ", expirationDate='" + expirationDate + '\'' +
                ", formatedCreditCardString='" + formatedCreditCardString + '\'' +
                ", previewString='" + previewString + '\'' +

                '}';
    }
}