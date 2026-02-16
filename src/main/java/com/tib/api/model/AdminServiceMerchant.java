
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class AdminServiceMerchant   {

    
    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * 
     */
    @JsonProperty("MerchantAccountId")
    private String merchantAccountId;

    /**
     * Retrieves or assigns the service's name.
     */
    @JsonProperty("ServiceName")
    private String serviceName;

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
     * The merchant's phone number used for contact and transaction notifications.
     */
    @JsonProperty("PhoneNumber")
    private String phoneNumber;

    /**
     * Contains a free‑text description of the merchant, which is stored in the TIB Finance system and displayed in merchant records.
     */
    @JsonProperty("MerchantDescription")
    private String merchantDescription;

    /**
     * Represents the name associated with the merchant's account.
     */
    @JsonProperty("AccountName")
    private String accountName;

    /**
     * 
     */
    @JsonProperty("AccountInformationView")
    private String accountInformationView;

    /**
     * 
     */
    @JsonProperty("IsActive")
    private boolean isActive;

    /**
     * 
     */
    @JsonProperty("IsDeletedService")
    private boolean isDeletedService;

    /**
     * 
     */
    @JsonProperty("IsDeletedMerchant")
    private boolean isDeletedMerchant;

    /**
     * 
     */
    @JsonProperty("IsAuthorizedMerchant")
    private boolean isAuthorizedMerchant;

    /**
     * 
     */
    @JsonProperty("IsClientMerchant")
    private boolean isClientMerchant;

    /**
     * Retrieves or assigns the unique identifier for WhiteLabeling.
     */
    @JsonProperty("WhiteLabelingId")
    private String whiteLabelingId;

    /**
     * 
     */
    @JsonProperty("DefaultStatementDescription")
    private String defaultStatementDescription;

    /**
     * 
     */
    @JsonProperty("CreatedDateService")
    private LocalDateTime createdDateService;

    /**
     * 
     */
    @JsonProperty("CreatedDateMerchant")
    private LocalDateTime createdDateMerchant;

    /**
     * 
     */
    @JsonProperty("IsDeletedMerchantAccount")
    private boolean isDeletedMerchantAccount;

    /**
     * 
     */
    @JsonProperty("IsActiveService")
    private boolean isActiveService;

    /**
     * 
     */
    @JsonProperty("IsChecked")
    private boolean isChecked;


    
    public AdminServiceMerchant() {
    }

    
    public AdminServiceMerchant(String serviceId, String merchantId, String merchantAccountId, String serviceName, String merchantName, String merchantEmail, String phoneNumber, String merchantDescription, String accountName, String accountInformationView, boolean isActive, boolean isDeletedService, boolean isDeletedMerchant, boolean isAuthorizedMerchant, boolean isClientMerchant, String whiteLabelingId, String defaultStatementDescription, LocalDateTime createdDateService, LocalDateTime createdDateMerchant, boolean isDeletedMerchantAccount, boolean isActiveService, boolean isChecked) {
        this.serviceId = serviceId;
        this.merchantId = merchantId;
        this.merchantAccountId = merchantAccountId;
        this.serviceName = serviceName;
        this.merchantName = merchantName;
        this.merchantEmail = merchantEmail;
        this.phoneNumber = phoneNumber;
        this.merchantDescription = merchantDescription;
        this.accountName = accountName;
        this.accountInformationView = accountInformationView;
        this.isActive = isActive;
        this.isDeletedService = isDeletedService;
        this.isDeletedMerchant = isDeletedMerchant;
        this.isAuthorizedMerchant = isAuthorizedMerchant;
        this.isClientMerchant = isClientMerchant;
        this.whiteLabelingId = whiteLabelingId;
        this.defaultStatementDescription = defaultStatementDescription;
        this.createdDateService = createdDateService;
        this.createdDateMerchant = createdDateMerchant;
        this.isDeletedMerchantAccount = isDeletedMerchantAccount;
        this.isActiveService = isActiveService;
        this.isChecked = isChecked;
    }
    
    

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantAccountId() {
        return merchantAccountId;
    }

    public void setMerchantAccountId(String merchantAccountId) {
        this.merchantAccountId = merchantAccountId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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

    public String getAccountInformationView() {
        return accountInformationView;
    }

    public void setAccountInformationView(String accountInformationView) {
        this.accountInformationView = accountInformationView;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsDeletedService() {
        return isDeletedService;
    }

    public void setIsDeletedService(boolean isDeletedService) {
        this.isDeletedService = isDeletedService;
    }

    public boolean getIsDeletedMerchant() {
        return isDeletedMerchant;
    }

    public void setIsDeletedMerchant(boolean isDeletedMerchant) {
        this.isDeletedMerchant = isDeletedMerchant;
    }

    public boolean getIsAuthorizedMerchant() {
        return isAuthorizedMerchant;
    }

    public void setIsAuthorizedMerchant(boolean isAuthorizedMerchant) {
        this.isAuthorizedMerchant = isAuthorizedMerchant;
    }

    public boolean getIsClientMerchant() {
        return isClientMerchant;
    }

    public void setIsClientMerchant(boolean isClientMerchant) {
        this.isClientMerchant = isClientMerchant;
    }

    public String getWhiteLabelingId() {
        return whiteLabelingId;
    }

    public void setWhiteLabelingId(String whiteLabelingId) {
        this.whiteLabelingId = whiteLabelingId;
    }

    public String getDefaultStatementDescription() {
        return defaultStatementDescription;
    }

    public void setDefaultStatementDescription(String defaultStatementDescription) {
        this.defaultStatementDescription = defaultStatementDescription;
    }

    public LocalDateTime getCreatedDateService() {
        return createdDateService;
    }

    public void setCreatedDateService(LocalDateTime createdDateService) {
        this.createdDateService = createdDateService;
    }

    public LocalDateTime getCreatedDateMerchant() {
        return createdDateMerchant;
    }

    public void setCreatedDateMerchant(LocalDateTime createdDateMerchant) {
        this.createdDateMerchant = createdDateMerchant;
    }

    public boolean getIsDeletedMerchantAccount() {
        return isDeletedMerchantAccount;
    }

    public void setIsDeletedMerchantAccount(boolean isDeletedMerchantAccount) {
        this.isDeletedMerchantAccount = isDeletedMerchantAccount;
    }

    public boolean getIsActiveService() {
        return isActiveService;
    }

    public void setIsActiveService(boolean isActiveService) {
        this.isActiveService = isActiveService;
    }

    public boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminServiceMerchant that = (AdminServiceMerchant) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(merchantAccountId, that.merchantAccountId) && Objects.equals(serviceName, that.serviceName) && Objects.equals(merchantName, that.merchantName) && Objects.equals(merchantEmail, that.merchantEmail) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(merchantDescription, that.merchantDescription) && Objects.equals(accountName, that.accountName) && Objects.equals(accountInformationView, that.accountInformationView) && Objects.equals(isActive, that.isActive) && Objects.equals(isDeletedService, that.isDeletedService) && Objects.equals(isDeletedMerchant, that.isDeletedMerchant) && Objects.equals(isAuthorizedMerchant, that.isAuthorizedMerchant) && Objects.equals(isClientMerchant, that.isClientMerchant) && Objects.equals(whiteLabelingId, that.whiteLabelingId) && Objects.equals(defaultStatementDescription, that.defaultStatementDescription) && Objects.equals(createdDateService, that.createdDateService) && Objects.equals(createdDateMerchant, that.createdDateMerchant) && Objects.equals(isDeletedMerchantAccount, that.isDeletedMerchantAccount) && Objects.equals(isActiveService, that.isActiveService) && Objects.equals(isChecked, that.isChecked) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, merchantId, merchantAccountId, serviceName, merchantName, merchantEmail, phoneNumber, merchantDescription, accountName, accountInformationView, isActive, isDeletedService, isDeletedMerchant, isAuthorizedMerchant, isClientMerchant, whiteLabelingId, defaultStatementDescription, createdDateService, createdDateMerchant, isDeletedMerchantAccount, isActiveService, isChecked);
    }

    @Override
    public String toString() {
        return "AdminServiceMerchant{" +
                "serviceId='" + serviceId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", merchantAccountId='" + merchantAccountId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", merchantEmail='" + merchantEmail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", merchantDescription='" + merchantDescription + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountInformationView='" + accountInformationView + '\'' +
                ", isActive='" + isActive + '\'' +
                ", isDeletedService='" + isDeletedService + '\'' +
                ", isDeletedMerchant='" + isDeletedMerchant + '\'' +
                ", isAuthorizedMerchant='" + isAuthorizedMerchant + '\'' +
                ", isClientMerchant='" + isClientMerchant + '\'' +
                ", whiteLabelingId='" + whiteLabelingId + '\'' +
                ", defaultStatementDescription='" + defaultStatementDescription + '\'' +
                ", createdDateService='" + createdDateService + '\'' +
                ", createdDateMerchant='" + createdDateMerchant + '\'' +
                ", isDeletedMerchantAccount='" + isDeletedMerchantAccount + '\'' +
                ", isActiveService='" + isActiveService + '\'' +
                ", isChecked='" + isChecked + '\'' +

                '}';
    }
}