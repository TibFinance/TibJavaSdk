
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Language;
import com.tib.api.model.enums.Currency;
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


public class CreateSubClientArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Retrieves or assigns the name of the sub-client.
 */
    @JsonProperty("Name")
    private String name;

    /**
 * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
 */
    @JsonProperty("Language")
    private Language language;

    /**
 * Retrieves or assigns the currency type used in transactions.
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