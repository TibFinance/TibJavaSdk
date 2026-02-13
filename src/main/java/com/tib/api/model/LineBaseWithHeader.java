
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BaseLineHeader;
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


public class LineBaseWithHeader  extends LineBase  {

    
    /**
 * Gets or sets the header.
 */
    @JsonProperty("Header")
    private BaseLineHeader header;

    /**
 * Gets the start position.
 */
    @JsonProperty("StartPosition")
    private Integer startPosition;


    
    public LineBaseWithHeader() {
    }

    
    public LineBaseWithHeader(BaseLineHeader header, Integer startPosition) {
        this.header = header;
this.startPosition = startPosition;

    }
    
    
    public LineBaseWithHeader(char defaultPaddingChar, PadDirection defaultPaddingDirection, BaseLineHeader header, Integer startPosition) {
        super(defaultPaddingChar, defaultPaddingDirection);
        this.header = header;
this.startPosition = startPosition;

    }

    
    public BaseLineHeader getHeader() {
        return header;
    }

    public void setHeader(BaseLineHeader header) {
        this.header = header;
    }

    public Integer getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Integer startPosition) {
        this.startPosition = startPosition;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineBaseWithHeader that = (LineBaseWithHeader) o;
        return Objects.equals(header, that.header) && Objects.equals(startPosition, that.startPosition) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(header, startPosition);
    }

    @Override
    public String toString() {
        return "LineBaseWithHeader{" +
                 "header='" + header + '\'' +
 ", startPosition='" + startPosition + '\'' +

                '}';
    }
}