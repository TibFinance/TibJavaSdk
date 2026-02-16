
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


public class BoardingBaseResult   {

    
    /**
     * 
     */
    @JsonProperty("IsSuccess")
    private boolean isSuccess;

    /**
     * 
     */
    @JsonProperty("HttpStatusCode")
    private Integer httpStatusCode;

    /**
     * Represents a textual message within the system, used for communication or logging purposes.
     */
    @JsonProperty("Message")
    private String message;

    /**
     * 
     */
    @JsonProperty("ErrorList")
    private List<BoardingBaseError> errorList;


    
    public BoardingBaseResult() {
    }

    
    public BoardingBaseResult(boolean isSuccess, Integer httpStatusCode, String message, List<BoardingBaseError> errorList) {
        this.isSuccess = isSuccess;
        this.httpStatusCode = httpStatusCode;
        this.message = message;
        this.errorList = errorList;
    }
    
    

    
    public boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<BoardingBaseError> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<BoardingBaseError> errorList) {
        this.errorList = errorList;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingBaseResult that = (BoardingBaseResult) o;
        return Objects.equals(isSuccess, that.isSuccess) && Objects.equals(httpStatusCode, that.httpStatusCode) && Objects.equals(message, that.message) && Objects.equals(errorList, that.errorList) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, httpStatusCode, message, errorList);
    }

    @Override
    public String toString() {
        return "BoardingBaseResult{" +
                "isSuccess='" + isSuccess + '\'' +
                ", httpStatusCode='" + httpStatusCode + '\'' +
                ", message='" + message + '\'' +
                ", errorList='" + errorList + '\'' +

                '}';
    }
}