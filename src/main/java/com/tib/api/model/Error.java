package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Error {

    @JsonProperty("ErrorMessage")
    private String errorMessage;

    @JsonProperty("ErrorCode")
    private Integer errorCode;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Error error = (Error) o;
        return Objects.equals(errorMessage, error.errorMessage) &&
                Objects.equals(errorCode, error.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorMessage, errorCode);
    }

    @Override
    public String toString() {
        return "Error{" +
                "ErrorMessage='" + errorMessage + '\'' +
                ", ErrorCode=" + errorCode +
                '}';
    }
}
