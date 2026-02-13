
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


public class SESARWebHookArgs  implements IBaseCryptedServiceArgs  {

    
    /**
 * The crypted manifest
 */
    @JsonProperty("CryptedObject")
    private String cryptedObject;

    /**
 * The hashkey of the crytped key used
 */
    @JsonProperty("HashKey")
    private String hashKey;


    
    public SESARWebHookArgs() {
    }

    
    public SESARWebHookArgs(String cryptedObject, String hashKey) {
        this.cryptedObject = cryptedObject;
this.hashKey = hashKey;

    }
    
    

    
    public String getCryptedObject() {
        return cryptedObject;
    }

    public void setCryptedObject(String cryptedObject) {
        this.cryptedObject = cryptedObject;
    }

    public String getHashKey() {
        return hashKey;
    }

    public void setHashKey(String hashKey) {
        this.hashKey = hashKey;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SESARWebHookArgs that = (SESARWebHookArgs) o;
        return Objects.equals(cryptedObject, that.cryptedObject) && Objects.equals(hashKey, that.hashKey) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(cryptedObject, hashKey);
    }

    @Override
    public String toString() {
        return "SESARWebHookArgs{" +
                 "cryptedObject='" + cryptedObject + '\'' +
 ", hashKey='" + hashKey + '\'' +

                '}';
    }
}