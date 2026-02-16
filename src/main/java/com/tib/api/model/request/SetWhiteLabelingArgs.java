
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.WhiteLabelingData;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SetWhiteLabelingArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("WhiteLabelingData")
    private List<WhiteLabelingData> whiteLabelingData;

    /**
     * 
     */
    @JsonProperty("Id")
    private String id;

    /**
     * 
     */
    @JsonProperty("WhiteLabelingLevel")
    private Integer whiteLabelingLevel;

    /**
     * 
     */
    @JsonProperty("Url")
    private String url;

    /**
     * 
     */
    @JsonProperty("Logo")
    private String logo;


    
    public SetWhiteLabelingArgs() {
    }

    
    public SetWhiteLabelingArgs(List<WhiteLabelingData> whiteLabelingData, String id, Integer whiteLabelingLevel, String url, String logo) {
        this.whiteLabelingData = whiteLabelingData;
        this.id = id;
        this.whiteLabelingLevel = whiteLabelingLevel;
        this.url = url;
        this.logo = logo;
    }
    
    
    public SetWhiteLabelingArgs(String adminSessionToken, List<WhiteLabelingData> whiteLabelingData, String id, Integer whiteLabelingLevel, String url, String logo) {
        super(adminSessionToken);
        this.whiteLabelingData = whiteLabelingData;
        this.id = id;
        this.whiteLabelingLevel = whiteLabelingLevel;
        this.url = url;
        this.logo = logo;
    }

    
    public List<WhiteLabelingData> getWhiteLabelingData() {
        return whiteLabelingData;
    }

    public void setWhiteLabelingData(List<WhiteLabelingData> whiteLabelingData) {
        this.whiteLabelingData = whiteLabelingData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getWhiteLabelingLevel() {
        return whiteLabelingLevel;
    }

    public void setWhiteLabelingLevel(Integer whiteLabelingLevel) {
        this.whiteLabelingLevel = whiteLabelingLevel;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetWhiteLabelingArgs that = (SetWhiteLabelingArgs) o;
        return Objects.equals(whiteLabelingData, that.whiteLabelingData) && Objects.equals(id, that.id) && Objects.equals(whiteLabelingLevel, that.whiteLabelingLevel) && Objects.equals(url, that.url) && Objects.equals(logo, that.logo) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(whiteLabelingData, id, whiteLabelingLevel, url, logo);
    }

    @Override
    public String toString() {
        return "SetWhiteLabelingArgs{" +
                "whiteLabelingData='" + whiteLabelingData + '\'' +
                ", id='" + id + '\'' +
                ", whiteLabelingLevel='" + whiteLabelingLevel + '\'' +
                ", url='" + url + '\'' +
                ", logo='" + logo + '\'' +

                '}';
    }
}