
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


public class GetBoardingApprovalResponse extends CustomAPIResponse {

    
    @JsonProperty("ApprovalStatus")
    private String approvalStatus;

    @JsonProperty("MerchantName")
    private String merchantName;

    @JsonProperty("MerchantEmail")
    private String merchantEmail;

    @JsonProperty("MerchantId")
    private String merchantId;

    @JsonProperty("SandboxId")
    private String sandboxId;

    @JsonProperty("Processing")
    private String processing;

    @JsonProperty("Payout")
    private String payout;


    public GetBoardingApprovalResponse(Error[] errors, boolean hasError, String messages, String approvalStatus, String merchantName, String merchantEmail, String merchantId, String sandboxId, String processing, String payout) {
        super(errors, hasError, messages);
        this.approvalStatus = approvalStatus;
this.merchantName = merchantName;
this.merchantEmail = merchantEmail;
this.merchantId = merchantId;
this.sandboxId = sandboxId;
this.processing = processing;
this.payout = payout;

    }

    public GetBoardingApprovalResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.approvalStatus = apiResponse.getResponse().toString();
this.merchantName = apiResponse.getResponse().toString();
this.merchantEmail = apiResponse.getResponse().toString();
this.merchantId = apiResponse.getResponse().toString();
this.sandboxId = apiResponse.getResponse().toString();
this.processing = apiResponse.getResponse().toString();
this.payout = apiResponse.getResponse().toString();

        }
    }

    
    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getSandboxId() {
        return sandboxId;
    }

    public void setSandboxId(String sandboxId) {
        this.sandboxId = sandboxId;
    }

    public String getProcessing() {
        return processing;
    }

    public void setProcessing(String processing) {
        this.processing = processing;
    }

    public String getPayout() {
        return payout;
    }

    public void setPayout(String payout) {
        this.payout = payout;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBoardingApprovalResponse that = (GetBoardingApprovalResponse) o;
        return Objects.equals(approvalStatus, that.approvalStatus) && Objects.equals(merchantName, that.merchantName) && Objects.equals(merchantEmail, that.merchantEmail) && Objects.equals(merchantId, that.merchantId) && Objects.equals(sandboxId, that.sandboxId) && Objects.equals(processing, that.processing) && Objects.equals(payout, that.payout) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(approvalStatus, merchantName, merchantEmail, merchantId, sandboxId, processing, payout);
    }

    @Override
    public String toString() {
        return "GetBoardingApprovalResponse{" +
                 "approvalStatus='" + approvalStatus + '\'' +
 ", merchantName='" + merchantName + '\'' +
 ", merchantEmail='" + merchantEmail + '\'' +
 ", merchantId='" + merchantId + '\'' +
 ", sandboxId='" + sandboxId + '\'' +
 ", processing='" + processing + '\'' +
 ", payout='" + payout + '\'' +

                '}';
    }
}