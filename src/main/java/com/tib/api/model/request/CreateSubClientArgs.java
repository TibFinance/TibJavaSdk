
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateSubClientArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Display name for the new sub-client.
     */
    @JsonProperty("Name")
    private String name;

    /**
     * Specifies the language used for the payment request and related communications
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * The ISO 4217 three‑letter code of the currency in which the transfer was executed.
     */
    @JsonProperty("Currency")
    private Currency currency;


    
    public CreateSubClientArgs() {
    }

    
    public CreateSubClientArgs(String name, Language language, Currency currency) {
        this.name = name;
        this.language = language;
        this.currency = currency;
    }
    
    
    public CreateSubClientArgs(String sessionToken, String name, Language language, Currency currency) {
        super(sessionToken);
        this.name = name;
        this.language = language;
        this.currency = currency;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateSubClientArgs that = (CreateSubClientArgs) o;
        return Objects.equals(name, that.name) && Objects.equals(language, that.language) && Objects.equals(currency, that.currency) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(name, language, currency);
    }

    @Override
    public String toString() {
        return "CreateSubClientArgs{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", currency='" + currency + '\'' +

                '}';
    }
}