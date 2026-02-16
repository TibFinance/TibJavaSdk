
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.TransferPayload;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class TransferPendingProcessPayload  extends BaseEventPayload  {

    
    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * Retrieves or assigns the service's name.
     */
    @JsonProperty("ServiceName")
    private String serviceName;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Identifier of the merchant in an external system
     */
    @JsonProperty("MerchantExternalSystemId")
    private String merchantExternalSystemId;

    /**
     * Identifier of the merchant's external system group.
     */
    @JsonProperty("MerchantExternalSystemGroupId")
    private String merchantExternalSystemGroupId;

    /**
     * Represents the merchant's unique name.
     */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
     * Indicates whether the payment is processed automatically without user intervention.
     */
    @JsonProperty("IsAutomaticPayment")
    private boolean isAutomaticPayment;

    /**
     * Contains metadata for a payment operation.
     */
    @JsonProperty("PaymentInfo")
    private TransferPayload paymentInfo;

    /**
     * Flag used to indicate that the payment is resolved in the third‑party system. It is employed solely for filtering payment lists.
     */
    @JsonProperty("IsMarkResolved")
    private boolean isMarkResolved;

    /**
     * Current processing state of a transaction or operation.
     */
    @JsonProperty("CurrentStatus")
    private Integer currentStatus;

    /**
     * The date and time when the payment was created.
     */
    @JsonProperty("CreatedDate")
    private String createdDate;

    /**
     * Provides a detailed description of the payment method for easy identification.
     */
    @JsonProperty("PaymentMethodDescription")
    private String paymentMethodDescription;

    /**
     * Provides a read‑only preview of the merchant’s bank account information.
     */
    @JsonProperty("AccountInformationPreview")
    private String accountInformationPreview;

    /**
     * Identifies the type of payment method linked to a specific account.
     */
    @JsonProperty("PaymentMethodType")
    private Integer paymentMethodType;

    /**
     * 
     */
    @JsonProperty("PreCalculatedFees")
    private Double preCalculatedFees;


    
    public TransferPendingProcessPayload() {
    }

    
    public TransferPendingProcessPayload(String serviceId, String serviceName, String merchantId, String merchantExternalSystemId, String merchantExternalSystemGroupId, String merchantName, boolean isAutomaticPayment, TransferPayload paymentInfo, boolean isMarkResolved, Integer currentStatus, String createdDate, String paymentMethodDescription, String accountInformationPreview, Integer paymentMethodType, Double preCalculatedFees) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.merchantId = merchantId;
        this.merchantExternalSystemId = merchantExternalSystemId;
        this.merchantExternalSystemGroupId = merchantExternalSystemGroupId;
        this.merchantName = merchantName;
        this.isAutomaticPayment = isAutomaticPayment;
        this.paymentInfo = paymentInfo;
        this.isMarkResolved = isMarkResolved;
        this.currentStatus = currentStatus;
        this.createdDate = createdDate;
        this.paymentMethodDescription = paymentMethodDescription;
        this.accountInformationPreview = accountInformationPreview;
        this.paymentMethodType = paymentMethodType;
        this.preCalculatedFees = preCalculatedFees;
    }
    
    
    public TransferPendingProcessPayload(String eventName, String serviceId, String serviceName, String merchantId, String merchantExternalSystemId, String merchantExternalSystemGroupId, String merchantName, boolean isAutomaticPayment, TransferPayload paymentInfo, boolean isMarkResolved, Integer currentStatus, String createdDate, String paymentMethodDescription, String accountInformationPreview, Integer paymentMethodType, Double preCalculatedFees) {
        super(eventName);
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.merchantId = merchantId;
        this.merchantExternalSystemId = merchantExternalSystemId;
        this.merchantExternalSystemGroupId = merchantExternalSystemGroupId;
        this.merchantName = merchantName;
        this.isAutomaticPayment = isAutomaticPayment;
        this.paymentInfo = paymentInfo;
        this.isMarkResolved = isMarkResolved;
        this.currentStatus = currentStatus;
        this.createdDate = createdDate;
        this.paymentMethodDescription = paymentMethodDescription;
        this.accountInformationPreview = accountInformationPreview;
        this.paymentMethodType = paymentMethodType;
        this.preCalculatedFees = preCalculatedFees;
    }

    
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantExternalSystemId() {
        return merchantExternalSystemId;
    }

    public void setMerchantExternalSystemId(String merchantExternalSystemId) {
        this.merchantExternalSystemId = merchantExternalSystemId;
    }

    public String getMerchantExternalSystemGroupId() {
        return merchantExternalSystemGroupId;
    }

    public void setMerchantExternalSystemGroupId(String merchantExternalSystemGroupId) {
        this.merchantExternalSystemGroupId = merchantExternalSystemGroupId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public boolean getIsAutomaticPayment() {
        return isAutomaticPayment;
    }

    public void setIsAutomaticPayment(boolean isAutomaticPayment) {
        this.isAutomaticPayment = isAutomaticPayment;
    }

    public TransferPayload getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(TransferPayload paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public boolean getIsMarkResolved() {
        return isMarkResolved;
    }

    public void setIsMarkResolved(boolean isMarkResolved) {
        this.isMarkResolved = isMarkResolved;
    }

    public Integer getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(Integer currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getPaymentMethodDescription() {
        return paymentMethodDescription;
    }

    public void setPaymentMethodDescription(String paymentMethodDescription) {
        this.paymentMethodDescription = paymentMethodDescription;
    }

    public String getAccountInformationPreview() {
        return accountInformationPreview;
    }

    public void setAccountInformationPreview(String accountInformationPreview) {
        this.accountInformationPreview = accountInformationPreview;
    }

    public Integer getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(Integer paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public Double getPreCalculatedFees() {
        return preCalculatedFees;
    }

    public void setPreCalculatedFees(Double preCalculatedFees) {
        this.preCalculatedFees = preCalculatedFees;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferPendingProcessPayload that = (TransferPendingProcessPayload) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(serviceName, that.serviceName) && Objects.equals(merchantId, that.merchantId) && Objects.equals(merchantExternalSystemId, that.merchantExternalSystemId) && Objects.equals(merchantExternalSystemGroupId, that.merchantExternalSystemGroupId) && Objects.equals(merchantName, that.merchantName) && Objects.equals(isAutomaticPayment, that.isAutomaticPayment) && Objects.equals(paymentInfo, that.paymentInfo) && Objects.equals(isMarkResolved, that.isMarkResolved) && Objects.equals(currentStatus, that.currentStatus) && Objects.equals(createdDate, that.createdDate) && Objects.equals(paymentMethodDescription, that.paymentMethodDescription) && Objects.equals(accountInformationPreview, that.accountInformationPreview) && Objects.equals(paymentMethodType, that.paymentMethodType) && Objects.equals(preCalculatedFees, that.preCalculatedFees) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, serviceName, merchantId, merchantExternalSystemId, merchantExternalSystemGroupId, merchantName, isAutomaticPayment, paymentInfo, isMarkResolved, currentStatus, createdDate, paymentMethodDescription, accountInformationPreview, paymentMethodType, preCalculatedFees);
    }

    @Override
    public String toString() {
        return "TransferPendingProcessPayload{" +
                "serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", merchantExternalSystemId='" + merchantExternalSystemId + '\'' +
                ", merchantExternalSystemGroupId='" + merchantExternalSystemGroupId + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", isAutomaticPayment='" + isAutomaticPayment + '\'' +
                ", paymentInfo='" + paymentInfo + '\'' +
                ", isMarkResolved='" + isMarkResolved + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", paymentMethodDescription='" + paymentMethodDescription + '\'' +
                ", accountInformationPreview='" + accountInformationPreview + '\'' +
                ", paymentMethodType='" + paymentMethodType + '\'' +
                ", preCalculatedFees='" + preCalculatedFees + '\'' +

                '}';
    }
}