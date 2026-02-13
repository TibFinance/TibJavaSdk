
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class WhiteLabelingData   {

    
    /**
 * 
 */
    @JsonProperty("WhiteLabelingDataId")
    private String whiteLabelingDataId;

    /**
 * 
 */
    @JsonProperty("CssProperty")
    private String cssProperty;

    /**
 * 
 */
    @JsonProperty("CssValue")
    private String cssValue;


    
    public WhiteLabelingData() {
    }

    
    public WhiteLabelingData(String whiteLabelingDataId, String cssProperty, String cssValue) {
        this.whiteLabelingDataId = whiteLabelingDataId;
this.cssProperty = cssProperty;
this.cssValue = cssValue;

    }
    
    

    
    public String getWhiteLabelingDataId() {
        return whiteLabelingDataId;
    }

    public void setWhiteLabelingDataId(String whiteLabelingDataId) {
        this.whiteLabelingDataId = whiteLabelingDataId;
    }

    public String getCssProperty() {
        return cssProperty;
    }

    public void setCssProperty(String cssProperty) {
        this.cssProperty = cssProperty;
    }

    public String getCssValue() {
        return cssValue;
    }

    public void setCssValue(String cssValue) {
        this.cssValue = cssValue;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WhiteLabelingData that = (WhiteLabelingData) o;
        return Objects.equals(whiteLabelingDataId, that.whiteLabelingDataId) && Objects.equals(cssProperty, that.cssProperty) && Objects.equals(cssValue, that.cssValue) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(whiteLabelingDataId, cssProperty, cssValue);
    }

    @Override
    public String toString() {
        return "WhiteLabelingData{" +
                 "whiteLabelingDataId='" + whiteLabelingDataId + '\'' +
 ", cssProperty='" + cssProperty + '\'' +
 ", cssValue='" + cssValue + '\'' +

                '}';
    }
}