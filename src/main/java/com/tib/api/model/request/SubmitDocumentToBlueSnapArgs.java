
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


public class SubmitDocumentToBlueSnapArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("ProviderRequestId")
    private String providerRequestId;

    /**
     * 
     */
    @JsonProperty("DocType")
    private String docType;

    /**
     * Gets or sets the title that identifies the object in a human‑readable way.
     */
    @JsonProperty("Title")
    private String title;

    /**
     * 
     */
    @JsonProperty("FileType")
    private String fileType;

    /**
     * Provides a detailed explanation of the function's purpose and usage within the API.
     */
    @JsonProperty("Description")
    private String description;

    /**
     * 
     */
    @JsonProperty("Content")
    private String content;


    
    public SubmitDocumentToBlueSnapArgs() {
    }

    
    public SubmitDocumentToBlueSnapArgs(String providerRequestId, String docType, String title, String fileType, String description, String content) {
        this.providerRequestId = providerRequestId;
        this.docType = docType;
        this.title = title;
        this.fileType = fileType;
        this.description = description;
        this.content = content;
    }
    
    
    public SubmitDocumentToBlueSnapArgs(String sessionToken, String providerRequestId, String docType, String title, String fileType, String description, String content) {
        super(sessionToken);
        this.providerRequestId = providerRequestId;
        this.docType = docType;
        this.title = title;
        this.fileType = fileType;
        this.description = description;
        this.content = content;
    }

    
    public String getProviderRequestId() {
        return providerRequestId;
    }

    public void setProviderRequestId(String providerRequestId) {
        this.providerRequestId = providerRequestId;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubmitDocumentToBlueSnapArgs that = (SubmitDocumentToBlueSnapArgs) o;
        return Objects.equals(providerRequestId, that.providerRequestId) && Objects.equals(docType, that.docType) && Objects.equals(title, that.title) && Objects.equals(fileType, that.fileType) && Objects.equals(description, that.description) && Objects.equals(content, that.content) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(providerRequestId, docType, title, fileType, description, content);
    }

    @Override
    public String toString() {
        return "SubmitDocumentToBlueSnapArgs{" +
                "providerRequestId='" + providerRequestId + '\'' +
                ", docType='" + docType + '\'' +
                ", title='" + title + '\'' +
                ", fileType='" + fileType + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +

                '}';
    }
}