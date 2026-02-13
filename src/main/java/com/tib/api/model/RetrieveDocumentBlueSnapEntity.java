
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class RetrieveDocumentBlueSnapEntity  extends RetrieveDocumentEntity  {

    
    /**
 * 
 */
    @JsonProperty("ProviderRequestId")
    private String providerRequestId;

    /**
 * 
 */
    @JsonProperty("CaseId")
    private String caseId;


    
    public RetrieveDocumentBlueSnapEntity() {
    }

    
    public RetrieveDocumentBlueSnapEntity(String providerRequestId, String caseId) {
        this.providerRequestId = providerRequestId;
this.caseId = caseId;

    }
    
    

    
    public String getProviderRequestId() {
        return providerRequestId;
    }

    public void setProviderRequestId(String providerRequestId) {
        this.providerRequestId = providerRequestId;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RetrieveDocumentBlueSnapEntity that = (RetrieveDocumentBlueSnapEntity) o;
        return Objects.equals(providerRequestId, that.providerRequestId) && Objects.equals(caseId, that.caseId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerRequestId, caseId);
    }

    @Override
    public String toString() {
        return "RetrieveDocumentBlueSnapEntity{" +
                 "providerRequestId='" + providerRequestId + '\'' +
 ", caseId='" + caseId + '\'' +

                '}';
    }
}