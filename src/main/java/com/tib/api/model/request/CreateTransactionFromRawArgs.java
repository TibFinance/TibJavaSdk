
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAuthenticatedCryptedArgs;


import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class CreateTransactionFromRawArgs  extends BaseAuthenticatedCryptedArgs  {

    
    /**
     * The payment file to upload, as text: our semicolon-separated format, the Payments Canada CPA Standard 005 format or the 80-character EFT export of Sage 50.
     */
    @JsonProperty("RawAcpFileContent")
    private String rawAcpFileContent;

    /**
     * Merchant ID to scope this operation to. Automatically set for merchant-level logins.
     */
    @JsonProperty("MerchantId")
    private String merchantId;

    /**
     * When true, the deposits in this file become instant deposits. Additional fees may apply. Deposits only, one-time, dated today or earlier (UTC): the upload is refused if the file contains a collection line, a recurring line or a deposit dated after today, or if the merchant's currency is not CAD. Optional: absent or false keeps the usual schedule.
     */
    @JsonProperty("IsImmediate")
    private boolean isImmediate;


    
    public CreateTransactionFromRawArgs() {
    }

    
    public CreateTransactionFromRawArgs(String rawAcpFileContent, String merchantId, boolean isImmediate) {
        this.rawAcpFileContent = rawAcpFileContent;
        this.merchantId = merchantId;
        this.isImmediate = isImmediate;
    }
    
    
    public CreateTransactionFromRawArgs(String sessionToken, String rawAcpFileContent, String merchantId, boolean isImmediate) {
        super(sessionToken);
        this.rawAcpFileContent = rawAcpFileContent;
        this.merchantId = merchantId;
        this.isImmediate = isImmediate;
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

    public boolean getIsImmediate() {
        return isImmediate;
    }

    public void setIsImmediate(boolean isImmediate) {
        this.isImmediate = isImmediate;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateTransactionFromRawArgs that = (CreateTransactionFromRawArgs) o;
        return Objects.equals(rawAcpFileContent, that.rawAcpFileContent) && Objects.equals(merchantId, that.merchantId) && Objects.equals(isImmediate, that.isImmediate) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(rawAcpFileContent, merchantId, isImmediate);
    }

    @Override
    public String toString() {
        return "CreateTransactionFromRawArgs{" +
                "rawAcpFileContent='" + (rawAcpFileContent == null ? null : "***") + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", isImmediate='" + isImmediate + '\'' +

                '}';
    }
}