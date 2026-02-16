
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class CreateServiceRequestFormArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Gets or sets the merchant email.
     */
    @JsonProperty("MerchantEmail")
    private String merchantEmail;


    
    public CreateServiceRequestFormArgs() {
    }

    
    public CreateServiceRequestFormArgs(String merchantEmail) {
        this.merchantEmail = merchantEmail;
    }
    
    
    public CreateServiceRequestFormArgs(String sessionToken, String merchantEmail) {
        super(sessionToken);
        this.merchantEmail = merchantEmail;
    }

    
    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateServiceRequestFormArgs that = (CreateServiceRequestFormArgs) o;
        return Objects.equals(merchantEmail, that.merchantEmail) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantEmail);
    }

    @Override
    public String toString() {
        return "CreateServiceRequestFormArgs{" +
                "merchantEmail='" + merchantEmail + '\'' +

                '}';
    }
}