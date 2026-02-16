
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


public class GetDropInPublicTokenResponse extends CustomAPIResponse {

    
    @JsonProperty("PublicTokenId")
    private String publicTokenId;


    public GetDropInPublicTokenResponse(Error[] errors, boolean hasError, String messages, String publicTokenId) {
        super(errors, hasError, messages);
        this.publicTokenId = publicTokenId;
    }

    public GetDropInPublicTokenResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.publicTokenId = apiResponse.getResponse().toString();
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