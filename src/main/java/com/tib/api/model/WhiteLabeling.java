
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.WhiteLabelingData;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class WhiteLabeling   {

    
    /**
 * 
 */
    @JsonProperty("WhileLabelingId")
    private String whileLabelingId;

    /**
 * 
 */
    @JsonProperty("WhiteLabelingLevel")
    private Integer whiteLabelingLevel;

    /**
 * 
 */
    @JsonProperty("WhiteLabelingLevelValue")
    private String whiteLabelingLevelValue;

    /**
 * 
 */
    @JsonProperty("Logo")
    private String logo;

    /**
 * 
 */
    @JsonProperty("Url")
    private String url;

    /**
 * 
 */
    @JsonProperty("WhiteLabelingData")
    private List<WhiteLabelingData> whiteLabelingData;


    
    public WhiteLabeling() {
    }

    
    public WhiteLabeling(String whileLabelingId, Integer whiteLabelingLevel, String whiteLabelingLevelValue, String logo, String url, List<WhiteLabelingData> whiteLabelingData) {
        this.whileLabelingId = whileLabelingId;
this.whiteLabelingLevel = whiteLabelingLevel;
this.whiteLabelingLevelValue = whiteLabelingLevelValue;
this.logo = logo;
this.url = url;
this.whiteLabelingData = whiteLabelingData;

    }
    
    

    
    public String getWhileLabelingId() {
        return whileLabelingId;
    }

    public void setWhileLabelingId(String whileLabelingId) {
        this.whileLabelingId = whileLabelingId;
    }

    public Integer getWhiteLabelingLevel() {
        return whiteLabelingLevel;
    }

    public void setWhiteLabelingLevel(Integer whiteLabelingLevel) {
        this.whiteLabelingLevel = whiteLabelingLevel;
    }

    public String getWhiteLabelingLevelValue() {
        return whiteLabelingLevelValue;
    }

    public void setWhiteLabelingLevelValue(String whiteLabelingLevelValue) {
        this.whiteLabelingLevelValue = whiteLabelingLevelValue;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<WhiteLabelingData> getWhiteLabelingData() {
        return whiteLabelingData;
    }

    public void setWhiteLabelingData(List<WhiteLabelingData> whiteLabelingData) {
        this.whiteLabelingData = whiteLabelingData;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WhiteLabeling that = (WhiteLabeling) o;
        return Objects.equals(whileLabelingId, that.whileLabelingId) && Objects.equals(whiteLabelingLevel, that.whiteLabelingLevel) && Objects.equals(whiteLabelingLevelValue, that.whiteLabelingLevelValue) && Objects.equals(logo, that.logo) && Objects.equals(url, that.url) && Objects.equals(whiteLabelingData, that.whiteLabelingData) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(whileLabelingId, whiteLabelingLevel, whiteLabelingLevelValue, logo, url, whiteLabelingData);
    }

    @Override
    public String toString() {
        return "WhiteLabeling{" +
                 "whileLabelingId='" + whileLabelingId + '\'' +
 ", whiteLabelingLevel='" + whiteLabelingLevel + '\'' +
 ", whiteLabelingLevelValue='" + whiteLabelingLevelValue + '\'' +
 ", logo='" + logo + '\'' +
 ", url='" + url + '\'' +
 ", whiteLabelingData='" + whiteLabelingData + '\'' +

                '}';
    }
}