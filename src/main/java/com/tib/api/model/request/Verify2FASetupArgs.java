
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class Verify2FASetupArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The 6-digit TOTP code from the user's authenticator app. User must enter this after scanning the QR code to confirm setup.
     */
    @JsonProperty("TwoFactorCode")
    private String twoFactorCode;


    
    public Verify2FASetupArgs() {
    }

    
    public Verify2FASetupArgs(String twoFactorCode) {
        this.twoFactorCode = twoFactorCode;
    }
    
    
    public Verify2FASetupArgs(String sessionToken, String twoFactorCode) {
        super(sessionToken);
        this.twoFactorCode = twoFactorCode;
    }

    
    public String getTwoFactorCode() {
        return twoFactorCode;
    }

    public void setTwoFactorCode(String twoFactorCode) {
        this.twoFactorCode = twoFactorCode;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Verify2FASetupArgs that = (Verify2FASetupArgs) o;
        return Objects.equals(twoFactorCode, that.twoFactorCode) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(twoFactorCode);
    }

    @Override
    public String toString() {
        return "Verify2FASetupArgs{" +
                "twoFactorCode='" + twoFactorCode + '\'' +

                '}';
    }
}