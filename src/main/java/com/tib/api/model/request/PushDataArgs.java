
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


public class PushDataArgs  implements IBaseCryptedServiceArgs  {

    
    /**
 * Gets or sets the data crypted base64.
 */
    @JsonProperty("DataCryptedBase64")
    private String dataCryptedBase64;


    
    public PushDataArgs() {
    }

    
    public PushDataArgs(String dataCryptedBase64) {
        this.dataCryptedBase64 = dataCryptedBase64;

    }
    
    

    
    public String getDataCryptedBase64() {
        return dataCryptedBase64;
    }

    public void setDataCryptedBase64(String dataCryptedBase64) {
        this.dataCryptedBase64 = dataCryptedBase64;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PushDataArgs that = (PushDataArgs) o;
        return Objects.equals(dataCryptedBase64, that.dataCryptedBase64) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(dataCryptedBase64);
    }

    @Override
    public String toString() {
        return "PushDataArgs{" +
                 "dataCryptedBase64='" + dataCryptedBase64 + '\'' +

                '}';
    }
}