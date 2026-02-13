
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BoardingBaseError;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetBlueSnapClientTokenResultEntity  extends BoardingBaseResult  {

    
    /**
 * 
 */
    @JsonProperty("Token")
    private String token;


    
    public GetBlueSnapClientTokenResultEntity() {
    }

    
    public GetBlueSnapClientTokenResultEntity(String token) {
        this.token = token;

    }
    
    
    public GetBlueSnapClientTokenResultEntity(boolean isSuccess, Integer httpStatusCode, String message, List<BoardingBaseError> errorList, String token) {
        super(isSuccess, httpStatusCode, message, errorList);
        this.token = token;

    }

    
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBlueSnapClientTokenResultEntity that = (GetBlueSnapClientTokenResultEntity) o;
        return Objects.equals(token, that.token) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(token);
    }

    @Override
    public String toString() {
        return "GetBlueSnapClientTokenResultEntity{" +
                 "token='" + token + '\'' +

                '}';
    }
}