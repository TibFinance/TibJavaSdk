
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class PendingChangeAttribute   {

    
    /**
     * Gets or sets a value indicating whether [do not render on public pending change].
     */
    @JsonProperty("DoNotRenderOnPublicPendingChange")
    private boolean doNotRenderOnPublicPendingChange;


    
    public PendingChangeAttribute() {
    }

    
    public PendingChangeAttribute(boolean doNotRenderOnPublicPendingChange) {
        this.doNotRenderOnPublicPendingChange = doNotRenderOnPublicPendingChange;
    }
    
    

    
    public boolean getDoNotRenderOnPublicPendingChange() {
        return doNotRenderOnPublicPendingChange;
    }

    public void setDoNotRenderOnPublicPendingChange(boolean doNotRenderOnPublicPendingChange) {
        this.doNotRenderOnPublicPendingChange = doNotRenderOnPublicPendingChange;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PendingChangeAttribute that = (PendingChangeAttribute) o;
        return Objects.equals(doNotRenderOnPublicPendingChange, that.doNotRenderOnPublicPendingChange) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(doNotRenderOnPublicPendingChange);
    }

    @Override
    public String toString() {
        return "PendingChangeAttribute{" +
                "doNotRenderOnPublicPendingChange='" + doNotRenderOnPublicPendingChange + '\'' +

                '}';
    }
}