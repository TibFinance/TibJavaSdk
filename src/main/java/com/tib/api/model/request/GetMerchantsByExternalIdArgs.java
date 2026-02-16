
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


public class GetMerchantsByExternalIdArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Represents the unique identifier for a merchant within an external system. This ID is crucial for integrating and synchronizing merchant data across different platforms.
     */
    @JsonProperty("ExternalSystemId")
    private String externalSystemId;

    /**
     * Represents the external identity associated with a merchant within an external system.
     */
    @JsonProperty("ExternalSystemGroupId")
    private String externalSystemGroupId;


    
    public GetMerchantsByExternalIdArgs() {
    }

    
    public GetMerchantsByExternalIdArgs(String externalSystemId, String externalSystemGroupId) {
        this.externalSystemId = externalSystemId;
        this.externalSystemGroupId = externalSystemGroupId;
    }
    
    
    public GetMerchantsByExternalIdArgs(String sessionToken, String externalSystemId, String externalSystemGroupId) {
        super(sessionToken);
        this.externalSystemId = externalSystemId;
        this.externalSystemGroupId = externalSystemGroupId;
    }

    
    public String getExternalSystemId() {
        return externalSystemId;
    }

    public void setExternalSystemId(String externalSystemId) {
        this.externalSystemId = externalSystemId;
    }

    public String getExternalSystemGroupId() {
        return externalSystemGroupId;
    }

    public void setExternalSystemGroupId(String externalSystemGroupId) {
        this.externalSystemGroupId = externalSystemGroupId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetMerchantsByExternalIdArgs that = (GetMerchantsByExternalIdArgs) o;
        return Objects.equals(externalSystemId, that.externalSystemId) && Objects.equals(externalSystemGroupId, that.externalSystemGroupId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(externalSystemId, externalSystemGroupId);
    }

    @Override
    public String toString() {
        return "GetMerchantsByExternalIdArgs{" +
                "externalSystemId='" + externalSystemId + '\'' +
                ", externalSystemGroupId='" + externalSystemGroupId + '\'' +

                '}';
    }
}