
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Account;
import com.tib.api.model.request.BaseAuthenticatePublicTokenArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BaseCreateDirectAccountPaymentMethod  extends BaseAuthenticatePublicTokenArgs  {

    
    /**
 * Determines if the customer's payment method is set as the default for automatic transactions.
 */
    @JsonProperty("IsCustomerAutomaticPaymentMethod")
    private boolean isCustomerAutomaticPaymentMethod;

    /**
 * 
 */
    @JsonProperty("Token")
    private String token;

    /**
 * Contains the necessary details for replacing a merchant's account information within the system.
 */
    @JsonProperty("Account")
    private Account account;


    
    public BaseCreateDirectAccountPaymentMethod() {
    }

    
    public BaseCreateDirectAccountPaymentMethod(boolean isCustomerAutomaticPaymentMethod, String token, Account account) {
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
this.token = token;
this.account = account;

    }
    
    
    public BaseCreateDirectAccountPaymentMethod(String publicTokenId, boolean isCustomerAutomaticPaymentMethod, String token, Account account) {
        super(publicTokenId);
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
this.token = token;
this.account = account;

    }

    
    public boolean getIsCustomerAutomaticPaymentMethod() {
        return isCustomerAutomaticPaymentMethod;
    }

    public void setIsCustomerAutomaticPaymentMethod(boolean isCustomerAutomaticPaymentMethod) {
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
        BaseCreateDirectAccountPaymentMethod that = (BaseCreateDirectAccountPaymentMethod) o;
        return Objects.equals(isCustomerAutomaticPaymentMethod, that.isCustomerAutomaticPaymentMethod) && Objects.equals(token, that.token) && Objects.equals(account, that.account) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(isCustomerAutomaticPaymentMethod, token, account);
    }

    @Override
    public String toString() {
        return "BaseCreateDirectAccountPaymentMethod{" +
                 "isCustomerAutomaticPaymentMethod='" + isCustomerAutomaticPaymentMethod + '\'' +
 ", token='" + token + '\'' +
 ", account='" + account + '\'' +

                '}';
    }
}