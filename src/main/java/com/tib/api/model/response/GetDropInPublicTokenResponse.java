
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.response.CustomAPIResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.tib.api.client.FlexibleOffsetDateTimeDeserializer;


import java.io.UncheckedIOException;
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
public class GetDropInPublicTokenResponse extends CustomAPIResponse {

    
    @JsonProperty("PublicTokenId")
    private String publicTokenId;


    public GetDropInPublicTokenResponse() {
    }

    public GetDropInPublicTokenResponse(Error[] errors, boolean hasError, String messages, String publicTokenId) {
        super(errors, hasError, messages);
        this.publicTokenId = publicTokenId;
    }

    public GetDropInPublicTokenResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        readPayload(apiResponse, objectMapper);
    }

    /**
     * @deprecated Since 3.1.0. Use {@link #GetDropInPublicTokenResponse(APIResponse, ObjectMapper)}, as Portal does.
     * This form reads the answer with an ObjectMapper configured like the one TibInvoker.init builds.
     * It reads {@link APIResponse#getRawBody()} only: a value set with setResponse() does not reach this class.
     */
    @Deprecated
    public GetDropInPublicTokenResponse(APIResponse apiResponse) {
        super(apiResponse);
        try {
            readPayload(apiResponse, new ObjectMapper()
                    .registerModule(new JavaTimeModule())
                    .registerModule(new SimpleModule().addDeserializer(OffsetDateTime.class, new FlexibleOffsetDateTimeDeserializer()))
                    .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false));
        } catch (JsonProcessingException e) {
            throw new UncheckedIOException(e);
        }
    }

    private void readPayload(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        String __rawBody = apiResponse.getRawBody();
        if (__rawBody == null || __rawBody.isEmpty()) {
            return;
        }
        try {
            GetDropInPublicTokenResponse __typed = objectMapper.readValue(__rawBody, GetDropInPublicTokenResponse.class);
            this.publicTokenId = __typed.publicTokenId;
        } catch (JsonProcessingException | RuntimeException e) {
            if (!apiResponse.isHasError()) {
                throw e;
            }
        }
    }

    
    public String getPublicTokenId() {
        return publicTokenId;
    }

    public void setPublicTokenId(String publicTokenId) {
        this.publicTokenId = publicTokenId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetDropInPublicTokenResponse that = (GetDropInPublicTokenResponse) o;
        return Objects.equals(publicTokenId, that.publicTokenId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(publicTokenId);
    }

    @Override
    public String toString() {
        return "GetDropInPublicTokenResponse{" +
                "publicTokenId='" + publicTokenId + '\'' +

                '}';
    }
}