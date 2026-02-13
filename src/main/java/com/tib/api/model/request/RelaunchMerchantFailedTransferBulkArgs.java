
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class RelaunchMerchantFailedTransferBulkArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("TransferIds")
    private List<String> transferIds;

    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public RelaunchMerchantFailedTransferBulkArgs() {
    }

    
    public RelaunchMerchantFailedTransferBulkArgs(List<String> transferIds, String merchantId) {
        this.transferIds = transferIds;
this.merchantId = merchantId;

    }
    
    
    public RelaunchMerchantFailedTransferBulkArgs(String adminSessionToken, List<String> transferIds, String merchantId) {
        super(adminSessionToken);
        this.transferIds = transferIds;
this.merchantId = merchantId;

    }

    
    public List<String> getTransferIds() {
        return transferIds;
    }

    public void setTransferIds(List<String> transferIds) {
        this.transferIds = transferIds;
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
        RelaunchMerchantFailedTransferBulkArgs that = (RelaunchMerchantFailedTransferBulkArgs) o;
        return Objects.equals(transferIds, that.transferIds) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transferIds, merchantId);
    }

    @Override
    public String toString() {
        return "RelaunchMerchantFailedTransferBulkArgs{" +
                 "transferIds='" + transferIds + '\'' +
 ", merchantId='" + merchantId + '\'' +

                '}';
    }
}