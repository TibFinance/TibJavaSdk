
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


public class DeleteLoginArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("LoginId")
    private String loginId;


    
    public DeleteLoginArgs() {
    }

    
    public DeleteLoginArgs(String loginId) {
        this.loginId = loginId;

    }
    
    
    public DeleteLoginArgs(String adminSessionToken, String loginId) {
        super(adminSessionToken);
        this.loginId = loginId;

    }

    
    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteLoginArgs that = (DeleteLoginArgs) o;
        return Objects.equals(loginId, that.loginId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(loginId);
    }

    @Override
    public String toString() {
        return "DeleteLoginArgs{" +
                 "loginId='" + loginId + '\'' +

                '}';
    }
}