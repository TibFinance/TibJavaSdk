
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.LineType;
import com.tib.api.model.enums.PadDirection;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BaseLineHeader  extends LineBase  {

    
    /**
     * Gets or sets the type of the line.
     */
    @JsonProperty("LineType")
    private LineType lineType;

    /**
     * Gets or sets the file number.
     */
    @JsonProperty("FileNumber")
    private Integer fileNumber;

    /**
     * Gets or sets the organization number.
     */
    @JsonProperty("OrganizationNumber")
    private String organizationNumber;


    
    public BaseLineHeader() {
    }

    
    public BaseLineHeader(LineType lineType, Integer fileNumber, String organizationNumber) {
        this.lineType = lineType;
        this.fileNumber = fileNumber;
        this.organizationNumber = organizationNumber;
    }
    
    
    public BaseLineHeader(char defaultPaddingChar, PadDirection defaultPaddingDirection, LineType lineType, Integer fileNumber, String organizationNumber) {
        super(defaultPaddingChar, defaultPaddingDirection);
        this.lineType = lineType;
        this.fileNumber = fileNumber;
        this.organizationNumber = organizationNumber;
    }

    
    public LineType getLineType() {
        return lineType;
    }

    public void setLineType(LineType lineType) {
        this.lineType = lineType;
    }

    public Integer getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(Integer fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getOrganizationNumber() {
        return organizationNumber;
    }

    public void setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseLineHeader that = (BaseLineHeader) o;
        return Objects.equals(lineType, that.lineType) && Objects.equals(fileNumber, that.fileNumber) && Objects.equals(organizationNumber, that.organizationNumber) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(lineType, fileNumber, organizationNumber);
    }

    @Override
    public String toString() {
        return "BaseLineHeader{" +
                "lineType='" + lineType + '\'' +
                ", fileNumber='" + fileNumber + '\'' +
                ", organizationNumber='" + organizationNumber + '\'' +

                '}';
    }
}