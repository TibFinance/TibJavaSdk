
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.MerchantView;
import com.tib.api.model.PaymentEntity;
import com.tib.api.model.Customer;
import com.tib.api.model.PaymentMethod;
import com.tib.api.model.Bill;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class PaymentMethodAddRequest   {

    
    /**
 * This property holds the basic information necessary for creating or updating a merchant's account within the TIB Finance API system.
 */
    @JsonProperty("MerchantInfo")
    private MerchantView merchantInfo;

    /**
 * Gets or sets the transfer information.
 */
    @JsonProperty("TransferInfo")
    private PaymentEntity transferInfo;

    /**
 * Gets or sets the customer information.
 */
    @JsonProperty("CustomerInfo")
    private Customer customerInfo;

    /**
 * Gets or sets the customer existing payment methods.
 */
    @JsonProperty("CustomerExistingPaymentMethods")
    private List<PaymentMethod> customerExistingPaymentMethods;

    /**
 * Gets or sets the related bill information.
 */
    @JsonProperty("RelatedBillInfo")
    private Bill relatedBillInfo;


    
    public PaymentMethodAddRequest() {
    }

    
    public PaymentMethodAddRequest(MerchantView merchantInfo, PaymentEntity transferInfo, Customer customerInfo, List<PaymentMethod> customerExistingPaymentMethods, Bill relatedBillInfo) {
        this.merchantInfo = merchantInfo;
this.transferInfo = transferInfo;
this.customerInfo = customerInfo;
this.customerExistingPaymentMethods = customerExistingPaymentMethods;
this.relatedBillInfo = relatedBillInfo;

    }
    
    

    
    public MerchantView getMerchantInfo() {
        return merchantInfo;
    }

    public void setMerchantInfo(MerchantView merchantInfo) {
        this.merchantInfo = merchantInfo;
    }

    public PaymentEntity getTransferInfo() {
        return transferInfo;
    }

    public void setTransferInfo(PaymentEntity transferInfo) {
        this.transferInfo = transferInfo;
    }

    public Customer getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(Customer customerInfo) {
        this.customerInfo = customerInfo;
    }

    public List<PaymentMethod> getCustomerExistingPaymentMethods() {
        return customerExistingPaymentMethods;
    }

    public void setCustomerExistingPaymentMethods(List<PaymentMethod> customerExistingPaymentMethods) {
        this.customerExistingPaymentMethods = customerExistingPaymentMethods;
    }

    public Bill getRelatedBillInfo() {
        return relatedBillInfo;
    }

    public void setRelatedBillInfo(Bill relatedBillInfo) {
        this.relatedBillInfo = relatedBillInfo;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentMethodAddRequest that = (PaymentMethodAddRequest) o;
        return Objects.equals(merchantInfo, that.merchantInfo) && Objects.equals(transferInfo, that.transferInfo) && Objects.equals(customerInfo, that.customerInfo) && Objects.equals(customerExistingPaymentMethods, that.customerExistingPaymentMethods) && Objects.equals(relatedBillInfo, that.relatedBillInfo) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantInfo, transferInfo, customerInfo, customerExistingPaymentMethods, relatedBillInfo);
    }

    @Override
    public String toString() {
        return "PaymentMethodAddRequest{" +
                 "merchantInfo='" + merchantInfo + '\'' +
 ", transferInfo='" + transferInfo + '\'' +
 ", customerInfo='" + customerInfo + '\'' +
 ", customerExistingPaymentMethods='" + customerExistingPaymentMethods + '\'' +
 ", relatedBillInfo='" + relatedBillInfo + '\'' +

                '}';
    }
}