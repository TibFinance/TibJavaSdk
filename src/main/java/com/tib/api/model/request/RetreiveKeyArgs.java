
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


public class RetreiveKeyArgs  implements IBaseCryptedServiceArgs  {

    
    /**
 * Gets or sets the encryption key.
 */
    @JsonProperty("EncryptionKey")
    private String encryptionKey;


    
    public RetreiveKeyArgs() {
    }

    
    public RetreiveKeyArgs(String encryptionKey) {
        this.encryptionKey = encryptionKey;

    }
    
    

    
    public String getEncryptionKey() {
        return encryptionKey;
    }

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RetreiveKeyArgs that = (RetreiveKeyArgs) o;
        return Objects.equals(encryptionKey, that.encryptionKey) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(encryptionKey);
    }

    @Override
    public String toString() {
        return "RetreiveKeyArgs{" +
                 "encryptionKey='" + encryptionKey + '\'' +

                '}';
    }
}