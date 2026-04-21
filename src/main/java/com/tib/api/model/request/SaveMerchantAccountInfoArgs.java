
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Account;
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


public class SaveMerchantAccountInfoArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * The target bank account for the direct payment.
     */
    @JsonProperty("Account")
    private Account account;

    /**
     * The one‑time two‑factor authentication code required to authorize the SaveMerchantAccountInfo request.
     */
    @JsonProperty("TwoFactorCode")
    private String twoFactorCode;

    /**
     * The answer to the merchant's configured two‑factor authentication security question.
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