
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


public class InItBoardingApiResponse extends CustomAPIResponse {

    
    @JsonProperty("NoOfPendingBoarding")
    private Integer noOfPendingBoarding;

    @JsonProperty("NoOfActiveBoarding")
    private Integer noOfActiveBoarding;


    public InItBoardingApiResponse(Error[] errors, boolean hasError, String messages, Integer noOfPendingBoarding, Integer noOfActiveBoarding) {
        super(errors, hasError, messages);
        this.noOfPendingBoarding = noOfPendingBoarding;
this.noOfActiveBoarding = noOfActiveBoarding;

    }

    public InItBoardingApiResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.noOfPendingBoarding = Integer.parseInt(apiResponse.getResponse().toString());
this.noOfActiveBoarding = Integer.parseInt(apiResponse.getResponse().toString());

        }
    }

    
    public Integer getNoOfPendingBoarding() {
        return noOfPendingBoarding;
    }

    public void setNoOfPendingBoarding(Integer noOfPendingBoarding) {
        this.noOfPendingBoarding = noOfPendingBoarding;
    }

    public Integer getNoOfActiveBoarding() {
        return noOfActiveBoarding;
    }

    public void setNoOfActiveBoarding(Integer noOfActiveBoarding) {
        this.noOfActiveBoarding = noOfActiveBoarding;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InItBoardingApiResponse that = (InItBoardingApiResponse) o;
        return Objects.equals(noOfPendingBoarding, that.noOfPendingBoarding) && Objects.equals(noOfActiveBoarding, that.noOfActiveBoarding) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(noOfPendingBoarding, noOfActiveBoarding);
    }

    @Override
    public String toString() {
        return "InItBoardingApiResponse{" +
                 "noOfPendingBoarding='" + noOfPendingBoarding + '\'' +
 ", noOfActiveBoarding='" + noOfActiveBoarding + '\'' +

                '}';
    }
}