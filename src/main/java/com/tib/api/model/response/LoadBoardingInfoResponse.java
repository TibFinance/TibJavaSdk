
package com.tib.api.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tib.api.model.Error;
import com.tib.api.model.enums.BoardingStep;
import com.tib.api.model.enums.CompanyType;
import com.tib.api.model.response.CustomAPIResponse;


import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;


public class LoadBoardingInfoResponse<T> extends CustomAPIResponse {

    
    @JsonProperty("Step")
    private BoardingStep step;

    @JsonProperty("CompanyName")
    private String companyName;

    @JsonProperty("CompanyAddress")
    private String companyAddress;

    @JsonProperty("AdminFirstName")
    private String adminFirstName;

    @JsonProperty("AdminLastName")
    private String adminLastName;

    @JsonProperty("AdminAddress")
    private String adminAddress;

    @JsonProperty("CompanyType")
    private CompanyType companyType;

    @JsonProperty("DidOwnersAlreadyBeenSubjectOfResiliationOfPaymentService")
    private boolean didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService;

    @JsonProperty("DidOwnersAlreadyAskedForBankrupcy")
    private boolean didOwnersAlreadyAskedForBankrupcy;

    @JsonProperty("HaveYouBeenSubjectOfVisaRiskProgram")
    private boolean haveYouBeenSubjectOfVisaRiskProgram;

    @JsonProperty("DrivingLicenceNumber")
    private String drivingLicenceNumber;


    public LoadBoardingInfoResponse(Error[] errors, boolean hasError, String messages, BoardingStep step, String companyName, String companyAddress, String adminFirstName, String adminLastName, String adminAddress, CompanyType companyType, boolean didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, boolean didOwnersAlreadyAskedForBankrupcy, boolean haveYouBeenSubjectOfVisaRiskProgram, String drivingLicenceNumber) {
        super(errors, hasError, messages);
        this.step = step;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.adminFirstName = adminFirstName;
        this.adminLastName = adminLastName;
        this.adminAddress = adminAddress;
        this.companyType = companyType;
        this.didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService = didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService;
        this.didOwnersAlreadyAskedForBankrupcy = didOwnersAlreadyAskedForBankrupcy;
        this.haveYouBeenSubjectOfVisaRiskProgram = haveYouBeenSubjectOfVisaRiskProgram;
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    public LoadBoardingInfoResponse(APIResponse apiResponse, ObjectMapper objectMapper) throws JsonProcessingException {
        super(apiResponse);
        if (!apiResponse.isHasError()) {
            String json = objectMapper.writeValueAsString(apiResponse.getResponse());
            this.step = objectMapper.readValue(json, BoardingStep.class);
            this.companyType = objectMapper.readValue(json, CompanyType.class);
        }
    }

    
    public BoardingStep getStep() {
        return step;
    }

    public void setStep(BoardingStep step) {
        this.step = step;
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

    public CompanyType getCompanyType() {
        return companyType;
    }

    public void setCompanyType(CompanyType companyType) {
        this.companyType = companyType;
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

    public String getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }

    public void setDrivingLicenceNumber(String drivingLicenceNumber) {
        this.drivingLicenceNumber = drivingLicenceNumber;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoadBoardingInfoResponse that = (LoadBoardingInfoResponse) o;
        return Objects.equals(step, that.step) && Objects.equals(companyName, that.companyName) && Objects.equals(companyAddress, that.companyAddress) && Objects.equals(adminFirstName, that.adminFirstName) && Objects.equals(adminLastName, that.adminLastName) && Objects.equals(adminAddress, that.adminAddress) && Objects.equals(companyType, that.companyType) && Objects.equals(didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, that.didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService) && Objects.equals(didOwnersAlreadyAskedForBankrupcy, that.didOwnersAlreadyAskedForBankrupcy) && Objects.equals(haveYouBeenSubjectOfVisaRiskProgram, that.haveYouBeenSubjectOfVisaRiskProgram) && Objects.equals(drivingLicenceNumber, that.drivingLicenceNumber) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(step, companyName, companyAddress, adminFirstName, adminLastName, adminAddress, companyType, didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService, didOwnersAlreadyAskedForBankrupcy, haveYouBeenSubjectOfVisaRiskProgram, drivingLicenceNumber);
    }

    @Override
    public String toString() {
        return "LoadBoardingInfoResponse{" +
                "step='" + step + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", adminFirstName='" + adminFirstName + '\'' +
                ", adminLastName='" + adminLastName + '\'' +
                ", adminAddress='" + adminAddress + '\'' +
                ", companyType='" + companyType + '\'' +
                ", didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService='" + didOwnersAlreadyBeenSubjectOfResiliationOfPaymentService + '\'' +
                ", didOwnersAlreadyAskedForBankrupcy='" + didOwnersAlreadyAskedForBankrupcy + '\'' +
                ", haveYouBeenSubjectOfVisaRiskProgram='" + haveYouBeenSubjectOfVisaRiskProgram + '\'' +
                ", drivingLicenceNumber='" + drivingLicenceNumber + '\'' +

                '}';
    }
}