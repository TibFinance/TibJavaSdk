
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


public class BoardingEventToBroadcast   {

    
    /**
 * 
 */
    @JsonProperty("BoardingInfoId")
    private String boardingInfoId;

    /**
 * The ClientId property serves as a distinct identifier for each client, playing a crucial role in the authentication process.
 */
    @JsonProperty("ClientId")
    private String clientId;

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
    @JsonProperty("CompanyType")
    private Optional<Integer> companyType;

    /**
 * 
 */
    @JsonProperty("DidOwnersAlreadyBeenSubjectOfResiliationOfPaymentService")
    private Optional<Boolean> didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService;

    /**
 * 
 */
    @JsonProperty("DidOwnersAlreadyAskedForBankrupcy")
    private Optional<Boolean> didOwnersAlreadyAskedForBankrupcy;

    /**
 * 
 */
    @JsonProperty("HaveYouBeenSubjectOfVisaRiskProgram")
    private Optional<Boolean> haveYouBeenSubjectOfVisaRiskProgram;

    /**
 * 
 */
    @JsonProperty("DrivingLicenceNumber")
    private String drivingLicenceNumber;

    /**
 * 
 */
    @JsonProperty("BoardingStep")
    private Integer boardingStep;

    /**
 * 
 */
    @JsonProperty("CompanyName_Edited")
    private String companyName_Edited;

    /**
 * 
 */
    @JsonProperty("CompanyAddress_Edited")
    private String companyAddress_Edited;

    /**
 * 
 */
    @JsonProperty("CompanyType_Edited")
    private Optional<Integer> companyType_Edited;

    /**
 * 
 */
    @JsonProperty("AccountOwner")
    private String accountOwner;

    /**
 * Specifies the bank account number associated with the payment method.
 */
    @JsonProperty("AccountNumber")
    private String accountNumber;

    /**
 * Identifies the bank associated with the account using its numeric identifier.
 */
    @JsonProperty("BankNumber")
    private String bankNumber;

    /**
 * 
 */
    @JsonProperty("TransitNumber")
    private String transitNumber;

    /**
 * 
 */
    @JsonProperty("SignedContractContent")
    private byte[] signedContractContent;

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
 * 
 */
    @JsonProperty("ClientPhone")
    private String clientPhone;

    /**
 * The date and time when the payment was created.
 */
    @JsonProperty("CreatedDate")
    private LocalDateTime createdDate;

    /**
 * 
 */
    @JsonProperty("SpecimenFile")
    private String specimenFile;

    /**
 * 
 */
    @JsonProperty("IdFile")
    private String idFile;

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
 * The MerchantId property retrieves or assigns a unique Guid identifier for a specific merchant.
 */
    @JsonProperty("MerchantId")
    private Optional<String> merchantId;

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
 * Generates a unique identifier for a specific service to facilitate the creation of a customer list.
 */
    @JsonProperty("ServiceId")
    private Optional<String> serviceId;

    /**
 * Gets or sets the string that contains the required document identifiers for the client.
 */
    @JsonProperty("RequiredDocuments")
    private String requiredDocuments;

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
    @JsonProperty("CompanyEmail")
    private String companyEmail;

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
    @JsonProperty("PaymentReference")
    private String paymentReference;

