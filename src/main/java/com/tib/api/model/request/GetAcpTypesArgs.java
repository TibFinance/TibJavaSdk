
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


public class GetAcpTypesArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * Client information to modify
     */
    @JsonProperty("RelatedId")
    private String relatedId;


    
    public GetAcpTypesArgs() {
    }

    
    public GetAcpTypesArgs(String relatedId) {
        this.relatedId = relatedId;
    }
    
    
    public GetAcpTypesArgs(String adminSessionToken, String relatedId) {
        super(adminSessionToken);
        this.relatedId = relatedId;
    }

    
    public String getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(String relatedId) {
        this.relatedId = relatedId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAcpTypesArgs that = (GetAcpTypesArgs) o;
        return Objects.equals(relatedId, that.relatedId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(relatedId);
    }

    @Override
    public String toString() {
        return "GetAcpTypesArgs{" +
                "relatedId='" + relatedId + '\'' +

                '}';
    }
}