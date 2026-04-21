
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.MerchantBasicInfo;
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


public class SaveMerchantBasicInfoArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Basic merchant details required for creating or updating a merchant record
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