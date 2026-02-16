
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


public class CreateManualRefundForTransferOperationArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Identifies the specific transfer operation that needs to be reverted.
     */
    @JsonProperty("TransferId")
    private String transferId;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public CreateManualRefundForTransferOperationArgs() {
    }

    
    public CreateManualRefundForTransferOperationArgs(String transferId, String merchantId) {
        this.transferId = transferId;
        this.merchantId = merchantId;
    }
    
    
    public CreateManualRefundForTransferOperationArgs(String sessionToken, String transferId, String merchantId) {
        super(sessionToken);
        this.transferId = transferId;
        this.merchantId = merchantId;
    }

    
    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
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
        CreateManualRefundForTransferOperationArgs that = (CreateManualRefundForTransferOperationArgs) o;
        return Objects.equals(transferId, that.transferId) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transferId, merchantId);
    }

    @Override
    public String toString() {
        return "CreateManualRefundForTransferOperationArgs{" +
                "transferId='" + transferId + '\'' +
                ", merchantId='" + merchantId + '\'' +

                '}';
    }
}