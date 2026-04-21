
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.TransferType;
import com.tib.api.model.enums.AutorizedPaymentMethodFlags;
import com.tib.api.model.enums.Language;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetDropInPublicTokenArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Unique identifier of the customer owning the recurring transfers
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * Unique identifier of the bill to be paid
     */
    @JsonProperty("BillId")
    private String billId;

    /**
     * The monetary value of each recurring transfer.
     */
    @JsonProperty("Amount")
    private Double amount;

    /**
     * Indicates the category of the recurring transfer (e.g., inbound, outbound, internal).
     */
    @JsonProperty("TransferType")
    private TransferType transferType;

    /**
     * Restrict which payment methods are available in the Drop-In interface.
     */
    @JsonProperty("DropInAuthorizedPaymentMethod")
    private AutorizedPaymentMethodFlags dropInAuthorizedPaymentMethod;

    /**
     * External system reference number to associate with the Drop-In payment.
     */
    @JsonProperty("ExternalReferenceNumber")
    private String externalReferenceNumber;

    /**
     * Whether to display the customer's previously saved payment methods in the Drop-In.
     */
    @JsonProperty("ShowCustomerExistingPaymentMethods")
    private boolean showCustomerExistingPaymentMethods;

    /**
     * Specifies the language used for the payment request and related communications
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * Number of days before the Drop-In token expires.
     */
    @JsonProperty("ExpirationDays")
    private Integer expirationDays;

    /**
     * Title displayed on the Drop-In payment form.
     */
    @JsonProperty("Title")
    private String title;

    /**
     * Human‑readable description of the transfer
     */
    @JsonProperty("Description")
    private String description;

    /**
     * Scheduled due date for the payment created via Drop-In.
     */
    @JsonProperty("PaymentDueDate")
    private OffsetDateTime paymentDueDate;


    
    public GetDropInPublicTokenArgs() {
    }

    
    public GetDropInPublicTokenArgs(String merchantId, String customerId, String billId, Double amount, TransferType transferType, AutorizedPaymentMethodFlags dropInAuthorizedPaymentMethod, String externalReferenceNumber, boolean showCustomerExistingPaymentMethods, Language language, Integer expirationDays, String title, String description, OffsetDateTime paymentDueDate) {
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
    
    
    public GetDropInPublicTokenArgs(String sessionToken, String merchantId, String customerId, String billId, Double amount, TransferType transferType, AutorizedPaymentMethodFlags dropInAuthorizedPaymentMethod, String externalReferenceNumber, boolean showCustomerExistingPaymentMethods, Language language, Integer expirationDays, String title, String description, OffsetDateTime paymentDueDate) {
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

    public OffsetDateTime getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(OffsetDateTime paymentDueDate) {
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