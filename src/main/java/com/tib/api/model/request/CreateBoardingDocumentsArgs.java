
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


public class CreateBoardingDocumentsArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("CaseId")
    private String caseId;

    /**
 * 
 */
    @JsonProperty("DocType")
    private String docType;

    /**
 * 
 */
    @JsonProperty("Filename")
    private String filename;

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


    
    public CreateBoardingDocumentsArgs() {
    }

    
    public CreateBoardingDocumentsArgs(String caseId, String docType, String filename, String description, String content) {
        this.caseId = caseId;
this.docType = docType;
this.filename = filename;
this.description = description;
this.content = content;

    }
    
    
    public CreateBoardingDocumentsArgs(String sessionToken, String caseId, String docType, String filename, String description, String content) {
        super(sessionToken);
        this.caseId = caseId;
this.docType = docType;
this.filename = filename;
this.description = description;
this.content = content;

    }

    
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
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
        CreateBoardingDocumentsArgs that = (CreateBoardingDocumentsArgs) o;
        return Objects.equals(caseId, that.caseId) && Objects.equals(docType, that.docType) && Objects.equals(filename, that.filename) && Objects.equals(description, that.description) && Objects.equals(content, that.content) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(caseId, docType, filename, description, content);
    }

    @Override
    public String toString() {
        return "CreateBoardingDocumentsArgs{" +
                 "caseId='" + caseId + '\'' +
 ", docType='" + docType + '\'' +
 ", filename='" + filename + '\'' +
 ", description='" + description + '\'' +
 ", content='" + content + '\'' +

                '}';
    }
}