
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetUserWhiteLabelingDataArgs  extends BaseAuthenticatedCryptedArgs  {

    
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


    
    public GetUserWhiteLabelingDataArgs() {
    }

    
    public GetUserWhiteLabelingDataArgs(String id, Integer whiteLabelingLevel, String url) {
        this.id = id;
this.whiteLabelingLevel = whiteLabelingLevel;
this.url = url;

    }
    
    
    public GetUserWhiteLabelingDataArgs(String sessionToken, String id, Integer whiteLabelingLevel, String url) {
        super(sessionToken);
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
        GetUserWhiteLabelingDataArgs that = (GetUserWhiteLabelingDataArgs) o;
        return Objects.equals(id, that.id) && Objects.equals(whiteLabelingLevel, that.whiteLabelingLevel) && Objects.equals(url, that.url) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(id, whiteLabelingLevel, url);
    }

    @Override
    public String toString() {
        return "GetUserWhiteLabelingDataArgs{" +
                 "id='" + id + '\'' +
 ", whiteLabelingLevel='" + whiteLabelingLevel + '\'' +
 ", url='" + url + '\'' +

                '}';
    }
}