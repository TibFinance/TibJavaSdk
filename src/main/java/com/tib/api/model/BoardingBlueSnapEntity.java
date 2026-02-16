
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


public class BoardingBlueSnapEntity  extends BoardingEntity  {

    
    /**
     * 
     */
    @JsonProperty("BusinessInfo")
    private Object businessInfo;

    /**
     * 
     */
    @JsonProperty("BankingInfo")
    private Object bankingInfo;

    /**
     * 
     */
    @JsonProperty("OwnershipInfoArr")
    private List<Object> ownershipInfoArr;

    /**
     * 
     */
    @JsonProperty("CompanyRep")
    private Object companyRep;

    /**
     * 
     */
    @JsonProperty("AdditionalCompanyReps")
    private List<Object> additionalCompanyReps;

    /**
     * 
     */
    @JsonProperty("MerchantAgreementsSign")
    private Object merchantAgreementsSign;


    
    public BoardingBlueSnapEntity() {
    }

    
    public BoardingBlueSnapEntity(Object businessInfo, Object bankingInfo, List<Object> ownershipInfoArr, Object companyRep, List<Object> additionalCompanyReps, Object merchantAgreementsSign) {
        this.businessInfo = businessInfo;
        this.bankingInfo = bankingInfo;
        this.ownershipInfoArr = ownershipInfoArr;
        this.companyRep = companyRep;
        this.additionalCompanyReps = additionalCompanyReps;
        this.merchantAgreementsSign = merchantAgreementsSign;
    }
    
    

    
    public Object getBusinessInfo() {
        return businessInfo;
    }

    public void setBusinessInfo(Object businessInfo) {
        this.businessInfo = businessInfo;
    }

    public Object getBankingInfo() {
        return bankingInfo;
    }

    public void setBankingInfo(Object bankingInfo) {
        this.bankingInfo = bankingInfo;
    }

    public List<Object> getOwnershipInfoArr() {
        return ownershipInfoArr;
    }

    public void setOwnershipInfoArr(List<Object> ownershipInfoArr) {
        this.ownershipInfoArr = ownershipInfoArr;
    }

    public Object getCompanyRep() {
        return companyRep;
    }

    public void setCompanyRep(Object companyRep) {
        this.companyRep = companyRep;
    }

    public List<Object> getAdditionalCompanyReps() {
        return additionalCompanyReps;
    }

    public void setAdditionalCompanyReps(List<Object> additionalCompanyReps) {
        this.additionalCompanyReps = additionalCompanyReps;
    }

    public Object getMerchantAgreementsSign() {
        return merchantAgreementsSign;
    }

    public void setMerchantAgreementsSign(Object merchantAgreementsSign) {
        this.merchantAgreementsSign = merchantAgreementsSign;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingBlueSnapEntity that = (BoardingBlueSnapEntity) o;
        return Objects.equals(businessInfo, that.businessInfo) && Objects.equals(bankingInfo, that.bankingInfo) && Objects.equals(ownershipInfoArr, that.ownershipInfoArr) && Objects.equals(companyRep, that.companyRep) && Objects.equals(additionalCompanyReps, that.additionalCompanyReps) && Objects.equals(merchantAgreementsSign, that.merchantAgreementsSign) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(businessInfo, bankingInfo, ownershipInfoArr, companyRep, additionalCompanyReps, merchantAgreementsSign);
    }

    @Override
    public String toString() {
        return "BoardingBlueSnapEntity{" +
                "businessInfo='" + businessInfo + '\'' +
                ", bankingInfo='" + bankingInfo + '\'' +
                ", ownershipInfoArr='" + ownershipInfoArr + '\'' +
                ", companyRep='" + companyRep + '\'' +
                ", additionalCompanyReps='" + additionalCompanyReps + '\'' +
                ", merchantAgreementsSign='" + merchantAgreementsSign + '\'' +

                '}';
    }
}