
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


public class GetFeesOverloadMerchantArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * Client information to modify
 */
    @JsonProperty("Id")
    private String id;

    /**
 * 
 */
    @JsonProperty("Source")
    private String source;


    
    public GetFeesOverloadMerchantArgs() {
    }

    
    public GetFeesOverloadMerchantArgs(String id, String source) {
        this.id = id;
this.source = source;

    }
    
    
    public GetFeesOverloadMerchantArgs(String adminSessionToken, String id, String source) {
        super(adminSessionToken);
        this.id = id;
this.source = source;

    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetFeesOverloadMerchantArgs that = (GetFeesOverloadMerchantArgs) o;
        return Objects.equals(id, that.id) && Objects.equals(source, that.source) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(id, source);
    }

    @Override
    public String toString() {
        return "GetFeesOverloadMerchantArgs{" +
                 "id='" + id + '\'' +
 ", source='" + source + '\'' +

                '}';
    }
}