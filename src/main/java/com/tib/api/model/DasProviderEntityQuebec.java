
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.DasProviderType;
import com.tib.api.model.enums.DasProviderQuebecFileType;
import com.tib.api.model.enums.DasProviderQuebecDeclarationFrequency;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class DasProviderEntityQuebec  extends DasProviderBase  {

    
    /**
     * 
     */
    @JsonProperty("DasProviderType")
    private DasProviderType dasProviderType;

    /**
     * 
     */
    @JsonProperty("IdentificationNumber")
    private String identificationNumber;

    /**
     * 
     */
    @JsonProperty("FileType")
    private DasProviderQuebecFileType fileType;

    /**
     * 
     */
    @JsonProperty("FileNumber")
    private String fileNumber;

    /**
     * 
     */
    @JsonProperty("DeclarationFrequency")
    private DasProviderQuebecDeclarationFrequency declarationFrequency;

    /**
     * Provides a detailed explanation of the function's purpose and usage within the API.
     */
    @JsonProperty("Description")
    private String description;


    
    public DasProviderEntityQuebec() {
    }

    
    public DasProviderEntityQuebec(DasProviderType dasProviderType, String identificationNumber, DasProviderQuebecFileType fileType, String fileNumber, DasProviderQuebecDeclarationFrequency declarationFrequency, String description) {
        this.dasProviderType = dasProviderType;
        this.identificationNumber = identificationNumber;
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

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public DasProviderQuebecFileType getFileType() {
        return fileType;
    }

    public void setFileType(DasProviderQuebecFileType fileType) {
        this.fileType = fileType;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public DasProviderQuebecDeclarationFrequency getDeclarationFrequency() {
        return declarationFrequency;
    }

    public void setDeclarationFrequency(DasProviderQuebecDeclarationFrequency declarationFrequency) {
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
        DasProviderEntityQuebec that = (DasProviderEntityQuebec) o;
        return Objects.equals(dasProviderType, that.dasProviderType) && Objects.equals(identificationNumber, that.identificationNumber) && Objects.equals(fileType, that.fileType) && Objects.equals(fileNumber, that.fileNumber) && Objects.equals(declarationFrequency, that.declarationFrequency) && Objects.equals(description, that.description) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(dasProviderType, identificationNumber, fileType, fileNumber, declarationFrequency, description);
    }

    @Override
    public String toString() {
        return "DasProviderEntityQuebec{" +
                "dasProviderType='" + dasProviderType + '\'' +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", fileType='" + fileType + '\'' +
                ", fileNumber='" + fileNumber + '\'' +
                ", declarationFrequency='" + declarationFrequency + '\'' +
                ", description='" + description + '\'' +

                '}';
    }
}