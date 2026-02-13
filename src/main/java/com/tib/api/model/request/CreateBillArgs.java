
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BillEntity;
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


public class CreateBillArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Represents the data required to create a new bill in the TIB Finance system.
 */
    @JsonProperty("BillData")
    private BillEntity billData;

    /**
 * Determines whether the function should return an error if the merchant has not been authorized. This boolean property ensures that unauthorized merchants are not processed further.
 */
    @JsonProperty("BreakIfMerchantNeverBeenAuthorized")
    private boolean breakIfMerchantNeverBeenAuthorized;


    
    public CreateBillArgs() {
    }

    
    public CreateBillArgs(BillEntity billData, boolean breakIfMerchantNeverBeenAuthorized) {
        this.billData = billData;
this.breakIfMerchantNeverBeenAuthorized = breakIfMerchantNeverBeenAuthorized;

    }
    
    
    public CreateBillArgs(String sessionToken, BillEntity billData, boolean breakIfMerchantNeverBeenAuthorized) {
        super(sessionToken);
        this.billData = billData;
this.breakIfMerchantNeverBeenAuthorized = breakIfMerchantNeverBeenAuthorized;

    }

    
    public BillEntity getBillData() {
        return billData;
    }

    public void setBillData(BillEntity billData) {
        this.billData = billData;
    }

    public boolean getBreakIfMerchantNeverBeenAuthorized() {
        return breakIfMerchantNeverBeenAuthorized;
    }

    public void setBreakIfMerchantNeverBeenAuthorized(boolean breakIfMerchantNeverBeenAuthorized) {
        this.breakIfMerchantNeverBeenAuthorized = breakIfMerchantNeverBeenAuthorized;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateBillArgs that = (CreateBillArgs) o;
        return Objects.equals(billData, that.billData) && Objects.equals(breakIfMerchantNeverBeenAuthorized, that.breakIfMerchantNeverBeenAuthorized) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(billData, breakIfMerchantNeverBeenAuthorized);
    }

    @Override
    public String toString() {
        return "CreateBillArgs{" +
                 "billData='" + billData + '\'' +
 ", breakIfMerchantNeverBeenAuthorized='" + breakIfMerchantNeverBeenAuthorized + '\'' +

                '}';
    }
}