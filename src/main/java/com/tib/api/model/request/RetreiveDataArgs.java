
package com.tib.api.model.request;

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


public class RetreiveDataArgs  implements IBaseCryptedServiceArgs  {

    
    /**
     * Gets or sets the data identifier.
     */
    @JsonProperty("DataId")
    private String dataId;


    
    public RetreiveDataArgs() {
    }

    
    public RetreiveDataArgs(String dataId) {
        this.dataId = dataId;
    }
    
    

    
    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RetreiveDataArgs that = (RetreiveDataArgs) o;
        return Objects.equals(dataId, that.dataId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(dataId);
    }

    @Override
    public String toString() {
        return "RetreiveDataArgs{" +
                "dataId='" + dataId + '\'' +

                '}';
    }
}