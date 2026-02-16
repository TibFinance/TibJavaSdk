
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


public class ExternallyCryptedDataEntity   {

    
    /**
     * Gets or sets the external key identifier.
     */
    @JsonProperty("ExternalKeyId")
    private String externalKeyId;

    /**
     * Gets or sets the external vault identifier.
     */
    @JsonProperty("ExternalVaultId")
    private String externalVaultId;

    /**
     * Gets or sets the encryption iv.
     */
    @JsonProperty("EncryptionIV")
    private String encryptionIV;

    /**
     * Gets or sets the crypted data part1.
     */
    @JsonProperty("CryptedDataPart1")
    private String cryptedDataPart1;


    
    public ExternallyCryptedDataEntity() {
    }

    
    public ExternallyCryptedDataEntity(String externalKeyId, String externalVaultId, String encryptionIV, String cryptedDataPart1) {
        this.externalKeyId = externalKeyId;
        this.externalVaultId = externalVaultId;
        this.encryptionIV = encryptionIV;
        this.cryptedDataPart1 = cryptedDataPart1;
    }
    
    

    
    public String getExternalKeyId() {
        return externalKeyId;
    }

    public void setExternalKeyId(String externalKeyId) {
        this.externalKeyId = externalKeyId;
    }

    public String getExternalVaultId() {
        return externalVaultId;
    }

    public void setExternalVaultId(String externalVaultId) {
        this.externalVaultId = externalVaultId;
    }

    public String getEncryptionIV() {
        return encryptionIV;
    }

    public void setEncryptionIV(String encryptionIV) {
        this.encryptionIV = encryptionIV;
    }

    public String getCryptedDataPart1() {
        return cryptedDataPart1;
    }

    public void setCryptedDataPart1(String cryptedDataPart1) {
        this.cryptedDataPart1 = cryptedDataPart1;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExternallyCryptedDataEntity that = (ExternallyCryptedDataEntity) o;
        return Objects.equals(externalKeyId, that.externalKeyId) && Objects.equals(externalVaultId, that.externalVaultId) && Objects.equals(encryptionIV, that.encryptionIV) && Objects.equals(cryptedDataPart1, that.cryptedDataPart1) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(externalKeyId, externalVaultId, encryptionIV, cryptedDataPart1);
    }

    @Override
    public String toString() {
        return "ExternallyCryptedDataEntity{" +
                "externalKeyId='" + externalKeyId + '\'' +
                ", externalVaultId='" + externalVaultId + '\'' +
                ", encryptionIV='" + encryptionIV + '\'' +
                ", cryptedDataPart1='" + cryptedDataPart1 + '\'' +

                '}';
    }
}