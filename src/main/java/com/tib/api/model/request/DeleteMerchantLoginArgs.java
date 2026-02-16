
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


public class DeleteMerchantLoginArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Retrieves or assigns the identifier for user login relations.
     */
    @JsonProperty("LoginsUserRelationsId")
    private String loginsUserRelationsId;


    
    public DeleteMerchantLoginArgs() {
    }

    
    public DeleteMerchantLoginArgs(String merchantId, String loginsUserRelationsId) {
        this.merchantId = merchantId;
        this.loginsUserRelationsId = loginsUserRelationsId;
    }
    
    
    public DeleteMerchantLoginArgs(String sessionToken, String merchantId, String loginsUserRelationsId) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.loginsUserRelationsId = loginsUserRelationsId;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getLoginsUserRelationsId() {
        return loginsUserRelationsId;
    }

    public void setLoginsUserRelationsId(String loginsUserRelationsId) {
        this.loginsUserRelationsId = loginsUserRelationsId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteMerchantLoginArgs that = (DeleteMerchantLoginArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(loginsUserRelationsId, that.loginsUserRelationsId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, loginsUserRelationsId);
    }

    @Override
    public String toString() {
        return "DeleteMerchantLoginArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", loginsUserRelationsId='" + loginsUserRelationsId + '\'' +

                '}';
    }
}