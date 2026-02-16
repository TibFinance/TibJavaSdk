
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


public class DeleteMerchantBulkArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("MerchantIds")
    private List<String> merchantIds;


    
    public DeleteMerchantBulkArgs() {
    }

    
    public DeleteMerchantBulkArgs(List<String> merchantIds) {
        this.merchantIds = merchantIds;
    }
    
    
    public DeleteMerchantBulkArgs(String adminSessionToken, List<String> merchantIds) {
        super(adminSessionToken);
        this.merchantIds = merchantIds;
    }

    
    public List<String> getMerchantIds() {
        return merchantIds;
    }

    public void setMerchantIds(List<String> merchantIds) {
        this.merchantIds = merchantIds;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteMerchantBulkArgs that = (DeleteMerchantBulkArgs) o;
        return Objects.equals(merchantIds, that.merchantIds) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantIds);
    }

    @Override
    public String toString() {
        return "DeleteMerchantBulkArgs{" +
                "merchantIds='" + merchantIds + '\'' +

                '}';
    }
}