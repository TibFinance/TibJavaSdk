
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


public class TibAccountOpenForm   {

    
    /**
 * Gets or sets the name of the enterprise.
 */
    @JsonProperty("EnterpriseName")
    private String enterpriseName;

    /**
 * Gets or sets the enterprise address.
 */
    @JsonProperty("EnterpriseAddress")
    private String enterpriseAddress;

    /**
 * Gets or sets the enterprise city.
 */
    @JsonProperty("EnterpriseCity")
    private String enterpriseCity;

    /**
 * Gets or sets the enterprise province.
 */
    @JsonProperty("EnterpriseProvince")
    private String enterpriseProvince;

    /**
 * Gets or sets the enterprise postal code.
 */
    @JsonProperty("EnterprisePostalCode")
    private String enterprisePostalCode;

    /**
 * Gets or sets the enterprise phone.
 */
    @JsonProperty("EnterprisePhone")
    private String enterprisePhone;

    /**
 * Gets or sets the enterprise phone2.
 */
    @JsonProperty("EnterprisePhone2")
    private String enterprisePhone2;

    /**
 * Gets or sets the enterprise email.
 */
    @JsonProperty("EnterpriseEmail")
    private String enterpriseEmail;

    /**
 * Gets or sets the enterprise account responsible.
 */
    @JsonProperty("EnterpriseAccountResponsible")
    private String enterpriseAccountResponsible;

    /**
 * Gets or sets the type of the enterprise.
 */
    @JsonProperty("EnterpriseType")
    private String enterpriseType;

    /**
 * Gets or sets the enterprise established since.
 */
    @JsonProperty("EnterpriseEstablishedSince")
    private String enterpriseEstablishedSince;

    /**
 * Gets or sets the enterprise taxe number.
 */
    @JsonProperty("EnterpriseTaxeNumber")
    private String enterpriseTaxeNumber;

    /**
 * Gets or sets the enterprise neq.
 */
    @JsonProperty("EnterpriseNeq")
    private String enterpriseNeq;

    /**
 * Gets or sets the enterprise name appear.
 */
    @JsonProperty("EnterpriseNameAppear")
    private String enterpriseNameAppear;

    /**
 * Gets or sets the name of the billing.
 */
    @JsonProperty("BillingName")
    private String billingName;

    /**
 * Gets or sets the billing address.
 */
    @JsonProperty("BillingAddress")
    private String billingAddress;

    /**
 * Gets or sets the billing city.
 */
    @JsonProperty("BillingCity")
    private String billingCity;

    /**
 * Gets or sets the billing province.
 */
    @JsonProperty("BillingProvince")
    private String billingProvince;

    /**
 * Gets or sets the billing postal code.
 */
    @JsonProperty("BillingPostalCode")
    private String billingPostalCode;

    /**
 * Gets or sets the billing phone.
 */
    @JsonProperty("BillingPhone")
    private String billingPhone;

    /**
 * Gets or sets the billing phone2.
 */
    @JsonProperty("BillingPhone2")
    private String billingPhone2;

    /**
 * Gets or sets the billing email.
 */
    @JsonProperty("BillingEmail")
    private String billingEmail;

    /**
 * Gets or sets the business type choice.
 */
    @JsonProperty("BusinessTypeChoice")
    private String businessTypeChoice;

    /**
 * Gets or sets the first name of the leader.
 */
    @JsonProperty("FirstLeaderName")
    private String firstLeaderName;

    /**
 * Gets or sets the first leader initiales.
 */
    @JsonProperty("FirstLeaderInitiales")
    private String firstLeaderInitiales;

    /**
 * Gets or sets the first leader nas.
 */
    @JsonProperty("FirstLeaderNas")
    private String firstLeaderNas;

    /**
 * Gets or sets the first leader phone.
 */
    @JsonProperty("FirstLeaderPhone")
    private String firstLeaderPhone;

    /**
 * Gets or sets the first leader cell phone.
 */
    @JsonProperty("FirstLeaderCellPhone")
    private String firstLeaderCellPhone;

    /**
 * Gets or sets the first leader address.
 */
    @JsonProperty("FirstLeaderAddress")
    private String firstLeaderAddress;

    /**
 * Gets or sets the first leader province.
 */
    @JsonProperty("FirstLeaderProvince")
    private String firstLeaderProvince;

    /**
 * Gets or sets the first leader postal code.
 */
    @JsonProperty("FirstLeaderPostalCode")
    private String firstLeaderPostalCode;

    /**
 * Gets or sets the first leader licence number.
 */
    @JsonProperty("FirstLeaderLicenceNumber")
    private String firstLeaderLicenceNumber;

    /**
 * Gets or sets the first leader birth date.
 */
    @JsonProperty("FirstLeaderBirthDate")
    private String firstLeaderBirthDate;

    /**
 * Gets or sets the first leader share part.
 */
    @JsonProperty("FirstLeaderSharePart")
    private String firstLeaderSharePart;

    /**
 * Gets or sets the first leader title.
 */
    @JsonProperty("FirstLeaderTitle")
    private String firstLeaderTitle;

    /**
 * Gets or sets the name of the second leader.
 */
    @JsonProperty("SecondLeaderName")
    private String secondLeaderName;

    /**
 * Gets or sets the second leader initiales.
 */
    @JsonProperty("SecondLeaderInitiales")
    private String secondLeaderInitiales;

    /**
 * Gets or sets the second leader nas.
 */
    @JsonProperty("SecondLeaderNas")
    private String secondLeaderNas;

    /**
 * Gets or sets the second leader phone.
 */
    @JsonProperty("SecondLeaderPhone")
    private String secondLeaderPhone;

    /**
 * Gets or sets the second leader cell phone.
 */
    @JsonProperty("SecondLeaderCellPhone")
    private String secondLeaderCellPhone;

    /**
 * Gets or sets the second leader address.
 */
    @JsonProperty("SecondLeaderAddress")
    private String secondLeaderAddress;

    /**
 * Gets or sets the second leader province.
 */
    @JsonProperty("SecondLeaderProvince")
    private String secondLeaderProvince;

    /**
 * Gets or sets the second leader postal code.
 */
    @JsonProperty("SecondLeaderPostalCode")
    private String secondLeaderPostalCode;

    /**
 * Gets or sets the second leader licence number.
 */
    @JsonProperty("SecondLeaderLicenceNumber")
    private String secondLeaderLicenceNumber;

    /**
 * Gets or sets the second leader birth date.
 */
    @JsonProperty("SecondLeaderBirthDate")
    private String secondLeaderBirthDate;

    /**
 * Gets or sets the second leader share part.
 */
    @JsonProperty("SecondLeaderSharePart")
    private String secondLeaderSharePart;

    /**
 * Gets or sets the second leader title.
 */
    @JsonProperty("SecondLeaderTitle")
    private String secondLeaderTitle;

    /**
 * Gets or sets the had resiliation.
 */
    @JsonProperty("HadResiliation")
    private String hadResiliation;

    /**
 * Gets or sets the resiliation reason.
 */
    @JsonProperty("ResiliationReason")
    private String resiliationReason;

    /**
 * Gets or sets the had bankrupted.
 */
    @JsonProperty("HadBankrupted")
    private String hadBankrupted;

    /**
 * Gets or sets the bankrupted reason.
 */
    @JsonProperty("BankruptedReason")
    private String bankruptedReason;

    /**
 * Gets or sets the been in visa risk.
 */
    @JsonProperty("BeenInVisaRisk")
    private String beenInVisaRisk;

