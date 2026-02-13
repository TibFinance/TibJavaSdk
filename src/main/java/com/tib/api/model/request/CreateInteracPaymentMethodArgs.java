
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.Interac;
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


public class CreateInteracPaymentMethodArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Serves as a unique identifier for each customer within the system.
 */
    @JsonProperty("CustomerId")
    private String customerId;

    /**
 * Determines if the customer's payment method is set as the default for automatic transactions.
 */
    @JsonProperty("IsCustomerAutomaticPaymentMethod")
    private boolean isCustomerAutomaticPaymentMethod;

    /**
 * This model encapsulates the details required to manage Interac payment methods for customers. It is used to facilitate electronic funds transfers via the Interac network, a widely used payment system in Canada.
 */
    @JsonProperty("InteracInformation")
    private Interac interacInformation;

    /**
 * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
 */
    @JsonProperty("Language")
    private Language language;

    /**
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
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