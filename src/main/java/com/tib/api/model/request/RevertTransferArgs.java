
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


public class RevertTransferArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Identifies the specific transfer operation that needs to be reverted.
 */
    @JsonProperty("TransferId")
    private String transferId;


    
    public RevertTransferArgs() {
    }

    
    public RevertTransferArgs(String transferId) {
        this.transferId = transferId;

    }
    
    
    public RevertTransferArgs(String sessionToken, String transferId) {
        super(sessionToken);
        this.transferId = transferId;

    }

    
    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RevertTransferArgs that = (RevertTransferArgs) o;
        return Objects.equals(transferId, that.transferId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(transferId);
    }

    @Override
    public String toString() {
        return "RevertTransferArgs{" +
                 "transferId='" + transferId + '\'' +

                '}';
    }
}