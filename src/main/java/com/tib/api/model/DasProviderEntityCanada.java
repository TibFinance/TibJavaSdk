
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.DasProviderType;
import com.tib.api.model.enums.DasProviderCanadaFileType;
import com.tib.api.model.enums.DasProviderCanadaDeclarationFrequency;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class DasProviderEntityCanada  extends DasProviderBase  {

    
    /**
 * 
 */
    @JsonProperty("DasProviderType")
    private DasProviderType dasProviderType;

    /**
 * 
 */
    @JsonProperty("BusinessName")
    private String businessName;

    /**
 * 
 */
    @JsonProperty("BusinessOrAccountNumber")
    private String businessOrAccountNumber;

    /**
 * 
 */
    @JsonProperty("FileType")
    private DasProviderCanadaFileType fileType;

    /**
 * 
 */
    @JsonProperty("FileNumber")
    private String fileNumber;

    /**
 * 
 */
    @JsonProperty("DeclarationFrequency")
    private DasProviderCanadaDeclarationFrequency declarationFrequency;

    /**
 * Provides a detailed explanation of the function's purpose and usage within the API.
 */
    @JsonProperty("Description")
    private String description;


    
    public DasProviderEntityCanada() {
    }

    
    public DasProviderEntityCanada(DasProviderType dasProviderType, String businessName, String businessOrAccountNumber, DasProviderCanadaFileType fileType, String fileNumber, DasProviderCanadaDeclarationFrequency declarationFrequency, String description) {
        this.dasProviderType = dasProviderType;
this.businessName = businessName;
this.businessOrAccountNumber = businessOrAccountNumber;
this.fileType = fileType;
this.fileNumber = fileNumber;
this.declarationFrequency = declarationFrequency;
this.description = description;

    }
    
    

    
    public DasProviderType getDasProviderType() {
        return dasProviderType;
    }

    public void setDasProviderType(DasProviderType dasProviderType) {
        this.dasProviderType = dasProviderType;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessOrAccountNumber() {
        return businessOrAccountNumber;
    }

    public void setBusinessOrAccountNumber(String businessOrAccountNumber) {
        this.businessOrAccountNumber = businessOrAccountNumber;
    }

    public DasProviderCanadaFileType getFileType() {
        return fileType;
    }

    public void setFileType(DasProviderCanadaFileType fileType) {
        this.fileType = fileType;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public DasProviderCanadaDeclarationFrequency getDeclarationFrequency() {
        return declarationFrequency;
    }

    public void setDeclarationFrequency(DasProviderCanadaDeclarationFrequency declarationFrequency) {
        this.declarationFrequency = declarationFrequency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DasProviderEntityCanada that = (DasProviderEntityCanada) o;
        return Objects.equals(dasProviderType, that.dasProviderType) && Objects.equals(businessName, that.businessName) && Objects.equals(businessOrAccountNumber, that.businessOrAccountNumber) && Objects.equals(fileType, that.fileType) && Objects.equals(fileNumber, that.fileNumber) && Objects.equals(declarationFrequency, that.declarationFrequency) && Objects.equals(description, that.description) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(dasProviderType, businessName, businessOrAccountNumber, fileType, fileNumber, declarationFrequency, description);
    }

    @Override
    public String toString() {
        return "DasProviderEntityCanada{" +
                 "dasProviderType='" + dasProviderType + '\'' +
 ", businessName='" + businessName + '\'' +
 ", businessOrAccountNumber='" + businessOrAccountNumber + '\'' +
 ", fileType='" + fileType + '\'' +
 ", fileNumber='" + fileNumber + '\'' +
 ", declarationFrequency='" + declarationFrequency + '\'' +
 ", description='" + description + '\'' +

                '}';
    }
}