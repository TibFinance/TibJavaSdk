
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


public class CreateTransactionFromRawArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * Retrieves or assigns the content of the raw ACP file.
     */
    @JsonProperty("RawAcpFileContent")
    private String rawAcpFileContent;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private String merchantId;


    
    public CreateTransactionFromRawArgs() {
    }

    
    public CreateTransactionFromRawArgs(String rawAcpFileContent, String merchantId) {
        this.rawAcpFileContent = rawAcpFileContent;
        this.merchantId = merchantId;
    }
    
    
    public CreateTransactionFromRawArgs(String sessionToken, String rawAcpFileContent, String merchantId) {
        super(sessionToken);
        this.rawAcpFileContent = rawAcpFileContent;
        this.merchantId = merchantId;
    }

    
    public String getRawAcpFileContent() {
        return rawAcpFileContent;
    }

    public void setRawAcpFileContent(String rawAcpFileContent) {
        this.rawAcpFileContent = rawAcpFileContent;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateTransactionFromRawArgs that = (CreateTransactionFromRawArgs) o;
        return Objects.equals(rawAcpFileContent, that.rawAcpFileContent) && Objects.equals(merchantId, that.merchantId) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(rawAcpFileContent, merchantId);
    }

    @Override
    public String toString() {
        return "CreateTransactionFromRawArgs{" +
                "rawAcpFileContent='" + rawAcpFileContent + '\'' +
                ", merchantId='" + merchantId + '\'' +

                '}';
    }
}