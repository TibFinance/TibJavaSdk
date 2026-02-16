
package com.tib.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tib.api.model.BoardingInformationFileEntity;
import com.tib.api.model.BoardingInfoPersonEntity;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class BoardingInformation  extends BoardingInformationEntity  {

    
    /**
     * 
     */
    @JsonProperty("BoardingInfoId")
    private String boardingInfoId;

    /**
     * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
     */
    @JsonProperty("ServiceId")
    private Optional<String> serviceId;

    /**
     * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
     */
    @JsonProperty("MerchantId")
    private Optional<String> merchantId;

    /**
     * The date and time when the payment was created.
     */
    @JsonProperty("CreatedDate")
    private Optional<LocalDateTime> createdDate;

    /**
     * 
     */
    @JsonProperty("ProviderRequestId")
    private String providerRequestId;

    /**
     * 
     */
    @JsonProperty("CaseId")
    private String caseId;

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
    @JsonProperty("AverageTransactionAmount")
    private String averageTransactionAmount;

    /**
     * 
     */
    @JsonProperty("HighestTransactionAmount")
    private String highestTransactionAmount;

    /**
     * 
     */
    @JsonProperty("RiskMonitoring")
    private String riskMonitoring;

    /**
     * 
     */
    @JsonProperty("RiskPayment")
    private String riskPayment;

    /**
     * 
     */
    @JsonProperty("RiskByCommission")
    private String riskByCommission;

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
    @JsonProperty("BankAccountNumber")
    private String bankAccountNumber;

    /**
     * 
     */
    @JsonProperty("BankTransitNumber")
    private String bankTransitNumber;

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
    @JsonProperty("CompanyLegalName")
    private String companyLegalName;

    /**
     * 
     */
    @JsonProperty("CompanyBusinessType")
    private String companyBusinessType;

    /**
     * 
     */
    @JsonProperty("CompanyAccountUserName")
    private String companyAccountUserName;

    /**
     * 
     */
    @JsonProperty("BankAccountType")
    private String bankAccountType;

    /**
     * 
     */
    @JsonProperty("BankMinimalPayoutAmount")
    private String bankMinimalPayoutAmount;

    /**
     * 
     */
    @JsonProperty("BankRefundReserve")
    private String bankRefundReserve;

    /**
     * 
     */
    @JsonProperty("MerchantServiceAgreementDate")
    private String merchantServiceAgreementDate;

    /**
     * 
     */
    @JsonProperty("MerchantPricingAgreementDate")
    private String merchantPricingAgreementDate;

    /**
     * Represents the current state of a transaction within the system.
     */
    @JsonProperty("Status")
    private Optional<Integer> status;

    /**
     * 
     */
    @JsonProperty("ErrorResponse")
    private String errorResponse;

    /**
     * 
     */
    @JsonProperty("Files")
    private List<BoardingInformationFileEntity> files;

    /**
     * 
     */
    @JsonProperty("ClientName")
    private String clientName;

    /**
     * 
     */
    @JsonProperty("ClientEmail")
    private String clientEmail;

    /**
     * The merchant's phone number used for contact and transaction notifications.
     */
    @JsonProperty("PhoneNumber")
    private String phoneNumber;

    /**
     * 
     */
    @JsonProperty("CompanyMerchantLanguage")
    private Integer companyMerchantLanguage;

    /**
     * Retrieves or assigns the currency type used in transactions.
     */
    @JsonProperty("Currency")
    private Integer currency;

    /**
     * 
     */
    @JsonProperty("Persons")
    private List<BoardingInfoPersonEntity> persons;


    
    public BoardingInformation() {
    }

    
    public BoardingInformation(String boardingInfoId, Optional<String> serviceId, Optional<String> merchantId, Optional<LocalDateTime> createdDate, String providerRequestId, String caseId, String companyCountryCode, String companyCity, String companyZip, String companyStateCode, String companyTaxId, String companyWebSite, String companySalesVolume, String companyProductAndServiceDescription, String businessRegistrationNumber, String averageTransactionAmount, String highestTransactionAmount, String riskMonitoring, String riskPayment, String riskByCommission, String businessRegistrationNumber_Edited, String bankBic, String bankIban, String bankCity, String bankStateCode, String bankCountryCode, String bankName, String bankRoutingNumber, String bankAccountNumber, String bankTransitNumber, String bankPayoutCurrency, String bankSortCode, String bankBsb, String bankSwiftCode, String companyBusinessCategory, String companyLegalName, String companyBusinessType, String companyAccountUserName, String bankAccountType, String bankMinimalPayoutAmount, String bankRefundReserve, String merchantServiceAgreementDate, String merchantPricingAgreementDate, Optional<Integer> status, String errorResponse, List<BoardingInformationFileEntity> files, String clientName, String clientEmail, String phoneNumber, Integer companyMerchantLanguage, Integer currency, List<BoardingInfoPersonEntity> persons) {
        this.boardingInfoId = boardingInfoId;
        this.serviceId = serviceId;
        this.merchantId = merchantId;
        this.createdDate = createdDate;
        this.providerRequestId = providerRequestId;
        this.caseId = caseId;
        this.companyCountryCode = companyCountryCode;
        this.companyCity = companyCity;
        this.companyZip = companyZip;
        this.companyStateCode = companyStateCode;
        this.companyTaxId = companyTaxId;
        this.companyWebSite = companyWebSite;
        this.companySalesVolume = companySalesVolume;
        this.companyProductAndServiceDescription = companyProductAndServiceDescription;
        this.businessRegistrationNumber = businessRegistrationNumber;
        this.averageTransactionAmount = averageTransactionAmount;
        this.highestTransactionAmount = highestTransactionAmount;
        this.riskMonitoring = riskMonitoring;
        this.riskPayment = riskPayment;
        this.riskByCommission = riskByCommission;
        this.businessRegistrationNumber_Edited = businessRegistrationNumber_Edited;
        this.bankBic = bankBic;
        this.bankIban = bankIban;
        this.bankCity = bankCity;
        this.bankStateCode = bankStateCode;
        this.bankCountryCode = bankCountryCode;
        this.bankName = bankName;
        this.bankRoutingNumber = bankRoutingNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.bankTransitNumber = bankTransitNumber;
        this.bankPayoutCurrency = bankPayoutCurrency;
        this.bankSortCode = bankSortCode;
        this.bankBsb = bankBsb;
        this.bankSwiftCode = bankSwiftCode;
        this.companyBusinessCategory = companyBusinessCategory;
        this.companyLegalName = companyLegalName;
        this.companyBusinessType = companyBusinessType;
        this.companyAccountUserName = companyAccountUserName;
        this.bankAccountType = bankAccountType;
        this.bankMinimalPayoutAmount = bankMinimalPayoutAmount;
        this.bankRefundReserve = bankRefundReserve;
        this.merchantServiceAgreementDate = merchantServiceAgreementDate;
        this.merchantPricingAgreementDate = merchantPricingAgreementDate;
        this.status = status;
        this.errorResponse = errorResponse;
        this.files = files;
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.phoneNumber = phoneNumber;
        this.companyMerchantLanguage = companyMerchantLanguage;
        this.currency = currency;
        this.persons = persons;
    }
    
    
    public BoardingInformation(String clientId, String companyName, String companyAddress, String companyPhone, String companyEmail, Integer companyType, String companyName_Edited, String companyAddress_Edited, Integer companyType_Edited, boolean didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, boolean didOwnersAlreadyAskedForBankrupcy, boolean haveYouBeenSubjectOfVisaRiskProgram, String specimenFile, String idFile, Integer boardingStep, String transitNumber, String accountNumber, String accountOwner, String bankNumber, String boardingInfoId, Optional<String> serviceId, Optional<String> merchantId, Optional<LocalDateTime> createdDate, String providerRequestId, String caseId, String companyCountryCode, String companyCity, String companyZip, String companyStateCode, String companyTaxId, String companyWebSite, String companySalesVolume, String companyProductAndServiceDescription, String businessRegistrationNumber, String averageTransactionAmount, String highestTransactionAmount, String riskMonitoring, String riskPayment, String riskByCommission, String businessRegistrationNumber_Edited, String bankBic, String bankIban, String bankCity, String bankStateCode, String bankCountryCode, String bankName, String bankRoutingNumber, String bankAccountNumber, String bankTransitNumber, String bankPayoutCurrency, String bankSortCode, String bankBsb, String bankSwiftCode, String companyBusinessCategory, String companyLegalName, String companyBusinessType, String companyAccountUserName, String bankAccountType, String bankMinimalPayoutAmount, String bankRefundReserve, String merchantServiceAgreementDate, String merchantPricingAgreementDate, Optional<Integer> status, String errorResponse, List<BoardingInformationFileEntity> files, String clientName, String clientEmail, String phoneNumber, Integer companyMerchantLanguage, Integer currency, List<BoardingInfoPersonEntity> persons) {
        super(clientId, companyName, companyAddress, companyPhone, companyEmail, companyType, companyName_Edited, companyAddress_Edited, companyType_Edited, didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, didOwnersAlreadyAskedForBankrupcy, haveYouBeenSubjectOfVisaRiskProgram, specimenFile, idFile, boardingStep, transitNumber, accountNumber, accountOwner, bankNumber);
        this.boardingInfoId = boardingInfoId;
        this.serviceId = serviceId;
        this.merchantId = merchantId;
        this.createdDate = createdDate;
        this.providerRequestId = providerRequestId;
        this.caseId = caseId;
        this.companyCountryCode = companyCountryCode;
        this.companyCity = companyCity;
        this.companyZip = companyZip;
        this.companyStateCode = companyStateCode;
        this.companyTaxId = companyTaxId;
        this.companyWebSite = companyWebSite;
        this.companySalesVolume = companySalesVolume;
        this.companyProductAndServiceDescription = companyProductAndServiceDescription;
        this.businessRegistrationNumber = businessRegistrationNumber;
        this.averageTransactionAmount = averageTransactionAmount;
        this.highestTransactionAmount = highestTransactionAmount;
        this.riskMonitoring = riskMonitoring;
        this.riskPayment = riskPayment;
        this.riskByCommission = riskByCommission;
        this.businessRegistrationNumber_Edited = businessRegistrationNumber_Edited;
        this.bankBic = bankBic;
        this.bankIban = bankIban;
        this.bankCity = bankCity;
        this.bankStateCode = bankStateCode;
        this.bankCountryCode = bankCountryCode;
        this.bankName = bankName;
        this.bankRoutingNumber = bankRoutingNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.bankTransitNumber = bankTransitNumber;
        this.bankPayoutCurrency = bankPayoutCurrency;
        this.bankSortCode = bankSortCode;
        this.bankBsb = bankBsb;
        this.bankSwiftCode = bankSwiftCode;
        this.companyBusinessCategory = companyBusinessCategory;
        this.companyLegalName = companyLegalName;
        this.companyBusinessType = companyBusinessType;
        this.companyAccountUserName = companyAccountUserName;
        this.bankAccountType = bankAccountType;
        this.bankMinimalPayoutAmount = bankMinimalPayoutAmount;
        this.bankRefundReserve = bankRefundReserve;
        this.merchantServiceAgreementDate = merchantServiceAgreementDate;
        this.merchantPricingAgreementDate = merchantPricingAgreementDate;
        this.status = status;
        this.errorResponse = errorResponse;
        this.files = files;
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.phoneNumber = phoneNumber;
        this.companyMerchantLanguage = companyMerchantLanguage;
        this.currency = currency;
        this.persons = persons;
    }

    
    public String getBoardingInfoId() {
        return boardingInfoId;
    }

    public void setBoardingInfoId(String boardingInfoId) {
        this.boardingInfoId = boardingInfoId;
    }

    public Optional<String> getServiceId() {
        return serviceId;
    }

    public void setServiceId(Optional<String> serviceId) {
        this.serviceId = serviceId;
    }

    public Optional<String> getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Optional<String> merchantId) {
        this.merchantId = merchantId;
    }

    public Optional<LocalDateTime> getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Optional<LocalDateTime> createdDate) {
        this.createdDate = createdDate;
    }

    public String getProviderRequestId() {
        return providerRequestId;
    }

    public void setProviderRequestId(String providerRequestId) {
        this.providerRequestId = providerRequestId;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
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

    public String getAverageTransactionAmount() {
        return averageTransactionAmount;
    }

    public void setAverageTransactionAmount(String averageTransactionAmount) {
        this.averageTransactionAmount = averageTransactionAmount;
    }

    public String getHighestTransactionAmount() {
        return highestTransactionAmount;
    }

    public void setHighestTransactionAmount(String highestTransactionAmount) {
        this.highestTransactionAmount = highestTransactionAmount;
    }

    public String getRiskMonitoring() {
        return riskMonitoring;
    }

    public void setRiskMonitoring(String riskMonitoring) {
        this.riskMonitoring = riskMonitoring;
    }

    public String getRiskPayment() {
        return riskPayment;
    }

    public void setRiskPayment(String riskPayment) {
        this.riskPayment = riskPayment;
    }

    public String getRiskByCommission() {
        return riskByCommission;
    }

    public void setRiskByCommission(String riskByCommission) {
        this.riskByCommission = riskByCommission;
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

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankTransitNumber() {
        return bankTransitNumber;
    }

    public void setBankTransitNumber(String bankTransitNumber) {
        this.bankTransitNumber = bankTransitNumber;
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

    public String getCompanyLegalName() {
        return companyLegalName;
    }

    public void setCompanyLegalName(String companyLegalName) {
        this.companyLegalName = companyLegalName;
    }

    public String getCompanyBusinessType() {
        return companyBusinessType;
    }

    public void setCompanyBusinessType(String companyBusinessType) {
        this.companyBusinessType = companyBusinessType;
    }

    public String getCompanyAccountUserName() {
        return companyAccountUserName;
    }

    public void setCompanyAccountUserName(String companyAccountUserName) {
        this.companyAccountUserName = companyAccountUserName;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public String getBankMinimalPayoutAmount() {
        return bankMinimalPayoutAmount;
    }

    public void setBankMinimalPayoutAmount(String bankMinimalPayoutAmount) {
        this.bankMinimalPayoutAmount = bankMinimalPayoutAmount;
    }

    public String getBankRefundReserve() {
        return bankRefundReserve;
    }

    public void setBankRefundReserve(String bankRefundReserve) {
        this.bankRefundReserve = bankRefundReserve;
    }

    public String getMerchantServiceAgreementDate() {
        return merchantServiceAgreementDate;
    }

    public void setMerchantServiceAgreementDate(String merchantServiceAgreementDate) {
        this.merchantServiceAgreementDate = merchantServiceAgreementDate;
    }

    public String getMerchantPricingAgreementDate() {
        return merchantPricingAgreementDate;
    }

    public void setMerchantPricingAgreementDate(String merchantPricingAgreementDate) {
        this.merchantPricingAgreementDate = merchantPricingAgreementDate;
    }

    public Optional<Integer> getStatus() {
        return status;
    }

    public void setStatus(Optional<Integer> status) {
        this.status = status;
    }

    public String getErrorResponse() {
        return errorResponse;
    }

    public void setErrorResponse(String errorResponse) {
        this.errorResponse = errorResponse;
    }

    public List<BoardingInformationFileEntity> getFiles() {
        return files;
    }

    public void setFiles(List<BoardingInformationFileEntity> files) {
        this.files = files;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getCompanyMerchantLanguage() {
        return companyMerchantLanguage;
    }

    public void setCompanyMerchantLanguage(Integer companyMerchantLanguage) {
        this.companyMerchantLanguage = companyMerchantLanguage;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public List<BoardingInfoPersonEntity> getPersons() {
        return persons;
    }

    public void setPersons(List<BoardingInfoPersonEntity> persons) {
        this.persons = persons;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingInformation that = (BoardingInformation) o;
        return Objects.equals(boardingInfoId, that.boardingInfoId) && Objects.equals(serviceId, that.serviceId) && Objects.equals(merchantId, that.merchantId) && Objects.equals(createdDate, that.createdDate) && Objects.equals(providerRequestId, that.providerRequestId) && Objects.equals(caseId, that.caseId) && Objects.equals(companyCountryCode, that.companyCountryCode) && Objects.equals(companyCity, that.companyCity) && Objects.equals(companyZip, that.companyZip) && Objects.equals(companyStateCode, that.companyStateCode) && Objects.equals(companyTaxId, that.companyTaxId) && Objects.equals(companyWebSite, that.companyWebSite) && Objects.equals(companySalesVolume, that.companySalesVolume) && Objects.equals(companyProductAndServiceDescription, that.companyProductAndServiceDescription) && Objects.equals(businessRegistrationNumber, that.businessRegistrationNumber) && Objects.equals(averageTransactionAmount, that.averageTransactionAmount) && Objects.equals(highestTransactionAmount, that.highestTransactionAmount) && Objects.equals(riskMonitoring, that.riskMonitoring) && Objects.equals(riskPayment, that.riskPayment) && Objects.equals(riskByCommission, that.riskByCommission) && Objects.equals(businessRegistrationNumber_Edited, that.businessRegistrationNumber_Edited) && Objects.equals(bankBic, that.bankBic) && Objects.equals(bankIban, that.bankIban) && Objects.equals(bankCity, that.bankCity) && Objects.equals(bankStateCode, that.bankStateCode) && Objects.equals(bankCountryCode, that.bankCountryCode) && Objects.equals(bankName, that.bankName) && Objects.equals(bankRoutingNumber, that.bankRoutingNumber) && Objects.equals(bankAccountNumber, that.bankAccountNumber) && Objects.equals(bankTransitNumber, that.bankTransitNumber) && Objects.equals(bankPayoutCurrency, that.bankPayoutCurrency) && Objects.equals(bankSortCode, that.bankSortCode) && Objects.equals(bankBsb, that.bankBsb) && Objects.equals(bankSwiftCode, that.bankSwiftCode) && Objects.equals(companyBusinessCategory, that.companyBusinessCategory) && Objects.equals(companyLegalName, that.companyLegalName) && Objects.equals(companyBusinessType, that.companyBusinessType) && Objects.equals(companyAccountUserName, that.companyAccountUserName) && Objects.equals(bankAccountType, that.bankAccountType) && Objects.equals(bankMinimalPayoutAmount, that.bankMinimalPayoutAmount) && Objects.equals(bankRefundReserve, that.bankRefundReserve) && Objects.equals(merchantServiceAgreementDate, that.merchantServiceAgreementDate) && Objects.equals(merchantPricingAgreementDate, that.merchantPricingAgreementDate) && Objects.equals(status, that.status) && Objects.equals(errorResponse, that.errorResponse) && Objects.equals(files, that.files) && Objects.equals(clientName, that.clientName) && Objects.equals(clientEmail, that.clientEmail) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(companyMerchantLanguage, that.companyMerchantLanguage) && Objects.equals(currency, that.currency) && Objects.equals(persons, that.persons) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingInfoId, serviceId, merchantId, createdDate, providerRequestId, caseId, companyCountryCode, companyCity, companyZip, companyStateCode, companyTaxId, companyWebSite, companySalesVolume, companyProductAndServiceDescription, businessRegistrationNumber, averageTransactionAmount, highestTransactionAmount, riskMonitoring, riskPayment, riskByCommission, businessRegistrationNumber_Edited, bankBic, bankIban, bankCity, bankStateCode, bankCountryCode, bankName, bankRoutingNumber, bankAccountNumber, bankTransitNumber, bankPayoutCurrency, bankSortCode, bankBsb, bankSwiftCode, companyBusinessCategory, companyLegalName, companyBusinessType, companyAccountUserName, bankAccountType, bankMinimalPayoutAmount, bankRefundReserve, merchantServiceAgreementDate, merchantPricingAgreementDate, status, errorResponse, files, clientName, clientEmail, phoneNumber, companyMerchantLanguage, currency, persons);
    }

    @Override
    public String toString() {
        return "BoardingInformation{" +
                "boardingInfoId='" + boardingInfoId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", providerRequestId='" + providerRequestId + '\'' +
                ", caseId='" + caseId + '\'' +
                ", companyCountryCode='" + companyCountryCode + '\'' +
                ", companyCity='" + companyCity + '\'' +
                ", companyZip='" + companyZip + '\'' +
                ", companyStateCode='" + companyStateCode + '\'' +
                ", companyTaxId='" + companyTaxId + '\'' +
                ", companyWebSite='" + companyWebSite + '\'' +
                ", companySalesVolume='" + companySalesVolume + '\'' +
                ", companyProductAndServiceDescription='" + companyProductAndServiceDescription + '\'' +
                ", businessRegistrationNumber='" + businessRegistrationNumber + '\'' +
                ", averageTransactionAmount='" + averageTransactionAmount + '\'' +
                ", highestTransactionAmount='" + highestTransactionAmount + '\'' +
                ", riskMonitoring='" + riskMonitoring + '\'' +
                ", riskPayment='" + riskPayment + '\'' +
                ", riskByCommission='" + riskByCommission + '\'' +
                ", businessRegistrationNumber_Edited='" + businessRegistrationNumber_Edited + '\'' +
                ", bankBic='" + bankBic + '\'' +
                ", bankIban='" + bankIban + '\'' +
                ", bankCity='" + bankCity + '\'' +
                ", bankStateCode='" + bankStateCode + '\'' +
                ", bankCountryCode='" + bankCountryCode + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankRoutingNumber='" + bankRoutingNumber + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                ", bankTransitNumber='" + bankTransitNumber + '\'' +
                ", bankPayoutCurrency='" + bankPayoutCurrency + '\'' +
                ", bankSortCode='" + bankSortCode + '\'' +
                ", bankBsb='" + bankBsb + '\'' +
                ", bankSwiftCode='" + bankSwiftCode + '\'' +
                ", companyBusinessCategory='" + companyBusinessCategory + '\'' +
                ", companyLegalName='" + companyLegalName + '\'' +
                ", companyBusinessType='" + companyBusinessType + '\'' +
                ", companyAccountUserName='" + companyAccountUserName + '\'' +
                ", bankAccountType='" + bankAccountType + '\'' +
                ", bankMinimalPayoutAmount='" + bankMinimalPayoutAmount + '\'' +
                ", bankRefundReserve='" + bankRefundReserve + '\'' +
                ", merchantServiceAgreementDate='" + merchantServiceAgreementDate + '\'' +
                ", merchantPricingAgreementDate='" + merchantPricingAgreementDate + '\'' +
                ", status='" + status + '\'' +
                ", errorResponse='" + errorResponse + '\'' +
                ", files='" + files + '\'' +
                ", clientName='" + clientName + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", companyMerchantLanguage='" + companyMerchantLanguage + '\'' +
                ", currency='" + currency + '\'' +
                ", persons='" + persons + '\'' +

                '}';
    }
}