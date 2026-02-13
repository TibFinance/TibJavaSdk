
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.PaymentEntity;
import com.tib.api.model.enums.ProcessStatus;
import com.tib.api.model.enums.PaymentMethodType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class PaymentBaseWithHierarchy  extends PaymentBase  {

    
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
 * Gets a value indicating whether the merchant is overloaded.
 */
    @JsonProperty("IsOverlodedMerchant")
    private boolean isOverlodedMerchant;


    
    public PaymentBaseWithHierarchy() {
    }

    
    public PaymentBaseWithHierarchy(String serviceId, String serviceName, String merchantId, String merchantExternalSystemId, String merchantExternalSystemGroupId, String merchantName, boolean isOverlodedMerchant) {
        this.serviceId = serviceId;
this.serviceName = serviceName;
this.merchantId = merchantId;
this.merchantExternalSystemId = merchantExternalSystemId;
this.merchantExternalSystemGroupId = merchantExternalSystemGroupId;
this.merchantName = merchantName;
this.isOverlodedMerchant = isOverlodedMerchant;

    }
    
    
    public PaymentBaseWithHierarchy(String billId, String billExternalSystemNumber1, String billExternalSystemNumber2, String billExternalSystemNumber3, String billTitle, String relatedCustomerId, String relatedCustomerExternalId, String billDescription, String paymentId, boolean isAutomaticPayment, PaymentEntity paymentInfo, boolean isMarkResolved, ProcessStatus currentStatus, Double convenientFeeCreditCard, Double convenientFeeDirectAccount, LocalDateTime createdDate, String paymentMethodDescription, String accountInformationPreview, PaymentMethodType paymentMethodType, String serviceId, String serviceName, String merchantId, String merchantExternalSystemId, String merchantExternalSystemGroupId, String merchantName, boolean isOverlodedMerchant) {
        super(billId, billExternalSystemNumber1, billExternalSystemNumber2, billExternalSystemNumber3, billTitle, relatedCustomerId, relatedCustomerExternalId, billDescription, paymentId, isAutomaticPayment, paymentInfo, isMarkResolved, currentStatus, convenientFeeCreditCard, convenientFeeDirectAccount, createdDate, paymentMethodDescription, accountInformationPreview, paymentMethodType);
        this.serviceId = serviceId;
this.serviceName = serviceName;
this.merchantId = merchantId;
this.merchantExternalSystemId = merchantExternalSystemId;
this.merchantExternalSystemGroupId = merchantExternalSystemGroupId;
this.merchantName = merchantName;
this.isOverlodedMerchant = isOverlodedMerchant;

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

    public boolean getIsOverlodedMerchant() {
        return isOverlodedMerchant;
    }

    public void setIsOverlodedMerchant(boolean isOverlodedMerchant) {
        this.isOverlodedMerchant = isOverlodedMerchant;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentBaseWithHierarchy that = (PaymentBaseWithHierarchy) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(serviceName, that.serviceName) && Objects.equals(merchantId, that.merchantId) && Objects.equals(merchantExternalSystemId, that.merchantExternalSystemId) && Objects.equals(merchantExternalSystemGroupId, that.merchantExternalSystemGroupId) && Objects.equals(merchantName, that.merchantName) && Objects.equals(isOverlodedMerchant, that.isOverlodedMerchant) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(serviceId, serviceName, merchantId, merchantExternalSystemId, merchantExternalSystemGroupId, merchantName, isOverlodedMerchant);
    }

    @Override
    public String toString() {
        return "PaymentBaseWithHierarchy{" +
                 "serviceId='" + serviceId + '\'' +
 ", serviceName='" + serviceName + '\'' +
 ", merchantId='" + merchantId + '\'' +
 ", merchantExternalSystemId='" + merchantExternalSystemId + '\'' +
 ", merchantExternalSystemGroupId='" + merchantExternalSystemGroupId + '\'' +
 ", merchantName='" + merchantName + '\'' +
 ", isOverlodedMerchant='" + isOverlodedMerchant + '\'' +

                '}';
    }
}