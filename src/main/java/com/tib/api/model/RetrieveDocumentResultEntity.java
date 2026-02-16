
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BoardingDocument;
import com.tib.api.model.BoardingBaseError;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class RetrieveDocumentResultEntity  extends BoardingBaseResult  {

    
    /**
     * 
     */
    @JsonProperty("CaseStatus")
    private String caseStatus;

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

    /**
     * 
     */
    @JsonProperty("Documentation")
    private List<BoardingDocument> documentation;


    
    public RetrieveDocumentResultEntity() {
    }

    
    public RetrieveDocumentResultEntity(String caseStatus, String providerRequestId, String caseId, List<BoardingDocument> documentation) {
        this.caseStatus = caseStatus;
        this.providerRequestId = providerRequestId;
        this.caseId = caseId;
        this.documentation = documentation;
    }
    
    
    public RetrieveDocumentResultEntity(boolean isSuccess, Integer httpStatusCode, String message, List<BoardingBaseError> errorList, String caseStatus, String providerRequestId, String caseId, List<BoardingDocument> documentation) {
        super(isSuccess, httpStatusCode, message, errorList);
        this.caseStatus = caseStatus;
        this.providerRequestId = providerRequestId;
        this.caseId = caseId;
        this.documentation = documentation;
    }

    
    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
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

    public List<BoardingDocument> getDocumentation() {
        return documentation;
    }

    public void setDocumentation(List<BoardingDocument> documentation) {
        this.documentation = documentation;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RetrieveDocumentResultEntity that = (RetrieveDocumentResultEntity) o;
        return Objects.equals(caseStatus, that.caseStatus) && Objects.equals(providerRequestId, that.providerRequestId) && Objects.equals(caseId, that.caseId) && Objects.equals(documentation, that.documentation) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(caseStatus, providerRequestId, caseId, documentation);
    }

    @Override
    public String toString() {
        return "RetrieveDocumentResultEntity{" +
                "caseStatus='" + caseStatus + '\'' +
                ", providerRequestId='" + providerRequestId + '\'' +
                ", caseId='" + caseId + '\'' +
                ", documentation='" + documentation + '\'' +

                '}';
    }
}