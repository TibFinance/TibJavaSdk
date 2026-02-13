
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatePublicTokenArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class ApplyChangeValidationArgs  extends BaseAuthenticatePublicTokenArgs  {

    
    /**
 * This token is provided by the PendingChange. The method GetChangeValidation in the Gateway provide the necessery information
 */
    @JsonProperty("ValidationToken")
    private String validationToken;

    /**
 * Gets or sets a value indicating whether [change approved].
 */
    @JsonProperty("ChangeApproved")
    private boolean changeApproved;


    
    public ApplyChangeValidationArgs() {
    }

    
    public ApplyChangeValidationArgs(String validationToken, boolean changeApproved) {
        this.validationToken = validationToken;
this.changeApproved = changeApproved;

    }
    
    
    public ApplyChangeValidationArgs(String publicTokenId, String validationToken, boolean changeApproved) {
        super(publicTokenId);
        this.validationToken = validationToken;
this.changeApproved = changeApproved;

    }

    
    public String getValidationToken() {
        return validationToken;
    }

    public void setValidationToken(String validationToken) {
        this.validationToken = validationToken;
    }

    public boolean getChangeApproved() {
        return changeApproved;
    }

    public void setChangeApproved(boolean changeApproved) {
        this.changeApproved = changeApproved;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplyChangeValidationArgs that = (ApplyChangeValidationArgs) o;
        return Objects.equals(validationToken, that.validationToken) && Objects.equals(changeApproved, that.changeApproved) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(validationToken, changeApproved);
    }

    @Override
    public String toString() {
        return "ApplyChangeValidationArgs{" +
                 "validationToken='" + validationToken + '\'' +
 ", changeApproved='" + changeApproved + '\'' +

                '}';
    }
}