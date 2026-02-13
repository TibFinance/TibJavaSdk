
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


public class DeleteWhiteLabelingArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("Id")
    private String id;

    /**
 * 
 */
    @JsonProperty("Level")
    private Integer level;

    /**
 * 
 */
    @JsonProperty("Url")
    private String url;


    
    public DeleteWhiteLabelingArgs() {
    }

    
    public DeleteWhiteLabelingArgs(String id, Integer level, String url) {
        this.id = id;
this.level = level;
this.url = url;

    }
    
    
    public DeleteWhiteLabelingArgs(String adminSessionToken, String id, Integer level, String url) {
        super(adminSessionToken);
        this.id = id;
this.level = level;
this.url = url;

    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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
        DeleteWhiteLabelingArgs that = (DeleteWhiteLabelingArgs) o;
        return Objects.equals(id, that.id) && Objects.equals(level, that.level) && Objects.equals(url, that.url) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(id, level, url);
    }

    @Override
    public String toString() {
        return "DeleteWhiteLabelingArgs{" +
                 "id='" + id + '\'' +
 ", level='" + level + '\'' +
 ", url='" + url + '\'' +

                '}';
    }
}