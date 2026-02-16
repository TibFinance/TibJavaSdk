
package com.tib.api.model.request;

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


public class SendAdminAuthenticationCodeArgs  implements IBaseCryptedServiceArgs  {

    
    /**
     * Administrator code (login code)
     */
    @JsonProperty("AdminCode")
    private String adminCode;


    
    public SendAdminAuthenticationCodeArgs() {
    }

    
    public SendAdminAuthenticationCodeArgs(String adminCode) {
        this.adminCode = adminCode;
    }
    
    

    
    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SendAdminAuthenticationCodeArgs that = (SendAdminAuthenticationCodeArgs) o;
        return Objects.equals(adminCode, that.adminCode) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(adminCode);
    }

    @Override
    public String toString() {
        return "SendAdminAuthenticationCodeArgs{" +
                "adminCode='" + adminCode + '\'' +

                '}';
    }
}