
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.MerchantBasicInfo;
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


public class SaveMerchantBasicInfoArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * This property holds the basic information necessary for creating or updating a merchant's account within the TIB Finance API system.
 */
    @JsonProperty("MerchantInfo")
    private MerchantBasicInfo merchantInfo;


    
    public SaveMerchantBasicInfoArgs() {
    }

    
    public SaveMerchantBasicInfoArgs(String merchantId, MerchantBasicInfo merchantInfo) {
        this.merchantId = merchantId;
this.merchantInfo = merchantInfo;

    }
    
    
    public SaveMerchantBasicInfoArgs(String sessionToken, String merchantId, MerchantBasicInfo merchantInfo) {
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

    public MerchantBasicInfo getMerchantInfo() {
        return merchantInfo;
    }

    public void setMerchantInfo(MerchantBasicInfo merchantInfo) {
        this.merchantInfo = merchantInfo;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveMerchantBasicInfoArgs that = (SaveMerchantBasicInfoArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(merchantInfo, that.merchantInfo) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, merchantInfo);
    }

    @Override
    public String toString() {
        return "SaveMerchantBasicInfoArgs{" +
                 "merchantId='" + merchantId + '\'' +
 ", merchantInfo='" + merchantInfo + '\'' +

                '}';
    }
}