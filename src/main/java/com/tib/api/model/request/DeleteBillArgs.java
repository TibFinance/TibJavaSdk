
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


public class DeleteBillArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Retrieves or assigns the unique identifier for a bill.
     */
    @JsonProperty("BillId")
    private String billId;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public DeleteBillArgs() {
    }

    
    public DeleteBillArgs(String billId, String merchantId) {
        this.billId = billId;
        this.merchantId = merchantId;
    }
    
    
    public DeleteBillArgs(String sessionToken, String billId, String merchantId) {
        super(sessionToken);
        this.billId = billId;
        this.merchantId = merchantId;
    }

    
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
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
        DeleteBillArgs that = (DeleteBillArgs) o;
        return Objects.equals(billId, that.billId) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(billId, merchantId);
    }

    @Override
    public String toString() {
        return "DeleteBillArgs{" +
                "billId='" + billId + '\'' +
                ", merchantId='" + merchantId + '\'' +

                '}';
    }
}