
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class FlatFileLine   {

    
    /**
     * 
     */
    @JsonProperty("DefaultPaddingChar")
    private char defaultPaddingChar;

    /**
     * 
     */
    @JsonProperty("DefaultPaddingDirection")
    private PadDirection defaultPaddingDirection;

    /**
     * 
     */
    @JsonProperty("StartPosition")
    private Integer startPosition;


    
    public FlatFileLine() {
    }

    
    public FlatFileLine(char defaultPaddingChar, PadDirection defaultPaddingDirection, Integer startPosition) {
        this.defaultPaddingChar = defaultPaddingChar;
        this.defaultPaddingDirection = defaultPaddingDirection;
        this.startPosition = startPosition;
    }
    
    

    
    public char getDefaultPaddingChar() {
        return defaultPaddingChar;
    }

    public void setDefaultPaddingChar(char defaultPaddingChar) {
        this.defaultPaddingChar = defaultPaddingChar;
    }

    public PadDirection getDefaultPaddingDirection() {
        return defaultPaddingDirection;
    }

    public void setDefaultPaddingDirection(PadDirection defaultPaddingDirection) {
        this.defaultPaddingDirection = defaultPaddingDirection;
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
        FlatFileLine that = (FlatFileLine) o;
        return Objects.equals(defaultPaddingChar, that.defaultPaddingChar) && Objects.equals(defaultPaddingDirection, that.defaultPaddingDirection) && Objects.equals(startPosition, that.startPosition) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(defaultPaddingChar, defaultPaddingDirection, startPosition);
    }

    @Override
    public String toString() {
        return "FlatFileLine{" +
                "defaultPaddingChar='" + defaultPaddingChar + '\'' +
                ", defaultPaddingDirection='" + defaultPaddingDirection + '\'' +
                ", startPosition='" + startPosition + '\'' +

                '}';
    }
}