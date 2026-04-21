
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BoardingFile   {

    
    /**
     * Unique identifier of the boarding information file linked to the merchant.
     */
    @JsonProperty("BoardingInfoFilesId")
    private String boardingInfoFilesId;

    /**
     * External case identifier assigned by the merchant's payment provider.
     */
    @JsonProperty("ProviderCaseId")
    private String providerCaseId;

    /**
     * Free‑form notes added by the underwriter for the merchant identified by the external ID
     */
    @JsonProperty("DocUnderWriterNotes")
    private String docUnderWriterNotes;

    /**
     * The type of document associated with the merchant record.
     */
    @JsonProperty("DocType")
    private String docType;

    /**
     * Indicates the document receipt status for the merchant.
     */
    @JsonProperty("DocsReceived")
    private String docsReceived;

    /**
     * The maximum number of merchant records returned in the response
     */
    @JsonProperty("DocLimit")
    private String docLimit;

    /**
     * A free‑form textual description of the merchant returned by the request
     */
    @JsonProperty("DocGenericDescription")
    private String docGenericDescription;

    /**
     * The current lifecycle status of the merchant record returned by GetMerchantsByExternalId.
     */
    @JsonProperty("DocStatus")
    private String docStatus;


    
    public BoardingFile() {
    }

    
    public BoardingFile(String boardingInfoFilesId, String providerCaseId, String docUnderWriterNotes, String docType, String docsReceived, String docLimit, String docGenericDescription, String docStatus) {
        this.boardingInfoFilesId = boardingInfoFilesId;
        this.providerCaseId = providerCaseId;
        this.docUnderWriterNotes = docUnderWriterNotes;
        this.docType = docType;
        this.docsReceived = docsReceived;
        this.docLimit = docLimit;
        this.docGenericDescription = docGenericDescription;
        this.docStatus = docStatus;
    }
    
    

    
    public String getBoardingInfoFilesId() {
        return boardingInfoFilesId;
    }

    public void setBoardingInfoFilesId(String boardingInfoFilesId) {
        this.boardingInfoFilesId = boardingInfoFilesId;
    }

    public String getProviderCaseId() {
        return providerCaseId;
    }

    public void setProviderCaseId(String providerCaseId) {
        this.providerCaseId = providerCaseId;
    }

    public String getDocUnderWriterNotes() {
        return docUnderWriterNotes;
    }

    public void setDocUnderWriterNotes(String docUnderWriterNotes) {
        this.docUnderWriterNotes = docUnderWriterNotes;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocsReceived() {
        return docsReceived;
    }

    public void setDocsReceived(String docsReceived) {
        this.docsReceived = docsReceived;
    }

    public String getDocLimit() {
        return docLimit;
    }

    public void setDocLimit(String docLimit) {
        this.docLimit = docLimit;
    }

    public String getDocGenericDescription() {
        return docGenericDescription;
    }

    public void setDocGenericDescription(String docGenericDescription) {
        this.docGenericDescription = docGenericDescription;
    }

    public String getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingFile that = (BoardingFile) o;
        return Objects.equals(boardingInfoFilesId, that.boardingInfoFilesId) && Objects.equals(providerCaseId, that.providerCaseId) && Objects.equals(docUnderWriterNotes, that.docUnderWriterNotes) && Objects.equals(docType, that.docType) && Objects.equals(docsReceived, that.docsReceived) && Objects.equals(docLimit, that.docLimit) && Objects.equals(docGenericDescription, that.docGenericDescription) && Objects.equals(docStatus, that.docStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingInfoFilesId, providerCaseId, docUnderWriterNotes, docType, docsReceived, docLimit, docGenericDescription, docStatus);
    }

    @Override
    public String toString() {
        return "BoardingFile{" +
                "boardingInfoFilesId='" + boardingInfoFilesId + '\'' +
                ", providerCaseId='" + providerCaseId + '\'' +
                ", docUnderWriterNotes='" + docUnderWriterNotes + '\'' +
                ", docType='" + docType + '\'' +
                ", docsReceived='" + docsReceived + '\'' +
                ", docLimit='" + docLimit + '\'' +
                ", docGenericDescription='" + docGenericDescription + '\'' +
                ", docStatus='" + docStatus + '\'' +

                '}';
    }
}