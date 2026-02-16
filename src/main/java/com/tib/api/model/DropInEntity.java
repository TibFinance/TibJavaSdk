
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.PaymentMethod;
import com.tib.api.model.enums.TransferType;
import com.tib.api.model.enums.AutorizedPaymentMethodFlags;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class DropInEntity   {

    
    /**
     * Gets or sets the customer existings payments.
     */
    @JsonProperty("CustomerExistingsPayments")
    private List<PaymentMethod> customerExistingsPayments;

    /**
     * Gets or sets the amout.
     */
    @JsonProperty("Amout")
    private Double amout;

    /**
     * Defines and manages the type of transfer operation within the system.
     */
    @JsonProperty("TransferType")
    private TransferType transferType;

    /**
     * Gets or sets the authorized payment mode.
     */
    @JsonProperty("AuthorizedPaymentMode")
    private AutorizedPaymentMethodFlags authorizedPaymentMode;

    /**
     * Gets or sets the external reference number used to link this entity with an external system or business process.
     */
    @JsonProperty("ExternalReferenceNumber")
    private String externalReferenceNumber;

    /**
     * Gets or sets the title that identifies the object in a human‑readable way.
     */
    @JsonProperty("Title")
    private String title;

    /**
     * Provides a detailed explanation of the function's purpose and usage within the API.
     */
    @JsonProperty("Description")
    private String description;

    /**
     * Gets or sets the due date for a payment.
     */
    @JsonProperty("PaymentDueDate")
    private LocalDateTime paymentDueDate;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
     * Represents the merchant's unique name.
     */
    @JsonProperty("MerchantName")
    private String merchantName;

    /**
     * 
     */
    @JsonProperty("MerchantPhone")
    private String merchantPhone;

    /**
     * 
     */
    @JsonProperty("MerchantEmail")
    private String merchantEmail;

    /**
     * 
     */
    @JsonProperty("RequestPPAFromCustomer")
    private boolean requestPPAFromCustomer;


    
    public DropInEntity() {
    }

    
    public DropInEntity(List<PaymentMethod> customerExistingsPayments, Double amout, TransferType transferType, AutorizedPaymentMethodFlags authorizedPaymentMode, String externalReferenceNumber, String title, String description, LocalDateTime paymentDueDate, String merchantId, String serviceId, String merchantName, String merchantPhone, String merchantEmail, boolean requestPPAFromCustomer) {
        this.customerExistingsPayments = customerExistingsPayments;
        this.amout = amout;
        this.transferType = transferType;
        this.authorizedPaymentMode = authorizedPaymentMode;
        this.externalReferenceNumber = externalReferenceNumber;
        this.title = title;
        this.description = description;
        this.paymentDueDate = paymentDueDate;
        this.merchantId = merchantId;
        this.serviceId = serviceId;
        this.merchantName = merchantName;
        this.merchantPhone = merchantPhone;
        this.merchantEmail = merchantEmail;
        this.requestPPAFromCustomer = requestPPAFromCustomer;
    }
    
    

    
    public List<PaymentMethod> getCustomerExistingsPayments() {
        return customerExistingsPayments;
    }

    public void setCustomerExistingsPayments(List<PaymentMethod> customerExistingsPayments) {
        this.customerExistingsPayments = customerExistingsPayments;
    }

    public Double getAmout() {
        return amout;
    }

    public void setAmout(Double amout) {
        this.amout = amout;
    }

    public TransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }

    public AutorizedPaymentMethodFlags getAuthorizedPaymentMode() {
        return authorizedPaymentMode;
    }

    public void setAuthorizedPaymentMode(AutorizedPaymentMethodFlags authorizedPaymentMode) {
        this.authorizedPaymentMode = authorizedPaymentMode;
    }

    public String getExternalReferenceNumber() {
        return externalReferenceNumber;
    }

    public void setExternalReferenceNumber(String externalReferenceNumber) {
        this.externalReferenceNumber = externalReferenceNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(LocalDateTime paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantPhone() {
        return merchantPhone;
    }

    public void setMerchantPhone(String merchantPhone) {
        this.merchantPhone = merchantPhone;
    }

    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail;
    }

    public boolean getRequestPPAFromCustomer() {
        return requestPPAFromCustomer;
    }

    public void setRequestPPAFromCustomer(boolean requestPPAFromCustomer) {
        this.requestPPAFromCustomer = requestPPAFromCustomer;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DropInEntity that = (DropInEntity) o;
        return Objects.equals(customerExistingsPayments, that.customerExistingsPayments) && Objects.equals(amout, that.amout) && Objects.equals(transferType, that.transferType) && Objects.equals(authorizedPaymentMode, that.authorizedPaymentMode) && Objects.equals(externalReferenceNumber, that.externalReferenceNumber) && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(paymentDueDate, that.paymentDueDate) && Objects.equals(merchantId, that.merchantId) && Objects.equals(serviceId, that.serviceId) && Objects.equals(merchantName, that.merchantName) && Objects.equals(merchantPhone, that.merchantPhone) && Objects.equals(merchantEmail, that.merchantEmail) && Objects.equals(requestPPAFromCustomer, that.requestPPAFromCustomer) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerExistingsPayments, amout, transferType, authorizedPaymentMode, externalReferenceNumber, title, description, paymentDueDate, merchantId, serviceId, merchantName, merchantPhone, merchantEmail, requestPPAFromCustomer);
    }

    @Override
    public String toString() {
        return "DropInEntity{" +
                "customerExistingsPayments='" + customerExistingsPayments + '\'' +
                ", amout='" + amout + '\'' +
                ", transferType='" + transferType + '\'' +
                ", authorizedPaymentMode='" + authorizedPaymentMode + '\'' +
                ", externalReferenceNumber='" + externalReferenceNumber + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", paymentDueDate='" + paymentDueDate + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", merchantPhone='" + merchantPhone + '\'' +
                ", merchantEmail='" + merchantEmail + '\'' +
                ", requestPPAFromCustomer='" + requestPPAFromCustomer + '\'' +

                '}';
    }
}