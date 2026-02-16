
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


public class UpdateWhiteLabelingDataArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * 
     */
    @JsonProperty("UpdatedWhiteLabelingData")
    private List<WhiteLabelingData> updatedWhiteLabelingData;

    /**
     * 
     */
    @JsonProperty("WhiteLabelId")
    private String whiteLabelId;

    /**
     * 
     */
    @JsonProperty("Logo")
    private String logo;


    
    public UpdateWhiteLabelingDataArgs() {
    }

    
    public UpdateWhiteLabelingDataArgs(List<WhiteLabelingData> updatedWhiteLabelingData, String whiteLabelId, String logo) {
        this.updatedWhiteLabelingData = updatedWhiteLabelingData;
        this.whiteLabelId = whiteLabelId;
        this.logo = logo;
    }
    
    
    public UpdateWhiteLabelingDataArgs(String adminSessionToken, List<WhiteLabelingData> updatedWhiteLabelingData, String whiteLabelId, String logo) {
        super(adminSessionToken);
        this.updatedWhiteLabelingData = updatedWhiteLabelingData;
        this.whiteLabelId = whiteLabelId;
        this.logo = logo;
    }

    
    public List<WhiteLabelingData> getUpdatedWhiteLabelingData() {
        return updatedWhiteLabelingData;
    }

    public void setUpdatedWhiteLabelingData(List<WhiteLabelingData> updatedWhiteLabelingData) {
        this.updatedWhiteLabelingData = updatedWhiteLabelingData;
    }

    public String getWhiteLabelId() {
        return whiteLabelId;
    }

    public void setWhiteLabelId(String whiteLabelId) {
        this.whiteLabelId = whiteLabelId;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateWhiteLabelingDataArgs that = (UpdateWhiteLabelingDataArgs) o;
        return Objects.equals(updatedWhiteLabelingData, that.updatedWhiteLabelingData) && Objects.equals(whiteLabelId, that.whiteLabelId) && Objects.equals(logo, that.logo) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(updatedWhiteLabelingData, whiteLabelId, logo);
    }

    @Override
    public String toString() {
        return "UpdateWhiteLabelingDataArgs{" +
                "updatedWhiteLabelingData='" + updatedWhiteLabelingData + '\'' +
                ", whiteLabelId='" + whiteLabelId + '\'' +
                ", logo='" + logo + '\'' +

                '}';
    }
}