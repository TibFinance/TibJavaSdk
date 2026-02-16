
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.enums.PublicAccessTokenRoutingType;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateDirectAccountPaymentMethodAndSetToTransferArgs  implements IBaseCryptedServiceArgs  {

    
    /**
     * Indicates if the system must request the customer's consent prior to executing the payment.
     */
    @JsonProperty("AskForCustomerConsent")
    private boolean askForCustomerConsent;

    /**
     * 
     */
    @JsonProperty("RoutingType")
    private PublicAccessTokenRoutingType routingType;


    
    public CreateDirectAccountPaymentMethodAndSetToTransferArgs() {
    }

    
    public CreateDirectAccountPaymentMethodAndSetToTransferArgs(boolean askForCustomerConsent, PublicAccessTokenRoutingType routingType) {
        this.askForCustomerConsent = askForCustomerConsent;
        this.routingType = routingType;
    }
    
    

    
    public boolean getAskForCustomerConsent() {
        return askForCustomerConsent;
    }

    public void setAskForCustomerConsent(boolean askForCustomerConsent) {
        this.askForCustomerConsent = askForCustomerConsent;
    }

    public PublicAccessTokenRoutingType getRoutingType() {
        return routingType;
    }

    public void setRoutingType(PublicAccessTokenRoutingType routingType) {
        this.routingType = routingType;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateDirectAccountPaymentMethodAndSetToTransferArgs that = (CreateDirectAccountPaymentMethodAndSetToTransferArgs) o;
        return Objects.equals(askForCustomerConsent, that.askForCustomerConsent) && Objects.equals(routingType, that.routingType) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(askForCustomerConsent, routingType);
    }

    @Override
    public String toString() {
        return "CreateDirectAccountPaymentMethodAndSetToTransferArgs{" +
                "askForCustomerConsent='" + askForCustomerConsent + '\'' +
                ", routingType='" + routingType + '\'' +

                '}';
    }
}