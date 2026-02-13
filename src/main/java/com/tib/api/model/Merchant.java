
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Account;
import com.tib.api.model.enums.Currency;
import com.tib.api.model.enums.Language;
import com.tib.api.model.Address;
import com.tib.api.model.enums.Provider;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class Merchant  extends MerchantBasicInfo  {

    
    /**
 * Contains the necessary details for replacing a merchant's account information within the system.
 */
    @JsonProperty("Account")
    private Account account;


    
    public Merchant() {
    }

    
    public Merchant(Account account) {
        this.account = account;

    }
    
    
    public Merchant(String merchantName, String externalSystemId, String externalSystemGroupId, Currency merchantCurrency, Language language, String email, String emailCopyTo, String phoneNumber, String merchantDescription, Address address, Provider favoriteProvider, Account account) {
        super(merchantName, externalSystemId, externalSystemGroupId, merchantCurrency, language, email, emailCopyTo, phoneNumber, merchantDescription, address, favoriteProvider);
        this.account = account;

    }

    
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Merchant that = (Merchant) o;
        return Objects.equals(account, that.account) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(account);
    }

    @Override
    public String toString() {
        return "Merchant{" +
                 "account='" + account + '\'' +

                '}';
    }
}