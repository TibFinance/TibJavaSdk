
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


public class GetBoardingStatusResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("MerchantId")
    private String merchantId;

    @JsonProperty("MerchantName")
    private String merchantName;

    @JsonProperty("Currency")
    private String currency;

    @JsonProperty("MerchantLanguage")
    private Integer merchantLanguage;

    @JsonProperty("MerchantEmail")
    private String merchantEmail;

    @JsonProperty("AuthorizationStatus")
    private String authorizationStatus;

    @JsonProperty("CreatedDate")
    private LocalDateTime createdDate;

    @JsonProperty("PhoneNumber")
    private String phoneNumber;

    @JsonProperty("MerchantDescription")
    private String merchantDescription;

    @JsonProperty("AccountName")
    private String accountName;

    @JsonProperty("AccountInformation")
    private String accountInformation;

    @JsonProperty("BoardingStatus")
    private String boardingStatus;


    public GetBoardingStatusResponse(Error[] errors, boolean hasError, String messages, String merchantId, String merchantName, String currency, Integer merchantLanguage, String merchantEmail, String authorizationStatus, LocalDateTime createdDate, String phoneNumber, String merchantDescription, String accountName, String accountInformation, String boardingStatus) {
        super(errors, hasError, messages);
        this.merchantId = merchantId;
this.merchantName = merchantName;
this.currency = currency;
this.merchantLanguage = merchantLanguage;
this.merchantEmail = merchantEmail;
this.authorizationStatus = authorizationStatus;
this.createdDate = createdDate;
this.phoneNumber = phoneNumber;
this.merchantDescription = merchantDescription;
this.accountName = accountName;
this.accountInformation = accountInformation;
this.boardingStatus = boardingStatus;

    }

    public GetBoardingStatusResponse(APIResponse apiResponse) {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            this.merchantId = apiResponse.getResponse().toString();
this.merchantName = apiResponse.getResponse().toString();
this.currency = apiResponse.getResponse().toString();
this.merchantLanguage = Integer.parseInt(apiResponse.getResponse().toString());
this.merchantEmail = apiResponse.getResponse().toString();
this.authorizationStatus = apiResponse.getResponse().toString();
this.createdDate = LocalDateTime.parse(apiResponse.getResponse().toString());
this.phoneNumber = apiResponse.getResponse().toString();
this.merchantDescription = apiResponse.getResponse().toString();
this.accountName = apiResponse.getResponse().toString();
this.accountInformation = apiResponse.getResponse().toString();
this.boardingStatus = apiResponse.getResponse().toString();

        }
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getMerchantLanguage() {
        return merchantLanguage;
    }

    public void setMerchantLanguage(Integer merchantLanguage) {
        this.merchantLanguage = merchantLanguage;
    }

    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail;
    }

    public String getAuthorizationStatus() {
        return authorizationStatus;
    }

    public void setAuthorizationStatus(String authorizationStatus) {
        this.authorizationStatus = authorizationStatus;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMerchantDescription() {
        return merchantDescription;
    }

    public void setMerchantDescription(String merchantDescription) {
        this.merchantDescription = merchantDescription;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountInformation() {
        return accountInformation;
    }

    public void setAccountInformation(String accountInformation) {
        this.accountInformation = accountInformation;
    }

    public String getBoardingStatus() {
        return boardingStatus;
    }

    public void setBoardingStatus(String boardingStatus) {
        this.boardingStatus = boardingStatus;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBoardingStatusResponse that = (GetBoardingStatusResponse) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(merchantName, that.merchantName) && Objects.equals(currency, that.currency) && Objects.equals(merchantLanguage, that.merchantLanguage) && Objects.equals(merchantEmail, that.merchantEmail) && Objects.equals(authorizationStatus, that.authorizationStatus) && Objects.equals(createdDate, that.createdDate) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(merchantDescription, that.merchantDescription) && Objects.equals(accountName, that.accountName) && Objects.equals(accountInformation, that.accountInformation) && Objects.equals(boardingStatus, that.boardingStatus) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, merchantName, currency, merchantLanguage, merchantEmail, authorizationStatus, createdDate, phoneNumber, merchantDescription, accountName, accountInformation, boardingStatus);
    }

    @Override
    public String toString() {
        return "GetBoardingStatusResponse{" +
                 "merchantId='" + merchantId + '\'' +
 ", merchantName='" + merchantName + '\'' +
 ", currency='" + currency + '\'' +
 ", merchantLanguage='" + merchantLanguage + '\'' +
 ", merchantEmail='" + merchantEmail + '\'' +
 ", authorizationStatus='" + authorizationStatus + '\'' +
 ", createdDate='" + createdDate + '\'' +
 ", phoneNumber='" + phoneNumber + '\'' +
 ", merchantDescription='" + merchantDescription + '\'' +
 ", accountName='" + accountName + '\'' +
 ", accountInformation='" + accountInformation + '\'' +
 ", boardingStatus='" + boardingStatus + '\'' +

                '}';
    }
}