
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


public class ListTransfersForBillFastArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Retrieves or assigns the unique identifier for a bill.
     */
    @JsonProperty("BillId")
    private String billId;


    
    public ListTransfersForBillFastArgs() {
    }

    
    public ListTransfersForBillFastArgs(String merchantId, String billId) {
        this.merchantId = merchantId;
        this.billId = billId;
    }
    
    
    public ListTransfersForBillFastArgs(String sessionToken, String merchantId, String billId) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.billId = billId;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListTransfersForBillFastArgs that = (ListTransfersForBillFastArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(billId, that.billId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, billId);
    }

    @Override
    public String toString() {
        return "ListTransfersForBillFastArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", billId='" + billId + '\'' +

                '}';
    }
}