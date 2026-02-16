
package com.tib.api.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BoardingInfoFileEntity;
import com.tib.api.model.request.BaseAuthenticatePublicTokenArgs;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class SaveBoardingInfoArgs  extends BaseAuthenticatePublicTokenArgs  {

    
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
    @JsonProperty("CompanyName")
    private String companyName;

    /**
     * 
     */
    @JsonProperty("CompanyAddress")
    private String companyAddress;

    /**
     * 
     */
    @JsonProperty("AdminFirstName")
    private String adminFirstName;

    /**
     * 
     */
    @JsonProperty("AdminLastName")
    private String adminLastName;

    /**
     * 
     */
    @JsonProperty("AdminAddress")
    private String adminAddress;

    /**
     * 
     */
    @JsonProperty("ManagerFirstName")
    private String managerFirstName;

    /**
     * 
     */
    @JsonProperty("ManagerLastName")
    private String managerLastName;

    /**
     * 
     */
    @JsonProperty("ManagerAddress")
    private String managerAddress;

    /**
     * 
     */
    @JsonProperty("ManagerFirstName2")
    private String managerFirstName2;

    /**
     * 
     */
    @JsonProperty("ManagerLastName2")
    private String managerLastName2;

    /**
     * 
     */
    @JsonProperty("ManagerAddress2")
    private String managerAddress2;

    /**
     * 
     */
    @JsonProperty("ManagerLinkedIn")
    private String managerLinkedIn;

    /**
     * 
     */
    @JsonProperty("ManagerIsAlsoAdmin")
    private boolean managerIsAlsoAdmin;

    /**
     * 
     */
    @JsonProperty("CompanyType")
    private Integer companyType;

    /**
     * 
     */
    @JsonProperty("CompanyName2")
    private String companyName2;

    /**
     * 
     */
    @JsonProperty("CompanyAddress2")
    private String companyAddress2;

    /**
     * 
     */
    @JsonProperty("AdminFirstName2")
    private String adminFirstName2;

    /**
     * 
     */
    @JsonProperty("AdminLastName2")
    private String adminLastName2;

    /**
     * 
     */
    @JsonProperty("AdminAddress2")
    private String adminAddress2;

    /**
     * 
     */
    @JsonProperty("CompanyType2")
    private Integer companyType2;

    /**
     * 
     */
    @JsonProperty("DidOwnersAlreadyBeenSubjectOfResiliationOfPaymentService")
    private boolean didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService;

    /**
     * 
     */
    @JsonProperty("DidOwnersAlreadyAskedForBankrupcy")
    private boolean didOwnersAlreadyAskedForBankrupcy;

    /**
     * 
     */
    @JsonProperty("HaveYouBeenSubjectOfVisaRiskProgram")
    private boolean haveYouBeenSubjectOfVisaRiskProgram;

    /**
     * 
     */
    @JsonProperty("IdImageAsBase64")
    private String idImageAsBase64;

    /**
     * 
     */
    @JsonProperty("AdminIdImageFront")
    private String adminIdImageFront;

    /**
     * 
     */
    @JsonProperty("AdminIdImageBack")
    private String adminIdImageBack;

    /**
     * 
     */
    @JsonProperty("ManagerIdImageFront")
    private String managerIdImageFront;

    /**
     * 
     */
    @JsonProperty("ManagerIdImageBack")
    private String managerIdImageBack;

    /**
     * 
     */
    @JsonProperty("IdFiles")
    private List<BoardingInfoFileEntity> idFiles;

    /**
     * 
     */
    @JsonProperty("CompanyTaxId")
    private String companyTaxId;

    /**
     * 
     */
    @JsonProperty("CompanyCountryCode")
    private String companyCountryCode;

    /**
     * 
     */
    @JsonProperty("CompanyStateCode")
    private String companyStateCode;

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
    @JsonProperty("CompanyPhone")
    private String companyPhone;

    /**
     * 
     */
    @JsonProperty("CompanyProductAndServiceDescription")
    private String companyProductAndServiceDescription;

    /**
     * 
     */
    @JsonProperty("CompanyWebSite")
    private String companyWebSite;

    /**
     * 
     */
    @JsonProperty("CompanyBusinessCategory")
    private String companyBusinessCategory;

    /**
     * 
     */
    @JsonProperty("CompanySalesVolume")
    private String companySalesVolume;

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
    @JsonProperty("AdminCity")
    private String adminCity;

    /**
     * 
     */
    @JsonProperty("AdminZip")
    private String adminZip;

    /**
     * 
     */
    @JsonProperty("AdminPhone")
    private String adminPhone;

    /**
     * 
     */
    @JsonProperty("AdminBirthDate")
    private String adminBirthDate;

    /**
     * 
     */
    @JsonProperty("AdminGovId")
    private String adminGovId;

    /**
     * 
     */
    @JsonProperty("ManagerCountryCode")
    private String managerCountryCode;

    /**
     * 
     */
    @JsonProperty("ManagerStateCode")
    private String managerStateCode;

    /**
     * 
     */
    @JsonProperty("ManagerCity")
    private String managerCity;

    /**
     * 
     */
    @JsonProperty("ManagerZip")
    private String managerZip;

    /**
     * 
     */
    @JsonProperty("ManagerPhone")
    private String managerPhone;

    /**
     * 
     */
    @JsonProperty("ManagerBirthDate")
    private String managerBirthDate;

    /**
     * 
     */
    @JsonProperty("ManagerGovId")
    private String managerGovId;

    /**
     * 
     */
    @JsonProperty("BankPayoutCurrency")
    private String bankPayoutCurrency;

    /**
     * 
     */
    @JsonProperty("BankCountryCode")
    private String bankCountryCode;

    /**
     * 
     */
    @JsonProperty("BankStateCode")
    private String bankStateCode;

    /**
     * 
     */
    @JsonProperty("BankCity")
    private String bankCity;

    /**
     * 
     */
    @JsonProperty("BankName")
    private String bankName;

    /**
     * Identifies the bank associated with the account using its numeric identifier.
     */
    @JsonProperty("BankNumber")
    private String bankNumber;

    /**
     * 
     */
    @JsonProperty("BankTransitNumber")
    private String bankTransitNumber;

    /**
     * 
     */
    @JsonProperty("BankAccountNumber")
    private String bankAccountNumber;

    /**
     * 
     */
    @JsonProperty("BankRoutingNumber")
    private String bankRoutingNumber;

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
    @JsonProperty("BankSortCode")
    private String bankSortCode;

    /**
     * 
     */
    @JsonProperty("BankSwiftCode")
    private String bankSwiftCode;

    /**
     * 
     */
    @JsonProperty("BankBsb")
    private String bankBsb;


    
    public SaveBoardingInfoArgs() {
    }

    
    public SaveBoardingInfoArgs(String businessRegistrationNumber, String businessRegistrationNumber_Edited, String companyName, String companyAddress, String adminFirstName, String adminLastName, String adminAddress, String managerFirstName, String managerLastName, String managerAddress, String managerFirstName2, String managerLastName2, String managerAddress2, String managerLinkedIn, boolean managerIsAlsoAdmin, Integer companyType, String companyName2, String companyAddress2, String adminFirstName2, String adminLastName2, String adminAddress2, Integer companyType2, boolean didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, boolean didOwnersAlreadyAskedForBankrupcy, boolean haveYouBeenSubjectOfVisaRiskProgram, String idImageAsBase64, String adminIdImageFront, String adminIdImageBack, String managerIdImageFront, String managerIdImageBack, List<BoardingInfoFileEntity> idFiles, String companyTaxId, String companyCountryCode, String companyStateCode, String companyCity, String companyZip, String companyPhone, String companyProductAndServiceDescription, String companyWebSite, String companyBusinessCategory, String companySalesVolume, String adminCountryCode, String adminStateCode, String adminCity, String adminZip, String adminPhone, String adminBirthDate, String adminGovId, String managerCountryCode, String managerStateCode, String managerCity, String managerZip, String managerPhone, String managerBirthDate, String managerGovId, String bankPayoutCurrency, String bankCountryCode, String bankStateCode, String bankCity, String bankName, String bankNumber, String bankTransitNumber, String bankAccountNumber, String bankRoutingNumber, String bankBic, String bankIban, String bankSortCode, String bankSwiftCode, String bankBsb) {
        this.businessRegistrationNumber = businessRegistrationNumber;
        this.businessRegistrationNumber_Edited = businessRegistrationNumber_Edited;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.adminFirstName = adminFirstName;
        this.adminLastName = adminLastName;
        this.adminAddress = adminAddress;
        this.managerFirstName = managerFirstName;
        this.managerLastName = managerLastName;
        this.managerAddress = managerAddress;
        this.managerFirstName2 = managerFirstName2;
        this.managerLastName2 = managerLastName2;
        this.managerAddress2 = managerAddress2;
        this.managerLinkedIn = managerLinkedIn;
        this.managerIsAlsoAdmin = managerIsAlsoAdmin;
        this.companyType = companyType;
        this.companyName2 = companyName2;
        this.companyAddress2 = companyAddress2;
        this.adminFirstName2 = adminFirstName2;
        this.adminLastName2 = adminLastName2;
        this.adminAddress2 = adminAddress2;
        this.companyType2 = companyType2;
        this.didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService = didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService;
        this.didOwnersAlreadyAskedForBankrupcy = didOwnersAlreadyAskedForBankrupcy;
        this.haveYouBeenSubjectOfVisaRiskProgram = haveYouBeenSubjectOfVisaRiskProgram;
        this.idImageAsBase64 = idImageAsBase64;
        this.adminIdImageFront = adminIdImageFront;
        this.adminIdImageBack = adminIdImageBack;
        this.managerIdImageFront = managerIdImageFront;
        this.managerIdImageBack = managerIdImageBack;
        this.idFiles = idFiles;
        this.companyTaxId = companyTaxId;
        this.companyCountryCode = companyCountryCode;
        this.companyStateCode = companyStateCode;
        this.companyCity = companyCity;
        this.companyZip = companyZip;
        this.companyPhone = companyPhone;
        this.companyProductAndServiceDescription = companyProductAndServiceDescription;
        this.companyWebSite = companyWebSite;
        this.companyBusinessCategory = companyBusinessCategory;
        this.companySalesVolume = companySalesVolume;
        this.adminCountryCode = adminCountryCode;
        this.adminStateCode = adminStateCode;
        this.adminCity = adminCity;
        this.adminZip = adminZip;
        this.adminPhone = adminPhone;
        this.adminBirthDate = adminBirthDate;
        this.adminGovId = adminGovId;
        this.managerCountryCode = managerCountryCode;
        this.managerStateCode = managerStateCode;
        this.managerCity = managerCity;
        this.managerZip = managerZip;
        this.managerPhone = managerPhone;
        this.managerBirthDate = managerBirthDate;
        this.managerGovId = managerGovId;
        this.bankPayoutCurrency = bankPayoutCurrency;
        this.bankCountryCode = bankCountryCode;
        this.bankStateCode = bankStateCode;
        this.bankCity = bankCity;
        this.bankName = bankName;
        this.bankNumber = bankNumber;
        this.bankTransitNumber = bankTransitNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.bankRoutingNumber = bankRoutingNumber;
        this.bankBic = bankBic;
        this.bankIban = bankIban;
        this.bankSortCode = bankSortCode;
        this.bankSwiftCode = bankSwiftCode;
        this.bankBsb = bankBsb;
    }
    
    
    public SaveBoardingInfoArgs(String publicTokenId, String businessRegistrationNumber, String businessRegistrationNumber_Edited, String companyName, String companyAddress, String adminFirstName, String adminLastName, String adminAddress, String managerFirstName, String managerLastName, String managerAddress, String managerFirstName2, String managerLastName2, String managerAddress2, String managerLinkedIn, boolean managerIsAlsoAdmin, Integer companyType, String companyName2, String companyAddress2, String adminFirstName2, String adminLastName2, String adminAddress2, Integer companyType2, boolean didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, boolean didOwnersAlreadyAskedForBankrupcy, boolean haveYouBeenSubjectOfVisaRiskProgram, String idImageAsBase64, String adminIdImageFront, String adminIdImageBack, String managerIdImageFront, String managerIdImageBack, List<BoardingInfoFileEntity> idFiles, String companyTaxId, String companyCountryCode, String companyStateCode, String companyCity, String companyZip, String companyPhone, String companyProductAndServiceDescription, String companyWebSite, String companyBusinessCategory, String companySalesVolume, String adminCountryCode, String adminStateCode, String adminCity, String adminZip, String adminPhone, String adminBirthDate, String adminGovId, String managerCountryCode, String managerStateCode, String managerCity, String managerZip, String managerPhone, String managerBirthDate, String managerGovId, String bankPayoutCurrency, String bankCountryCode, String bankStateCode, String bankCity, String bankName, String bankNumber, String bankTransitNumber, String bankAccountNumber, String bankRoutingNumber, String bankBic, String bankIban, String bankSortCode, String bankSwiftCode, String bankBsb) {
        super(publicTokenId);
        this.businessRegistrationNumber = businessRegistrationNumber;
        this.businessRegistrationNumber_Edited = businessRegistrationNumber_Edited;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.adminFirstName = adminFirstName;
        this.adminLastName = adminLastName;
        this.adminAddress = adminAddress;
        this.managerFirstName = managerFirstName;
        this.managerLastName = managerLastName;
        this.managerAddress = managerAddress;
        this.managerFirstName2 = managerFirstName2;
        this.managerLastName2 = managerLastName2;
        this.managerAddress2 = managerAddress2;
        this.managerLinkedIn = managerLinkedIn;
        this.managerIsAlsoAdmin = managerIsAlsoAdmin;
        this.companyType = companyType;
        this.companyName2 = companyName2;
        this.companyAddress2 = companyAddress2;
        this.adminFirstName2 = adminFirstName2;
        this.adminLastName2 = adminLastName2;
        this.adminAddress2 = adminAddress2;
        this.companyType2 = companyType2;
        this.didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService = didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService;
        this.didOwnersAlreadyAskedForBankrupcy = didOwnersAlreadyAskedForBankrupcy;
        this.haveYouBeenSubjectOfVisaRiskProgram = haveYouBeenSubjectOfVisaRiskProgram;
        this.idImageAsBase64 = idImageAsBase64;
        this.adminIdImageFront = adminIdImageFront;
        this.adminIdImageBack = adminIdImageBack;
        this.managerIdImageFront = managerIdImageFront;
        this.managerIdImageBack = managerIdImageBack;
        this.idFiles = idFiles;
        this.companyTaxId = companyTaxId;
        this.companyCountryCode = companyCountryCode;
        this.companyStateCode = companyStateCode;
        this.companyCity = companyCity;
        this.companyZip = companyZip;
        this.companyPhone = companyPhone;
        this.companyProductAndServiceDescription = companyProductAndServiceDescription;
        this.companyWebSite = companyWebSite;
        this.companyBusinessCategory = companyBusinessCategory;
        this.companySalesVolume = companySalesVolume;
        this.adminCountryCode = adminCountryCode;
        this.adminStateCode = adminStateCode;
        this.adminCity = adminCity;
        this.adminZip = adminZip;
        this.adminPhone = adminPhone;
        this.adminBirthDate = adminBirthDate;
        this.adminGovId = adminGovId;
        this.managerCountryCode = managerCountryCode;
        this.managerStateCode = managerStateCode;
        this.managerCity = managerCity;
        this.managerZip = managerZip;
        this.managerPhone = managerPhone;
        this.managerBirthDate = managerBirthDate;
        this.managerGovId = managerGovId;
        this.bankPayoutCurrency = bankPayoutCurrency;
        this.bankCountryCode = bankCountryCode;
        this.bankStateCode = bankStateCode;
        this.bankCity = bankCity;
        this.bankName = bankName;
        this.bankNumber = bankNumber;
        this.bankTransitNumber = bankTransitNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.bankRoutingNumber = bankRoutingNumber;
        this.bankBic = bankBic;
        this.bankIban = bankIban;
        this.bankSortCode = bankSortCode;
        this.bankSwiftCode = bankSwiftCode;
        this.bankBsb = bankBsb;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }

    public String getAdminAddress() {
        return adminAddress;
    }

    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress;
    }

    public String getManagerFirstName() {
        return managerFirstName;
    }

    public void setManagerFirstName(String managerFirstName) {
        this.managerFirstName = managerFirstName;
    }

    public String getManagerLastName() {
        return managerLastName;
    }

    public void setManagerLastName(String managerLastName) {
        this.managerLastName = managerLastName;
    }

    public String getManagerAddress() {
        return managerAddress;
    }

    public void setManagerAddress(String managerAddress) {
        this.managerAddress = managerAddress;
    }

    public String getManagerFirstName2() {
        return managerFirstName2;
    }

    public void setManagerFirstName2(String managerFirstName2) {
        this.managerFirstName2 = managerFirstName2;
    }

    public String getManagerLastName2() {
        return managerLastName2;
    }

    public void setManagerLastName2(String managerLastName2) {
        this.managerLastName2 = managerLastName2;
    }

    public String getManagerAddress2() {
        return managerAddress2;
    }

    public void setManagerAddress2(String managerAddress2) {
        this.managerAddress2 = managerAddress2;
    }

    public String getManagerLinkedIn() {
        return managerLinkedIn;
    }

    public void setManagerLinkedIn(String managerLinkedIn) {
        this.managerLinkedIn = managerLinkedIn;
    }

    public boolean getManagerIsAlsoAdmin() {
        return managerIsAlsoAdmin;
    }

    public void setManagerIsAlsoAdmin(boolean managerIsAlsoAdmin) {
        this.managerIsAlsoAdmin = managerIsAlsoAdmin;
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    public String getCompanyName2() {
        return companyName2;
    }

    public void setCompanyName2(String companyName2) {
        this.companyName2 = companyName2;
    }

    public String getCompanyAddress2() {
        return companyAddress2;
    }

    public void setCompanyAddress2(String companyAddress2) {
        this.companyAddress2 = companyAddress2;
    }

    public String getAdminFirstName2() {
        return adminFirstName2;
    }

    public void setAdminFirstName2(String adminFirstName2) {
        this.adminFirstName2 = adminFirstName2;
    }

    public String getAdminLastName2() {
        return adminLastName2;
    }

    public void setAdminLastName2(String adminLastName2) {
        this.adminLastName2 = adminLastName2;
    }

    public String getAdminAddress2() {
        return adminAddress2;
    }

    public void setAdminAddress2(String adminAddress2) {
        this.adminAddress2 = adminAddress2;
    }

    public Integer getCompanyType2() {
        return companyType2;
    }

    public void setCompanyType2(Integer companyType2) {
        this.companyType2 = companyType2;
    }

    public boolean getDidOwnersAlreadyBeenSubjectOfResiliationOfPaymentService() {
        return didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService;
    }

    public void setDidOwnersAlreadyBeenSubjectOfResiliationOfPaymentService(boolean didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService) {
        this.didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService = didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService;
    }

    public boolean getDidOwnersAlreadyAskedForBankrupcy() {
        return didOwnersAlreadyAskedForBankrupcy;
    }

    public void setDidOwnersAlreadyAskedForBankrupcy(boolean didOwnersAlreadyAskedForBankrupcy) {
        this.didOwnersAlreadyAskedForBankrupcy = didOwnersAlreadyAskedForBankrupcy;
    }

    public boolean getHaveYouBeenSubjectOfVisaRiskProgram() {
        return haveYouBeenSubjectOfVisaRiskProgram;
    }

    public void setHaveYouBeenSubjectOfVisaRiskProgram(boolean haveYouBeenSubjectOfVisaRiskProgram) {
        this.haveYouBeenSubjectOfVisaRiskProgram = haveYouBeenSubjectOfVisaRiskProgram;
    }

    public String getIdImageAsBase64() {
        return idImageAsBase64;
    }

    public void setIdImageAsBase64(String idImageAsBase64) {
        this.idImageAsBase64 = idImageAsBase64;
    }

    public String getAdminIdImageFront() {
        return adminIdImageFront;
    }

    public void setAdminIdImageFront(String adminIdImageFront) {
        this.adminIdImageFront = adminIdImageFront;
    }

    public String getAdminIdImageBack() {
        return adminIdImageBack;
    }

    public void setAdminIdImageBack(String adminIdImageBack) {
        this.adminIdImageBack = adminIdImageBack;
    }

    public String getManagerIdImageFront() {
        return managerIdImageFront;
    }

    public void setManagerIdImageFront(String managerIdImageFront) {
        this.managerIdImageFront = managerIdImageFront;
    }

    public String getManagerIdImageBack() {
        return managerIdImageBack;
    }

    public void setManagerIdImageBack(String managerIdImageBack) {
        this.managerIdImageBack = managerIdImageBack;
    }

    public List<BoardingInfoFileEntity> getIdFiles() {
        return idFiles;
    }

    public void setIdFiles(List<BoardingInfoFileEntity> idFiles) {
        this.idFiles = idFiles;
    }

    public String getCompanyTaxId() {
        return companyTaxId;
    }

    public void setCompanyTaxId(String companyTaxId) {
        this.companyTaxId = companyTaxId;
    }

    public String getCompanyCountryCode() {
        return companyCountryCode;
    }

    public void setCompanyCountryCode(String companyCountryCode) {
        this.companyCountryCode = companyCountryCode;
    }

    public String getCompanyStateCode() {
        return companyStateCode;
    }

    public void setCompanyStateCode(String companyStateCode) {
        this.companyStateCode = companyStateCode;
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

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyProductAndServiceDescription() {
        return companyProductAndServiceDescription;
    }

    public void setCompanyProductAndServiceDescription(String companyProductAndServiceDescription) {
        this.companyProductAndServiceDescription = companyProductAndServiceDescription;
    }

    public String getCompanyWebSite() {
        return companyWebSite;
    }

    public void setCompanyWebSite(String companyWebSite) {
        this.companyWebSite = companyWebSite;
    }

    public String getCompanyBusinessCategory() {
        return companyBusinessCategory;
    }

    public void setCompanyBusinessCategory(String companyBusinessCategory) {
        this.companyBusinessCategory = companyBusinessCategory;
    }

    public String getCompanySalesVolume() {
        return companySalesVolume;
    }

    public void setCompanySalesVolume(String companySalesVolume) {
        this.companySalesVolume = companySalesVolume;
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

    public String getAdminCity() {
        return adminCity;
    }

    public void setAdminCity(String adminCity) {
        this.adminCity = adminCity;
    }

    public String getAdminZip() {
        return adminZip;
    }

    public void setAdminZip(String adminZip) {
        this.adminZip = adminZip;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }

    public String getAdminBirthDate() {
        return adminBirthDate;
    }

    public void setAdminBirthDate(String adminBirthDate) {
        this.adminBirthDate = adminBirthDate;
    }

    public String getAdminGovId() {
        return adminGovId;
    }

    public void setAdminGovId(String adminGovId) {
        this.adminGovId = adminGovId;
    }

    public String getManagerCountryCode() {
        return managerCountryCode;
    }

    public void setManagerCountryCode(String managerCountryCode) {
        this.managerCountryCode = managerCountryCode;
    }

    public String getManagerStateCode() {
        return managerStateCode;
    }

    public void setManagerStateCode(String managerStateCode) {
        this.managerStateCode = managerStateCode;
    }

    public String getManagerCity() {
        return managerCity;
    }

    public void setManagerCity(String managerCity) {
        this.managerCity = managerCity;
    }

    public String getManagerZip() {
        return managerZip;
    }

    public void setManagerZip(String managerZip) {
        this.managerZip = managerZip;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public String getManagerBirthDate() {
        return managerBirthDate;
    }

    public void setManagerBirthDate(String managerBirthDate) {
        this.managerBirthDate = managerBirthDate;
    }

    public String getManagerGovId() {
        return managerGovId;
    }

    public void setManagerGovId(String managerGovId) {
        this.managerGovId = managerGovId;
    }

    public String getBankPayoutCurrency() {
        return bankPayoutCurrency;
    }

    public void setBankPayoutCurrency(String bankPayoutCurrency) {
        this.bankPayoutCurrency = bankPayoutCurrency;
    }

    public String getBankCountryCode() {
        return bankCountryCode;
    }

    public void setBankCountryCode(String bankCountryCode) {
        this.bankCountryCode = bankCountryCode;
    }

    public String getBankStateCode() {
        return bankStateCode;
    }

    public void setBankStateCode(String bankStateCode) {
        this.bankStateCode = bankStateCode;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getBankTransitNumber() {
        return bankTransitNumber;
    }

    public void setBankTransitNumber(String bankTransitNumber) {
        this.bankTransitNumber = bankTransitNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankRoutingNumber() {
        return bankRoutingNumber;
    }

    public void setBankRoutingNumber(String bankRoutingNumber) {
        this.bankRoutingNumber = bankRoutingNumber;
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

    public String getBankSortCode() {
        return bankSortCode;
    }

    public void setBankSortCode(String bankSortCode) {
        this.bankSortCode = bankSortCode;
    }

    public String getBankSwiftCode() {
        return bankSwiftCode;
    }

    public void setBankSwiftCode(String bankSwiftCode) {
        this.bankSwiftCode = bankSwiftCode;
    }

    public String getBankBsb() {
        return bankBsb;
    }

    public void setBankBsb(String bankBsb) {
        this.bankBsb = bankBsb;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveBoardingInfoArgs that = (SaveBoardingInfoArgs) o;
        return Objects.equals(businessRegistrationNumber, that.businessRegistrationNumber) && Objects.equals(businessRegistrationNumber_Edited, that.businessRegistrationNumber_Edited) && Objects.equals(companyName, that.companyName) && Objects.equals(companyAddress, that.companyAddress) && Objects.equals(adminFirstName, that.adminFirstName) && Objects.equals(adminLastName, that.adminLastName) && Objects.equals(adminAddress, that.adminAddress) && Objects.equals(managerFirstName, that.managerFirstName) && Objects.equals(managerLastName, that.managerLastName) && Objects.equals(managerAddress, that.managerAddress) && Objects.equals(managerFirstName2, that.managerFirstName2) && Objects.equals(managerLastName2, that.managerLastName2) && Objects.equals(managerAddress2, that.managerAddress2) && Objects.equals(managerLinkedIn, that.managerLinkedIn) && Objects.equals(managerIsAlsoAdmin, that.managerIsAlsoAdmin) && Objects.equals(companyType, that.companyType) && Objects.equals(companyName2, that.companyName2) && Objects.equals(companyAddress2, that.companyAddress2) && Objects.equals(adminFirstName2, that.adminFirstName2) && Objects.equals(adminLastName2, that.adminLastName2) && Objects.equals(adminAddress2, that.adminAddress2) && Objects.equals(companyType2, that.companyType2) && Objects.equals(didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, that.didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService) && Objects.equals(didOwnersAlreadyAskedForBankrupcy, that.didOwnersAlreadyAskedForBankrupcy) && Objects.equals(haveYouBeenSubjectOfVisaRiskProgram, that.haveYouBeenSubjectOfVisaRiskProgram) && Objects.equals(idImageAsBase64, that.idImageAsBase64) && Objects.equals(adminIdImageFront, that.adminIdImageFront) && Objects.equals(adminIdImageBack, that.adminIdImageBack) && Objects.equals(managerIdImageFront, that.managerIdImageFront) && Objects.equals(managerIdImageBack, that.managerIdImageBack) && Objects.equals(idFiles, that.idFiles) && Objects.equals(companyTaxId, that.companyTaxId) && Objects.equals(companyCountryCode, that.companyCountryCode) && Objects.equals(companyStateCode, that.companyStateCode) && Objects.equals(companyCity, that.companyCity) && Objects.equals(companyZip, that.companyZip) && Objects.equals(companyPhone, that.companyPhone) && Objects.equals(companyProductAndServiceDescription, that.companyProductAndServiceDescription) && Objects.equals(companyWebSite, that.companyWebSite) && Objects.equals(companyBusinessCategory, that.companyBusinessCategory) && Objects.equals(companySalesVolume, that.companySalesVolume) && Objects.equals(adminCountryCode, that.adminCountryCode) && Objects.equals(adminStateCode, that.adminStateCode) && Objects.equals(adminCity, that.adminCity) && Objects.equals(adminZip, that.adminZip) && Objects.equals(adminPhone, that.adminPhone) && Objects.equals(adminBirthDate, that.adminBirthDate) && Objects.equals(adminGovId, that.adminGovId) && Objects.equals(managerCountryCode, that.managerCountryCode) && Objects.equals(managerStateCode, that.managerStateCode) && Objects.equals(managerCity, that.managerCity) && Objects.equals(managerZip, that.managerZip) && Objects.equals(managerPhone, that.managerPhone) && Objects.equals(managerBirthDate, that.managerBirthDate) && Objects.equals(managerGovId, that.managerGovId) && Objects.equals(bankPayoutCurrency, that.bankPayoutCurrency) && Objects.equals(bankCountryCode, that.bankCountryCode) && Objects.equals(bankStateCode, that.bankStateCode) && Objects.equals(bankCity, that.bankCity) && Objects.equals(bankName, that.bankName) && Objects.equals(bankNumber, that.bankNumber) && Objects.equals(bankTransitNumber, that.bankTransitNumber) && Objects.equals(bankAccountNumber, that.bankAccountNumber) && Objects.equals(bankRoutingNumber, that.bankRoutingNumber) && Objects.equals(bankBic, that.bankBic) && Objects.equals(bankIban, that.bankIban) && Objects.equals(bankSortCode, that.bankSortCode) && Objects.equals(bankSwiftCode, that.bankSwiftCode) && Objects.equals(bankBsb, that.bankBsb) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(businessRegistrationNumber, businessRegistrationNumber_Edited, companyName, companyAddress, adminFirstName, adminLastName, adminAddress, managerFirstName, managerLastName, managerAddress, managerFirstName2, managerLastName2, managerAddress2, managerLinkedIn, managerIsAlsoAdmin, companyType, companyName2, companyAddress2, adminFirstName2, adminLastName2, adminAddress2, companyType2, didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, didOwnersAlreadyAskedForBankrupcy, haveYouBeenSubjectOfVisaRiskProgram, idImageAsBase64, adminIdImageFront, adminIdImageBack, managerIdImageFront, managerIdImageBack, idFiles, companyTaxId, companyCountryCode, companyStateCode, companyCity, companyZip, companyPhone, companyProductAndServiceDescription, companyWebSite, companyBusinessCategory, companySalesVolume, adminCountryCode, adminStateCode, adminCity, adminZip, adminPhone, adminBirthDate, adminGovId, managerCountryCode, managerStateCode, managerCity, managerZip, managerPhone, managerBirthDate, managerGovId, bankPayoutCurrency, bankCountryCode, bankStateCode, bankCity, bankName, bankNumber, bankTransitNumber, bankAccountNumber, bankRoutingNumber, bankBic, bankIban, bankSortCode, bankSwiftCode, bankBsb);
    }

    @Override
    public String toString() {
        return "SaveBoardingInfoArgs{" +
                "businessRegistrationNumber='" + businessRegistrationNumber + '\'' +
                ", businessRegistrationNumber_Edited='" + businessRegistrationNumber_Edited + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", adminFirstName='" + adminFirstName + '\'' +
                ", adminLastName='" + adminLastName + '\'' +
                ", adminAddress='" + adminAddress + '\'' +
                ", managerFirstName='" + managerFirstName + '\'' +
                ", managerLastName='" + managerLastName + '\'' +
                ", managerAddress='" + managerAddress + '\'' +
                ", managerFirstName2='" + managerFirstName2 + '\'' +
                ", managerLastName2='" + managerLastName2 + '\'' +
                ", managerAddress2='" + managerAddress2 + '\'' +
                ", managerLinkedIn='" + managerLinkedIn + '\'' +
                ", managerIsAlsoAdmin='" + managerIsAlsoAdmin + '\'' +
                ", companyType='" + companyType + '\'' +
                ", companyName2='" + companyName2 + '\'' +
                ", companyAddress2='" + companyAddress2 + '\'' +
                ", adminFirstName2='" + adminFirstName2 + '\'' +
                ", adminLastName2='" + adminLastName2 + '\'' +
                ", adminAddress2='" + adminAddress2 + '\'' +
                ", companyType2='" + companyType2 + '\'' +
                ", didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService='" + didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService + '\'' +
                ", didOwnersAlreadyAskedForBankrupcy='" + didOwnersAlreadyAskedForBankrupcy + '\'' +
                ", haveYouBeenSubjectOfVisaRiskProgram='" + haveYouBeenSubjectOfVisaRiskProgram + '\'' +
                ", idImageAsBase64='" + idImageAsBase64 + '\'' +
                ", adminIdImageFront='" + adminIdImageFront + '\'' +
                ", adminIdImageBack='" + adminIdImageBack + '\'' +
                ", managerIdImageFront='" + managerIdImageFront + '\'' +
                ", managerIdImageBack='" + managerIdImageBack + '\'' +
                ", idFiles='" + idFiles + '\'' +
                ", companyTaxId='" + companyTaxId + '\'' +
                ", companyCountryCode='" + companyCountryCode + '\'' +
                ", companyStateCode='" + companyStateCode + '\'' +
                ", companyCity='" + companyCity + '\'' +
                ", companyZip='" + companyZip + '\'' +
                ", companyPhone='" + companyPhone + '\'' +
                ", companyProductAndServiceDescription='" + companyProductAndServiceDescription + '\'' +
                ", companyWebSite='" + companyWebSite + '\'' +
                ", companyBusinessCategory='" + companyBusinessCategory + '\'' +
                ", companySalesVolume='" + companySalesVolume + '\'' +
                ", adminCountryCode='" + adminCountryCode + '\'' +
                ", adminStateCode='" + adminStateCode + '\'' +
                ", adminCity='" + adminCity + '\'' +
                ", adminZip='" + adminZip + '\'' +
                ", adminPhone='" + adminPhone + '\'' +
                ", adminBirthDate='" + adminBirthDate + '\'' +
                ", adminGovId='" + adminGovId + '\'' +
                ", managerCountryCode='" + managerCountryCode + '\'' +
                ", managerStateCode='" + managerStateCode + '\'' +
                ", managerCity='" + managerCity + '\'' +
                ", managerZip='" + managerZip + '\'' +
                ", managerPhone='" + managerPhone + '\'' +
                ", managerBirthDate='" + managerBirthDate + '\'' +
                ", managerGovId='" + managerGovId + '\'' +
                ", bankPayoutCurrency='" + bankPayoutCurrency + '\'' +
                ", bankCountryCode='" + bankCountryCode + '\'' +
                ", bankStateCode='" + bankStateCode + '\'' +
                ", bankCity='" + bankCity + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankNumber='" + bankNumber + '\'' +
                ", bankTransitNumber='" + bankTransitNumber + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                ", bankRoutingNumber='" + bankRoutingNumber + '\'' +
                ", bankBic='" + bankBic + '\'' +
                ", bankIban='" + bankIban + '\'' +
                ", bankSortCode='" + bankSortCode + '\'' +
                ", bankSwiftCode='" + bankSwiftCode + '\'' +
                ", bankBsb='" + bankBsb + '\'' +

                '}';
    }
}