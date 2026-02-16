
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Account;
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


public class SaveMerchantAccountInfoArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Contains the necessary details for replacing a merchant's account information within the system.
     */
    @JsonProperty("Account")
    private Account account;


    
    public SaveMerchantAccountInfoArgs() {
    }

    
    public SaveMerchantAccountInfoArgs(String merchantId, Account account) {
        this.merchantId = merchantId;
        this.account = account;
    }
    
    
    public SaveMerchantAccountInfoArgs(String sessionToken, String merchantId, Account account) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.account = account;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
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
        SaveMerchantAccountInfoArgs that = (SaveMerchantAccountInfoArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(account, that.account) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, account);
    }

    @Override
    public String toString() {
        return "SaveMerchantAccountInfoArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", account='" + account + '\'' +

                '}';
    }
}