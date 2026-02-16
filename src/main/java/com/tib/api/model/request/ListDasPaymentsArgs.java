
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


public class ListDasPaymentsArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * The idenfication of the DAS provider to list payment for
     */
    @JsonProperty("DasProviderId")
    private String dasProviderId;


    
    public ListDasPaymentsArgs() {
    }

    
    public ListDasPaymentsArgs(String merchantId, String dasProviderId) {
        this.merchantId = merchantId;
        this.dasProviderId = dasProviderId;
    }
    
    
    public ListDasPaymentsArgs(String sessionToken, String merchantId, String dasProviderId) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.dasProviderId = dasProviderId;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getDasProviderId() {
        return dasProviderId;
    }

    public void setDasProviderId(String dasProviderId) {
        this.dasProviderId = dasProviderId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListDasPaymentsArgs that = (ListDasPaymentsArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(dasProviderId, that.dasProviderId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, dasProviderId);
    }

    @Override
    public String toString() {
        return "ListDasPaymentsArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", dasProviderId='" + dasProviderId + '\'' +

                '}';
    }
}