    /**
 * 
 */
    @JsonProperty("ManagerLinkedIn")
    private String managerLinkedIn;


    
    public BoardingEventToBroadcast() {
    }

    
    public BoardingEventToBroadcast(String boardingInfoId, String clientId, String companyName, String companyAddress, Optional<Integer> companyType, Optional<Boolean> didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, Optional<Boolean> didOwnersAlreadyAskedForBankrupcy, Optional<Boolean> haveYouBeenSubjectOfVisaRiskProgram, String drivingLicenceNumber, Integer boardingStep, String companyName_Edited, String companyAddress_Edited, Optional<Integer> companyType_Edited, String accountOwner, String accountNumber, String bankNumber, String transitNumber, byte[] signedContractContent, String clientName, String clientEmail, String clientPhone, LocalDateTime createdDate, String specimenFile, String idFile, String companyTaxId, String companyCountryCode, String companyStateCode, String companyCity, String companyZip, String companyPhone, String companyProductAndServiceDescription, String companyWebSite, String companyBusinessCategory, String companySalesVolume, String bankPayoutCurrency, String bankCountryCode, String bankStateCode, String bankCity, String bankName, String bankRoutingNumber, String bankBic, String bankIban, String bankSortCode, String bankSwiftCode, String bankBsb, String businessRegistrationNumber, String businessRegistrationNumber_Edited, String companyLegalName, String companyBusinessType, String companyAccountUserName, String bankAccountType, String bankMinimalPayoutAmount, String bankRefundReserve, String merchantServiceAgreementDate, String merchantPricingAgreementDate, Optional<String> merchantId, Optional<Integer> status, String errorResponse, Optional<String> serviceId, String requiredDocuments, String providerRequestId, String caseId, String companyEmail, String averageTransactionAmount, String highestTransactionAmount, String riskMonitoring, String riskPayment, String riskByCommission, String paymentReference, String managerLinkedIn) {
        this.boardingInfoId = boardingInfoId;
this.clientId = clientId;
this.companyName = companyName;
this.companyAddress = companyAddress;
this.companyType = companyType;
this.didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService = didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService;
this.didOwnersAlreadyAskedForBankrupcy = didOwnersAlreadyAskedForBankrupcy;
this.haveYouBeenSubjectOfVisaRiskProgram = haveYouBeenSubjectOfVisaRiskProgram;
this.drivingLicenceNumber = drivingLicenceNumber;
this.boardingStep = boardingStep;
this.companyName_Edited = companyName_Edited;
this.companyAddress_Edited = companyAddress_Edited;
this.companyType_Edited = companyType_Edited;
this.accountOwner = accountOwner;
this.accountNumber = accountNumber;
this.bankNumber = bankNumber;
this.transitNumber = transitNumber;
this.signedContractContent = signedContractContent;
this.clientName = clientName;
this.clientEmail = clientEmail;
this.clientPhone = clientPhone;
this.createdDate = createdDate;
this.specimenFile = specimenFile;
this.idFile = idFile;
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
this.bankPayoutCurrency = bankPayoutCurrency;
this.bankCountryCode = bankCountryCode;
this.bankStateCode = bankStateCode;
this.bankCity = bankCity;
this.bankName = bankName;
this.bankRoutingNumber = bankRoutingNumber;
this.bankBic = bankBic;
this.bankIban = bankIban;
this.bankSortCode = bankSortCode;
this.bankSwiftCode = bankSwiftCode;
this.bankBsb = bankBsb;
this.businessRegistrationNumber = businessRegistrationNumber;
this.businessRegistrationNumber_Edited = businessRegistrationNumber_Edited;
this.companyLegalName = companyLegalName;
this.companyBusinessType = companyBusinessType;
this.companyAccountUserName = companyAccountUserName;
this.bankAccountType = bankAccountType;
this.bankMinimalPayoutAmount = bankMinimalPayoutAmount;
this.bankRefundReserve = bankRefundReserve;
this.merchantServiceAgreementDate = merchantServiceAgreementDate;
this.merchantPricingAgreementDate = merchantPricingAgreementDate;
this.merchantId = merchantId;
this.status = status;
this.errorResponse = errorResponse;
this.serviceId = serviceId;
this.requiredDocuments = requiredDocuments;
this.providerRequestId = providerRequestId;
this.caseId = caseId;
this.companyEmail = companyEmail;
this.averageTransactionAmount = averageTransactionAmount;
this.highestTransactionAmount = highestTransactionAmount;
this.riskMonitoring = riskMonitoring;
this.riskPayment = riskPayment;
this.riskByCommission = riskByCommission;
this.paymentReference = paymentReference;
this.managerLinkedIn = managerLinkedIn;

    }
    
    

    
    public String getBoardingInfoId() {
        return boardingInfoId;
    }

    public void setBoardingInfoId(String boardingInfoId) {
        this.boardingInfoId = boardingInfoId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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

    public Optional<Integer> getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Optional<Integer> companyType) {
        this.companyType = companyType;
    }

    public Optional<Boolean> getDidOwnersAlreadyBeenSubjectOfResiliationOfPaymentService() {
        return didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService;
    }

    public void setDidOwnersAlreadyBeenSubjectOfResiliationOfPaymentService(Optional<Boolean> didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService) {
        this.didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService = didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService;
    }

    public Optional<Boolean> getDidOwnersAlreadyAskedForBankrupcy() {
        return didOwnersAlreadyAskedForBankrupcy;
    }

