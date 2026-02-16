
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.BaseLineHeader;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class LineDefIdentification  extends LineBaseWithHeader  {

    
    /**
     * Gets or sets the creation date.
     */
    @JsonProperty("CreationDate")
    private LocalDateTime creationDate;

    /**
     * Gets the bank central.
     */
    @JsonProperty("BankCentral")
    private String bankCentral;

    /**
     * Gets or sets the money code identifier.
     */
    @JsonProperty("MoneyCodeIdentifier")
    private Currency moneyCodeIdentifier;


    
    public LineDefIdentification() {
    }

    
    public LineDefIdentification(LocalDateTime creationDate, String bankCentral, Currency moneyCodeIdentifier) {
        this.creationDate = creationDate;
        this.bankCentral = bankCentral;
        this.moneyCodeIdentifier = moneyCodeIdentifier;
    }
    
    
    public LineDefIdentification(BaseLineHeader header, Integer startPosition, LocalDateTime creationDate, String bankCentral, Currency moneyCodeIdentifier) {
        super(header, startPosition);
        this.creationDate = creationDate;
        this.bankCentral = bankCentral;
        this.moneyCodeIdentifier = moneyCodeIdentifier;
    }

    
    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getBankCentral() {
        return bankCentral;
    }

    public void setBankCentral(String bankCentral) {
        this.bankCentral = bankCentral;
    }

    public Currency getMoneyCodeIdentifier() {
        return moneyCodeIdentifier;
    }

    public void setMoneyCodeIdentifier(Currency moneyCodeIdentifier) {
        this.moneyCodeIdentifier = moneyCodeIdentifier;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineDefIdentification that = (LineDefIdentification) o;
        return Objects.equals(creationDate, that.creationDate) && Objects.equals(bankCentral, that.bankCentral) && Objects.equals(moneyCodeIdentifier, that.moneyCodeIdentifier) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(creationDate, bankCentral, moneyCodeIdentifier);
    }

    @Override
    public String toString() {
        return "LineDefIdentification{" +
                "creationDate='" + creationDate + '\'' +
                ", bankCentral='" + bankCentral + '\'' +
                ", moneyCodeIdentifier='" + moneyCodeIdentifier + '\'' +

                '}';
    }
}