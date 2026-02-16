
package com.tib.api.model;

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


public class BoardingBaseError   {

    
    /**
     * 
     */
    @JsonProperty("ErrorName")
    private String errorName;

    /**
     * 
     */
    @JsonProperty("Code")
    private String code;

    /**
     * Provides a detailed explanation of the function's purpose and usage within the API.
     */
    @JsonProperty("Description")
    private String description;


    
    public BoardingBaseError() {
    }

    
    public BoardingBaseError(String errorName, String code, String description) {
        this.errorName = errorName;
        this.code = code;
        this.description = description;
    }
    
    

    
    public String getErrorName() {
        return errorName;
    }

    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingBaseError that = (BoardingBaseError) o;
        return Objects.equals(errorName, that.errorName) && Objects.equals(code, that.code) && Objects.equals(description, that.description) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(errorName, code, description);
    }

    @Override
    public String toString() {
        return "BoardingBaseError{" +
                "errorName='" + errorName + '\'' +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +

                '}';
    }
}