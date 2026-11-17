
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BaseAuthenticatedCryptedArgs  implements IBaseCryptedServiceArgs  {

    
    /**
     * Identifier for the authenticated user session
     */
    @JsonProperty("SessionToken")
    private String sessionToken;

    /**
     * Idempotency key (max 200 characters; a new GUID per logical operation is recommended): optional, except for CreateTransferBatch and CreateCustomerV2, which require it and refuse a call without one (CreateTransferBatch with error 2100, CreateCustomerV2 with error 2003). Honored ONLY by these operations: CreatePayment, CreateFreeOperation, CreateFreeOperationBatch, CreateTransferBatch, CreateCustomerV2, CreateDirectInteracTransaction, CreateTransactionFromRaw, CreateSupplierTransfer, AdjustWallet, ForcePaymentProcess, RevertTransfer, RelaunchMerchantFailedTransfer — on any other operation the field is ignored. When supplied, for at least 24 hours, a repeated call with the same key and identical parameters returns the original response without re-executing, so a network retry cannot create a duplicate payment, transfer or customer. Keys are scoped to the authenticated login. Responses — including error responses, a 2016 of CreateCustomerV2 excepted — are cached against the key: use a NEW key for a genuinely new attempt. Reusing a key with different parameters is rejected. On the other operations, leave it null (the default) for the historical, non-idempotent behavior.
     */
    @JsonProperty("IdempotencyKey")
    private String idempotencyKey;


    
    public BaseAuthenticatedCryptedArgs() {
    }

    
    public BaseAuthenticatedCryptedArgs(String sessionToken) {
        this.sessionToken = sessionToken;
    }
    
    

    
    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseAuthenticatedCryptedArgs that = (BaseAuthenticatedCryptedArgs) o;
        return Objects.equals(sessionToken, that.sessionToken) && Objects.equals(idempotencyKey, that.idempotencyKey) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(sessionToken, idempotencyKey);
    }

    @Override
    public String toString() {
        return "BaseAuthenticatedCryptedArgs{" +
                "sessionToken='" + (sessionToken == null ? null : "***") + '\'' +
                ", idempotencyKey='" + idempotencyKey + '\'' +

                '}';
    }
}