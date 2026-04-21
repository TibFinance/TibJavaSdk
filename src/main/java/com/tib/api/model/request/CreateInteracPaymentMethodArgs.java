
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Interac;
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


public class CreateInteracPaymentMethodArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Unique identifier of the customer owning the recurring transfers
     */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
     * Indicates whether this payment method is configured as the customer's automatic payment method.
     */
    @JsonProperty("IsCustomerAutomaticPaymentMethod")
    private boolean isCustomerAutomaticPaymentMethod;

    /**
     * Details of the Interac e‑transfer payment method to be created.
     */
    @JsonProperty("InteracInformation")
    private Interac interacInformation;

    /**
     * Specifies the language used for the payment request and related communications
     */
    @JsonProperty("Language")
    private Language language;

    /**
     * The unique identifier of the merchant initiating the payment request.
     */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public CreateInteracPaymentMethodArgs() {
    }

    
    public CreateInteracPaymentMethodArgs(String customerId, boolean isCustomerAutomaticPaymentMethod, Interac interacInformation, Language language, String merchantId) {
        this.customerId = customerId;
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
        this.interacInformation = interacInformation;
        this.language = language;
        this.merchantId = merchantId;
    }
    
    
    public CreateInteracPaymentMethodArgs(String sessionToken, String customerId, boolean isCustomerAutomaticPaymentMethod, Interac interacInformation, Language language, String merchantId) {
        super(sessionToken);
        this.customerId = customerId;
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
        this.interacInformation = interacInformation;
        this.language = language;
        this.merchantId = merchantId;
    }

    
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public boolean getIsCustomerAutomaticPaymentMethod() {
        return isCustomerAutomaticPaymentMethod;
    }

    public void setIsCustomerAutomaticPaymentMethod(boolean isCustomerAutomaticPaymentMethod) {
        this.isCustomerAutomaticPaymentMethod = isCustomerAutomaticPaymentMethod;
    }

    public Interac getInteracInformation() {
        return interacInformation;
    }

    public void setInteracInformation(Interac interacInformation) {
        this.interacInformation = interacInformation;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateInteracPaymentMethodArgs that = (CreateInteracPaymentMethodArgs) o;
        return Objects.equals(customerId, that.customerId) && Objects.equals(isCustomerAutomaticPaymentMethod, that.isCustomerAutomaticPaymentMethod) && Objects.equals(interacInformation, that.interacInformation) && Objects.equals(language, that.language) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(customerId, isCustomerAutomaticPaymentMethod, interacInformation, language, merchantId);
    }

    @Override
    public String toString() {
        return "CreateInteracPaymentMethodArgs{" +
                "customerId='" + customerId + '\'' +
                ", isCustomerAutomaticPaymentMethod='" + isCustomerAutomaticPaymentMethod + '\'' +
                ", interacInformation='" + interacInformation + '\'' +
                ", language='" + language + '\'' +
                ", merchantId='" + merchantId + '\'' +

                '}';
    }
}