    /**
 * Gets or sets the visa risk reason.
 */
    @JsonProperty("VisaRiskReason")
    private String visaRiskReason;

    /**
 * Gets or sets the visa risk date.
 */
    @JsonProperty("VisaRiskDate")
    private String visaRiskDate;

    /**
 * Gets or sets the name of the bank.
 */
    @JsonProperty("BankName")
    private String bankName;

    /**
 * Gets or sets the bank address.
 */
    @JsonProperty("BankAddress")
    private String bankAddress;

    /**
 * Gets or sets the bank city.
 */
    @JsonProperty("BankCity")
    private String bankCity;

    /**
 * Gets or sets the bank province.
 */
    @JsonProperty("BankProvince")
    private String bankProvince;

    /**
 * Gets or sets the bank postal code.
 */
    @JsonProperty("BankPostalCode")
    private String bankPostalCode;

    /**
 * Gets or sets the bank phone.
 */
    @JsonProperty("BankPhone")
    private String bankPhone;

    /**
 * Gets or sets the bank phone2.
 */
    @JsonProperty("BankPhone2")
    private String bankPhone2;

    /**
 * Gets or sets the bank email.
 */
    @JsonProperty("BankEmail")
    private String bankEmail;

    /**
 * Gets or sets the specimen file.
 */
    @JsonProperty("SpecimenFile")
    private String specimenFile;

    /**
 * Gets or sets the account type option.
 */
    @JsonProperty("AccountTypeOption")
    private String accountTypeOption;

    /**
 * Identifies the bank associated with the account using its numeric identifier.
 */
    @JsonProperty("BankNumber")
    private String bankNumber;

    /**
 * Gets or sets the transit number.
 */
    @JsonProperty("TransitNumber")
    private String transitNumber;

    /**
 * Specifies the bank account number associated with the payment method.
 */
    @JsonProperty("AccountNumber")
    private String accountNumber;

    /**
 * Gets or sets the been compromised.
 */
    @JsonProperty("BeenCompromised")
    private String beenCompromised;

    /**
 * Gets or sets the pci conformity level.
 */
    @JsonProperty("PciConformityLevel")
    private String pciConformityLevel;

    /**
 * Gets or sets the been compromised year.
 */
    @JsonProperty("BeenCompromisedYear")
    private String beenCompromisedYear;

    /**
 * Gets or sets the use third party application.
 */
    @JsonProperty("UseThirdPartyApplication")
    private String useThirdPartyApplication;

    /**
 * Gets or sets the third party applications.
 */
    @JsonProperty("ThirdPartyApplications")
    private String thirdPartyApplications;

    /**
 * Gets or sets the manual collection mode card ratio.
 */
    @JsonProperty("ManualCollectionModeCardRatio")
    private String manualCollectionModeCardRatio;

    /**
 * Gets or sets the manual collection mode internet ratio.
 */
    @JsonProperty("ManualCollectionModeInternetRatio")
    private String manualCollectionModeInternetRatio;

    /**
 * Gets or sets the manual collection mode postal phone ratio.
 */
    @JsonProperty("ManualCollectionModePostalPhoneRatio")
    private String manualCollectionModePostalPhoneRatio;

    /**
 * Gets or sets the volume card.
 */
    @JsonProperty("VolumeCard")
    private String volumeCard;

    /**
 * Gets or sets the volume average transaction.
 */
    @JsonProperty("VolumeAverageTransaction")
    private String volumeAverageTransaction;

    /**
 * Gets or sets the highest transaction.
 */
    @JsonProperty("HighestTransaction")
    private String highestTransaction;

    /**
 * Gets or sets the already accept card.
 */
    @JsonProperty("AlreadyAcceptCard")
    private String alreadyAcceptCard;

    /**
 * Gets or sets the keep account.
 */
    @JsonProperty("KeepAccount")
    private String keepAccount;

    /**
 * Gets or sets the has recuring billing.
 */
    @JsonProperty("HasRecuringBilling")
    private String hasRecuringBilling;

    /**
 * Gets or sets the reason to change.
 */
    @JsonProperty("ReasonToChange")
    private String reasonToChange;

    /**
 * Gets or sets the services and products description.
 */
    @JsonProperty("ServicesAndProductsDescription")
    private String servicesAndProductsDescription;

    /**
 * Gets or sets the want withdraw deposit service.
 */
    @JsonProperty("WantWithdrawDepositService")
    private String wantWithdrawDepositService;

    /**
 * Gets or sets the number of transaction per month withdraw.
 */
    @JsonProperty("NumberOfTransactionPerMonthWithdraw")
    private String numberOfTransactionPerMonthWithdraw;

    /**
 * Gets or sets the number of transaction per month deposit.
 */
    @JsonProperty("NumberOfTransactionPerMonthDeposit")
    private String numberOfTransactionPerMonthDeposit;

    /**
 * Gets or sets the number of transaction per month NSF.
 */
    @JsonProperty("NumberOfTransactionPerMonthNsf")
    private String numberOfTransactionPerMonthNsf;

    /**
 * Gets or sets the desired limit per month withdraw.
 */
    @JsonProperty("DesiredLimitPerMonthWithdraw")
    private String desiredLimitPerMonthWithdraw;

    /**
 * Gets or sets the desired limit per month deposit.
 */
    @JsonProperty("DesiredLimitPerMonthDeposit")
    private String desiredLimitPerMonthDeposit;

    /**
 * Gets or sets the desired limit per month NSF.
 */
    @JsonProperty("DesiredLimitPerMonthNsf")
    private String desiredLimitPerMonthNsf;

    /**
 * Gets or sets the desire double authentication withdraw.
 */
    @JsonProperty("DesireDoubleAuthenticationWithdraw")
    private String desireDoubleAuthenticationWithdraw;

    /**
 * Gets or sets the desire double authentication deposit.
 */
    @JsonProperty("DesireDoubleAuthenticationDeposit")
    private String desireDoubleAuthenticationDeposit;

    /**
 * Gets or sets the desire double authentication NSF.
 */
    @JsonProperty("DesireDoubleAuthenticationNsf")
    private String desireDoubleAuthenticationNsf;

    /**
 * Gets or sets the want credit card service.
 */
    @JsonProperty("WantCreditCardService")
    private String wantCreditCardService;

    /**
 * Gets or sets the credit card volumne mastercard.
 */
    @JsonProperty("CreditCardVolumneMastercard")
    private String creditCardVolumneMastercard;

    /**
 * Gets or sets the credit card volumne mastercard visa.
 */
    @JsonProperty("CreditCardVolumneMastercardVisa")
    private String creditCardVolumneMastercardVisa;

    /**
 * Gets or sets the credit card volumne visa debit.
 */
    @JsonProperty("CreditCardVolumneVisaDebit")
    private String creditCardVolumneVisaDebit;

    /**
 * Gets or sets the accept visa debit.
 */
    @JsonProperty("AcceptVisaDebit")
    private String acceptVisaDebit;

    /**
 * Gets or sets the accept online payment.
 */
    @JsonProperty("AcceptOnlinePayment")
    private String acceptOnlinePayment;

