
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


public class BoardingDocument   {

    
    /**
     * Represents the current state of a transaction within the system.
     */
    @JsonProperty("Status")
    private String status;

    /**
     * 
     */
    @JsonProperty("DocUnderWriterNotes")
    private String docUnderWriterNotes;

    /**
     * 
     */
    @JsonProperty("DocType")
    private String docType;

    /**
     * 
     */
    @JsonProperty("DocsReceived")
    private String docsReceived;

    /**
     * 
     */
    @JsonProperty("DocLimit")
    private String docLimit;

    /**
     * 
     */
    @JsonProperty("DocGenericDescription")
    private String docGenericDescription;


    
    public BoardingDocument() {
    }

    
    public BoardingDocument(String status, String docUnderWriterNotes, String docType, String docsReceived, String docLimit, String docGenericDescription) {
        this.status = status;
        this.docUnderWriterNotes = docUnderWriterNotes;
        this.docType = docType;
        this.docsReceived = docsReceived;
        this.docLimit = docLimit;
        this.docGenericDescription = docGenericDescription;
    }
    
    

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingDocument that = (BoardingDocument) o;
        return Objects.equals(status, that.status) && Objects.equals(docUnderWriterNotes, that.docUnderWriterNotes) && Objects.equals(docType, that.docType) && Objects.equals(docsReceived, that.docsReceived) && Objects.equals(docLimit, that.docLimit) && Objects.equals(docGenericDescription, that.docGenericDescription) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(status, docUnderWriterNotes, docType, docsReceived, docLimit, docGenericDescription);
    }

    @Override
    public String toString() {
        return "BoardingDocument{" +
                "status='" + status + '\'' +
                ", docUnderWriterNotes='" + docUnderWriterNotes + '\'' +
                ", docType='" + docType + '\'' +
                ", docsReceived='" + docsReceived + '\'' +
                ", docLimit='" + docLimit + '\'' +
                ", docGenericDescription='" + docGenericDescription + '\'' +

                '}';
    }
}