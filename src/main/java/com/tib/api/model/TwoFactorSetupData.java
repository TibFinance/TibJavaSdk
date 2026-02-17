
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TwoFactorSetupData   {

    
    /**
     * Base64-encoded PNG image of the QR code for scanning with authenticator apps.
     */
    @JsonProperty("QrCodeBase64")
    private String qrCodeBase64;

    /**
     * The secret key in Base32 format for manual entry into authenticator apps. Display this if the user cannot scan the QR code.
     */
    @JsonProperty("ManualEntryKey")
    private String manualEntryKey;

    /**
     * Full otpauth: URI for the TOTP entry. Can be used by API clients to generate their own QR code. Format: otpauth:totpTIB Portal:username?secret=BASE32SECRET&issuer=TIB Portal
     */
    @JsonProperty("OtpAuthUri")
    private String otpAuthUri;

    /**
     * The issuer name shown in the authenticator app (e.g., "TIB Portal").
     */
    @JsonProperty("Issuer")
    private String issuer;

    /**
     * Represents the name associated with the merchant's account.
     */
    @JsonProperty("AccountName")
    private String accountName;


    
    public TwoFactorSetupData() {
    }

    
    public TwoFactorSetupData(String qrCodeBase64, String manualEntryKey, String otpAuthUri, String issuer, String accountName) {
        this.qrCodeBase64 = qrCodeBase64;
        this.manualEntryKey = manualEntryKey;
        this.otpAuthUri = otpAuthUri;
        this.issuer = issuer;
        this.accountName = accountName;
    }
    
    

    
    public String getQrCodeBase64() {
        return qrCodeBase64;
    }

    public void setQrCodeBase64(String qrCodeBase64) {
        this.qrCodeBase64 = qrCodeBase64;
    }

    public String getManualEntryKey() {
        return manualEntryKey;
    }

    public void setManualEntryKey(String manualEntryKey) {
        this.manualEntryKey = manualEntryKey;
    }

    public String getOtpAuthUri() {
        return otpAuthUri;
    }

    public void setOtpAuthUri(String otpAuthUri) {
        this.otpAuthUri = otpAuthUri;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TwoFactorSetupData that = (TwoFactorSetupData) o;
        return Objects.equals(qrCodeBase64, that.qrCodeBase64) && Objects.equals(manualEntryKey, that.manualEntryKey) && Objects.equals(otpAuthUri, that.otpAuthUri) && Objects.equals(issuer, that.issuer) && Objects.equals(accountName, that.accountName) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(qrCodeBase64, manualEntryKey, otpAuthUri, issuer, accountName);
    }

    @Override
    public String toString() {
        return "TwoFactorSetupData{" +
                "qrCodeBase64='" + qrCodeBase64 + '\'' +
                ", manualEntryKey='" + manualEntryKey + '\'' +
                ", otpAuthUri='" + otpAuthUri + '\'' +
                ", issuer='" + issuer + '\'' +
                ", accountName='" + accountName + '\'' +

                '}';
    }
}