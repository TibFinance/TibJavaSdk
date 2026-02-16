
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.WhiteLabeling;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class UpdateWhiteLabelingDataResonse   {

    
    /**
     * 
     */
    @JsonProperty("WhiteLabeling")
    private WhiteLabeling whiteLabeling;


    
    public UpdateWhiteLabelingDataResonse() {
    }

    
    public UpdateWhiteLabelingDataResonse(WhiteLabeling whiteLabeling) {
        this.whiteLabeling = whiteLabeling;
    }
    
    

    
    public WhiteLabeling getWhiteLabeling() {
        return whiteLabeling;
    }

    public void setWhiteLabeling(WhiteLabeling whiteLabeling) {
        this.whiteLabeling = whiteLabeling;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateWhiteLabelingDataResonse that = (UpdateWhiteLabelingDataResonse) o;
        return Objects.equals(whiteLabeling, that.whiteLabeling) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(whiteLabeling);
    }

    @Override
    public String toString() {
        return "UpdateWhiteLabelingDataResonse{" +
                "whiteLabeling='" + whiteLabeling + '\'' +

                '}';
    }
}