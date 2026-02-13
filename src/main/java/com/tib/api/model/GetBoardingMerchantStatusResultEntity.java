
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BoardingBaseError;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetBoardingMerchantStatusResultEntity  extends BoardingBaseResult  {

    
    /**
 * Represents the merchant's unique name.
 */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
 * 
 */
    @JsonProperty("MerchantEmail")
    private String merchantEmail;

    /**
 * 
 */
    @JsonProperty("ProviderMerchantId")
    private String providerMerchantId;

    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
 * 
 */
    @JsonProperty("SandboxId")
    private String sandboxId;

    /**
 * 
 */
    @JsonProperty("Processing")
    private String processing;

    /**
 * 
 */
    @JsonProperty("Payout")
    private String payout;


    
    public GetBoardingMerchantStatusResultEntity() {
    }

    
    public GetBoardingMerchantStatusResultEntity(String merchantName, String merchantEmail, String providerMerchantId, String merchantId, String sandboxId, String processing, String payout) {
        this.merchantName = merchantName;
this.merchantEmail = merchantEmail;
this.providerMerchantId = providerMerchantId;
this.merchantId = merchantId;
this.sandboxId = sandboxId;
this.processing = processing;
this.payout = payout;

    }
    
    
    public GetBoardingMerchantStatusResultEntity(boolean isSuccess, Integer httpStatusCode, String message, List<BoardingBaseError> errorList, String merchantName, String merchantEmail, String providerMerchantId, String merchantId, String sandboxId, String processing, String payout) {
        super(isSuccess, httpStatusCode, message, errorList);
        this.merchantName = merchantName;
this.merchantEmail = merchantEmail;
this.providerMerchantId = providerMerchantId;
this.merchantId = merchantId;
this.sandboxId = sandboxId;
this.processing = processing;
this.payout = payout;

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

    public String getProviderMerchantId() {
        return providerMerchantId;
    }

    public void setProviderMerchantId(String providerMerchantId) {
        this.providerMerchantId = providerMerchantId;
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
        GetBoardingMerchantStatusResultEntity that = (GetBoardingMerchantStatusResultEntity) o;
        return Objects.equals(merchantName, that.merchantName) && Objects.equals(merchantEmail, that.merchantEmail) && Objects.equals(providerMerchantId, that.providerMerchantId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(sandboxId, that.sandboxId) && Objects.equals(processing, that.processing) && Objects.equals(payout, that.payout) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantName, merchantEmail, providerMerchantId, merchantId, sandboxId, processing, payout);
    }

    @Override
    public String toString() {
        return "GetBoardingMerchantStatusResultEntity{" +
                 "merchantName='" + merchantName + '\'' +
 ", merchantEmail='" + merchantEmail + '\'' +
 ", providerMerchantId='" + providerMerchantId + '\'' +
 ", merchantId='" + merchantId + '\'' +
 ", sandboxId='" + sandboxId + '\'' +
 ", processing='" + processing + '\'' +
 ", payout='" + payout + '\'' +

                '}';
    }
}