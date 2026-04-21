
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.Wallet;
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


public class GetWalletInformationsResponse extends CustomAPIResponse {

    
    @JsonProperty("Wallets")
    private List<Wallet> wallets;


    public GetWalletInformationsResponse() {
    }

    public GetWalletInformationsResponse(Error[] errors, boolean hasError, String messages, List<Wallet> wallets) {
        super(errors, hasError, messages);
        this.wallets = wallets;
    }

    public GetWalletInformationsResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String __rawBody = apiResponse.getRawBody();
            if (__rawBody != null && !__rawBody.isEmpty()) {
                GetWalletInformationsResponse __typed = objectMapper.readValue(__rawBody, GetWalletInformationsResponse.class);
                this.wallets = __typed.wallets;
            }
        }
    }

    
    public List<Wallet> getWallets() {
        return wallets;
    }

    public void setWallets(List<Wallet> wallets) {
        this.wallets = wallets;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetWalletInformationsResponse that = (GetWalletInformationsResponse) o;
        return Objects.equals(wallets, that.wallets) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(wallets);
    }

    @Override
    public String toString() {
        return "GetWalletInformationsResponse{" +
                "wallets='" + wallets + '\'' +

                '}';
    }
}