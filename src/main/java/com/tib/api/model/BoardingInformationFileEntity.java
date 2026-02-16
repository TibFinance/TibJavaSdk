
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.BoardingIdFileSides;
import com.tib.api.model.enums.BoardingDocType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BoardingInformationFileEntity   {

    
    /**
     * 
     */
    @JsonProperty("Base64")
    private String base64;

    /**
     * 
     */
    @JsonProperty("Side")
    private BoardingIdFileSides side;

    /**
     * 
     */
    @JsonProperty("IsAdministrator")
    private boolean isAdministrator;

    /**
     * 
     */
    @JsonProperty("DocType")
    private BoardingDocType docType;


    
    public BoardingInformationFileEntity() {
    }

    
    public BoardingInformationFileEntity(String base64, BoardingIdFileSides side, boolean isAdministrator, BoardingDocType docType) {
        this.base64 = base64;
        this.side = side;
        this.isAdministrator = isAdministrator;
        this.docType = docType;
    }
    
    

    
    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public BoardingIdFileSides getSide() {
        return side;
    }

    public void setSide(BoardingIdFileSides side) {
        this.side = side;
    }

    public boolean getIsAdministrator() {
        return isAdministrator;
    }

    public void setIsAdministrator(boolean isAdministrator) {
        this.isAdministrator = isAdministrator;
    }

    public BoardingDocType getDocType() {
        return docType;
    }

    public void setDocType(BoardingDocType docType) {
        this.docType = docType;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingInformationFileEntity that = (BoardingInformationFileEntity) o;
        return Objects.equals(base64, that.base64) && Objects.equals(side, that.side) && Objects.equals(isAdministrator, that.isAdministrator) && Objects.equals(docType, that.docType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(base64, side, isAdministrator, docType);
    }

    @Override
    public String toString() {
        return "BoardingInformationFileEntity{" +
                "base64='" + base64 + '\'' +
                ", side='" + side + '\'' +
                ", isAdministrator='" + isAdministrator + '\'' +
                ", docType='" + docType + '\'' +

                '}';
    }
}