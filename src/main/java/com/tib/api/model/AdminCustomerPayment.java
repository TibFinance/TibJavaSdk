
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.PaymentMethodType;
import com.tib.api.model.enums.Language;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class AdminCustomerPayment   {

    
    /**
 * Serves as a unique identifier for each customer within the system.
 */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
 * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
 */
    @JsonProperty("ServiceId")
    private String serviceId;

    /**
 * Acts as a unique identifier for a distinct payment method.
 */
    @JsonProperty("PaymentMethodId")
    private String paymentMethodId;

    /**
 * 
 */
    @JsonProperty("AccountInformationId")
    private String accountInformationId;

    /**
 * This property represents the full name of the customer in the system.
 */
    @JsonProperty("CustomerName")
    private String customerName;

    /**
 * Handles the acquisition and assignment of a customer's email address.
 */
    @JsonProperty("CustomerEmail")
    private String customerEmail;

    /**
 * Provides a detailed explanation of the function's purpose and usage within the API.
 */
    @JsonProperty("Description")
    private String description;

    /**
 * 
 */
    @JsonProperty("AccountInformationView")
    private String accountInformationView;

    /**
 * Identifies the type of payment method linked to a specific account.
 */
    @JsonProperty("PaymentMethodType")
    private PaymentMethodType paymentMethodType;

    /**
 * The 'Owner' property is designed to assign and identify the ownership of a specific resource or object within the system.
 */
    @JsonProperty("Owner")
    private String owner;

    /**
 * Retrieves or assigns the identifier used for external customer identification. This property is crucial for linking customer data with external systems.
 */
    @JsonProperty("ExternalCustomerId")
    private String externalCustomerId;

    /**
 * 
 */
    @JsonProperty("IsDeletedCustomer")
    private boolean isDeletedCustomer;

    /**
 * Provides a detailed description of the payment method for easy identification.
 */
    @JsonProperty("PaymentMethodDescription")
    private String paymentMethodDescription;

    /**
 * Determines if the customer's payment method is set as the default for automatic transactions.
 */
    @JsonProperty("IsCustomerAutomaticPaymentMethod")
    private boolean isCustomerAutomaticPaymentMethod;

    /**
 * 
 */
    @JsonProperty("IsVerifiedPaymentMethod")
    private boolean isVerifiedPaymentMethod;

    /**
 * 
 */
    @JsonProperty("IsDeletedPaymentMethod")
    private boolean isDeletedPaymentMethod;

    /**
 * Handles the extraction or assignment of a particular entity's expiration date.
 */
    @JsonProperty("ExpirationDate")
    private LocalDateTime expirationDate;

    /**
 * 
 */
    @JsonProperty("AccountAddressId")
    private String accountAddressId;

    /**
 * 
 */
    @JsonProperty("Question")
    private String question;

    /**
 * Specifies the email address associated with the merchant.
 */
    @JsonProperty("Email")
    private String email;

    /**
 * 
 */
    @JsonProperty("MobilePhone")
    private String mobilePhone;

    /**
 * 
 */
    @JsonProperty("AccountLanguage")
    private Language accountLanguage;

    /**
 * 
 */
    @JsonProperty("Memo")
    private String memo;

    /**
 * 
 */
    @JsonProperty("IsChecked")
    private boolean isChecked;

    /**
 * 
 */
    @JsonProperty("CreatedDateCustomer")
    private LocalDateTime createdDateCustomer;

    /**
 * 
 */
    @JsonProperty("CreatedDatePaymentMethod")
    private LocalDateTime createdDatePaymentMethod;

    /**
 * 
 */
    @JsonProperty("CustomerInfoEmail")
    private String customerInfoEmail;

    /**
 * 
 */
    @JsonProperty("Phone")
    private String phone;

    /**
 * Gets or sets the address associated with the entity.
 */
    @JsonProperty("Address")
    private String address;

    /**
 * 
 */
    @JsonProperty("City")
    private String city;

    /**
 * Gets or sets the postal zip code for the address entity.
 */
    @JsonProperty("PostalZipCode")
    private String postalZipCode;

    /**
 * 
 */
    @JsonProperty("PaymentMethodTypeValue")
    private String paymentMethodTypeValue;

    /**
 * 
 */
    @JsonProperty("AccountLanguageValue")
    private String accountLanguageValue;


    
    public AdminCustomerPayment() {
    }

    
    public AdminCustomerPayment(String customerId, String serviceId, String paymentMethodId, String accountInformationId, String customerName, String customerEmail, String description, String accountInformationView, PaymentMethodType paymentMethodType, String owner, String externalCustomerId, boolean isDeletedCustomer, String paymentMethodDescription, boolean isCustomerAutomaticPaymentMethod, boolean isVerifiedPaymentMethod, boolean isDeletedPaymentMethod, LocalDateTime expirationDate, String accountAddressId, String question, String email, String mobilePhone, Language accountLanguage, String memo, boolean isChecked, LocalDateTime createdDateCustomer, LocalDateTime createdDatePaymentMethod, String customerInfoEmail, String phone, String address, String city, String postalZipCode, String paymentMethodTypeValue, String accountLanguageValue) {
        this.customerId = customerId;
this.serviceId = serviceId;
this.paymentMethodId = paymentMethodId;
this.accountInformationId = accountInformationId;
this.customerName = customerName;
this.customerEmail = customerEmail;
this.description = description;
this.accountInformationView = accountInformationView;
this.paymentMethodType = paymentMethodType;
this.owner = owner;
this.externalCustomerId = externalCustomerId;
this.isDeletedCustomer = isDeletedCustomer;
this.paymentMethodDescription = paymentMethodDescription;
this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
this.isVerifiedPaymentMethod = isVerifiedPaymentMethod;
this.isDeletedPaymentMethod = isDeletedPaymentMethod;
this.expirationDate = expirationDate;
this.accountAddressId = accountAddressId;
this.question = question;
this.email = email;
this.mobilePhone = mobilePhone;
this.accountLanguage = accountLanguage;
this.memo = memo;
this.isChecked = isChecked;
this.createdDateCustomer = createdDateCustomer;
this.createdDatePaymentMethod = createdDatePaymentMethod;
this.customerInfoEmail = customerInfoEmail;
this.phone = phone;
this.address = address;
this.city = city;
this.postalZipCode = postalZipCode;
this.paymentMethodTypeValue = paymentMethodTypeValue;
this.accountLanguageValue = accountLanguageValue;

    }
    
    

    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getAccountInformationId() {
        return accountInformationId;
    }

    public void setAccountInformationId(String accountInformationId) {
        this.accountInformationId = accountInformationId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccountInformationView() {
        return accountInformationView;
    }

    public void setAccountInformationView(String accountInformationView) {
        this.accountInformationView = accountInformationView;
    }

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getExternalCustomerId() {
        return externalCustomerId;
    }

    public void setExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
    }

    public boolean getIsDeletedCustomer() {
        return isDeletedCustomer;
    }

    public void setIsDeletedCustomer(boolean isDeletedCustomer) {
        this.isDeletedCustomer = isDeletedCustomer;
    }

    public String getPaymentMethodDescription() {
        return paymentMethodDescription;
    }

    public void setPaymentMethodDescription(String paymentMethodDescription) {
        this.paymentMethodDescription = paymentMethodDescription;
    }

    public boolean getIsCustomerAutomaticPaymentMethod() {
        return isCustomerAutomaticPaymentMethod;
    }

    public void setIsCustomerAutomaticPaymentMethod(boolean isCustomerAutomaticPaymentMethod) {
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
    }

    public boolean getIsVerifiedPaymentMethod() {
        return isVerifiedPaymentMethod;
    }

    public void setIsVerifiedPaymentMethod(boolean isVerifiedPaymentMethod) {
        this.isVerifiedPaymentMethod = isVerifiedPaymentMethod;
    }

    public boolean getIsDeletedPaymentMethod() {
        return isDeletedPaymentMethod;
    }

    public void setIsDeletedPaymentMethod(boolean isDeletedPaymentMethod) {
        this.isDeletedPaymentMethod = isDeletedPaymentMethod;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getAccountAddressId() {
        return accountAddressId;
    }

    public void setAccountAddressId(String accountAddressId) {
        this.accountAddressId = accountAddressId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Language getAccountLanguage() {
        return accountLanguage;
    }

    public void setAccountLanguage(Language accountLanguage) {
        this.accountLanguage = accountLanguage;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    public LocalDateTime getCreatedDateCustomer() {
        return createdDateCustomer;
    }

    public void setCreatedDateCustomer(LocalDateTime createdDateCustomer) {
        this.createdDateCustomer = createdDateCustomer;
    }

    public LocalDateTime getCreatedDatePaymentMethod() {
        return createdDatePaymentMethod;
    }

    public void setCreatedDatePaymentMethod(LocalDateTime createdDatePaymentMethod) {
        this.createdDatePaymentMethod = createdDatePaymentMethod;
    }

    public String getCustomerInfoEmail() {
        return customerInfoEmail;
    }

    public void setCustomerInfoEmail(String customerInfoEmail) {
        this.customerInfoEmail = customerInfoEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalZipCode() {
        return postalZipCode;
    }

    public void setPostalZipCode(String postalZipCode) {
        this.postalZipCode = postalZipCode;
    }

    public String getPaymentMethodTypeValue() {
        return paymentMethodTypeValue;
    }

    public void setPaymentMethodTypeValue(String paymentMethodTypeValue) {
        this.paymentMethodTypeValue = paymentMethodTypeValue;
    }

    public String getAccountLanguageValue() {
        return accountLanguageValue;
    }

    public void setAccountLanguageValue(String accountLanguageValue) {
        this.accountLanguageValue = accountLanguageValue;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminCustomerPayment that = (AdminCustomerPayment) o;
        return Objects.equals(customerId, that.customerId) && Objects.equals(serviceId, that.serviceId) && Objects.equals(paymentMethodId, that.paymentMethodId) && Objects.equals(accountInformationId, that.accountInformationId) && Objects.equals(customerName, that.customerName) && Objects.equals(customerEmail, that.customerEmail) && Objects.equals(description, that.description) && Objects.equals(accountInformationView, that.accountInformationView) && Objects.equals(paymentMethodType, that.paymentMethodType) && Objects.equals(owner, that.owner) && Objects.equals(externalCustomerId, that.externalCustomerId) && Objects.equals(isDeletedCustomer, that.isDeletedCustomer) && Objects.equals(paymentMethodDescription, that.paymentMethodDescription) && Objects.equals(isCustomerAutomaticPaymentMethod, that.isCustomerAutomaticPaymentMethod) && Objects.equals(isVerifiedPaymentMethod, that.isVerifiedPaymentMethod) && Objects.equals(isDeletedPaymentMethod, that.isDeletedPaymentMethod) && Objects.equals(expirationDate, that.expirationDate) && Objects.equals(accountAddressId, that.accountAddressId) && Objects.equals(question, that.question) && Objects.equals(email, that.email) && Objects.equals(mobilePhone, that.mobilePhone) && Objects.equals(accountLanguage, that.accountLanguage) && Objects.equals(memo, that.memo) && Objects.equals(isChecked, that.isChecked) && Objects.equals(createdDateCustomer, that.createdDateCustomer) && Objects.equals(createdDatePaymentMethod, that.createdDatePaymentMethod) && Objects.equals(customerInfoEmail, that.customerInfoEmail) && Objects.equals(phone, that.phone) && Objects.equals(address, that.address) && Objects.equals(city, that.city) && Objects.equals(postalZipCode, that.postalZipCode) && Objects.equals(paymentMethodTypeValue, that.paymentMethodTypeValue) && Objects.equals(accountLanguageValue, that.accountLanguageValue) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerId, serviceId, paymentMethodId, accountInformationId, customerName, customerEmail, description, accountInformationView, paymentMethodType, owner, externalCustomerId, isDeletedCustomer, paymentMethodDescription, isCustomerAutomaticPaymentMethod, isVerifiedPaymentMethod, isDeletedPaymentMethod, expirationDate, accountAddressId, question, email, mobilePhone, accountLanguage, memo, isChecked, createdDateCustomer, createdDatePaymentMethod, customerInfoEmail, phone, address, city, postalZipCode, paymentMethodTypeValue, accountLanguageValue);
    }

    @Override
    public String toString() {
        return "AdminCustomerPayment{" +
                 "customerId='" + customerId + '\'' +
 ", serviceId='" + serviceId + '\'' +
 ", paymentMethodId='" + paymentMethodId + '\'' +
 ", accountInformationId='" + accountInformationId + '\'' +
 ", customerName='" + customerName + '\'' +
 ", customerEmail='" + customerEmail + '\'' +
 ", description='" + description + '\'' +
 ", accountInformationView='" + accountInformationView + '\'' +
 ", paymentMethodType='" + paymentMethodType + '\'' +
 ", owner='" + owner + '\'' +
 ", externalCustomerId='" + externalCustomerId + '\'' +
 ", isDeletedCustomer='" + isDeletedCustomer + '\'' +
 ", paymentMethodDescription='" + paymentMethodDescription + '\'' +
 ", isCustomerAutomaticPaymentMethod='" + isCustomerAutomaticPaymentMethod + '\'' +
 ", isVerifiedPaymentMethod='" + isVerifiedPaymentMethod + '\'' +
 ", isDeletedPaymentMethod='" + isDeletedPaymentMethod + '\'' +
 ", expirationDate='" + expirationDate + '\'' +
 ", accountAddressId='" + accountAddressId + '\'' +
 ", question='" + question + '\'' +
 ", email='" + email + '\'' +
 ", mobilePhone='" + mobilePhone + '\'' +
 ", accountLanguage='" + accountLanguage + '\'' +
 ", memo='" + memo + '\'' +
 ", isChecked='" + isChecked + '\'' +
 ", createdDateCustomer='" + createdDateCustomer + '\'' +
 ", createdDatePaymentMethod='" + createdDatePaymentMethod + '\'' +
 ", customerInfoEmail='" + customerInfoEmail + '\'' +
 ", phone='" + phone + '\'' +
 ", address='" + address + '\'' +
 ", city='" + city + '\'' +
 ", postalZipCode='" + postalZipCode + '\'' +
 ", paymentMethodTypeValue='" + paymentMethodTypeValue + '\'' +
 ", accountLanguageValue='" + accountLanguageValue + '\'' +

                '}';
    }
}