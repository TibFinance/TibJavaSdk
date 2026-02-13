
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class GetClientsByBoardingStepArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * Gets or sets the boarding step.
 */
    @JsonProperty("BoardingStep")
    private Integer boardingStep;

    /**
 * 
 */
    @JsonProperty("Override")
    private Object override;


    
    public GetClientsByBoardingStepArgs() {
    }

    
    public GetClientsByBoardingStepArgs(Integer boardingStep, Object override) {
        this.boardingStep = boardingStep;
this.override = override;

    }
    
    
    public GetClientsByBoardingStepArgs(String adminSessionToken, Integer boardingStep, Object override) {
        super(adminSessionToken);
        this.boardingStep = boardingStep;
this.override = override;

    }

    
    public Integer getBoardingStep() {
        return boardingStep;
    }

    public void setBoardingStep(Integer boardingStep) {
        this.boardingStep = boardingStep;
    }

    public Object getOverride() {
        return override;
    }

    public void setOverride(Object override) {
        this.override = override;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetClientsByBoardingStepArgs that = (GetClientsByBoardingStepArgs) o;
        return Objects.equals(boardingStep, that.boardingStep) && Objects.equals(override, that.override) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingStep, override);
    }

    @Override
    public String toString() {
        return "GetClientsByBoardingStepArgs{" +
                 "boardingStep='" + boardingStep + '\'' +
 ", override='" + override + '\'' +

                '}';
    }
}