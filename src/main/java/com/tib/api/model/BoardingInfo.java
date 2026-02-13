
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BoardingInfoFileEntity;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BoardingInfo  extends BoardingInfoEntity  {

    
    /**
 * 
 */
    @JsonProperty("BoardingInfoId")
    private String boardingInfoId;

    /**
 * 
 */
    @JsonProperty("AdminBirthDate")
    private String adminBirthDate;

    /**
 * 
 */
    @JsonProperty("AdminZip")
    private String adminZip;

    /**
 * 
 */
    @JsonProperty("AdminCountryCode")
    private String adminCountryCode;

    /**
 * 
 */
    @JsonProperty("AdminStateCode")
    private String adminStateCode;

    /**
 * 
 */
    @JsonProperty("AdminPhone")
    private String adminPhone;

    /**
 * 
 */
    @JsonProperty("AdminGovId")
    private String adminGovId;

    /**
 * 
 */
    @JsonProperty("ManagerBirthDate")
    private String managerBirthDate;

    /**
 * 
 */
    @JsonProperty("ManagerZip")
    private String managerZip;

    /**
 * 
 */
    @JsonProperty("ManagerStateCode")
    private String managerStateCode;

    /**
 * 
 */
    @JsonProperty("ManagerPhone")
    private String managerPhone;

    /**
 * 
 */
    @JsonProperty("ManagerCountryCode")
    private String managerCountryCode;

    /**
 * 
 */
    @JsonProperty("ManagerGovId")
    private String managerGovId;

    /**
 * 
 */
    @JsonProperty("ManagerAddress_Edited")
    private String managerAddress_Edited;

    /**
 * 
 */
    @JsonProperty("ManagerFirstName_Edited")
    private String managerFirstName_Edited;

    /**
 * 
 */
    @JsonProperty("ManagerLastName_Edited")
    private String managerLastName_Edited;

    /**
 * 
 */
    @JsonProperty("CompanyCountryCode")
    private String companyCountryCode;

    /**
 * 
 */
    @JsonProperty("CompanyCity")
    private String companyCity;

    /**
 * 
 */
    @JsonProperty("CompanyZip")
    private String companyZip;

    /**
 * 
 */
    @JsonProperty("CompanyStateCode")
    private String companyStateCode;

    /**
 * 
 */
    @JsonProperty("CompanyTaxId")
    private String companyTaxId;

    /**
 * 
 */
    @JsonProperty("CompanyWebSite")
    private String companyWebSite;

    /**
 * 
 */
    @JsonProperty("CompanySalesVolume")
    private String companySalesVolume;

    /**
 * 
 */
    @JsonProperty("CompanyProductAndServiceDescription")
    private String companyProductAndServiceDescription;

    /**
 * 
 */
    @JsonProperty("BusinessRegistrationNumber")
    private String businessRegistrationNumber;

    /**
 * 
 */
    @JsonProperty("BusinessRegistrationNumber_Edited")
    private String businessRegistrationNumber_Edited;

    /**
 * 
 */
    @JsonProperty("BankBic")
    private String bankBic;

    /**
 * 
 */
    @JsonProperty("BankIban")
    private String bankIban;

    /**
 * 
 */
    @JsonProperty("BankCity")
    private String bankCity;

    /**
 * 
 */
    @JsonProperty("BankStateCode")
    private String bankStateCode;

    /**
 * 
 */
    @JsonProperty("BankCountryCode")
    private String bankCountryCode;

    /**
 * 
 */
    @JsonProperty("BankName")
    private String bankName;

    /**
 * 
 */
    @JsonProperty("BankRoutingNumber")
    private String bankRoutingNumber;

    /**
 * 
 */
    @JsonProperty("BankPayoutCurrency")
    private String bankPayoutCurrency;

    /**
 * 
 */
    @JsonProperty("BankSortCode")
    private String bankSortCode;

    /**
 * 
 */
    @JsonProperty("BankBsb")
    private String bankBsb;

    /**
 * 
 */
    @JsonProperty("BankSwiftCode")
    private String bankSwiftCode;

    /**
 * 
 */
    @JsonProperty("CompanyBusinessCategory")
    private String companyBusinessCategory;

    /**
 * 
 */
    @JsonProperty("AdminCity")
    private String adminCity;

    /**
 * 
 */
    @JsonProperty("ManagerCity")
    private String managerCity;

    /**
 * 
 */
    @JsonProperty("Files")
    private List<BoardingInfoFileEntity> files;


    
    public BoardingInfo() {
    }

    
    public BoardingInfo(String boardingInfoId, String adminBirthDate, String adminZip, String adminCountryCode, String adminStateCode, String adminPhone, String adminGovId, String managerBirthDate, String managerZip, String managerStateCode, String managerPhone, String managerCountryCode, String managerGovId, String managerAddress_Edited, String managerFirstName_Edited, String managerLastName_Edited, String companyCountryCode, String companyCity, String companyZip, String companyStateCode, String companyTaxId, String companyWebSite, String companySalesVolume, String companyProductAndServiceDescription, String businessRegistrationNumber, String businessRegistrationNumber_Edited, String bankBic, String bankIban, String bankCity, String bankStateCode, String bankCountryCode, String bankName, String bankRoutingNumber, String bankPayoutCurrency, String bankSortCode, String bankBsb, String bankSwiftCode, String companyBusinessCategory, String adminCity, String managerCity, List<BoardingInfoFileEntity> files) {
        this.boardingInfoId = boardingInfoId;
this.adminBirthDate = adminBirthDate;
this.adminZip = adminZip;
this.adminCountryCode = adminCountryCode;
this.adminStateCode = adminStateCode;
this.adminPhone = adminPhone;
this.adminGovId = adminGovId;
this.managerBirthDate = managerBirthDate;
this.managerZip = managerZip;
this.managerStateCode = managerStateCode;
this.managerPhone = managerPhone;
this.managerCountryCode = managerCountryCode;
this.managerGovId = managerGovId;
this.managerAddress_Edited = managerAddress_Edited;
this.managerFirstName_Edited = managerFirstName_Edited;
this.managerLastName_Edited = managerLastName_Edited;
this.companyCountryCode = companyCountryCode;
this.companyCity = companyCity;
this.companyZip = companyZip;
this.companyStateCode = companyStateCode;
this.companyTaxId = companyTaxId;
this.companyWebSite = companyWebSite;
this.companySalesVolume = companySalesVolume;
this.companyProductAndServiceDescription = companyProductAndServiceDescription;
this.businessRegistrationNumber = businessRegistrationNumber;
this.businessRegistrationNumber_Edited = businessRegistrationNumber_Edited;
this.bankBic = bankBic;
this.bankIban = bankIban;
this.bankCity = bankCity;
this.bankStateCode = bankStateCode;
this.bankCountryCode = bankCountryCode;
this.bankName = bankName;
this.bankRoutingNumber = bankRoutingNumber;
this.bankPayoutCurrency = bankPayoutCurrency;
this.bankSortCode = bankSortCode;
this.bankBsb = bankBsb;
this.bankSwiftCode = bankSwiftCode;
this.companyBusinessCategory = companyBusinessCategory;
this.adminCity = adminCity;
this.managerCity = managerCity;
this.files = files;

    }
    
    
    public BoardingInfo(String clientId, String companyName, String companyAddress, String companyPhone, String companyEmail, String adminFirstName, String adminLastName, String adminAddress, boolean isManagerAlsoAdmin, String managerFirstName, String managerLastName, String managerAddress, String managerLinkedIn, Integer companyType, String companyName_Edited, String companyAddress_Edited, Integer companyType_Edited, String adminFirstName_Edited, String adminLastName_Edited, String adminAddress_Edited, boolean didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, boolean didOwnersAlreadyAskedForBankrupcy, boolean haveYouBeenSubjectOfVisaRiskProgram, String specimenFile, String idFile, Integer boardingStep, String transitNumber, String accountNumber, String accountOwner, String bankNumber, String boardingInfoId, String adminBirthDate, String adminZip, String adminCountryCode, String adminStateCode, String adminPhone, String adminGovId, String managerBirthDate, String managerZip, String managerStateCode, String managerPhone, String managerCountryCode, String managerGovId, String managerAddress_Edited, String managerFirstName_Edited, String managerLastName_Edited, String companyCountryCode, String companyCity, String companyZip, String companyStateCode, String companyTaxId, String companyWebSite, String companySalesVolume, String companyProductAndServiceDescription, String businessRegistrationNumber, String businessRegistrationNumber_Edited, String bankBic, String bankIban, String bankCity, String bankStateCode, String bankCountryCode, String bankName, String bankRoutingNumber, String bankPayoutCurrency, String bankSortCode, String bankBsb, String bankSwiftCode, String companyBusinessCategory, String adminCity, String managerCity, List<BoardingInfoFileEntity> files) {
        super(clientId, companyName, companyAddress, companyPhone, companyEmail, adminFirstName, adminLastName, adminAddress, isManagerAlsoAdmin, managerFirstName, managerLastName, managerAddress, managerLinkedIn, companyType, companyName_Edited, companyAddress_Edited, companyType_Edited, adminFirstName_Edited, adminLastName_Edited, adminAddress_Edited, didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, didOwnersAlreadyAskedForBankrupcy, haveYouBeenSubjectOfVisaRiskProgram, specimenFile, idFile, boardingStep, transitNumber, accountNumber, accountOwner, bankNumber);
        this.boardingInfoId = boardingInfoId;
this.adminBirthDate = adminBirthDate;
this.adminZip = adminZip;
this.adminCountryCode = adminCountryCode;
this.adminStateCode = adminStateCode;
this.adminPhone = adminPhone;
this.adminGovId = adminGovId;
this.managerBirthDate = managerBirthDate;
this.managerZip = managerZip;
this.managerStateCode = managerStateCode;
this.managerPhone = managerPhone;
this.managerCountryCode = managerCountryCode;
this.managerGovId = managerGovId;
this.managerAddress_Edited = managerAddress_Edited;
this.managerFirstName_Edited = managerFirstName_Edited;
this.managerLastName_Edited = managerLastName_Edited;
this.companyCountryCode = companyCountryCode;
this.companyCity = companyCity;
this.companyZip = companyZip;
this.companyStateCode = companyStateCode;
this.companyTaxId = companyTaxId;
this.companyWebSite = companyWebSite;
this.companySalesVolume = companySalesVolume;
this.companyProductAndServiceDescription = companyProductAndServiceDescription;
this.businessRegistrationNumber = businessRegistrationNumber;
this.businessRegistrationNumber_Edited = businessRegistrationNumber_Edited;
this.bankBic = bankBic;
this.bankIban = bankIban;
this.bankCity = bankCity;
this.bankStateCode = bankStateCode;
this.bankCountryCode = bankCountryCode;
this.bankName = bankName;
this.bankRoutingNumber = bankRoutingNumber;
this.bankPayoutCurrency = bankPayoutCurrency;
this.bankSortCode = bankSortCode;
this.bankBsb = bankBsb;
this.bankSwiftCode = bankSwiftCode;
this.companyBusinessCategory = companyBusinessCategory;
this.adminCity = adminCity;
this.managerCity = managerCity;
this.files = files;

    }

    
    public String getBoardingInfoId() {
        return boardingInfoId;
    }

    public void setBoardingInfoId(String boardingInfoId) {
        this.boardingInfoId = boardingInfoId;
    }

    public String getAdminBirthDate() {
        return adminBirthDate;
    }

    public void setAdminBirthDate(String adminBirthDate) {
        this.adminBirthDate = adminBirthDate;
    }

    public String getAdminZip() {
        return adminZip;
    }

    public void setAdminZip(String adminZip) {
        this.adminZip = adminZip;
    }

    public String getAdminCountryCode() {
        return adminCountryCode;
    }

    public void setAdminCountryCode(String adminCountryCode) {
        this.adminCountryCode = adminCountryCode;
    }

    public String getAdminStateCode() {
        return adminStateCode;
    }

    public void setAdminStateCode(String adminStateCode) {
        this.adminStateCode = adminStateCode;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }

    public String getAdminGovId() {
        return adminGovId;
    }

    public void setAdminGovId(String adminGovId) {
        this.adminGovId = adminGovId;
    }

    public String getManagerBirthDate() {
        return managerBirthDate;
    }

    public void setManagerBirthDate(String managerBirthDate) {
        this.managerBirthDate = managerBirthDate;
    }

    public String getManagerZip() {
        return managerZip;
    }

    public void setManagerZip(String managerZip) {
        this.managerZip = managerZip;
    }

    public String getManagerStateCode() {
        return managerStateCode;
    }

    public void setManagerStateCode(String managerStateCode) {
        this.managerStateCode = managerStateCode;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public String getManagerCountryCode() {
        return managerCountryCode;
    }

    public void setManagerCountryCode(String managerCountryCode) {
        this.managerCountryCode = managerCountryCode;
    }

    public String getManagerGovId() {
        return managerGovId;
    }

    public void setManagerGovId(String managerGovId) {
        this.managerGovId = managerGovId;
    }

    public String getManagerAddress_Edited() {
        return managerAddress_Edited;
    }

    public void setManagerAddress_Edited(String managerAddress_Edited) {
        this.managerAddress_Edited = managerAddress_Edited;
    }

    public String getManagerFirstName_Edited() {
        return managerFirstName_Edited;
    }

    public void setManagerFirstName_Edited(String managerFirstName_Edited) {
        this.managerFirstName_Edited = managerFirstName_Edited;
    }

    public String getManagerLastName_Edited() {
        return managerLastName_Edited;
    }

    public void setManagerLastName_Edited(String managerLastName_Edited) {
        this.managerLastName_Edited = managerLastName_Edited;
    }

    public String getCompanyCountryCode() {
        return companyCountryCode;
    }

    public void setCompanyCountryCode(String companyCountryCode) {
        this.companyCountryCode = companyCountryCode;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyZip() {
        return companyZip;
    }

    public void setCompanyZip(String companyZip) {
        this.companyZip = companyZip;
    }

    public String getCompanyStateCode() {
        return companyStateCode;
    }

    public void setCompanyStateCode(String companyStateCode) {
        this.companyStateCode = companyStateCode;
    }

    public String getCompanyTaxId() {
        return companyTaxId;
    }

    public void setCompanyTaxId(String companyTaxId) {
        this.companyTaxId = companyTaxId;
    }

    public String getCompanyWebSite() {
        return companyWebSite;
    }

    public void setCompanyWebSite(String companyWebSite) {
        this.companyWebSite = companyWebSite;
    }

    public String getCompanySalesVolume() {
        return companySalesVolume;
    }

    public void setCompanySalesVolume(String companySalesVolume) {
        this.companySalesVolume = companySalesVolume;
    }

    public String getCompanyProductAndServiceDescription() {
        return companyProductAndServiceDescription;
    }

    public void setCompanyProductAndServiceDescription(String companyProductAndServiceDescription) {
        this.companyProductAndServiceDescription = companyProductAndServiceDescription;
    }

    public String getBusinessRegistrationNumber() {
        return businessRegistrationNumber;
    }

    public void setBusinessRegistrationNumber(String businessRegistrationNumber) {
        this.businessRegistrationNumber = businessRegistrationNumber;
    }

    public String getBusinessRegistrationNumber_Edited() {
        return businessRegistrationNumber_Edited;
    }

    public void setBusinessRegistrationNumber_Edited(String businessRegistrationNumber_Edited) {
        this.businessRegistrationNumber_Edited = businessRegistrationNumber_Edited;
    }

    public String getBankBic() {
        return bankBic;
    }

    public void setBankBic(String bankBic) {
        this.bankBic = bankBic;
    }

    public String getBankIban() {
        return bankIban;
    }

    public void setBankIban(String bankIban) {
        this.bankIban = bankIban;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getBankStateCode() {
        return bankStateCode;
    }

    public void setBankStateCode(String bankStateCode) {
        this.bankStateCode = bankStateCode;
    }

    public String getBankCountryCode() {
        return bankCountryCode;
    }

    public void setBankCountryCode(String bankCountryCode) {
        this.bankCountryCode = bankCountryCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankRoutingNumber() {
        return bankRoutingNumber;
    }

    public void setBankRoutingNumber(String bankRoutingNumber) {
        this.bankRoutingNumber = bankRoutingNumber;
    }

    public String getBankPayoutCurrency() {
        return bankPayoutCurrency;
    }

    public void setBankPayoutCurrency(String bankPayoutCurrency) {
        this.bankPayoutCurrency = bankPayoutCurrency;
    }

    public String getBankSortCode() {
        return bankSortCode;
    }

    public void setBankSortCode(String bankSortCode) {
        this.bankSortCode = bankSortCode;
    }

    public String getBankBsb() {
        return bankBsb;
    }

    public void setBankBsb(String bankBsb) {
        this.bankBsb = bankBsb;
    }

    public String getBankSwiftCode() {
        return bankSwiftCode;
    }

    public void setBankSwiftCode(String bankSwiftCode) {
        this.bankSwiftCode = bankSwiftCode;
    }

    public String getCompanyBusinessCategory() {
        return companyBusinessCategory;
    }

    public void setCompanyBusinessCategory(String companyBusinessCategory) {
        this.companyBusinessCategory = companyBusinessCategory;
    }

    public String getAdminCity() {
        return adminCity;
    }

    public void setAdminCity(String adminCity) {
        this.adminCity = adminCity;
    }

    public String getManagerCity() {
        return managerCity;
    }

    public void setManagerCity(String managerCity) {
        this.managerCity = managerCity;
    }

    public List<BoardingInfoFileEntity> getFiles() {
        return files;
    }

    public void setFiles(List<BoardingInfoFileEntity> files) {
        this.files = files;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingInfo that = (BoardingInfo) o;
        return Objects.equals(boardingInfoId, that.boardingInfoId) && Objects.equals(adminBirthDate, that.adminBirthDate) && Objects.equals(adminZip, that.adminZip) && Objects.equals(adminCountryCode, that.adminCountryCode) && Objects.equals(adminStateCode, that.adminStateCode) && Objects.equals(adminPhone, that.adminPhone) && Objects.equals(adminGovId, that.adminGovId) && Objects.equals(managerBirthDate, that.managerBirthDate) && Objects.equals(managerZip, that.managerZip) && Objects.equals(managerStateCode, that.managerStateCode) && Objects.equals(managerPhone, that.managerPhone) && Objects.equals(managerCountryCode, that.managerCountryCode) && Objects.equals(managerGovId, that.managerGovId) && Objects.equals(managerAddress_Edited, that.managerAddress_Edited) && Objects.equals(managerFirstName_Edited, that.managerFirstName_Edited) && Objects.equals(managerLastName_Edited, that.managerLastName_Edited) && Objects.equals(companyCountryCode, that.companyCountryCode) && Objects.equals(companyCity, that.companyCity) && Objects.equals(companyZip, that.companyZip) && Objects.equals(companyStateCode, that.companyStateCode) && Objects.equals(companyTaxId, that.companyTaxId) && Objects.equals(companyWebSite, that.companyWebSite) && Objects.equals(companySalesVolume, that.companySalesVolume) && Objects.equals(companyProductAndServiceDescription, that.companyProductAndServiceDescription) && Objects.equals(businessRegistrationNumber, that.businessRegistrationNumber) && Objects.equals(businessRegistrationNumber_Edited, that.businessRegistrationNumber_Edited) && Objects.equals(bankBic, that.bankBic) && Objects.equals(bankIban, that.bankIban) && Objects.equals(bankCity, that.bankCity) && Objects.equals(bankStateCode, that.bankStateCode) && Objects.equals(bankCountryCode, that.bankCountryCode) && Objects.equals(bankName, that.bankName) && Objects.equals(bankRoutingNumber, that.bankRoutingNumber) && Objects.equals(bankPayoutCurrency, that.bankPayoutCurrency) && Objects.equals(bankSortCode, that.bankSortCode) && Objects.equals(bankBsb, that.bankBsb) && Objects.equals(bankSwiftCode, that.bankSwiftCode) && Objects.equals(companyBusinessCategory, that.companyBusinessCategory) && Objects.equals(adminCity, that.adminCity) && Objects.equals(managerCity, that.managerCity) && Objects.equals(files, that.files) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingInfoId, adminBirthDate, adminZip, adminCountryCode, adminStateCode, adminPhone, adminGovId, managerBirthDate, managerZip, managerStateCode, managerPhone, managerCountryCode, managerGovId, managerAddress_Edited, managerFirstName_Edited, managerLastName_Edited, companyCountryCode, companyCity, companyZip, companyStateCode, companyTaxId, companyWebSite, companySalesVolume, companyProductAndServiceDescription, businessRegistrationNumber, businessRegistrationNumber_Edited, bankBic, bankIban, bankCity, bankStateCode, bankCountryCode, bankName, bankRoutingNumber, bankPayoutCurrency, bankSortCode, bankBsb, bankSwiftCode, companyBusinessCategory, adminCity, managerCity, files);
    }

    @Override
    public String toString() {
        return "BoardingInfo{" +
                 "boardingInfoId='" + boardingInfoId + '\'' +
 ", adminBirthDate='" + adminBirthDate + '\'' +
 ", adminZip='" + adminZip + '\'' +
 ", adminCountryCode='" + adminCountryCode + '\'' +
 ", adminStateCode='" + adminStateCode + '\'' +
 ", adminPhone='" + adminPhone + '\'' +
 ", adminGovId='" + adminGovId + '\'' +
 ", managerBirthDate='" + managerBirthDate + '\'' +
 ", managerZip='" + managerZip + '\'' +
 ", managerStateCode='" + managerStateCode + '\'' +
 ", managerPhone='" + managerPhone + '\'' +
 ", managerCountryCode='" + managerCountryCode + '\'' +
 ", managerGovId='" + managerGovId + '\'' +
 ", managerAddress_Edited='" + managerAddress_Edited + '\'' +
 ", managerFirstName_Edited='" + managerFirstName_Edited + '\'' +
 ", managerLastName_Edited='" + managerLastName_Edited + '\'' +
 ", companyCountryCode='" + companyCountryCode + '\'' +
 ", companyCity='" + companyCity + '\'' +
 ", companyZip='" + companyZip + '\'' +
 ", companyStateCode='" + companyStateCode + '\'' +
 ", companyTaxId='" + companyTaxId + '\'' +
 ", companyWebSite='" + companyWebSite + '\'' +
 ", companySalesVolume='" + companySalesVolume + '\'' +
 ", companyProductAndServiceDescription='" + companyProductAndServiceDescription + '\'' +
 ", businessRegistrationNumber='" + businessRegistrationNumber + '\'' +
 ", businessRegistrationNumber_Edited='" + businessRegistrationNumber_Edited + '\'' +
 ", bankBic='" + bankBic + '\'' +
 ", bankIban='" + bankIban + '\'' +
 ", bankCity='" + bankCity + '\'' +
 ", bankStateCode='" + bankStateCode + '\'' +
 ", bankCountryCode='" + bankCountryCode + '\'' +
 ", bankName='" + bankName + '\'' +
 ", bankRoutingNumber='" + bankRoutingNumber + '\'' +
 ", bankPayoutCurrency='" + bankPayoutCurrency + '\'' +
 ", bankSortCode='" + bankSortCode + '\'' +
 ", bankBsb='" + bankBsb + '\'' +
 ", bankSwiftCode='" + bankSwiftCode + '\'' +
 ", companyBusinessCategory='" + companyBusinessCategory + '\'' +
 ", adminCity='" + adminCity + '\'' +
 ", managerCity='" + managerCity + '\'' +
 ", files='" + files + '\'' +

                '}';
    }
}