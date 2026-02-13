
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.LineType;
import com.tib.api.model.enums.LineType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class LineDefHeader  extends BaseLineHeader  {

    
    /**
 * Gets or sets the type of the line.
 */
    @JsonProperty("LineType")
    private LineType lineType;

    /**
 * Ce numÃ©ro sert Ã vÃ©rifier quâ€™il ne manque pas dâ€™enregistrements dans le fichier. Le type dâ€™enregistrement logique A doit avoir une valeur de Â« 000000001 Â», sinon le fichier est rejetÃ©. Tous les enregistrements subsÃ©quents doivent Ãªtre numÃ©riques et avoir une valeur supÃ©rieure dâ€™une unitÃ© au nombre dâ€™enregistrements logiques indiquÃ© sur lâ€™enregistrement logique prÃ©cÃ©dent, sinon le fichier est rejetÃ©.
 */
    @JsonProperty("RowNumber")
    private Integer rowNumber;

    /**
 * Gets or sets the organization number.
 */
    @JsonProperty("OrganizationNumber")
    private String organizationNumber;

    /**
 * Cet Ã©lÃ©ment de donnÃ©e sert Ã vÃ©rifier que tous les fichiers crÃ©Ã©s par le centre de traitement informatique de lâ€™organisme sont reÃ§us par la banque(et quâ€™il nâ€™en manque aucun ou quâ€™aucun nâ€™est traitÃ© deux fois). Cet Ã©lÃ©ment de donnÃ©e doit Ãªtre majorÃ© dâ€™une unitÃ© chaque fois quâ€™un fichier est crÃ©Ã©.
 */
    @JsonProperty("FileNumber")
    private Integer fileNumber;


    
    public LineDefHeader() {
    }

    
    public LineDefHeader(LineType lineType, Integer rowNumber, String organizationNumber, Integer fileNumber) {
        this.lineType = lineType;
this.rowNumber = rowNumber;
this.organizationNumber = organizationNumber;
this.fileNumber = fileNumber;

    }
    
    

    
    public LineType getLineType() {
        return lineType;
    }

    public void setLineType(LineType lineType) {
        this.lineType = lineType;
    }

    public Integer getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    public String getOrganizationNumber() {
        return organizationNumber;
    }

    public void setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber;
    }

    public Integer getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(Integer fileNumber) {
        this.fileNumber = fileNumber;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineDefHeader that = (LineDefHeader) o;
        return Objects.equals(lineType, that.lineType) && Objects.equals(rowNumber, that.rowNumber) && Objects.equals(organizationNumber, that.organizationNumber) && Objects.equals(fileNumber, that.fileNumber) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(lineType, rowNumber, organizationNumber, fileNumber);
    }

    @Override
    public String toString() {
        return "LineDefHeader{" +
                 "lineType='" + lineType + '\'' +
 ", rowNumber='" + rowNumber + '\'' +
 ", organizationNumber='" + organizationNumber + '\'' +
 ", fileNumber='" + fileNumber + '\'' +

                '}';
    }
}