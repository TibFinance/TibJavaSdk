
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


public class SplitedCryptedDataEntity   {

    
    /**
 * Gets or sets the base64 crypted data part1.
 */
    @JsonProperty("Base64CryptedDataPart1")
    private String base64CryptedDataPart1;

    /**
 * Gets or sets the base64 crypted data part2.
 */
    @JsonProperty("Base64CryptedDataPart2")
    private String base64CryptedDataPart2;


    
    public SplitedCryptedDataEntity() {
    }

    
    public SplitedCryptedDataEntity(String base64CryptedDataPart1, String base64CryptedDataPart2) {
        this.base64CryptedDataPart1 = base64CryptedDataPart1;
this.base64CryptedDataPart2 = base64CryptedDataPart2;

    }
    
    

    
    public String getBase64CryptedDataPart1() {
        return base64CryptedDataPart1;
    }

    public void setBase64CryptedDataPart1(String base64CryptedDataPart1) {
        this.base64CryptedDataPart1 = base64CryptedDataPart1;
    }

    public String getBase64CryptedDataPart2() {
        return base64CryptedDataPart2;
    }

    public void setBase64CryptedDataPart2(String base64CryptedDataPart2) {
        this.base64CryptedDataPart2 = base64CryptedDataPart2;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SplitedCryptedDataEntity that = (SplitedCryptedDataEntity) o;
        return Objects.equals(base64CryptedDataPart1, that.base64CryptedDataPart1) && Objects.equals(base64CryptedDataPart2, that.base64CryptedDataPart2) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(base64CryptedDataPart1, base64CryptedDataPart2);
    }

    @Override
    public String toString() {
        return "SplitedCryptedDataEntity{" +
                 "base64CryptedDataPart1='" + base64CryptedDataPart1 + '\'' +
 ", base64CryptedDataPart2='" + base64CryptedDataPart2 + '\'' +

                '}';
    }
}