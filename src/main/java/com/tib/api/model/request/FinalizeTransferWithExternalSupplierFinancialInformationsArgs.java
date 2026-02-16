
package com.tib.api.model.request;

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


public class FinalizeTransferWithExternalSupplierFinancialInformationsArgs  extends BaseAuthenticatePublicTokenArgs  {

    
    /**
     * 
     */
    @JsonProperty("SupplierAccountAlreadyExists")
    private boolean supplierAccountAlreadyExists;

    /**
     * Contains the necessary details for replacing a merchant's account information within the system.
     */
    @JsonProperty("Account")
    private Account account;

    /**
     * 
     */
    @JsonProperty("CustomerConsent")
    private boolean customerConsent;

    /**
     * 
     */
    @JsonProperty("PreAuthorizationGivenForThisMerchant")
    private boolean preAuthorizationGivenForThisMerchant;

    /**
     * 
     */
    @JsonProperty("PreAuthorizationGivenForAllMerchants")
    private boolean preAuthorizationGivenForAllMerchants;


    
    public FinalizeTransferWithExternalSupplierFinancialInformationsArgs() {
    }

    
    public FinalizeTransferWithExternalSupplierFinancialInformationsArgs(boolean supplierAccountAlreadyExists, Account account, boolean customerConsent, boolean preAuthorizationGivenForThisMerchant, boolean preAuthorizationGivenForAllMerchants) {
        this.supplierAccountAlreadyExists = supplierAccountAlreadyExists;
        this.account = account;
        this.customerConsent = customerConsent;
        this.preAuthorizationGivenForThisMerchant = preAuthorizationGivenForThisMerchant;
        this.preAuthorizationGivenForAllMerchants = preAuthorizationGivenForAllMerchants;
    }
    
    
    public FinalizeTransferWithExternalSupplierFinancialInformationsArgs(String publicTokenId, boolean supplierAccountAlreadyExists, Account account, boolean customerConsent, boolean preAuthorizationGivenForThisMerchant, boolean preAuthorizationGivenForAllMerchants) {
        super(publicTokenId);
        this.supplierAccountAlreadyExists = supplierAccountAlreadyExists;
        this.account = account;
        this.customerConsent = customerConsent;
        this.preAuthorizationGivenForThisMerchant = preAuthorizationGivenForThisMerchant;
        this.preAuthorizationGivenForAllMerchants = preAuthorizationGivenForAllMerchants;
    }

    
    public boolean getSupplierAccountAlreadyExists() {
        return supplierAccountAlreadyExists;
    }

    public void setSupplierAccountAlreadyExists(boolean supplierAccountAlreadyExists) {
        this.supplierAccountAlreadyExists = supplierAccountAlreadyExists;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public boolean getCustomerConsent() {
        return customerConsent;
    }

    public void setCustomerConsent(boolean customerConsent) {
        this.customerConsent = customerConsent;
    }

    public boolean getPreAuthorizationGivenForThisMerchant() {
        return preAuthorizationGivenForThisMerchant;
    }

    public void setPreAuthorizationGivenForThisMerchant(boolean preAuthorizationGivenForThisMerchant) {
        this.preAuthorizationGivenForThisMerchant = preAuthorizationGivenForThisMerchant;
    }

    public boolean getPreAuthorizationGivenForAllMerchants() {
        return preAuthorizationGivenForAllMerchants;
    }

    public void setPreAuthorizationGivenForAllMerchants(boolean preAuthorizationGivenForAllMerchants) {
        this.preAuthorizationGivenForAllMerchants = preAuthorizationGivenForAllMerchants;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinalizeTransferWithExternalSupplierFinancialInformationsArgs that = (FinalizeTransferWithExternalSupplierFinancialInformationsArgs) o;
        return Objects.equals(supplierAccountAlreadyExists, that.supplierAccountAlreadyExists) && Objects.equals(account, that.account) && Objects.equals(customerConsent, that.customerConsent) && Objects.equals(preAuthorizationGivenForThisMerchant, that.preAuthorizationGivenForThisMerchant) && Objects.equals(preAuthorizationGivenForAllMerchants, that.preAuthorizationGivenForAllMerchants) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(supplierAccountAlreadyExists, account, customerConsent, preAuthorizationGivenForThisMerchant, preAuthorizationGivenForAllMerchants);
    }

    @Override
    public String toString() {
        return "FinalizeTransferWithExternalSupplierFinancialInformationsArgs{" +
                "supplierAccountAlreadyExists='" + supplierAccountAlreadyExists + '\'' +
                ", account='" + account + '\'' +
                ", customerConsent='" + customerConsent + '\'' +
                ", preAuthorizationGivenForThisMerchant='" + preAuthorizationGivenForThisMerchant + '\'' +
                ", preAuthorizationGivenForAllMerchants='" + preAuthorizationGivenForAllMerchants + '\'' +

                '}';
    }
}