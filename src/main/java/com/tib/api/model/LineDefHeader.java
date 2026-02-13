
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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
 * This number is used to verify that no records are missing from the file. Logical record type A must have a value of '000000001', otherwise the file is rejected. All subsequent records must be numeric and have a value one unit greater than the logical record count indicated on the previous logical record, otherwise the file is rejected.
 */
    @JsonProperty("RowNumber")
    private Integer rowNumber;

    /**
 * Gets or sets the organization number.
 */
    @JsonProperty("OrganizationNumber")
    private String organizationNumber;

    /**
 * This data element is used to verify that all files created by the organization's data processing center are received by the bank (and that none are missing or processed twice). This data element must be incremented by one each time a file is created.
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