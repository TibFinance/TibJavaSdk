
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


public class GetConvenientFeeSettingsByMerchantArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public GetConvenientFeeSettingsByMerchantArgs() {
    }

    
    public GetConvenientFeeSettingsByMerchantArgs(String merchantId) {
        this.merchantId = merchantId;
    }
    
    
    public GetConvenientFeeSettingsByMerchantArgs(String sessionToken, String merchantId) {
        super(sessionToken);
        this.merchantId = merchantId;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetConvenientFeeSettingsByMerchantArgs that = (GetConvenientFeeSettingsByMerchantArgs) o;
        return Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId);
    }

    @Override
    public String toString() {
        return "GetConvenientFeeSettingsByMerchantArgs{" +
                "merchantId='" + merchantId + '\'' +

                '}';
    }
}