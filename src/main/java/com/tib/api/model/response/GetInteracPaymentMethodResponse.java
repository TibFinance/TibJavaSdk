
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetInteracPaymentMethodResponse extends CustomAPIResponse {

    
    @JsonProperty("Question")
    private String question;

    @JsonProperty("Owner")
    private String owner;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Mobile")
    private String mobile;


    public GetInteracPaymentMethodResponse(Error[] errors, boolean hasError, String messages, String question, String owner, String email, String description, String mobile) {
        super(errors, hasError, messages);
        this.question = question;
this.owner = owner;
this.email = email;
this.description = description;
this.mobile = mobile;

    }

    public GetInteracPaymentMethodResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.question = apiResponse.getResponse().toString();
this.owner = apiResponse.getResponse().toString();
this.email = apiResponse.getResponse().toString();
this.description = apiResponse.getResponse().toString();
this.mobile = apiResponse.getResponse().toString();

        }
    }

    
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetInteracPaymentMethodResponse that = (GetInteracPaymentMethodResponse) o;
        return Objects.equals(question, that.question) && Objects.equals(owner, that.owner) && Objects.equals(email, that.email) && Objects.equals(description, that.description) && Objects.equals(mobile, that.mobile) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(question, owner, email, description, mobile);
    }

    @Override
    public String toString() {
        return "GetInteracPaymentMethodResponse{" +
                 "question='" + question + '\'' +
 ", owner='" + owner + '\'' +
 ", email='" + email + '\'' +
 ", description='" + description + '\'' +
 ", mobile='" + mobile + '\'' +

                '}';
    }
}