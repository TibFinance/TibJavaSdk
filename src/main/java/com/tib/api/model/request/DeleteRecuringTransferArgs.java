
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


public class DeleteRecuringTransferArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * Identifies a specific recurring transfer operation associated with a client's account.
 */
    @JsonProperty("RecuringTransferId")
    private String recuringTransferId;


    
    public DeleteRecuringTransferArgs() {
    }

    
    public DeleteRecuringTransferArgs(String recuringTransferId) {
        this.recuringTransferId = recuringTransferId;

    }
    
    
    public DeleteRecuringTransferArgs(String sessionToken, String recuringTransferId) {
        super(sessionToken);
        this.recuringTransferId = recuringTransferId;

    }

    
    public String getRecuringTransferId() {
        return recuringTransferId;
    }

    public void setRecuringTransferId(String recuringTransferId) {
        this.recuringTransferId = recuringTransferId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteRecuringTransferArgs that = (DeleteRecuringTransferArgs) o;
        return Objects.equals(recuringTransferId, that.recuringTransferId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(recuringTransferId);
    }

    @Override
    public String toString() {
        return "DeleteRecuringTransferArgs{" +
                 "recuringTransferId='" + recuringTransferId + '\'' +

                '}';
    }
}