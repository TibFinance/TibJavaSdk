
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Provider;
import com.tib.api.model.AccountOperationLine;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ProviderAccountOperations   {

    
    /**
 * Gets or sets the type of the provider.
 */
    @JsonProperty("ProviderType")
    private Provider providerType;

    /**
 * Gets or sets the account operations.
 */
    @JsonProperty("AccountOperations")
    private List<AccountOperationLine> accountOperations;


    
    public ProviderAccountOperations() {
    }

    
    public ProviderAccountOperations(Provider providerType, List<AccountOperationLine> accountOperations) {
        this.providerType = providerType;
this.accountOperations = accountOperations;

    }
    
    

    
    public Provider getProviderType() {
        return providerType;
    }

    public void setProviderType(Provider providerType) {
        this.providerType = providerType;
    }

    public List<AccountOperationLine> getAccountOperations() {
        return accountOperations;
    }

    public void setAccountOperations(List<AccountOperationLine> accountOperations) {
        this.accountOperations = accountOperations;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProviderAccountOperations that = (ProviderAccountOperations) o;
        return Objects.equals(providerType, that.providerType) && Objects.equals(accountOperations, that.accountOperations) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerType, accountOperations);
    }

    @Override
    public String toString() {
        return "ProviderAccountOperations{" +
                 "providerType='" + providerType + '\'' +
 ", accountOperations='" + accountOperations + '\'' +

                '}';
    }
}