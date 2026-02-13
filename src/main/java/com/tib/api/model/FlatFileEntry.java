
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


public class FlatFileEntry   {

    
    /**
 * 
 */
    @JsonProperty("Position")
    private Integer position;

    /**
 * 
 */
    @JsonProperty("Length")
    private Integer length;

    /**
 * 
 */
    @JsonProperty("PadChar")
    private char padChar;

    /**
 * 
 */
    @JsonProperty("PadDirection")
    private PadDirection padDirection;

    /**
 * 
 */
    @JsonProperty("Value")
    private Object value;

    /**
 * 
 */
    @JsonProperty("ValueString")
    private String valueString;


    
    public FlatFileEntry() {
    }

    
    public FlatFileEntry(Integer position, Integer length, char padChar, PadDirection padDirection, Object value, String valueString) {
        this.position = position;
this.length = length;
this.padChar = padChar;
this.padDirection = padDirection;
this.value = value;
this.valueString = valueString;

    }
    
    

    
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public char getPadChar() {
        return padChar;
    }

    public void setPadChar(char padChar) {
        this.padChar = padChar;
    }

    public PadDirection getPadDirection() {
        return padDirection;
    }

    public void setPadDirection(PadDirection padDirection) {
        this.padDirection = padDirection;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getValueString() {
        return valueString;
    }

    public void setValueString(String valueString) {
        this.valueString = valueString;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlatFileEntry that = (FlatFileEntry) o;
        return Objects.equals(position, that.position) && Objects.equals(length, that.length) && Objects.equals(padChar, that.padChar) && Objects.equals(padDirection, that.padDirection) && Objects.equals(value, that.value) && Objects.equals(valueString, that.valueString) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(position, length, padChar, padDirection, value, valueString);
    }

    @Override
    public String toString() {
        return "FlatFileEntry{" +
                 "position='" + position + '\'' +
 ", length='" + length + '\'' +
 ", padChar='" + padChar + '\'' +
 ", padDirection='" + padDirection + '\'' +
 ", value='" + value + '\'' +
 ", valueString='" + valueString + '\'' +

                '}';
    }
}