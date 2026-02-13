
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


public class FinalizeTransferWithExternalSupplierFinancialInformationsResponse extends CustomAPIResponse {

    
    @JsonProperty("Link")
    private String link;


    public FinalizeTransferWithExternalSupplierFinancialInformationsResponse(Error[] errors, boolean hasError, String messages, String link) {
        super(errors, hasError, messages);
        this.link = link;

    }

    public FinalizeTransferWithExternalSupplierFinancialInformationsResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.link = apiResponse.getResponse().toString();

        }
    }

    
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinalizeTransferWithExternalSupplierFinancialInformationsResponse that = (FinalizeTransferWithExternalSupplierFinancialInformationsResponse) o;
        return Objects.equals(link, that.link) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(link);
    }

    @Override
    public String toString() {
        return "FinalizeTransferWithExternalSupplierFinancialInformationsResponse{" +
                 "link='" + link + '\'' +

                '}';
    }
}