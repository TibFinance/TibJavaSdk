
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class CreateOrUpdateBlueSnapProviderArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * 
     */
    @JsonProperty("BsMerchantId")
    private String bsMerchantId;

    /**
     * 
     */
    @JsonProperty("BsUsername")
    private String bsUsername;

    /**
     * 
     */
    @JsonProperty("BsPassword")
    private String bsPassword;


    
    public CreateOrUpdateBlueSnapProviderArgs() {
    }

    
    public CreateOrUpdateBlueSnapProviderArgs(String merchantId, String bsMerchantId, String bsUsername, String bsPassword) {
        this.merchantId = merchantId;
        this.bsMerchantId = bsMerchantId;
        this.bsUsername = bsUsername;
        this.bsPassword = bsPassword;
    }
    
    
    public CreateOrUpdateBlueSnapProviderArgs(String sessionToken, String merchantId, String bsMerchantId, String bsUsername, String bsPassword) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.bsMerchantId = bsMerchantId;
        this.bsUsername = bsUsername;
        this.bsPassword = bsPassword;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getBsMerchantId() {
        return bsMerchantId;
    }

    public void setBsMerchantId(String bsMerchantId) {
        this.bsMerchantId = bsMerchantId;
    }

    public String getBsUsername() {
        return bsUsername;
    }

    public void setBsUsername(String bsUsername) {
        this.bsUsername = bsUsername;
    }

    public String getBsPassword() {
        return bsPassword;
    }

    public void setBsPassword(String bsPassword) {
        this.bsPassword = bsPassword;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateOrUpdateBlueSnapProviderArgs that = (CreateOrUpdateBlueSnapProviderArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(bsMerchantId, that.bsMerchantId) && Objects.equals(bsUsername, that.bsUsername) && Objects.equals(bsPassword, that.bsPassword) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, bsMerchantId, bsUsername, bsPassword);
    }

    @Override
    public String toString() {
        return "CreateOrUpdateBlueSnapProviderArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", bsMerchantId='" + bsMerchantId + '\'' +
                ", bsUsername='" + bsUsername + '\'' +
                ", bsPassword='" + bsPassword + '\'' +

                '}';
    }
}