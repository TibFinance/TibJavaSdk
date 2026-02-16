
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.WhiteLabelingData;
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


public class UpdateDefaultWhiteLabelingDataArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("UpdatedWhiteLabelingData")
    private List<WhiteLabelingData> updatedWhiteLabelingData;


    
    public UpdateDefaultWhiteLabelingDataArgs() {
    }

    
    public UpdateDefaultWhiteLabelingDataArgs(List<WhiteLabelingData> updatedWhiteLabelingData) {
        this.updatedWhiteLabelingData = updatedWhiteLabelingData;
    }
    
    
    public UpdateDefaultWhiteLabelingDataArgs(String adminSessionToken, List<WhiteLabelingData> updatedWhiteLabelingData) {
        super(adminSessionToken);
        this.updatedWhiteLabelingData = updatedWhiteLabelingData;
    }

    
    public List<WhiteLabelingData> getUpdatedWhiteLabelingData() {
        return updatedWhiteLabelingData;
    }

    public void setUpdatedWhiteLabelingData(List<WhiteLabelingData> updatedWhiteLabelingData) {
        this.updatedWhiteLabelingData = updatedWhiteLabelingData;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateDefaultWhiteLabelingDataArgs that = (UpdateDefaultWhiteLabelingDataArgs) o;
        return Objects.equals(updatedWhiteLabelingData, that.updatedWhiteLabelingData) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(updatedWhiteLabelingData);
    }

    @Override
    public String toString() {
        return "UpdateDefaultWhiteLabelingDataArgs{" +
                "updatedWhiteLabelingData='" + updatedWhiteLabelingData + '\'' +

                '}';
    }
}