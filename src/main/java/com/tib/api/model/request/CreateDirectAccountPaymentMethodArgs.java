
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Account;
import com.tib.api.model.enums.Language;
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


public class CreateDirectAccountPaymentMethodArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Serves as a unique identifier for each customer within the system.
 */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
 * Determines if the customer's payment method is set as the default for automatic transactions.
 */
    @JsonProperty("IsCustomerAutomaticPaymentMethod")
    private boolean isCustomerAutomaticPaymentMethod;

    /**
 * Contains the necessary details for replacing a merchant's account information within the system.
 */
    @JsonProperty("Account")
    private Account account;

    /**
 * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
 */
    @JsonProperty("Language")
    private Language language;


    
    public CreateDirectAccountPaymentMethodArgs() {
    }

    
    public CreateDirectAccountPaymentMethodArgs(String customerId, boolean isCustomerAutomaticPaymentMethod, Account account, Language language) {
        this.customerId = customerId;
this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
this.account = account;
this.language = language;

    }
    
    
    public CreateDirectAccountPaymentMethodArgs(String sessionToken, String customerId, boolean isCustomerAutomaticPaymentMethod, Account account, Language language) {
        super(sessionToken);
        this.customerId = customerId;
this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
this.account = account;
this.language = language;

    }

    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public boolean getIsCustomerAutomaticPaymentMethod() {
        return isCustomerAutomaticPaymentMethod;
    }

    public void setIsCustomerAutomaticPaymentMethod(boolean isCustomerAutomaticPaymentMethod) {
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateDirectAccountPaymentMethodArgs that = (CreateDirectAccountPaymentMethodArgs) o;
        return Objects.equals(customerId, that.customerId) && Objects.equals(isCustomerAutomaticPaymentMethod, that.isCustomerAutomaticPaymentMethod) && Objects.equals(account, that.account) && Objects.equals(language, that.language) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerId, isCustomerAutomaticPaymentMethod, account, language);
    }

    @Override
    public String toString() {
        return "CreateDirectAccountPaymentMethodArgs{" +
                 "customerId='" + customerId + '\'' +
 ", isCustomerAutomaticPaymentMethod='" + isCustomerAutomaticPaymentMethod + '\'' +
 ", account='" + account + '\'' +
 ", language='" + language + '\'' +

                '}';
    }
}