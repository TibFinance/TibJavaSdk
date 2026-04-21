
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.FreeOperation;
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


public class CreateFreeOperationBatchArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * List of free operations to create as a batch.
     */
    @JsonProperty("FreeOperationBatchList")
    private List<FreeOperation> freeOperationBatchList;

    /**
     * Identifier of the payment group to which the payment belongs
     */
    @JsonProperty("GroupId")
    private String groupId;

    /**
     * Whether to reject duplicate operations with the same identification details within the group.
     */
    @JsonProperty("StopSameIdentifications")
    private boolean stopSameIdentifications;


    
    public CreateFreeOperationBatchArgs() {
    }

    
    public CreateFreeOperationBatchArgs(List<FreeOperation> freeOperationBatchList, String groupId, boolean stopSameIdentifications) {
        this.freeOperationBatchList = freeOperationBatchList;
        this.groupId = groupId;
        this.stopSameIdentifications = stopSameIdentifications;
    }
    
    
    public CreateFreeOperationBatchArgs(String sessionToken, List<FreeOperation> freeOperationBatchList, String groupId, boolean stopSameIdentifications) {
        super(sessionToken);
        this.freeOperationBatchList = freeOperationBatchList;
        this.groupId = groupId;
        this.stopSameIdentifications = stopSameIdentifications;
    }

    
    public List<FreeOperation> getFreeOperationBatchList() {
        return freeOperationBatchList;
    }

    public void setFreeOperationBatchList(List<FreeOperation> freeOperationBatchList) {
        this.freeOperationBatchList = freeOperationBatchList;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public boolean getStopSameIdentifications() {
        return stopSameIdentifications;
    }

    public void setStopSameIdentifications(boolean stopSameIdentifications) {
        this.stopSameIdentifications = stopSameIdentifications;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateFreeOperationBatchArgs that = (CreateFreeOperationBatchArgs) o;
        return Objects.equals(freeOperationBatchList, that.freeOperationBatchList) && Objects.equals(groupId, that.groupId) && Objects.equals(stopSameIdentifications, that.stopSameIdentifications) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(freeOperationBatchList, groupId, stopSameIdentifications);
    }

    @Override
    public String toString() {
        return "CreateFreeOperationBatchArgs{" +
                "freeOperationBatchList='" + freeOperationBatchList + '\'' +
                ", groupId='" + groupId + '\'' +
                ", stopSameIdentifications='" + stopSameIdentifications + '\'' +

                '}';
    }
}