    public void setDidOwnersAlreadyAskedForBankrupcy(Optional<Boolean> didOwnersAlreadyAskedForBankrupcy) {
        this.didOwnersAlreadyAskedForBankrupcy = didOwnersAlreadyAskedForBankrupcy;
    }

    public Optional<Boolean> getHaveYouBeenSubjectOfVisaRiskProgram() {
        return haveYouBeenSubjectOfVisaRiskProgram;
    }

    public void setHaveYouBeenSubjectOfVisaRiskProgram(Optional<Boolean> haveYouBeenSubjectOfVisaRiskProgram) {
        this.haveYouBeenSubjectOfVisaRiskProgram = haveYouBeenSubjectOfVisaRiskProgram;
    }

    public String getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }

    public void setDrivingLicenceNumber(String drivingLicenceNumber) {
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    public Integer getBoardingStep() {
        return boardingStep;
    }

    public void setBoardingStep(Integer boardingStep) {
        this.boardingStep = boardingStep;
    }

    public String getCompanyName_Edited() {
        return companyName_Edited;
    }

    public void setCompanyName_Edited(String companyName_Edited) {
        this.companyName_Edited = companyName_Edited;
    }

    public String getCompanyAddress_Edited() {
        return companyAddress_Edited;
    }

    public void setCompanyAddress_Edited(String companyAddress_Edited) {
        this.companyAddress_Edited = companyAddress_Edited;
    }

    public Optional<Integer> getCompanyType_Edited() {
        return companyType_Edited;
    }

    public void setCompanyType_Edited(Optional<Integer> companyType_Edited) {
        this.companyType_Edited = companyType_Edited;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getTransitNumber() {
        return transitNumber;
    }

    public void setTransitNumber(String transitNumber) {
        this.transitNumber = transitNumber;
    }

    public byte[] getSignedContractContent() {
        return signedContractContent;
    }

    public void setSignedContractContent(byte[] signedContractContent) {
        this.signedContractContent = signedContractContent;
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

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getSpecimenFile() {
        return specimenFile;
    }

    public void setSpecimenFile(String specimenFile) {
        this.specimenFile = specimenFile;
    }

    public String getIdFile() {
        return idFile;
    }

    public void setIdFile(String idFile) {
        this.idFile = idFile;
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

    public Optional<String> getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Optional<String> merchantId) {
        this.merchantId = merchantId;
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

    public Optional<String> getServiceId() {
        return serviceId;
    }

    public void setServiceId(Optional<String> serviceId) {
        this.serviceId = serviceId;
    }

    public String getRequiredDocuments() {
        return requiredDocuments;
    }

    public void setRequiredDocuments(String requiredDocuments) {
        this.requiredDocuments = requiredDocuments;
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

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
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

    public String getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }

    public String getManagerLinkedIn() {
        return managerLinkedIn;
    }

    public void setManagerLinkedIn(String managerLinkedIn) {
        this.managerLinkedIn = managerLinkedIn;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingEventToBroadcast that = (BoardingEventToBroadcast) o;
        return Objects.equals(boardingInfoId, that.boardingInfoId) && Objects.equals(clientId, that.clientId) && Objects.equals(companyName, that.companyName) && Objects.equals(companyAddress, that.companyAddress) && Objects.equals(companyType, that.companyType) && Objects.equals(didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, that.didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService) && Objects.equals(didOwnersAlreadyAskedForBankrupcy, that.didOwnersAlreadyAskedForBankrupcy) && Objects.equals(haveYouBeenSubjectOfVisaRiskProgram, that.haveYouBeenSubjectOfVisaRiskProgram) && Objects.equals(drivingLicenceNumber, that.drivingLicenceNumber) && Objects.equals(boardingStep, that.boardingStep) && Objects.equals(companyName_Edited, that.companyName_Edited) && Objects.equals(companyAddress_Edited, that.companyAddress_Edited) && Objects.equals(companyType_Edited, that.companyType_Edited) && Objects.equals(accountOwner, that.accountOwner) && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(bankNumber, that.bankNumber) && Objects.equals(transitNumber, that.transitNumber) && Objects.equals(signedContractContent, that.signedContractContent) && Objects.equals(clientName, that.clientName) && Objects.equals(clientEmail, that.clientEmail) && Objects.equals(clientPhone, that.clientPhone) && Objects.equals(createdDate, that.createdDate) && Objects.equals(specimenFile, that.specimenFile) && Objects.equals(idFile, that.idFile) && Objects.equals(companyTaxId, that.companyTaxId) && Objects.equals(companyCountryCode, that.companyCountryCode) && Objects.equals(companyStateCode, that.companyStateCode) && Objects.equals(companyCity, that.companyCity) && Objects.equals(companyZip, that.companyZip) && Objects.equals(companyPhone, that.companyPhone) && Objects.equals(companyProductAndServiceDescription, that.companyProductAndServiceDescription) && Objects.equals(companyWebSite, that.companyWebSite) && Objects.equals(companyBusinessCategory, that.companyBusinessCategory) && Objects.equals(companySalesVolume, that.companySalesVolume) && Objects.equals(bankPayoutCurrency, that.bankPayoutCurrency) && Objects.equals(bankCountryCode, that.bankCountryCode) && Objects.equals(bankStateCode, that.bankStateCode) && Objects.equals(bankCity, that.bankCity) && Objects.equals(bankName, that.bankName) && Objects.equals(bankRoutingNumber, that.bankRoutingNumber) && Objects.equals(bankBic, that.bankBic) && Objects.equals(bankIban, that.bankIban) && Objects.equals(bankSortCode, that.bankSortCode) && Objects.equals(bankSwiftCode, that.bankSwiftCode) && Objects.equals(bankBsb, that.bankBsb) && Objects.equals(businessRegistrationNumber, that.businessRegistrationNumber) && Objects.equals(businessRegistrationNumber_Edited, that.businessRegistrationNumber_Edited) && Objects.equals(companyLegalName, that.companyLegalName) && Objects.equals(companyBusinessType, that.companyBusinessType) && Objects.equals(companyAccountUserName, that.companyAccountUserName) && Objects.equals(bankAccountType, that.bankAccountType) && Objects.equals(bankMinimalPayoutAmount, that.bankMinimalPayoutAmount) && Objects.equals(bankRefundReserve, that.bankRefundReserve) && Objects.equals(merchantServiceAgreementDate, that.merchantServiceAgreementDate) && Objects.equals(merchantPricingAgreementDate, that.merchantPricingAgreementDate) && Objects.equals(merchantId, that.merchantId) && Objects.equals(status, that.status) && Objects.equals(errorResponse, that.errorResponse) && Objects.equals(serviceId, that.serviceId) && Objects.equals(requiredDocuments, that.requiredDocuments) && Objects.equals(providerRequestId, that.providerRequestId) && Objects.equals(caseId, that.caseId) && Objects.equals(companyEmail, that.companyEmail) && Objects.equals(averageTransactionAmount, that.averageTransactionAmount) && Objects.equals(highestTransactionAmount, that.highestTransactionAmount) && Objects.equals(riskMonitoring, that.riskMonitoring) && Objects.equals(riskPayment, that.riskPayment) && Objects.equals(riskByCommission, that.riskByCommission) && Objects.equals(paymentReference, that.paymentReference) && Objects.equals(managerLinkedIn, that.managerLinkedIn) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(boardingInfoId, clientId, companyName, companyAddress, companyType, didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, didOwnersAlreadyAskedForBankrupcy, haveYouBeenSubjectOfVisaRiskProgram, drivingLicenceNumber, boardingStep, companyName_Edited, companyAddress_Edited, companyType_Edited, accountOwner, accountNumber, bankNumber, transitNumber, signedContractContent, clientName, clientEmail, clientPhone, createdDate, specimenFile, idFile, companyTaxId, companyCountryCode, companyStateCode, companyCity, companyZip, companyPhone, companyProductAndServiceDescription, companyWebSite, companyBusinessCategory, companySalesVolume, bankPayoutCurrency, bankCountryCode, bankStateCode, bankCity, bankName, bankRoutingNumber, bankBic, bankIban, bankSortCode, bankSwiftCode, bankBsb, businessRegistrationNumber, businessRegistrationNumber_Edited, companyLegalName, companyBusinessType, companyAccountUserName, bankAccountType, bankMinimalPayoutAmount, bankRefundReserve, merchantServiceAgreementDate, merchantPricingAgreementDate, merchantId, status, errorResponse, serviceId, requiredDocuments, providerRequestId, caseId, companyEmail, averageTransactionAmount, highestTransactionAmount, riskMonitoring, riskPayment, riskByCommission, paymentReference, managerLinkedIn);
    }

    @Override
    public String toString() {
        return "BoardingEventToBroadcast{" +
                 "boardingInfoId='" + boardingInfoId + '\'' +
 ", clientId='" + clientId + '\'' +
 ", companyName='" + companyName + '\'' +
 ", companyAddress='" + companyAddress + '\'' +
 ", companyType='" + companyType + '\'' +
 ", didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService='" + didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService + '\'' +
 ", didOwnersAlreadyAskedForBankrupcy='" + didOwnersAlreadyAskedForBankrupcy + '\'' +
 ", haveYouBeenSubjectOfVisaRiskProgram='" + haveYouBeenSubjectOfVisaRiskProgram + '\'' +
 ", drivingLicenceNumber='" + drivingLicenceNumber + '\'' +
 ", boardingStep='" + boardingStep + '\'' +
 ", companyName_Edited='" + companyName_Edited + '\'' +
 ", companyAddress_Edited='" + companyAddress_Edited + '\'' +
 ", companyType_Edited='" + companyType_Edited + '\'' +
 ", accountOwner='" + accountOwner + '\'' +
 ", accountNumber='" + accountNumber + '\'' +
 ", bankNumber='" + bankNumber + '\'' +
 ", transitNumber='" + transitNumber + '\'' +
 ", signedContractContent='" + signedContractContent + '\'' +
 ", clientName='" + clientName + '\'' +
 ", clientEmail='" + clientEmail + '\'' +
 ", clientPhone='" + clientPhone + '\'' +
 ", createdDate='" + createdDate + '\'' +
 ", specimenFile='" + specimenFile + '\'' +
 ", idFile='" + idFile + '\'' +
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
 ", bankPayoutCurrency='" + bankPayoutCurrency + '\'' +
 ", bankCountryCode='" + bankCountryCode + '\'' +
 ", bankStateCode='" + bankStateCode + '\'' +
 ", bankCity='" + bankCity + '\'' +
 ", bankName='" + bankName + '\'' +
 ", bankRoutingNumber='" + bankRoutingNumber + '\'' +
 ", bankBic='" + bankBic + '\'' +
 ", bankIban='" + bankIban + '\'' +
 ", bankSortCode='" + bankSortCode + '\'' +
 ", bankSwiftCode='" + bankSwiftCode + '\'' +
 ", bankBsb='" + bankBsb + '\'' +
 ", businessRegistrationNumber='" + businessRegistrationNumber + '\'' +
 ", businessRegistrationNumber_Edited='" + businessRegistrationNumber_Edited + '\'' +
 ", companyLegalName='" + companyLegalName + '\'' +
 ", companyBusinessType='" + companyBusinessType + '\'' +
 ", companyAccountUserName='" + companyAccountUserName + '\'' +
 ", bankAccountType='" + bankAccountType + '\'' +
 ", bankMinimalPayoutAmount='" + bankMinimalPayoutAmount + '\'' +
 ", bankRefundReserve='" + bankRefundReserve + '\'' +
 ", merchantServiceAgreementDate='" + merchantServiceAgreementDate + '\'' +
 ", merchantPricingAgreementDate='" + merchantPricingAgreementDate + '\'' +
 ", merchantId='" + merchantId + '\'' +
 ", status='" + status + '\'' +
 ", errorResponse='" + errorResponse + '\'' +
 ", serviceId='" + serviceId + '\'' +
 ", requiredDocuments='" + requiredDocuments + '\'' +
 ", providerRequestId='" + providerRequestId + '\'' +
 ", caseId='" + caseId + '\'' +
 ", companyEmail='" + companyEmail + '\'' +
 ", averageTransactionAmount='" + averageTransactionAmount + '\'' +
 ", highestTransactionAmount='" + highestTransactionAmount + '\'' +
 ", riskMonitoring='" + riskMonitoring + '\'' +
 ", riskPayment='" + riskPayment + '\'' +
 ", riskByCommission='" + riskByCommission + '\'' +
 ", paymentReference='" + paymentReference + '\'' +
 ", managerLinkedIn='" + managerLinkedIn + '\'' +

                '}';
    }
}