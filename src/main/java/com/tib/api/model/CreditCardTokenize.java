
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreditCardTokenize   {

    
    /**
 * Gets or sets the card token.
 */
    @JsonProperty("CardToken")
    private String cardToken;

    /**
 * Returns true if ... is valid.
 */
    @JsonProperty("IsValid")
    private boolean isValid;

    /**
 * The ErrorMessage property provides a textual description of any error encountered during the execution of a function or process.
 */
    @JsonProperty("ErrorMessage")
    private String errorMessage;


    
    public CreditCardTokenize() {
    }

    
    public CreditCardTokenize(String cardToken, boolean isValid, String errorMessage) {
        this.cardToken = cardToken;
this.isValid = isValid;
this.errorMessage = errorMessage;

    }
    
    

    
    public String getCardToken() {
        return cardToken;
    }

    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    public boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCardTokenize that = (CreditCardTokenize) o;
        return Objects.equals(cardToken, that.cardToken) && Objects.equals(isValid, that.isValid) && Objects.equals(errorMessage, that.errorMessage) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(cardToken, isValid, errorMessage);
    }

    @Override
    public String toString() {
        return "CreditCardTokenize{" +
                 "cardToken='" + cardToken + '\'' +
 ", isValid='" + isValid + '\'' +
 ", errorMessage='" + errorMessage + '\'' +

                '}';
    }
}