
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


public class GetBoardingMerchantStatusEntity   {

    
    /**
 * 
 */
    @JsonProperty("ProviderMerchantId")
    private String providerMerchantId;


    
    public GetBoardingMerchantStatusEntity() {
    }

    
    public GetBoardingMerchantStatusEntity(String providerMerchantId) {
        this.providerMerchantId = providerMerchantId;

    }
    
    

    
    public String getProviderMerchantId() {
        return providerMerchantId;
    }

    public void setProviderMerchantId(String providerMerchantId) {
        this.providerMerchantId = providerMerchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBoardingMerchantStatusEntity that = (GetBoardingMerchantStatusEntity) o;
        return Objects.equals(providerMerchantId, that.providerMerchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerMerchantId);
    }

    @Override
    public String toString() {
        return "GetBoardingMerchantStatusEntity{" +
                 "providerMerchantId='" + providerMerchantId + '\'' +

                '}';
    }
}