
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class GetBinInfoArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("Bin")
    private String bin;


    
    public GetBinInfoArgs() {
    }

    
    public GetBinInfoArgs(String bin) {
        this.bin = bin;

    }
    
    
    public GetBinInfoArgs(String sessionToken, String bin) {
        super(sessionToken);
        this.bin = bin;

    }

    
    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBinInfoArgs that = (GetBinInfoArgs) o;
        return Objects.equals(bin, that.bin) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(bin);
    }

    @Override
    public String toString() {
        return "GetBinInfoArgs{" +
                 "bin='" + bin + '\'' +

                '}';
    }
}