
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


public class GetTransactionsByProviderTransactionGroupIdArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * Gets or sets the provider transaction group identifier.
 */
    @JsonProperty("ProviderTransactionGroupId")
    private String providerTransactionGroupId;


    
    public GetTransactionsByProviderTransactionGroupIdArgs() {
    }

    
    public GetTransactionsByProviderTransactionGroupIdArgs(String providerTransactionGroupId) {
        this.providerTransactionGroupId = providerTransactionGroupId;

    }
    
    
    public GetTransactionsByProviderTransactionGroupIdArgs(String adminSessionToken, String providerTransactionGroupId) {
        super(adminSessionToken);
        this.providerTransactionGroupId = providerTransactionGroupId;

    }

    
    public String getProviderTransactionGroupId() {
        return providerTransactionGroupId;
    }

    public void setProviderTransactionGroupId(String providerTransactionGroupId) {
        this.providerTransactionGroupId = providerTransactionGroupId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTransactionsByProviderTransactionGroupIdArgs that = (GetTransactionsByProviderTransactionGroupIdArgs) o;
        return Objects.equals(providerTransactionGroupId, that.providerTransactionGroupId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerTransactionGroupId);
    }

    @Override
    public String toString() {
        return "GetTransactionsByProviderTransactionGroupIdArgs{" +
                 "providerTransactionGroupId='" + providerTransactionGroupId + '\'' +

                '}';
    }
}