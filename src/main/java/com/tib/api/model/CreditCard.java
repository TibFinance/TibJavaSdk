
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Address;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreditCard   {

    
    /**
 * Provides a description to identify the credit card within the TIB Finance API. This description helps in distinguishing between multiple credit card payment methods associated with a customer.
 */
    @JsonProperty("CreditCardDescription")
    private String creditCardDescription;

    /**
 * Represents the primary account number (PAN) of the credit card.
 */
    @JsonProperty("Pan")
    private Long pan;

    /**
 * Represents the card verification code (CVD) used for validating credit card transactions.
 */
    @JsonProperty("CVD")
    private String cVD;

    /**
 * Specifies the expiration month of the credit card.
 */
    @JsonProperty("ExpirationMonth")
    private Integer expirationMonth;

    /**
 * Specifies the expiration year of the credit card. This is a crucial component for validating the card's validity period within the TIB Finance API.
 */
    @JsonProperty("ExpirationYear")
    private Integer expirationYear;

    /**
 * Specifies the name of the card owner.
 */
    @JsonProperty("CardOwner")
    private String cardOwner;

    /**
 * Retrieves or assigns the registered address associated with a credit card. This property is crucial for verifying the billing address linked to the credit card, ensuring secure and accurate transaction processing.
 */
    @JsonProperty("CreditCardRegisteredAddress")
    private Address creditCardRegisteredAddress;

    /**
 * Handles the extraction or assignment of a particular entity's expiration date.
 */
    @JsonProperty("ExpirationDate")
    private LocalDateTime expirationDate;

    /**
 * A well formated string of the credit card number
 */
    @JsonProperty("FormatedCreditCardString")
    private String formatedCreditCardString;

    /**
 * An obfuscated string of the card number
 */
    @JsonProperty("PreviewString")
    private String previewString;


    
    public CreditCard() {
    }

    
    public CreditCard(String creditCardDescription, Long pan, String cVD, Integer expirationMonth, Integer expirationYear, String cardOwner, Address creditCardRegisteredAddress, LocalDateTime expirationDate, String formatedCreditCardString, String previewString) {
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

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
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