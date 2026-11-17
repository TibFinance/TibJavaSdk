
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.TransferBatchItem;
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


public class CreateTransferBatchArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The merchant the items belong to. Required for a client or service session; a merchant session may leave it empty, or send its own merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * Optional label, up to 50 characters, stored on every payment the request creates. It is not used to detect duplicates.
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * When true, every item is checked but nothing is created. Send the real call with a new IdempotencyKey.
     */
    @JsonProperty("ValidateOnly")
    private boolean validateOnly;

    /**
     * Required: the payments to create, 1 to 5,000, processed in this order.
     */
    @JsonProperty("Items")
    private List<TransferBatchItem> items;


    
    public CreateTransferBatchArgs() {
    }

    
    public CreateTransferBatchArgs(String merchantId, String groupId, boolean validateOnly, List<TransferBatchItem> items) {
        this.merchantId = merchantId;
        this.groupId = groupId;
        this.validateOnly = validateOnly;
        this.items = items;
    }
    
    
    public CreateTransferBatchArgs(String sessionToken, String merchantId, String groupId, boolean validateOnly, List<TransferBatchItem> items) {
        super(sessionToken);
        this.merchantId = merchantId;
        this.groupId = groupId;
        this.validateOnly = validateOnly;
        this.items = items;
    }

    
    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public boolean getValidateOnly() {
        return validateOnly;
    }

    public void setValidateOnly(boolean validateOnly) {
        this.validateOnly = validateOnly;
    }

    public List<TransferBatchItem> getItems() {
        return items;
    }

    public void setItems(List<TransferBatchItem> items) {
        this.items = items;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateTransferBatchArgs that = (CreateTransferBatchArgs) o;
        return Objects.equals(merchantId, that.merchantId) && Objects.equals(groupId, that.groupId) && Objects.equals(validateOnly, that.validateOnly) && Objects.equals(items, that.items) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(merchantId, groupId, validateOnly, items);
    }

    @Override
    public String toString() {
        return "CreateTransferBatchArgs{" +
                "merchantId='" + merchantId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", validateOnly='" + validateOnly + '\'' +
                ", items='" + items + '\'' +

                '}';
    }
}