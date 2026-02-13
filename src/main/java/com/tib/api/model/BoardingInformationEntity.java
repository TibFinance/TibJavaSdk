
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


public class BoardingInformationEntity   {

    
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
    @JsonProperty("CompanyPhone")
    private String companyPhone;

    /**
 * 
 */
    @JsonProperty("CompanyEmail")
    private String companyEmail;

    /**
 * 
 */
    @JsonProperty("CompanyType")
    private Integer companyType;

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
    private Integer companyType_Edited;

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
    @JsonProperty("BoardingStep")
    private Integer boardingStep;

    /**
 * 
 */
    @JsonProperty("TransitNumber")
    private String transitNumber;

    /**
 * Specifies the bank account number associated with the payment method.
 */
    @JsonProperty("AccountNumber")
    private String accountNumber;

    /**
 * 
 */
    @JsonProperty("AccountOwner")
    private String accountOwner;

    /**
 * Identifies the bank associated with the account using its numeric identifier.
 */
    @JsonProperty("BankNumber")
    private String bankNumber;


    
    public BoardingInformationEntity() {
    }

    
    public BoardingInformationEntity(String clientId, String companyName, String companyAddress, String companyPhone, String companyEmail, Integer companyType, String companyName_Edited, String companyAddress_Edited, Integer companyType_Edited, boolean didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, boolean didOwnersAlreadyAskedForBankrupcy, boolean haveYouBeenSubjectOfVisaRiskProgram, String specimenFile, String idFile, Integer boardingStep, String transitNumber, String accountNumber, String accountOwner, String bankNumber) {
        this.clientId = clientId;
this.companyName = companyName;
this.companyAddress = companyAddress;
this.companyPhone = companyPhone;
this.companyEmail = companyEmail;
this.companyType = companyType;
this.companyName_Edited = companyName_Edited;
this.companyAddress_Edited = companyAddress_Edited;
this.companyType_Edited = companyType_Edited;
this.didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService = didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService;
this.didOwnersAlreadyAskedForBankrupcy = didOwnersAlreadyAskedForBankrupcy;
this.haveYouBeenSubjectOfVisaRiskProgram = haveYouBeenSubjectOfVisaRiskProgram;
this.specimenFile = specimenFile;
this.idFile = idFile;
this.boardingStep = boardingStep;
this.transitNumber = transitNumber;
this.accountNumber = accountNumber;
this.accountOwner = accountOwner;
this.bankNumber = bankNumber;

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

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
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

    public Integer getCompanyType_Edited() {
        return companyType_Edited;
    }

    public void setCompanyType_Edited(Integer companyType_Edited) {
        this.companyType_Edited = companyType_Edited;
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

    public Integer getBoardingStep() {
        return boardingStep;
    }

    public void setBoardingStep(Integer boardingStep) {
        this.boardingStep = boardingStep;
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

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardingInformationEntity that = (BoardingInformationEntity) o;
        return Objects.equals(clientId, that.clientId) && Objects.equals(companyName, that.companyName) && Objects.equals(companyAddress, that.companyAddress) && Objects.equals(companyPhone, that.companyPhone) && Objects.equals(companyEmail, that.companyEmail) && Objects.equals(companyType, that.companyType) && Objects.equals(companyName_Edited, that.companyName_Edited) && Objects.equals(companyAddress_Edited, that.companyAddress_Edited) && Objects.equals(companyType_Edited, that.companyType_Edited) && Objects.equals(didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, that.didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService) && Objects.equals(didOwnersAlreadyAskedForBankrupcy, that.didOwnersAlreadyAskedForBankrupcy) && Objects.equals(haveYouBeenSubjectOfVisaRiskProgram, that.haveYouBeenSubjectOfVisaRiskProgram) && Objects.equals(specimenFile, that.specimenFile) && Objects.equals(idFile, that.idFile) && Objects.equals(boardingStep, that.boardingStep) && Objects.equals(transitNumber, that.transitNumber) && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(accountOwner, that.accountOwner) && Objects.equals(bankNumber, that.bankNumber) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(clientId, companyName, companyAddress, companyPhone, companyEmail, companyType, companyName_Edited, companyAddress_Edited, companyType_Edited, didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, didOwnersAlreadyAskedForBankrupcy, haveYouBeenSubjectOfVisaRiskProgram, specimenFile, idFile, boardingStep, transitNumber, accountNumber, accountOwner, bankNumber);
    }

    @Override
    public String toString() {
        return "BoardingInformationEntity{" +
                 "clientId='" + clientId + '\'' +
 ", companyName='" + companyName + '\'' +
 ", companyAddress='" + companyAddress + '\'' +
 ", companyPhone='" + companyPhone + '\'' +
 ", companyEmail='" + companyEmail + '\'' +
 ", companyType='" + companyType + '\'' +
 ", companyName_Edited='" + companyName_Edited + '\'' +
 ", companyAddress_Edited='" + companyAddress_Edited + '\'' +
 ", companyType_Edited='" + companyType_Edited + '\'' +
 ", didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService='" + didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService + '\'' +
 ", didOwnersAlreadyAskedForBankrupcy='" + didOwnersAlreadyAskedForBankrupcy + '\'' +
 ", haveYouBeenSubjectOfVisaRiskProgram='" + haveYouBeenSubjectOfVisaRiskProgram + '\'' +
 ", specimenFile='" + specimenFile + '\'' +
 ", idFile='" + idFile + '\'' +
 ", boardingStep='" + boardingStep + '\'' +
 ", transitNumber='" + transitNumber + '\'' +
 ", accountNumber='" + accountNumber + '\'' +
 ", accountOwner='" + accountOwner + '\'' +
 ", bankNumber='" + bankNumber + '\'' +

                '}';
    }
}