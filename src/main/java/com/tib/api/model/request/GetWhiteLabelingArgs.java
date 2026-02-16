
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class GetWhiteLabelingArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * the unique identifier of an entity that will ger a new whitelabeling.
     */
    @JsonProperty("Id")
    private String id;

    /**
     * the entity type
     */
    @JsonProperty("WhiteLabelingLevel")
    private Integer whiteLabelingLevel;

    /**
     * Url entity
     */
    @JsonProperty("Url")
    private String url;


    
    public GetWhiteLabelingArgs() {
    }

    
    public GetWhiteLabelingArgs(String id, Integer whiteLabelingLevel, String url) {
        this.id = id;
        this.whiteLabelingLevel = whiteLabelingLevel;
        this.url = url;
    }
    
    
    public GetWhiteLabelingArgs(String adminSessionToken, String id, Integer whiteLabelingLevel, String url) {
        super(adminSessionToken);
        this.id = id;
        this.whiteLabelingLevel = whiteLabelingLevel;
        this.url = url;
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



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetWhiteLabelingArgs that = (GetWhiteLabelingArgs) o;
        return Objects.equals(id, that.id) && Objects.equals(whiteLabelingLevel, that.whiteLabelingLevel) && Objects.equals(url, that.url) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(id, whiteLabelingLevel, url);
    }

    @Override
    public String toString() {
        return "GetWhiteLabelingArgs{" +
                "id='" + id + '\'' +
                ", whiteLabelingLevel='" + whiteLabelingLevel + '\'' +
                ", url='" + url + '\'' +

                '}';
    }
}