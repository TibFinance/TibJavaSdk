
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
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


public class PLineWithHeader  extends LineBaseWithHeader  {

    

    
    public PLineWithHeader() {
    }

    
    
    
    public PLineWithHeader(BaseLineHeader header, Integer startPosition) {
        super(header, startPosition);
    }

    


    

    

    @Override
    public String toString() {
        return "PLineWithHeader{" +
                
                '}';
    }
}