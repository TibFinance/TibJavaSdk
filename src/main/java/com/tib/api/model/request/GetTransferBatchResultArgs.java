
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class GetTransferBatchResultArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Required: the BatchId of a CreateTransferBatch reply.
     */
    @JsonProperty("BatchId")
    private String batchId;

    /**
     * The Index of the first item of the page, 0 to 4,999; 0 when empty. Send 0 first, then each page's NextIndex, which is the previous FromIndex plus the number of items returned (1,000, 2,000 and so on with the default MaxItems), until NextIndex is empty.
     */
    @JsonProperty("FromIndex")
    private Integer fromIndex;

    /**
     * The most items the page holds, 0 to 1,000; 1,000 when empty. 0 returns the request's state and totals only.
     */
    @JsonProperty("MaxItems")
    private Integer maxItems;


    
    public GetTransferBatchResultArgs() {
    }

    
    public GetTransferBatchResultArgs(String batchId, Integer fromIndex, Integer maxItems) {
        this.batchId = batchId;
        this.fromIndex = fromIndex;
        this.maxItems = maxItems;
    }
    
    
    public GetTransferBatchResultArgs(String sessionToken, String batchId, Integer fromIndex, Integer maxItems) {
        super(sessionToken);
        this.batchId = batchId;
        this.fromIndex = fromIndex;
        this.maxItems = maxItems;
    }

    
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public Integer getFromIndex() {
        return fromIndex;
    }

    public void setFromIndex(Integer fromIndex) {
        this.fromIndex = fromIndex;
    }

    public Integer getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTransferBatchResultArgs that = (GetTransferBatchResultArgs) o;
        return Objects.equals(batchId, that.batchId) && Objects.equals(fromIndex, that.fromIndex) && Objects.equals(maxItems, that.maxItems) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(batchId, fromIndex, maxItems);
    }

    @Override
    public String toString() {
        return "GetTransferBatchResultArgs{" +
                "batchId='" + batchId + '\'' +
                ", fromIndex='" + fromIndex + '\'' +
                ", maxItems='" + maxItems + '\'' +

                '}';
    }
}