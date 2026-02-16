
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


public class DeleteConvenientFeeSettingsArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("Id")
    private String id;


    
    public DeleteConvenientFeeSettingsArgs() {
    }

    
    public DeleteConvenientFeeSettingsArgs(String id) {
        this.id = id;
    }
    
    
    public DeleteConvenientFeeSettingsArgs(String sessionToken, String id) {
        super(sessionToken);
        this.id = id;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteConvenientFeeSettingsArgs that = (DeleteConvenientFeeSettingsArgs) o;
        return Objects.equals(id, that.id) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "DeleteConvenientFeeSettingsArgs{" +
                "id='" + id + '\'' +

                '}';
    }
}