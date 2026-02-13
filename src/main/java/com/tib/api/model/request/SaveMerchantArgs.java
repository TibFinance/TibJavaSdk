
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Merchant;
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


public class SaveMerchantArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * This property holds the basic information necessary for creating or updating a merchant's account within the TIB Finance API system.
 */
    @JsonProperty("MerchantInfo")
    private Merchant merchantInfo;


    
    public SaveMerchantArgs() {
    }

    
    public SaveMerchantArgs(String merchantId, Merchant merchantInfo) {
        this.merchantId = merchantId;
this.merchantInfo = merchantInfo;

    }
    
    
    public SaveMerchantArgs(String sessionToken, String merchantId, Merchant merchantInfo) {
        super(sessionToken);
        this.merchantId = merchantId;
this.merchantInfo = merchantInfo;

    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Merchant getMerchantInfo() {
        return merchantInfo;
    }

    public void setMerchantInfo(Merchant merchantInfo) {
        this.merchantInfo = merchantInfo;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveMerchantArgs that = (SaveMerchantArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(merchantInfo, that.merchantInfo) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, merchantInfo);
    }

    @Override
    public String toString() {
        return "SaveMerchantArgs{" +
                 "merchantId='" + merchantId + '\'' +
 ", merchantInfo='" + merchantInfo + '\'' +

                '}';
    }
}