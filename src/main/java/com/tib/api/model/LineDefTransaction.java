
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BaseTransaction;
import com.tib.api.model.BaseLineHeader;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class LineDefTransaction  extends LineBaseWithHeader  {

    
    /**
     * Gets the segments.
     */
    @JsonProperty("Segments")
    private List<BaseTransaction> segments;


    
    public LineDefTransaction() {
    }

    
    public LineDefTransaction(List<BaseTransaction> segments) {
        this.segments = segments;
    }
    
    
    public LineDefTransaction(BaseLineHeader header, Integer startPosition, List<BaseTransaction> segments) {
        super(header, startPosition);
        this.segments = segments;
    }

    
    public List<BaseTransaction> getSegments() {
        return segments;
    }

    public void setSegments(List<BaseTransaction> segments) {
        this.segments = segments;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineDefTransaction that = (LineDefTransaction) o;
        return Objects.equals(segments, that.segments) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(segments);
    }

    @Override
    public String toString() {
        return "LineDefTransaction{" +
                "segments='" + segments + '\'' +

                '}';
    }
}