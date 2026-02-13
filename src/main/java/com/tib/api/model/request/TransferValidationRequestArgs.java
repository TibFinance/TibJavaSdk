
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


public class TransferValidationRequestArgs  extends BaseAuthenticatePublicTokenArgs  {

    
    /**
 * Gets or sets a value indicating whether this <see cref="TransferValidationRequestArgs"> is approved.
 */
    @JsonProperty("Approved")
    private boolean approved;


    
    public TransferValidationRequestArgs() {
    }

    
    public TransferValidationRequestArgs(boolean approved) {
        this.approved = approved;

    }
    
    
    public TransferValidationRequestArgs(String publicTokenId, boolean approved) {
        super(publicTokenId);
        this.approved = approved;

    }

    
    public boolean getApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransferValidationRequestArgs that = (TransferValidationRequestArgs) o;
        return Objects.equals(approved, that.approved) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(approved);
    }

    @Override
    public String toString() {
        return "TransferValidationRequestArgs{" +
                 "approved='" + approved + '\'' +

                '}';
    }
}