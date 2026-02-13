
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


public class CreateAdminSessionArgs  implements IBaseCryptedServiceArgs  {

    
    /**
 * The admin code sent by email
 */
    @JsonProperty("TemporaryAdminCode")
    private String temporaryAdminCode;


    
    public CreateAdminSessionArgs() {
    }

    
    public CreateAdminSessionArgs(String temporaryAdminCode) {
        this.temporaryAdminCode = temporaryAdminCode;

    }
    
    

    
    public String getTemporaryAdminCode() {
        return temporaryAdminCode;
    }

    public void setTemporaryAdminCode(String temporaryAdminCode) {
        this.temporaryAdminCode = temporaryAdminCode;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateAdminSessionArgs that = (CreateAdminSessionArgs) o;
        return Objects.equals(temporaryAdminCode, that.temporaryAdminCode) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(temporaryAdminCode);
    }

    @Override
    public String toString() {
        return "CreateAdminSessionArgs{" +
                 "temporaryAdminCode='" + temporaryAdminCode + '\'' +

                '}';
    }
}