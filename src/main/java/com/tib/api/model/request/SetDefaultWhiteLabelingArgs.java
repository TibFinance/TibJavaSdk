
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


public class SetDefaultWhiteLabelingArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
     * WhiteLabeling Data.
     */
    @JsonProperty("WhiteLabelingData")
    private List<WhiteLabelingData> whiteLabelingData;


    
    public SetDefaultWhiteLabelingArgs() {
    }

    
    public SetDefaultWhiteLabelingArgs(List<WhiteLabelingData> whiteLabelingData) {
        this.whiteLabelingData = whiteLabelingData;
    }
    
    
    public SetDefaultWhiteLabelingArgs(String adminSessionToken, List<WhiteLabelingData> whiteLabelingData) {
        super(adminSessionToken);
        this.whiteLabelingData = whiteLabelingData;
    }

    
    public List<WhiteLabelingData> getWhiteLabelingData() {
        return whiteLabelingData;
    }

    public void setWhiteLabelingData(List<WhiteLabelingData> whiteLabelingData) {
        this.whiteLabelingData = whiteLabelingData;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetDefaultWhiteLabelingArgs that = (SetDefaultWhiteLabelingArgs) o;
        return Objects.equals(whiteLabelingData, that.whiteLabelingData) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(whiteLabelingData);
    }

    @Override
    public String toString() {
        return "SetDefaultWhiteLabelingArgs{" +
                "whiteLabelingData='" + whiteLabelingData + '\'' +

                '}';
    }
}