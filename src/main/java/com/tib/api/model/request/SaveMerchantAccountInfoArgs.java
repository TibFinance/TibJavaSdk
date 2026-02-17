
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

    /**
     * The 6-digit TOTP code from the user's authenticator app. Set to null on first call. If response indicates CodeRequired, prompt user and retry with code.
     */
    @JsonProperty("TwoFactorCode")
    private String twoFactorCode;

    /**
     * The bank account number provided by the user for security verification before 2FA setup. Required when TwoFactorStatus is SecurityVerificationRequired. Format: "BankNumber-Transit-AccountNumber" (e.g., "123-12345-123456789").
     */
    @JsonProperty("TwoFactorSecurityAnswer")
    private String twoFactorSecurityAnswer;


    
    public SaveMerchantAccountInfoArgs() {
    }

    
    public SaveMerchantAccountInfoArgs(String merchantId, Account account, String twoFactorCode, String twoFactorSecurityAnswer) {
        this.merchantId = merchantId;
        this.account = account;
        this.twoFactorCode = twoFactorCode;
        this.twoFactorSecurityAnswer = twoFactorSecurityAnswer;
    }
    
    
    public SaveMerchantAccountInfoArgs(String sessionToken, String merchantId, Account account, String twoFactorCode, String twoFactorSecurityAnswer) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.account = account;
        this.twoFactorCode = twoFactorCode;
        this.twoFactorSecurityAnswer = twoFactorSecurityAnswer;
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

    public String getTwoFactorCode() {
        return twoFactorCode;
    }

    public void setTwoFactorCode(String twoFactorCode) {
        this.twoFactorCode = twoFactorCode;
    }

    public String getTwoFactorSecurityAnswer() {
        return twoFactorSecurityAnswer;
    }

    public void setTwoFactorSecurityAnswer(String twoFactorSecurityAnswer) {
        this.twoFactorSecurityAnswer = twoFactorSecurityAnswer;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveMerchantAccountInfoArgs that = (SaveMerchantAccountInfoArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(account, that.account) && Objects.equals(twoFactorCode, that.twoFactorCode) && Objects.equals(twoFactorSecurityAnswer, that.twoFactorSecurityAnswer) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, account, twoFactorCode, twoFactorSecurityAnswer);
    }

    @Override
    public String toString() {
        return "SaveMerchantAccountInfoArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", account='" + account + '\'' +
                ", twoFactorCode='" + twoFactorCode + '\'' +
                ", twoFactorSecurityAnswer='" + twoFactorSecurityAnswer + '\'' +

                '}';
    }
}