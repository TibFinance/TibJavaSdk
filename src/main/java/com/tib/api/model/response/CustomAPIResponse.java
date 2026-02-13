package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Error;

import java.util.Arrays;
import java.util.Objects;

public class CustomAPIResponse {

    @JsonProperty("Errors")
    private Error[] errors;

    @JsonProperty("HasError")
    private boolean hasError;

    @JsonProperty("Messages")
    private String messages;

    public CustomAPIResponse(Error[] errors, boolean hasError, String messages) {
        this.errors = errors;
        this.hasError = hasError;
        this.messages = messages;
    }

    public CustomAPIResponse(APIResponse apiResponse) {

        this.errors = apiResponse.getErrors();
        this.hasError = apiResponse.isHasError();
        this.messages = apiResponse.getMessages();
    }

    public Error[] getErrors() {
        return errors;
    }

    public void setErrors(Error[] errors) {
        this.errors = errors;
    }

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CustomAPIResponse that = (CustomAPIResponse) o;
        return hasError == that.hasError &&
                Arrays.equals(errors, that.errors) &&
                Objects.equals(messages, that.messages);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(hasError, messages);
        result = 31 * result + Arrays.hashCode(errors);
        return result;
    }

    @Override
    public String toString() {
        return "CustomAPIResponse{" +
                "errors=" + Arrays.toString(errors) +
                ", hasError=" + hasError +
                ", messages='" + messages + '\'' +
                '}';
    }
}
