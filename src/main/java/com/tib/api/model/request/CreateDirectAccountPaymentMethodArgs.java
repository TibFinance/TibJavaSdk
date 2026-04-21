
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Account;
import com.tib.api.model.enums.Language;
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


public class CreateDirectAccountPaymentMethodArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Unique identifier of the customer owning the recurring transfers
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * Indicates whether this payment method is configured as the customer's automatic payment method.
     */
    @JsonProperty("IsCustomerAutomaticPaymentMethod")
    private boolean isCustomerAutomaticPaymentMethod;

    /**
     * The target bank account for the direct payment.
     */
    @JsonProperty("Account")
    private Account account;

    /**
     * Specifies the language used for the payment request and related communications
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