
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


public class LineBase  extends FlatFileLine  {

    
    /**
 * Gets the default padding character.
 */
    @JsonProperty("DefaultPaddingChar")
    private char defaultPaddingChar;

    /**
 * Gets the default padding direction.
 */
    @JsonProperty("DefaultPaddingDirection")
    private PadDirection defaultPaddingDirection;


    
    public LineBase() {
    }

    
    public LineBase(char defaultPaddingChar, PadDirection defaultPaddingDirection) {
        this.defaultPaddingChar = defaultPaddingChar;
this.defaultPaddingDirection = defaultPaddingDirection;

    }
    
    
    public LineBase(Integer startPosition, char defaultPaddingChar, PadDirection defaultPaddingDirection) {
        super(defaultPaddingChar, defaultPaddingDirection, startPosition);
        this.defaultPaddingChar = defaultPaddingChar;
this.defaultPaddingDirection = defaultPaddingDirection;

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



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineBase that = (LineBase) o;
        return Objects.equals(defaultPaddingChar, that.defaultPaddingChar) && Objects.equals(defaultPaddingDirection, that.defaultPaddingDirection) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(defaultPaddingChar, defaultPaddingDirection);
    }

    @Override
    public String toString() {
        return "LineBase{" +
                 "defaultPaddingChar='" + defaultPaddingChar + '\'' +
 ", defaultPaddingDirection='" + defaultPaddingDirection + '\'' +

                '}';
    }
}