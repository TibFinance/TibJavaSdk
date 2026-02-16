
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


public class AcpTypesResponse extends CustomAPIResponse {

    
    @JsonProperty("CollectMerchantCode")
    private Integer collectMerchantCode;

    @JsonProperty("DepositClientCode")
    private Integer depositClientCode;

    @JsonProperty("CollectClientCode")
    private Integer collectClientCode;

    @JsonProperty("DepositMerchantCode")
    private Integer depositMerchantCode;

    @JsonProperty("FeesmerchantCode")
    private Integer feesmerchantCode;

    @JsonProperty("TibFeesCode")
    private Integer tibFeesCode;


    public AcpTypesResponse(Error[] errors, boolean hasError, String messages, Integer collectMerchantCode, Integer depositClientCode, Integer collectClientCode, Integer depositMerchantCode, Integer feesmerchantCode, Integer tibFeesCode) {
        super(errors, hasError, messages);
        this.collectMerchantCode = collectMerchantCode;
        this.depositClientCode = depositClientCode;
        this.collectClientCode = collectClientCode;
        this.depositMerchantCode = depositMerchantCode;
        this.feesmerchantCode = feesmerchantCode;
        this.tibFeesCode = tibFeesCode;
    }

    public AcpTypesResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.collectMerchantCode = Integer.parseInt(apiResponse.getResponse().toString());
            this.depositClientCode = Integer.parseInt(apiResponse.getResponse().toString());
            this.collectClientCode = Integer.parseInt(apiResponse.getResponse().toString());
            this.depositMerchantCode = Integer.parseInt(apiResponse.getResponse().toString());
            this.feesmerchantCode = Integer.parseInt(apiResponse.getResponse().toString());
            this.tibFeesCode = Integer.parseInt(apiResponse.getResponse().toString());
        }
    }

    
    public Integer getCollectMerchantCode() {
        return collectMerchantCode;
    }

    public void setCollectMerchantCode(Integer collectMerchantCode) {
        this.collectMerchantCode = collectMerchantCode;
    }

    public Integer getDepositClientCode() {
        return depositClientCode;
    }

    public void setDepositClientCode(Integer depositClientCode) {
        this.depositClientCode = depositClientCode;
    }

    public Integer getCollectClientCode() {
        return collectClientCode;
    }

    public void setCollectClientCode(Integer collectClientCode) {
        this.collectClientCode = collectClientCode;
    }

    public Integer getDepositMerchantCode() {
        return depositMerchantCode;
    }

    public void setDepositMerchantCode(Integer depositMerchantCode) {
        this.depositMerchantCode = depositMerchantCode;
    }

    public Integer getFeesmerchantCode() {
        return feesmerchantCode;
    }

    public void setFeesmerchantCode(Integer feesmerchantCode) {
        this.feesmerchantCode = feesmerchantCode;
    }

    public Integer getTibFeesCode() {
        return tibFeesCode;
    }

    public void setTibFeesCode(Integer tibFeesCode) {
        this.tibFeesCode = tibFeesCode;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcpTypesResponse that = (AcpTypesResponse) o;
        return Objects.equals(collectMerchantCode, that.collectMerchantCode) && Objects.equals(depositClientCode, that.depositClientCode) && Objects.equals(collectClientCode, that.collectClientCode) && Objects.equals(depositMerchantCode, that.depositMerchantCode) && Objects.equals(feesmerchantCode, that.feesmerchantCode) && Objects.equals(tibFeesCode, that.tibFeesCode) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(collectMerchantCode, depositClientCode, collectClientCode, depositMerchantCode, feesmerchantCode, tibFeesCode);
    }

    @Override
    public String toString() {
        return "AcpTypesResponse{" +
                "collectMerchantCode='" + collectMerchantCode + '\'' +
                ", depositClientCode='" + depositClientCode + '\'' +
                ", collectClientCode='" + collectClientCode + '\'' +
                ", depositMerchantCode='" + depositMerchantCode + '\'' +
                ", feesmerchantCode='" + feesmerchantCode + '\'' +
                ", tibFeesCode='" + tibFeesCode + '\'' +

                '}';
    }
}