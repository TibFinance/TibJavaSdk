
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


public class GetBoardingMerchantStatusBlueSnapEntity  extends GetBoardingMerchantStatusEntity  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public GetBoardingMerchantStatusBlueSnapEntity() {
    }

    
    public GetBoardingMerchantStatusBlueSnapEntity(String merchantId) {
        this.merchantId = merchantId;
    }
    
    
    public GetBoardingMerchantStatusBlueSnapEntity(String providerMerchantId, String merchantId) {
        super(providerMerchantId);
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
        GetBoardingMerchantStatusBlueSnapEntity that = (GetBoardingMerchantStatusBlueSnapEntity) o;
        return Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId);
    }

    @Override
    public String toString() {
        return "GetBoardingMerchantStatusBlueSnapEntity{" +
                "merchantId='" + merchantId + '\'' +

                '}';
    }
}