
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


public class DeleteLoginRelationArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("LoginRealtionId")
    private String loginRealtionId;


    
    public DeleteLoginRelationArgs() {
    }

    
    public DeleteLoginRelationArgs(String loginRealtionId) {
        this.loginRealtionId = loginRealtionId;
    }
    
    
    public DeleteLoginRelationArgs(String adminSessionToken, String loginRealtionId) {
        super(adminSessionToken);
        this.loginRealtionId = loginRealtionId;
    }

    
    public String getLoginRealtionId() {
        return loginRealtionId;
    }

    public void setLoginRealtionId(String loginRealtionId) {
        this.loginRealtionId = loginRealtionId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteLoginRelationArgs that = (DeleteLoginRelationArgs) o;
        return Objects.equals(loginRealtionId, that.loginRealtionId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(loginRealtionId);
    }

    @Override
    public String toString() {
        return "DeleteLoginRelationArgs{" +
                "loginRealtionId='" + loginRealtionId + '\'' +

                '}';
    }
}