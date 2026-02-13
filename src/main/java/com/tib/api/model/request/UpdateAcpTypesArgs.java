
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.request.BaseAdminOnlyCryptedArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class UpdateAcpTypesArgs  extends BaseAdminOnlyCryptedArgs  {

    
    /**
 * 
 */
    @JsonProperty("Source")
    private String source;

    /**
 * 
 */
    @JsonProperty("SourceId")
    private String sourceId;

    /**
 * 
 */
    @JsonProperty("CollectMerchantCode")
    private Integer collectMerchantCode;

    /**
 * 
 */
    @JsonProperty("DepositClientCode")
    private Integer depositClientCode;

    /**
 * 
 */
    @JsonProperty("CollectClientCode")
    private Integer collectClientCode;

    /**
 * 
 */
    @JsonProperty("DepositMerchantCode")
    private Integer depositMerchantCode;

    /**
 * 
 */
    @JsonProperty("FeesmerchantCode")
    private Integer feesmerchantCode;

    /**
 * 
 */
    @JsonProperty("TibFeesCode")
    private Integer tibFeesCode;


    
    public UpdateAcpTypesArgs() {
    }

    
    public UpdateAcpTypesArgs(String source, String sourceId, Integer collectMerchantCode, Integer depositClientCode, Integer collectClientCode, Integer depositMerchantCode, Integer feesmerchantCode, Integer tibFeesCode) {
        this.source = source;
this.sourceId = sourceId;
this.collectMerchantCode = collectMerchantCode;
this.depositClientCode = depositClientCode;
this.collectClientCode = collectClientCode;
this.depositMerchantCode = depositMerchantCode;
this.feesmerchantCode = feesmerchantCode;
this.tibFeesCode = tibFeesCode;

    }
    
    
    public UpdateAcpTypesArgs(String adminSessionToken, String source, String sourceId, Integer collectMerchantCode, Integer depositClientCode, Integer collectClientCode, Integer depositMerchantCode, Integer feesmerchantCode, Integer tibFeesCode) {
        super(adminSessionToken);
        this.source = source;
this.sourceId = sourceId;
this.collectMerchantCode = collectMerchantCode;
this.depositClientCode = depositClientCode;
this.collectClientCode = collectClientCode;
this.depositMerchantCode = depositMerchantCode;
this.feesmerchantCode = feesmerchantCode;
this.tibFeesCode = tibFeesCode;

    }

    
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getCollectMerchantCode() {
        return collectMerchantCode;
    }

    public void setCollectMerchantCode(Integer collectMerchantCode) {
        this.collectMerchantCode = collectMerchantCode;
    }

    public Integer getDepositClientCode() {
        return depositClientCode;
    }

    public void setDepositClientCode(Integer depositClientCode) {
        this.depositClientCode = depositClientCode;
    }

    public Integer getCollectClientCode() {
        return collectClientCode;
    }

    public void setCollectClientCode(Integer collectClientCode) {
        this.collectClientCode = collectClientCode;
    }

    public Integer getDepositMerchantCode() {
        return depositMerchantCode;
    }

    public void setDepositMerchantCode(Integer depositMerchantCode) {
        this.depositMerchantCode = depositMerchantCode;
    }

    public Integer getFeesmerchantCode() {
        return feesmerchantCode;
    }

    public void setFeesmerchantCode(Integer feesmerchantCode) {
        this.feesmerchantCode = feesmerchantCode;
    }

    public Integer getTibFeesCode() {
        return tibFeesCode;
    }

    public void setTibFeesCode(Integer tibFeesCode) {
        this.tibFeesCode = tibFeesCode;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateAcpTypesArgs that = (UpdateAcpTypesArgs) o;
        return Objects.equals(source, that.source) && Objects.equals(sourceId, that.sourceId) && Objects.equals(collectMerchantCode, that.collectMerchantCode) && Objects.equals(depositClientCode, that.depositClientCode) && Objects.equals(collectClientCode, that.collectClientCode) && Objects.equals(depositMerchantCode, that.depositMerchantCode) && Objects.equals(feesmerchantCode, that.feesmerchantCode) && Objects.equals(tibFeesCode, that.tibFeesCode) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(source, sourceId, collectMerchantCode, depositClientCode, collectClientCode, depositMerchantCode, feesmerchantCode, tibFeesCode);
    }

    @Override
    public String toString() {
        return "UpdateAcpTypesArgs{" +
                 "source='" + source + '\'' +
 ", sourceId='" + sourceId + '\'' +
 ", collectMerchantCode='" + collectMerchantCode + '\'' +
 ", depositClientCode='" + depositClientCode + '\'' +
 ", collectClientCode='" + collectClientCode + '\'' +
 ", depositMerchantCode='" + depositMerchantCode + '\'' +
 ", feesmerchantCode='" + feesmerchantCode + '\'' +
 ", tibFeesCode='" + tibFeesCode + '\'' +

                '}';
    }
}