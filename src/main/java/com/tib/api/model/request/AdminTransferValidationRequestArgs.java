
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class AdminTransferValidationRequestArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * Gets or sets a value indicating whether this <see cref="AdminTransferValidationRequestArgs"> is approved.
     */
    @JsonProperty("Approved")
    private boolean approved;

    /**
     * Gets or sets the identifier of the public token required to initiate a drop‑in session.
     */
    @JsonProperty("PublicTokenId")
    private String publicTokenId;


    
    public AdminTransferValidationRequestArgs() {
    }

    
    public AdminTransferValidationRequestArgs(boolean approved, String publicTokenId) {
        this.approved = approved;
        this.publicTokenId = publicTokenId;
    }
    
    
    public AdminTransferValidationRequestArgs(String adminSessionToken, boolean approved, String publicTokenId) {
        super(adminSessionToken);
        this.approved = approved;
        this.publicTokenId = publicTokenId;
    }

    
    public boolean getApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public String getPublicTokenId() {
        return publicTokenId;
    }

    public void setPublicTokenId(String publicTokenId) {
        this.publicTokenId = publicTokenId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminTransferValidationRequestArgs that = (AdminTransferValidationRequestArgs) o;
        return Objects.equals(approved, that.approved) && Objects.equals(publicTokenId, that.publicTokenId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(approved, publicTokenId);
    }

    @Override
    public String toString() {
        return "AdminTransferValidationRequestArgs{" +
                "approved='" + approved + '\'' +
                ", publicTokenId='" + publicTokenId + '\'' +

                '}';
    }
}