    /**
 * Gets or sets the accept terme check.
 */
    @JsonProperty("AcceptTermeCheck")
    private String acceptTermeCheck;


    
    public TibAccountOpenForm() {
    }

    
    public TibAccountOpenForm(String enterpriseName, String enterpriseAddress, String enterpriseCity, String enterpriseProvince, String enterprisePostalCode, String enterprisePhone, String enterprisePhone2, String enterpriseEmail, String enterpriseAccountResponsible, String enterpriseType, String enterpriseEstablishedSince, String enterpriseTaxeNumber, String enterpriseNeq, String enterpriseNameAppear, String billingName, String billingAddress, String billingCity, String billingProvince, String billingPostalCode, String billingPhone, String billingPhone2, String billingEmail, String businessTypeChoice, String firstLeaderName, String firstLeaderInitiales, String firstLeaderNas, String firstLeaderPhone, String firstLeaderCellPhone, String firstLeaderAddress, String firstLeaderProvince, String firstLeaderPostalCode, String firstLeaderLicenceNumber, String firstLeaderBirthDate, String firstLeaderSharePart, String firstLeaderTitle, String secondLeaderName, String secondLeaderInitiales, String secondLeaderNas, String secondLeaderPhone, String secondLeaderCellPhone, String secondLeaderAddress, String secondLeaderProvince, String secondLeaderPostalCode, String secondLeaderLicenceNumber, String secondLeaderBirthDate, String secondLeaderSharePart, String secondLeaderTitle, String hadResiliation, String resiliationReason, String hadBankrupted, String bankruptedReason, String beenInVisaRisk, String visaRiskReason, String visaRiskDate, String bankName, String bankAddress, String bankCity, String bankProvince, String bankPostalCode, String bankPhone, String bankPhone2, String bankEmail, String specimenFile, String accountTypeOption, String bankNumber, String transitNumber, String accountNumber, String beenCompromised, String pciConformityLevel, String beenCompromisedYear, String useThirdPartyApplication, String thirdPartyApplications, String manualCollectionModeCardRatio, String manualCollectionModeInternetRatio, String manualCollectionModePostalPhoneRatio, String volumeCard, String volumeAverageTransaction, String highestTransaction, String alreadyAcceptCard, String keepAccount, String hasRecuringBilling, String reasonToChange, String servicesAndProductsDescription, String wantWithdrawDepositService, String numberOfTransactionPerMonthWithdraw, String numberOfTransactionPerMonthDeposit, String numberOfTransactionPerMonthNsf, String desiredLimitPerMonthWithdraw, String desiredLimitPerMonthDeposit, String desiredLimitPerMonthNsf, String desireDoubleAuthenticationWithdraw, String desireDoubleAuthenticationDeposit, String desireDoubleAuthenticationNsf, String wantCreditCardService, String creditCardVolumneMastercard, String creditCardVolumneMastercardVisa, String creditCardVolumneVisaDebit, String acceptVisaDebit, String acceptOnlinePayment, String acceptTermeCheck) {
        this.enterpriseName = enterpriseName;
this.enterpriseAddress = enterpriseAddress;
this.enterpriseCity = enterpriseCity;
this.enterpriseProvince = enterpriseProvince;
this.enterprisePostalCode = enterprisePostalCode;
this.enterprisePhone = enterprisePhone;
this.enterprisePhone2 = enterprisePhone2;
this.enterpriseEmail = enterpriseEmail;
this.enterpriseAccountResponsible = enterpriseAccountResponsible;
this.enterpriseType = enterpriseType;
this.enterpriseEstablishedSince = enterpriseEstablishedSince;
this.enterpriseTaxeNumber = enterpriseTaxeNumber;
this.enterpriseNeq = enterpriseNeq;
this.enterpriseNameAppear = enterpriseNameAppear;
this.billingName = billingName;
this.billingAddress = billingAddress;
this.billingCity = billingCity;
this.billingProvince = billingProvince;
this.billingPostalCode = billingPostalCode;
this.billingPhone = billingPhone;
this.billingPhone2 = billingPhone2;
this.billingEmail = billingEmail;
this.businessTypeChoice = businessTypeChoice;
this.firstLeaderName = firstLeaderName;
this.firstLeaderInitiales = firstLeaderInitiales;
this.firstLeaderNas = firstLeaderNas;
this.firstLeaderPhone = firstLeaderPhone;
this.firstLeaderCellPhone = firstLeaderCellPhone;
this.firstLeaderAddress = firstLeaderAddress;
this.firstLeaderProvince = firstLeaderProvince;
this.firstLeaderPostalCode = firstLeaderPostalCode;
this.firstLeaderLicenceNumber = firstLeaderLicenceNumber;
this.firstLeaderBirthDate = firstLeaderBirthDate;
this.firstLeaderSharePart = firstLeaderSharePart;
this.firstLeaderTitle = firstLeaderTitle;
this.secondLeaderName = secondLeaderName;
this.secondLeaderInitiales = secondLeaderInitiales;
this.secondLeaderNas = secondLeaderNas;
this.secondLeaderPhone = secondLeaderPhone;
this.secondLeaderCellPhone = secondLeaderCellPhone;
this.secondLeaderAddress = secondLeaderAddress;
this.secondLeaderProvince = secondLeaderProvince;
this.secondLeaderPostalCode = secondLeaderPostalCode;
this.secondLeaderLicenceNumber = secondLeaderLicenceNumber;
this.secondLeaderBirthDate = secondLeaderBirthDate;
this.secondLeaderSharePart = secondLeaderSharePart;
this.secondLeaderTitle = secondLeaderTitle;
this.hadResiliation = hadResiliation;
this.resiliationReason = resiliationReason;
this.hadBankrupted = hadBankrupted;
this.bankruptedReason = bankruptedReason;
this.beenInVisaRisk = beenInVisaRisk;
this.visaRiskReason = visaRiskReason;
this.visaRiskDate = visaRiskDate;
this.bankName = bankName;
this.bankAddress = bankAddress;
this.bankCity = bankCity;
this.bankProvince = bankProvince;
this.bankPostalCode = bankPostalCode;
this.bankPhone = bankPhone;
this.bankPhone2 = bankPhone2;
this.bankEmail = bankEmail;
this.specimenFile = specimenFile;
this.accountTypeOption = accountTypeOption;
this.bankNumber = bankNumber;
this.transitNumber = transitNumber;
this.accountNumber = accountNumber;
this.beenCompromised = beenCompromised;
this.pciConformityLevel = pciConformityLevel;
this.beenCompromisedYear = beenCompromisedYear;
this.useThirdPartyApplication = useThirdPartyApplication;
this.thirdPartyApplications = thirdPartyApplications;
this.manualCollectionModeCardRatio = manualCollectionModeCardRatio;
this.manualCollectionModeInternetRatio = manualCollectionModeInternetRatio;
this.manualCollectionModePostalPhoneRatio = manualCollectionModePostalPhoneRatio;
this.volumeCard = volumeCard;
this.volumeAverageTransaction = volumeAverageTransaction;
this.highestTransaction = highestTransaction;
this.alreadyAcceptCard = alreadyAcceptCard;
this.keepAccount = keepAccount;
this.hasRecuringBilling = hasRecuringBilling;
this.reasonToChange = reasonToChange;
this.servicesAndProductsDescription = servicesAndProductsDescription;
this.wantWithdrawDepositService = wantWithdrawDepositService;
this.numberOfTransactionPerMonthWithdraw = numberOfTransactionPerMonthWithdraw;
this.numberOfTransactionPerMonthDeposit = numberOfTransactionPerMonthDeposit;
this.numberOfTransactionPerMonthNsf = numberOfTransactionPerMonthNsf;
this.desiredLimitPerMonthWithdraw = desiredLimitPerMonthWithdraw;
this.desiredLimitPerMonthDeposit = desiredLimitPerMonthDeposit;
this.desiredLimitPerMonthNsf = desiredLimitPerMonthNsf;
this.desireDoubleAuthenticationWithdraw = desireDoubleAuthenticationWithdraw;
this.desireDoubleAuthenticationDeposit = desireDoubleAuthenticationDeposit;
this.desireDoubleAuthenticationNsf = desireDoubleAuthenticationNsf;
this.wantCreditCardService = wantCreditCardService;
this.creditCardVolumneMastercard = creditCardVolumneMastercard;
this.creditCardVolumneMastercardVisa = creditCardVolumneMastercardVisa;
this.creditCardVolumneVisaDebit = creditCardVolumneVisaDebit;
this.acceptVisaDebit = acceptVisaDebit;
this.acceptOnlinePayment = acceptOnlinePayment;
this.acceptTermeCheck = acceptTermeCheck;

    }
    
    

    
    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getEnterpriseCity() {
        return enterpriseCity;
    }

