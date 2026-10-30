
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.ContactInfo;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveCustomerContactInfoResponse extends CustomAPIResponse {

    
    @JsonProperty("ContactInfo")
    private ContactInfo contactInfo;


    public SaveCustomerContactInfoResponse() {
    }

    public SaveCustomerContactInfoResponse(Error[] errors, boolean hasError, String messages, ContactInfo contactInfo) {
        super(errors, hasError, messages);
        this.contactInfo = contactInfo;
    }

    public SaveCustomerContactInfoResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        readPayload(apiResponse, objectMapper);
    }

    private void readPayload(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        String __rawBody = apiResponse.getRawBody();
        if (__rawBody == null || __rawBody.isEmpty()) {
            return;
        }
        try {
            SaveCustomerContactInfoResponse __typed = objectMapper.readValue(__rawBody, SaveCustomerContactInfoResponse.class);
            this.contactInfo = __typed.contactInfo;
        } catch (JsonProcessingException | RuntimeException e) {
            if (!apiResponse.isHasError()) {
                throw e;
            }
        }
    }

    
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveCustomerContactInfoResponse that = (SaveCustomerContactInfoResponse) o;
        return Objects.equals(contactInfo, that.contactInfo) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(contactInfo);
    }

    @Override
    public String toString() {
        return "SaveCustomerContactInfoResponse{" +
                "contactInfo='" + contactInfo + '\'' +

                '}';
    }
}