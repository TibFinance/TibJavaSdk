
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TransferType;
import com.tib.api.model.enums.AutorizedPaymentMethodFlags;
import com.tib.api.model.enums.Language;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetDropInPublicTokenArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Serves as a unique identifier for each customer within the system.
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * Retrieves or assigns the unique identifier for a bill.
     */
    @JsonProperty("BillId")
    private String billId;

    /**
     * Retrieves or assigns the monetary amount involved in the transaction.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * Defines and manages the type of transfer operation within the system.
     */
    @JsonProperty("TransferType")
    private TransferType transferType;

    /**
     * Specifies the payment method flags that are authorized for the Drop‑In session.
     */
    @JsonProperty("DropInAuthorizedPaymentMethod")
    private AutorizedPaymentMethodFlags dropInAuthorizedPaymentMethod;

    /**
     * Gets or sets the external reference number used to link this entity with an external system or business process.
     */
    @JsonProperty("ExternalReferenceNumber")
    private String externalReferenceNumber;

    /**
     * Specifies whether the API request should include the customer's existing payment methods in the response.
     */
    @JsonProperty("ShowCustomerExistingPaymentMethods")
    private boolean showCustomerExistingPaymentMethods;

    /**
     * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * Specifies the lifetime of the public token in days.
     */
    @JsonProperty("ExpirationDays")
    private Integer expirationDays;

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


    
    public GetDropInPublicTokenArgs() {
    }

    
    public GetDropInPublicTokenArgs(String merchantId, String customerId, String billId, Double amount, TransferType transferType, AutorizedPaymentMethodFlags dropInAuthorizedPaymentMethod, String externalReferenceNumber, boolean showCustomerExistingPaymentMethods, Language language, Integer expirationDays, String title, String description, LocalDateTime paymentDueDate) {
        this.merchantId = merchantId;
        this.customerId = customerId;
        this.billId = billId;
        this.amount = amount;
        this.transferType = transferType;
        this.dropInAuthorizedPaymentMethod = dropInAuthorizedPaymentMethod;
        this.externalReferenceNumber = externalReferenceNumber;
        this.showCustomerExistingPaymentMethods = showCustomerExistingPaymentMethods;
        this.language = language;
        this.expirationDays = expirationDays;
        this.title = title;
        this.description = description;
        this.paymentDueDate = paymentDueDate;
    }
    
    
    public GetDropInPublicTokenArgs(String sessionToken, String merchantId, String customerId, String billId, Double amount, TransferType transferType, AutorizedPaymentMethodFlags dropInAuthorizedPaymentMethod, String externalReferenceNumber, boolean showCustomerExistingPaymentMethods, Language language, Integer expirationDays, String title, String description, LocalDateTime paymentDueDate) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.customerId = customerId;
        this.billId = billId;
        this.amount = amount;
        this.transferType = transferType;
        this.dropInAuthorizedPaymentMethod = dropInAuthorizedPaymentMethod;
        this.externalReferenceNumber = externalReferenceNumber;
        this.showCustomerExistingPaymentMethods = showCustomerExistingPaymentMethods;
        this.language = language;
        this.expirationDays = expirationDays;
        this.title = title;
        this.description = description;
        this.paymentDueDate = paymentDueDate;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public TransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }

    public AutorizedPaymentMethodFlags getDropInAuthorizedPaymentMethod() {
        return dropInAuthorizedPaymentMethod;
    }

    public void setDropInAuthorizedPaymentMethod(AutorizedPaymentMethodFlags dropInAuthorizedPaymentMethod) {
        this.dropInAuthorizedPaymentMethod = dropInAuthorizedPaymentMethod;
    }

    public String getExternalReferenceNumber() {
        return externalReferenceNumber;
    }

    public void setExternalReferenceNumber(String externalReferenceNumber) {
        this.externalReferenceNumber = externalReferenceNumber;
    }

    public boolean getShowCustomerExistingPaymentMethods() {
        return showCustomerExistingPaymentMethods;
    }

    public void setShowCustomerExistingPaymentMethods(boolean showCustomerExistingPaymentMethods) {
        this.showCustomerExistingPaymentMethods = showCustomerExistingPaymentMethods;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Integer getExpirationDays() {
        return expirationDays;
    }

    public void setExpirationDays(Integer expirationDays) {
        this.expirationDays = expirationDays;
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



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetDropInPublicTokenArgs that = (GetDropInPublicTokenArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(customerId, that.customerId) && Objects.equals(billId, that.billId) && Objects.equals(amount, that.amount) && Objects.equals(transferType, that.transferType) && Objects.equals(dropInAuthorizedPaymentMethod, that.dropInAuthorizedPaymentMethod) && Objects.equals(externalReferenceNumber, that.externalReferenceNumber) && Objects.equals(showCustomerExistingPaymentMethods, that.showCustomerExistingPaymentMethods) && Objects.equals(language, that.language) && Objects.equals(expirationDays, that.expirationDays) && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(paymentDueDate, that.paymentDueDate) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, customerId, billId, amount, transferType, dropInAuthorizedPaymentMethod, externalReferenceNumber, showCustomerExistingPaymentMethods, language, expirationDays, title, description, paymentDueDate);
    }

    @Override
    public String toString() {
        return "GetDropInPublicTokenArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", billId='" + billId + '\'' +
                ", amount='" + amount + '\'' +
                ", transferType='" + transferType + '\'' +
                ", dropInAuthorizedPaymentMethod='" + dropInAuthorizedPaymentMethod + '\'' +
                ", externalReferenceNumber='" + externalReferenceNumber + '\'' +
                ", showCustomerExistingPaymentMethods='" + showCustomerExistingPaymentMethods + '\'' +
                ", language='" + language + '\'' +
                ", expirationDays='" + expirationDays + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", paymentDueDate='" + paymentDueDate + '\'' +

                '}';
    }
}