
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


public class CsvFileValidator   {

    
    /**
 * 
 */
    @JsonProperty("IsValid")
    private boolean isValid;

    /**
 * The Errors property provides a collection of error objects that encapsulate details about any issues encountered during the execution of a service.
 */
    @JsonProperty("Errors")
    private List<String> errors;

    /**
 * 
 */
    @JsonProperty("OrganizationNumber")
    private String organizationNumber;

    /**
 * 
 */
    @JsonProperty("FileNumber")
    private String fileNumber;

    /**
 * Specifies the operation category used throughout the API.
 */
    @JsonProperty("OperationType")
    private String operationType;

    /**
 * Retrieves or assigns the monetary amount involved in the transaction.
 */
    @JsonProperty("Amount")
    private String amount;

    /**
 * 
 */
    @JsonProperty("DateFundsAvailable")
    private String dateFundsAvailable;

    /**
 * 
 */
    @JsonProperty("TargetName")
    private String targetName;

    /**
 * 
 */
    @JsonProperty("TargetInstitutionNumber")
    private String targetInstitutionNumber;

    /**
 * 
 */
    @JsonProperty("TargetFullAccountNumber")
    private String targetFullAccountNumber;

    /**
 * 
 */
    @JsonProperty("RefNumber")
    private String refNumber;

    /**
 * Specifies the email address associated with the merchant.
 */
    @JsonProperty("Email")
    private String email;

    /**
 * 
 */
    @JsonProperty("Phone")
    private String phone;

    /**
 * Gets or sets the address associated with the entity.
 */
    @JsonProperty("Address")
    private String address;

    /**
 * 
 */
    @JsonProperty("City")
    private String city;

    /**
 * 
 */
    @JsonProperty("Province")
    private String province;

    /**
 * 
 */
    @JsonProperty("Country")
    private String country;

    /**
 * 
 */
    @JsonProperty("ZipCode")
    private String zipCode;

    /**
 * Defines the default language for a customer. If not explicitly specified during customer creation, the language setting of the primary merchant is used as the default.
 */
    @JsonProperty("Language")
    private String language;


    
    public CsvFileValidator() {
    }

    
    public CsvFileValidator(boolean isValid, List<String> errors, String organizationNumber, String fileNumber, String operationType, String amount, String dateFundsAvailable, String targetName, String targetInstitutionNumber, String targetFullAccountNumber, String refNumber, String email, String phone, String address, String city, String province, String country, String zipCode, String language) {
        this.isValid = isValid;
this.errors = errors;
this.organizationNumber = organizationNumber;
this.fileNumber = fileNumber;
this.operationType = operationType;
this.amount = amount;
this.dateFundsAvailable = dateFundsAvailable;
this.targetName = targetName;
this.targetInstitutionNumber = targetInstitutionNumber;
this.targetFullAccountNumber = targetFullAccountNumber;
this.refNumber = refNumber;
this.email = email;
this.phone = phone;
this.address = address;
this.city = city;
this.province = province;
this.country = country;
this.zipCode = zipCode;
this.language = language;

    }
    
    

    
    public boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public String getOrganizationNumber() {
        return organizationNumber;
    }

    public void setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDateFundsAvailable() {
        return dateFundsAvailable;
    }

    public void setDateFundsAvailable(String dateFundsAvailable) {
        this.dateFundsAvailable = dateFundsAvailable;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getTargetInstitutionNumber() {
        return targetInstitutionNumber;
    }

    public void setTargetInstitutionNumber(String targetInstitutionNumber) {
        this.targetInstitutionNumber = targetInstitutionNumber;
    }

    public String getTargetFullAccountNumber() {
        return targetFullAccountNumber;
    }

    public void setTargetFullAccountNumber(String targetFullAccountNumber) {
        this.targetFullAccountNumber = targetFullAccountNumber;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }



    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CsvFileValidator that = (CsvFileValidator) o;
        return Objects.equals(isValid, that.isValid) && Objects.equals(errors, that.errors) && Objects.equals(organizationNumber, that.organizationNumber) && Objects.equals(fileNumber, that.fileNumber) && Objects.equals(operationType, that.operationType) && Objects.equals(amount, that.amount) && Objects.equals(dateFundsAvailable, that.dateFundsAvailable) && Objects.equals(targetName, that.targetName) && Objects.equals(targetInstitutionNumber, that.targetInstitutionNumber) && Objects.equals(targetFullAccountNumber, that.targetFullAccountNumber) && Objects.equals(refNumber, that.refNumber) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && Objects.equals(address, that.address) && Objects.equals(city, that.city) && Objects.equals(province, that.province) && Objects.equals(country, that.country) && Objects.equals(zipCode, that.zipCode) && Objects.equals(language, that.language) ;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(isValid, errors, organizationNumber, fileNumber, operationType, amount, dateFundsAvailable, targetName, targetInstitutionNumber, targetFullAccountNumber, refNumber, email, phone, address, city, province, country, zipCode, language);
    }

    @Override
    public String toString() {
        return "CsvFileValidator{" +
                 "isValid='" + isValid + '\'' +
 ", errors='" + errors + '\'' +
 ", organizationNumber='" + organizationNumber + '\'' +
 ", fileNumber='" + fileNumber + '\'' +
 ", operationType='" + operationType + '\'' +
 ", amount='" + amount + '\'' +
 ", dateFundsAvailable='" + dateFundsAvailable + '\'' +
 ", targetName='" + targetName + '\'' +
 ", targetInstitutionNumber='" + targetInstitutionNumber + '\'' +
 ", targetFullAccountNumber='" + targetFullAccountNumber + '\'' +
 ", refNumber='" + refNumber + '\'' +
 ", email='" + email + '\'' +
 ", phone='" + phone + '\'' +
 ", address='" + address + '\'' +
 ", city='" + city + '\'' +
 ", province='" + province + '\'' +
 ", country='" + country + '\'' +
 ", zipCode='" + zipCode + '\'' +
 ", language='" + language + '\'' +

                '}';
    }
}