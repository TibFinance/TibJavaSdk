
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.Provider;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SetMerchantProviderArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Null means "service's default"
     */
    @JsonProperty("FavoriteProvider")
    private Provider favoriteProvider;


    
    public SetMerchantProviderArgs() {
    }

    
    public SetMerchantProviderArgs(String merchantId, Provider favoriteProvider) {
        this.merchantId = merchantId;
        this.favoriteProvider = favoriteProvider;
    }
    
    
    public SetMerchantProviderArgs(String adminSessionToken, String merchantId, Provider favoriteProvider) {
        super(adminSessionToken);
        this.merchantId = merchantId;
        this.favoriteProvider = favoriteProvider;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public Provider getFavoriteProvider() {
        return favoriteProvider;
    }

    public void setFavoriteProvider(Provider favoriteProvider) {
        this.favoriteProvider = favoriteProvider;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetMerchantProviderArgs that = (SetMerchantProviderArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(favoriteProvider, that.favoriteProvider) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, favoriteProvider);
    }

    @Override
    public String toString() {
        return "SetMerchantProviderArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", favoriteProvider='" + favoriteProvider + '\'' +

                '}';
    }
}