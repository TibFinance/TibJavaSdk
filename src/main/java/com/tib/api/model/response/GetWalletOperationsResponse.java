
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.WalletOperation;
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


public class GetWalletOperationsResponse extends CustomAPIResponse {

    
    @JsonProperty("DailyOperations")
    private List<WalletOperation> dailyOperations;

    @JsonProperty("BalanceBeforeOperations")
    private Double balanceBeforeOperations;

    @JsonProperty("DelayBufferAmount")
    private Double delayBufferAmount;


    public GetWalletOperationsResponse(Error[] errors, boolean hasError, String messages, List<WalletOperation> dailyOperations, Double balanceBeforeOperations, Double delayBufferAmount) {
        super(errors, hasError, messages);
        this.dailyOperations = dailyOperations;
this.balanceBeforeOperations = balanceBeforeOperations;
this.delayBufferAmount = delayBufferAmount;

    }

    public GetWalletOperationsResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.dailyOperations = (List<WalletOperation>) apiResponse.getResponse();
this.balanceBeforeOperations = Double.parseDouble(apiResponse.getResponse().toString());
this.delayBufferAmount = Double.parseDouble(apiResponse.getResponse().toString());

        }
    }

    
    public List<WalletOperation> getDailyOperations() {
        return dailyOperations;
    }

    public void setDailyOperations(List<WalletOperation> dailyOperations) {
        this.dailyOperations = dailyOperations;
    }

    public Double getBalanceBeforeOperations() {
        return balanceBeforeOperations;
    }

    public void setBalanceBeforeOperations(Double balanceBeforeOperations) {
        this.balanceBeforeOperations = balanceBeforeOperations;
    }

    public Double getDelayBufferAmount() {
        return delayBufferAmount;
    }

    public void setDelayBufferAmount(Double delayBufferAmount) {
        this.delayBufferAmount = delayBufferAmount;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetWalletOperationsResponse that = (GetWalletOperationsResponse) o;
        return Objects.equals(dailyOperations, that.dailyOperations) && Objects.equals(balanceBeforeOperations, that.balanceBeforeOperations) && Objects.equals(delayBufferAmount, that.delayBufferAmount) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(dailyOperations, balanceBeforeOperations, delayBufferAmount);
    }

    @Override
    public String toString() {
        return "GetWalletOperationsResponse{" +
                 "dailyOperations='" + dailyOperations + '\'' +
 ", balanceBeforeOperations='" + balanceBeforeOperations + '\'' +
 ", delayBufferAmount='" + delayBufferAmount + '\'' +

                '}';
    }
}