    public void setEnterpriseCity(String enterpriseCity) {
        this.enterpriseCity = enterpriseCity;
    }

    public String getEnterpriseProvince() {
        return enterpriseProvince;
    }

    public void setEnterpriseProvince(String enterpriseProvince) {
        this.enterpriseProvince = enterpriseProvince;
    }

    public String getEnterprisePostalCode() {
        return enterprisePostalCode;
    }

    public void setEnterprisePostalCode(String enterprisePostalCode) {
        this.enterprisePostalCode = enterprisePostalCode;
    }

    public String getEnterprisePhone() {
        return enterprisePhone;
    }

    public void setEnterprisePhone(String enterprisePhone) {
        this.enterprisePhone = enterprisePhone;
    }

    public String getEnterprisePhone2() {
        return enterprisePhone2;
    }

    public void setEnterprisePhone2(String enterprisePhone2) {
        this.enterprisePhone2 = enterprisePhone2;
    }

    public String getEnterpriseEmail() {
        return enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail;
    }

    public String getEnterpriseAccountResponsible() {
        return enterpriseAccountResponsible;
    }

    public void setEnterpriseAccountResponsible(String enterpriseAccountResponsible) {
        this.enterpriseAccountResponsible = enterpriseAccountResponsible;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getEnterpriseEstablishedSince() {
        return enterpriseEstablishedSince;
    }

    public void setEnterpriseEstablishedSince(String enterpriseEstablishedSince) {
        this.enterpriseEstablishedSince = enterpriseEstablishedSince;
    }

    public String getEnterpriseTaxeNumber() {
        return enterpriseTaxeNumber;
    }

    public void setEnterpriseTaxeNumber(String enterpriseTaxeNumber) {
        this.enterpriseTaxeNumber = enterpriseTaxeNumber;
    }

    public String getEnterpriseNeq() {
        return enterpriseNeq;
    }

    public void setEnterpriseNeq(String enterpriseNeq) {
        this.enterpriseNeq = enterpriseNeq;
    }

    public String getEnterpriseNameAppear() {
        return enterpriseNameAppear;
    }

    public void setEnterpriseNameAppear(String enterpriseNameAppear) {
        this.enterpriseNameAppear = enterpriseNameAppear;
    }

    public String getBillingName() {
        return billingName;
    }

    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingProvince() {
        return billingProvince;
    }

    public void setBillingProvince(String billingProvince) {
        this.billingProvince = billingProvince;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    public String getBillingPhone() {
        return billingPhone;
    }

    public void setBillingPhone(String billingPhone) {
        this.billingPhone = billingPhone;
    }

    public String getBillingPhone2() {
        return billingPhone2;
    }

    public void setBillingPhone2(String billingPhone2) {
        this.billingPhone2 = billingPhone2;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    public String getBusinessTypeChoice() {
        return businessTypeChoice;
    }

    public void setBusinessTypeChoice(String businessTypeChoice) {
        this.businessTypeChoice = businessTypeChoice;
    }

    public String getFirstLeaderName() {
        return firstLeaderName;
    }

    public void setFirstLeaderName(String firstLeaderName) {
        this.firstLeaderName = firstLeaderName;
    }

    public String getFirstLeaderInitiales() {
        return firstLeaderInitiales;
    }

    public void setFirstLeaderInitiales(String firstLeaderInitiales) {
        this.firstLeaderInitiales = firstLeaderInitiales;
    }

    public String getFirstLeaderNas() {
        return firstLeaderNas;
    }

    public void setFirstLeaderNas(String firstLeaderNas) {
        this.firstLeaderNas = firstLeaderNas;
    }

    public String getFirstLeaderPhone() {
        return firstLeaderPhone;
    }

    public void setFirstLeaderPhone(String firstLeaderPhone) {
        this.firstLeaderPhone = firstLeaderPhone;
    }

    public String getFirstLeaderCellPhone() {
        return firstLeaderCellPhone;
    }

    public void setFirstLeaderCellPhone(String firstLeaderCellPhone) {
        this.firstLeaderCellPhone = firstLeaderCellPhone;
    }

    public String getFirstLeaderAddress() {
        return firstLeaderAddress;
    }

    public void setFirstLeaderAddress(String firstLeaderAddress) {
        this.firstLeaderAddress = firstLeaderAddress;
    }

    public String getFirstLeaderProvince() {
        return firstLeaderProvince;
    }

    public void setFirstLeaderProvince(String firstLeaderProvince) {
        this.firstLeaderProvince = firstLeaderProvince;
    }

    public String getFirstLeaderPostalCode() {
        return firstLeaderPostalCode;
    }

    public void setFirstLeaderPostalCode(String firstLeaderPostalCode) {
        this.firstLeaderPostalCode = firstLeaderPostalCode;
    }

    public String getFirstLeaderLicenceNumber() {
        return firstLeaderLicenceNumber;
    }

    public void setFirstLeaderLicenceNumber(String firstLeaderLicenceNumber) {
        this.firstLeaderLicenceNumber = firstLeaderLicenceNumber;
    }

    public String getFirstLeaderBirthDate() {
        return firstLeaderBirthDate;
    }

    public void setFirstLeaderBirthDate(String firstLeaderBirthDate) {
        this.firstLeaderBirthDate = firstLeaderBirthDate;
    }

    public String getFirstLeaderSharePart() {
        return firstLeaderSharePart;
    }

    public void setFirstLeaderSharePart(String firstLeaderSharePart) {
        this.firstLeaderSharePart = firstLeaderSharePart;
    }

    public String getFirstLeaderTitle() {
        return firstLeaderTitle;
    }

    public void setFirstLeaderTitle(String firstLeaderTitle) {
        this.firstLeaderTitle = firstLeaderTitle;
    }

    public String getSecondLeaderName() {
        return secondLeaderName;
    }

    public void setSecondLeaderName(String secondLeaderName) {
        this.secondLeaderName = secondLeaderName;
    }

    public String getSecondLeaderInitiales() {
        return secondLeaderInitiales;
    }

    public void setSecondLeaderInitiales(String secondLeaderInitiales) {
        this.secondLeaderInitiales = secondLeaderInitiales;
    }

    public String getSecondLeaderNas() {
        return secondLeaderNas;
    }

    public void setSecondLeaderNas(String secondLeaderNas) {
        this.secondLeaderNas = secondLeaderNas;
    }

    public String getSecondLeaderPhone() {
        return secondLeaderPhone;
    }

    public void setSecondLeaderPhone(String secondLeaderPhone) {
        this.secondLeaderPhone = secondLeaderPhone;
    }

    public String getSecondLeaderCellPhone() {
        return secondLeaderCellPhone;
    }

    public void setSecondLeaderCellPhone(String secondLeaderCellPhone) {
        this.secondLeaderCellPhone = secondLeaderCellPhone;
    }

    public String getSecondLeaderAddress() {
        return secondLeaderAddress;
    }

    public void setSecondLeaderAddress(String secondLeaderAddress) {
        this.secondLeaderAddress = secondLeaderAddress;
    }

    public String getSecondLeaderProvince() {
        return secondLeaderProvince;
    }

    public void setSecondLeaderProvince(String secondLeaderProvince) {
        this.secondLeaderProvince = secondLeaderProvince;
    }

    public String getSecondLeaderPostalCode() {
        return secondLeaderPostalCode;
    }

    public void setSecondLeaderPostalCode(String secondLeaderPostalCode) {
        this.secondLeaderPostalCode = secondLeaderPostalCode;
    }

    public String getSecondLeaderLicenceNumber() {
        return secondLeaderLicenceNumber;
    }

    public void setSecondLeaderLicenceNumber(String secondLeaderLicenceNumber) {
        this.secondLeaderLicenceNumber = secondLeaderLicenceNumber;
    }

    public String getSecondLeaderBirthDate() {
        return secondLeaderBirthDate;
    }

    public void setSecondLeaderBirthDate(String secondLeaderBirthDate) {
        this.secondLeaderBirthDate = secondLeaderBirthDate;
    }

    public String getSecondLeaderSharePart() {
        return secondLeaderSharePart;
    }

    public void setSecondLeaderSharePart(String secondLeaderSharePart) {
        this.secondLeaderSharePart = secondLeaderSharePart;
    }

    public String getSecondLeaderTitle() {
        return secondLeaderTitle;
    }

    public void setSecondLeaderTitle(String secondLeaderTitle) {
        this.secondLeaderTitle = secondLeaderTitle;
    }

    public String getHadResiliation() {
        return hadResiliation;
    }

    public void setHadResiliation(String hadResiliation) {
        this.hadResiliation = hadResiliation;
    }

    public String getResiliationReason() {
        return resiliationReason;
    }

    public void setResiliationReason(String resiliationReason) {
        this.resiliationReason = resiliationReason;
    }

    public String getHadBankrupted() {
        return hadBankrupted;
    }

    public void setHadBankrupted(String hadBankrupted) {
        this.hadBankrupted = hadBankrupted;
    }

    public String getBankruptedReason() {
        return bankruptedReason;
    }

    public void setBankruptedReason(String bankruptedReason) {
        this.bankruptedReason = bankruptedReason;
    }

    public String getBeenInVisaRisk() {
        return beenInVisaRisk;
    }

    public void setBeenInVisaRisk(String beenInVisaRisk) {
        this.beenInVisaRisk = beenInVisaRisk;
    }

    public String getVisaRiskReason() {
        return visaRiskReason;
    }

    public void setVisaRiskReason(String visaRiskReason) {
        this.visaRiskReason = visaRiskReason;
    }

    public String getVisaRiskDate() {
        return visaRiskDate;
    }

    public void setVisaRiskDate(String visaRiskDate) {
        this.visaRiskDate = visaRiskDate;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
    }

    public String getBankPostalCode() {
        return bankPostalCode;
    }

    public void setBankPostalCode(String bankPostalCode) {
        this.bankPostalCode = bankPostalCode;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public String getBankPhone2() {
        return bankPhone2;
    }

    public void setBankPhone2(String bankPhone2) {
        this.bankPhone2 = bankPhone2;
    }

    public String getBankEmail() {
        return bankEmail;
    }

    public void setBankEmail(String bankEmail) {
        this.bankEmail = bankEmail;
    }

    public String getSpecimenFile() {
        return specimenFile;
    }

    public void setSpecimenFile(String specimenFile) {
        this.specimenFile = specimenFile;
    }

    public String getAccountTypeOption() {
        return accountTypeOption;
    }

    public void setAccountTypeOption(String accountTypeOption) {
        this.accountTypeOption = accountTypeOption;
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBeenCompromised() {
        return beenCompromised;
    }

    public void setBeenCompromised(String beenCompromised) {
        this.beenCompromised = beenCompromised;
    }

    public String getPciConformityLevel() {
        return pciConformityLevel;
    }

    public void setPciConformityLevel(String pciConformityLevel) {
        this.pciConformityLevel = pciConformityLevel;
    }

    public String getBeenCompromisedYear() {
        return beenCompromisedYear;
    }

    public void setBeenCompromisedYear(String beenCompromisedYear) {
        this.beenCompromisedYear = beenCompromisedYear;
    }

    public String getUseThirdPartyApplication() {
        return useThirdPartyApplication;
    }

    public void setUseThirdPartyApplication(String useThirdPartyApplication) {
        this.useThirdPartyApplication = useThirdPartyApplication;
    }

    public String getThirdPartyApplications() {
        return thirdPartyApplications;
    }

    public void setThirdPartyApplications(String thirdPartyApplications) {
        this.thirdPartyApplications = thirdPartyApplications;
    }

    public String getManualCollectionModeCardRatio() {
        return manualCollectionModeCardRatio;
    }

    public void setManualCollectionModeCardRatio(String manualCollectionModeCardRatio) {
        this.manualCollectionModeCardRatio = manualCollectionModeCardRatio;
    }

    public String getManualCollectionModeInternetRatio() {
        return manualCollectionModeInternetRatio;
    }

    public void setManualCollectionModeInternetRatio(String manualCollectionModeInternetRatio) {
        this.manualCollectionModeInternetRatio = manualCollectionModeInternetRatio;
    }

    public String getManualCollectionModePostalPhoneRatio() {
        return manualCollectionModePostalPhoneRatio;
    }

    public void setManualCollectionModePostalPhoneRatio(String manualCollectionModePostalPhoneRatio) {
        this.manualCollectionModePostalPhoneRatio = manualCollectionModePostalPhoneRatio;
    }

    public String getVolumeCard() {
        return volumeCard;
    }

    public void setVolumeCard(String volumeCard) {
        this.volumeCard = volumeCard;
    }

    public String getVolumeAverageTransaction() {
        return volumeAverageTransaction;
    }

    public void setVolumeAverageTransaction(String volumeAverageTransaction) {
        this.volumeAverageTransaction = volumeAverageTransaction;
    }

    public String getHighestTransaction() {
        return highestTransaction;
    }

    public void setHighestTransaction(String highestTransaction) {
        this.highestTransaction = highestTransaction;
    }

    public String getAlreadyAcceptCard() {
        return alreadyAcceptCard;
    }

    public void setAlreadyAcceptCard(String alreadyAcceptCard) {
        this.alreadyAcceptCard = alreadyAcceptCard;
    }

    public String getKeepAccount() {
        return keepAccount;
    }

    public void setKeepAccount(String keepAccount) {
        this.keepAccount = keepAccount;
    }

    public String getHasRecuringBilling() {
        return hasRecuringBilling;
    }

    public void setHasRecuringBilling(String hasRecuringBilling) {
        this.hasRecuringBilling = hasRecuringBilling;
    }

    public String getReasonToChange() {
        return reasonToChange;
    }

    public void setReasonToChange(String reasonToChange) {
        this.reasonToChange = reasonToChange;
    }

    public String getServicesAndProductsDescription() {
        return servicesAndProductsDescription;
    }

    public void setServicesAndProductsDescription(String servicesAndProductsDescription) {
        this.servicesAndProductsDescription = servicesAndProductsDescription;
    }

    public String getWantWithdrawDepositService() {
        return wantWithdrawDepositService;
    }

    public void setWantWithdrawDepositService(String wantWithdrawDepositService) {
        this.wantWithdrawDepositService = wantWithdrawDepositService;
    }

    public String getNumberOfTransactionPerMonthWithdraw() {
        return numberOfTransactionPerMonthWithdraw;
    }

    public void setNumberOfTransactionPerMonthWithdraw(String numberOfTransactionPerMonthWithdraw) {
        this.numberOfTransactionPerMonthWithdraw = numberOfTransactionPerMonthWithdraw;
    }

    public String getNumberOfTransactionPerMonthDeposit() {
        return numberOfTransactionPerMonthDeposit;
    }

    public void setNumberOfTransactionPerMonthDeposit(String numberOfTransactionPerMonthDeposit) {
        this.numberOfTransactionPerMonthDeposit = numberOfTransactionPerMonthDeposit;
    }

    public String getNumberOfTransactionPerMonthNsf() {
        return numberOfTransactionPerMonthNsf;
    }

    public void setNumberOfTransactionPerMonthNsf(String numberOfTransactionPerMonthNsf) {
        this.numberOfTransactionPerMonthNsf = numberOfTransactionPerMonthNsf;
    }

    public String getDesiredLimitPerMonthWithdraw() {
        return desiredLimitPerMonthWithdraw;
    }

    public void setDesiredLimitPerMonthWithdraw(String desiredLimitPerMonthWithdraw) {
        this.desiredLimitPerMonthWithdraw = desiredLimitPerMonthWithdraw;
    }

    public String getDesiredLimitPerMonthDeposit() {
        return desiredLimitPerMonthDeposit;
    }

    public void setDesiredLimitPerMonthDeposit(String desiredLimitPerMonthDeposit) {
        this.desiredLimitPerMonthDeposit = desiredLimitPerMonthDeposit;
    }

    public String getDesiredLimitPerMonthNsf() {
        return desiredLimitPerMonthNsf;
    }

    public void setDesiredLimitPerMonthNsf(String desiredLimitPerMonthNsf) {
        this.desiredLimitPerMonthNsf = desiredLimitPerMonthNsf;
    }

    public String getDesireDoubleAuthenticationWithdraw() {
        return desireDoubleAuthenticationWithdraw;
    }

    public void setDesireDoubleAuthenticationWithdraw(String desireDoubleAuthenticationWithdraw) {
        this.desireDoubleAuthenticationWithdraw = desireDoubleAuthenticationWithdraw;
    }

    public String getDesireDoubleAuthenticationDeposit() {
        return desireDoubleAuthenticationDeposit;
    }

    public void setDesireDoubleAuthenticationDeposit(String desireDoubleAuthenticationDeposit) {
        this.desireDoubleAuthenticationDeposit = desireDoubleAuthenticationDeposit;
    }

    public String getDesireDoubleAuthenticationNsf() {
        return desireDoubleAuthenticationNsf;
    }

    public void setDesireDoubleAuthenticationNsf(String desireDoubleAuthenticationNsf) {
        this.desireDoubleAuthenticationNsf = desireDoubleAuthenticationNsf;
    }

    public String getWantCreditCardService() {
        return wantCreditCardService;
    }

    public void setWantCreditCardService(String wantCreditCardService) {
        this.wantCreditCardService = wantCreditCardService;
    }

    public String getCreditCardVolumneMastercard() {
        return creditCardVolumneMastercard;
    }

    public void setCreditCardVolumneMastercard(String creditCardVolumneMastercard) {
        this.creditCardVolumneMastercard = creditCardVolumneMastercard;
    }

    public String getCreditCardVolumneMastercardVisa() {
        return creditCardVolumneMastercardVisa;
    }

    public void setCreditCardVolumneMastercardVisa(String creditCardVolumneMastercardVisa) {
        this.creditCardVolumneMastercardVisa = creditCardVolumneMastercardVisa;
    }

    public String getCreditCardVolumneVisaDebit() {
        return creditCardVolumneVisaDebit;
    }

    public void setCreditCardVolumneVisaDebit(String creditCardVolumneVisaDebit) {
        this.creditCardVolumneVisaDebit = creditCardVolumneVisaDebit;
    }

    public String getAcceptVisaDebit() {
        return acceptVisaDebit;
    }

    public void setAcceptVisaDebit(String acceptVisaDebit) {
        this.acceptVisaDebit = acceptVisaDebit;
    }

    public String getAcceptOnlinePayment() {
        return acceptOnlinePayment;
    }

    public void setAcceptOnlinePayment(String acceptOnlinePayment) {
        this.acceptOnlinePayment = acceptOnlinePayment;
    }

    public String getAcceptTermeCheck() {
        return acceptTermeCheck;
    }

    public void setAcceptTermeCheck(String acceptTermeCheck) {
        this.acceptTermeCheck = acceptTermeCheck;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TibAccountOpenForm that = (TibAccountOpenForm) o;
        return Objects.equals(enterpriseName, that.enterpriseName) && Objects.equals(enterpriseAddress, that.enterpriseAddress) && Objects.equals(enterpriseCity, that.enterpriseCity) && Objects.equals(enterpriseProvince, that.enterpriseProvince) && Objects.equals(enterprisePostalCode, that.enterprisePostalCode) && Objects.equals(enterprisePhone, that.enterprisePhone) && Objects.equals(enterprisePhone2, that.enterprisePhone2) && Objects.equals(enterpriseEmail, that.enterpriseEmail) && Objects.equals(enterpriseAccountResponsible, that.enterpriseAccountResponsible) && Objects.equals(enterpriseType, that.enterpriseType) && Objects.equals(enterpriseEstablishedSince, that.enterpriseEstablishedSince) && Objects.equals(enterpriseTaxeNumber, that.enterpriseTaxeNumber) && Objects.equals(enterpriseNeq, that.enterpriseNeq) && Objects.equals(enterpriseNameAppear, that.enterpriseNameAppear) && Objects.equals(billingName, that.billingName) && Objects.equals(billingAddress, that.billingAddress) && Objects.equals(billingCity, that.billingCity) && Objects.equals(billingProvince, that.billingProvince) && Objects.equals(billingPostalCode, that.billingPostalCode) && Objects.equals(billingPhone, that.billingPhone) && Objects.equals(billingPhone2, that.billingPhone2) && Objects.equals(billingEmail, that.billingEmail) && Objects.equals(businessTypeChoice, that.businessTypeChoice) && Objects.equals(firstLeaderName, that.firstLeaderName) && Objects.equals(firstLeaderInitiales, that.firstLeaderInitiales) && Objects.equals(firstLeaderNas, that.firstLeaderNas) && Objects.equals(firstLeaderPhone, that.firstLeaderPhone) && Objects.equals(firstLeaderCellPhone, that.firstLeaderCellPhone) && Objects.equals(firstLeaderAddress, that.firstLeaderAddress) && Objects.equals(firstLeaderProvince, that.firstLeaderProvince) && Objects.equals(firstLeaderPostalCode, that.firstLeaderPostalCode) && Objects.equals(firstLeaderLicenceNumber, that.firstLeaderLicenceNumber) && Objects.equals(firstLeaderBirthDate, that.firstLeaderBirthDate) && Objects.equals(firstLeaderSharePart, that.firstLeaderSharePart) && Objects.equals(firstLeaderTitle, that.firstLeaderTitle) && Objects.equals(secondLeaderName, that.secondLeaderName) && Objects.equals(secondLeaderInitiales, that.secondLeaderInitiales) && Objects.equals(secondLeaderNas, that.secondLeaderNas) && Objects.equals(secondLeaderPhone, that.secondLeaderPhone) && Objects.equals(secondLeaderCellPhone, that.secondLeaderCellPhone) && Objects.equals(secondLeaderAddress, that.secondLeaderAddress) && Objects.equals(secondLeaderProvince, that.secondLeaderProvince) && Objects.equals(secondLeaderPostalCode, that.secondLeaderPostalCode) && Objects.equals(secondLeaderLicenceNumber, that.secondLeaderLicenceNumber) && Objects.equals(secondLeaderBirthDate, that.secondLeaderBirthDate) && Objects.equals(secondLeaderSharePart, that.secondLeaderSharePart) && Objects.equals(secondLeaderTitle, that.secondLeaderTitle) && Objects.equals(hadResiliation, that.hadResiliation) && Objects.equals(resiliationReason, that.resiliationReason) && Objects.equals(hadBankrupted, that.hadBankrupted) && Objects.equals(bankruptedReason, that.bankruptedReason) && Objects.equals(beenInVisaRisk, that.beenInVisaRisk) && Objects.equals(visaRiskReason, that.visaRiskReason) && Objects.equals(visaRiskDate, that.visaRiskDate) && Objects.equals(bankName, that.bankName) && Objects.equals(bankAddress, that.bankAddress) && Objects.equals(bankCity, that.bankCity) && Objects.equals(bankProvince, that.bankProvince) && Objects.equals(bankPostalCode, that.bankPostalCode) && Objects.equals(bankPhone, that.bankPhone) && Objects.equals(bankPhone2, that.bankPhone2) && Objects.equals(bankEmail, that.bankEmail) && Objects.equals(specimenFile, that.specimenFile) && Objects.equals(accountTypeOption, that.accountTypeOption) && Objects.equals(bankNumber, that.bankNumber) && Objects.equals(transitNumber, that.transitNumber) && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(beenCompromised, that.beenCompromised) && Objects.equals(pciConformityLevel, that.pciConformityLevel) && Objects.equals(beenCompromisedYear, that.beenCompromisedYear) && Objects.equals(useThirdPartyApplication, that.useThirdPartyApplication) && Objects.equals(thirdPartyApplications, that.thirdPartyApplications) && Objects.equals(manualCollectionModeCardRatio, that.manualCollectionModeCardRatio) && Objects.equals(manualCollectionModeInternetRatio, that.manualCollectionModeInternetRatio) && Objects.equals(manualCollectionModePostalPhoneRatio, that.manualCollectionModePostalPhoneRatio) && Objects.equals(volumeCard, that.volumeCard) && Objects.equals(volumeAverageTransaction, that.volumeAverageTransaction) && Objects.equals(highestTransaction, that.highestTransaction) && Objects.equals(alreadyAcceptCard, that.alreadyAcceptCard) && Objects.equals(keepAccount, that.keepAccount) && Objects.equals(hasRecuringBilling, that.hasRecuringBilling) && Objects.equals(reasonToChange, that.reasonToChange) && Objects.equals(servicesAndProductsDescription, that.servicesAndProductsDescription) && Objects.equals(wantWithdrawDepositService, that.wantWithdrawDepositService) && Objects.equals(numberOfTransactionPerMonthWithdraw, that.numberOfTransactionPerMonthWithdraw) && Objects.equals(numberOfTransactionPerMonthDeposit, that.numberOfTransactionPerMonthDeposit) && Objects.equals(numberOfTransactionPerMonthNsf, that.numberOfTransactionPerMonthNsf) && Objects.equals(desiredLimitPerMonthWithdraw, that.desiredLimitPerMonthWithdraw) && Objects.equals(desiredLimitPerMonthDeposit, that.desiredLimitPerMonthDeposit) && Objects.equals(desiredLimitPerMonthNsf, that.desiredLimitPerMonthNsf) && Objects.equals(desireDoubleAuthenticationWithdraw, that.desireDoubleAuthenticationWithdraw) && Objects.equals(desireDoubleAuthenticationDeposit, that.desireDoubleAuthenticationDeposit) && Objects.equals(desireDoubleAuthenticationNsf, that.desireDoubleAuthenticationNsf) && Objects.equals(wantCreditCardService, that.wantCreditCardService) && Objects.equals(creditCardVolumneMastercard, that.creditCardVolumneMastercard) && Objects.equals(creditCardVolumneMastercardVisa, that.creditCardVolumneMastercardVisa) && Objects.equals(creditCardVolumneVisaDebit, that.creditCardVolumneVisaDebit) && Objects.equals(acceptVisaDebit, that.acceptVisaDebit) && Objects.equals(acceptOnlinePayment, that.acceptOnlinePayment) && Objects.equals(acceptTermeCheck, that.acceptTermeCheck) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(enterpriseName, enterpriseAddress, enterpriseCity, enterpriseProvince, enterprisePostalCode, enterprisePhone, enterprisePhone2, enterpriseEmail, enterpriseAccountResponsible, enterpriseType, enterpriseEstablishedSince, enterpriseTaxeNumber, enterpriseNeq, enterpriseNameAppear, billingName, billingAddress, billingCity, billingProvince, billingPostalCode, billingPhone, billingPhone2, billingEmail, businessTypeChoice, firstLeaderName, firstLeaderInitiales, firstLeaderNas, firstLeaderPhone, firstLeaderCellPhone, firstLeaderAddress, firstLeaderProvince, firstLeaderPostalCode, firstLeaderLicenceNumber, firstLeaderBirthDate, firstLeaderSharePart, firstLeaderTitle, secondLeaderName, secondLeaderInitiales, secondLeaderNas, secondLeaderPhone, secondLeaderCellPhone, secondLeaderAddress, secondLeaderProvince, secondLeaderPostalCode, secondLeaderLicenceNumber, secondLeaderBirthDate, secondLeaderSharePart, secondLeaderTitle, hadResiliation, resiliationReason, hadBankrupted, bankruptedReason, beenInVisaRisk, visaRiskReason, visaRiskDate, bankName, bankAddress, bankCity, bankProvince, bankPostalCode, bankPhone, bankPhone2, bankEmail, specimenFile, accountTypeOption, bankNumber, transitNumber, accountNumber, beenCompromised, pciConformityLevel, beenCompromisedYear, useThirdPartyApplication, thirdPartyApplications, manualCollectionModeCardRatio, manualCollectionModeInternetRatio, manualCollectionModePostalPhoneRatio, volumeCard, volumeAverageTransaction, highestTransaction, alreadyAcceptCard, keepAccount, hasRecuringBilling, reasonToChange, servicesAndProductsDescription, wantWithdrawDepositService, numberOfTransactionPerMonthWithdraw, numberOfTransactionPerMonthDeposit, numberOfTransactionPerMonthNsf, desiredLimitPerMonthWithdraw, desiredLimitPerMonthDeposit, desiredLimitPerMonthNsf, desireDoubleAuthenticationWithdraw, desireDoubleAuthenticationDeposit, desireDoubleAuthenticationNsf, wantCreditCardService, creditCardVolumneMastercard, creditCardVolumneMastercardVisa, creditCardVolumneVisaDebit, acceptVisaDebit, acceptOnlinePayment, acceptTermeCheck);
    }

    @Override
    public String toString() {
        return "TibAccountOpenForm{" +
                 "enterpriseName='" + enterpriseName + '\'' +
 ", enterpriseAddress='" + enterpriseAddress + '\'' +
 ", enterpriseCity='" + enterpriseCity + '\'' +
 ", enterpriseProvince='" + enterpriseProvince + '\'' +
 ", enterprisePostalCode='" + enterprisePostalCode + '\'' +
 ", enterprisePhone='" + enterprisePhone + '\'' +
 ", enterprisePhone2='" + enterprisePhone2 + '\'' +
 ", enterpriseEmail='" + enterpriseEmail + '\'' +
 ", enterpriseAccountResponsible='" + enterpriseAccountResponsible + '\'' +
 ", enterpriseType='" + enterpriseType + '\'' +
 ", enterpriseEstablishedSince='" + enterpriseEstablishedSince + '\'' +
 ", enterpriseTaxeNumber='" + enterpriseTaxeNumber + '\'' +
 ", enterpriseNeq='" + enterpriseNeq + '\'' +
 ", enterpriseNameAppear='" + enterpriseNameAppear + '\'' +
 ", billingName='" + billingName + '\'' +
 ", billingAddress='" + billingAddress + '\'' +
 ", billingCity='" + billingCity + '\'' +
 ", billingProvince='" + billingProvince + '\'' +
 ", billingPostalCode='" + billingPostalCode + '\'' +
 ", billingPhone='" + billingPhone + '\'' +
 ", billingPhone2='" + billingPhone2 + '\'' +
 ", billingEmail='" + billingEmail + '\'' +
 ", businessTypeChoice='" + businessTypeChoice + '\'' +
 ", firstLeaderName='" + firstLeaderName + '\'' +
 ", firstLeaderInitiales='" + firstLeaderInitiales + '\'' +
 ", firstLeaderNas='" + firstLeaderNas + '\'' +
 ", firstLeaderPhone='" + firstLeaderPhone + '\'' +
 ", firstLeaderCellPhone='" + firstLeaderCellPhone + '\'' +
 ", firstLeaderAddress='" + firstLeaderAddress + '\'' +
 ", firstLeaderProvince='" + firstLeaderProvince + '\'' +
 ", firstLeaderPostalCode='" + firstLeaderPostalCode + '\'' +
 ", firstLeaderLicenceNumber='" + firstLeaderLicenceNumber + '\'' +
 ", firstLeaderBirthDate='" + firstLeaderBirthDate + '\'' +
 ", firstLeaderSharePart='" + firstLeaderSharePart + '\'' +
 ", firstLeaderTitle='" + firstLeaderTitle + '\'' +
 ", secondLeaderName='" + secondLeaderName + '\'' +
 ", secondLeaderInitiales='" + secondLeaderInitiales + '\'' +
 ", secondLeaderNas='" + secondLeaderNas + '\'' +
 ", secondLeaderPhone='" + secondLeaderPhone + '\'' +
 ", secondLeaderCellPhone='" + secondLeaderCellPhone + '\'' +
 ", secondLeaderAddress='" + secondLeaderAddress + '\'' +
 ", secondLeaderProvince='" + secondLeaderProvince + '\'' +
 ", secondLeaderPostalCode='" + secondLeaderPostalCode + '\'' +
 ", secondLeaderLicenceNumber='" + secondLeaderLicenceNumber + '\'' +
 ", secondLeaderBirthDate='" + secondLeaderBirthDate + '\'' +
 ", secondLeaderSharePart='" + secondLeaderSharePart + '\'' +
 ", secondLeaderTitle='" + secondLeaderTitle + '\'' +
 ", hadResiliation='" + hadResiliation + '\'' +
 ", resiliationReason='" + resiliationReason + '\'' +
 ", hadBankrupted='" + hadBankrupted + '\'' +
 ", bankruptedReason='" + bankruptedReason + '\'' +
 ", beenInVisaRisk='" + beenInVisaRisk + '\'' +
 ", visaRiskReason='" + visaRiskReason + '\'' +
 ", visaRiskDate='" + visaRiskDate + '\'' +
 ", bankName='" + bankName + '\'' +
 ", bankAddress='" + bankAddress + '\'' +
 ", bankCity='" + bankCity + '\'' +
 ", bankProvince='" + bankProvince + '\'' +
 ", bankPostalCode='" + bankPostalCode + '\'' +
 ", bankPhone='" + bankPhone + '\'' +
 ", bankPhone2='" + bankPhone2 + '\'' +
 ", bankEmail='" + bankEmail + '\'' +
 ", specimenFile='" + specimenFile + '\'' +
 ", accountTypeOption='" + accountTypeOption + '\'' +
 ", bankNumber='" + bankNumber + '\'' +
 ", transitNumber='" + transitNumber + '\'' +
 ", accountNumber='" + accountNumber + '\'' +
 ", beenCompromised='" + beenCompromised + '\'' +
 ", pciConformityLevel='" + pciConformityLevel + '\'' +
 ", beenCompromisedYear='" + beenCompromisedYear + '\'' +
 ", useThirdPartyApplication='" + useThirdPartyApplication + '\'' +
 ", thirdPartyApplications='" + thirdPartyApplications + '\'' +
 ", manualCollectionModeCardRatio='" + manualCollectionModeCardRatio + '\'' +
 ", manualCollectionModeInternetRatio='" + manualCollectionModeInternetRatio + '\'' +
 ", manualCollectionModePostalPhoneRatio='" + manualCollectionModePostalPhoneRatio + '\'' +
 ", volumeCard='" + volumeCard + '\'' +
 ", volumeAverageTransaction='" + volumeAverageTransaction + '\'' +
 ", highestTransaction='" + highestTransaction + '\'' +
 ", alreadyAcceptCard='" + alreadyAcceptCard + '\'' +
 ", keepAccount='" + keepAccount + '\'' +
 ", hasRecuringBilling='" + hasRecuringBilling + '\'' +
 ", reasonToChange='" + reasonToChange + '\'' +
 ", servicesAndProductsDescription='" + servicesAndProductsDescription + '\'' +
 ", wantWithdrawDepositService='" + wantWithdrawDepositService + '\'' +
 ", numberOfTransactionPerMonthWithdraw='" + numberOfTransactionPerMonthWithdraw + '\'' +
 ", numberOfTransactionPerMonthDeposit='" + numberOfTransactionPerMonthDeposit + '\'' +
 ", numberOfTransactionPerMonthNsf='" + numberOfTransactionPerMonthNsf + '\'' +
 ", desiredLimitPerMonthWithdraw='" + desiredLimitPerMonthWithdraw + '\'' +
 ", desiredLimitPerMonthDeposit='" + desiredLimitPerMonthDeposit + '\'' +
 ", desiredLimitPerMonthNsf='" + desiredLimitPerMonthNsf + '\'' +
 ", desireDoubleAuthenticationWithdraw='" + desireDoubleAuthenticationWithdraw + '\'' +
 ", desireDoubleAuthenticationDeposit='" + desireDoubleAuthenticationDeposit + '\'' +
 ", desireDoubleAuthenticationNsf='" + desireDoubleAuthenticationNsf + '\'' +
 ", wantCreditCardService='" + wantCreditCardService + '\'' +
 ", creditCardVolumneMastercard='" + creditCardVolumneMastercard + '\'' +
 ", creditCardVolumneMastercardVisa='" + creditCardVolumneMastercardVisa + '\'' +
 ", creditCardVolumneVisaDebit='" + creditCardVolumneVisaDebit + '\'' +
 ", acceptVisaDebit='" + acceptVisaDebit + '\'' +
 ", acceptOnlinePayment='" + acceptOnlinePayment + '\'' +
 ", acceptTermeCheck='" + acceptTermeCheck + '\'' +

                '}';
    }
}